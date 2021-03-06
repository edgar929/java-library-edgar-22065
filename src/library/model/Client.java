package library.model;
// Generated May 11, 2020 6:21:40 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Client generated by hbm2java
 */
public class Client  implements java.io.Serializable {


     private String regno;
     private String firstname;
     private String lastname;
     private String phonenumber;
     private String emailaddress;
     private String clientcategory;
     private String photo;
     private Set checkinouts = new HashSet(0);

    public Client() {
    }

	
    public Client(String regno) {
        this.regno = regno;
    }
    public Client(String regno, String firstname, String lastname, String phonenumber, String emailaddress, String clientcategory, String photo, Set checkinouts) {
       this.regno = regno;
       this.firstname = firstname;
       this.lastname = lastname;
       this.phonenumber = phonenumber;
       this.emailaddress = emailaddress;
       this.clientcategory = clientcategory;
       this.photo = photo;
       this.checkinouts = checkinouts;
    }
   
    public String getRegno() {
        return this.regno;
    }
    
    public void setRegno(String regno) {
        this.regno = regno;
    }
    public String getFirstname() {
        return this.firstname;
    }
    
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return this.lastname;
    }
    
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getPhonenumber() {
        return this.phonenumber;
    }
    
    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
    public String getEmailaddress() {
        return this.emailaddress;
    }
    
    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
    }
    public String getClientcategory() {
        return this.clientcategory;
    }
    
    public void setClientcategory(String clientcategory) {
        this.clientcategory = clientcategory;
    }
    public String getPhoto() {
        return this.photo;
    }
    
    public void setPhoto(String photo) {
        this.photo = photo;
    }
    public Set getCheckinouts() {
        return this.checkinouts;
    }
    
    public void setCheckinouts(Set checkinouts) {
        this.checkinouts = checkinouts;
    }




}


