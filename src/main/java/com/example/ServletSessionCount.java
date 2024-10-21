package com.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

@WebServlet("/session_count")
public class ServletSessionCount extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();

        int tempCounter = 1;

        Object att = session.getAttribute("counter");

        if (att != null) {
            AtomicInteger counter = (AtomicInteger) att;
            tempCounter = counter.incrementAndGet();
        }else{
            AtomicInteger counter = new AtomicInteger(1);
            session.setAttribute("counter", counter);
        }
        resp.getWriter().println("Session Count = " + tempCounter);
        resp.getWriter().println("CreationTime = " + session.getCreationTime());
        resp.getWriter().println("LastAccessedTime = " + session.getLastAccessedTime());
        resp.getWriter().println("MaxInactiveInterval = " + session.getMaxInactiveInterval());
    }
}