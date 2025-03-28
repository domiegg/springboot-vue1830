package com.entity.vo;

import com.entity.YouqinglianjieEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 友情链接
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-18 12:00:47
 */
public class YouqinglianjieVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 链接网站
	 */
	
	private String lianjiewangzhan;
		
	/**
	 * 图片
	 */
	
	private String tupian;
				
	
	/**
	 * 设置：链接网站
	 */
	 
	public void setLianjiewangzhan(String lianjiewangzhan) {
		this.lianjiewangzhan = lianjiewangzhan;
	}
	
	/**
	 * 获取：链接网站
	 */
	public String getLianjiewangzhan() {
		return lianjiewangzhan;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
			
}
