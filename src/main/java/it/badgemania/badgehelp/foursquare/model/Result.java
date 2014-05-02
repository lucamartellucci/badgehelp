package it.badgemania.badgehelp.foursquare.model;

import it.badgemania.badgehelp.foursquare.model.notification.Notification;

import java.util.List;

public class Result<T> {
	
	private T response;
	private ResultMeta meta;
	private List<Notification<?>> notifications;
	
	public T getResponse() {
		return response;
	}
	public void setResponse(T response) {
		this.response = response;
	}
	public ResultMeta getMeta() {
		return meta;
	}
	public void setMeta(ResultMeta meta) {
		this.meta = meta;
	}
	public List<Notification<?>> getNotifications() {
		return notifications;
	}
	public void setNotifications(List<Notification<?>> notifications) {
		this.notifications = notifications;
	}
	

}
