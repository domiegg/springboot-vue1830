package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscussxuanchuanxinwenDao;
import com.entity.DiscussxuanchuanxinwenEntity;
import com.service.DiscussxuanchuanxinwenService;
import com.entity.vo.DiscussxuanchuanxinwenVO;
import com.entity.view.DiscussxuanchuanxinwenView;

@Service("discussxuanchuanxinwenService")
public class DiscussxuanchuanxinwenServiceImpl extends ServiceImpl<DiscussxuanchuanxinwenDao, DiscussxuanchuanxinwenEntity> implements DiscussxuanchuanxinwenService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussxuanchuanxinwenEntity> page = this.selectPage(
                new Query<DiscussxuanchuanxinwenEntity>(params).getPage(),
                new EntityWrapper<DiscussxuanchuanxinwenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussxuanchuanxinwenEntity> wrapper) {
		  Page<DiscussxuanchuanxinwenView> page =new Query<DiscussxuanchuanxinwenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussxuanchuanxinwenVO> selectListVO(Wrapper<DiscussxuanchuanxinwenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussxuanchuanxinwenVO selectVO(Wrapper<DiscussxuanchuanxinwenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussxuanchuanxinwenView> selectListView(Wrapper<DiscussxuanchuanxinwenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussxuanchuanxinwenView selectView(Wrapper<DiscussxuanchuanxinwenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
