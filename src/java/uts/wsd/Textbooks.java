package uts.wsd;

import java.io.Serializable;
import java.util.ArrayList;
import javax.xml.bind.annotation.*;

/**
 *
 * @author HenryDinh
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement

public class Textbooks implements Serializable { //Textbooks with attributes that are the same as the ones in XML

    @XmlElement(name = "title")
    private String title;
    @XmlElement(name = "author")
    private String author;
    @XmlElement(name = "category")
    private String category;
    @XmlElement(name = "number")
    private String number;

    public Textbooks() {
    }

    public Textbooks(String title, String author, String category, String number) {
        this.title = title;
        this.author = author;
        this.category = category;
        this.number = number;
    }
//getMethods for each parameter

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getCategory() {
        return category;
    }

    public String getNumber() {
        return number;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setNumber(String number) {
        this.number = number;
    }

}
