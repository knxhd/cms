package com.knxhd.cms.controller.pub;

import com.knxhd.cms.common.Contants;
import com.knxhd.cms.common.InvokeResult;
import com.knxhd.cms.entity.pub.PubFunction;
import com.knxhd.cms.service.pub.PubFunctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ClassName FunctionController
 * @description
 * @author: tianluhua
 * @date 2020/1/10 12:48
 */
@Controller
@RequestMapping("/pubFunction")
public class PubFunctionController {

    @Autowired
    private PubFunctionService athFunctionService;

    @RequestMapping(value = "/find",method = RequestMethod.GET)
    @ResponseBody
    public InvokeResult<List<PubFunction>> find(){
        InvokeResult<List<PubFunction>> invokeResult = new InvokeResult<>();
        invokeResult.setData(athFunctionService.find());
        invokeResult.setStatus(Contants.Result.SUCCESS.getStatus());
        invokeResult.setMessage(Contants.Result.SUCCESS.getMessage());
        return invokeResult;
    }

}
