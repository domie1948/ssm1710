package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiadanxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiadanxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiadanxinxiView;


/**
 * 下单信息
 *
 * @author 
 * @email 
 * @date 2021-03-12 15:40:45
 */
public interface XiadanxinxiService extends IService<XiadanxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiadanxinxiVO> selectListVO(Wrapper<XiadanxinxiEntity> wrapper);
   	
   	XiadanxinxiVO selectVO(@Param("ew") Wrapper<XiadanxinxiEntity> wrapper);
   	
   	List<XiadanxinxiView> selectListView(Wrapper<XiadanxinxiEntity> wrapper);
   	
   	XiadanxinxiView selectView(@Param("ew") Wrapper<XiadanxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiadanxinxiEntity> wrapper);
   	
}

