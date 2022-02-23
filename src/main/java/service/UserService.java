package service;

import dao.UserDao;
import dto.UserDTO;
import entity.User;

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

    public UserDTO findUserByID(Integer id){
        if (id != null){
            User user = userDao.findById(id);
            return new UserDTO(user.getFirstName(), user.getLastName());
        }
        return null; //что с ДР и мылом?
    }

    public UserDTO save() { // что с ДР? почему Nick, как метод будет работать с другими данными?
        User user = new User();
        user.setFirstName("Nick");
        user.setLastName("Nick");
        user.setEmail("nick@.com");
//        user.setDateOfBirth("nick@.com");

        userDao.save(user);

        return new UserDTO(user.getFirstName(), user.getLastName());
    }

    public void delete(Integer id) {
        userDao.delete(id);
    }

    public void update(Integer id) { //не понятно зачем нам в ДТО CRUD методы
        User user = new User();     //дублирующие ДАО
        user.setFirstName("Nick");// что с ДР? почему Nick, как метод будет работать с другими данными?
        user.setLastName("Nick");
        user.setEmail("nick@.com");

        userDao.update(id, user);
    }

}