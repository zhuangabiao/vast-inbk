package com.vast.base.units;

/**
 * ====================================================
 *
 * @ProjectName: vast-inbk
 * @Package: com.vast.base.units
 * @ClassName: SystemFinal
 * @Author: Administrator
 * @Description: 系统常量
 * @Date: 2021/1/5 15:34
 * ====================================================
 * @Version: 1.0
 * ====================================================
 */
public class SystemFinal {

    //拦截器判断请求路径是否可以放行
    public static final String URI_CONTAINS = "/vast";
    //登录页面的URI
    public static final String URI_LOGIN = "/vast/login2Page";
    //session存放登录信息
    public static final String KEY_SESSION = "user_data";

    //用户登录的token数据
    public static final String KEY_AUTHOR_TOKEN = "author_token";

    //验证码
    public static final String KEY_VERIFY_CODE = "verify_code";
}
