package com.zhangbaowei.multidbtempl.mapper;

import com.zhangbaowei.multidbtempl.dao.VideoInfo;
import com.zhangbaowei.multidbtempl.db.DS;
import com.zhangbaowei.multidbtempl.dto.Member;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
@DS("db-v")
public interface AutoVideoMapper {
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


    @Select("SELECT TOP (#{top}) [id]\n" +
            "      ,[cateid]\n" +
            "      ,[manuid]\n" +
            "      ,[brandid]\n" +
            "      ,[specid]\n" +
            "      ,[stitle]\n" +
            "      ,[title]\n" +
            "      ,[description]\n" +
            "      ,[userid]\n" +
            "      ,[nickname]\n" +
            "      ,[video_type]\n" +
            "      ,[pic_url]\n" +
            "      ,[input_time]\n" +
            "      ,[edit_time]\n" +
            "      ,[play_times]\n" +
            "      ,[week_play_times]\n" +
            "      ,[comment_num]\n" +
            "      ,[last_comment_time]\n" +
            "      ,[relate_des]\n" +
            "      ,[ip]\n" +
            "      ,[video_status]\n" +
            "      ,[video_file_path]\n" +
            "      ,[youku_videoid]\n" +
            "      ,[duration]\n" +
            "      ,[is_download]\n" +
            "      ,[verify]\n" +
            "      ,[play_time2]\n" +
            "      ,[ordernum]\n" +
            "      ,[star]\n" +
            "      ,[mark]\n" +
            "      ,[Recommend]\n" +
            "      ,[AddDate]\n" +
            "      ,[wwwRecommend]\n" +
            "      ,[bbsRecommend]\n" +
            "      ,[RecommendedPosition]\n" +
            "      ,[publishType]\n" +
            "      ,[topicRecommend]\n" +
            "      ,[pic_url2]\n" +
            "      ,[pic_url3]\n" +
            "      ,[VerifierId]\n" +
            "      ,[Verifier]\n" +
            "      ,[Keywords]\n" +
            "      ,[IsRelationElectricCar]\n" +
            "      ,[updatecount_time]\n" +
            "      ,[video_id]\n" +
            "      ,[pic_url4]\n" +
            "      ,[NeedAudit]\n" +
            "      ,[AuthorId]\n" +
            "      ,[AuditUserId]\n" +
            "      ,[AuditReason]\n" +
            "      ,[AuditRecommend]\n" +
            "      ,[AuditTime]\n" +
            "      ,[EditorRecommend]\n" +
            "      ,[Definition]\n" +
            "      ,[MobileDefinition]\n" +
            "      ,[CoverIndex]\n" +
            "      ,[PlayCount]\n" +
            "      ,[UpdateInfo]\n" +
            "      ,[Source]\n" +
            "      ,[IsVr]\n" +
            "      ,[HistoryVideoId]\n" +
            "      ,[SiteSource]\n" +
            "      ,[pic_url3_original]\n" +
            "      ,[apptitle]\n" +
            "      ,[AutoCollect]\n" +
            "      ,[jb_pic_url]\n" +
            "      ,[disableComment]\n" +
            "      ,[PvUpdateTime]\n" +
            "      ,[isContentMarketing]\n" +
            "      ,[nlp_keywords_choose]\n" +
            "      ,[nlp_tags_choose]\n" +
            "      ,[chezhanId]\n" +
            "  FROM [AutoVideo].[dbo].[VideoInfo] order by id desc")
    List<VideoInfo> selectTop(int top);


    @Select(sql)
    @DS
    Member findMemberById(long id);
}
