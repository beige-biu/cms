package com.wenyu.cms.cache;

import com.wenyu.cms.bean.Category;
import com.wenyu.cms.bean.Channel;
import com.wenyu.cms.service.ChannelCategoryService;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.servlet.ServletContext;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Author:wenyu
 * 2021/5/7
 */
@Component
public class Cache {

    @Resource
    private ChannelCategoryService channelCategoryService;

    @Resource
    public ServletContext servletContext;

    @PostConstruct
    public void init(){
        //获取所有频道
        List<Channel> channels = channelCategoryService.queryAllChannels();
        //获取所有频道下的子类
        Map<Channel,List<Category>> channels_categories = new HashMap<>();
        for (Channel channel:channels ){
            List<Category> categories = channelCategoryService.queryCategoryByChannel(channel.getId());
            if(categories.size()>0){
                channels_categories.put(channel, categories);
            }
        }
        //将频道和种类放入到servletContext中
        servletContext.setAttribute("channels_categories",channels_categories);

    }

}
