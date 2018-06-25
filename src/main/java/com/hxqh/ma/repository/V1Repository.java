package com.hxqh.ma.repository;

import com.hxqh.ma.model.V1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Ocean lin on 2018/6/22.
 *
 * @author Lin
 */
@Repository
public interface V1Repository extends JpaRepository<V1, Integer> {
}
