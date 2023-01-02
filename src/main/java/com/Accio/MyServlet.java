package com.Accio;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Servlet")
//This is a servlet (mini server)
public class MyServlet extends HttpServlet {
    //This will handle request
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //Set content type of response
        response.setContentType("text/html");
        //get writer to write content in response
        PrintWriter out = response.getWriter();
        //write content
        out.println("<h3> This is my Servlet </h3>");

    }
}
