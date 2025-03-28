package com.entity.vo;

import com.entity.JiuwujuanzengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 旧物捐赠
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-18 12:00:47
 */
public class JiuwujuanzengVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
