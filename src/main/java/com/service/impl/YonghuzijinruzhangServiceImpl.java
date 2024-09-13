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


import com.dao.YonghuzijinruzhangDao;
import com.entity.YonghuzijinruzhangEntity;
import com.service.YonghuzijinruzhangService;
import com.entity.vo.YonghuzijinruzhangVO;
import com.entity.view.YonghuzijinruzhangView;

@Service("yonghuzijinruzhangService")
public class YonghuzijinruzhangServiceImpl extends ServiceImpl<YonghuzijinruzhangDao, YonghuzijinruzhangEntity> implements YonghuzijinruzhangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YonghuzijinruzhangEntity> page = this.selectPage(
                new Query<YonghuzijinruzhangEntity>(params).getPage(),
                new EntityWrapper<YonghuzijinruzhangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YonghuzijinruzhangEntity> wrapper) {
		  Page<YonghuzijinruzhangView> page =new Query<YonghuzijinruzhangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YonghuzijinruzhangVO> selectListVO(Wrapper<YonghuzijinruzhangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YonghuzijinruzhangVO selectVO(Wrapper<YonghuzijinruzhangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YonghuzijinruzhangView> selectListView(Wrapper<YonghuzijinruzhangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YonghuzijinruzhangView selectView(Wrapper<YonghuzijinruzhangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
