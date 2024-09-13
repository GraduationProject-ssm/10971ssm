package com.dao;

import com.entity.JiazhenggongsizhanghuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiazhenggongsizhanghuVO;
import com.entity.view.JiazhenggongsizhanghuView;


/**
 * 家政公司账户
 * 
 * @author 
 * @email 
 * @date 2021-01-25 15:02:11
 */
public interface JiazhenggongsizhanghuDao extends BaseMapper<JiazhenggongsizhanghuEntity> {
	
	List<JiazhenggongsizhanghuVO> selectListVO(@Param("ew") Wrapper<JiazhenggongsizhanghuEntity> wrapper);
	
	JiazhenggongsizhanghuVO selectVO(@Param("ew") Wrapper<JiazhenggongsizhanghuEntity> wrapper);
	
	List<JiazhenggongsizhanghuView> selectListView(@Param("ew") Wrapper<JiazhenggongsizhanghuEntity> wrapper);

	List<JiazhenggongsizhanghuView> selectListView(Pagination page,@Param("ew") Wrapper<JiazhenggongsizhanghuEntity> wrapper);
	
	JiazhenggongsizhanghuView selectView(@Param("ew") Wrapper<JiazhenggongsizhanghuEntity> wrapper);
	
}
