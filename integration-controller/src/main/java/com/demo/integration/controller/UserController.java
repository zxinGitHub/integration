package com.demo.integration.controller;


import com.demo.integration.domain.User;
import com.demo.integration.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;


/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zhangxin
 * @since 2018-10-17
 */
@RestController
@RequestMapping("/user")
public class UserController {

    public static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/test")
    public String test() {
        logger.info("test");
        User user = userService.selectOne();
        return user.toString();
    }

}

