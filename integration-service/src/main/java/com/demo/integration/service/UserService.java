package com.demo.integration.service;

import com.demo.integration.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;


/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhangxin
 * @since 2018-10-17
 */
public interface UserService extends IService<User> {

    User selectOne();

}
