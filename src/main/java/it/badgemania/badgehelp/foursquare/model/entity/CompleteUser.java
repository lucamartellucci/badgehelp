package it.badgemania.badgehelp.foursquare.model.entity;

public class CompleteUser extends CompactUser {

	private static final long serialVersionUID = 8689854240168137995L;

	private String type;
	private Contact contact;
	private Boolean pings;
	private Count badges;
	private CheckinGroup checkins;
	private VenueGroup mayorships;
	private TipGroup tips;
	private TodoGroup todos;
	private UserGroups friends;
	private Followers followers;
	private Count following;
	private Count requests;
	private Scores scores;
	private String bio;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public Boolean getPings() {
		return pings;
	}

	public void setPings(Boolean pings) {
		this.pings = pings;
	}

	public Count getBadges() {
		return badges;
	}

	public void setBadges(Count badges) {
		this.badges = badges;
	}

	public CheckinGroup getCheckins() {
		return checkins;
	}

	public void setCheckins(CheckinGroup checkins) {
		this.checkins = checkins;
	}

	public VenueGroup getMayorships() {
		return mayorships;
	}

	public void setMayorships(VenueGroup mayorships) {
		this.mayorships = mayorships;
	}

	public TipGroup getTips() {
		return tips;
	}

	public void setTips(TipGroup tips) {
		this.tips = tips;
	}

	public TodoGroup getTodos() {
		return todos;
	}

	public void setTodos(TodoGroup todos) {
		this.todos = todos;
	}

	public UserGroups getFriends() {
		return friends;
	}

	public void setFriends(UserGroups friends) {
		this.friends = friends;
	}

	public Followers getFollowers() {
		return followers;
	}

	public void setFollowers(Followers followers) {
		this.followers = followers;
	}

	public Count getFollowing() {
		return following;
	}

	public void setFollowing(Count following) {
		this.following = following;
	}

	public Count getRequests() {
		return requests;
	}

	public void setRequests(Count requests) {
		this.requests = requests;
	}

	public Scores getScores() {
		return scores;
	}

	public void setScores(Scores scores) {
		this.scores = scores;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

}
