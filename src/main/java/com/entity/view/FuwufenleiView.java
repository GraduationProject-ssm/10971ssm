package com.entity.view;

import com.entity.FuwufenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 服务分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-25 15:02:11
 */
@TableName("fuwufenlei")
public class FuwufenleiView  extends FuwufenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FuwufenleiView(){
	}
 
 	public FuwufenleiView(FuwufenleiEntity fuwufenleiEntity){
 	try {
			BeanUtils.copyProperties(this, fuwufenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
