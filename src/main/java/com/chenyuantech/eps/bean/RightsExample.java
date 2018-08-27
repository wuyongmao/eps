package com.chenyuantech.eps.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class RightsExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public RightsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria implements Serializable {
        /**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andRightsidIsNull() {
            addCriterion("RIGHTSID is null");
            return (Criteria) this;
        }

        public Criteria andRightsidIsNotNull() {
            addCriterion("RIGHTSID is not null");
            return (Criteria) this;
        }

        public Criteria andRightsidEqualTo(String value) {
            addCriterion("RIGHTSID =", value, "rightsid");
            return (Criteria) this;
        }

        public Criteria andRightsidNotEqualTo(String value) {
            addCriterion("RIGHTSID <>", value, "rightsid");
            return (Criteria) this;
        }

        public Criteria andRightsidGreaterThan(String value) {
            addCriterion("RIGHTSID >", value, "rightsid");
            return (Criteria) this;
        }

        public Criteria andRightsidGreaterThanOrEqualTo(String value) {
            addCriterion("RIGHTSID >=", value, "rightsid");
            return (Criteria) this;
        }

        public Criteria andRightsidLessThan(String value) {
            addCriterion("RIGHTSID <", value, "rightsid");
            return (Criteria) this;
        }

        public Criteria andRightsidLessThanOrEqualTo(String value) {
            addCriterion("RIGHTSID <=", value, "rightsid");
            return (Criteria) this;
        }

        public Criteria andRightsidLike(String value) {
            addCriterion("RIGHTSID like", value, "rightsid");
            return (Criteria) this;
        }

        public Criteria andRightsidNotLike(String value) {
            addCriterion("RIGHTSID not like", value, "rightsid");
            return (Criteria) this;
        }

        public Criteria andRightsidIn(List<String> values) {
            addCriterion("RIGHTSID in", values, "rightsid");
            return (Criteria) this;
        }

        public Criteria andRightsidNotIn(List<String> values) {
            addCriterion("RIGHTSID not in", values, "rightsid");
            return (Criteria) this;
        }

        public Criteria andRightsidBetween(String value1, String value2) {
            addCriterion("RIGHTSID between", value1, value2, "rightsid");
            return (Criteria) this;
        }

        public Criteria andRightsidNotBetween(String value1, String value2) {
            addCriterion("RIGHTSID not between", value1, value2, "rightsid");
            return (Criteria) this;
        }

        public Criteria andAccidIsNull() {
            addCriterion("ACCID is null");
            return (Criteria) this;
        }

        public Criteria andAccidIsNotNull() {
            addCriterion("ACCID is not null");
            return (Criteria) this;
        }

        public Criteria andAccidEqualTo(Long value) {
            addCriterion("ACCID =", value, "accid");
            return (Criteria) this;
        }

        public Criteria andAccidNotEqualTo(Long value) {
            addCriterion("ACCID <>", value, "accid");
            return (Criteria) this;
        }

        public Criteria andAccidGreaterThan(Long value) {
            addCriterion("ACCID >", value, "accid");
            return (Criteria) this;
        }

        public Criteria andAccidGreaterThanOrEqualTo(Long value) {
            addCriterion("ACCID >=", value, "accid");
            return (Criteria) this;
        }

        public Criteria andAccidLessThan(Long value) {
            addCriterion("ACCID <", value, "accid");
            return (Criteria) this;
        }

        public Criteria andAccidLessThanOrEqualTo(Long value) {
            addCriterion("ACCID <=", value, "accid");
            return (Criteria) this;
        }

        public Criteria andAccidIn(List<Long> values) {
            addCriterion("ACCID in", values, "accid");
            return (Criteria) this;
        }

        public Criteria andAccidNotIn(List<Long> values) {
            addCriterion("ACCID not in", values, "accid");
            return (Criteria) this;
        }

        public Criteria andAccidBetween(Long value1, Long value2) {
            addCriterion("ACCID between", value1, value2, "accid");
            return (Criteria) this;
        }

        public Criteria andAccidNotBetween(Long value1, Long value2) {
            addCriterion("ACCID not between", value1, value2, "accid");
            return (Criteria) this;
        }

        public Criteria andRightlistIsNull() {
            addCriterion("RIGHTLIST is null");
            return (Criteria) this;
        }

        public Criteria andRightlistIsNotNull() {
            addCriterion("RIGHTLIST is not null");
            return (Criteria) this;
        }

        public Criteria andRightlistEqualTo(String value) {
            addCriterion("RIGHTLIST =", value, "rightlist");
            return (Criteria) this;
        }

        public Criteria andRightlistNotEqualTo(String value) {
            addCriterion("RIGHTLIST <>", value, "rightlist");
            return (Criteria) this;
        }

        public Criteria andRightlistGreaterThan(String value) {
            addCriterion("RIGHTLIST >", value, "rightlist");
            return (Criteria) this;
        }

        public Criteria andRightlistGreaterThanOrEqualTo(String value) {
            addCriterion("RIGHTLIST >=", value, "rightlist");
            return (Criteria) this;
        }

        public Criteria andRightlistLessThan(String value) {
            addCriterion("RIGHTLIST <", value, "rightlist");
            return (Criteria) this;
        }

        public Criteria andRightlistLessThanOrEqualTo(String value) {
            addCriterion("RIGHTLIST <=", value, "rightlist");
            return (Criteria) this;
        }

        public Criteria andRightlistLike(String value) {
            addCriterion("RIGHTLIST like", value, "rightlist");
            return (Criteria) this;
        }

        public Criteria andRightlistNotLike(String value) {
            addCriterion("RIGHTLIST not like", value, "rightlist");
            return (Criteria) this;
        }

        public Criteria andRightlistIn(List<String> values) {
            addCriterion("RIGHTLIST in", values, "rightlist");
            return (Criteria) this;
        }

        public Criteria andRightlistNotIn(List<String> values) {
            addCriterion("RIGHTLIST not in", values, "rightlist");
            return (Criteria) this;
        }

        public Criteria andRightlistBetween(String value1, String value2) {
            addCriterion("RIGHTLIST between", value1, value2, "rightlist");
            return (Criteria) this;
        }

        public Criteria andRightlistNotBetween(String value1, String value2) {
            addCriterion("RIGHTLIST not between", value1, value2, "rightlist");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria implements Serializable {

        /**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		protected Criteria() {
            super();
        }
    }

    public static class Criterion implements Serializable {
        /**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}