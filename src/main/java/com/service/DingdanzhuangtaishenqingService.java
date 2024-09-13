package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DingdanzhuangtaishenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DingdanzhuangtaishenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DingdanzhuangtaishenqingView;


/**
 * 订单状态申请
 *
 * @author 
 * @email 
 * @date 2021-01-25 15:02:12
 */
public interface DingdanzhuangtaishenqingService extends IService<DingdanzhuangtaishenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DingdanzhuangtaishenqingVO> selectListVO(Wrapper<DingdanzhuangtaishenqingEntity> wrapper);
   	
   	DingdanzhuangtaishenqingVO selectVO(@Param("ew") Wrapper<DingdanzhuangtaishenqingEntity> wrapper);
   	
   	List<DingdanzhuangtaishenqingView> selectListView(Wrapper<DingdanzhuangtaishenqingEntity> wrapper);
   	
   	DingdanzhuangtaishenqingView selectView(@Param("ew") Wrapper<DingdanzhuangtaishenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DingdanzhuangtaishenqingEntity> wrapper);
   	
}

