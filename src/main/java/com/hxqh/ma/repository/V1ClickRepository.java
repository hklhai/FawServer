package com.hxqh.ma.repository;

import com.hxqh.ma.model.V1Click;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Ocean lin on 2018/6/22.
 *
 * @author Ocean lin
 */
@Repository
public interface V1ClickRepository extends JpaRepository<V1Click, Integer> {
    List<V1Click> findByProjectname(String projectname);
}
