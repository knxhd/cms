package com.knxhd.cms.entity.pub;

import lombok.Data;

import java.util.List;

/**
 * @ClassName PubFunction
 * @description
 * @author: tianluhua
 * @date 2020/1/13 10:37
 */
@Data
public class PubFunction {

   public String functionId;

   public String functionName;

   public String functionUrl;

   public String description;

   public List<PubFunction> children;

}
