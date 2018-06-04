package com.zhangbaowei.multidbtempl.dto;

public class Member {
   private  int   UserId;
   private  String NickName ;

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public String getNickName() {
        return NickName;
    }

    public void setNickName(String nickName) {
        NickName = nickName;
    }
}
