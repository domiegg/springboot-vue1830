package com.dao;

import com.entity.JiuwujuanzengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiuwujuanzengVO;
import com.entity.view.JiuwujuanzengView;


/**
 * 旧物捐赠
 * 
 * @author 
 * @email 
 * @date 2022-04-18 12:00:47
 */
public interface JiuwujuanzengDao extends BaseMapper<JiuwujuanzengEntity> {
	
	List<JiuwujuanzengVO> selectListVO(@Param("ew") Wrapper<JiuwujuanzengEntity> wrapper);
	
	JiuwujuanzengVO selectVO(@Param("ew") Wrapper<JiuwujuanzengEntity> wrapper);
	
	List<JiuwujuanzengView> selectListView(@Param("ew") Wrapper<JiuwujuanzengEntity> wrapper);

	List<JiuwujuanzengView> selectListView(Pagination page,@Param("ew") Wrapper<JiuwujuanzengEntity> wrapper);
	
	JiuwujuanzengView selectView(@Param("ew") Wrapper<JiuwujuanzengEntity> wrapper);
	

}
