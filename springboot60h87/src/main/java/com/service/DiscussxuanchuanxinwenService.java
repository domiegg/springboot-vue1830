package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussxuanchuanxinwenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussxuanchuanxinwenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussxuanchuanxinwenView;


/**
 * 宣传新闻评论表
 *
 * @author 
 * @email 
 * @date 2022-04-18 12:00:47
 */
public interface DiscussxuanchuanxinwenService extends IService<DiscussxuanchuanxinwenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussxuanchuanxinwenVO> selectListVO(Wrapper<DiscussxuanchuanxinwenEntity> wrapper);
   	
   	DiscussxuanchuanxinwenVO selectVO(@Param("ew") Wrapper<DiscussxuanchuanxinwenEntity> wrapper);
   	
   	List<DiscussxuanchuanxinwenView> selectListView(Wrapper<DiscussxuanchuanxinwenEntity> wrapper);
   	
   	DiscussxuanchuanxinwenView selectView(@Param("ew") Wrapper<DiscussxuanchuanxinwenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussxuanchuanxinwenEntity> wrapper);
   	

}

