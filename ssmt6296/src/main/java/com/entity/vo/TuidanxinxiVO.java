package com.entity.vo;

import com.entity.TuidanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 退单信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-12 15:40:45
 */
public class TuidanxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 用户手机
	 */
	
	private String yonghushouji;
		
	/**
	 * 退单时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date tuidanshijian;
		
	/**
	 * 退单理由
	 */
	
	private String tuidanliyou;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
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
	 * 设置：退单时间
	 */
	 
	public void setTuidanshijian(Date tuidanshijian) {
		this.tuidanshijian = tuidanshijian;
	}
	
	/**
	 * 获取：退单时间
	 */
	public Date getTuidanshijian() {
		return tuidanshijian;
	}
				
	
	/**
	 * 设置：退单理由
	 */
	 
	public void setTuidanliyou(String tuidanliyou) {
		this.tuidanliyou = tuidanliyou;
	}
	
	/**
	 * 获取：退单理由
	 */
	public String getTuidanliyou() {
		return tuidanliyou;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
