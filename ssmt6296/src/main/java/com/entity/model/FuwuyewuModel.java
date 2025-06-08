package com.entity.model;

import com.entity.FuwuyewuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 服务业务
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-12 15:40:45
 */
public class FuwuyewuModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 业务类型
	 */
	
	private String yewuleixing;
		
	/**
	 * 封面图片
	 */
	
	private String fengmiantupian;
		
	/**
	 * 承接时间
	 */
	
	private String chengjieshijian;
		
	/**
	 * 业务详情
	 */
	
	private String yewuxiangqing;
		
	/**
	 * 价格
	 */
	
	private Integer jiage;
				
	
	/**
	 * 设置：业务类型
	 */
	 
	public void setYewuleixing(String yewuleixing) {
		this.yewuleixing = yewuleixing;
	}
	
	/**
	 * 获取：业务类型
	 */
	public String getYewuleixing() {
		return yewuleixing;
	}
				
	
	/**
	 * 设置：封面图片
	 */
	 
	public void setFengmiantupian(String fengmiantupian) {
		this.fengmiantupian = fengmiantupian;
	}
	
	/**
	 * 获取：封面图片
	 */
	public String getFengmiantupian() {
		return fengmiantupian;
	}
				
	
	/**
	 * 设置：承接时间
	 */
	 
	public void setChengjieshijian(String chengjieshijian) {
		this.chengjieshijian = chengjieshijian;
	}
	
	/**
	 * 获取：承接时间
	 */
	public String getChengjieshijian() {
		return chengjieshijian;
	}
				
	
	/**
	 * 设置：业务详情
	 */
	 
	public void setYewuxiangqing(String yewuxiangqing) {
		this.yewuxiangqing = yewuxiangqing;
	}
	
	/**
	 * 获取：业务详情
	 */
	public String getYewuxiangqing() {
		return yewuxiangqing;
	}
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setJiage(Integer jiage) {
		this.jiage = jiage;
	}
	
	/**
	 * 获取：价格
	 */
	public Integer getJiage() {
		return jiage;
	}
			
}
