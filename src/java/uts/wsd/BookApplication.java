/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.wsd;

import java.io.*;
import javax.xml.bind.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author thoma_000
 */
@XmlRootElement(name = "bookApp")
public class BookApplication implements Serializable {

    private String filePath;
    private TextbooksLists textbookslists;

    public BookApplication() {

    }

    public BookApplication(String filePath, TextbooksLists textbookslists) {
        super();
        this.filePath = filePath;
        this.textbookslists = textbookslists;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) throws Exception {
        this.filePath = filePath;
        // Creates the unmarshaller
        JAXBContext jc = JAXBContext.newInstance(TextbooksLists.class);
        Unmarshaller u = jc.createUnmarshaller();
        // Unmarshalls the object from the file
        FileInputStream fin = new FileInputStream(filePath);
        textbookslists = (TextbooksLists) u.unmarshal(fin);
        fin.close();
    }

    public void updateXML(TextbooksLists textbookslists, String filePath) throws Exception {
        this.textbookslists = textbookslists;
        this.filePath = filePath;
        // Creates the marshaller
        JAXBContext jc = JAXBContext.newInstance(TextbooksLists.class);
        Marshaller m = jc.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        // Marshalls the object to the file
        FileOutputStream fout = new FileOutputStream(filePath);
        m.marshal(textbookslists, fout);
        fout.close();
    }

    public void deleteXML(TextbooksLists textbookslists, String filePath) throws Exception {
        
   
    }
    
    
    public TextbooksLists getTextbooksLists() {
        return textbookslists;
    }

    public void setTextbooksLists(TextbooksLists textbookslists) {
        this.textbookslists = textbookslists;
    }

    public void saveTextbooksLists() throws JAXBException, IOException {
        // Creates the marshaller
        JAXBContext jc = JAXBContext.newInstance(TextbooksLists.class);
        Marshaller m = jc.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        // Marshalls the object to the file
        FileOutputStream fout = new FileOutputStream(filePath);
        m.marshal(textbookslists, fout);
        fout.close();
    }

}