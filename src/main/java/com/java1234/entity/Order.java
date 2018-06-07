package com.java1234.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * ����ʵ����
 * @author yuyang
 *
 */
public class Order {

	private int id;
	private String orderNo;
	private Date createTime;
	private float cost;
	private int status; // ״̬  1 �����  2 ���ͨ�� 3 �����ѷ���  4 ���ջ�
	private User user;
	
	private List<OrderProduct> orderProductList=new ArrayList<OrderProduct>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public List<OrderProduct> getOrderProductList() {
		return orderProductList;
	}
	public void setOrderProductList(List<OrderProduct> orderProductList) {
		this.orderProductList = orderProductList;
	}
	
	
	
}