package com.chenyuantech.eps.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class SHDExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SHDExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andSHD01IsNull() {
            addCriterion("SHD01 is null");
            return (Criteria) this;
        }

        public Criteria andSHD01IsNotNull() {
            addCriterion("SHD01 is not null");
            return (Criteria) this;
        }

        public Criteria andSHD01EqualTo(String value) {
            addCriterion("SHD01 =", value, "SHD01");
            return (Criteria) this;
        }

        public Criteria andSHD01NotEqualTo(String value) {
            addCriterion("SHD01 <>", value, "SHD01");
            return (Criteria) this;
        }

        public Criteria andSHD01GreaterThan(String value) {
            addCriterion("SHD01 >", value, "SHD01");
            return (Criteria) this;
        }

        public Criteria andSHD01GreaterThanOrEqualTo(String value) {
            addCriterion("SHD01 >=", value, "SHD01");
            return (Criteria) this;
        }

        public Criteria andSHD01LessThan(String value) {
            addCriterion("SHD01 <", value, "SHD01");
            return (Criteria) this;
        }

        public Criteria andSHD01LessThanOrEqualTo(String value) {
            addCriterion("SHD01 <=", value, "SHD01");
            return (Criteria) this;
        }

        public Criteria andSHD01Like(String value) {
            addCriterion("SHD01 like", value, "SHD01");
            return (Criteria) this;
        }

        public Criteria andSHD01NotLike(String value) {
            addCriterion("SHD01 not like", value, "SHD01");
            return (Criteria) this;
        }

        public Criteria andSHD01In(List<String> values) {
            addCriterion("SHD01 in", values, "SHD01");
            return (Criteria) this;
        }

        public Criteria andSHD01NotIn(List<String> values) {
            addCriterion("SHD01 not in", values, "SHD01");
            return (Criteria) this;
        }

        public Criteria andSHD01Between(String value1, String value2) {
            addCriterion("SHD01 between", value1, value2, "SHD01");
            return (Criteria) this;
        }

        public Criteria andSHD01NotBetween(String value1, String value2) {
            addCriterion("SHD01 not between", value1, value2, "SHD01");
            return (Criteria) this;
        }

        public Criteria andSHD02IsNull() {
            addCriterion("SHD02 is null");
            return (Criteria) this;
        }

        public Criteria andSHD02IsNotNull() {
            addCriterion("SHD02 is not null");
            return (Criteria) this;
        }

        public Criteria andSHD02EqualTo(String value) {
            addCriterion("SHD02 =", value, "SHD02");
            return (Criteria) this;
        }

        public Criteria andSHD02NotEqualTo(String value) {
            addCriterion("SHD02 <>", value, "SHD02");
            return (Criteria) this;
        }

        public Criteria andSHD02GreaterThan(String value) {
            addCriterion("SHD02 >", value, "SHD02");
            return (Criteria) this;
        }

        public Criteria andSHD02GreaterThanOrEqualTo(String value) {
            addCriterion("SHD02 >=", value, "SHD02");
            return (Criteria) this;
        }

        public Criteria andSHD02LessThan(String value) {
            addCriterion("SHD02 <", value, "SHD02");
            return (Criteria) this;
        }

        public Criteria andSHD02LessThanOrEqualTo(String value) {
            addCriterion("SHD02 <=", value, "SHD02");
            return (Criteria) this;
        }

        public Criteria andSHD02Like(String value) {
            addCriterion("SHD02 like", value, "SHD02");
            return (Criteria) this;
        }

        public Criteria andSHD02NotLike(String value) {
            addCriterion("SHD02 not like", value, "SHD02");
            return (Criteria) this;
        }

        public Criteria andSHD02In(List<String> values) {
            addCriterion("SHD02 in", values, "SHD02");
            return (Criteria) this;
        }

        public Criteria andSHD02NotIn(List<String> values) {
            addCriterion("SHD02 not in", values, "SHD02");
            return (Criteria) this;
        }

        public Criteria andSHD02Between(String value1, String value2) {
            addCriterion("SHD02 between", value1, value2, "SHD02");
            return (Criteria) this;
        }

        public Criteria andSHD02NotBetween(String value1, String value2) {
            addCriterion("SHD02 not between", value1, value2, "SHD02");
            return (Criteria) this;
        }

        public Criteria andSHD03IsNull() {
            addCriterion("SHD03 is null");
            return (Criteria) this;
        }

        public Criteria andSHD03IsNotNull() {
            addCriterion("SHD03 is not null");
            return (Criteria) this;
        }

        public Criteria andSHD03EqualTo(String value) {
            addCriterion("SHD03 =", value, "SHD03");
            return (Criteria) this;
        }

        public Criteria andSHD03NotEqualTo(String value) {
            addCriterion("SHD03 <>", value, "SHD03");
            return (Criteria) this;
        }

        public Criteria andSHD03GreaterThan(String value) {
            addCriterion("SHD03 >", value, "SHD03");
            return (Criteria) this;
        }

        public Criteria andSHD03GreaterThanOrEqualTo(String value) {
            addCriterion("SHD03 >=", value, "SHD03");
            return (Criteria) this;
        }

        public Criteria andSHD03LessThan(String value) {
            addCriterion("SHD03 <", value, "SHD03");
            return (Criteria) this;
        }

        public Criteria andSHD03LessThanOrEqualTo(String value) {
            addCriterion("SHD03 <=", value, "SHD03");
            return (Criteria) this;
        }

        public Criteria andSHD03Like(String value) {
            addCriterion("SHD03 like", value, "SHD03");
            return (Criteria) this;
        }

        public Criteria andSHD03NotLike(String value) {
            addCriterion("SHD03 not like", value, "SHD03");
            return (Criteria) this;
        }

        public Criteria andSHD03In(List<String> values) {
            addCriterion("SHD03 in", values, "SHD03");
            return (Criteria) this;
        }

        public Criteria andSHD03NotIn(List<String> values) {
            addCriterion("SHD03 not in", values, "SHD03");
            return (Criteria) this;
        }

        public Criteria andSHD03Between(String value1, String value2) {
            addCriterion("SHD03 between", value1, value2, "SHD03");
            return (Criteria) this;
        }

        public Criteria andSHD03NotBetween(String value1, String value2) {
            addCriterion("SHD03 not between", value1, value2, "SHD03");
            return (Criteria) this;
        }

        public Criteria andSHD04IsNull() {
            addCriterion("SHD04 is null");
            return (Criteria) this;
        }

        public Criteria andSHD04IsNotNull() {
            addCriterion("SHD04 is not null");
            return (Criteria) this;
        }

        public Criteria andSHD04EqualTo(String value) {
            addCriterion("SHD04 =", value, "SHD04");
            return (Criteria) this;
        }

        public Criteria andSHD04NotEqualTo(String value) {
            addCriterion("SHD04 <>", value, "SHD04");
            return (Criteria) this;
        }

        public Criteria andSHD04GreaterThan(String value) {
            addCriterion("SHD04 >", value, "SHD04");
            return (Criteria) this;
        }

        public Criteria andSHD04GreaterThanOrEqualTo(String value) {
            addCriterion("SHD04 >=", value, "SHD04");
            return (Criteria) this;
        }

        public Criteria andSHD04LessThan(String value) {
            addCriterion("SHD04 <", value, "SHD04");
            return (Criteria) this;
        }

        public Criteria andSHD04LessThanOrEqualTo(String value) {
            addCriterion("SHD04 <=", value, "SHD04");
            return (Criteria) this;
        }

        public Criteria andSHD04Like(String value) {
            addCriterion("SHD04 like", value, "SHD04");
            return (Criteria) this;
        }

        public Criteria andSHD04NotLike(String value) {
            addCriterion("SHD04 not like", value, "SHD04");
            return (Criteria) this;
        }

        public Criteria andSHD04In(List<String> values) {
            addCriterion("SHD04 in", values, "SHD04");
            return (Criteria) this;
        }

        public Criteria andSHD04NotIn(List<String> values) {
            addCriterion("SHD04 not in", values, "SHD04");
            return (Criteria) this;
        }

        public Criteria andSHD04Between(String value1, String value2) {
            addCriterion("SHD04 between", value1, value2, "SHD04");
            return (Criteria) this;
        }

        public Criteria andSHD04NotBetween(String value1, String value2) {
            addCriterion("SHD04 not between", value1, value2, "SHD04");
            return (Criteria) this;
        }

        public Criteria andSHD05IsNull() {
            addCriterion("SHD05 is null");
            return (Criteria) this;
        }

        public Criteria andSHD05IsNotNull() {
            addCriterion("SHD05 is not null");
            return (Criteria) this;
        }

        public Criteria andSHD05EqualTo(Date value) {
            addCriterionForJDBCDate("SHD05 =", value, "SHD05");
            return (Criteria) this;
        }

        public Criteria andSHD05NotEqualTo(Date value) {
            addCriterionForJDBCDate("SHD05 <>", value, "SHD05");
            return (Criteria) this;
        }

        public Criteria andSHD05GreaterThan(Date value) {
            addCriterionForJDBCDate("SHD05 >", value, "SHD05");
            return (Criteria) this;
        }

        public Criteria andSHD05GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SHD05 >=", value, "SHD05");
            return (Criteria) this;
        }

        public Criteria andSHD05LessThan(Date value) {
            addCriterionForJDBCDate("SHD05 <", value, "SHD05");
            return (Criteria) this;
        }

        public Criteria andSHD05LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SHD05 <=", value, "SHD05");
            return (Criteria) this;
        }

        public Criteria andSHD05In(List<Date> values) {
            addCriterionForJDBCDate("SHD05 in", values, "SHD05");
            return (Criteria) this;
        }

        public Criteria andSHD05NotIn(List<Date> values) {
            addCriterionForJDBCDate("SHD05 not in", values, "SHD05");
            return (Criteria) this;
        }

        public Criteria andSHD05Between(Date value1, Date value2) {
            addCriterionForJDBCDate("SHD05 between", value1, value2, "SHD05");
            return (Criteria) this;
        }

        public Criteria andSHD05NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SHD05 not between", value1, value2, "SHD05");
            return (Criteria) this;
        }

        public Criteria andSHD06IsNull() {
            addCriterion("SHD06 is null");
            return (Criteria) this;
        }

        public Criteria andSHD06IsNotNull() {
            addCriterion("SHD06 is not null");
            return (Criteria) this;
        }

        public Criteria andSHD06EqualTo(BigDecimal value) {
            addCriterion("SHD06 =", value, "SHD06");
            return (Criteria) this;
        }

        public Criteria andSHD06NotEqualTo(BigDecimal value) {
            addCriterion("SHD06 <>", value, "SHD06");
            return (Criteria) this;
        }

        public Criteria andSHD06GreaterThan(BigDecimal value) {
            addCriterion("SHD06 >", value, "SHD06");
            return (Criteria) this;
        }

        public Criteria andSHD06GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SHD06 >=", value, "SHD06");
            return (Criteria) this;
        }

        public Criteria andSHD06LessThan(BigDecimal value) {
            addCriterion("SHD06 <", value, "SHD06");
            return (Criteria) this;
        }

        public Criteria andSHD06LessThanOrEqualTo(BigDecimal value) {
            addCriterion("SHD06 <=", value, "SHD06");
            return (Criteria) this;
        }

        public Criteria andSHD06In(List<BigDecimal> values) {
            addCriterion("SHD06 in", values, "SHD06");
            return (Criteria) this;
        }

        public Criteria andSHD06NotIn(List<BigDecimal> values) {
            addCriterion("SHD06 not in", values, "SHD06");
            return (Criteria) this;
        }

        public Criteria andSHD06Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHD06 between", value1, value2, "SHD06");
            return (Criteria) this;
        }

        public Criteria andSHD06NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHD06 not between", value1, value2, "SHD06");
            return (Criteria) this;
        }

        public Criteria andSHD07IsNull() {
            addCriterion("SHD07 is null");
            return (Criteria) this;
        }

        public Criteria andSHD07IsNotNull() {
            addCriterion("SHD07 is not null");
            return (Criteria) this;
        }

        public Criteria andSHD07EqualTo(String value) {
            addCriterion("SHD07 =", value, "SHD07");
            return (Criteria) this;
        }

        public Criteria andSHD07NotEqualTo(String value) {
            addCriterion("SHD07 <>", value, "SHD07");
            return (Criteria) this;
        }

        public Criteria andSHD07GreaterThan(String value) {
            addCriterion("SHD07 >", value, "SHD07");
            return (Criteria) this;
        }

        public Criteria andSHD07GreaterThanOrEqualTo(String value) {
            addCriterion("SHD07 >=", value, "SHD07");
            return (Criteria) this;
        }

        public Criteria andSHD07LessThan(String value) {
            addCriterion("SHD07 <", value, "SHD07");
            return (Criteria) this;
        }

        public Criteria andSHD07LessThanOrEqualTo(String value) {
            addCriterion("SHD07 <=", value, "SHD07");
            return (Criteria) this;
        }

        public Criteria andSHD07Like(String value) {
            addCriterion("SHD07 like", value, "SHD07");
            return (Criteria) this;
        }

        public Criteria andSHD07NotLike(String value) {
            addCriterion("SHD07 not like", value, "SHD07");
            return (Criteria) this;
        }

        public Criteria andSHD07In(List<String> values) {
            addCriterion("SHD07 in", values, "SHD07");
            return (Criteria) this;
        }

        public Criteria andSHD07NotIn(List<String> values) {
            addCriterion("SHD07 not in", values, "SHD07");
            return (Criteria) this;
        }

        public Criteria andSHD07Between(String value1, String value2) {
            addCriterion("SHD07 between", value1, value2, "SHD07");
            return (Criteria) this;
        }

        public Criteria andSHD07NotBetween(String value1, String value2) {
            addCriterion("SHD07 not between", value1, value2, "SHD07");
            return (Criteria) this;
        }

        public Criteria andSHD08IsNull() {
            addCriterion("SHD08 is null");
            return (Criteria) this;
        }

        public Criteria andSHD08IsNotNull() {
            addCriterion("SHD08 is not null");
            return (Criteria) this;
        }

        public Criteria andSHD08EqualTo(String value) {
            addCriterion("SHD08 =", value, "SHD08");
            return (Criteria) this;
        }

        public Criteria andSHD08NotEqualTo(String value) {
            addCriterion("SHD08 <>", value, "SHD08");
            return (Criteria) this;
        }

        public Criteria andSHD08GreaterThan(String value) {
            addCriterion("SHD08 >", value, "SHD08");
            return (Criteria) this;
        }

        public Criteria andSHD08GreaterThanOrEqualTo(String value) {
            addCriterion("SHD08 >=", value, "SHD08");
            return (Criteria) this;
        }

        public Criteria andSHD08LessThan(String value) {
            addCriterion("SHD08 <", value, "SHD08");
            return (Criteria) this;
        }

        public Criteria andSHD08LessThanOrEqualTo(String value) {
            addCriterion("SHD08 <=", value, "SHD08");
            return (Criteria) this;
        }

        public Criteria andSHD08Like(String value) {
            addCriterion("SHD08 like", value, "SHD08");
            return (Criteria) this;
        }

        public Criteria andSHD08NotLike(String value) {
            addCriterion("SHD08 not like", value, "SHD08");
            return (Criteria) this;
        }

        public Criteria andSHD08In(List<String> values) {
            addCriterion("SHD08 in", values, "SHD08");
            return (Criteria) this;
        }

        public Criteria andSHD08NotIn(List<String> values) {
            addCriterion("SHD08 not in", values, "SHD08");
            return (Criteria) this;
        }

        public Criteria andSHD08Between(String value1, String value2) {
            addCriterion("SHD08 between", value1, value2, "SHD08");
            return (Criteria) this;
        }

        public Criteria andSHD08NotBetween(String value1, String value2) {
            addCriterion("SHD08 not between", value1, value2, "SHD08");
            return (Criteria) this;
        }

        public Criteria andSHD09IsNull() {
            addCriterion("SHD09 is null");
            return (Criteria) this;
        }

        public Criteria andSHD09IsNotNull() {
            addCriterion("SHD09 is not null");
            return (Criteria) this;
        }

        public Criteria andSHD09EqualTo(String value) {
            addCriterion("SHD09 =", value, "SHD09");
            return (Criteria) this;
        }

        public Criteria andSHD09NotEqualTo(String value) {
            addCriterion("SHD09 <>", value, "SHD09");
            return (Criteria) this;
        }

        public Criteria andSHD09GreaterThan(String value) {
            addCriterion("SHD09 >", value, "SHD09");
            return (Criteria) this;
        }

        public Criteria andSHD09GreaterThanOrEqualTo(String value) {
            addCriterion("SHD09 >=", value, "SHD09");
            return (Criteria) this;
        }

        public Criteria andSHD09LessThan(String value) {
            addCriterion("SHD09 <", value, "SHD09");
            return (Criteria) this;
        }

        public Criteria andSHD09LessThanOrEqualTo(String value) {
            addCriterion("SHD09 <=", value, "SHD09");
            return (Criteria) this;
        }

        public Criteria andSHD09Like(String value) {
            addCriterion("SHD09 like", value, "SHD09");
            return (Criteria) this;
        }

        public Criteria andSHD09NotLike(String value) {
            addCriterion("SHD09 not like", value, "SHD09");
            return (Criteria) this;
        }

        public Criteria andSHD09In(List<String> values) {
            addCriterion("SHD09 in", values, "SHD09");
            return (Criteria) this;
        }

        public Criteria andSHD09NotIn(List<String> values) {
            addCriterion("SHD09 not in", values, "SHD09");
            return (Criteria) this;
        }

        public Criteria andSHD09Between(String value1, String value2) {
            addCriterion("SHD09 between", value1, value2, "SHD09");
            return (Criteria) this;
        }

        public Criteria andSHD09NotBetween(String value1, String value2) {
            addCriterion("SHD09 not between", value1, value2, "SHD09");
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