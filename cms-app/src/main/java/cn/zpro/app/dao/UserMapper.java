package cn.zpro.app.dao;

import cn.zpro.app.entity.EcmsFlash;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * User 表数据库控制层接口
 */
public interface UserMapper {

    @Select("select * from www_92game_net_ecms_flash limit 1,10")
    List<EcmsFlash> selectListBySQL();

}