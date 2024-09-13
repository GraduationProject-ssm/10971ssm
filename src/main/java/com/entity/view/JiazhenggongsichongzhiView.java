package com.entity.view;

import com.entity.JiazhenggongsichongzhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 家政公司充值
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-25 15:02:11
 */
@TableName("jiazhenggongsichongzhi")
public class JiazhenggongsichongzhiView  extends JiazhenggongsichongzhiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiazhenggongsichongzhiView(){
	}
 
 	public JiazhenggongsichongzhiView(JiazhenggongsichongzhiEntity jiazhenggongsichongzhiEntity){
 	try {
			BeanUtils.copyProperties(this, jiazhenggongsichongzhiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
