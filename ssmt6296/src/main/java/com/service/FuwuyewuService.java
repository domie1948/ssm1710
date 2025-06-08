package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FuwuyewuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FuwuyewuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FuwuyewuView;


/**
 * 服务业务
 *
 * @author 
 * @email 
 * @date 2021-03-12 15:40:45
 */
public interface FuwuyewuService extends IService<FuwuyewuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FuwuyewuVO> selectListVO(Wrapper<FuwuyewuEntity> wrapper);
   	
   	FuwuyewuVO selectVO(@Param("ew") Wrapper<FuwuyewuEntity> wrapper);
   	
   	List<FuwuyewuView> selectListView(Wrapper<FuwuyewuEntity> wrapper);
   	
   	FuwuyewuView selectView(@Param("ew") Wrapper<FuwuyewuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FuwuyewuEntity> wrapper);
   	
}

