package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShuxingushiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShuxingushiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShuxingushiView;


/**
 * 书信故事
 *
 * @author 
 * @email 
 * @date 2022-04-18 12:00:47
 */
public interface ShuxingushiService extends IService<ShuxingushiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShuxingushiVO> selectListVO(Wrapper<ShuxingushiEntity> wrapper);
   	
   	ShuxingushiVO selectVO(@Param("ew") Wrapper<ShuxingushiEntity> wrapper);
   	
   	List<ShuxingushiView> selectListView(Wrapper<ShuxingushiEntity> wrapper);
   	
   	ShuxingushiView selectView(@Param("ew") Wrapper<ShuxingushiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShuxingushiEntity> wrapper);
   	

}

