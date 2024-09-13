package com.dao;

import com.entity.HudongjiaoliuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HudongjiaoliuVO;
import com.entity.view.HudongjiaoliuView;


/**
 * 互动交流
 * 
 * @author 
 * @email 
 * @date 2021-01-25 15:02:12
 */
public interface HudongjiaoliuDao extends BaseMapper<HudongjiaoliuEntity> {
	
	List<HudongjiaoliuVO> selectListVO(@Param("ew") Wrapper<HudongjiaoliuEntity> wrapper);
	
	HudongjiaoliuVO selectVO(@Param("ew") Wrapper<HudongjiaoliuEntity> wrapper);
	
	List<HudongjiaoliuView> selectListView(@Param("ew") Wrapper<HudongjiaoliuEntity> wrapper);

	List<HudongjiaoliuView> selectListView(Pagination page,@Param("ew") Wrapper<HudongjiaoliuEntity> wrapper);
	
	HudongjiaoliuView selectView(@Param("ew") Wrapper<HudongjiaoliuEntity> wrapper);
	
}
