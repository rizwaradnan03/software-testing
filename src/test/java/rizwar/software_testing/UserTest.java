package rizwar.software_testing;

import org.junit.jupiter.api.Test;
import rizwar.software_testing.api.model.User;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    @Test
    void shouldCreateUserCorrectly() {
        User user = new User(1, "Rizwar", 20, "rizwar.adnanbyantara@gmail.com");

        assertEquals("Rizwar", user.getName());
        assertEquals(20, user.getAge());
    }

    // @Test
    // void sortByAgeAsc_shouldSortCorrectly() {
    // UserService service = new UserService();

    // List<User> users = List.of(
    // new User("Budi", 30),
    // new User("Andi", 20),
    // new User("Caca", 25)
    // );

    // List<User> result = service.sortByAgeAsc(users);

    // assertEquals(20, result.get(0).getAge());
    // assertEquals(25, result.get(1).getAge());
    // assertEquals(30, result.get(2).getAge());
    // }
}
