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


import com.dao.JiazhenggongsichongzhiDao;
import com.entity.JiazhenggongsichongzhiEntity;
import com.service.JiazhenggongsichongzhiService;
import com.entity.vo.JiazhenggongsichongzhiVO;
import com.entity.view.JiazhenggongsichongzhiView;

@Service("jiazhenggongsichongzhiService")
public class JiazhenggongsichongzhiServiceImpl extends ServiceImpl<JiazhenggongsichongzhiDao, JiazhenggongsichongzhiEntity> implements JiazhenggongsichongzhiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiazhenggongsichongzhiEntity> page = this.selectPage(
                new Query<JiazhenggongsichongzhiEntity>(params).getPage(),
                new EntityWrapper<JiazhenggongsichongzhiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiazhenggongsichongzhiEntity> wrapper) {
		  Page<JiazhenggongsichongzhiView> page =new Query<JiazhenggongsichongzhiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiazhenggongsichongzhiVO> selectListVO(Wrapper<JiazhenggongsichongzhiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiazhenggongsichongzhiVO selectVO(Wrapper<JiazhenggongsichongzhiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiazhenggongsichongzhiView> selectListView(Wrapper<JiazhenggongsichongzhiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiazhenggongsichongzhiView selectView(Wrapper<JiazhenggongsichongzhiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
