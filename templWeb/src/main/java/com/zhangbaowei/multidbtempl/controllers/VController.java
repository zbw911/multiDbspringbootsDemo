package com.zhangbaowei.multidbtempl.controllers;


import com.zhangbaowei.multidbtempl.dto.Vinfo;
import com.zhangbaowei.multidbtempl.service.VideoDbService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/v")
public class VController {

    // 初始化日志记录对象
    private static Logger logger = LoggerFactory.getLogger(VController.class);
    @Autowired
    private VideoDbService usersService;


    @RequestMapping(value = "/v", method = RequestMethod.GET)
    public List<Vinfo> getUserinfo3(int top) {
        return usersService.GetTopVideo(top);
    }


    @RequestMapping(value = "/x", method = RequestMethod.GET)
    public String getUserinfo3() throws JsonProcessingException {
        usersService.GetAll();

        return "OK";
    }


}