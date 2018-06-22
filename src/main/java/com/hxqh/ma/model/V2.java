package com.hxqh.ma.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Ocean lin on 2018/6/22.
 */
@Entity
@Table(name = "V2")
public class V2 {
    @Id
    private Integer rn;
    private String cudept;
    private Double sumhours;
    private Integer workdate;
    private Integer sumcadre;
    private Double deptload;

    public V2() {
    }

    public Integer getRn() {
        return rn;
    }

    public void setRn(Integer rn) {
        this.rn = rn;
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

    public Integer getWorkdate() {
        return workdate;
    }

    public void setWorkdate(Integer workdate) {
        this.workdate = workdate;
    }

    public Integer getSumcadre() {
        return sumcadre;
    }

    public void setSumcadre(Integer sumcadre) {
        this.sumcadre = sumcadre;
    }

    public Double getDeptload() {
        return deptload;
    }

    public void setDeptload(Double deptload) {
        this.deptload = deptload;
    }
}
