package servlet;

import dto.UserDTO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.UserService;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.List;

@WebServlet("/users")
public class UserServlet extends HttpServlet {

    private final UserService userService = UserService.getInstance();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        userService.save();
        UserDTO userDTO = new UserDTO();
        userDTO.setFirstName(req.getParameter("firstName"));
        userDTO.setLastName(req.getParameter("lastName"));
        userDTO.setEmail(req.getParameter("email"));
        userDTO.setDateOfBirth(LocalDate.parse(req.getParameter("dateOfBirth")));
        userDTO.setLogin(req.getParameter("login"));
        userDTO.setPassword(req.getParameter("password"));

        userService.save(userDTO);

    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        userService.delete(Integer.parseInt(req.getParameter("id")));
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        UserDTO userDTO = new UserDTO();
        userDTO.setFirstName(req.getParameter("firstName"));
        userDTO.setLastName(req.getParameter("lastName"));
        userDTO.setEmail(req.getParameter("email"));
        userDTO.setDateOfBirth(LocalDate.parse(req.getParameter("dateOfBirth")));
        userDTO.setLogin(req.getParameter("login"));
        userDTO.setPassword(req.getParameter("password"));

        userService.update(Integer.parseInt(req.getParameter("id")), userDTO);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");

//        resp.setCharacterEncoding(StandardCharsets.UTF_8.name());

        try (PrintWriter writer = resp.getWriter()) {
            List<UserDTO> users = userService.findAllUsers();
            writer.write("<ul>");
            writer.write("Hello, World");
            users.forEach(userDTO -> writer.write("<li>" + userDTO.getFirstName() + " " + userDTO.getLastName() + "</li>"));
            writer.write("</ul>");

            if (req.getParameter("id") != null && !req.getParameter("id").isEmpty()) {
                UserDTO userDTO = userService.findUserByID(Integer.parseInt(req.getParameter("id")));
                writer.write("User id " + userDTO.getFirstName() + " " + userDTO.getLastName());
            }

            Cookie cookie = new Cookie("user", "visited");
            resp.addCookie(cookie);

            Cookie[] cookies = req.getCookies();
            for (Cookie cookie1 : cookies) {
                if (cookie1.getValue().equals("visited")) {
                    writer.write("User visited");
                }
            }
        }
    }
}