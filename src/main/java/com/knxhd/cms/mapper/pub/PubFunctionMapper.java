package com.knxhd.cms.mapper.pub;

import com.knxhd.cms.dto.pub.PubFunctionDto;
import com.knxhd.cms.entity.pub.PubFunction;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @description
 * @author: tianluhua
 * @date 2020/1/10 12:55
 */
@Mapper
public interface PubFunctionMapper {

    List<PubFunction> find();

    List<PubFunction> findByParentId(String functionId);

    PubFunctionDto findById(String functionId);

}
