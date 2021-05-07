package com.wenyu.cms.service;

import com.wenyu.cms.bean.Category;
import com.wenyu.cms.bean.Channel;

import java.util.List;

/**
 * Author:wenyu
 * 2021/5/7
 */
public interface ChannelCategoryService {

    //查询所有频道
    List<Channel> queryAllChannels();

    //查询频道下对应的种类
    List<Category> queryCategoryByChannel(int channelId);
}
