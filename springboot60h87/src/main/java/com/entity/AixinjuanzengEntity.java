package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 爱心捐赠
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-18 12:00:47
 */
@TableName("aixinjuanzeng")
public class AixinjuanzengEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public AixinjuanzengEntity() {
		
	}
	
	public AixinjuanzengEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 捐赠标题
	 */
					
	private String juanzengbiaoti;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：捐赠标题
	 */
	public void setJuanzengbiaoti(String juanzengbiaoti) {
		this.juanzengbiaoti = juanzengbiaoti;
	}
	/**
	 * 获取：捐赠标题
	 */
	public String getJuanzengbiaoti() {
		return juanzengbiaoti;
	}
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
