package cn.peter.service.impl;

import cn.peter.mapper.UserInfMapper;
import cn.peter.pojo.UserInf;
import cn.peter.service.UserInfService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component("userInfService")
public class UserInfServiceImpl implements UserInfService {

    @Resource(name = "userInfMapper")
    private UserInfMapper userInfMapper;



    @Override
    public String getCountByLoginname(String loginname) {
        return userInfMapper.getCountByLoginname(loginname);
    }




}
