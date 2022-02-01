package servlet;

import dto.UserDTO;
import entity.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.UserService;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/users")
public class UserServlet extends HttpServlet {

    private final UserService userService = UserService.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try (PrintWriter writer = resp.getWriter()) {
            List<UserDTO> users = userService.findAllUsers();
            writer.write("<ul>");
            writer.write("Hello, World");
            users.forEach(userDTO -> writer.write("<li>" + userDTO.getFirstName() + " " + userDTO.getLastName() + "</li>"));
            writer.write("</ul>");
        }
    }
}