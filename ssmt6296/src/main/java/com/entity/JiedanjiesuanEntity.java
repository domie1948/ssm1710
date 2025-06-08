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
 * 接单结算
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-12 15:40:45
 */
@TableName("jiedanjiesuan")
public class JiedanjiesuanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiedanjiesuanEntity() {
		
	}
	
	public JiedanjiesuanEntity(T t) {
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
	 * 接单员账号
	 */
					
	private String jiedanyuanzhanghao;
	
	/**
	 * 接单员姓名
	 */
					
	private String jiedanyuanxingming;
	
	/**
	 * 结算时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date jiesuanshijian;
	
	/**
	 * 接单数
	 */
					
	private Integer jiedanshu;
	
	/**
	 * 结算金额
	 */
					
	private Integer jiesuanjine;
	
	/**
	 * 备注
	 */
					
	private String beizhu;
	
	
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
	 * 设置：接单员账号
	 */
	public void setJiedanyuanzhanghao(String jiedanyuanzhanghao) {
		this.jiedanyuanzhanghao = jiedanyuanzhanghao;
	}
	/**
	 * 获取：接单员账号
	 */
	public String getJiedanyuanzhanghao() {
		return jiedanyuanzhanghao;
	}
	/**
	 * 设置：接单员姓名
	 */
	public void setJiedanyuanxingming(String jiedanyuanxingming) {
		this.jiedanyuanxingming = jiedanyuanxingming;
	}
	/**
	 * 获取：接单员姓名
	 */
	public String getJiedanyuanxingming() {
		return jiedanyuanxingming;
	}
	/**
	 * 设置：结算时间
	 */
	public void setJiesuanshijian(Date jiesuanshijian) {
		this.jiesuanshijian = jiesuanshijian;
	}
	/**
	 * 获取：结算时间
	 */
	public Date getJiesuanshijian() {
		return jiesuanshijian;
	}
	/**
	 * 设置：接单数
	 */
	public void setJiedanshu(Integer jiedanshu) {
		this.jiedanshu = jiedanshu;
	}
	/**
	 * 获取：接单数
	 */
	public Integer getJiedanshu() {
		return jiedanshu;
	}
	/**
	 * 设置：结算金额
	 */
	public void setJiesuanjine(Integer jiesuanjine) {
		this.jiesuanjine = jiesuanjine;
	}
	/**
	 * 获取：结算金额
	 */
	public Integer getJiesuanjine() {
		return jiesuanjine;
	}
	/**
	 * 设置：备注
	 */
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}

}
