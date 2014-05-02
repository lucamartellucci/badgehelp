package it.badgemania.badgehelp.foursquare.model.entity;

import java.io.Serializable;

public class CompactTip implements Serializable {

	private static final long serialVersionUID = 5912726139848171570L;

	private String id;
	private String text;
	private Long createdAt;
	private String status;
	private Photo photo;
	private String photourl;
	private String url;
	private CompactUser user;
	private CompactVenue venue;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Long getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Long createdAt) {
		this.createdAt = createdAt;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Photo getPhoto() {
		return photo;
	}

	public void setPhoto(Photo photo) {
		this.photo = photo;
	}

	public String getPhotourl() {
		return photourl;
	}

	public void setPhotourl(String photourl) {
		this.photourl = photourl;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public CompactUser getUser() {
		return user;
	}

	public void setUser(CompactUser user) {
		this.user = user;
	}

	public CompactVenue getVenue() {
		return venue;
	}

	public void setVenue(CompactVenue venue) {
		this.venue = venue;
	}

}
