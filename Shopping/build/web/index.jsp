<%-- 
    Document   : index
    Created on : 3 Mar, 2017, 8:17:14 PM
    Author     : Ketan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
   <style>
            .header{
                list-style-type:none;
                margin:10px;
                padding:10px;
                overflow:hidden;
                background-color:skyblue;
            }
            .content{
                position: absolute;
                bottom: 70px;
                width: 200px;
                height: 100px;
    
            }
        </style>
    </head>
    <body>
        <div class='header'>header</div>
        <div>content</div>
        <fieldset style="width:45%; float:left">
            <legend>login</legend>
            <form action='home'>
                <input type="text" name="firstname" value="text" />
                <input type="submit" value="submit" />
                
            </form>
            
        </fieldset>
        <footer>
            <div class="content" style="width:100%;">
        
                <img src="http://www.splc2016.net/img/footer.png">   
                
        </div>
        </footer>     
    </body>
</html>
