package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YonghuzijinzhanghuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YonghuzijinzhanghuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YonghuzijinzhanghuView;


/**
 * 用户资金账户
 *
 * @author 
 * @email 
 * @date 2021-01-25 15:02:11
 */
public interface YonghuzijinzhanghuService extends IService<YonghuzijinzhanghuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YonghuzijinzhanghuVO> selectListVO(Wrapper<YonghuzijinzhanghuEntity> wrapper);
   	
   	YonghuzijinzhanghuVO selectVO(@Param("ew") Wrapper<YonghuzijinzhanghuEntity> wrapper);
   	
   	List<YonghuzijinzhanghuView> selectListView(Wrapper<YonghuzijinzhanghuEntity> wrapper);
   	
   	YonghuzijinzhanghuView selectView(@Param("ew") Wrapper<YonghuzijinzhanghuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YonghuzijinzhanghuEntity> wrapper);
   	
}

