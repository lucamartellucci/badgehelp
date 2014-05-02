/*
 * FoursquareAPI - Foursquare API for Java
 * Copyright (C) 2008 - 2011 Antti Leppä / Foyt
 * http://www.foyt.fi
 * 
 * License: 
 * 
 * Licensed under GNU Lesser General Public License Version 3 or later (the "LGPL")
 * http://www.gnu.org/licenses/lgpl.html
 */

package it.badgemania.badgehelp.foursquare.model.notification;


import it.badgemania.badgehelp.foursquare.model.entity.LeaderboardItem;
import it.badgemania.badgehelp.foursquare.model.entity.LeaderboardScore;

import java.io.Serializable;

/**
 * Entity representing "Leaderboard" notification
 * 
 * @author Antti Leppä
 */
public class LeaderboardNotification implements Serializable {

  private static final long serialVersionUID = 8919261709842197077L;

  /**
   * Returns array of LeaderboardItem entities
   * 
   * @return array of LeaderboardItem entities
   */
  public LeaderboardItem[] getLeaderboard() {
    return leaderboard;
  }
  
  /**
   * Returns message
   * 
   * @return message
   */
  public String getMessage() {
    return message;
  }

  /**
   * Returns array of LeaderboardScore entities
   * 
   * @return array of LeaderboardScore entities
   */
  public LeaderboardScore[] getScores() {
    return scores;
  }
  
  /**
   * Returns total
   * 
   * @return total
   */
  public Long getTotal() {
    return total;
  }
  
  private LeaderboardItem[] leaderboard;
  private String message;
  private LeaderboardScore[] scores;
  private Long total;
} 