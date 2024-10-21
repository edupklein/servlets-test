package com.filters;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebFilter(filterName = "Filter_2", urlPatterns = {"/*"})
public class Filter_2  extends HttpFilter {
    @Override
    public void doFilter(HttpServletRequest req, HttpServletResponse resp, FilterChain chain) throws IOException, ServletException {
        PrintWriter out = resp.getWriter();

        out.println("Filter 2 Before");

        chain.doFilter(req, resp);

        out.println("Filter 2 After");

    }
}
