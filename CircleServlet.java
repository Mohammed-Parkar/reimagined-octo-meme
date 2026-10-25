package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/circle")
public class CircleServlet extends GenericServlet {

    @Override
    public void service(ServletRequest request, ServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        double radius = Double.parseDouble(request.getParameter("radius"));

        double area = Math.PI * radius * radius;

        out.println("<h1>Area of Circle</h1>");
        out.println("<h2>Radius is: " + radius + "</h2>");
        out.println("<h2>Area is: " + area + "</h2>");
    }
}