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


import com.dao.LejiewomenDao;
import com.entity.LejiewomenEntity;
import com.service.LejiewomenService;
import com.entity.vo.LejiewomenVO;
import com.entity.view.LejiewomenView;

@Service("lejiewomenService")
public class LejiewomenServiceImpl extends ServiceImpl<LejiewomenDao, LejiewomenEntity> implements LejiewomenService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LejiewomenEntity> page = this.selectPage(
                new Query<LejiewomenEntity>(params).getPage(),
                new EntityWrapper<LejiewomenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LejiewomenEntity> wrapper) {
		  Page<LejiewomenView> page =new Query<LejiewomenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LejiewomenVO> selectListVO(Wrapper<LejiewomenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LejiewomenVO selectVO(Wrapper<LejiewomenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LejiewomenView> selectListView(Wrapper<LejiewomenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LejiewomenView selectView(Wrapper<LejiewomenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
