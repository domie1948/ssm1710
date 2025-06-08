package com.dao;

import com.entity.JiedanjiesuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiedanjiesuanVO;
import com.entity.view.JiedanjiesuanView;


/**
 * 接单结算
 * 
 * @author 
 * @email 
 * @date 2021-03-12 15:40:45
 */
public interface JiedanjiesuanDao extends BaseMapper<JiedanjiesuanEntity> {
	
	List<JiedanjiesuanVO> selectListVO(@Param("ew") Wrapper<JiedanjiesuanEntity> wrapper);
	
	JiedanjiesuanVO selectVO(@Param("ew") Wrapper<JiedanjiesuanEntity> wrapper);
	
	List<JiedanjiesuanView> selectListView(@Param("ew") Wrapper<JiedanjiesuanEntity> wrapper);

	List<JiedanjiesuanView> selectListView(Pagination page,@Param("ew") Wrapper<JiedanjiesuanEntity> wrapper);
	
	JiedanjiesuanView selectView(@Param("ew") Wrapper<JiedanjiesuanEntity> wrapper);
	
}
