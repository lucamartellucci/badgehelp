package it.badgemania.badgehelp.foursquare.model.entity;


public class CheckinGroup extends Group<Checkin> {

  private static final long serialVersionUID = -6971992363107984905L;

  @Override
  public Checkin[] getItems() {
    return items;
  }
  
  private Checkin[] items;
}
