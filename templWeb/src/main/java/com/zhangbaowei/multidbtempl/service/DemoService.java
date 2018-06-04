package com.zhangbaowei.multidbtempl.service;

import com.zhangbaowei.multidbtempl.dao.VideoInfo;
import com.zhangbaowei.multidbtempl.dto.Member;

import java.util.List;

public interface DemoService {
    Member GetUser(long id);

    String GetUser1(long id);

    String GetUser3(long id);


    List<VideoInfo>  GetTopVideo(int top);
}
