package com.dao;

import com.entity.XiadanxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiadanxinxiVO;
import com.entity.view.XiadanxinxiView;


/**
 * 下单信息
 * 
 * @author 
 * @email 
 * @date 2021-03-12 15:40:45
 */
public interface XiadanxinxiDao extends BaseMapper<XiadanxinxiEntity> {
	
	List<XiadanxinxiVO> selectListVO(@Param("ew") Wrapper<XiadanxinxiEntity> wrapper);
	
	XiadanxinxiVO selectVO(@Param("ew") Wrapper<XiadanxinxiEntity> wrapper);
	
	List<XiadanxinxiView> selectListView(@Param("ew") Wrapper<XiadanxinxiEntity> wrapper);

	List<XiadanxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<XiadanxinxiEntity> wrapper);
	
	XiadanxinxiView selectView(@Param("ew") Wrapper<XiadanxinxiEntity> wrapper);
	
}
