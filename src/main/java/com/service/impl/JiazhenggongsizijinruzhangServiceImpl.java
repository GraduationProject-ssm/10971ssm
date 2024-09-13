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


import com.dao.JiazhenggongsizijinruzhangDao;
import com.entity.JiazhenggongsizijinruzhangEntity;
import com.service.JiazhenggongsizijinruzhangService;
import com.entity.vo.JiazhenggongsizijinruzhangVO;
import com.entity.view.JiazhenggongsizijinruzhangView;

@Service("jiazhenggongsizijinruzhangService")
public class JiazhenggongsizijinruzhangServiceImpl extends ServiceImpl<JiazhenggongsizijinruzhangDao, JiazhenggongsizijinruzhangEntity> implements JiazhenggongsizijinruzhangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiazhenggongsizijinruzhangEntity> page = this.selectPage(
                new Query<JiazhenggongsizijinruzhangEntity>(params).getPage(),
                new EntityWrapper<JiazhenggongsizijinruzhangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiazhenggongsizijinruzhangEntity> wrapper) {
		  Page<JiazhenggongsizijinruzhangView> page =new Query<JiazhenggongsizijinruzhangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiazhenggongsizijinruzhangVO> selectListVO(Wrapper<JiazhenggongsizijinruzhangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiazhenggongsizijinruzhangVO selectVO(Wrapper<JiazhenggongsizijinruzhangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiazhenggongsizijinruzhangView> selectListView(Wrapper<JiazhenggongsizijinruzhangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiazhenggongsizijinruzhangView selectView(Wrapper<JiazhenggongsizijinruzhangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
