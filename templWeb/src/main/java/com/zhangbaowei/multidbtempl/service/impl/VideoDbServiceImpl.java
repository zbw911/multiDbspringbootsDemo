package com.zhangbaowei.multidbtempl.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zhangbaowei.multidbtempl.dto.Users;
import com.zhangbaowei.multidbtempl.dto.Vinfo;
import com.zhangbaowei.multidbtempl.mapper.AutoVideoMapper;
import com.zhangbaowei.multidbtempl.mapper.MemberMapper;
import com.zhangbaowei.multidbtempl.service.VideoDbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class VideoDbServiceImpl implements VideoDbService {
    @Autowired
    AutoVideoMapper autoVideoMapper;

    @Autowired
    MemberMapper memberMapper;

    @Override
    public List<Vinfo> GetTopVideo(int top) {

        return autoVideoMapper.selectTop(top);

    }

    @Override
    public void GetAll() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        List<Vinfo> videoInfos = autoVideoMapper.selectTop(1);

        System.out.println(mapper.writeValueAsString(videoInfos));

        Users memberById2 = memberMapper.findMemberById2(100344);

        System.out.println(mapper.writeValueAsString(memberById2));
    }
}
