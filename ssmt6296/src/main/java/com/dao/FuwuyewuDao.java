package com.dao;

import com.entity.FuwuyewuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FuwuyewuVO;
import com.entity.view.FuwuyewuView;


/**
 * 服务业务
 * 
 * @author 
 * @email 
 * @date 2021-03-12 15:40:45
 */
public interface FuwuyewuDao extends BaseMapper<FuwuyewuEntity> {
	
	List<FuwuyewuVO> selectListVO(@Param("ew") Wrapper<FuwuyewuEntity> wrapper);
	
	FuwuyewuVO selectVO(@Param("ew") Wrapper<FuwuyewuEntity> wrapper);
	
	List<FuwuyewuView> selectListView(@Param("ew") Wrapper<FuwuyewuEntity> wrapper);

	List<FuwuyewuView> selectListView(Pagination page,@Param("ew") Wrapper<FuwuyewuEntity> wrapper);
	
	FuwuyewuView selectView(@Param("ew") Wrapper<FuwuyewuEntity> wrapper);
	
}
