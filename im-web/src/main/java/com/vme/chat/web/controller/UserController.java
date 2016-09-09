package com.vme.chat.web.controller;

import com.vme.chat.user.domain.ChatUser;
import com.vme.chat.user.service.ChatUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by fengwen on 2016/9/9.
 */
@Controller
@Scope("prototype") //多例
@RequestMapping("/user")
public class UserController {
    private final static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private ChatUserService chatUserService;

    @RequestMapping("/login")
    public String login(String userName,String passWord ){
        logger.info("login start! userName=" );
        boolean loginFlag = chatUserService.login(userName,passWord);
        return "error-404";
    }

}
