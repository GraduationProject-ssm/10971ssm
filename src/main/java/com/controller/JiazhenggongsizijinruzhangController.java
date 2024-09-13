package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.JiazhenggongsizijinruzhangEntity;
import com.entity.view.JiazhenggongsizijinruzhangView;

import com.service.JiazhenggongsizijinruzhangService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 家政公司资金入账
 * 后端接口
 * @author 
 * @email 
 * @date 2021-01-25 15:02:11
 */
@RestController
@RequestMapping("/jiazhenggongsizijinruzhang")
public class JiazhenggongsizijinruzhangController {
    @Autowired
    private JiazhenggongsizijinruzhangService jiazhenggongsizijinruzhangService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JiazhenggongsizijinruzhangEntity jiazhenggongsizijinruzhang, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiazhenggongsi")) {
			jiazhenggongsizijinruzhang.setGongsibianhao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<JiazhenggongsizijinruzhangEntity> ew = new EntityWrapper<JiazhenggongsizijinruzhangEntity>();
		PageUtils page = jiazhenggongsizijinruzhangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiazhenggongsizijinruzhang), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JiazhenggongsizijinruzhangEntity jiazhenggongsizijinruzhang, HttpServletRequest request){
        EntityWrapper<JiazhenggongsizijinruzhangEntity> ew = new EntityWrapper<JiazhenggongsizijinruzhangEntity>();
		PageUtils page = jiazhenggongsizijinruzhangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiazhenggongsizijinruzhang), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JiazhenggongsizijinruzhangEntity jiazhenggongsizijinruzhang){
       	EntityWrapper<JiazhenggongsizijinruzhangEntity> ew = new EntityWrapper<JiazhenggongsizijinruzhangEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jiazhenggongsizijinruzhang, "jiazhenggongsizijinruzhang")); 
        return R.ok().put("data", jiazhenggongsizijinruzhangService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JiazhenggongsizijinruzhangEntity jiazhenggongsizijinruzhang){
        EntityWrapper< JiazhenggongsizijinruzhangEntity> ew = new EntityWrapper< JiazhenggongsizijinruzhangEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jiazhenggongsizijinruzhang, "jiazhenggongsizijinruzhang")); 
		JiazhenggongsizijinruzhangView jiazhenggongsizijinruzhangView =  jiazhenggongsizijinruzhangService.selectView(ew);
		return R.ok("查询家政公司资金入账成功").put("data", jiazhenggongsizijinruzhangView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JiazhenggongsizijinruzhangEntity jiazhenggongsizijinruzhang = jiazhenggongsizijinruzhangService.selectById(id);
        return R.ok().put("data", jiazhenggongsizijinruzhang);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JiazhenggongsizijinruzhangEntity jiazhenggongsizijinruzhang = jiazhenggongsizijinruzhangService.selectById(id);
        return R.ok().put("data", jiazhenggongsizijinruzhang);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JiazhenggongsizijinruzhangEntity jiazhenggongsizijinruzhang, HttpServletRequest request){
    	jiazhenggongsizijinruzhang.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiazhenggongsizijinruzhang);

        jiazhenggongsizijinruzhangService.insert(jiazhenggongsizijinruzhang);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JiazhenggongsizijinruzhangEntity jiazhenggongsizijinruzhang, HttpServletRequest request){
    	jiazhenggongsizijinruzhang.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiazhenggongsizijinruzhang);

        jiazhenggongsizijinruzhangService.insert(jiazhenggongsizijinruzhang);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody JiazhenggongsizijinruzhangEntity jiazhenggongsizijinruzhang, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jiazhenggongsizijinruzhang);
        jiazhenggongsizijinruzhangService.updateById(jiazhenggongsizijinruzhang);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jiazhenggongsizijinruzhangService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<JiazhenggongsizijinruzhangEntity> wrapper = new EntityWrapper<JiazhenggongsizijinruzhangEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiazhenggongsi")) {
			wrapper.eq("gongsibianhao", (String)request.getSession().getAttribute("username"));
		}

		int count = jiazhenggongsizijinruzhangService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
