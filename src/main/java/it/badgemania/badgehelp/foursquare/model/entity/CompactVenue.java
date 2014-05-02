package it.badgemania.badgehelp.foursquare.model.entity;

import java.io.Serializable;

public class CompactVenue implements Serializable {

	private static final long serialVersionUID = -7714811839778109046L;
	
	private String id;
	private String name;
	private Boolean verified;
	private Contact contact;
	private Location location;
	private Category[] categories;
	private Specials specials;
	private HereNow hereNow;
	private Stats stats;
	private String url;
	private Tips tips;
	private TodoGroup todos;
	private String referralId;
	private String storeId;
	private VenuePage venuePage;
	
	public String getStoreId() {
		return storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	public VenuePage getVenuePage() {
		return venuePage;
	}
	public void setVenuePage(VenuePage venuePage) {
		this.venuePage = venuePage;
	}
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
	public Boolean getVerified() {
		return verified;
	}
	public void setVerified(Boolean verified) {
		this.verified = verified;
	}
	public Contact getContact() {
		return contact;
	}
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public Category[] getCategories() {
		return categories;
	}
	public void setCategories(Category[] categories) {
		this.categories = categories;
	}
	public Specials getSpecials() {
		return specials;
	}
	public void setSpecials(Specials specials) {
		this.specials = specials;
	}
	public HereNow getHereNow() {
		return hereNow;
	}
	public void setHereNow(HereNow hereNow) {
		this.hereNow = hereNow;
	}
	public Stats getStats() {
		return stats;
	}
	public void setStats(Stats stats) {
		this.stats = stats;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Tips getTips() {
		return tips;
	}
	public void setTips(Tips tips) {
		this.tips = tips;
	}
	public TodoGroup getTodos() {
		return todos;
	}
	public void setTodos(TodoGroup todos) {
		this.todos = todos;
	}
	public String getReferralId() {
		return referralId;
	}
	public void setReferralId(String referralId) {
		this.referralId = referralId;
	}
	
	
}
