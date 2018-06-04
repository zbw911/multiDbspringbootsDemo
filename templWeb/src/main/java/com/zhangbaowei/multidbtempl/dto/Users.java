package com.zhangbaowei.multidbtempl.dto;

import java.io.Serializable;

/**
 * @author
 */
public class Users implements Serializable {
    private Integer userId;

    private String nickName;

    private String avatar;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}