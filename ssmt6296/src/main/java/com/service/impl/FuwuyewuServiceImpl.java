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


import com.dao.FuwuyewuDao;
import com.entity.FuwuyewuEntity;
import com.service.FuwuyewuService;
import com.entity.vo.FuwuyewuVO;
import com.entity.view.FuwuyewuView;

@Service("fuwuyewuService")
public class FuwuyewuServiceImpl extends ServiceImpl<FuwuyewuDao, FuwuyewuEntity> implements FuwuyewuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FuwuyewuEntity> page = this.selectPage(
                new Query<FuwuyewuEntity>(params).getPage(),
                new EntityWrapper<FuwuyewuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FuwuyewuEntity> wrapper) {
		  Page<FuwuyewuView> page =new Query<FuwuyewuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FuwuyewuVO> selectListVO(Wrapper<FuwuyewuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FuwuyewuVO selectVO(Wrapper<FuwuyewuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FuwuyewuView> selectListView(Wrapper<FuwuyewuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FuwuyewuView selectView(Wrapper<FuwuyewuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
