package com.github.vinyprogramador.loginlogoff01221125viniciusnunes.Controller;

import com.github.vinyprogramador.loginlogoff01221125viniciusnunes.Model.User;
import com.github.vinyprogramador.loginlogoff01221125viniciusnunes.Model.UserAuthenticated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

//Nome: Vinicius A Nunes
//RA:01221125

@RestController
@RequestMapping("/users")
public class UserController {
    List<User> users = new ArrayList<>();

    //Show all users

    @GetMapping
    public List<User> showAllUsers() {
        return users;
    }

    //Register Users
    @PostMapping
    public UserAuthenticated register(@RequestBody User newUser) {
        users.add(newUser);
        return new UserAuthenticated(newUser.getName(), newUser.getEmail(), newUser.isAuthenticated());
    }

    //Authenticate user
    @PostMapping("/authenticated/{name}/{password}")
    public User authenticateUser(@PathVariable String name, @PathVariable String password) {
        for (User user : users) {
            if (user.getName().equals(name) && user.getPassword().equals(password)) {
                user.setAuthenticated(true);
                return user;
            }
        }
        return null;
    }

    //withdraw authentication
    @DeleteMapping("/authenticated/{name}")
    public String withdrawAuthentication(@PathVariable String name) {
        for (User user : users) {
            if (user.getName().equals(name)) {
                if (user.isAuthenticated()) {
                    user.setAuthenticated(false);
                    return "Logoff do usuário " + user.getName() + " concluido.";
                } else {
                    return "Usuário " + user.getName() + " NÃO está autenticado";
                }
            }
        }
        return "Usuário " + name + " não encontrado";
    }

    //Delete by name
    @DeleteMapping("/delete/{name}")
    public String removeByName(@PathVariable String name) {
        for (User user : users) {
            if (user.getName().equals(name)) {
                users.remove(user);
                return "User removed successfully!";
            }
        }
        return "User " + name + " not found..";
    }

    //For security reasons and updates, the system decided to deauthenticate all users
    @PostMapping("/withdrawAuthentication")
    public String withdrawAuthenticationAllUsers(){
        for (User user : users){
            user.setAuthenticated(false);
            return "all users from deauthenticated";
        }
        return "There are no users on your system ;C";
    }
}
