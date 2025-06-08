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


import com.dao.JiedanjiesuanDao;
import com.entity.JiedanjiesuanEntity;
import com.service.JiedanjiesuanService;
import com.entity.vo.JiedanjiesuanVO;
import com.entity.view.JiedanjiesuanView;

@Service("jiedanjiesuanService")
public class JiedanjiesuanServiceImpl extends ServiceImpl<JiedanjiesuanDao, JiedanjiesuanEntity> implements JiedanjiesuanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiedanjiesuanEntity> page = this.selectPage(
                new Query<JiedanjiesuanEntity>(params).getPage(),
                new EntityWrapper<JiedanjiesuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiedanjiesuanEntity> wrapper) {
		  Page<JiedanjiesuanView> page =new Query<JiedanjiesuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiedanjiesuanVO> selectListVO(Wrapper<JiedanjiesuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiedanjiesuanVO selectVO(Wrapper<JiedanjiesuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiedanjiesuanView> selectListView(Wrapper<JiedanjiesuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiedanjiesuanView selectView(Wrapper<JiedanjiesuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
