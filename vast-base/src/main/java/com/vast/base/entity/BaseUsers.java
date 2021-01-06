package com.vast.base.entity;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ====================================================
 *
 * @ProjectName: vast-inbk
 * @Package: com.vast.base.entity
 * @ClassName: BaseUsers
 * @Author: Administrator
 * @Description: base_users实体类
 * @Date: 2021/1/4 15:19
 * ====================================================
 * @Version: 1.0
 * ====================================================
 */
@Table(name = "base_users")
public class BaseUsers {

    @Id
    private Integer id;
    private String username;
    private String pwd;
    private Integer status;
    private String city;
    private Double wealth;
    private Integer sex;
    private Integer locked;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Double getWealth() {
        return wealth;
    }

    public void setWealth(Double wealth) {
        this.wealth = wealth;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getLocked() {
        return locked;
    }

    public void setLocked(Integer locked) {
        this.locked = locked;
    }
}
