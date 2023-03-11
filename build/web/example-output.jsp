<%-- 
    Document   : example-output
    Created on : 11 Mar 2023, 3:43:52 pm
    Author     : LocalMachine
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="assignment.Example" %>
<%@page import="assignment.DB" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Example Page</title>
    </head>
    <body>
        <h1> I wanted to say '
            <%
                Example ex = new Example();
                out.print(ex.printMsg("fuck all of you."));
            %>
            '</h1>
        <br>
        <h2>
            <%
                DB db = new DB();
                out.print(db.selectAllRecord("customer"));
            %>
        </h2>
    </body>
</html>
