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
 * 友情链接
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-18 12:00:47
 */
@TableName("youqinglianjie")
public class YouqinglianjieEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YouqinglianjieEntity() {
		
	}
	
	public YouqinglianjieEntity(T t) {
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
	 * 链接名称
	 */
					
	private String lianjiemingcheng;
	
	/**
	 * 链接网站
	 */
					
	private String lianjiewangzhan;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	
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
	 * 设置：链接名称
	 */
	public void setLianjiemingcheng(String lianjiemingcheng) {
		this.lianjiemingcheng = lianjiemingcheng;
	}
	/**
	 * 获取：链接名称
	 */
	public String getLianjiemingcheng() {
		return lianjiemingcheng;
	}
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
