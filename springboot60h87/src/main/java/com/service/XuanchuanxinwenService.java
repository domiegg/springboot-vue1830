package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XuanchuanxinwenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XuanchuanxinwenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XuanchuanxinwenView;


/**
 * 宣传新闻
 *
 * @author 
 * @email 
 * @date 2022-04-18 12:00:46
 */
public interface XuanchuanxinwenService extends IService<XuanchuanxinwenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XuanchuanxinwenVO> selectListVO(Wrapper<XuanchuanxinwenEntity> wrapper);
   	
   	XuanchuanxinwenVO selectVO(@Param("ew") Wrapper<XuanchuanxinwenEntity> wrapper);
   	
   	List<XuanchuanxinwenView> selectListView(Wrapper<XuanchuanxinwenEntity> wrapper);
   	
   	XuanchuanxinwenView selectView(@Param("ew") Wrapper<XuanchuanxinwenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XuanchuanxinwenEntity> wrapper);
   	

}

