package cn.zpro.app.dao;

import cn.zpro.app.dto.OpenTables;
import cn.zpro.app.entity.EcmsFlash;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * User 表数据库控制层接口
 */
public interface UserMapper {

    @Select("select b.create_time as openTime,b.title,b.type,b.area,a.titlepic as titlePic,a.titleurl as titleUrl from www_92game_net_ecms_flash a , zhanggl_kaifu b\n" +
            "where a.title = b.title and to_days(b.create_time) = to_days(now())")
    List<OpenTables> getTodayList();

    @Select("select b.create_time as openTime,b.title,b.type,b.area,a.titlepic as titlePic,a.titleurl as titleUrl from www_92game_net_ecms_flash a , zhanggl_kaifu b\n" +
            "where a.title = b.title and to_days(b.create_time) > to_days(now())")
    List<OpenTables> getComingList();


    @Select("select b.create_time as openTime,b.title,b.type,b.area,a.titlepic as titlePic,a.titleurl as titleUrl from www_92game_net_ecms_flash a , zhanggl_kaifu b\n" +
            "where a.title = b.title and a.title = #{title} and to_days(b.create_time) = to_days(now())")
    List<OpenTables> getTodayListByTitle(String title);

    @Select("select b.create_time as openTime,b.title,b.type,b.area,a.titlepic as titlePic,a.titleurl as titleUrl from www_92game_net_ecms_flash a , zhanggl_kaifu b\n" +
            "where a.title = b.title and a.title = #{title} and to_days(b.create_time) > to_days(now())")
    List<OpenTables> getComingListByTitle(String title);

    @Select("select * from www_92game_net_ecms_flash where id = #{id}")
    EcmsFlash findById(String id);
}