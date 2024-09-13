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


import com.dao.HudongjiaoliuDao;
import com.entity.HudongjiaoliuEntity;
import com.service.HudongjiaoliuService;
import com.entity.vo.HudongjiaoliuVO;
import com.entity.view.HudongjiaoliuView;

@Service("hudongjiaoliuService")
public class HudongjiaoliuServiceImpl extends ServiceImpl<HudongjiaoliuDao, HudongjiaoliuEntity> implements HudongjiaoliuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HudongjiaoliuEntity> page = this.selectPage(
                new Query<HudongjiaoliuEntity>(params).getPage(),
                new EntityWrapper<HudongjiaoliuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HudongjiaoliuEntity> wrapper) {
		  Page<HudongjiaoliuView> page =new Query<HudongjiaoliuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HudongjiaoliuVO> selectListVO(Wrapper<HudongjiaoliuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HudongjiaoliuVO selectVO(Wrapper<HudongjiaoliuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HudongjiaoliuView> selectListView(Wrapper<HudongjiaoliuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HudongjiaoliuView selectView(Wrapper<HudongjiaoliuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
