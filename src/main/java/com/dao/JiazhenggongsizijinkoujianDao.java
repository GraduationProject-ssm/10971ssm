package com.dao;

import com.entity.JiazhenggongsizijinkoujianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiazhenggongsizijinkoujianVO;
import com.entity.view.JiazhenggongsizijinkoujianView;


/**
 * 家政公司资金扣减
 * 
 * @author 
 * @email 
 * @date 2021-01-25 15:02:11
 */
public interface JiazhenggongsizijinkoujianDao extends BaseMapper<JiazhenggongsizijinkoujianEntity> {
	
	List<JiazhenggongsizijinkoujianVO> selectListVO(@Param("ew") Wrapper<JiazhenggongsizijinkoujianEntity> wrapper);
	
	JiazhenggongsizijinkoujianVO selectVO(@Param("ew") Wrapper<JiazhenggongsizijinkoujianEntity> wrapper);
	
	List<JiazhenggongsizijinkoujianView> selectListView(@Param("ew") Wrapper<JiazhenggongsizijinkoujianEntity> wrapper);

	List<JiazhenggongsizijinkoujianView> selectListView(Pagination page,@Param("ew") Wrapper<JiazhenggongsizijinkoujianEntity> wrapper);
	
	JiazhenggongsizijinkoujianView selectView(@Param("ew") Wrapper<JiazhenggongsizijinkoujianEntity> wrapper);
	
}
