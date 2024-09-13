package com.dao;

import com.entity.DingdanzhuangtaishenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DingdanzhuangtaishenqingVO;
import com.entity.view.DingdanzhuangtaishenqingView;


/**
 * 订单状态申请
 * 
 * @author 
 * @email 
 * @date 2021-01-25 15:02:12
 */
public interface DingdanzhuangtaishenqingDao extends BaseMapper<DingdanzhuangtaishenqingEntity> {
	
	List<DingdanzhuangtaishenqingVO> selectListVO(@Param("ew") Wrapper<DingdanzhuangtaishenqingEntity> wrapper);
	
	DingdanzhuangtaishenqingVO selectVO(@Param("ew") Wrapper<DingdanzhuangtaishenqingEntity> wrapper);
	
	List<DingdanzhuangtaishenqingView> selectListView(@Param("ew") Wrapper<DingdanzhuangtaishenqingEntity> wrapper);

	List<DingdanzhuangtaishenqingView> selectListView(Pagination page,@Param("ew") Wrapper<DingdanzhuangtaishenqingEntity> wrapper);
	
	DingdanzhuangtaishenqingView selectView(@Param("ew") Wrapper<DingdanzhuangtaishenqingEntity> wrapper);
	
}
