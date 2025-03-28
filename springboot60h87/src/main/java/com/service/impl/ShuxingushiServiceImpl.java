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


import com.dao.ShuxingushiDao;
import com.entity.ShuxingushiEntity;
import com.service.ShuxingushiService;
import com.entity.vo.ShuxingushiVO;
import com.entity.view.ShuxingushiView;

@Service("shuxingushiService")
public class ShuxingushiServiceImpl extends ServiceImpl<ShuxingushiDao, ShuxingushiEntity> implements ShuxingushiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShuxingushiEntity> page = this.selectPage(
                new Query<ShuxingushiEntity>(params).getPage(),
                new EntityWrapper<ShuxingushiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShuxingushiEntity> wrapper) {
		  Page<ShuxingushiView> page =new Query<ShuxingushiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShuxingushiVO> selectListVO(Wrapper<ShuxingushiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShuxingushiVO selectVO(Wrapper<ShuxingushiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShuxingushiView> selectListView(Wrapper<ShuxingushiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShuxingushiView selectView(Wrapper<ShuxingushiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
