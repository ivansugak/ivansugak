package service;

import dao.UserDao;
import dto.UserDTO;

import java.util.List;
import java.util.stream.Collectors;

public class UserService {
    private final UserDao userDao = UserDao.getInstance();
    private static final UserService INSTANCE = new UserService();

    private UserService() {
    }

    public static UserService getInstance() {
        return INSTANCE;
    }

    public List<UserDTO> findAllUsers() {

        return userDao.findAll().stream()
                .map(user -> new UserDTO(
                        user.getFirstName(),
                        user.getLastName()
                ))
                .collect(Collectors.toList());
    }
}