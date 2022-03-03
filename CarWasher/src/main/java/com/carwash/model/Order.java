package com.carwash.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "orders")
public class Order {
	
	@Id
	int oid;
	private String carname;
	private String carmodel;
	private String wname;
	private int washpackId;
	private String date;
	private long phoneno;
	
	public Order()
	{
		
	}
	
	@Override
	public String toString() {
		return "Order [orderId=" + oid + ", carName=" + carname + ", carModel=" + carmodel + ", wName=" + wname
				+ ", washPackId=" + washpackId + ", date=" + date + ", phoneNo=" + phoneno + "]";
	}
	//parameterised constructor
			public Order(int orderId, String carName, String carModel, String wName, int washPackId, String date, long phoneNo) {
				super();
				this.oid = orderId;
				this.carname = carName;
				this.carmodel = carModel;
				this.wname = wName;
				this.washpackId = washPackId;
				this.date = date;
				this.phoneno = phoneNo;
			}
			//getters and setters
			public int getOrderId() {
				return oid;
			}
			public void setOrderId(int orderId) {
				this.oid = orderId;
			}
			public String getCarName() {
				return carname;
			}
			public void setCarName(String carName) {
				this.carname = carName;
			}
			public String getCarModel() {
				return carmodel;
			}
			public void setCarModel(String carModel) {
				this.carmodel = carModel;
			}
			public String getwName() {
				return wname;
			}
			public void setwName(String wName) {
				this.wname = wName;
			}
			public int getWashPackId() {
				return washpackId;
			}
			public void setWashPackId(int washPackId) {
				this.washpackId = washPackId;
			}
			public String getDate() {
				return date;
			}
			public void setDate(String date) {
				this.date = date;
			}
			public long getPhoneNo() {
				return phoneno;
			}
			public void setPhoneNo(long phoneNo) {
				this.phoneno = phoneNo;
			}

}
