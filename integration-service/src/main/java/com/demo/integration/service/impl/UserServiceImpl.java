package com.demo.integration.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.demo.integration.domain.User;
import com.demo.integration.mapper.UserMapper;
import com.demo.integration.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;


/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhangxin
 * @since 2018-10-17
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectOne() {
        QueryWrapper wrapper = new QueryWrapper<>();
        wrapper.like("name", "wang");
        List<User> users = userMapper.selectList(wrapper);
        if (!CollectionUtils.isEmpty(users)) {
            return users.get(0);
        }
        return null;
    }
}
