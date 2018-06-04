package com.zhangbaowei.multidbtempl.service;

import com.zhangbaowei.multidbtempl.dto.Member;
import com.zhangbaowei.multidbtempl.dto.Vinfo;

import java.util.List;

public interface DemoService {
    Member GetUser(long id);

    String GetUser1(long id);

    String GetUser3(long id);


    List<Vinfo> GetTopVideo(int top);
}
