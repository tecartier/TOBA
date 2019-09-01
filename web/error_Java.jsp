<%-- 
    Document   : error_Java
    Created on : Aug 27, 2019, 1:55:52 PM
    Author     : te_c1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="utf-8" />
        <title>TOBA &Proportion; Java Error</title>
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
        <aside>
            <br><b>TOBA</b><br>
            <a class="mobile" href="tel:813-555-5555">(813) 555-5555</a> <span class="desktop">(813) 555-5555</span>
            <a href="mailto:tcarti3@live.spcollege.edu">tcarti3@live.spcollege.edu</a>
        </aside>
                </nav>
    <main>
      <h2>Java Error</h2>
        <p>Sorry, Java has thrown an exception.</p>
        <p>To continue, click the Back button.</p>   
    </main>
          <aside>
            <h2>Details</h2>
            <p>Type: ${pageContext.exception["class"]}</p>
            <p>Message: ${pageContext.exception.message}</p>
        </aside>
    </div>
    
    </div>
    <footer>Copyright &copy; 2019 Tricia Cartier</footer>
<script src="js/menu.js"></script>
</body>
</html>
