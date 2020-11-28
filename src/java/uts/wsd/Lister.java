/**
 * @author HenryDinh
 */
package uts.wsd;

import java.io.Serializable;
import javax.xml.bind.annotation.*;

/**
 *
 * @author HenryDinh
 */


@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="lister") //links with lister element from XML

public class Lister implements Serializable {
    @XmlElement(name="email")
    private String email;
    @XmlElement(name="userName")
    private String userName;
    @XmlElement(name="dob")
    private String dob;
    @XmlElement(name="password")
    private String password;

    public Lister() {
    }
    
    public Lister(String email, String userName, String dob, String password){
        this.email = email;
        this.userName = userName;  
        this.dob = dob;
        this.password = password;

}
//get and set methods for each parameter of lister
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }   
    
}
