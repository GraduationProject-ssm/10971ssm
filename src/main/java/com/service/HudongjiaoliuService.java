package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HudongjiaoliuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HudongjiaoliuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HudongjiaoliuView;


/**
 * 互动交流
 *
 * @author 
 * @email 
 * @date 2021-01-25 15:02:12
 */
public interface HudongjiaoliuService extends IService<HudongjiaoliuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HudongjiaoliuVO> selectListVO(Wrapper<HudongjiaoliuEntity> wrapper);
   	
   	HudongjiaoliuVO selectVO(@Param("ew") Wrapper<HudongjiaoliuEntity> wrapper);
   	
   	List<HudongjiaoliuView> selectListView(Wrapper<HudongjiaoliuEntity> wrapper);
   	
   	HudongjiaoliuView selectView(@Param("ew") Wrapper<HudongjiaoliuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HudongjiaoliuEntity> wrapper);
   	
}

