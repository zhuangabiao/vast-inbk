package com.vast.base.units;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.vast.base.entity.BaseUsers;
import org.springframework.util.StringUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * ====================================================
 *
 * @ProjectName: vast-inbk
 * @Package: com.vast.base.units
 * @ClassName: TokenUtil
 * @Author: Administrator
 * @Description: 处理Token
 * @Date: 2021/1/5 15:53
 * ====================================================
 * @Version: 1.0
 * ====================================================
 */
public class TokenUtil {

    public static void main(String[] args) {
        BaseUsers user = new BaseUsers();
        user.setId(102);
        user.setUsername("zhuang");
        user.setPwd("123456");

        TokenUtil util = new TokenUtil();
        String token = util.getToken(user);
        System.out.println(token);
    }

    public static String getToken(BaseUsers user) {
        Date start = new Date();
        long currentTime = System.currentTimeMillis() + 60* 60 * 1000;//一小时有效时间
        Date end = new Date(currentTime);
        String token = JWT.create()
                .withAudience(user.getId()+"")
                .withIssuedAt(start)
                .withExpiresAt(end)
                .sign(Algorithm.HMAC256(user.getPwd()));    //以pwd密码作为秘钥
        return token;
    }

    public static String getTokenUserId() {
        String token = getRequest().getHeader(SystemFinal.KEY_AUTHOR_TOKEN);// 从 http 请求头中取出 token
        if(StringUtils.isEmpty(token)) {
            return null;
        }
        String userId = JWT.decode(token).getAudience().get(0);
        return userId;
    }

    /**
     * 获取request
     *
     * @return
     */
    public static HttpServletRequest getRequest() {
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder
                .getRequestAttributes();
        return requestAttributes == null ? null : requestAttributes.getRequest();
    }
}
