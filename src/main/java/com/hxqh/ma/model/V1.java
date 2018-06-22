package com.hxqh.ma.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Ocean lin on 2018/6/22.
 */
@Entity
@Table(name = "V1")
public class V1 {
    @Id
    private Integer rn;
    private String projectname;
    private Double sumhours;

    public V1() {
    }

    public Integer getRn() {
        return rn;
    }

    public void setRn(Integer rn) {
        this.rn = rn;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    public Double getSumhours() {
        return sumhours;
    }

    public void setSumhours(Double sumhours) {
        this.sumhours = sumhours;
    }
}
