package cn.zpro.app.service;

import cn.zpro.app.dao.UserMapper;
import cn.zpro.app.entity.EcmsFlash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CmsService {

    @Autowired
    private UserMapper userMapper;

    public List<EcmsFlash> findList(){
        return userMapper.selectListBySQL();
    }

    public List<EcmsFlash> findAllTitle(){
        return userMapper.findAlltitle();
    }

    public EcmsFlash getFlashByTitle(String title){
        return userMapper.getFlashByTitle(title);
    }


}
