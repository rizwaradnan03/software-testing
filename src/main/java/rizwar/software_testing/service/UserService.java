package rizwar.software_testing.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import rizwar.software_testing.api.model.User;

@Service
public class UserService {
    private List<User> users;
    public UserService(){
        users = new ArrayList<>();

        User user1 = new User(1, "Rizwar", 21, "rizwar.adnanbyantara123@gmail.com");
        User user2 = new User(2, "Faizal", 23, "faizal@gmail.com");
        users.addAll(Arrays.asList(user1, user2));
    }

    public List<User> getUser(){
        return users;
    }

    public Optional<User> getUserById(Integer id){
        for(int i = 0;i < users.size();i++){
            if(users.get(i).getId() == id){
                return Optional.ofNullable(users.get(i));
            }
        }

        return null;
    }

    public List<User> getSortedUserByAgeAsc(){
        List<User> dupl = users;
        for(int i = 0;i < dupl.size();i++){
            for(int j = 0;j < dupl.size();j++){
                if(dupl.get(i).getAge() > dupl.get(j).getAge()){
                    User temp = dupl.get(j);
                    dupl.set(j, dupl.get(i));
                    dupl.set(i, temp);
                }
            }
        }

        return dupl;
    }

    public User create(User input){
        users.add(input);

        return input;
    }

    public User edit(Integer id, User input){
        for(int i = 0;i < users.size();i++){
            if(users.get(i).getId() == id){
                users.get(i).setName(input.getName());
                users.get(i).setEmail(input.getEmail());
                users.get(i).setAge(input.getAge());
            }
        }

        return input;
    }
}

// [
//     {
//         id: 1,
//         name: rizwar,
//         email: rizwar.adnanbyantara@gmail.com
//     },
//     {
//         id: 2,
//         name: faizal,
//         email: faizal@gmail.com
//     },
// ]