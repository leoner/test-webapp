package com.weina.test.tianji.api.model;

public class User {
	private String id;
	private String name;
	private String link;
	private Integer contact_count;
	private String picture_small;
	private String picture_large;
	private String city;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public Integer getContact_count() {
		return contact_count;
	}
	public void setContact_count(Integer contact_count) {
		this.contact_count = contact_count;
	}
	public String getPicture_small() {
		return picture_small;
	}
	public void setPicture_small(String picture_small) {
		this.picture_small = picture_small;
	}
	public String getPicture_large() {
		return picture_large;
	}
	public void setPicture_large(String picture_large) {
		this.picture_large = picture_large;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}