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


import com.dao.XuanchuanxinwenDao;
import com.entity.XuanchuanxinwenEntity;
import com.service.XuanchuanxinwenService;
import com.entity.vo.XuanchuanxinwenVO;
import com.entity.view.XuanchuanxinwenView;

@Service("xuanchuanxinwenService")
public class XuanchuanxinwenServiceImpl extends ServiceImpl<XuanchuanxinwenDao, XuanchuanxinwenEntity> implements XuanchuanxinwenService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XuanchuanxinwenEntity> page = this.selectPage(
                new Query<XuanchuanxinwenEntity>(params).getPage(),
                new EntityWrapper<XuanchuanxinwenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XuanchuanxinwenEntity> wrapper) {
		  Page<XuanchuanxinwenView> page =new Query<XuanchuanxinwenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XuanchuanxinwenVO> selectListVO(Wrapper<XuanchuanxinwenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XuanchuanxinwenVO selectVO(Wrapper<XuanchuanxinwenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XuanchuanxinwenView> selectListView(Wrapper<XuanchuanxinwenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XuanchuanxinwenView selectView(Wrapper<XuanchuanxinwenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
