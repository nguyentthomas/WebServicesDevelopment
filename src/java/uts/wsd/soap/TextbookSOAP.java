/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.wsd.soap;

import java.io.IOException;
import javax.annotation.Resource;
import javax.jws.*;
import javax.servlet.ServletContext;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;
import uts.wsd.*;

/**
 *
 * @author HenryDinh
 */
@WebService(serviceName = "TextbookSOAP")
public class TextbookSOAP {

    @Resource  //declares a resource
    private WebServiceContext context;
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    public BookApplication getBookApp() throws Exception {
        ServletContext application = (ServletContext) context.getMessageContext().get(MessageContext.SERVLET_CONTEXT);
        synchronized (application) {
            BookApplication bookApp = (BookApplication) application.getAttribute("bookApp");
            if (bookApp == null) {
                bookApp = new BookApplication();
                bookApp.setFilePath(application.getRealPath("TextbooksLists.xml"));
                application.setAttribute("bookApp", bookApp);
            }
            return bookApp;
        }
    }

    @WebMethod(operationName = "fetchTextbooks")    //retrieves ("fetch") listers
    public TextbooksLists fetchTextbooks() throws Exception {
        return getBookApp().getTextbooksLists();
    }

    @WebMethod   //retrieves ("fetch") a specific Lister within Listers with a specific title
    public Textbooks fetchTextbook(@WebParam(name = "title")String title) throws IOException, Exception {
        return getBookApp().getTextbooksLists().getTextbooksByTitle(title);
    }

    
    
}
