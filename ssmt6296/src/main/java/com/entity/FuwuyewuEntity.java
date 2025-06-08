package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 服务业务
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-12 15:40:45
 */
@TableName("fuwuyewu")
public class FuwuyewuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public FuwuyewuEntity() {
		
	}
	
	public FuwuyewuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 业务名称
	 */
					
	private String yewumingcheng;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：业务名称
	 */
	public void setYewumingcheng(String yewumingcheng) {
		this.yewumingcheng = yewumingcheng;
	}
	/**
	 * 获取：业务名称
	 */
	public String getYewumingcheng() {
		return yewumingcheng;
	}
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
