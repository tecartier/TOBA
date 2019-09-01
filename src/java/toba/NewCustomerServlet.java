/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package toba;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import business.User;
import data.UserDB;

public class NewCustomerServlet extends HttpServlet {

   @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        String url = "/New_customer.jsp";
        
        // get current action
        String action = request.getParameter("action");
        if (action == null) {
            action = "return";  // default action
        }

        // perform action and set URL to appropriate page
        if (action.equals("return")) {
            url = "/login.html";    // 
        } 
        else if (action.equals("add")) {
            // get parameters from the request
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");
            String streetAddress= request.getParameter("streetAddress");
            String city = request.getParameter("city");
            String state = request.getParameter("city");
            String zip = request.getParameter("zip");
            String phone = request.getParameter("phone");
            // store data in User object
            //User user = new User(firstName, lastName, email, streetAddress, city, state, zip, phone);
            

            // validate the parameters
            String message;
            if (firstName == null || lastName == null || email == null ||
                streetAddress == null || city == null || state == null ||
                zip == null || phone == null ||
                firstName.isEmpty() || lastName.isEmpty() || email.isEmpty() ||
                streetAddress.isEmpty() || city.isEmpty() || state.isEmpty() ||
                zip.isEmpty() || phone.isEmpty()) {
                message = "Please fill out the form completely.";
                url = "/New_customer.jsp";
            } 
            else {
                message = "";
                url = "/success.html";
               // UserDB.insert(user);
                // System.out.println("User created: " + user.toString());
                
            }
           // request.setAttribute("user", user);
            request.setAttribute("message", message);
        }
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }
    
    @Override 
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException{
        doPost(request, response);
    } 
}