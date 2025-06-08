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


import com.dao.XiadanxinxiDao;
import com.entity.XiadanxinxiEntity;
import com.service.XiadanxinxiService;
import com.entity.vo.XiadanxinxiVO;
import com.entity.view.XiadanxinxiView;

@Service("xiadanxinxiService")
public class XiadanxinxiServiceImpl extends ServiceImpl<XiadanxinxiDao, XiadanxinxiEntity> implements XiadanxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiadanxinxiEntity> page = this.selectPage(
                new Query<XiadanxinxiEntity>(params).getPage(),
                new EntityWrapper<XiadanxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiadanxinxiEntity> wrapper) {
		  Page<XiadanxinxiView> page =new Query<XiadanxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiadanxinxiVO> selectListVO(Wrapper<XiadanxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiadanxinxiVO selectVO(Wrapper<XiadanxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiadanxinxiView> selectListView(Wrapper<XiadanxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiadanxinxiView selectView(Wrapper<XiadanxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
