package it.badgemania.badgehelp.foursquare.model.entity;

import java.io.Serializable;



/**
 * Class representing Recommended entity
 * 
 * @see <a href="" target="_blank"></a>
 * 
 * @author Antti Leppä
 */
public class Recommended implements Serializable {

  private static final long serialVersionUID = -6061498154797516492L;
  
  /**
   * Constructor
   * 
   * @param keywords keyword group
   * @param groups recommendation groups
   * @param warning warning
   */
  public Recommended(KeywordGroup keywords, RecommendationGroup[] groups, Warning warning) {
    this.keywords = keywords;
    this.groups = groups;
    this.warning = warning;
  }

  /**
   * Returns keywords
   * 
   * @return keywords
   */
  public KeywordGroup getKeywords() {
    return keywords;
  }
  
  /**
   * Returns recommendation groups
   * 
   * @return recommendation groups
   */
  public RecommendationGroup[] getGroups() {
    return groups;
  }
  
  /**
   * Returns warning
   * 
   * @return warning
   */
  public Warning getWarning() {
    return warning;
  }
  
  private KeywordGroup keywords;
  private RecommendationGroup[] groups;
  private Warning warning;
}
