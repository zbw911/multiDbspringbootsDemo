package com.zhangbaowei.multidbtempl.controllers;

import com.zhangbaowei.multidbtempl.dao.VideoInfo;
import com.zhangbaowei.multidbtempl.dto.Member;
import com.zhangbaowei.multidbtempl.service.DemoService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    // 初始化日志记录对象
    private static Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private DemoService usersService;

    @RequestMapping(value = "/userinfo", method = RequestMethod.GET)
    public Member getUserinfo(Long userid, String fields) {
        return usersService.GetUser(userid);
    }

    @RequestMapping(value = "/userinfo2", method = RequestMethod.GET)
    public String getUserinfo2(Long userid) {
        logger.info(usersService.GetUser1(userid));
        return usersService.GetUser1(userid);
    }

    @RequestMapping(value = "/userinfo3", method = RequestMethod.GET)
    public String getUserinfo3(Long userid) {
        return usersService.GetUser3(userid);
    }

    @RequestMapping(value = "/video", method = RequestMethod.GET)
    public List<VideoInfo> getUserinfo3(int top) {
        return usersService.GetTopVideo(top);
    }

}