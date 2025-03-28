package com.dao;

import com.entity.ShuxingushiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShuxingushiVO;
import com.entity.view.ShuxingushiView;


/**
 * 书信故事
 * 
 * @author 
 * @email 
 * @date 2022-04-18 12:00:47
 */
public interface ShuxingushiDao extends BaseMapper<ShuxingushiEntity> {
	
	List<ShuxingushiVO> selectListVO(@Param("ew") Wrapper<ShuxingushiEntity> wrapper);
	
	ShuxingushiVO selectVO(@Param("ew") Wrapper<ShuxingushiEntity> wrapper);
	
	List<ShuxingushiView> selectListView(@Param("ew") Wrapper<ShuxingushiEntity> wrapper);

	List<ShuxingushiView> selectListView(Pagination page,@Param("ew") Wrapper<ShuxingushiEntity> wrapper);
	
	ShuxingushiView selectView(@Param("ew") Wrapper<ShuxingushiEntity> wrapper);
	

}
