package com.entity.view;

import com.entity.HudongjiaoliuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 互动交流
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-25 15:02:12
 */
@TableName("hudongjiaoliu")
public class HudongjiaoliuView  extends HudongjiaoliuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HudongjiaoliuView(){
	}
 
 	public HudongjiaoliuView(HudongjiaoliuEntity hudongjiaoliuEntity){
 	try {
			BeanUtils.copyProperties(this, hudongjiaoliuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
