package com.entity.view;

import com.entity.ShuxingushiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 书信故事
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-18 12:00:47
 */
@TableName("shuxingushi")
public class ShuxingushiView  extends ShuxingushiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShuxingushiView(){
	}
 
 	public ShuxingushiView(ShuxingushiEntity shuxingushiEntity){
 	try {
			BeanUtils.copyProperties(this, shuxingushiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
