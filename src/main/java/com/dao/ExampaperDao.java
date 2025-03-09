package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.ExampaperEntity;
import com.entity.view.ExampaperView;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 试卷表 Dao 接口
 *
 * @author 
 */
public interface ExampaperDao extends BaseMapper<ExampaperEntity> {

   List<ExampaperView> selectListView(Pagination page, @Param("params") Map<String, Object> params);

}
