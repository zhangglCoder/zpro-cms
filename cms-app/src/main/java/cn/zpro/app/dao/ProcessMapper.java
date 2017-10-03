package cn.zpro.app.dao;

import cn.zpro.app.entity.EcmsFlash;
import cn.zpro.app.entity.Kaifu;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;

import java.util.Date;
import java.util.List;

/**
 * User 表数据库控制层接口
 */
public interface ProcessMapper {

    @Select("select id,title,titlepic from www_92game_net_ecms_flash where title=#{title}")
    EcmsFlash getFlashByTitle(String title);

    @Insert("INSERT into zhanggl_kaifu (title,type,area,create_time) VALUES (#{title},#{type},#{area},#{createTime})")
    Long insert(Kaifu kaifu);
}