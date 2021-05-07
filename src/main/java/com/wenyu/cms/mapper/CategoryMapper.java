package com.wenyu.cms.mapper;

import com.wenyu.cms.bean.Category;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Author:wenyu
 * 2021/5/7
 */
public interface CategoryMapper {

    List<Category> queryCategoryByChannel(@Param("channel_id") int channelId);
}
