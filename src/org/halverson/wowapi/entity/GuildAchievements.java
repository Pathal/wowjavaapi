package org.halverson.wowapi.entity;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: Chris
 * Date: 7/23/11
 * Time: 2:41 PM
 */
public class GuildAchievements {
    private Integer[] achievementsCompleted;
    private Long[] achievementsCompletedTimestamp;
    private Integer[] criteria;
    private Integer[] criteriaQuantity;
    private Long[] criteriaTimestamp;
    private Long[] criteriaCreated;

    public Integer[] getAchievementsCompleted() {
        return achievementsCompleted;
    }

    public void setAchievementsCompleted(Integer[] achievementsCompleted) {
        this.achievementsCompleted = achievementsCompleted;
    }

    public Long[] getAchievementsCompletedTimestamp() {
        return achievementsCompletedTimestamp;
    }

    public void setAchievementsCompletedTimestamp(Long[] achievementsCompletedTimestamp) {
        this.achievementsCompletedTimestamp = achievementsCompletedTimestamp;
    }

    public Integer[] getCriteria() {
        return criteria;
    }

    public void setCriteria(Integer[] criteria) {
        this.criteria = criteria;
    }

    public Integer[] getCriteriaQuantity() {
        return criteriaQuantity;
    }

    public void setCriteriaQuantity(Integer[] criteriaQuantity) {
        this.criteriaQuantity = criteriaQuantity;
    }

    public Long[] getCriteriaTimestamp() {
        return criteriaTimestamp;
    }

    public void setCriteriaTimestamp(Long[] criteriaTimestamp) {
        this.criteriaTimestamp = criteriaTimestamp;
    }

    public Long[] getCriteriaCreated() {
        return criteriaCreated;
    }

    public void setCriteriaCreated(Long[] criteriaCreated) {
        this.criteriaCreated = criteriaCreated;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("CharacterAchievements");
        sb.append("{achievementsCompleted=").append(achievementsCompleted == null ? "null" : Arrays.asList(achievementsCompleted).toString());
        sb.append(", achievementsCompletedTimestamp=").append(achievementsCompletedTimestamp == null ? "null" : Arrays.asList(achievementsCompletedTimestamp).toString());
        sb.append(", criteria=").append(criteria == null ? "null" : Arrays.asList(criteria).toString());
        sb.append(", criteriaQuantity=").append(criteriaQuantity == null ? "null" : Arrays.asList(criteriaQuantity).toString());
        sb.append(", criteriaTimestamp=").append(criteriaTimestamp == null ? "null" : Arrays.asList(criteriaTimestamp).toString());
        sb.append(", criteriaCreated=").append(criteriaCreated == null ? "null" : Arrays.asList(criteriaCreated).toString());
        sb.append('}');
        return sb.toString();
    }
}
