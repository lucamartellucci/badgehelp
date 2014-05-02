package it.badgemania.badgehelp.foursquare.model.entity;

import java.io.Serializable;

public class Photo implements Serializable {

	private static final long serialVersionUID = -6641038454071667700L;

	private String id;
	private Long createdAt;
	private String url;
	private SizeGroup sizes;
	private Source source;
	private CompactUser user;
	private CompactVenue venue;
	private CompleteTip tip;
	private Checkin checkin;

	private String prefix;
	private String suffix;
	private Integer width;
	private Integer height;
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
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public SizeGroup getSizes() {
		return sizes;
	}
	public void setSizes(SizeGroup sizes) {
		this.sizes = sizes;
	}
	public Source getSource() {
		return source;
	}
	public void setSource(Source source) {
		this.source = source;
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
	public CompleteTip getTip() {
		return tip;
	}
	public void setTip(CompleteTip tip) {
		this.tip = tip;
	}
	public Checkin getCheckin() {
		return checkin;
	}
	public void setCheckin(Checkin checkin) {
		this.checkin = checkin;
	}
	public String getPrefix() {
		return prefix;
	}
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	public String getSuffix() {
		return suffix;
	}
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
	public Integer getWidth() {
		return width;
	}
	public void setWidth(Integer width) {
		this.width = width;
	}
	public Integer getHeight() {
		return height;
	}
	public void setHeight(Integer height) {
		this.height = height;
	}
	
	

}
