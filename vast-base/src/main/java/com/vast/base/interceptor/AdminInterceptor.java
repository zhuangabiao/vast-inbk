package com.vast.base.interceptor;

import com.vast.base.units.LoginContext;
import com.vast.base.units.SystemFinal;
import com.vast.base.units.TokenUtil;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ====================================================
 *
 * @ProjectName: vast-inbk
 * @Package: com.vast.base.interceptor
 * @ClassName: LoginInterceptor
 * @Author: Administrator
 * @Description:
 * @Date: 2021/1/5 15:15
 * ====================================================
 * @Version: 1.0
 * ====================================================
 */
public class AdminInterceptor implements HandlerInterceptor {


    /**
     * @Method preHandle
     * @Author Mr.Z
     * @Version  1.0
     * @Description
     *      在请求处理之前进行调用（Controller方法调用之前）
     *
     * @param request
     * @param response
     * @param handler
     * @Return boolean
     * @Exception
     * @Date 2021/1/5 15:17
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {


        if(!request.getRequestURI().contains(SystemFinal.URI_CONTAINS)) {
            response.sendRedirect("/vast/login2Page");
        }
        if(request.getRequestURI().contains(SystemFinal.URI_LOGIN)) {
            return true;
        }
        String userId = TokenUtil.getTokenUserId();
        if(StringUtils.isEmpty(userId)) {
            LoginContext loginContext = (LoginContext) request.getSession().getAttribute(SystemFinal.KEY_SESSION);
            if(null == loginContext || StringUtils.isEmpty(loginContext.getId())) {
                response.sendRedirect("/vast/login2Page");
            }
        }
        return true;
    }

    /**
     * @Method postHandle
     * @Author Mr.Z
     * @Version  1.0
     * @Description
     *      请求处理之后进行调用，但是在视图被渲染之前（Controller方法调用之后）
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @Return void
     * @Exception
     * @Date 2021/1/5 15:17
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    /**
     * @Method afterCompletion
     * @Author Mr.Z
     * @Version  1.0
     * @Description
     *      在整个请求结束之后被调用，也就是在DispatcherServlet 渲染了对应的视图之后执行（主要是用于进行资源清理工作）
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @Return void
     * @Exception
     * @Date 2021/1/5 15:18
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
