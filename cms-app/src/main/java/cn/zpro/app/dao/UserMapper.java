package cn.zpro.app.dao;

import org.apache.ibatis.annotations.Select;

/**
 * User 表数据库控制层接口
 */
public interface UserMapper extends SuperMapper<User> {

    /**
     * 自定义注入方法
     */
    int deleteAll();

    @Select("select test_id as id, name, age, test_type from www_92game_net_ecms_flash")
    List<User> selectListBySQL();

}