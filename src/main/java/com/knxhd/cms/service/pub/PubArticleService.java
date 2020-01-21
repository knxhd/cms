package com.knxhd.cms.service.pub;

import com.knxhd.cms.dto.pub.PubArticleDto;

import java.util.List;

/**
 * @description
 * @author: tianluhua
 * @date 2020/1/21 14:16
 */
public interface PubArticleService {

    List<PubArticleDto> find(PubArticleDto pubArticleDto);
}
