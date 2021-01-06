package com.vast.base.controller;


import com.vast.base.units.SystemFinal;
import com.vast.base.units.VerifyUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/vast")
public class LoginController {

    @RequestMapping("/login2Page")
    public String login2Page() {
        return "login";
    }

    @RequestMapping("/verifyCode")
    @ResponseBody
    public void verifyCode(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
        try {
            String verifyCode = VerifyUtil.outputVerifyImage(160,40,response.getOutputStream(),4);
            session.setAttribute(SystemFinal.KEY_VERIFY_CODE,verifyCode);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @RequestMapping("/login")
    public String login() {

        return "home";
    }

    @RequestMapping("/loginPage")
    public String loginPage() {

        return "login1";
    }

    @RequestMapping("/index")
    public String index() {

        return "index";
    }



    @RequestMapping("/validate")
    @ResponseBody
    public String validate() {
        return "sd9W";
    }
}
