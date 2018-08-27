package com.chenyuantech.eps.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ChgreasonExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public ChgreasonExample() {
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

        public Criteria andChgidIsNull() {
            addCriterion("CHGID is null");
            return (Criteria) this;
        }

        public Criteria andChgidIsNotNull() {
            addCriterion("CHGID is not null");
            return (Criteria) this;
        }

        public Criteria andChgidEqualTo(String value) {
            addCriterion("CHGID =", value, "chgid");
            return (Criteria) this;
        }

        public Criteria andChgidNotEqualTo(String value) {
            addCriterion("CHGID <>", value, "chgid");
            return (Criteria) this;
        }

        public Criteria andChgidGreaterThan(String value) {
            addCriterion("CHGID >", value, "chgid");
            return (Criteria) this;
        }

        public Criteria andChgidGreaterThanOrEqualTo(String value) {
            addCriterion("CHGID >=", value, "chgid");
            return (Criteria) this;
        }

        public Criteria andChgidLessThan(String value) {
            addCriterion("CHGID <", value, "chgid");
            return (Criteria) this;
        }

        public Criteria andChgidLessThanOrEqualTo(String value) {
            addCriterion("CHGID <=", value, "chgid");
            return (Criteria) this;
        }

        public Criteria andChgidLike(String value) {
            addCriterion("CHGID like", value, "chgid");
            return (Criteria) this;
        }

        public Criteria andChgidNotLike(String value) {
            addCriterion("CHGID not like", value, "chgid");
            return (Criteria) this;
        }

        public Criteria andChgidIn(List<String> values) {
            addCriterion("CHGID in", values, "chgid");
            return (Criteria) this;
        }

        public Criteria andChgidNotIn(List<String> values) {
            addCriterion("CHGID not in", values, "chgid");
            return (Criteria) this;
        }

        public Criteria andChgidBetween(String value1, String value2) {
            addCriterion("CHGID between", value1, value2, "chgid");
            return (Criteria) this;
        }

        public Criteria andChgidNotBetween(String value1, String value2) {
            addCriterion("CHGID not between", value1, value2, "chgid");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("REASON is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("REASON is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("REASON =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("REASON <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("REASON >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("REASON >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("REASON <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("REASON <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("REASON like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("REASON not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("REASON in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("REASON not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("REASON between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("REASON not between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasondescIsNull() {
            addCriterion("REASONDESC is null");
            return (Criteria) this;
        }

        public Criteria andReasondescIsNotNull() {
            addCriterion("REASONDESC is not null");
            return (Criteria) this;
        }

        public Criteria andReasondescEqualTo(String value) {
            addCriterion("REASONDESC =", value, "reasondesc");
            return (Criteria) this;
        }

        public Criteria andReasondescNotEqualTo(String value) {
            addCriterion("REASONDESC <>", value, "reasondesc");
            return (Criteria) this;
        }

        public Criteria andReasondescGreaterThan(String value) {
            addCriterion("REASONDESC >", value, "reasondesc");
            return (Criteria) this;
        }

        public Criteria andReasondescGreaterThanOrEqualTo(String value) {
            addCriterion("REASONDESC >=", value, "reasondesc");
            return (Criteria) this;
        }

        public Criteria andReasondescLessThan(String value) {
            addCriterion("REASONDESC <", value, "reasondesc");
            return (Criteria) this;
        }

        public Criteria andReasondescLessThanOrEqualTo(String value) {
            addCriterion("REASONDESC <=", value, "reasondesc");
            return (Criteria) this;
        }

        public Criteria andReasondescLike(String value) {
            addCriterion("REASONDESC like", value, "reasondesc");
            return (Criteria) this;
        }

        public Criteria andReasondescNotLike(String value) {
            addCriterion("REASONDESC not like", value, "reasondesc");
            return (Criteria) this;
        }

        public Criteria andReasondescIn(List<String> values) {
            addCriterion("REASONDESC in", values, "reasondesc");
            return (Criteria) this;
        }

        public Criteria andReasondescNotIn(List<String> values) {
            addCriterion("REASONDESC not in", values, "reasondesc");
            return (Criteria) this;
        }

        public Criteria andReasondescBetween(String value1, String value2) {
            addCriterion("REASONDESC between", value1, value2, "reasondesc");
            return (Criteria) this;
        }

        public Criteria andReasondescNotBetween(String value1, String value2) {
            addCriterion("REASONDESC not between", value1, value2, "reasondesc");
            return (Criteria) this;
        }

        public Criteria andGsIsNull() {
            addCriterion("GS is null");
            return (Criteria) this;
        }

        public Criteria andGsIsNotNull() {
            addCriterion("GS is not null");
            return (Criteria) this;
        }

        public Criteria andGsEqualTo(String value) {
            addCriterion("GS =", value, "gs");
            return (Criteria) this;
        }

        public Criteria andGsNotEqualTo(String value) {
            addCriterion("GS <>", value, "gs");
            return (Criteria) this;
        }

        public Criteria andGsGreaterThan(String value) {
            addCriterion("GS >", value, "gs");
            return (Criteria) this;
        }

        public Criteria andGsGreaterThanOrEqualTo(String value) {
            addCriterion("GS >=", value, "gs");
            return (Criteria) this;
        }

        public Criteria andGsLessThan(String value) {
            addCriterion("GS <", value, "gs");
            return (Criteria) this;
        }

        public Criteria andGsLessThanOrEqualTo(String value) {
            addCriterion("GS <=", value, "gs");
            return (Criteria) this;
        }

        public Criteria andGsLike(String value) {
            addCriterion("GS like", value, "gs");
            return (Criteria) this;
        }

        public Criteria andGsNotLike(String value) {
            addCriterion("GS not like", value, "gs");
            return (Criteria) this;
        }

        public Criteria andGsIn(List<String> values) {
            addCriterion("GS in", values, "gs");
            return (Criteria) this;
        }

        public Criteria andGsNotIn(List<String> values) {
            addCriterion("GS not in", values, "gs");
            return (Criteria) this;
        }

        public Criteria andGsBetween(String value1, String value2) {
            addCriterion("GS between", value1, value2, "gs");
            return (Criteria) this;
        }

        public Criteria andGsNotBetween(String value1, String value2) {
            addCriterion("GS not between", value1, value2, "gs");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
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