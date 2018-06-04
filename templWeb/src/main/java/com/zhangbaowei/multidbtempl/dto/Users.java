package com.zhangbaowei.multidbtempl.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class Users implements Serializable {
    private Integer userId;

    private String nickName;

    private String avatar;

    private String introduction;

    private String mobile;

    private String email;

    private Date joinTime;

    private Date lastUpdateTime;

    private Date createTime;

    private Boolean isAlonePlay;

    private Short status;

    private String statusDes;

    private String vcrId;

    private Boolean allowBigFile;

    private Byte isFromBlog;

    private Boolean isShielded;

    private String wechatID;

    private Integer weekInfluence;

    private String coverImage;

    private Short infoLevel;

    private Boolean enabled;

    private String auditor;

    private Integer infoRecommendLevel;

    private Date infoRecommendLevelTime;

    private String relationName;

    private Integer userLevel;

    private Integer creditScore;

    private Integer keepLevelCount;

    private Integer recommendType;

    private Date recommendTime;

    private Boolean isAutoWrite;

    private String VType;

    private String VDescription;

    private String VRemark;

    private static final long serialVersionUID = 1L;

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

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getJoinTime() {
        return joinTime;
    }

    public void setJoinTime(Date joinTime) {
        this.joinTime = joinTime;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Boolean getIsAlonePlay() {
        return isAlonePlay;
    }

    public void setIsAlonePlay(Boolean isAlonePlay) {
        this.isAlonePlay = isAlonePlay;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public String getStatusDes() {
        return statusDes;
    }

    public void setStatusDes(String statusDes) {
        this.statusDes = statusDes;
    }

    public String getVcrId() {
        return vcrId;
    }

    public void setVcrId(String vcrId) {
        this.vcrId = vcrId;
    }

    public Boolean getAllowBigFile() {
        return allowBigFile;
    }

    public void setAllowBigFile(Boolean allowBigFile) {
        this.allowBigFile = allowBigFile;
    }

    public Byte getIsFromBlog() {
        return isFromBlog;
    }

    public void setIsFromBlog(Byte isFromBlog) {
        this.isFromBlog = isFromBlog;
    }

    public Boolean getIsShielded() {
        return isShielded;
    }

    public void setIsShielded(Boolean isShielded) {
        this.isShielded = isShielded;
    }

    public String getWechatID() {
        return wechatID;
    }

    public void setWechatID(String wechatID) {
        this.wechatID = wechatID;
    }

    public Integer getWeekInfluence() {
        return weekInfluence;
    }

    public void setWeekInfluence(Integer weekInfluence) {
        this.weekInfluence = weekInfluence;
    }

    public String getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }

    public Short getInfoLevel() {
        return infoLevel;
    }

    public void setInfoLevel(Short infoLevel) {
        this.infoLevel = infoLevel;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor;
    }

    public Integer getInfoRecommendLevel() {
        return infoRecommendLevel;
    }

    public void setInfoRecommendLevel(Integer infoRecommendLevel) {
        this.infoRecommendLevel = infoRecommendLevel;
    }

    public Date getInfoRecommendLevelTime() {
        return infoRecommendLevelTime;
    }

    public void setInfoRecommendLevelTime(Date infoRecommendLevelTime) {
        this.infoRecommendLevelTime = infoRecommendLevelTime;
    }

    public String getRelationName() {
        return relationName;
    }

    public void setRelationName(String relationName) {
        this.relationName = relationName;
    }

    public Integer getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(Integer userLevel) {
        this.userLevel = userLevel;
    }

    public Integer getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(Integer creditScore) {
        this.creditScore = creditScore;
    }

    public Integer getKeepLevelCount() {
        return keepLevelCount;
    }

    public void setKeepLevelCount(Integer keepLevelCount) {
        this.keepLevelCount = keepLevelCount;
    }

    public Integer getRecommendType() {
        return recommendType;
    }

    public void setRecommendType(Integer recommendType) {
        this.recommendType = recommendType;
    }

    public Date getRecommendTime() {
        return recommendTime;
    }

    public void setRecommendTime(Date recommendTime) {
        this.recommendTime = recommendTime;
    }

    public Boolean getIsAutoWrite() {
        return isAutoWrite;
    }

    public void setIsAutoWrite(Boolean isAutoWrite) {
        this.isAutoWrite = isAutoWrite;
    }

    public String getVType() {
        return VType;
    }

    public void setVType(String VType) {
        this.VType = VType;
    }

    public String getVDescription() {
        return VDescription;
    }

    public void setVDescription(String VDescription) {
        this.VDescription = VDescription;
    }

    public String getVRemark() {
        return VRemark;
    }

    public void setVRemark(String VRemark) {
        this.VRemark = VRemark;
    }
}