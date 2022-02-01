package dao;

import entity.User;
import util.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserDao implements Dao<Integer, User> {
    private static final UserDao INSTANCE = new UserDao();
    private static final String FIND_ALL_USERS_QUERY = "select id, first_name, last_name, email, date_of_birth from users";

    private UserDao() {
    }

    public static UserDao getInstance() {
        return INSTANCE;
    }

    @Override
    public User save(User entity) {
        return null;
    }
    @Override
    public Optional<User> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public List<User> findAll() {
        List<User> users = new ArrayList<>();
        try (Connection connection = ConnectionManager.get()) {
            PreparedStatement preparedStatement = connection.prepareStatement(FIND_ALL_USERS_QUERY);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                users.add(mapUser(resultSet));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;
    }

    @Override
    public boolean update(Integer id, User entity) {
        return false;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }

    private User mapUser(ResultSet resultSet) {
        try {
            return new User(
                    resultSet.getObject("id", Integer.class),
                    resultSet.getObject("first_name", String.class),
                    resultSet.getObject("last_name", String.class),
                    resultSet.getObject("email", String.class),
                    resultSet.getObject("date_of_birth", LocalDate.class)
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}