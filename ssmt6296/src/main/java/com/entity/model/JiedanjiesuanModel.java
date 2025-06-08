package com.entity.model;

import com.entity.JiedanjiesuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 接单结算
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-12 15:40:45
 */
public class JiedanjiesuanModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 接单员姓名
	 */
	
	private String jiedanyuanxingming;
		
	/**
	 * 结算时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
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
