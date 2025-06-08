package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiedanyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiedanyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiedanyuanView;


/**
 * 接单员
 *
 * @author 
 * @email 
 * @date 2021-03-12 15:40:45
 */
public interface JiedanyuanService extends IService<JiedanyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiedanyuanVO> selectListVO(Wrapper<JiedanyuanEntity> wrapper);
   	
   	JiedanyuanVO selectVO(@Param("ew") Wrapper<JiedanyuanEntity> wrapper);
   	
   	List<JiedanyuanView> selectListView(Wrapper<JiedanyuanEntity> wrapper);
   	
   	JiedanyuanView selectView(@Param("ew") Wrapper<JiedanyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiedanyuanEntity> wrapper);
   	
}

