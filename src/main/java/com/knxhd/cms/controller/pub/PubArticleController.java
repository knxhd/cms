package com.knxhd.cms.controller.pub;

import com.knxhd.cms.dto.pub.PubArticleDto;
import com.knxhd.cms.service.pub.PubArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ClassName PubArticleController
 * @description
 * @author: tianluhua
 * @date 2020/1/21 14:11
 */
@Controller
@RequestMapping(value = "pubArticle")
public class PubArticleController {

    @Autowired
    private PubArticleService pubArticleService;

    @RequestMapping(value = "find",method = RequestMethod.GET)
    @ResponseBody
    public List<PubArticleDto> find(PubArticleDto pubArticleDto) {
        return pubArticleService.find(pubArticleDto);
    }


}
