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


import com.dao.JiazhenggongsizijinkoujianDao;
import com.entity.JiazhenggongsizijinkoujianEntity;
import com.service.JiazhenggongsizijinkoujianService;
import com.entity.vo.JiazhenggongsizijinkoujianVO;
import com.entity.view.JiazhenggongsizijinkoujianView;

@Service("jiazhenggongsizijinkoujianService")
public class JiazhenggongsizijinkoujianServiceImpl extends ServiceImpl<JiazhenggongsizijinkoujianDao, JiazhenggongsizijinkoujianEntity> implements JiazhenggongsizijinkoujianService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiazhenggongsizijinkoujianEntity> page = this.selectPage(
                new Query<JiazhenggongsizijinkoujianEntity>(params).getPage(),
                new EntityWrapper<JiazhenggongsizijinkoujianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiazhenggongsizijinkoujianEntity> wrapper) {
		  Page<JiazhenggongsizijinkoujianView> page =new Query<JiazhenggongsizijinkoujianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiazhenggongsizijinkoujianVO> selectListVO(Wrapper<JiazhenggongsizijinkoujianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiazhenggongsizijinkoujianVO selectVO(Wrapper<JiazhenggongsizijinkoujianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiazhenggongsizijinkoujianView> selectListView(Wrapper<JiazhenggongsizijinkoujianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiazhenggongsizijinkoujianView selectView(Wrapper<JiazhenggongsizijinkoujianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
