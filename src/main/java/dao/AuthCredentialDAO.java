package dao;

import entity.AuthCredential;
import my.util.ConnectionManager;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AuthCredentialDAO implements Dao<Integer, AuthCredential>{

    private static final AuthCredentialDAO INSTANCEAUTH = new AuthCredentialDAO();

    private static final String SAVE_AUTHCREDENTIAL_QUERY = "INSERT into authcredential (login, password) values(?, ?)";
    private static final String FIND_BY_ID_QUERY = "SELECT id, login, password from authcredential WHERE id = ?";
    private static final String FIND_ALL_AUTHCREDENTIAL_QUERY = "SELECT id, login, password from authcredential";
    private static final String UPDATE_AUTHCREDENTIAL_QUERY = "UPDATE authcredential(login, password) values(?, ?) WHERE id = ?";
    private static final String DELETE_AUTHCREDENTIAL_QUERY = "DELETE from authcredential WHERE id = ?";


    private AuthCredentialDAO() {
    }

    public static AuthCredentialDAO getInstance() {
        return INSTANCEAUTH;
    }

    @Override
    public AuthCredential save(AuthCredential entity) {
        try (Connection connection = ConnectionManager.get()) {
            PreparedStatement preparedStatement = Objects.requireNonNull(connection).prepareStatement(SAVE_AUTHCREDENTIAL_QUERY);
            preparedStatement.setString(1, entity.getLogin());
            preparedStatement.setString(2, entity.getPassword());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public AuthCredential findById(Integer id) {
        AuthCredential authCredential = new AuthCredential();
        try (Connection connection = ConnectionManager.get()) {
            PreparedStatement preparedStatement = Objects.requireNonNull(connection).prepareStatement(FIND_BY_ID_QUERY);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                authCredential = mapAuthCredential(resultSet);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return authCredential;
    }

    @Override
    public List<AuthCredential> findAll() {
        List<AuthCredential> authCredentials = new ArrayList<>();
        try (Connection connection = ConnectionManager.get()) {
            PreparedStatement preparedStatement = Objects.requireNonNull(connection).prepareStatement(FIND_ALL_AUTHCREDENTIAL_QUERY);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                authCredentials.add(mapAuthCredential(resultSet));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return authCredentials;
    }

    @Override
    public boolean update(Integer id, AuthCredential entity) {
        try (Connection connection = ConnectionManager.get()) {
            PreparedStatement preparedStatement = Objects.requireNonNull(connection).prepareStatement(UPDATE_AUTHCREDENTIAL_QUERY);
            preparedStatement.setString(1, entity.getLogin());
            preparedStatement.setString(2, entity.getPassword());
            preparedStatement.setInt(3, id);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delete(Integer id) {
        try(Connection connection = ConnectionManager.get()){
            PreparedStatement preparedStatement = Objects.requireNonNull(connection).prepareStatement(DELETE_AUTHCREDENTIAL_QUERY);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    private AuthCredential mapAuthCredential(ResultSet resultSet) {
        try {
            return new AuthCredential(
//                    resultSet.getObject("id", Integer.class),
                    resultSet.getObject("login", String.class),
                    resultSet.getObject("password", String.class)
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
