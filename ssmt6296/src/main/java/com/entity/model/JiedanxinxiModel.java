package com.entity.model;

import com.entity.JiedanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 接单信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-12 15:40:45
 */
public class JiedanxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 业务名称
	 */
	
	private String yewumingcheng;
		
	/**
	 * 业务类型
	 */
	
	private String yewuleixing;
		
	/**
	 * 价格
	 */
	
	private String jiage;
		
	/**
	 * 用户账号
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 下单时间
	 */
	
	private String xiadanshijian;
		
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 用户手机
	 */
	
	private String yonghushouji;
		
	/**
	 * 上门地址
	 */
	
	private String shangmendizhi;
		
	/**
	 * 接单员账号
	 */
	
	private String jiedanyuanzhanghao;
		
	/**
	 * 接单员姓名
	 */
	
	private String jiedanyuanxingming;
		
	/**
	 * 接单员手机
	 */
	
	private String jiedanyuanshouji;
		
	/**
	 * 接单时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jiedanshijian;
		
	/**
	 * 状态
	 */
	
	private String zhuangtai;
				
	
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
	 * 设置：价格
	 */
	 
	public void setJiage(String jiage) {
		this.jiage = jiage;
	}
	
	/**
	 * 获取：价格
	 */
	public String getJiage() {
		return jiage;
	}
				
	
	/**
	 * 设置：用户账号
	 */
	 
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
				
	
	/**
	 * 设置：下单时间
	 */
	 
	public void setXiadanshijian(String xiadanshijian) {
		this.xiadanshijian = xiadanshijian;
	}
	
	/**
	 * 获取：下单时间
	 */
	public String getXiadanshijian() {
		return xiadanshijian;
	}
				
	
	/**
	 * 设置：用户姓名
	 */
	 
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
				
	
	/**
	 * 设置：用户手机
	 */
	 
	public void setYonghushouji(String yonghushouji) {
		this.yonghushouji = yonghushouji;
	}
	
	/**
	 * 获取：用户手机
	 */
	public String getYonghushouji() {
		return yonghushouji;
	}
				
	
	/**
	 * 设置：上门地址
	 */
	 
	public void setShangmendizhi(String shangmendizhi) {
		this.shangmendizhi = shangmendizhi;
	}
	
	/**
	 * 获取：上门地址
	 */
	public String getShangmendizhi() {
		return shangmendizhi;
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
	 * 设置：接单员手机
	 */
	 
	public void setJiedanyuanshouji(String jiedanyuanshouji) {
		this.jiedanyuanshouji = jiedanyuanshouji;
	}
	
	/**
	 * 获取：接单员手机
	 */
	public String getJiedanyuanshouji() {
		return jiedanyuanshouji;
	}
				
	
	/**
	 * 设置：接单时间
	 */
	 
	public void setJiedanshijian(Date jiedanshijian) {
		this.jiedanshijian = jiedanshijian;
	}
	
	/**
	 * 获取：接单时间
	 */
	public Date getJiedanshijian() {
		return jiedanshijian;
	}
				
	
	/**
	 * 设置：状态
	 */
	 
	public void setZhuangtai(String zhuangtai) {
		this.zhuangtai = zhuangtai;
	}
	
	/**
	 * 获取：状态
	 */
	public String getZhuangtai() {
		return zhuangtai;
	}
			
}
