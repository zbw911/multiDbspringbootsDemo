package com.zhangbaowei.multidbtempl.mapper;

import com.zhangbaowei.multidbtempl.dto.Member;
import com.zhangbaowei.multidbtempl.dto.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MemberMapper {

    String sql = "SELECT   [UserId]\n" +
            "      ,[NickName]\n" +
            "      ,[Avatar]\n" +
            "      ,[Introduction]\n" +
            "      ,[Mobile]\n" +
            "      ,[Email]\n" +
            "      ,[JoinTime]\n" +
            "      ,[LastUpdateTime]\n" +
            "      ,[CreateTime]\n" +
            "      ,[IsAlonePlay]\n" +
            "      ,[Status]\n" +
            "      ,[StatusDes]\n" +
            "      ,[VcrId]\n" +
            "      ,[AllowBigFile]\n" +
            "      ,[IsFromBlog]\n" +
            "      ,[IsShielded]\n" +
            "      ,[WechatID]\n" +
            "      ,[WeekInfluence]\n" +
            "      ,[CoverImage]\n" +
            "      ,[InfoLevel]\n" +
            "      ,[Enabled]\n" +
            "      ,[Auditor]\n" +
            "      ,[InfoRecommendLevel]\n" +
            "      ,[InfoRecommendLevelTime]\n" +
            "      ,[RelationName]\n" +
            "      ,[UserLevel]\n" +
            "      ,[CreditScore]\n" +
            "      ,[KeepLevelCount]\n" +
            "      ,[RecommendType]\n" +
            "      ,[RecommendTime]\n" +
            "      ,[IsAutoWrite]\n" +
            "      ,[VType]\n" +
            "      ,[VDescription]\n" +
            "      ,[VRemark]\n" +
            "  FROM [chejiahao].[dbo].[Users]  where UserId = #{id}";
    @Select(sql)
    Member findMemberById(long id);

    @Select(sql)
    Users findMemberById2(long id);

    @Select(sql)
    Object findMemberById3(long id);
}