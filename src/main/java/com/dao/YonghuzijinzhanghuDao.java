package com.dao;

import com.entity.YonghuzijinzhanghuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YonghuzijinzhanghuVO;
import com.entity.view.YonghuzijinzhanghuView;


/**
 * 用户资金账户
 * 
 * @author 
 * @email 
 * @date 2021-01-25 15:02:11
 */
public interface YonghuzijinzhanghuDao extends BaseMapper<YonghuzijinzhanghuEntity> {
	
	List<YonghuzijinzhanghuVO> selectListVO(@Param("ew") Wrapper<YonghuzijinzhanghuEntity> wrapper);
	
	YonghuzijinzhanghuVO selectVO(@Param("ew") Wrapper<YonghuzijinzhanghuEntity> wrapper);
	
	List<YonghuzijinzhanghuView> selectListView(@Param("ew") Wrapper<YonghuzijinzhanghuEntity> wrapper);

	List<YonghuzijinzhanghuView> selectListView(Pagination page,@Param("ew") Wrapper<YonghuzijinzhanghuEntity> wrapper);
	
	YonghuzijinzhanghuView selectView(@Param("ew") Wrapper<YonghuzijinzhanghuEntity> wrapper);
	
}
