package com.pillProject.demo.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/login")
    @ResponseBody
    public String login(@RequestBody User user){
        if(userService.login(user).equals("OK")){
            return "OK";
        }
        else{
            return "ERROR";
        }
    }


    @PostMapping("/register")
    @ResponseBody
    public String register(@RequestBody User user){
        if(userService.register(user).equals("ERROR")){
            return "ERROR";
        }
        else{
            return "OK";
        }
    }
}
