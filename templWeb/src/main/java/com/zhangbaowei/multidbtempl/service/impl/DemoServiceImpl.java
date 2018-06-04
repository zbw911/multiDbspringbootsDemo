package com.zhangbaowei.multidbtempl.service.impl;

import com.zhangbaowei.multidbtempl.dto.Member;
import com.zhangbaowei.multidbtempl.dto.Vinfo;
import com.zhangbaowei.multidbtempl.mapper.AutoVideoMapper;
import com.zhangbaowei.multidbtempl.mapper.MemberMapper;
import com.zhangbaowei.multidbtempl.service.DemoService;
import com.zhangbaowei.multidbtempl.util.JacksonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoServiceImpl implements DemoService {


    @Autowired
    MemberMapper memberMapper;
    @Autowired
    AutoVideoMapper autoVideoMapper;

    public Member GetUser(long id) {
        return memberMapper.findMemberById(id);
    }


    public String GetUser1(long id) {
        Object o = memberMapper.findMemberById2(id);
        String s = JacksonUtil.writeValueAsString(o);
        return s;
    }

    @Override
    public String GetUser3(long id) {
        Object o = memberMapper.findMemberById3(id);
        String s = JacksonUtil.writeValueAsString(o);
        return s;
    }

    @Override
    public List<Vinfo> GetTopVideo(int top) {

        return autoVideoMapper.selectTop(top);

    }

}
