package org.freedom.boot.bean;

import java.util.Date;
import java.util.List;

public class Order {
	private Integer orderId;

	private Date createTime;

	private Integer orderStateId;

	private Integer userId;

	private Integer addressId;

	private Boolean flag;

	private String remark;

	private List<OrderItem> orderItem;
	
	private Address address;

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(Integer orderId, Date createTime, Integer orderStateId, Integer userId, Integer addressId,
			Boolean flag, String remark) {
		super();
		this.orderId = orderId;
		this.createTime = createTime;
		this.orderStateId = orderStateId;
		this.userId = userId;
		this.addressId = addressId;
		this.flag = flag;
		this.remark = remark;
	}
	
	

	public List<OrderItem> getOrderItem() {
		return orderItem;
	}

	public void setOrderItem(List<OrderItem> orderItem) {
		this.orderItem = orderItem;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getOrderStateId() {
		return orderStateId;
	}

	public void setOrderStateId(Integer orderStateId) {
		this.orderStateId = orderStateId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public Boolean getFlag() {
		return flag;
	}

	public void setFlag(Boolean flag) {
		this.flag = flag;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark == null ? null : remark.trim();
	}
}