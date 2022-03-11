package service;

import dao.UserDao;
import dto.UserDTO;
import entity.User;
import mapper.UserMapper;

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
                        user.getLastName(),
                        user.getEmail(),
                        user.getDateOfBirth()))
                .collect(Collectors.toList());
    }

    public UserDTO findUserByID(Integer id){
        if (id != null){
            User user = userDao.findById(id);
            return UserMapper.mapToDto(user);
        }
        return null;
    }

    public UserDTO save(UserDTO userDTO) {
        User user = UserMapper.mapToEntity(userDTO);

        userDao.save(user);

        return null;
    }

    public void delete(Integer id) {
        userDao.delete(id);
    }

    public UserDTO update(Integer id, UserDTO userDTO) {
        User user = new User();

        user.setFirstName(userDTO.getFirstName());
        user.setLastName(userDTO.getLastName());
        user.setEmail(userDTO.getEmail());
        user.setDateOfBirth(userDTO.getDateOfBirth());

        userDao.update(id, user);

        return userDTO;
    }

    public UserDTO login(UserDTO userDTO) {
        User user = userDao.findByLoginAndPassword(userDTO.getLogin(), userDTO.getPassword());
        return UserMapper.mapToDto(user);
    }

}