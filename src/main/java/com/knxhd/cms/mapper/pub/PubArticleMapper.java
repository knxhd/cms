package com.knxhd.cms.mapper.pub;

import com.knxhd.cms.dto.ath.AthUserDto;
import com.knxhd.cms.dto.pub.PubArticleDto;
import com.knxhd.cms.entity.pub.PubArticle;

import java.util.List;

public interface PubArticleMapper {

    List<PubArticleDto> find(PubArticleDto pubArticleDto);

}