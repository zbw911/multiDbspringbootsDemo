package com.zhangbaowei.multidbtempl.mapper;

import com.zhangbaowei.multidbtempl.db.DS;
import com.zhangbaowei.multidbtempl.dto.Member;
import com.zhangbaowei.multidbtempl.dto.Vinfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
@DS("db-v")
public interface AutoVideoMapper {
    String sql = "SELECT   [UserId]\n" +
            "      ,[NickName]\n" +
            "      ,[Avatar]\n" +

            "  FROM [Users]  where UserId = #{id}";


    @Select("SELECT TOP (#{top}) [id]\n" +
            "      ,[cateid]\n" +
            "      ,[manuid]\n" +
            "      ,[brandid]\n" +
            "      ,[specid]\n" +

            "  FROM [VideoInfo] order by id desc")
    List<Vinfo> selectTop(int top);


    @Select(sql)
    @DS
    Member findMemberById(long id);
}
