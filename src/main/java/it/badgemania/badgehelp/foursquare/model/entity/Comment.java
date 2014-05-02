package it.badgemania.badgehelp.foursquare.model.entity;

import java.io.Serializable;

public class Comment implements Serializable {

	private static final long serialVersionUID = 6671734583007572548L;

	private String id;
	private Long createdAt;
	private CompactUser user;
	private String text;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Long getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Long createdAt) {
		this.createdAt = createdAt;
	}
	public CompactUser getUser() {
		return user;
	}
	public void setUser(CompactUser user) {
		this.user = user;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
}
