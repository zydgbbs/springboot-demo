package com.zydgbbs.springboothelloworld.controller;

import com.zydgbbs.springboothelloworld.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class JsonController {

    @GetMapping("/testjson")
    public User testJson(){
        return new User("zydgbbs",11,"1234567890",new Date());
    }
}
