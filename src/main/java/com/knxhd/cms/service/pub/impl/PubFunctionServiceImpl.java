package com.knxhd.cms.service.pub.impl;

import com.knxhd.cms.entity.pub.PubFunction;
import com.knxhd.cms.mapper.pub.PubFunctionMapper;
import com.knxhd.cms.service.pub.PubFunctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName AthFunctionServiceImpl
 * @description
 * @author: tianluhua
 * @date 2020/1/10 12:52
 */
@Service("athFunction")
public class PubFunctionServiceImpl implements PubFunctionService {

    @Autowired
    private PubFunctionMapper pubFunctionMapper;

    @Override
    public List<PubFunction> find(){
        return pubFunctionMapper.find();
    }

}
