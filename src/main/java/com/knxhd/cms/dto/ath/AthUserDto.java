package com.knxhd.cms.dto.ath;

import lombok.Data;

/**
 * @ClassName AthUserDto
 * @description
 * @author: tianluhua
 * @date 2020/1/21 09:45
 */
@Data
public class AthUserDto {


    private String userId;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 登录名
     */
    private String loginName;

    /**
     * 登录密码
     */
    private String password;

    /**
     * 头像
     */
    private String headportrait;

    /**
     * 手机号
     */
    private String tel;

    /**
     * 关联qq
     */
    private String qq;

}
