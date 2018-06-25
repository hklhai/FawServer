package com.hxqh.ma.model;

/**
 * Created by Ocean lin on 2018/6/22.
 *
 * @author Ocean lin
 */

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "V1_CLICK")
public class V1Click {
    @Id
    private Integer rn;
    private String projectname;
    private String cudept;
    private Double sumhours;

    public V1Click() {
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

    public String getCudept() {
        return cudept;
    }

    public void setCudept(String cudept) {
        this.cudept = cudept;
    }

    public Double getSumhours() {
        return sumhours;
    }

    public void setSumhours(Double sumhours) {
        this.sumhours = sumhours;
    }
}
