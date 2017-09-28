package cn.zpro.app.service;

import cn.zpro.app.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CmsService {

    @Autowired
    private UserMapper userMapper;

    public void test1(){
        userMapper.selectListBySQL();
    }
}
