package com.chenyuantech.eps.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class DeliverylogExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public DeliverylogExample() {
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

        public Criteria andDelidIsNull() {
            addCriterion("DELID is null");
            return (Criteria) this;
        }

        public Criteria andDelidIsNotNull() {
            addCriterion("DELID is not null");
            return (Criteria) this;
        }

        public Criteria andDelidEqualTo(String value) {
            addCriterion("DELID =", value, "delid");
            return (Criteria) this;
        }

        public Criteria andDelidNotEqualTo(String value) {
            addCriterion("DELID <>", value, "delid");
            return (Criteria) this;
        }

        public Criteria andDelidGreaterThan(String value) {
            addCriterion("DELID >", value, "delid");
            return (Criteria) this;
        }

        public Criteria andDelidGreaterThanOrEqualTo(String value) {
            addCriterion("DELID >=", value, "delid");
            return (Criteria) this;
        }

        public Criteria andDelidLessThan(String value) {
            addCriterion("DELID <", value, "delid");
            return (Criteria) this;
        }

        public Criteria andDelidLessThanOrEqualTo(String value) {
            addCriterion("DELID <=", value, "delid");
            return (Criteria) this;
        }

        public Criteria andDelidLike(String value) {
            addCriterion("DELID like", value, "delid");
            return (Criteria) this;
        }

        public Criteria andDelidNotLike(String value) {
            addCriterion("DELID not like", value, "delid");
            return (Criteria) this;
        }

        public Criteria andDelidIn(List<String> values) {
            addCriterion("DELID in", values, "delid");
            return (Criteria) this;
        }

        public Criteria andDelidNotIn(List<String> values) {
            addCriterion("DELID not in", values, "delid");
            return (Criteria) this;
        }

        public Criteria andDelidBetween(String value1, String value2) {
            addCriterion("DELID between", value1, value2, "delid");
            return (Criteria) this;
        }

        public Criteria andDelidNotBetween(String value1, String value2) {
            addCriterion("DELID not between", value1, value2, "delid");
            return (Criteria) this;
        }

        public Criteria andDlvidIsNull() {
            addCriterion("DLVID is null");
            return (Criteria) this;
        }

        public Criteria andDlvidIsNotNull() {
            addCriterion("DLVID is not null");
            return (Criteria) this;
        }

        public Criteria andDlvidEqualTo(String value) {
            addCriterion("DLVID =", value, "dlvid");
            return (Criteria) this;
        }

        public Criteria andDlvidNotEqualTo(String value) {
            addCriterion("DLVID <>", value, "dlvid");
            return (Criteria) this;
        }

        public Criteria andDlvidGreaterThan(String value) {
            addCriterion("DLVID >", value, "dlvid");
            return (Criteria) this;
        }

        public Criteria andDlvidGreaterThanOrEqualTo(String value) {
            addCriterion("DLVID >=", value, "dlvid");
            return (Criteria) this;
        }

        public Criteria andDlvidLessThan(String value) {
            addCriterion("DLVID <", value, "dlvid");
            return (Criteria) this;
        }

        public Criteria andDlvidLessThanOrEqualTo(String value) {
            addCriterion("DLVID <=", value, "dlvid");
            return (Criteria) this;
        }

        public Criteria andDlvidLike(String value) {
            addCriterion("DLVID like", value, "dlvid");
            return (Criteria) this;
        }

        public Criteria andDlvidNotLike(String value) {
            addCriterion("DLVID not like", value, "dlvid");
            return (Criteria) this;
        }

        public Criteria andDlvidIn(List<String> values) {
            addCriterion("DLVID in", values, "dlvid");
            return (Criteria) this;
        }

        public Criteria andDlvidNotIn(List<String> values) {
            addCriterion("DLVID not in", values, "dlvid");
            return (Criteria) this;
        }

        public Criteria andDlvidBetween(String value1, String value2) {
            addCriterion("DLVID between", value1, value2, "dlvid");
            return (Criteria) this;
        }

        public Criteria andDlvidNotBetween(String value1, String value2) {
            addCriterion("DLVID not between", value1, value2, "dlvid");
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

        public Criteria andDlvdateIsNull() {
            addCriterion("DLVDATE is null");
            return (Criteria) this;
        }

        public Criteria andDlvdateIsNotNull() {
            addCriterion("DLVDATE is not null");
            return (Criteria) this;
        }

        public Criteria andDlvdateEqualTo(String value) {
            addCriterion("DLVDATE =", value, "dlvdate");
            return (Criteria) this;
        }

        public Criteria andDlvdateNotEqualTo(String value) {
            addCriterion("DLVDATE <>", value, "dlvdate");
            return (Criteria) this;
        }

        public Criteria andDlvdateGreaterThan(String value) {
            addCriterion("DLVDATE >", value, "dlvdate");
            return (Criteria) this;
        }

        public Criteria andDlvdateGreaterThanOrEqualTo(String value) {
            addCriterion("DLVDATE >=", value, "dlvdate");
            return (Criteria) this;
        }

        public Criteria andDlvdateLessThan(String value) {
            addCriterion("DLVDATE <", value, "dlvdate");
            return (Criteria) this;
        }

        public Criteria andDlvdateLessThanOrEqualTo(String value) {
            addCriterion("DLVDATE <=", value, "dlvdate");
            return (Criteria) this;
        }

        public Criteria andDlvdateLike(String value) {
            addCriterion("DLVDATE like", value, "dlvdate");
            return (Criteria) this;
        }

        public Criteria andDlvdateNotLike(String value) {
            addCriterion("DLVDATE not like", value, "dlvdate");
            return (Criteria) this;
        }

        public Criteria andDlvdateIn(List<String> values) {
            addCriterion("DLVDATE in", values, "dlvdate");
            return (Criteria) this;
        }

        public Criteria andDlvdateNotIn(List<String> values) {
            addCriterion("DLVDATE not in", values, "dlvdate");
            return (Criteria) this;
        }

        public Criteria andDlvdateBetween(String value1, String value2) {
            addCriterion("DLVDATE between", value1, value2, "dlvdate");
            return (Criteria) this;
        }

        public Criteria andDlvdateNotBetween(String value1, String value2) {
            addCriterion("DLVDATE not between", value1, value2, "dlvdate");
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

        public Criteria andNumIsNull() {
            addCriterion("NUM is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("NUM is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(BigDecimal value) {
            addCriterion("NUM =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(BigDecimal value) {
            addCriterion("NUM <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(BigDecimal value) {
            addCriterion("NUM >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NUM >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(BigDecimal value) {
            addCriterion("NUM <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NUM <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<BigDecimal> values) {
            addCriterion("NUM in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<BigDecimal> values) {
            addCriterion("NUM not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NUM between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NUM not between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andYshlIsNull() {
            addCriterion("YSHL is null");
            return (Criteria) this;
        }

        public Criteria andYshlIsNotNull() {
            addCriterion("YSHL is not null");
            return (Criteria) this;
        }

        public Criteria andYshlEqualTo(BigDecimal value) {
            addCriterion("YSHL =", value, "yshl");
            return (Criteria) this;
        }

        public Criteria andYshlNotEqualTo(BigDecimal value) {
            addCriterion("YSHL <>", value, "yshl");
            return (Criteria) this;
        }

        public Criteria andYshlGreaterThan(BigDecimal value) {
            addCriterion("YSHL >", value, "yshl");
            return (Criteria) this;
        }

        public Criteria andYshlGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("YSHL >=", value, "yshl");
            return (Criteria) this;
        }

        public Criteria andYshlLessThan(BigDecimal value) {
            addCriterion("YSHL <", value, "yshl");
            return (Criteria) this;
        }

        public Criteria andYshlLessThanOrEqualTo(BigDecimal value) {
            addCriterion("YSHL <=", value, "yshl");
            return (Criteria) this;
        }

        public Criteria andYshlIn(List<BigDecimal> values) {
            addCriterion("YSHL in", values, "yshl");
            return (Criteria) this;
        }

        public Criteria andYshlNotIn(List<BigDecimal> values) {
            addCriterion("YSHL not in", values, "yshl");
            return (Criteria) this;
        }

        public Criteria andYshlBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YSHL between", value1, value2, "yshl");
            return (Criteria) this;
        }

        public Criteria andYshlNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YSHL not between", value1, value2, "yshl");
            return (Criteria) this;
        }

        public Criteria andWshlIsNull() {
            addCriterion("WSHL is null");
            return (Criteria) this;
        }

        public Criteria andWshlIsNotNull() {
            addCriterion("WSHL is not null");
            return (Criteria) this;
        }

        public Criteria andWshlEqualTo(BigDecimal value) {
            addCriterion("WSHL =", value, "wshl");
            return (Criteria) this;
        }

        public Criteria andWshlNotEqualTo(BigDecimal value) {
            addCriterion("WSHL <>", value, "wshl");
            return (Criteria) this;
        }

        public Criteria andWshlGreaterThan(BigDecimal value) {
            addCriterion("WSHL >", value, "wshl");
            return (Criteria) this;
        }

        public Criteria andWshlGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WSHL >=", value, "wshl");
            return (Criteria) this;
        }

        public Criteria andWshlLessThan(BigDecimal value) {
            addCriterion("WSHL <", value, "wshl");
            return (Criteria) this;
        }

        public Criteria andWshlLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WSHL <=", value, "wshl");
            return (Criteria) this;
        }

        public Criteria andWshlIn(List<BigDecimal> values) {
            addCriterion("WSHL in", values, "wshl");
            return (Criteria) this;
        }

        public Criteria andWshlNotIn(List<BigDecimal> values) {
            addCriterion("WSHL not in", values, "wshl");
            return (Criteria) this;
        }

        public Criteria andWshlBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WSHL between", value1, value2, "wshl");
            return (Criteria) this;
        }

        public Criteria andWshlNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WSHL not between", value1, value2, "wshl");
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