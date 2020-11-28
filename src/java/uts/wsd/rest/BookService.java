package uts.wsd.rest;

import javax.servlet.ServletContext;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import javax.xml.bind.JAXBException;
import java.io.*;
import uts.wsd.*;

@Path("/bookApp")
public class BookService extends Application {

    @Context
    private ServletContext application;

    private BookApplication getBookApp() throws JAXBException, IOException, Exception {
        // The web server can handle requests from different clients in parallel.
        // These are called "threads".
        //
        // We do NOT want other threads to manipulate the application object at the same
        // time that we are manipulating it, otherwise bad things could happen.
        //
        // The "synchronized" keyword is used to lock the application object while
        // we're manpulating it.
        synchronized (application) {
            BookApplication bookApp = (BookApplication) application.getAttribute("bookApp");
            if (bookApp == null) {
                bookApp = new BookApplication();
                bookApp.setFilePath(application.getRealPath("/TextbooksLists.xml"));
                application.setAttribute("bookApp", bookApp);
            }
            return bookApp;
        }
    }

    @Path("/TextbooksLists")
    @GET
    @Produces("application/xml")
    public TextbooksLists getTextbooksLists() throws JAXBException, IOException, Exception {
        return getBookApp().getTextbooksLists();
    }
    
    @Path("TextbooksLists/{title}")
    @GET
    @Produces("application/xml")
    public Textbooks getTextbooksByTitle(@PathParam("title")String title) throws JAXBException, IOException, Exception {
        return getBookApp().getTextbooksLists().getTextbooksByTitle(title);
    }
    
    @Path("/TextbooksLists")
    @POST
    @Consumes("application/xml")
    public void addTextbook(Textbooks textbooks) throws JAXBException, IOException, Exception {
        getBookApp().getTextbooksLists().addTextbooks(textbooks);
        getBookApp().saveTextbooksLists();
    }
    
}