package rizwar.software_testing.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import rizwar.software_testing.api.model.User;
import rizwar.software_testing.service.UserService;

@RestController
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<User> getUser(){
        List<User> users = userService.getUser();
        return users;
    }

    @GetMapping("/user")
    public User getUserById(@RequestParam Integer id){
        Optional<User> user = userService.getUserById(id);
        if(user.isPresent()){
            return (User) user.get();
        }

        return null;
    }

    @PostMapping("/user")
    public User create(@RequestBody User user){
        return userService.create(user);
    }

    @PatchMapping("/user")
    public User edit(@RequestParam Integer id, @RequestBody User user){
        return user;
        
    }
}
