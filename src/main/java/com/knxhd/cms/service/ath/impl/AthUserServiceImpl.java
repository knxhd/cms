package com.knxhd.cms.service.ath.impl;

import com.knxhd.cms.dto.ath.AthUserDto;
import com.knxhd.cms.entity.ath.AthUser;
import com.knxhd.cms.mapper.ath.AthUserMapper;
import com.knxhd.cms.service.ath.AthUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName AthUserServiceImpl
 * @description
 * @author: tianluhua
 * @date 2020/1/21 09:29
 */
@Service(value = "athUserService")
public class AthUserServiceImpl implements AthUserService {

    @Autowired
    private AthUserMapper athUserMapper;

    @Override
    public List<AthUserDto> findByUser(String userName, String userId,String loginName) {
        return athUserMapper.findByUser(userName,userId,loginName);
    }
}
