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

/**
 *
 * @author te_c1
 */
public class LoginServlet extends HttpServlet {

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
        else if (action.equals("login")) {
            // get parameters from the request
            String username = request.getParameter("username");
            String password = request.getParameter("password");

            

            // validate the parameters
            String message;
            if (username.equals("jsmith@toba.com")  && password.equals("letmein") ) {
                url = "/account_Activity.html";
             
            } 
            else {
                url = "/login_Failure.html"; 
             
            }

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