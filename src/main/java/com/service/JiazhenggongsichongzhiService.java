package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiazhenggongsichongzhiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiazhenggongsichongzhiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiazhenggongsichongzhiView;


/**
 * 家政公司充值
 *
 * @author 
 * @email 
 * @date 2021-01-25 15:02:11
 */
public interface JiazhenggongsichongzhiService extends IService<JiazhenggongsichongzhiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiazhenggongsichongzhiVO> selectListVO(Wrapper<JiazhenggongsichongzhiEntity> wrapper);
   	
   	JiazhenggongsichongzhiVO selectVO(@Param("ew") Wrapper<JiazhenggongsichongzhiEntity> wrapper);
   	
   	List<JiazhenggongsichongzhiView> selectListView(Wrapper<JiazhenggongsichongzhiEntity> wrapper);
   	
   	JiazhenggongsichongzhiView selectView(@Param("ew") Wrapper<JiazhenggongsichongzhiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiazhenggongsichongzhiEntity> wrapper);
   	
}

