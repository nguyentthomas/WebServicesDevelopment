package uts.wsd;

import java.util.*;
import java.io.Serializable;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "TextbooksLists", namespace = "http://www.uts.edu.au/31284/wsd-diary") //directs it to this namespace, which all the XML files use.

public class TextbooksLists implements Serializable {

    @XmlElement(name = "Textbooks")
    private ArrayList<Textbooks> list = new ArrayList<Textbooks>(); //generates an array of textbooks

    public TextbooksLists() { //uses gets and set methods
    }

    public ArrayList<Textbooks> getTextbooksLists() {
        return list;
    }

    public void addTextbooks(Textbooks textbooks) {
        list.add(textbooks);
    }

    public void removeTextbooks(Textbooks textbooks) {
        list.remove(textbooks);
    }

    public Textbooks getTextbooksByTitle(String title) { //fetches by Title
        for (Textbooks textbooks : list) {
            if (textbooks.getTitle().equals(title)) {
                return textbooks;
            }
        }
        return null;
    }

    public Textbooks getTextbooksByAuthor(String author) { //fetches by Author
        for (Textbooks textbooks : list) {
            if (textbooks.getAuthor().equals(author)) {
                return textbooks;
            }
        }
        return null;
    }

    public Textbooks getTextbooksByCategory(String category) { //fetches by category
        for (Textbooks textbooks : list) {
            if (textbooks.getNumber().equals(category)) {
                return textbooks;
            }
        }
        return null;
    }

    public Textbooks getTextbooksByNumber(String number) { //Fetches by number
        for (Textbooks textbooks : list) {
            if (textbooks.getNumber().equals(number)) {
                return textbooks;
            }
        }
        return null;
    }
}
