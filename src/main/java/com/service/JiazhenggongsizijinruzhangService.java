package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiazhenggongsizijinruzhangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiazhenggongsizijinruzhangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiazhenggongsizijinruzhangView;


/**
 * 家政公司资金入账
 *
 * @author 
 * @email 
 * @date 2021-01-25 15:02:11
 */
public interface JiazhenggongsizijinruzhangService extends IService<JiazhenggongsizijinruzhangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiazhenggongsizijinruzhangVO> selectListVO(Wrapper<JiazhenggongsizijinruzhangEntity> wrapper);
   	
   	JiazhenggongsizijinruzhangVO selectVO(@Param("ew") Wrapper<JiazhenggongsizijinruzhangEntity> wrapper);
   	
   	List<JiazhenggongsizijinruzhangView> selectListView(Wrapper<JiazhenggongsizijinruzhangEntity> wrapper);
   	
   	JiazhenggongsizijinruzhangView selectView(@Param("ew") Wrapper<JiazhenggongsizijinruzhangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiazhenggongsizijinruzhangEntity> wrapper);
   	
}

