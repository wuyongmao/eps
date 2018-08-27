package com.chenyuantech.eps.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class WXBSIZEExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WXBSIZEExample() {
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

    protected abstract static class GeneratedCriteria {
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

        public Criteria andWXB05IsNull() {
            addCriterion("WXB05 is null");
            return (Criteria) this;
        }

        public Criteria andWXB05IsNotNull() {
            addCriterion("WXB05 is not null");
            return (Criteria) this;
        }

        public Criteria andWXB05EqualTo(String value) {
            addCriterion("WXB05 =", value, "WXB05");
            return (Criteria) this;
        }

        public Criteria andWXB05NotEqualTo(String value) {
            addCriterion("WXB05 <>", value, "WXB05");
            return (Criteria) this;
        }

        public Criteria andWXB05GreaterThan(String value) {
            addCriterion("WXB05 >", value, "WXB05");
            return (Criteria) this;
        }

        public Criteria andWXB05GreaterThanOrEqualTo(String value) {
            addCriterion("WXB05 >=", value, "WXB05");
            return (Criteria) this;
        }

        public Criteria andWXB05LessThan(String value) {
            addCriterion("WXB05 <", value, "WXB05");
            return (Criteria) this;
        }

        public Criteria andWXB05LessThanOrEqualTo(String value) {
            addCriterion("WXB05 <=", value, "WXB05");
            return (Criteria) this;
        }

        public Criteria andWXB05Like(String value) {
            addCriterion("WXB05 like", value, "WXB05");
            return (Criteria) this;
        }

        public Criteria andWXB05NotLike(String value) {
            addCriterion("WXB05 not like", value, "WXB05");
            return (Criteria) this;
        }

        public Criteria andWXB05In(List<String> values) {
            addCriterion("WXB05 in", values, "WXB05");
            return (Criteria) this;
        }

        public Criteria andWXB05NotIn(List<String> values) {
            addCriterion("WXB05 not in", values, "WXB05");
            return (Criteria) this;
        }

        public Criteria andWXB05Between(String value1, String value2) {
            addCriterion("WXB05 between", value1, value2, "WXB05");
            return (Criteria) this;
        }

        public Criteria andWXB05NotBetween(String value1, String value2) {
            addCriterion("WXB05 not between", value1, value2, "WXB05");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS01IsNull() {
            addCriterion("TC_RVBS01 is null");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS01IsNotNull() {
            addCriterion("TC_RVBS01 is not null");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS01EqualTo(String value) {
            addCriterion("TC_RVBS01 =", value, "TC_RVBS01");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS01NotEqualTo(String value) {
            addCriterion("TC_RVBS01 <>", value, "TC_RVBS01");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS01GreaterThan(String value) {
            addCriterion("TC_RVBS01 >", value, "TC_RVBS01");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS01GreaterThanOrEqualTo(String value) {
            addCriterion("TC_RVBS01 >=", value, "TC_RVBS01");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS01LessThan(String value) {
            addCriterion("TC_RVBS01 <", value, "TC_RVBS01");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS01LessThanOrEqualTo(String value) {
            addCriterion("TC_RVBS01 <=", value, "TC_RVBS01");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS01Like(String value) {
            addCriterion("TC_RVBS01 like", value, "TC_RVBS01");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS01NotLike(String value) {
            addCriterion("TC_RVBS01 not like", value, "TC_RVBS01");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS01In(List<String> values) {
            addCriterion("TC_RVBS01 in", values, "TC_RVBS01");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS01NotIn(List<String> values) {
            addCriterion("TC_RVBS01 not in", values, "TC_RVBS01");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS01Between(String value1, String value2) {
            addCriterion("TC_RVBS01 between", value1, value2, "TC_RVBS01");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS01NotBetween(String value1, String value2) {
            addCriterion("TC_RVBS01 not between", value1, value2, "TC_RVBS01");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS02IsNull() {
            addCriterion("TC_RVBS02 is null");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS02IsNotNull() {
            addCriterion("TC_RVBS02 is not null");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS02EqualTo(Integer value) {
            addCriterion("TC_RVBS02 =", value, "TC_RVBS02");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS02NotEqualTo(Integer value) {
            addCriterion("TC_RVBS02 <>", value, "TC_RVBS02");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS02GreaterThan(Integer value) {
            addCriterion("TC_RVBS02 >", value, "TC_RVBS02");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS02GreaterThanOrEqualTo(Integer value) {
            addCriterion("TC_RVBS02 >=", value, "TC_RVBS02");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS02LessThan(Integer value) {
            addCriterion("TC_RVBS02 <", value, "TC_RVBS02");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS02LessThanOrEqualTo(Integer value) {
            addCriterion("TC_RVBS02 <=", value, "TC_RVBS02");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS02In(List<Integer> values) {
            addCriterion("TC_RVBS02 in", values, "TC_RVBS02");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS02NotIn(List<Integer> values) {
            addCriterion("TC_RVBS02 not in", values, "TC_RVBS02");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS02Between(Integer value1, Integer value2) {
            addCriterion("TC_RVBS02 between", value1, value2, "TC_RVBS02");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS02NotBetween(Integer value1, Integer value2) {
            addCriterion("TC_RVBS02 not between", value1, value2, "TC_RVBS02");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS03IsNull() {
            addCriterion("TC_RVBS03 is null");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS03IsNotNull() {
            addCriterion("TC_RVBS03 is not null");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS03EqualTo(String value) {
            addCriterion("TC_RVBS03 =", value, "TC_RVBS03");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS03NotEqualTo(String value) {
            addCriterion("TC_RVBS03 <>", value, "TC_RVBS03");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS03GreaterThan(String value) {
            addCriterion("TC_RVBS03 >", value, "TC_RVBS03");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS03GreaterThanOrEqualTo(String value) {
            addCriterion("TC_RVBS03 >=", value, "TC_RVBS03");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS03LessThan(String value) {
            addCriterion("TC_RVBS03 <", value, "TC_RVBS03");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS03LessThanOrEqualTo(String value) {
            addCriterion("TC_RVBS03 <=", value, "TC_RVBS03");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS03Like(String value) {
            addCriterion("TC_RVBS03 like", value, "TC_RVBS03");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS03NotLike(String value) {
            addCriterion("TC_RVBS03 not like", value, "TC_RVBS03");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS03In(List<String> values) {
            addCriterion("TC_RVBS03 in", values, "TC_RVBS03");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS03NotIn(List<String> values) {
            addCriterion("TC_RVBS03 not in", values, "TC_RVBS03");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS03Between(String value1, String value2) {
            addCriterion("TC_RVBS03 between", value1, value2, "TC_RVBS03");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS03NotBetween(String value1, String value2) {
            addCriterion("TC_RVBS03 not between", value1, value2, "TC_RVBS03");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS16IsNull() {
            addCriterion("TC_RVBS16 is null");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS16IsNotNull() {
            addCriterion("TC_RVBS16 is not null");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS16EqualTo(BigDecimal value) {
            addCriterion("TC_RVBS16 =", value, "TC_RVBS16");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS16NotEqualTo(BigDecimal value) {
            addCriterion("TC_RVBS16 <>", value, "TC_RVBS16");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS16GreaterThan(BigDecimal value) {
            addCriterion("TC_RVBS16 >", value, "TC_RVBS16");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS16GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TC_RVBS16 >=", value, "TC_RVBS16");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS16LessThan(BigDecimal value) {
            addCriterion("TC_RVBS16 <", value, "TC_RVBS16");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS16LessThanOrEqualTo(BigDecimal value) {
            addCriterion("TC_RVBS16 <=", value, "TC_RVBS16");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS16In(List<BigDecimal> values) {
            addCriterion("TC_RVBS16 in", values, "TC_RVBS16");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS16NotIn(List<BigDecimal> values) {
            addCriterion("TC_RVBS16 not in", values, "TC_RVBS16");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS16Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("TC_RVBS16 between", value1, value2, "TC_RVBS16");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS16NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TC_RVBS16 not between", value1, value2, "TC_RVBS16");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS17IsNull() {
            addCriterion("TC_RVBS17 is null");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS17IsNotNull() {
            addCriterion("TC_RVBS17 is not null");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS17EqualTo(BigDecimal value) {
            addCriterion("TC_RVBS17 =", value, "TC_RVBS17");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS17NotEqualTo(BigDecimal value) {
            addCriterion("TC_RVBS17 <>", value, "TC_RVBS17");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS17GreaterThan(BigDecimal value) {
            addCriterion("TC_RVBS17 >", value, "TC_RVBS17");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS17GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TC_RVBS17 >=", value, "TC_RVBS17");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS17LessThan(BigDecimal value) {
            addCriterion("TC_RVBS17 <", value, "TC_RVBS17");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS17LessThanOrEqualTo(BigDecimal value) {
            addCriterion("TC_RVBS17 <=", value, "TC_RVBS17");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS17In(List<BigDecimal> values) {
            addCriterion("TC_RVBS17 in", values, "TC_RVBS17");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS17NotIn(List<BigDecimal> values) {
            addCriterion("TC_RVBS17 not in", values, "TC_RVBS17");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS17Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("TC_RVBS17 between", value1, value2, "TC_RVBS17");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS17NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TC_RVBS17 not between", value1, value2, "TC_RVBS17");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS04IsNull() {
            addCriterion("TC_RVBS04 is null");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS04IsNotNull() {
            addCriterion("TC_RVBS04 is not null");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS04EqualTo(BigDecimal value) {
            addCriterion("TC_RVBS04 =", value, "TC_RVBS04");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS04NotEqualTo(BigDecimal value) {
            addCriterion("TC_RVBS04 <>", value, "TC_RVBS04");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS04GreaterThan(BigDecimal value) {
            addCriterion("TC_RVBS04 >", value, "TC_RVBS04");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS04GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TC_RVBS04 >=", value, "TC_RVBS04");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS04LessThan(BigDecimal value) {
            addCriterion("TC_RVBS04 <", value, "TC_RVBS04");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS04LessThanOrEqualTo(BigDecimal value) {
            addCriterion("TC_RVBS04 <=", value, "TC_RVBS04");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS04In(List<BigDecimal> values) {
            addCriterion("TC_RVBS04 in", values, "TC_RVBS04");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS04NotIn(List<BigDecimal> values) {
            addCriterion("TC_RVBS04 not in", values, "TC_RVBS04");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS04Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("TC_RVBS04 between", value1, value2, "TC_RVBS04");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS04NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TC_RVBS04 not between", value1, value2, "TC_RVBS04");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS06IsNull() {
            addCriterion("TC_RVBS06 is null");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS06IsNotNull() {
            addCriterion("TC_RVBS06 is not null");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS06EqualTo(String value) {
            addCriterion("TC_RVBS06 =", value, "TC_RVBS06");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS06NotEqualTo(String value) {
            addCriterion("TC_RVBS06 <>", value, "TC_RVBS06");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS06GreaterThan(String value) {
            addCriterion("TC_RVBS06 >", value, "TC_RVBS06");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS06GreaterThanOrEqualTo(String value) {
            addCriterion("TC_RVBS06 >=", value, "TC_RVBS06");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS06LessThan(String value) {
            addCriterion("TC_RVBS06 <", value, "TC_RVBS06");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS06LessThanOrEqualTo(String value) {
            addCriterion("TC_RVBS06 <=", value, "TC_RVBS06");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS06Like(String value) {
            addCriterion("TC_RVBS06 like", value, "TC_RVBS06");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS06NotLike(String value) {
            addCriterion("TC_RVBS06 not like", value, "TC_RVBS06");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS06In(List<String> values) {
            addCriterion("TC_RVBS06 in", values, "TC_RVBS06");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS06NotIn(List<String> values) {
            addCriterion("TC_RVBS06 not in", values, "TC_RVBS06");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS06Between(String value1, String value2) {
            addCriterion("TC_RVBS06 between", value1, value2, "TC_RVBS06");
            return (Criteria) this;
        }

        public Criteria andTC_RVBS06NotBetween(String value1, String value2) {
            addCriterion("TC_RVBS06 not between", value1, value2, "TC_RVBS06");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
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