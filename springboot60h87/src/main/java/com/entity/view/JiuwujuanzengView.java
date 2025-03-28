package com.entity.view;

import com.entity.JiuwujuanzengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 旧物捐赠
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-18 12:00:47
 */
@TableName("jiuwujuanzeng")
public class JiuwujuanzengView  extends JiuwujuanzengEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiuwujuanzengView(){
	}
 
 	public JiuwujuanzengView(JiuwujuanzengEntity jiuwujuanzengEntity){
 	try {
			BeanUtils.copyProperties(this, jiuwujuanzengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
