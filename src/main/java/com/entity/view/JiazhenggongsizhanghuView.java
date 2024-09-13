package com.entity.view;

import com.entity.JiazhenggongsizhanghuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 家政公司账户
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-25 15:02:11
 */
@TableName("jiazhenggongsizhanghu")
public class JiazhenggongsizhanghuView  extends JiazhenggongsizhanghuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiazhenggongsizhanghuView(){
	}
 
 	public JiazhenggongsizhanghuView(JiazhenggongsizhanghuEntity jiazhenggongsizhanghuEntity){
 	try {
			BeanUtils.copyProperties(this, jiazhenggongsizhanghuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
