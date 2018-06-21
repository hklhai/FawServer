package com.hxqh.ma.service;

import com.hxqh.ma.model.User;
import com.hxqh.ma.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Ocean lin on 2018/4/8.
 *
 * @author Ocean lin
 */
@Service("systemService")
public class SystemServiceImpl implements SystemService {

    @Autowired
    private UserRepository userDao;


    @Override
    public User findUserById(String name) {
        return null;
    }
}
