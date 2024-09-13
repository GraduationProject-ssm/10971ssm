package com.dao;

import com.entity.JiazhenggongsizijinruzhangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiazhenggongsizijinruzhangVO;
import com.entity.view.JiazhenggongsizijinruzhangView;


/**
 * 家政公司资金入账
 * 
 * @author 
 * @email 
 * @date 2021-01-25 15:02:11
 */
public interface JiazhenggongsizijinruzhangDao extends BaseMapper<JiazhenggongsizijinruzhangEntity> {
	
	List<JiazhenggongsizijinruzhangVO> selectListVO(@Param("ew") Wrapper<JiazhenggongsizijinruzhangEntity> wrapper);
	
	JiazhenggongsizijinruzhangVO selectVO(@Param("ew") Wrapper<JiazhenggongsizijinruzhangEntity> wrapper);
	
	List<JiazhenggongsizijinruzhangView> selectListView(@Param("ew") Wrapper<JiazhenggongsizijinruzhangEntity> wrapper);

	List<JiazhenggongsizijinruzhangView> selectListView(Pagination page,@Param("ew") Wrapper<JiazhenggongsizijinruzhangEntity> wrapper);
	
	JiazhenggongsizijinruzhangView selectView(@Param("ew") Wrapper<JiazhenggongsizijinruzhangEntity> wrapper);
	
}
