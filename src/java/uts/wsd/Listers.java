package uts.wsd;
 
import java.util.*;
import java.io.Serializable;
import javax.xml.bind.annotation.*;
 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="listers", namespace = "http://www.uts.edu.au/31284/wsd-diary") //uses namespace and points to listers within that file

public class Listers implements Serializable {
    
    @XmlElement(name = "lister")
    private ArrayList<Lister> list = new ArrayList<Lister>(); //creates an array
 
    public Listers() {
        //TODO
    }
    //get and set methods, and login method, that matches parameterss from lister.java
    public ArrayList<Lister> getList() {
        return list;
    }
    public void addLister(Lister lister) { 
        list.add(lister);
    }
    public void removeLister(Lister lister) {
        list.remove(lister);
    }
    
    public Lister getLister(String userName) {
        for (Lister lister : list) {
            if (lister.getUserName().equals(userName)) {
                return lister;
            }
        }
        return null;
    }
    public Lister login(String userName, String password) {
        // For each user in the list...
        for (Lister lister : list) {
            if (lister.getUserName().equals(userName) && lister.getPassword().equals(password))
                return lister; // Login correct. Return this user.
        }
        return null; // Login incorrect. Return null.
    }
}



