package com.chenyuantech.eps.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AllkindExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public AllkindExample() {
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

        public Criteria andUuidIsNull() {
            addCriterion("UUID is null");
            return (Criteria) this;
        }

        public Criteria andUuidIsNotNull() {
            addCriterion("UUID is not null");
            return (Criteria) this;
        }

        public Criteria andUuidEqualTo(String value) {
            addCriterion("UUID =", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotEqualTo(String value) {
            addCriterion("UUID <>", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThan(String value) {
            addCriterion("UUID >", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThanOrEqualTo(String value) {
            addCriterion("UUID >=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThan(String value) {
            addCriterion("UUID <", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThanOrEqualTo(String value) {
            addCriterion("UUID <=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLike(String value) {
            addCriterion("UUID like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotLike(String value) {
            addCriterion("UUID not like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidIn(List<String> values) {
            addCriterion("UUID in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotIn(List<String> values) {
            addCriterion("UUID not in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidBetween(String value1, String value2) {
            addCriterion("UUID between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotBetween(String value1, String value2) {
            addCriterion("UUID not between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andKindidIsNull() {
            addCriterion("KINDID is null");
            return (Criteria) this;
        }

        public Criteria andKindidIsNotNull() {
            addCriterion("KINDID is not null");
            return (Criteria) this;
        }

        public Criteria andKindidEqualTo(Integer value) {
            addCriterion("KINDID =", value, "kindid");
            return (Criteria) this;
        }

        public Criteria andKindidNotEqualTo(Integer value) {
            addCriterion("KINDID <>", value, "kindid");
            return (Criteria) this;
        }

        public Criteria andKindidGreaterThan(Integer value) {
            addCriterion("KINDID >", value, "kindid");
            return (Criteria) this;
        }

        public Criteria andKindidGreaterThanOrEqualTo(Integer value) {
            addCriterion("KINDID >=", value, "kindid");
            return (Criteria) this;
        }

        public Criteria andKindidLessThan(Integer value) {
            addCriterion("KINDID <", value, "kindid");
            return (Criteria) this;
        }

        public Criteria andKindidLessThanOrEqualTo(Integer value) {
            addCriterion("KINDID <=", value, "kindid");
            return (Criteria) this;
        }

        public Criteria andKindidIn(List<Integer> values) {
            addCriterion("KINDID in", values, "kindid");
            return (Criteria) this;
        }

        public Criteria andKindidNotIn(List<Integer> values) {
            addCriterion("KINDID not in", values, "kindid");
            return (Criteria) this;
        }

        public Criteria andKindidBetween(Integer value1, Integer value2) {
            addCriterion("KINDID between", value1, value2, "kindid");
            return (Criteria) this;
        }

        public Criteria andKindidNotBetween(Integer value1, Integer value2) {
            addCriterion("KINDID not between", value1, value2, "kindid");
            return (Criteria) this;
        }

        public Criteria andKindpidIsNull() {
            addCriterion("KINDPID is null");
            return (Criteria) this;
        }

        public Criteria andKindpidIsNotNull() {
            addCriterion("KINDPID is not null");
            return (Criteria) this;
        }

        public Criteria andKindpidEqualTo(String value) {
            addCriterion("KINDPID =", value, "kindpid");
            return (Criteria) this;
        }

        public Criteria andKindpidNotEqualTo(String value) {
            addCriterion("KINDPID <>", value, "kindpid");
            return (Criteria) this;
        }

        public Criteria andKindpidGreaterThan(String value) {
            addCriterion("KINDPID >", value, "kindpid");
            return (Criteria) this;
        }

        public Criteria andKindpidGreaterThanOrEqualTo(String value) {
            addCriterion("KINDPID >=", value, "kindpid");
            return (Criteria) this;
        }

        public Criteria andKindpidLessThan(String value) {
            addCriterion("KINDPID <", value, "kindpid");
            return (Criteria) this;
        }

        public Criteria andKindpidLessThanOrEqualTo(String value) {
            addCriterion("KINDPID <=", value, "kindpid");
            return (Criteria) this;
        }

        public Criteria andKindpidLike(String value) {
            addCriterion("KINDPID like", value, "kindpid");
            return (Criteria) this;
        }

        public Criteria andKindpidNotLike(String value) {
            addCriterion("KINDPID not like", value, "kindpid");
            return (Criteria) this;
        }

        public Criteria andKindpidIn(List<String> values) {
            addCriterion("KINDPID in", values, "kindpid");
            return (Criteria) this;
        }

        public Criteria andKindpidNotIn(List<String> values) {
            addCriterion("KINDPID not in", values, "kindpid");
            return (Criteria) this;
        }

        public Criteria andKindpidBetween(String value1, String value2) {
            addCriterion("KINDPID between", value1, value2, "kindpid");
            return (Criteria) this;
        }

        public Criteria andKindpidNotBetween(String value1, String value2) {
            addCriterion("KINDPID not between", value1, value2, "kindpid");
            return (Criteria) this;
        }

        public Criteria andKindnoIsNull() {
            addCriterion("KINDNO is null");
            return (Criteria) this;
        }

        public Criteria andKindnoIsNotNull() {
            addCriterion("KINDNO is not null");
            return (Criteria) this;
        }

        public Criteria andKindnoEqualTo(String value) {
            addCriterion("KINDNO =", value, "kindno");
            return (Criteria) this;
        }

        public Criteria andKindnoNotEqualTo(String value) {
            addCriterion("KINDNO <>", value, "kindno");
            return (Criteria) this;
        }

        public Criteria andKindnoGreaterThan(String value) {
            addCriterion("KINDNO >", value, "kindno");
            return (Criteria) this;
        }

        public Criteria andKindnoGreaterThanOrEqualTo(String value) {
            addCriterion("KINDNO >=", value, "kindno");
            return (Criteria) this;
        }

        public Criteria andKindnoLessThan(String value) {
            addCriterion("KINDNO <", value, "kindno");
            return (Criteria) this;
        }

        public Criteria andKindnoLessThanOrEqualTo(String value) {
            addCriterion("KINDNO <=", value, "kindno");
            return (Criteria) this;
        }

        public Criteria andKindnoLike(String value) {
            addCriterion("KINDNO like", value, "kindno");
            return (Criteria) this;
        }

        public Criteria andKindnoNotLike(String value) {
            addCriterion("KINDNO not like", value, "kindno");
            return (Criteria) this;
        }

        public Criteria andKindnoIn(List<String> values) {
            addCriterion("KINDNO in", values, "kindno");
            return (Criteria) this;
        }

        public Criteria andKindnoNotIn(List<String> values) {
            addCriterion("KINDNO not in", values, "kindno");
            return (Criteria) this;
        }

        public Criteria andKindnoBetween(String value1, String value2) {
            addCriterion("KINDNO between", value1, value2, "kindno");
            return (Criteria) this;
        }

        public Criteria andKindnoNotBetween(String value1, String value2) {
            addCriterion("KINDNO not between", value1, value2, "kindno");
            return (Criteria) this;
        }

        public Criteria andKindnameIsNull() {
            addCriterion("KINDNAME is null");
            return (Criteria) this;
        }

        public Criteria andKindnameIsNotNull() {
            addCriterion("KINDNAME is not null");
            return (Criteria) this;
        }

        public Criteria andKindnameEqualTo(String value) {
            addCriterion("KINDNAME =", value, "kindname");
            return (Criteria) this;
        }

        public Criteria andKindnameNotEqualTo(String value) {
            addCriterion("KINDNAME <>", value, "kindname");
            return (Criteria) this;
        }

        public Criteria andKindnameGreaterThan(String value) {
            addCriterion("KINDNAME >", value, "kindname");
            return (Criteria) this;
        }

        public Criteria andKindnameGreaterThanOrEqualTo(String value) {
            addCriterion("KINDNAME >=", value, "kindname");
            return (Criteria) this;
        }

        public Criteria andKindnameLessThan(String value) {
            addCriterion("KINDNAME <", value, "kindname");
            return (Criteria) this;
        }

        public Criteria andKindnameLessThanOrEqualTo(String value) {
            addCriterion("KINDNAME <=", value, "kindname");
            return (Criteria) this;
        }

        public Criteria andKindnameLike(String value) {
            addCriterion("KINDNAME like", value, "kindname");
            return (Criteria) this;
        }

        public Criteria andKindnameNotLike(String value) {
            addCriterion("KINDNAME not like", value, "kindname");
            return (Criteria) this;
        }

        public Criteria andKindnameIn(List<String> values) {
            addCriterion("KINDNAME in", values, "kindname");
            return (Criteria) this;
        }

        public Criteria andKindnameNotIn(List<String> values) {
            addCriterion("KINDNAME not in", values, "kindname");
            return (Criteria) this;
        }

        public Criteria andKindnameBetween(String value1, String value2) {
            addCriterion("KINDNAME between", value1, value2, "kindname");
            return (Criteria) this;
        }

        public Criteria andKindnameNotBetween(String value1, String value2) {
            addCriterion("KINDNAME not between", value1, value2, "kindname");
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

        public Criteria andBzIsNull() {
            addCriterion("BZ is null");
            return (Criteria) this;
        }

        public Criteria andBzIsNotNull() {
            addCriterion("BZ is not null");
            return (Criteria) this;
        }

        public Criteria andBzEqualTo(String value) {
            addCriterion("BZ =", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotEqualTo(String value) {
            addCriterion("BZ <>", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThan(String value) {
            addCriterion("BZ >", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThanOrEqualTo(String value) {
            addCriterion("BZ >=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThan(String value) {
            addCriterion("BZ <", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThanOrEqualTo(String value) {
            addCriterion("BZ <=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLike(String value) {
            addCriterion("BZ like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotLike(String value) {
            addCriterion("BZ not like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzIn(List<String> values) {
            addCriterion("BZ in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotIn(List<String> values) {
            addCriterion("BZ not in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzBetween(String value1, String value2) {
            addCriterion("BZ between", value1, value2, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotBetween(String value1, String value2) {
            addCriterion("BZ not between", value1, value2, "bz");
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