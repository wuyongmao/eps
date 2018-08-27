package com.chenyuantech.eps.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;


 
@Component
public class DdlogExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public DdlogExample() {
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

        public Criteria andDdidIsNull() {
            addCriterion("DDID is null");
            return (Criteria) this;
        }

        public Criteria andDdidIsNotNull() {
            addCriterion("DDID is not null");
            return (Criteria) this;
        }

        public Criteria andDdidEqualTo(String value) {
            addCriterion("DDID =", value, "ddid");
            return (Criteria) this;
        }

        public Criteria andDdidNotEqualTo(String value) {
            addCriterion("DDID <>", value, "ddid");
            return (Criteria) this;
        }

        public Criteria andDdidGreaterThan(String value) {
            addCriterion("DDID >", value, "ddid");
            return (Criteria) this;
        }

        public Criteria andDdidGreaterThanOrEqualTo(String value) {
            addCriterion("DDID >=", value, "ddid");
            return (Criteria) this;
        }

        public Criteria andDdidLessThan(String value) {
            addCriterion("DDID <", value, "ddid");
            return (Criteria) this;
        }

        public Criteria andDdidLessThanOrEqualTo(String value) {
            addCriterion("DDID <=", value, "ddid");
            return (Criteria) this;
        }

        public Criteria andDdidLike(String value) {
            addCriterion("DDID like", value, "ddid");
            return (Criteria) this;
        }

        public Criteria andDdidNotLike(String value) {
            addCriterion("DDID not like", value, "ddid");
            return (Criteria) this;
        }

        public Criteria andDdidIn(List<String> values) {
            addCriterion("DDID in", values, "ddid");
            return (Criteria) this;
        }

        public Criteria andDdidNotIn(List<String> values) {
            addCriterion("DDID not in", values, "ddid");
            return (Criteria) this;
        }

        public Criteria andDdidBetween(String value1, String value2) {
            addCriterion("DDID between", value1, value2, "ddid");
            return (Criteria) this;
        }

        public Criteria andDdidNotBetween(String value1, String value2) {
            addCriterion("DDID not between", value1, value2, "ddid");
            return (Criteria) this;
        }

        public Criteria andRequirementddIsNull() {
            addCriterion("REQUIREMENTDD is null");
            return (Criteria) this;
        }

        public Criteria andRequirementddIsNotNull() {
            addCriterion("REQUIREMENTDD is not null");
            return (Criteria) this;
        }

        public Criteria andRequirementddEqualTo(String value) {
            addCriterion("REQUIREMENTDD =", value, "requirementdd");
            return (Criteria) this;
        }

        public Criteria andRequirementddNotEqualTo(String value) {
            addCriterion("REQUIREMENTDD <>", value, "requirementdd");
            return (Criteria) this;
        }

        public Criteria andRequirementddGreaterThan(String value) {
            addCriterion("REQUIREMENTDD >", value, "requirementdd");
            return (Criteria) this;
        }

        public Criteria andRequirementddGreaterThanOrEqualTo(String value) {
            addCriterion("REQUIREMENTDD >=", value, "requirementdd");
            return (Criteria) this;
        }

        public Criteria andRequirementddLessThan(String value) {
            addCriterion("REQUIREMENTDD <", value, "requirementdd");
            return (Criteria) this;
        }

        public Criteria andRequirementddLessThanOrEqualTo(String value) {
            addCriterion("REQUIREMENTDD <=", value, "requirementdd");
            return (Criteria) this;
        }

        public Criteria andRequirementddLike(String value) {
            addCriterion("REQUIREMENTDD like", value, "requirementdd");
            return (Criteria) this;
        }

        public Criteria andRequirementddNotLike(String value) {
            addCriterion("REQUIREMENTDD not like", value, "requirementdd");
            return (Criteria) this;
        }

        public Criteria andRequirementddIn(List<String> values) {
            addCriterion("REQUIREMENTDD in", values, "requirementdd");
            return (Criteria) this;
        }

        public Criteria andRequirementddNotIn(List<String> values) {
            addCriterion("REQUIREMENTDD not in", values, "requirementdd");
            return (Criteria) this;
        }

        public Criteria andRequirementddBetween(String value1, String value2) {
            addCriterion("REQUIREMENTDD between", value1, value2, "requirementdd");
            return (Criteria) this;
        }

        public Criteria andRequirementddNotBetween(String value1, String value2) {
            addCriterion("REQUIREMENTDD not between", value1, value2, "requirementdd");
            return (Criteria) this;
        }

        public Criteria andReplyddIsNull() {
            addCriterion("REPLYDD is null");
            return (Criteria) this;
        }

        public Criteria andReplyddIsNotNull() {
            addCriterion("REPLYDD is not null");
            return (Criteria) this;
        }

        public Criteria andReplyddEqualTo(String value) {
            addCriterion("REPLYDD =", value, "replydd");
            return (Criteria) this;
        }

        public Criteria andReplyddNotEqualTo(String value) {
            addCriterion("REPLYDD <>", value, "replydd");
            return (Criteria) this;
        }

        public Criteria andReplyddGreaterThan(String value) {
            addCriterion("REPLYDD >", value, "replydd");
            return (Criteria) this;
        }

        public Criteria andReplyddGreaterThanOrEqualTo(String value) {
            addCriterion("REPLYDD >=", value, "replydd");
            return (Criteria) this;
        }

        public Criteria andReplyddLessThan(String value) {
            addCriterion("REPLYDD <", value, "replydd");
            return (Criteria) this;
        }

        public Criteria andReplyddLessThanOrEqualTo(String value) {
            addCriterion("REPLYDD <=", value, "replydd");
            return (Criteria) this;
        }

        public Criteria andReplyddLike(String value) {
            addCriterion("REPLYDD like", value, "replydd");
            return (Criteria) this;
        }

        public Criteria andReplyddNotLike(String value) {
            addCriterion("REPLYDD not like", value, "replydd");
            return (Criteria) this;
        }

        public Criteria andReplyddIn(List<String> values) {
            addCriterion("REPLYDD in", values, "replydd");
            return (Criteria) this;
        }

        public Criteria andReplyddNotIn(List<String> values) {
            addCriterion("REPLYDD not in", values, "replydd");
            return (Criteria) this;
        }

        public Criteria andReplyddBetween(String value1, String value2) {
            addCriterion("REPLYDD between", value1, value2, "replydd");
            return (Criteria) this;
        }

        public Criteria andReplyddNotBetween(String value1, String value2) {
            addCriterion("REPLYDD not between", value1, value2, "replydd");
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

        public Criteria andAccidIsNull() {
            addCriterion("ACCID is null");
            return (Criteria) this;
        }

        public Criteria andAccidIsNotNull() {
            addCriterion("ACCID is not null");
            return (Criteria) this;
        }

        public Criteria andAccidEqualTo(String value) {
            addCriterion("ACCID =", value, "accid");
            return (Criteria) this;
        }

        public Criteria andAccidNotEqualTo(String value) {
            addCriterion("ACCID <>", value, "accid");
            return (Criteria) this;
        }

        public Criteria andAccidGreaterThan(String value) {
            addCriterion("ACCID >", value, "accid");
            return (Criteria) this;
        }

        public Criteria andAccidGreaterThanOrEqualTo(String value) {
            addCriterion("ACCID >=", value, "accid");
            return (Criteria) this;
        }

        public Criteria andAccidLessThan(String value) {
            addCriterion("ACCID <", value, "accid");
            return (Criteria) this;
        }

        public Criteria andAccidLessThanOrEqualTo(String value) {
            addCriterion("ACCID <=", value, "accid");
            return (Criteria) this;
        }

        public Criteria andAccidLike(String value) {
            addCriterion("ACCID like", value, "accid");
            return (Criteria) this;
        }

        public Criteria andAccidNotLike(String value) {
            addCriterion("ACCID not like", value, "accid");
            return (Criteria) this;
        }

        public Criteria andAccidIn(List<String> values) {
            addCriterion("ACCID in", values, "accid");
            return (Criteria) this;
        }

        public Criteria andAccidNotIn(List<String> values) {
            addCriterion("ACCID not in", values, "accid");
            return (Criteria) this;
        }

        public Criteria andAccidBetween(String value1, String value2) {
            addCriterion("ACCID between", value1, value2, "accid");
            return (Criteria) this;
        }

        public Criteria andAccidNotBetween(String value1, String value2) {
            addCriterion("ACCID not between", value1, value2, "accid");
            return (Criteria) this;
        }

        public Criteria andLaunchtimeIsNull() {
            addCriterion("LAUNCHTIME is null");
            return (Criteria) this;
        }

        public Criteria andLaunchtimeIsNotNull() {
            addCriterion("LAUNCHTIME is not null");
            return (Criteria) this;
        }

        public Criteria andLaunchtimeEqualTo(String value) {
            addCriterion("LAUNCHTIME =", value, "launchtime");
            return (Criteria) this;
        }

        public Criteria andLaunchtimeNotEqualTo(String value) {
            addCriterion("LAUNCHTIME <>", value, "launchtime");
            return (Criteria) this;
        }

        public Criteria andLaunchtimeGreaterThan(String value) {
            addCriterion("LAUNCHTIME >", value, "launchtime");
            return (Criteria) this;
        }

        public Criteria andLaunchtimeGreaterThanOrEqualTo(String value) {
            addCriterion("LAUNCHTIME >=", value, "launchtime");
            return (Criteria) this;
        }

        public Criteria andLaunchtimeLessThan(String value) {
            addCriterion("LAUNCHTIME <", value, "launchtime");
            return (Criteria) this;
        }

        public Criteria andLaunchtimeLessThanOrEqualTo(String value) {
            addCriterion("LAUNCHTIME <=", value, "launchtime");
            return (Criteria) this;
        }

        public Criteria andLaunchtimeLike(String value) {
            addCriterion("LAUNCHTIME like", value, "launchtime");
            return (Criteria) this;
        }

        public Criteria andLaunchtimeNotLike(String value) {
            addCriterion("LAUNCHTIME not like", value, "launchtime");
            return (Criteria) this;
        }

        public Criteria andLaunchtimeIn(List<String> values) {
            addCriterion("LAUNCHTIME in", values, "launchtime");
            return (Criteria) this;
        }

        public Criteria andLaunchtimeNotIn(List<String> values) {
            addCriterion("LAUNCHTIME not in", values, "launchtime");
            return (Criteria) this;
        }

        public Criteria andLaunchtimeBetween(String value1, String value2) {
            addCriterion("LAUNCHTIME between", value1, value2, "launchtime");
            return (Criteria) this;
        }

        public Criteria andLaunchtimeNotBetween(String value1, String value2) {
            addCriterion("LAUNCHTIME not between", value1, value2, "launchtime");
            return (Criteria) this;
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

        public Criteria andMemoIsNull() {
            addCriterion("MEMO is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("MEMO =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("MEMO <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("MEMO >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("MEMO >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("MEMO <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("MEMO <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("MEMO like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("MEMO not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("MEMO in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("MEMO not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("MEMO between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("MEMO not between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andPmn01IsNull() {
            addCriterion("PMN01 is null");
            return (Criteria) this;
        }

        public Criteria andPmn01IsNotNull() {
            addCriterion("PMN01 is not null");
            return (Criteria) this;
        }

        public Criteria andPmn01EqualTo(String value) {
            addCriterion("PMN01 =", value, "pmn01");
            return (Criteria) this;
        }

        public Criteria andPmn01NotEqualTo(String value) {
            addCriterion("PMN01 <>", value, "pmn01");
            return (Criteria) this;
        }

        public Criteria andPmn01GreaterThan(String value) {
            addCriterion("PMN01 >", value, "pmn01");
            return (Criteria) this;
        }

        public Criteria andPmn01GreaterThanOrEqualTo(String value) {
            addCriterion("PMN01 >=", value, "pmn01");
            return (Criteria) this;
        }

        public Criteria andPmn01LessThan(String value) {
            addCriterion("PMN01 <", value, "pmn01");
            return (Criteria) this;
        }

        public Criteria andPmn01LessThanOrEqualTo(String value) {
            addCriterion("PMN01 <=", value, "pmn01");
            return (Criteria) this;
        }

        public Criteria andPmn01Like(String value) {
            addCriterion("PMN01 like", value, "pmn01");
            return (Criteria) this;
        }

        public Criteria andPmn01NotLike(String value) {
            addCriterion("PMN01 not like", value, "pmn01");
            return (Criteria) this;
        }

        public Criteria andPmn01In(List<String> values) {
            addCriterion("PMN01 in", values, "pmn01");
            return (Criteria) this;
        }

        public Criteria andPmn01NotIn(List<String> values) {
            addCriterion("PMN01 not in", values, "pmn01");
            return (Criteria) this;
        }

        public Criteria andPmn01Between(String value1, String value2) {
            addCriterion("PMN01 between", value1, value2, "pmn01");
            return (Criteria) this;
        }

        public Criteria andPmn01NotBetween(String value1, String value2) {
            addCriterion("PMN01 not between", value1, value2, "pmn01");
            return (Criteria) this;
        }

        public Criteria andPmn02IsNull() {
            addCriterion("PMN02 is null");
            return (Criteria) this;
        }

        public Criteria andPmn02IsNotNull() {
            addCriterion("PMN02 is not null");
            return (Criteria) this;
        }

        public Criteria andPmn02EqualTo(Integer value) {
            addCriterion("PMN02 =", value, "pmn02");
            return (Criteria) this;
        }

        public Criteria andPmn02NotEqualTo(Integer value) {
            addCriterion("PMN02 <>", value, "pmn02");
            return (Criteria) this;
        }

        public Criteria andPmn02GreaterThan(Integer value) {
            addCriterion("PMN02 >", value, "pmn02");
            return (Criteria) this;
        }

        public Criteria andPmn02GreaterThanOrEqualTo(Integer value) {
            addCriterion("PMN02 >=", value, "pmn02");
            return (Criteria) this;
        }

        public Criteria andPmn02LessThan(Integer value) {
            addCriterion("PMN02 <", value, "pmn02");
            return (Criteria) this;
        }

        public Criteria andPmn02LessThanOrEqualTo(Integer value) {
            addCriterion("PMN02 <=", value, "pmn02");
            return (Criteria) this;
        }

        public Criteria andPmn02In(List<Integer> values) {
            addCriterion("PMN02 in", values, "pmn02");
            return (Criteria) this;
        }

        public Criteria andPmn02NotIn(List<Integer> values) {
            addCriterion("PMN02 not in", values, "pmn02");
            return (Criteria) this;
        }

        public Criteria andPmn02Between(Integer value1, Integer value2) {
            addCriterion("PMN02 between", value1, value2, "pmn02");
            return (Criteria) this;
        }

        public Criteria andPmn02NotBetween(Integer value1, Integer value2) {
            addCriterion("PMN02 not between", value1, value2, "pmn02");
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