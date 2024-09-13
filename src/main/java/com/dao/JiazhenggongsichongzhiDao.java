package com.dao;

import com.entity.JiazhenggongsichongzhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiazhenggongsichongzhiVO;
import com.entity.view.JiazhenggongsichongzhiView;


/**
 * 家政公司充值
 * 
 * @author 
 * @email 
 * @date 2021-01-25 15:02:11
 */
public interface JiazhenggongsichongzhiDao extends BaseMapper<JiazhenggongsichongzhiEntity> {
	
	List<JiazhenggongsichongzhiVO> selectListVO(@Param("ew") Wrapper<JiazhenggongsichongzhiEntity> wrapper);
	
	JiazhenggongsichongzhiVO selectVO(@Param("ew") Wrapper<JiazhenggongsichongzhiEntity> wrapper);
	
	List<JiazhenggongsichongzhiView> selectListView(@Param("ew") Wrapper<JiazhenggongsichongzhiEntity> wrapper);

	List<JiazhenggongsichongzhiView> selectListView(Pagination page,@Param("ew") Wrapper<JiazhenggongsichongzhiEntity> wrapper);
	
	JiazhenggongsichongzhiView selectView(@Param("ew") Wrapper<JiazhenggongsichongzhiEntity> wrapper);
	
}
