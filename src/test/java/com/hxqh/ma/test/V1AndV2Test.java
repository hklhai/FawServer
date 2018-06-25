package com.hxqh.ma.test;

import com.hxqh.ma.model.V1;
import com.hxqh.ma.model.V2;
import com.hxqh.ma.repository.V1Repository;
import com.hxqh.ma.repository.V2Repository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Ocean lin on 2018/6/22.
 *
 * @author Ocean lin
 */
//@SpringBootTest
//@RunWith(SpringJUnit4ClassRunner.class)
public class V1AndV2Test {

    @Resource
    private V1Repository v1Repository;

    @Resource
    private V2Repository v2Repository;


    @Test
    public void findAllV1() {
        List<V1> v1RepositoryList = v1Repository.findAll();
        Assert.assertTrue(v1RepositoryList.size() > 0);

    }

    @Test
    public void findAllV2() {
        List<V2> v2RepositoryList = v2Repository.findAll();
        Assert.assertTrue(v2RepositoryList.size() > 0);
    }


}
