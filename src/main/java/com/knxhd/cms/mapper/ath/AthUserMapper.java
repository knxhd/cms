package com.knxhd.cms.mapper.ath;

import com.knxhd.cms.dto.ath.AthUserDto;
import com.knxhd.cms.entity.ath.AthUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @description
 * @author: tianluhua
 * @date 2020/1/21 09:47
 */
@Mapper
public interface AthUserMapper {

    public List<AthUserDto> findByUser(@Param("userName") String userName, @Param("userId") String userId, @Param("loginName") String loginName) ;

    public AthUserDto findById(@Param("userId") String userId);
}
