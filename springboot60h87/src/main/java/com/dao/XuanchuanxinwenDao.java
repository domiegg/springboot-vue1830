package com.dao;

import com.entity.XuanchuanxinwenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XuanchuanxinwenVO;
import com.entity.view.XuanchuanxinwenView;


/**
 * 宣传新闻
 * 
 * @author 
 * @email 
 * @date 2022-04-18 12:00:46
 */
public interface XuanchuanxinwenDao extends BaseMapper<XuanchuanxinwenEntity> {
	
	List<XuanchuanxinwenVO> selectListVO(@Param("ew") Wrapper<XuanchuanxinwenEntity> wrapper);
	
	XuanchuanxinwenVO selectVO(@Param("ew") Wrapper<XuanchuanxinwenEntity> wrapper);
	
	List<XuanchuanxinwenView> selectListView(@Param("ew") Wrapper<XuanchuanxinwenEntity> wrapper);

	List<XuanchuanxinwenView> selectListView(Pagination page,@Param("ew") Wrapper<XuanchuanxinwenEntity> wrapper);
	
	XuanchuanxinwenView selectView(@Param("ew") Wrapper<XuanchuanxinwenEntity> wrapper);
	

}
