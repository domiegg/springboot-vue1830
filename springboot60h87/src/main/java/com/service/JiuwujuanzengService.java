package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiuwujuanzengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiuwujuanzengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiuwujuanzengView;


/**
 * 旧物捐赠
 *
 * @author 
 * @email 
 * @date 2022-04-18 12:00:47
 */
public interface JiuwujuanzengService extends IService<JiuwujuanzengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiuwujuanzengVO> selectListVO(Wrapper<JiuwujuanzengEntity> wrapper);
   	
   	JiuwujuanzengVO selectVO(@Param("ew") Wrapper<JiuwujuanzengEntity> wrapper);
   	
   	List<JiuwujuanzengView> selectListView(Wrapper<JiuwujuanzengEntity> wrapper);
   	
   	JiuwujuanzengView selectView(@Param("ew") Wrapper<JiuwujuanzengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiuwujuanzengEntity> wrapper);
   	

}

