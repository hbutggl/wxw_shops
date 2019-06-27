package com.wxw.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxw.dao.UserInfoMapper;
import com.wxw.entity.UserInfo;
import com.wxw.service.UserInfoService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ${author}
 * @since 2019-05-20
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {


}
