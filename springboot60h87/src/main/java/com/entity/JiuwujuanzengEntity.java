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
 * 旧物捐赠
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-18 12:00:47
 */
@TableName("jiuwujuanzeng")
public class JiuwujuanzengEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiuwujuanzengEntity() {
		
	}
	
	public JiuwujuanzengEntity(T t) {
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
	 * 捐赠编号
	 */
					
	private String juanzengbianhao;
	
	/**
	 * 捐赠标题
	 */
					
	private String juanzengbiaoti;
	
	/**
	 * 捐赠地点
	 */
					
	private String juanzengdidian;
	
	/**
	 * 物流单号
	 */
					
	private String wuliudanhao;
	
	/**
	 * 捐赠物品
	 */
					
	private String juanzengwupin;
	
	/**
	 * 捐赠时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date juanzengshijian;
	
	/**
	 * 用户账号
	 */
					
	private String yonghuzhanghao;
	
	/**
	 * 用户姓名
	 */
					
	private String yonghuxingming;
	
	/**
	 * 用户手机
	 */
					
	private String yonghushouji;
	
	
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
	 * 设置：捐赠编号
	 */
	public void setJuanzengbianhao(String juanzengbianhao) {
		this.juanzengbianhao = juanzengbianhao;
	}
	/**
	 * 获取：捐赠编号
	 */
	public String getJuanzengbianhao() {
		return juanzengbianhao;
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
	 * 设置：物流单号
	 */
	public void setWuliudanhao(String wuliudanhao) {
		this.wuliudanhao = wuliudanhao;
	}
	/**
	 * 获取：物流单号
	 */
	public String getWuliudanhao() {
		return wuliudanhao;
	}
	/**
	 * 设置：捐赠物品
	 */
	public void setJuanzengwupin(String juanzengwupin) {
		this.juanzengwupin = juanzengwupin;
	}
	/**
	 * 获取：捐赠物品
	 */
	public String getJuanzengwupin() {
		return juanzengwupin;
	}
	/**
	 * 设置：捐赠时间
	 */
	public void setJuanzengshijian(Date juanzengshijian) {
		this.juanzengshijian = juanzengshijian;
	}
	/**
	 * 获取：捐赠时间
	 */
	public Date getJuanzengshijian() {
		return juanzengshijian;
	}
	/**
	 * 设置：用户账号
	 */
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
	/**
	 * 设置：用户姓名
	 */
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
	/**
	 * 设置：用户手机
	 */
	public void setYonghushouji(String yonghushouji) {
		this.yonghushouji = yonghushouji;
	}
	/**
	 * 获取：用户手机
	 */
	public String getYonghushouji() {
		return yonghushouji;
	}

}
