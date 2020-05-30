package com.shaw.movierecommend.service.impl;

import com.shaw.movierecommend.mapper.UserFavoriteMapper;
import com.shaw.movierecommend.model.UserFavorite;
import com.shaw.movierecommend.service.UserFavoriteService;
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
public class UserFavoriteServiceImpl extends ServiceImpl<UserFavoriteMapper, UserFavorite> implements UserFavoriteService {

}
