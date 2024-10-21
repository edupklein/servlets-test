package com.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Locale;

@WebServlet("/headers")
public class ServletHeaders extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        if(name == null) {
            name = "";
        }

        Locale locale = req.getLocale();
        String languageTag = locale.toLanguageTag().substring(0, 2);

        String greeting;
        switch (languageTag) {
            case "fr":
                greeting = "Bonjour";
                break;
            case "de":
                greeting = "Guten Tag";
                break;
            default:
                greeting = "Hello";
                languageTag = "en";
                break;
        }

        resp.setHeader("Content-Language", languageTag);


        resp.getWriter().println(greeting + " " + name);
    }
}