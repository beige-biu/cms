package com.wenyu.cms.service.impl;

import com.wenyu.cms.bean.Category;
import com.wenyu.cms.bean.Channel;
import com.wenyu.cms.mapper.ChannelMapper;
import com.wenyu.cms.service.ChannelCategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Author:wenyu
 * 2021/5/7
 */
@Service
public class ChannelCategoryServiceImpl implements ChannelCategoryService {

    @Resource
    private ChannelMapper channelMapper;

    @Override
    public List<Channel> queryAllChannels() {
        return channelMapper.queryAllChanels();
    }

    @Override
    public List<Category> queryCategoryByChannel(int channelId) {
        return null;
    }


}
