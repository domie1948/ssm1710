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


import com.dao.JiedanyuanDao;
import com.entity.JiedanyuanEntity;
import com.service.JiedanyuanService;
import com.entity.vo.JiedanyuanVO;
import com.entity.view.JiedanyuanView;

@Service("jiedanyuanService")
public class JiedanyuanServiceImpl extends ServiceImpl<JiedanyuanDao, JiedanyuanEntity> implements JiedanyuanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiedanyuanEntity> page = this.selectPage(
                new Query<JiedanyuanEntity>(params).getPage(),
                new EntityWrapper<JiedanyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiedanyuanEntity> wrapper) {
		  Page<JiedanyuanView> page =new Query<JiedanyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiedanyuanVO> selectListVO(Wrapper<JiedanyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiedanyuanVO selectVO(Wrapper<JiedanyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiedanyuanView> selectListView(Wrapper<JiedanyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiedanyuanView selectView(Wrapper<JiedanyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
