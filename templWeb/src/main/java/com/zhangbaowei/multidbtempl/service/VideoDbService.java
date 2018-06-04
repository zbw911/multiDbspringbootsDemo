package com.zhangbaowei.multidbtempl.service;

import com.zhangbaowei.multidbtempl.dao.VideoInfo;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.List;

public interface VideoDbService {

    List<VideoInfo> GetTopVideo(int top);

    void GetAll() throws JsonProcessingException;
}
