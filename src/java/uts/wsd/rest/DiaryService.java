/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.wsd.rest;

import java.io.IOException;
import javax.servlet.ServletContext;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import javax.xml.bind.JAXBException;
import uts.wsd.DiaryApplication;
import uts.wsd.Lister;
import uts.wsd.Listers;

/**
 *
 * @author Tim
 */
@Path("/diaryApp")
public class DiaryService {

    @Context
    private ServletContext application;

    private DiaryApplication getDiaryApp() throws JAXBException, IOException, Exception { //calls application and generates it, directing it to the correct file path
        synchronized (application) {
            DiaryApplication diaryApp = (DiaryApplication) application.getAttribute("diaryApp");
            if (diaryApp == null) {
                diaryApp = new DiaryApplication();
                diaryApp.setFilePath(application.getRealPath("WEB-INF/Listers.xml"));
                application.setAttribute("diaryApp", diaryApp);
            }
            return diaryApp;
        }
    }

    @Path("hello") //default hello world generated
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello World";
    }

    @Path("listers") //XML xPath expression, points to listers in that document
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public Listers getListers() throws IOException, Exception { //getListers parent method
        return getDiaryApp().getListers();
    }

    @Path("listers/{username}") //directs to specific username
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public Lister getLister(@PathParam("username") String username) throws IOException, Exception, Exception {
        return getDiaryApp().getListers().getLister(username);
    }

}
