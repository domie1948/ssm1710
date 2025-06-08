package com.entity.vo;

import com.entity.FuwuyewuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 服务业务
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-12 15:40:45
 */
public class FuwuyewuVO  implements Serializable {
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
