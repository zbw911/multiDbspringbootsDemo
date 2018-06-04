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
            "  FROM  [Users]  where UserId = #{id}";
    @Select(sql)
    Member findMemberById(long id);

    @Select(sql)
    Users findMemberById2(long id);

    @Select(sql)
    Object findMemberById3(long id);
}