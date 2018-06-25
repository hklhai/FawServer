package com.hxqh.ma.controller;

import com.hxqh.ma.model.V1;
import com.hxqh.ma.model.V1Click;
import com.hxqh.ma.model.V2;
import com.hxqh.ma.repository.V1ClickRepository;
import com.hxqh.ma.repository.V1Repository;
import com.hxqh.ma.repository.V2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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

    @Autowired
    private V1ClickRepository v1ClickRepository;

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
     * v1Click 数据接口
     * <p>
     * http://101.201.79.54:8999/FawServer/v1Click
     * body projectname:J6系列
     *
     * @return
     */
    @RequestMapping(value = "/v1Click", method = RequestMethod.POST)
    @ResponseBody
    public List<V1Click> v1Click(@RequestParam(value = "projectname") String projectname) {
        return v1ClickRepository.findByProjectname(projectname);
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
