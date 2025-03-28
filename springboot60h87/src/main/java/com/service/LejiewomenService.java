package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LejiewomenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LejiewomenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LejiewomenView;


/**
 * 了解我们
 *
 * @author 
 * @email 
 * @date 2022-04-18 12:00:47
 */
public interface LejiewomenService extends IService<LejiewomenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LejiewomenVO> selectListVO(Wrapper<LejiewomenEntity> wrapper);
   	
   	LejiewomenVO selectVO(@Param("ew") Wrapper<LejiewomenEntity> wrapper);
   	
   	List<LejiewomenView> selectListView(Wrapper<LejiewomenEntity> wrapper);
   	
   	LejiewomenView selectView(@Param("ew") Wrapper<LejiewomenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LejiewomenEntity> wrapper);
   	

}

