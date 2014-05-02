package it.badgemania.badgehelp.foursquare.model.entity;

import java.io.Serializable;



/**
 * Class representing Reason entity
 * 
 * @author Antti Leppä
 */
public class Reason implements Serializable {

  private static final long serialVersionUID = -6388056927086935959L;

  /**
   * Returns type
   * 
   * @return type
   */
  public String getType() {
    return type;
  }
  
  /**
   * Returns message
   * 
   * @return message
   */
  public String getMessage() {
    return message;
  }
  
  private String type;
  private String message;
}