package com.entity.view;

import com.entity.YonghuzijinruzhangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 用户资金入账
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-25 15:02:11
 */
@TableName("yonghuzijinruzhang")
public class YonghuzijinruzhangView  extends YonghuzijinruzhangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YonghuzijinruzhangView(){
	}
 
 	public YonghuzijinruzhangView(YonghuzijinruzhangEntity yonghuzijinruzhangEntity){
 	try {
			BeanUtils.copyProperties(this, yonghuzijinruzhangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
