/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business;

/**
 *
 * @author te_c1
 */
public class User {
    String firstName, lastName, email, streetAddress, city, state, zip, phone;

    
    public User(){
        
    }
    
    public User(String firstName, String lastName, 
            String email, String streetAddress,
            String city, String state, String zip, String phone){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        
    }
    @Override
    public String toString(){
     return  (super.toString()+ " " + firstName +" "+ lastName +
              "\n" +  email + "\n" + streetAddress + ", " + city + "\n" + state +
                ", " + zip + "\n"+ phone);
    }
}
