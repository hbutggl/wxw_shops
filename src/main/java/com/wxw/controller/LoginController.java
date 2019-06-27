package com.wxw.controller;

import com.wxw.util.Result;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author HXB
 * @date 2019/6/27
 */
@Controller
public class LoginController {

    @RequestMapping("/login")
    @ResponseBody
    public Result login(String userName, String passWord, String validCode) {

        if(StringUtils.isEmpty(userName) || StringUtils.isEmpty(passWord) || StringUtils.isEmpty(validCode)) {
            return new Result(Result.ERROR_VALID_EMPTY, Result.ERROR_VALID_EMPTY_MESSAGE);
        }

        return new Result();
    }

}
