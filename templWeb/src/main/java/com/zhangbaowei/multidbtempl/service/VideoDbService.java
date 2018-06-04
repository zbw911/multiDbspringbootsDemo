package com.zhangbaowei.multidbtempl.service;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.zhangbaowei.multidbtempl.dto.Vinfo;

import java.util.List;

public interface VideoDbService {

    List<Vinfo> GetTopVideo(int top);

    void GetAll() throws JsonProcessingException;
}
