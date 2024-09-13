package com.entity.view;

import com.entity.YonghuzijinkoujianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 用户资金扣减
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-25 15:02:11
 */
@TableName("yonghuzijinkoujian")
public class YonghuzijinkoujianView  extends YonghuzijinkoujianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YonghuzijinkoujianView(){
	}
 
 	public YonghuzijinkoujianView(YonghuzijinkoujianEntity yonghuzijinkoujianEntity){
 	try {
			BeanUtils.copyProperties(this, yonghuzijinkoujianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
