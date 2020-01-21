package com.knxhd.cms.entity.ath;

import java.io.Serializable;
import lombok.Data;

/**
 * cms_ath_user
 * @author 
 */
@Data
public class AthUser implements Serializable {

    private static final long serialVersionUID = 1L;

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