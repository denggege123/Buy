package com.java1234.entity;

/**
 * 订单商品实体类
 * @author yuyang
 *
 */
public class OrderProduct {

	private int id;
	private int num;
	private Order order;
	private Product product;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	
}
