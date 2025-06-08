package com.dao;

import com.entity.JiedanyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiedanyuanVO;
import com.entity.view.JiedanyuanView;


/**
 * 接单员
 * 
 * @author 
 * @email 
 * @date 2021-03-12 15:40:45
 */
public interface JiedanyuanDao extends BaseMapper<JiedanyuanEntity> {
	
	List<JiedanyuanVO> selectListVO(@Param("ew") Wrapper<JiedanyuanEntity> wrapper);
	
	JiedanyuanVO selectVO(@Param("ew") Wrapper<JiedanyuanEntity> wrapper);
	
	List<JiedanyuanView> selectListView(@Param("ew") Wrapper<JiedanyuanEntity> wrapper);

	List<JiedanyuanView> selectListView(Pagination page,@Param("ew") Wrapper<JiedanyuanEntity> wrapper);
	
	JiedanyuanView selectView(@Param("ew") Wrapper<JiedanyuanEntity> wrapper);
	
}
