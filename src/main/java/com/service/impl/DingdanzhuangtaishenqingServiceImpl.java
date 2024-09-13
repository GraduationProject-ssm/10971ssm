package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DingdanzhuangtaishenqingDao;
import com.entity.DingdanzhuangtaishenqingEntity;
import com.service.DingdanzhuangtaishenqingService;
import com.entity.vo.DingdanzhuangtaishenqingVO;
import com.entity.view.DingdanzhuangtaishenqingView;

@Service("dingdanzhuangtaishenqingService")
public class DingdanzhuangtaishenqingServiceImpl extends ServiceImpl<DingdanzhuangtaishenqingDao, DingdanzhuangtaishenqingEntity> implements DingdanzhuangtaishenqingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DingdanzhuangtaishenqingEntity> page = this.selectPage(
                new Query<DingdanzhuangtaishenqingEntity>(params).getPage(),
                new EntityWrapper<DingdanzhuangtaishenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DingdanzhuangtaishenqingEntity> wrapper) {
		  Page<DingdanzhuangtaishenqingView> page =new Query<DingdanzhuangtaishenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DingdanzhuangtaishenqingVO> selectListVO(Wrapper<DingdanzhuangtaishenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DingdanzhuangtaishenqingVO selectVO(Wrapper<DingdanzhuangtaishenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DingdanzhuangtaishenqingView> selectListView(Wrapper<DingdanzhuangtaishenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DingdanzhuangtaishenqingView selectView(Wrapper<DingdanzhuangtaishenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
