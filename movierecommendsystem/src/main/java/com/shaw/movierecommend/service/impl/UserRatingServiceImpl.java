package com.shaw.movierecommend.service.impl;

import com.shaw.movierecommend.mapper.UserRatingMapper;
import com.shaw.movierecommend.model.UserRating;
import com.shaw.movierecommend.service.UserRatingService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author shaw
 * @since 2020-05-26
 */
@Service
public class UserRatingServiceImpl extends ServiceImpl<UserRatingMapper, UserRating> implements UserRatingService {

}
