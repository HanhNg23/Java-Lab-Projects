/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login.userlogin;

import java.io.Serializable;

/**
 *
 * @author HOANGANH
 */
public class UserloginDTO implements Serializable{
     private String username;
     private String password;
     private String fullName;
     private boolean role;

    
     public UserloginDTO() {
     }

     public UserloginDTO(String username, String password, String fullname, boolean role) {
          this.username = username;
          this.password = password;
          this.fullName = fullname;
          this.role = role;
     }
       public UserloginDTO(String username, String fullname, boolean role) {
          this.username = username;
          this.fullName = fullname;
          this.role = role;
     }
          public UserloginDTO(String username,  String password) {
          this.username = username;
          this.password = password;
     }
     
     
      
     /**
      * @return the username
      */
     public String getUsername() {
          return username;
     }

     /**
      * @param username the username to set
      */
     public void setUsername(String username) {
          this.username = username;
     }

     /**
      * @return the password
      */
     public String getPassword() {
          return password;
     }

     /**
      * @param password the password to set
      */
     public void setPassword(String password) {
          this.password = password;
     }

     /**
      * @return the fullName
      */
     public String getFullName() {
          return fullName;
     }

     /**
      * @param fullName the fullName to set
      */
     public void setFullName(String fullName) {
          this.fullName = fullName;
     }

     /**
      * @return the role
      */
     public boolean isRole() {
          return role;
     }

     /**
      * @param role the role to set
      */
     public void setRole(boolean role) {
          this.role = role;
     }

     @Override
     public String toString() {
          return "Username: " + username + "Password " + password;
     }
     
     
     
     
}
