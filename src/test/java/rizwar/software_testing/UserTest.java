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
}
