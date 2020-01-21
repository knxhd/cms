package com.knxhd.cms.controller.ath;

import com.knxhd.cms.common.InvokeResult;
import com.knxhd.cms.dto.ath.AthUserDto;
import com.knxhd.cms.service.ath.AthUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ClassName AthUserController
 * @description
 * @author: tianluhua
 * @date 2020/1/21 10:26
 */
@Controller
@RequestMapping(value = "athUser")
public class AthUserController {

    @Autowired
    private AthUserService athUserService;

    @RequestMapping(value = "find", method = RequestMethod.GET)
    @ResponseBody
    public List<AthUserDto> find(String userName, String userId,String loginName) {
        return athUserService.findByUser(userName,userId,loginName);
    }

    @RequestMapping(value = "login", method = RequestMethod.GET)
   @ResponseBody
    public InvokeResult<String> login(String userName, String password) {
        InvokeResult<String> invokeResult = new InvokeResult<>();
        return invokeResult;
    }

}
