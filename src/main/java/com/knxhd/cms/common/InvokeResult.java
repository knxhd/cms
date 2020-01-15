package com.knxhd.cms.common;

import lombok.Data;

import java.util.List;

/**
 * @ClassName InvokeResult
 * @description
 * @author: tianluhua
 * @date 2020/1/13 12:19
 */
@Data
public class InvokeResult<T> {

    private T data;

    private  String message;

    private String status;


}
