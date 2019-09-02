/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business;

import java.io.Serializable;
/**
 *
 * @author te_c1
 */
public class User implements Serializable{
    String firstName, lastName, email;

    
    public User(){
        
    }
    
    public User(String firstName, String lastName, 
            String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
       
    }
    
    public void setFirstName(String fName){
        this.firstName = fName;
    }
    
    public void setLastName(String lName){
        this.lastName = lName;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public String getEmail(){
        return email;
    }
    
    @Override
    public String toString(){
     return  (super.toString()+ " " + firstName +" "+ lastName +
              "\n" +  email);
    }
}
