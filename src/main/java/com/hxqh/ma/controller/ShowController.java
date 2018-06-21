package com.hxqh.ma.controller;

import com.hxqh.ma.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Ocean lin on 2017/7/1.
 *
 * @author Lin
 */
@Controller
@RequestMapping("/show")
public class ShowController {

    @Autowired
    private SystemService systemService;


    /**
     * 上映电影页面跳转接口
     *
     * @return
     */
    @RequestMapping("/filming")
    public String filming() {
        return "show/filming";
    }


}
