package com.vme.chat.user.service.impl;

import com.vme.chat.user.dao.ChatUserMapper;
import com.vme.chat.user.service.ChatUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by fengwen on 2016/8/28.
 */
@Service
public class ChatUserServiceImpl implements ChatUserService {
    @Autowired
    private ChatUserMapper chatUserMapper;

    @Override
    public boolean login(String username, String password) {
        Map map = new HashMap<>();
        map.put("username",username);
        map.put("password",password);
        chatUserMapper.login(map);
        return true;
    }
}
