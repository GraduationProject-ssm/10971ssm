package com.dao;

import com.entity.YonghuzijinkoujianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YonghuzijinkoujianVO;
import com.entity.view.YonghuzijinkoujianView;


/**
 * 用户资金扣减
 * 
 * @author 
 * @email 
 * @date 2021-01-25 15:02:11
 */
public interface YonghuzijinkoujianDao extends BaseMapper<YonghuzijinkoujianEntity> {
	
	List<YonghuzijinkoujianVO> selectListVO(@Param("ew") Wrapper<YonghuzijinkoujianEntity> wrapper);
	
	YonghuzijinkoujianVO selectVO(@Param("ew") Wrapper<YonghuzijinkoujianEntity> wrapper);
	
	List<YonghuzijinkoujianView> selectListView(@Param("ew") Wrapper<YonghuzijinkoujianEntity> wrapper);

	List<YonghuzijinkoujianView> selectListView(Pagination page,@Param("ew") Wrapper<YonghuzijinkoujianEntity> wrapper);
	
	YonghuzijinkoujianView selectView(@Param("ew") Wrapper<YonghuzijinkoujianEntity> wrapper);
	
}
