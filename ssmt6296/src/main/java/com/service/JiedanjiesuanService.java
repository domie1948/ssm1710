package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiedanjiesuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiedanjiesuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiedanjiesuanView;


/**
 * 接单结算
 *
 * @author 
 * @email 
 * @date 2021-03-12 15:40:45
 */
public interface JiedanjiesuanService extends IService<JiedanjiesuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiedanjiesuanVO> selectListVO(Wrapper<JiedanjiesuanEntity> wrapper);
   	
   	JiedanjiesuanVO selectVO(@Param("ew") Wrapper<JiedanjiesuanEntity> wrapper);
   	
   	List<JiedanjiesuanView> selectListView(Wrapper<JiedanjiesuanEntity> wrapper);
   	
   	JiedanjiesuanView selectView(@Param("ew") Wrapper<JiedanjiesuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiedanjiesuanEntity> wrapper);
   	
}

