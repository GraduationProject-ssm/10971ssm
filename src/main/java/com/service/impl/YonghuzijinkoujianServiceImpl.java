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


import com.dao.YonghuzijinkoujianDao;
import com.entity.YonghuzijinkoujianEntity;
import com.service.YonghuzijinkoujianService;
import com.entity.vo.YonghuzijinkoujianVO;
import com.entity.view.YonghuzijinkoujianView;

@Service("yonghuzijinkoujianService")
public class YonghuzijinkoujianServiceImpl extends ServiceImpl<YonghuzijinkoujianDao, YonghuzijinkoujianEntity> implements YonghuzijinkoujianService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YonghuzijinkoujianEntity> page = this.selectPage(
                new Query<YonghuzijinkoujianEntity>(params).getPage(),
                new EntityWrapper<YonghuzijinkoujianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YonghuzijinkoujianEntity> wrapper) {
		  Page<YonghuzijinkoujianView> page =new Query<YonghuzijinkoujianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YonghuzijinkoujianVO> selectListVO(Wrapper<YonghuzijinkoujianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YonghuzijinkoujianVO selectVO(Wrapper<YonghuzijinkoujianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YonghuzijinkoujianView> selectListView(Wrapper<YonghuzijinkoujianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YonghuzijinkoujianView selectView(Wrapper<YonghuzijinkoujianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
