package com.knxhd.cms.service.ath;

import com.knxhd.cms.dto.ath.AthUserDto;
import com.knxhd.cms.entity.ath.AthUser;

import java.util.List;

/**
 * @description
 * @author: tianluhua
 * @date 2020/1/21 09:29
 */
public interface AthUserService {

    List<AthUserDto> findByUser(String userName, String userId,String loginName);
}
