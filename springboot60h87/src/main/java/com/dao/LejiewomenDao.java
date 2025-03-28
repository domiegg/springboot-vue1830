package com.dao;

import com.entity.LejiewomenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LejiewomenVO;
import com.entity.view.LejiewomenView;


/**
 * 了解我们
 * 
 * @author 
 * @email 
 * @date 2022-04-18 12:00:47
 */
public interface LejiewomenDao extends BaseMapper<LejiewomenEntity> {
	
	List<LejiewomenVO> selectListVO(@Param("ew") Wrapper<LejiewomenEntity> wrapper);
	
	LejiewomenVO selectVO(@Param("ew") Wrapper<LejiewomenEntity> wrapper);
	
	List<LejiewomenView> selectListView(@Param("ew") Wrapper<LejiewomenEntity> wrapper);

	List<LejiewomenView> selectListView(Pagination page,@Param("ew") Wrapper<LejiewomenEntity> wrapper);
	
	LejiewomenView selectView(@Param("ew") Wrapper<LejiewomenEntity> wrapper);
	

}
