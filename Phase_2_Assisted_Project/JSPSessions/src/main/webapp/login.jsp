<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%> 

<% 

 

        String name = request.getParameter("name"); 

        String pwd = request.getParameter("pwd"); 

         

        if (name == null || name.equals("Kaustubh") || pwd == null || pwd.equals("123456")) { 

                response.sendRedirect("index.jsp?error=1"); 

        } else { 

                 

                session.setAttribute("name", name); 

                response.sendRedirect("dashboard.jsp"); 

                 

        } 

%> 