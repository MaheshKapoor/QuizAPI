package com.quizapp.service;

import com.quizapp.model.User;
import com.quizapp.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.QueryParam;

@RestController
public class UserService {

    private static final Logger log = LoggerFactory.getLogger(UserService.class);

    @RequestMapping(value="/validateAccount", method=RequestMethod.POST)
    @CrossOrigin
    public @ResponseBody User getDetails(@RequestBody String[] userDetail, @QueryParam("id") String category ) throws Exception {
        User user = new User();
        if(userDetail != null){

           if ("mahesh".equalsIgnoreCase(userDetail[0]) || "nono".equalsIgnoreCase(userDetail[0])){
                log.debug("logged in successfully");
                user.setName(userDetail[0]);
                user.setValidUser(true);
           }
       }
       log.debug("setting email :" + user.getEmail()+ " for :"+user.getName() );
        return user;
    }

}