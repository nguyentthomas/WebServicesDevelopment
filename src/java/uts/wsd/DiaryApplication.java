package uts.wsd;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.io.*;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.*;
import javax.xml.bind.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement

public class DiaryApplication implements Serializable {

    private String filePath;
    private Listers listers;

    public DiaryApplication() {
    }

    public DiaryApplication(String filePath, Listers listers) {
        this.filePath = filePath;
        this.listers = listers;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) throws Exception {
        // Creates the unmarshaller
        JAXBContext jc = JAXBContext.newInstance(Listers.class);
        Unmarshaller u = jc.createUnmarshaller();
        this.filePath = filePath;
        // Unmarshalls the object from the file
        FileInputStream fin = new FileInputStream(filePath);
        listers = (Listers) u.unmarshal(fin);
        fin.close();
    }

    public void updateXML(Listers listers, String filePath) throws Exception {
        this.listers = listers;
        this.filePath = filePath;
        // Creates the marshaller
        JAXBContext jc = JAXBContext.newInstance(Listers.class);
        Marshaller m = jc.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        // Marshalls the object to the file
        FileOutputStream fout = new FileOutputStream(filePath);
        m.marshal(listers, fout);
        fout.close();
    }

    public void saveListers() throws JAXBException, IOException {
        // Creates the marshaller
        JAXBContext jc = JAXBContext.newInstance(Listers.class);
        Marshaller m = jc.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        // Marshalls the object to the file
        FileOutputStream fout = new FileOutputStream(filePath);
        m.marshal(listers, fout);
        fout.close();
    }

    public Listers getListers() {
        return listers;
    }

    public void setListers(Listers listers) {
        this.listers = listers;
    }

}
