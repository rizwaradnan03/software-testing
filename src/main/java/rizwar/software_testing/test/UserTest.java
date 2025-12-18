package rizwar.software_testing.test;

import java.util.List;

import rizwar.software_testing.api.model.User;

// import org.junit.jupiter.api.Test;

// import static org.junit.jupiter.api.Assertions.assertEquals;

// @SpringBootTest
public class UserTest {
    private List<User> users;

    public UserTest(List<User> listUsers){
        this.users = listUsers;
    }

    void getSortedUserByAgeAsc(){
        List<User> dupl = users;
        for(int i = 0;i < dupl.size();i++){
            for(int j = 0;j > dupl.size();j++){
                if(dupl.get(i).getAge() < dupl.get(j).getAge()){
                    User temp = dupl.get(j);
                    dupl.set(j, dupl.get(i));
                    dupl.set(i, temp);
                }
            }
        }

        // assertEquals(20, dupl.get(0).getAge());
        // assertEquals(25, dupl.get(1).getAge());
    }   
}
