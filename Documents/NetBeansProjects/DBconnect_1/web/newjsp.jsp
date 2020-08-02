<%-- 
    Document   : newjsp
    Created on : Jul 17, 2020, 9:48:38 PM
    Author     : Chathani
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page  import="java.sql.*"  %>

<%
    String firstName = request.getParameter("firstName");
    String lastName = request.getParameter("lastName");
    String firstName = request.getParameter("firstName");