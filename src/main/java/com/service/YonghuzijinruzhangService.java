package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YonghuzijinruzhangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YonghuzijinruzhangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YonghuzijinruzhangView;


/**
 * 用户资金入账
 *
 * @author 
 * @email 
 * @date 2021-01-25 15:02:11
 */
public interface YonghuzijinruzhangService extends IService<YonghuzijinruzhangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YonghuzijinruzhangVO> selectListVO(Wrapper<YonghuzijinruzhangEntity> wrapper);
   	
   	YonghuzijinruzhangVO selectVO(@Param("ew") Wrapper<YonghuzijinruzhangEntity> wrapper);
   	
   	List<YonghuzijinruzhangView> selectListView(Wrapper<YonghuzijinruzhangEntity> wrapper);
   	
   	YonghuzijinruzhangView selectView(@Param("ew") Wrapper<YonghuzijinruzhangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YonghuzijinruzhangEntity> wrapper);
   	
}

