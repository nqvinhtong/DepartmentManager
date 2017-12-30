package com.vin.stanford.entity;

public class Item {
	
	public Item() {
		
	}
	public Item(Integer key, String value) {
		super();
		this.key = key;
		this.value = value;
	}
	
	private Integer key;
	private String value;
	
	public Integer getKey() {
		return key;
	}
	public void setKey(Integer key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
