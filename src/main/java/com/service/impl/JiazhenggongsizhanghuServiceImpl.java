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


import com.dao.JiazhenggongsizhanghuDao;
import com.entity.JiazhenggongsizhanghuEntity;
import com.service.JiazhenggongsizhanghuService;
import com.entity.vo.JiazhenggongsizhanghuVO;
import com.entity.view.JiazhenggongsizhanghuView;

@Service("jiazhenggongsizhanghuService")
public class JiazhenggongsizhanghuServiceImpl extends ServiceImpl<JiazhenggongsizhanghuDao, JiazhenggongsizhanghuEntity> implements JiazhenggongsizhanghuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiazhenggongsizhanghuEntity> page = this.selectPage(
                new Query<JiazhenggongsizhanghuEntity>(params).getPage(),
                new EntityWrapper<JiazhenggongsizhanghuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiazhenggongsizhanghuEntity> wrapper) {
		  Page<JiazhenggongsizhanghuView> page =new Query<JiazhenggongsizhanghuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiazhenggongsizhanghuVO> selectListVO(Wrapper<JiazhenggongsizhanghuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiazhenggongsizhanghuVO selectVO(Wrapper<JiazhenggongsizhanghuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiazhenggongsizhanghuView> selectListView(Wrapper<JiazhenggongsizhanghuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiazhenggongsizhanghuView selectView(Wrapper<JiazhenggongsizhanghuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
