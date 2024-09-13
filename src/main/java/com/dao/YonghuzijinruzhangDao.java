package com.dao;

import com.entity.YonghuzijinruzhangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YonghuzijinruzhangVO;
import com.entity.view.YonghuzijinruzhangView;


/**
 * 用户资金入账
 * 
 * @author 
 * @email 
 * @date 2021-01-25 15:02:11
 */
public interface YonghuzijinruzhangDao extends BaseMapper<YonghuzijinruzhangEntity> {
	
	List<YonghuzijinruzhangVO> selectListVO(@Param("ew") Wrapper<YonghuzijinruzhangEntity> wrapper);
	
	YonghuzijinruzhangVO selectVO(@Param("ew") Wrapper<YonghuzijinruzhangEntity> wrapper);
	
	List<YonghuzijinruzhangView> selectListView(@Param("ew") Wrapper<YonghuzijinruzhangEntity> wrapper);

	List<YonghuzijinruzhangView> selectListView(Pagination page,@Param("ew") Wrapper<YonghuzijinruzhangEntity> wrapper);
	
	YonghuzijinruzhangView selectView(@Param("ew") Wrapper<YonghuzijinruzhangEntity> wrapper);
	
}
