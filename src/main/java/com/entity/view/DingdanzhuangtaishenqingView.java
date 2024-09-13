package com.entity.view;

import com.entity.DingdanzhuangtaishenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 订单状态申请
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-25 15:02:12
 */
@TableName("dingdanzhuangtaishenqing")
public class DingdanzhuangtaishenqingView  extends DingdanzhuangtaishenqingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DingdanzhuangtaishenqingView(){
	}
 
 	public DingdanzhuangtaishenqingView(DingdanzhuangtaishenqingEntity dingdanzhuangtaishenqingEntity){
 	try {
			BeanUtils.copyProperties(this, dingdanzhuangtaishenqingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
