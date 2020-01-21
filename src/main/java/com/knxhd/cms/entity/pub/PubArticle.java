package com.knxhd.cms.entity.pub;

import java.io.Serializable;
import java.util.Date;

import com.knxhd.cms.dto.ath.AthUserDto;
import com.knxhd.cms.entity.ath.AthUser;
import lombok.Data;

/**
 * cms_pub_article
 * @author 
 */
@Data
public class PubArticle implements Serializable {
    private String id;

    /**
     * 标题
     */
    private String title;

    /**
     * 作者
     */
    private AthUser author;

    /**
     * 创建时间
     */
    private Date createtime;

    /**
     * 栏目ID
     */
    private String functionId;

    /**
     * 点赞数
     */
    private Integer likenum;

    /**
     * 评论数
     */
    private Integer commentnum;

    private static final long serialVersionUID = 1L;
}