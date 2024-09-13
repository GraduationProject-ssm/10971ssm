package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiazhenggongsizijinkoujianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiazhenggongsizijinkoujianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiazhenggongsizijinkoujianView;


/**
 * 家政公司资金扣减
 *
 * @author 
 * @email 
 * @date 2021-01-25 15:02:11
 */
public interface JiazhenggongsizijinkoujianService extends IService<JiazhenggongsizijinkoujianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiazhenggongsizijinkoujianVO> selectListVO(Wrapper<JiazhenggongsizijinkoujianEntity> wrapper);
   	
   	JiazhenggongsizijinkoujianVO selectVO(@Param("ew") Wrapper<JiazhenggongsizijinkoujianEntity> wrapper);
   	
   	List<JiazhenggongsizijinkoujianView> selectListView(Wrapper<JiazhenggongsizijinkoujianEntity> wrapper);
   	
   	JiazhenggongsizijinkoujianView selectView(@Param("ew") Wrapper<JiazhenggongsizijinkoujianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiazhenggongsizijinkoujianEntity> wrapper);
   	
}

