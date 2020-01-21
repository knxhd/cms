package com.knxhd.cms.service.pub.impl;

import com.knxhd.cms.dto.pub.PubArticleDto;
import com.knxhd.cms.mapper.pub.PubArticleMapper;
import com.knxhd.cms.service.pub.PubArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName PubArticleServiceImpl
 * @description
 * @author: tianluhua
 * @date 2020/1/21 14:16
 */
@Service
public class PubArticleServiceImpl implements PubArticleService {

    @Autowired
    private PubArticleMapper pubArticleMapper;

    @Override
    public List<PubArticleDto> find(PubArticleDto pubArticleDto) {
        return pubArticleMapper.find(pubArticleDto);
    }
}
