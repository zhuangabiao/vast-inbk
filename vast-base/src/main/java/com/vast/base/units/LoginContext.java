package com.vast.base.units;

import java.util.Date;

/**
 * ====================================================
 *
 * @ProjectName: vast-inbk
 * @Package: com.vast.base.units
 * @ClassName: LoginContext
 * @Author: Administrator
 * @Description: 登录后的信息数据，存放在session
 * @Date: 2021/1/5 15:40
 * ====================================================
 * @Version: 1.0
 * ====================================================
 */
public class LoginContext {

    private String authorToken;
    private String id;
    private String username;
    private String pwd;
    private Date loginTime;
    private Date lastTime;

    public String getAuthorToken() {
        return authorToken;
    }

    public void setAuthorToken(String authorToken) {
        this.authorToken = authorToken;
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

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public Date getLastTime() {
        return lastTime;
    }

    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
