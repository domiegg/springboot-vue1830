package com.dao;

import com.entity.DiscussxuanchuanxinwenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussxuanchuanxinwenVO;
import com.entity.view.DiscussxuanchuanxinwenView;


/**
 * 宣传新闻评论表
 * 
 * @author 
 * @email 
 * @date 2022-04-18 12:00:47
 */
public interface DiscussxuanchuanxinwenDao extends BaseMapper<DiscussxuanchuanxinwenEntity> {
	
	List<DiscussxuanchuanxinwenVO> selectListVO(@Param("ew") Wrapper<DiscussxuanchuanxinwenEntity> wrapper);
	
	DiscussxuanchuanxinwenVO selectVO(@Param("ew") Wrapper<DiscussxuanchuanxinwenEntity> wrapper);
	
	List<DiscussxuanchuanxinwenView> selectListView(@Param("ew") Wrapper<DiscussxuanchuanxinwenEntity> wrapper);

	List<DiscussxuanchuanxinwenView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussxuanchuanxinwenEntity> wrapper);
	
	DiscussxuanchuanxinwenView selectView(@Param("ew") Wrapper<DiscussxuanchuanxinwenEntity> wrapper);
	

}
