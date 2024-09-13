package com.entity.view;

import com.entity.JiazhenggongsizijinkoujianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 家政公司资金扣减
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-25 15:02:11
 */
@TableName("jiazhenggongsizijinkoujian")
public class JiazhenggongsizijinkoujianView  extends JiazhenggongsizijinkoujianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiazhenggongsizijinkoujianView(){
	}
 
 	public JiazhenggongsizijinkoujianView(JiazhenggongsizijinkoujianEntity jiazhenggongsizijinkoujianEntity){
 	try {
			BeanUtils.copyProperties(this, jiazhenggongsizijinkoujianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
