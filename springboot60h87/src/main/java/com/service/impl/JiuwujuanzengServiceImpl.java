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


import com.dao.JiuwujuanzengDao;
import com.entity.JiuwujuanzengEntity;
import com.service.JiuwujuanzengService;
import com.entity.vo.JiuwujuanzengVO;
import com.entity.view.JiuwujuanzengView;

@Service("jiuwujuanzengService")
public class JiuwujuanzengServiceImpl extends ServiceImpl<JiuwujuanzengDao, JiuwujuanzengEntity> implements JiuwujuanzengService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiuwujuanzengEntity> page = this.selectPage(
                new Query<JiuwujuanzengEntity>(params).getPage(),
                new EntityWrapper<JiuwujuanzengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiuwujuanzengEntity> wrapper) {
		  Page<JiuwujuanzengView> page =new Query<JiuwujuanzengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiuwujuanzengVO> selectListVO(Wrapper<JiuwujuanzengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiuwujuanzengVO selectVO(Wrapper<JiuwujuanzengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiuwujuanzengView> selectListView(Wrapper<JiuwujuanzengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiuwujuanzengView selectView(Wrapper<JiuwujuanzengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
