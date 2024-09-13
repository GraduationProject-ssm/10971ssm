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
 * 家政公司资金扣减
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-01-25 15:02:11
 */
@TableName("jiazhenggongsizijinkoujian")
public class JiazhenggongsizijinkoujianEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiazhenggongsizijinkoujianEntity() {
		
	}
	
	public JiazhenggongsizijinkoujianEntity(T t) {
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
	 * 公司编号
	 */
					
	private String gongsibianhao;
	
	/**
	 * 公司名称
	 */
					
	private String gongsimingcheng;
	
	/**
	 * 金额
	 */
					
	private String jine;
	
	/**
	 * 扣减原因
	 */
					
	private String koujianyuanyin;
	
	/**
	 * 日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date riqi;
	
	
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
	 * 设置：公司编号
	 */
	public void setGongsibianhao(String gongsibianhao) {
		this.gongsibianhao = gongsibianhao;
	}
	/**
	 * 获取：公司编号
	 */
	public String getGongsibianhao() {
		return gongsibianhao;
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
	 * 设置：金额
	 */
	public void setJine(String jine) {
		this.jine = jine;
	}
	/**
	 * 获取：金额
	 */
	public String getJine() {
		return jine;
	}
	/**
	 * 设置：扣减原因
	 */
	public void setKoujianyuanyin(String koujianyuanyin) {
		this.koujianyuanyin = koujianyuanyin;
	}
	/**
	 * 获取：扣减原因
	 */
	public String getKoujianyuanyin() {
		return koujianyuanyin;
	}
	/**
	 * 设置：日期
	 */
	public void setRiqi(Date riqi) {
		this.riqi = riqi;
	}
	/**
	 * 获取：日期
	 */
	public Date getRiqi() {
		return riqi;
	}

}
