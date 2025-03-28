package com.entity.model;

import com.entity.AixinjuanzengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 爱心捐赠
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-18 12:00:47
 */
public class AixinjuanzengModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 捐赠内容
	 */
	
	private String juanzengneirong;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
		
	/**
	 * 机构名称
	 */
	
	private String jigoumingcheng;
		
	/**
	 * 捐赠地点
	 */
	
	private String juanzengdidian;
		
	/**
	 * 封面图片
	 */
	
	private String fengmiantupian;
		
	/**
	 * 微信账号
	 */
	
	private String weixinzhanghao;
		
	/**
	 * 微信用户名
	 */
	
	private String weixinyonghuming;
				
	
	/**
	 * 设置：捐赠内容
	 */
	 
	public void setJuanzengneirong(String juanzengneirong) {
		this.juanzengneirong = juanzengneirong;
	}
	
	/**
	 * 获取：捐赠内容
	 */
	public String getJuanzengneirong() {
		return juanzengneirong;
	}
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
				
	
	/**
	 * 设置：机构名称
	 */
	 
	public void setJigoumingcheng(String jigoumingcheng) {
		this.jigoumingcheng = jigoumingcheng;
	}
	
	/**
	 * 获取：机构名称
	 */
	public String getJigoumingcheng() {
		return jigoumingcheng;
	}
				
	
	/**
	 * 设置：捐赠地点
	 */
	 
	public void setJuanzengdidian(String juanzengdidian) {
		this.juanzengdidian = juanzengdidian;
	}
	
	/**
	 * 获取：捐赠地点
	 */
	public String getJuanzengdidian() {
		return juanzengdidian;
	}
				
	
	/**
	 * 设置：封面图片
	 */
	 
	public void setFengmiantupian(String fengmiantupian) {
		this.fengmiantupian = fengmiantupian;
	}
	
	/**
	 * 获取：封面图片
	 */
	public String getFengmiantupian() {
		return fengmiantupian;
	}
				
	
	/**
	 * 设置：微信账号
	 */
	 
	public void setWeixinzhanghao(String weixinzhanghao) {
		this.weixinzhanghao = weixinzhanghao;
	}
	
	/**
	 * 获取：微信账号
	 */
	public String getWeixinzhanghao() {
		return weixinzhanghao;
	}
				
	
	/**
	 * 设置：微信用户名
	 */
	 
	public void setWeixinyonghuming(String weixinyonghuming) {
		this.weixinyonghuming = weixinyonghuming;
	}
	
	/**
	 * 获取：微信用户名
	 */
	public String getWeixinyonghuming() {
		return weixinyonghuming;
	}
			
}
