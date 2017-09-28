package cn.zpro.app.dao;

import cn.zpro.app.entity.EcmsFlash;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * User 表数据库控制层接口
 */
public interface UserMapper extends BaseMapper<EcmsFlash> {

    @Select("select * from www_92game_net_ecms_flash")
    List<EcmsFlash> selectListBySQL();

}