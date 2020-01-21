package com.knxhd.cms.dto.pub;

import com.knxhd.cms.entity.pub.PubFunction;
import lombok.Data;

import java.util.List;

/**
 * @ClassName PubFunctionDto
 * @description
 * @author: tianluhua
 * @date 2020/1/21 15:15
 */
@Data
public class PubFunctionDto {

    public String functionId;

    public String functionName;

    public String functionUrl;

    public String description;

    public List<PubFunctionDto> children;
}
