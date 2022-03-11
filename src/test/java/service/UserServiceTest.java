package service;

import dto.UserDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class UserServiceTest {

    static UserService userService;

    @BeforeAll
    static void init(){
        userService = UserService.getInstance();
    }

    @Test
    @DisplayName("find User by ID")
    void findUserByIDExist() {
        int id = 2;
        UserDTO actual = userService.findUserByID(id);
        UserDTO expected = new UserDTO("anna", "sidapova");

        Assertions.assertAll(()->{
            Assertions.assertEquals(expected.getFirstName(), actual.getFirstName());
            Assertions.assertEquals(expected.getLastName(), actual.getLastName());
        });
    }
}
