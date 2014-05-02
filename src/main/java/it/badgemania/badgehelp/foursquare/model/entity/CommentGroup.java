package it.badgemania.badgehelp.foursquare.model.entity;

public class CommentGroup extends Group<Comment> {

  private static final long serialVersionUID = 7117134064654710100L;

  @Override
  public Comment[] getItems() {
    return items;
  }
  
  private Comment[] items;
}
