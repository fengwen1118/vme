package com.vme.chat.web.controller;

import com.vme.chat.common.utils.SpringMVCUtils;
import com.vme.chat.user.domain.ChatUser;
import com.vme.chat.user.service.ChatUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

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
    public void login(HttpServletRequest request, HttpServletResponse response, String userName, String passWord ){
        Map<String , Object> result = new HashMap<>();
        logger.info("login start! userName=" );
        boolean loginFlag = chatUserService.login(userName,passWord);
        if(loginFlag){
            result.put("success",true);
        }else{
            result.put("success",false);
        }
        SpringMVCUtils.renderJson(response, result);
    }


    @RequestMapping("/chatPage")
    public String chatPage(HttpServletRequest request, HttpServletResponse response ){
      return "chatPage";
    }


}
