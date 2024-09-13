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


import com.dao.YonghuzijinzhanghuDao;
import com.entity.YonghuzijinzhanghuEntity;
import com.service.YonghuzijinzhanghuService;
import com.entity.vo.YonghuzijinzhanghuVO;
import com.entity.view.YonghuzijinzhanghuView;

@Service("yonghuzijinzhanghuService")
public class YonghuzijinzhanghuServiceImpl extends ServiceImpl<YonghuzijinzhanghuDao, YonghuzijinzhanghuEntity> implements YonghuzijinzhanghuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YonghuzijinzhanghuEntity> page = this.selectPage(
                new Query<YonghuzijinzhanghuEntity>(params).getPage(),
                new EntityWrapper<YonghuzijinzhanghuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YonghuzijinzhanghuEntity> wrapper) {
		  Page<YonghuzijinzhanghuView> page =new Query<YonghuzijinzhanghuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YonghuzijinzhanghuVO> selectListVO(Wrapper<YonghuzijinzhanghuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YonghuzijinzhanghuVO selectVO(Wrapper<YonghuzijinzhanghuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YonghuzijinzhanghuView> selectListView(Wrapper<YonghuzijinzhanghuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YonghuzijinzhanghuView selectView(Wrapper<YonghuzijinzhanghuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
