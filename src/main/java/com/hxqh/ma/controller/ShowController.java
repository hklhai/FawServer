package com.hxqh.ma.controller;

import com.hxqh.ma.model.V1;
import com.hxqh.ma.model.V2;
import com.hxqh.ma.repository.V1Repository;
import com.hxqh.ma.repository.V2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Ocean lin on 2017/7/1.
 *
 * @author Lin
 */
@Controller
public class ShowController {
    @Autowired
    private V1Repository v1Repository;

    @Autowired
    private V2Repository v2Repository;


    /**
     * 展示页面
     *
     * @return
     */
    @RequestMapping("/")
    public String show() {
        return "show/show";
    }

    /**
     * 钻取页面
     *
     * @return
     */
    @RequestMapping("/click")
    public String click() {
        return "show/click";
    }

    /**
     * V1 数据接口
     *
     * @return
     */
    @RequestMapping(value = "/v1Data", method = RequestMethod.GET)
    @ResponseBody
    public List<V1> v1Data() {
        return v1Repository.findAll();
    }

    /**
     * V2 数据接口
     *
     * @return
     */
    @RequestMapping(value = "/v2Data", method = RequestMethod.GET)
    @ResponseBody
    public List<V2> v2Data() {
        return v2Repository.findAll();
    }


}
