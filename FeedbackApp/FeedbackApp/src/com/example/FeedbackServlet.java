
package com.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class FeedbackServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        // Get data from HTML form
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String feedbackType = request.getParameter("feedbackType");
        String comments = request.getParameter("comments");

        // Set response content type
        response.setContentType("text/html;charset=UTF-8");

        // Create output writer
        PrintWriter out = response.getWriter();

        // Display response
        out.println("<html>");
        out.println("<head><title>Feedback Response</title></head>");
        out.println("<body>");

        out.println("<h1>Thank You!</h1>");

        out.println("<h2>Thank you, " + escape(name)
                + " for your feedback!</h2>");

        out.println("<p><b>Email:</b> " + escape(email) + "</p>");

        out.println("<p><b>Feedback Type:</b> "
                + escape(feedbackType) + "</p>");

        out.println("<p><b>Comments:</b> "
                + escape(comments) + "</p>");

        out.println("<p><b>Date and Time:</b> "
                + LocalDateTime.now() + "</p>");

        out.println("<a href='feedback.html'>Go Back</a>");

        out.println("</body>");
        out.println("</html>");
    }

    // Escape HTML characters in user input
    private String escape(String value) {
        if (value == null) {
            return "";
        }

        return value.replace("&", "&amp;")
                .replace("<", "&lt;")
                .replace(">", "&gt;")
                .replace("\"", "&quot;")
                .replace("'", "&#39;");
    }
}
