package service;

import dto.UserDTO;
import jdk.vm.ci.meta.Local;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.Date;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserServiceTest {

    static UserService userService;

    @BeforeAll
    static void init() {
        userService = UserService.getInstance();
    }

    @Test
    @DisplayName("find User by ID")
    void findUserByIDExist() {
        int id = 10;
        UserDTO actual = userService.findUserByID(id);
        UserDTO expected = new UserDTO("Jenya", "Petrov");

        Assertions.assertAll(() -> {
            assertEquals(expected.getFirstName(), actual.getFirstName());
            assertEquals(expected.getLastName(), actual.getLastName());
        });
    }


    @Test
    @DisplayName("Delete testing")
    void deleteTest(){
        int id = 13;
        int size = userService.findAllUsers().size()-1;
        userService.delete(id);
        int sizeAfterDelete = userService.findAllUsers().size();
        assertEquals(size, sizeAfterDelete);
    }

    @Test
    @DisplayName("FindAllUsers testing")
    void findAllUsersTest(){
        int sizeList = 4;
        int size = userService.findAllUsers().size();
        assertEquals(sizeList, size);

    }

    @Test
    @DisplayName("Save testing")
    void saveTest(){
        int size = userService.findAllUsers().size()+1;
        LocalDate local = LocalDate.of(1978, 11, 15);
        userService.save(new UserDTO("Petya", "Massov", "p.massov@gmail.com", local, "p", "p123"));
        int sizeAfterSaveUser = userService.findAllUsers().size();
        assertEquals(size, sizeAfterSaveUser);
    }

    @Test
    @DisplayName("Update testing")
    void updateTest(){
        UserDTO userDTOForTest = new UserDTO("ivan","SIDOROV","i.petrov@gmail.com", LocalDate.of(1988, 2, 6));
        userService.update(1, userDTOForTest);
    }
}
