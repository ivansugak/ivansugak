package servlet;

import dto.UserDTO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import service.UserService;

import java.io.IOException;
import java.time.LocalDate;

@WebServlet("/saveServlet")
public class SaveServlet extends HttpServlet {

    private final UserService userService = UserService.getInstance();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String first_name = req.getParameter("first_name");
        String last_name = req.getParameter("last_name");
        String email = req.getParameter("email");
        LocalDate date_of_birth = LocalDate.parse(req.getParameter("date_of_birth"));
        UserDTO user = new UserDTO();
        user.setFirstName("first_name");
        user.setLastName("last_name");
        user.setEmail("email");
        user.setDateOfBirth(date_of_birth);

        HttpSession session = req.getSession();
        session.setAttribute("first_name", first_name);
        session.setAttribute("last_name", last_name);
        session.setAttribute("email", email);
        session.setAttribute("date_of_birth", date_of_birth);
        session.setAttribute("user", user);

//        userService.save();
    }
}
