package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YonghuzijinkoujianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YonghuzijinkoujianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YonghuzijinkoujianView;


/**
 * 用户资金扣减
 *
 * @author 
 * @email 
 * @date 2021-01-25 15:02:11
 */
public interface YonghuzijinkoujianService extends IService<YonghuzijinkoujianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YonghuzijinkoujianVO> selectListVO(Wrapper<YonghuzijinkoujianEntity> wrapper);
   	
   	YonghuzijinkoujianVO selectVO(@Param("ew") Wrapper<YonghuzijinkoujianEntity> wrapper);
   	
   	List<YonghuzijinkoujianView> selectListView(Wrapper<YonghuzijinkoujianEntity> wrapper);
   	
   	YonghuzijinkoujianView selectView(@Param("ew") Wrapper<YonghuzijinkoujianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YonghuzijinkoujianEntity> wrapper);
   	
}

