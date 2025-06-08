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
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.JiedanjiesuanEntity;
import com.entity.view.JiedanjiesuanView;

import com.service.JiedanjiesuanService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 接单结算
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-12 15:40:45
 */
@RestController
@RequestMapping("/jiedanjiesuan")
public class JiedanjiesuanController {
    @Autowired
    private JiedanjiesuanService jiedanjiesuanService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JiedanjiesuanEntity jiedanjiesuan, 
                @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) Date jiesuanshijianstart,
                @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) Date jiesuanshijianend,
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiedanyuan")) {
			jiedanjiesuan.setJiedanyuanzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<JiedanjiesuanEntity> ew = new EntityWrapper<JiedanjiesuanEntity>();
                if(jiesuanshijianstart!=null) ew.ge("jiesuanshijian", jiesuanshijianstart);
                if(jiesuanshijianend!=null) ew.le("jiesuanshijian", jiesuanshijianend);
		PageUtils page = jiedanjiesuanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiedanjiesuan), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JiedanjiesuanEntity jiedanjiesuan, HttpServletRequest request){
        EntityWrapper<JiedanjiesuanEntity> ew = new EntityWrapper<JiedanjiesuanEntity>();
		PageUtils page = jiedanjiesuanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiedanjiesuan), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JiedanjiesuanEntity jiedanjiesuan){
       	EntityWrapper<JiedanjiesuanEntity> ew = new EntityWrapper<JiedanjiesuanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jiedanjiesuan, "jiedanjiesuan")); 
        return R.ok().put("data", jiedanjiesuanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JiedanjiesuanEntity jiedanjiesuan){
        EntityWrapper< JiedanjiesuanEntity> ew = new EntityWrapper< JiedanjiesuanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jiedanjiesuan, "jiedanjiesuan")); 
		JiedanjiesuanView jiedanjiesuanView =  jiedanjiesuanService.selectView(ew);
		return R.ok("查询接单结算成功").put("data", jiedanjiesuanView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JiedanjiesuanEntity jiedanjiesuan = jiedanjiesuanService.selectById(id);
        return R.ok().put("data", jiedanjiesuan);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JiedanjiesuanEntity jiedanjiesuan = jiedanjiesuanService.selectById(id);
        return R.ok().put("data", jiedanjiesuan);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JiedanjiesuanEntity jiedanjiesuan, HttpServletRequest request){
    	jiedanjiesuan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiedanjiesuan);

        jiedanjiesuanService.insert(jiedanjiesuan);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JiedanjiesuanEntity jiedanjiesuan, HttpServletRequest request){
    	jiedanjiesuan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiedanjiesuan);

        jiedanjiesuanService.insert(jiedanjiesuan);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody JiedanjiesuanEntity jiedanjiesuan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jiedanjiesuan);
        jiedanjiesuanService.updateById(jiedanjiesuan);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jiedanjiesuanService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<JiedanjiesuanEntity> wrapper = new EntityWrapper<JiedanjiesuanEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiedanyuan")) {
			wrapper.eq("jiedanyuanzhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = jiedanjiesuanService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
