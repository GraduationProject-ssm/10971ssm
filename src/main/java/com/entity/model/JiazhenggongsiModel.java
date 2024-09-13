package com.entity.model;

import com.entity.JiazhenggongsiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 家政公司
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-01-25 15:02:11
 */
public class JiazhenggongsiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 密码
	 */
	
	private String mima;
		
	/**
	 * 公司名称
	 */
	
	private String gongsimingcheng;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 服务宗旨
	 */
	
	private String fuwuzongzhi;
		
	/**
	 * 服务内容
	 */
	
	private String fuwuneirong;
		
	/**
	 * 公司文化
	 */
	
	private String gongsiwenhua;
		
	/**
	 * 公司简介
	 */
	
	private String gongsijianjie;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
	/**
	 * 设置：密码
	 */
	 
	public void setMima(String mima) {
		this.mima = mima;
	}
	
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
	}
				
	
	/**
	 * 设置：公司名称
	 */
	 
	public void setGongsimingcheng(String gongsimingcheng) {
		this.gongsimingcheng = gongsimingcheng;
	}
	
	/**
	 * 获取：公司名称
	 */
	public String getGongsimingcheng() {
		return gongsimingcheng;
	}
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
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
				
	
	/**
	 * 设置：服务宗旨
	 */
	 
	public void setFuwuzongzhi(String fuwuzongzhi) {
		this.fuwuzongzhi = fuwuzongzhi;
	}
	
	/**
	 * 获取：服务宗旨
	 */
	public String getFuwuzongzhi() {
		return fuwuzongzhi;
	}
				
	
	/**
	 * 设置：服务内容
	 */
	 
	public void setFuwuneirong(String fuwuneirong) {
		this.fuwuneirong = fuwuneirong;
	}
	
	/**
	 * 获取：服务内容
	 */
	public String getFuwuneirong() {
		return fuwuneirong;
	}
				
	
	/**
	 * 设置：公司文化
	 */
	 
	public void setGongsiwenhua(String gongsiwenhua) {
		this.gongsiwenhua = gongsiwenhua;
	}
	
	/**
	 * 获取：公司文化
	 */
	public String getGongsiwenhua() {
		return gongsiwenhua;
	}
				
	
	/**
	 * 设置：公司简介
	 */
	 
	public void setGongsijianjie(String gongsijianjie) {
		this.gongsijianjie = gongsijianjie;
	}
	
	/**
	 * 获取：公司简介
	 */
	public String getGongsijianjie() {
		return gongsijianjie;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
