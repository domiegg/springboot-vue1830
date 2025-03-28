package com.entity.view;

import com.entity.XuanchuanxinwenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 宣传新闻
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-18 12:00:46
 */
@TableName("xuanchuanxinwen")
public class XuanchuanxinwenView  extends XuanchuanxinwenEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XuanchuanxinwenView(){
	}
 
 	public XuanchuanxinwenView(XuanchuanxinwenEntity xuanchuanxinwenEntity){
 	try {
			BeanUtils.copyProperties(this, xuanchuanxinwenEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
