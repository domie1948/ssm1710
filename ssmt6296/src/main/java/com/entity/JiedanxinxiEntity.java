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
 * 接单信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-12 15:40:45
 */
@TableName("jiedanxinxi")
public class JiedanxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiedanxinxiEntity() {
		
	}
	
	public JiedanxinxiEntity(T t) {
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
	 * 下单编号
	 */
					
	private String xiadanbianhao;
	
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
	 * 设置：下单编号
	 */
	public void setXiadanbianhao(String xiadanbianhao) {
		this.xiadanbianhao = xiadanbianhao;
	}
	/**
	 * 获取：下单编号
	 */
	public String getXiadanbianhao() {
		return xiadanbianhao;
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
