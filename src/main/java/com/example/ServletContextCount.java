package com.example;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

@WebServlet("/context_count")
public class ServletContextCount extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ServletContext context = req.getServletContext();

        int tempCount = 1;

        Object att = context.getAttribute("counter");

        if (att != null) {
            AtomicInteger counter = (AtomicInteger) att;
            tempCount = counter.incrementAndGet();
        }else{
            AtomicInteger counter = new AtomicInteger(1);
            context.setAttribute("counter", counter);
        }

        resp.getWriter().println("Servlet Count = " + tempCount);
    }
}