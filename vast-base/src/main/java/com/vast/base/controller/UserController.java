package com.vast.base.controller;

import com.vast.base.core.result.MyResponse;
import com.vast.base.entity.BaseUsers;
import com.vast.base.service.IBaseUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ====================================================
 * @ProjectName: vast-inbk
 * @Package: com.vast.base.controller
 * @ClassName: UserController
 * @Author: Administrator
 * @Description: UserController 用户相关的控制类
 * @Date: 2021/1/4 11:44
 * ====================================================
 * @Version: 1.0    创建
 * ====================================================
 */
@Controller
@RequestMapping("/vast/user")
public class UserController {

    @Autowired
    private IBaseUserService baseUserService;

    @RequestMapping("/allList")
    @ResponseBody
    public MyResponse findAll() {
        List<BaseUsers> list = baseUserService.findAll();
        return new MyResponse(0,list,1);
    }

    @RequestMapping("/listPage")
    public String listPage() {
        return "systems/userList";
    }

}
