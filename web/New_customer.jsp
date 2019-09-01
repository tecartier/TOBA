<%-- 
    Document   : New_customer
    Created on : Aug 27, 2019, 1:19:29 PM
    Author     : te_c1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="utf-8" />
        <title>TOBA &Proportion; New User</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="styles/main.css" rel="stylesheet" type="text/css"/>
        <!--[if lt IE 9]>
        <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"> </script>   
        <![endif]-->
    </head>

<body>
    <header>
        TOBA
    </header>

    <div id="wrapper">
    
    <div id="flex">
        <nav>
            <div class="menuButton-container">
                <button id="menuButton">Menu</button>
            </div>
            <ul id="menu">
                        <li><a href="index.html">Home</a></li>
                        <li><a href="login.html">Log in</a></li>
                        <li><a href="New_customer.jsp">New User</a></li>
                        <li><a href="about.html">About</a></li>
                        <li><a href="contact.html">Contact</a></li>
                    </ul>
        <aside>
            <br><b>TOBA</b><br>
            <a class="mobile" href="tel:813-555-5555">(813) 555-5555</a> <span class="desktop">(813) 555-5555</span>
            <a href="mailto:tcarti3@live.spcollege.edu">tcarti3@live.spcollege.edu</a>
        </aside>
                </nav>
    <main>
       <h2>Welcome to Titan Online Banking!</h2>
       <p>Please complete the form below to set up your online banking account. 
            Existing users, please visit the <a href="login.html">login page</a>.</p>
       
       <p><i>${message}</i></p>    
       <form action="newCustomer" method="post">
            <h2>New user information:</h2>
            <input type="hidden" name="action" value="add">  
            <label>First Name:</label>
            <input type="text" name="firstName" value = ${user.firstName}><br>
            <label>Last Name:</label>
            <input type="text" name="lastName" value = ${user.lastName}><br>
            <label>Email Address:</label>
            <input type="email" name="email" value = ${user.email}><br>
            <label>Phone:</label>
            <input type="text" name="phone" value = ${user.phone}><br>
            <label>Street Address:</label>
            <input type="text" name="streetAddress" value = ${user.streetAddress}><br>
            <label>City:</label>
            <input type="text" name="city" value = ${user.city}><br>
            <label>State:</label>
            <input type="text" name="state" value = ${user.state}><br>
            <label>Zip Code:</label>
            <input type="text" name="zip" value = ${user.zip}><br>
            <label>&nbsp;</label>
            <input type=submit value="Register">
        </form>
    </main>
    
    <aside>
        <img src="images/laptop.jpg" alt="Laptop">
    </aside>
    
    </div>
    
    </div>
    <footer>Copyright &copy; 2019 Tricia Cartier</footer>
<script src="js/menu.js"></script>
</body>
</html>