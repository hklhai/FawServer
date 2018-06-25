package com.hxqh.ma.repository;

import com.hxqh.ma.model.V2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Ocean lin on 2018/6/22.
 *
 * @author Lin
 */
@Repository
public interface V2Repository extends JpaRepository<V2, Integer> {

//    @Query("select u from User u where u.name=:name")
//    User findUserById(@Param("name") String name);
}
