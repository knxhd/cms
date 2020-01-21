package com.knxhd.cms.dto.pub;

import com.knxhd.cms.dto.ath.AthUserDto;
import lombok.Data;

import java.util.Date;

/**
 * @ClassName PubArticleDto
 * @description
 * @author: tianluhua
 * @date 2020/1/21 14:13
 */
@Data
public class PubArticleDto {

    private String id;

    /**
     * 标题
     */
    private String title;

    /**
     * 作者
     */
    private AthUserDto author;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 栏目
     */
    private PubFunctionDto pubFunction;

    /**
     * 点赞数
     */
    private Integer likeNum;

    /**
     * 评论数
     */
    private Integer commentNum;

}
