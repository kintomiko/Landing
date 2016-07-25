package org.nzcn.controllers;

import org.bson.types.ObjectId;
import org.nzcn.models.User;
import org.nzcn.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.List;

/**
 * Created by kindai on 9/07/16.
 */
@Controller
@EnableWebMvc
@RequestMapping("/user")
public class UserServiceController {

    @Autowired
    @Qualifier("userService")
    private UserService userService;

    @RequestMapping(value = "/{uid}", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    User getUser(@PathVariable String uid){
        User user = userService.getObject(uid);
        return user;
    }

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<User> getAllUsers(){
        List<User> users = userService.getAll();
        return users;
    }

    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    public @ResponseBody
    User createUser(@RequestBody User user){
        userService.createUser(user);
        return user;
    }

    @RequestMapping(value = "/{uid}", method = RequestMethod.PUT, produces = "application/json")
    public @ResponseBody
    User updateUser(@PathVariable String uid, @RequestBody User user){
        user.set_id(new ObjectId(uid));
        userService.updateUser(user);
        return user;
    }
}
