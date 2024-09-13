package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiazhenggongsizhanghuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiazhenggongsizhanghuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiazhenggongsizhanghuView;


/**
 * 家政公司账户
 *
 * @author 
 * @email 
 * @date 2021-01-25 15:02:11
 */
public interface JiazhenggongsizhanghuService extends IService<JiazhenggongsizhanghuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiazhenggongsizhanghuVO> selectListVO(Wrapper<JiazhenggongsizhanghuEntity> wrapper);
   	
   	JiazhenggongsizhanghuVO selectVO(@Param("ew") Wrapper<JiazhenggongsizhanghuEntity> wrapper);
   	
   	List<JiazhenggongsizhanghuView> selectListView(Wrapper<JiazhenggongsizhanghuEntity> wrapper);
   	
   	JiazhenggongsizhanghuView selectView(@Param("ew") Wrapper<JiazhenggongsizhanghuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiazhenggongsizhanghuEntity> wrapper);
   	
}

