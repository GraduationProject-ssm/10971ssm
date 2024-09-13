package com.entity.view;

import com.entity.JiazhenggongsizijinruzhangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 家政公司资金入账
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-25 15:02:11
 */
@TableName("jiazhenggongsizijinruzhang")
public class JiazhenggongsizijinruzhangView  extends JiazhenggongsizijinruzhangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiazhenggongsizijinruzhangView(){
	}
 
 	public JiazhenggongsizijinruzhangView(JiazhenggongsizijinruzhangEntity jiazhenggongsizijinruzhangEntity){
 	try {
			BeanUtils.copyProperties(this, jiazhenggongsizijinruzhangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
