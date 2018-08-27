package com.chenyuantech.eps.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class CYBExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CYBExample() {
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

        public Criteria andCYB01IsNull() {
            addCriterion("CYB01 is null");
            return (Criteria) this;
        }

        public Criteria andCYB01IsNotNull() {
            addCriterion("CYB01 is not null");
            return (Criteria) this;
        }

        public Criteria andCYB01EqualTo(String value) {
            addCriterion("CYB01 =", value, "CYB01");
            return (Criteria) this;
        }

        public Criteria andCYB01NotEqualTo(String value) {
            addCriterion("CYB01 <>", value, "CYB01");
            return (Criteria) this;
        }

        public Criteria andCYB01GreaterThan(String value) {
            addCriterion("CYB01 >", value, "CYB01");
            return (Criteria) this;
        }

        public Criteria andCYB01GreaterThanOrEqualTo(String value) {
            addCriterion("CYB01 >=", value, "CYB01");
            return (Criteria) this;
        }

        public Criteria andCYB01LessThan(String value) {
            addCriterion("CYB01 <", value, "CYB01");
            return (Criteria) this;
        }

        public Criteria andCYB01LessThanOrEqualTo(String value) {
            addCriterion("CYB01 <=", value, "CYB01");
            return (Criteria) this;
        }

        public Criteria andCYB01Like(String value) {
            addCriterion("CYB01 like", value, "CYB01");
            return (Criteria) this;
        }

        public Criteria andCYB01NotLike(String value) {
            addCriterion("CYB01 not like", value, "CYB01");
            return (Criteria) this;
        }

        public Criteria andCYB01In(List<String> values) {
            addCriterion("CYB01 in", values, "CYB01");
            return (Criteria) this;
        }

        public Criteria andCYB01NotIn(List<String> values) {
            addCriterion("CYB01 not in", values, "CYB01");
            return (Criteria) this;
        }

        public Criteria andCYB01Between(String value1, String value2) {
            addCriterion("CYB01 between", value1, value2, "CYB01");
            return (Criteria) this;
        }

        public Criteria andCYB01NotBetween(String value1, String value2) {
            addCriterion("CYB01 not between", value1, value2, "CYB01");
            return (Criteria) this;
        }

        public Criteria andCYB02IsNull() {
            addCriterion("CYB02 is null");
            return (Criteria) this;
        }

        public Criteria andCYB02IsNotNull() {
            addCriterion("CYB02 is not null");
            return (Criteria) this;
        }

        public Criteria andCYB02EqualTo(Integer value) {
            addCriterion("CYB02 =", value, "CYB02");
            return (Criteria) this;
        }

        public Criteria andCYB02NotEqualTo(Integer value) {
            addCriterion("CYB02 <>", value, "CYB02");
            return (Criteria) this;
        }

        public Criteria andCYB02GreaterThan(Integer value) {
            addCriterion("CYB02 >", value, "CYB02");
            return (Criteria) this;
        }

        public Criteria andCYB02GreaterThanOrEqualTo(Integer value) {
            addCriterion("CYB02 >=", value, "CYB02");
            return (Criteria) this;
        }

        public Criteria andCYB02LessThan(Integer value) {
            addCriterion("CYB02 <", value, "CYB02");
            return (Criteria) this;
        }

        public Criteria andCYB02LessThanOrEqualTo(Integer value) {
            addCriterion("CYB02 <=", value, "CYB02");
            return (Criteria) this;
        }

        public Criteria andCYB02In(List<Integer> values) {
            addCriterion("CYB02 in", values, "CYB02");
            return (Criteria) this;
        }

        public Criteria andCYB02NotIn(List<Integer> values) {
            addCriterion("CYB02 not in", values, "CYB02");
            return (Criteria) this;
        }

        public Criteria andCYB02Between(Integer value1, Integer value2) {
            addCriterion("CYB02 between", value1, value2, "CYB02");
            return (Criteria) this;
        }

        public Criteria andCYB02NotBetween(Integer value1, Integer value2) {
            addCriterion("CYB02 not between", value1, value2, "CYB02");
            return (Criteria) this;
        }

        public Criteria andCYB03IsNull() {
            addCriterion("CYB03 is null");
            return (Criteria) this;
        }

        public Criteria andCYB03IsNotNull() {
            addCriterion("CYB03 is not null");
            return (Criteria) this;
        }

        public Criteria andCYB03EqualTo(BigDecimal value) {
            addCriterion("CYB03 =", value, "CYB03");
            return (Criteria) this;
        }

        public Criteria andCYB03NotEqualTo(BigDecimal value) {
            addCriterion("CYB03 <>", value, "CYB03");
            return (Criteria) this;
        }

        public Criteria andCYB03GreaterThan(BigDecimal value) {
            addCriterion("CYB03 >", value, "CYB03");
            return (Criteria) this;
        }

        public Criteria andCYB03GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CYB03 >=", value, "CYB03");
            return (Criteria) this;
        }

        public Criteria andCYB03LessThan(BigDecimal value) {
            addCriterion("CYB03 <", value, "CYB03");
            return (Criteria) this;
        }

        public Criteria andCYB03LessThanOrEqualTo(BigDecimal value) {
            addCriterion("CYB03 <=", value, "CYB03");
            return (Criteria) this;
        }

        public Criteria andCYB03In(List<BigDecimal> values) {
            addCriterion("CYB03 in", values, "CYB03");
            return (Criteria) this;
        }

        public Criteria andCYB03NotIn(List<BigDecimal> values) {
            addCriterion("CYB03 not in", values, "CYB03");
            return (Criteria) this;
        }

        public Criteria andCYB03Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("CYB03 between", value1, value2, "CYB03");
            return (Criteria) this;
        }

        public Criteria andCYB03NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CYB03 not between", value1, value2, "CYB03");
            return (Criteria) this;
        }

        public Criteria andCYB04IsNull() {
            addCriterion("CYB04 is null");
            return (Criteria) this;
        }

        public Criteria andCYB04IsNotNull() {
            addCriterion("CYB04 is not null");
            return (Criteria) this;
        }

        public Criteria andCYB04EqualTo(BigDecimal value) {
            addCriterion("CYB04 =", value, "CYB04");
            return (Criteria) this;
        }

        public Criteria andCYB04NotEqualTo(BigDecimal value) {
            addCriterion("CYB04 <>", value, "CYB04");
            return (Criteria) this;
        }

        public Criteria andCYB04GreaterThan(BigDecimal value) {
            addCriterion("CYB04 >", value, "CYB04");
            return (Criteria) this;
        }

        public Criteria andCYB04GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CYB04 >=", value, "CYB04");
            return (Criteria) this;
        }

        public Criteria andCYB04LessThan(BigDecimal value) {
            addCriterion("CYB04 <", value, "CYB04");
            return (Criteria) this;
        }

        public Criteria andCYB04LessThanOrEqualTo(BigDecimal value) {
            addCriterion("CYB04 <=", value, "CYB04");
            return (Criteria) this;
        }

        public Criteria andCYB04In(List<BigDecimal> values) {
            addCriterion("CYB04 in", values, "CYB04");
            return (Criteria) this;
        }

        public Criteria andCYB04NotIn(List<BigDecimal> values) {
            addCriterion("CYB04 not in", values, "CYB04");
            return (Criteria) this;
        }

        public Criteria andCYB04Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("CYB04 between", value1, value2, "CYB04");
            return (Criteria) this;
        }

        public Criteria andCYB04NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CYB04 not between", value1, value2, "CYB04");
            return (Criteria) this;
        }

        public Criteria andCYB05IsNull() {
            addCriterion("CYB05 is null");
            return (Criteria) this;
        }

        public Criteria andCYB05IsNotNull() {
            addCriterion("CYB05 is not null");
            return (Criteria) this;
        }

        public Criteria andCYB05EqualTo(Date value) {
            addCriterionForJDBCDate("CYB05 =", value, "CYB05");
            return (Criteria) this;
        }

        public Criteria andCYB05NotEqualTo(Date value) {
            addCriterionForJDBCDate("CYB05 <>", value, "CYB05");
            return (Criteria) this;
        }

        public Criteria andCYB05GreaterThan(Date value) {
            addCriterionForJDBCDate("CYB05 >", value, "CYB05");
            return (Criteria) this;
        }

        public Criteria andCYB05GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CYB05 >=", value, "CYB05");
            return (Criteria) this;
        }

        public Criteria andCYB05LessThan(Date value) {
            addCriterionForJDBCDate("CYB05 <", value, "CYB05");
            return (Criteria) this;
        }

        public Criteria andCYB05LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CYB05 <=", value, "CYB05");
            return (Criteria) this;
        }

        public Criteria andCYB05In(List<Date> values) {
            addCriterionForJDBCDate("CYB05 in", values, "CYB05");
            return (Criteria) this;
        }

        public Criteria andCYB05NotIn(List<Date> values) {
            addCriterionForJDBCDate("CYB05 not in", values, "CYB05");
            return (Criteria) this;
        }

        public Criteria andCYB05Between(Date value1, Date value2) {
            addCriterionForJDBCDate("CYB05 between", value1, value2, "CYB05");
            return (Criteria) this;
        }

        public Criteria andCYB05NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CYB05 not between", value1, value2, "CYB05");
            return (Criteria) this;
        }

        public Criteria andCYB06IsNull() {
            addCriterion("CYB06 is null");
            return (Criteria) this;
        }

        public Criteria andCYB06IsNotNull() {
            addCriterion("CYB06 is not null");
            return (Criteria) this;
        }

        public Criteria andCYB06EqualTo(String value) {
            addCriterion("CYB06 =", value, "CYB06");
            return (Criteria) this;
        }

        public Criteria andCYB06NotEqualTo(String value) {
            addCriterion("CYB06 <>", value, "CYB06");
            return (Criteria) this;
        }

        public Criteria andCYB06GreaterThan(String value) {
            addCriterion("CYB06 >", value, "CYB06");
            return (Criteria) this;
        }

        public Criteria andCYB06GreaterThanOrEqualTo(String value) {
            addCriterion("CYB06 >=", value, "CYB06");
            return (Criteria) this;
        }

        public Criteria andCYB06LessThan(String value) {
            addCriterion("CYB06 <", value, "CYB06");
            return (Criteria) this;
        }

        public Criteria andCYB06LessThanOrEqualTo(String value) {
            addCriterion("CYB06 <=", value, "CYB06");
            return (Criteria) this;
        }

        public Criteria andCYB06Like(String value) {
            addCriterion("CYB06 like", value, "CYB06");
            return (Criteria) this;
        }

        public Criteria andCYB06NotLike(String value) {
            addCriterion("CYB06 not like", value, "CYB06");
            return (Criteria) this;
        }

        public Criteria andCYB06In(List<String> values) {
            addCriterion("CYB06 in", values, "CYB06");
            return (Criteria) this;
        }

        public Criteria andCYB06NotIn(List<String> values) {
            addCriterion("CYB06 not in", values, "CYB06");
            return (Criteria) this;
        }

        public Criteria andCYB06Between(String value1, String value2) {
            addCriterion("CYB06 between", value1, value2, "CYB06");
            return (Criteria) this;
        }

        public Criteria andCYB06NotBetween(String value1, String value2) {
            addCriterion("CYB06 not between", value1, value2, "CYB06");
            return (Criteria) this;
        }

        public Criteria andCYB07IsNull() {
            addCriterion("CYB07 is null");
            return (Criteria) this;
        }

        public Criteria andCYB07IsNotNull() {
            addCriterion("CYB07 is not null");
            return (Criteria) this;
        }

        public Criteria andCYB07EqualTo(String value) {
            addCriterion("CYB07 =", value, "CYB07");
            return (Criteria) this;
        }

        public Criteria andCYB07NotEqualTo(String value) {
            addCriterion("CYB07 <>", value, "CYB07");
            return (Criteria) this;
        }

        public Criteria andCYB07GreaterThan(String value) {
            addCriterion("CYB07 >", value, "CYB07");
            return (Criteria) this;
        }

        public Criteria andCYB07GreaterThanOrEqualTo(String value) {
            addCriterion("CYB07 >=", value, "CYB07");
            return (Criteria) this;
        }

        public Criteria andCYB07LessThan(String value) {
            addCriterion("CYB07 <", value, "CYB07");
            return (Criteria) this;
        }

        public Criteria andCYB07LessThanOrEqualTo(String value) {
            addCriterion("CYB07 <=", value, "CYB07");
            return (Criteria) this;
        }

        public Criteria andCYB07Like(String value) {
            addCriterion("CYB07 like", value, "CYB07");
            return (Criteria) this;
        }

        public Criteria andCYB07NotLike(String value) {
            addCriterion("CYB07 not like", value, "CYB07");
            return (Criteria) this;
        }

        public Criteria andCYB07In(List<String> values) {
            addCriterion("CYB07 in", values, "CYB07");
            return (Criteria) this;
        }

        public Criteria andCYB07NotIn(List<String> values) {
            addCriterion("CYB07 not in", values, "CYB07");
            return (Criteria) this;
        }

        public Criteria andCYB07Between(String value1, String value2) {
            addCriterion("CYB07 between", value1, value2, "CYB07");
            return (Criteria) this;
        }

        public Criteria andCYB07NotBetween(String value1, String value2) {
            addCriterion("CYB07 not between", value1, value2, "CYB07");
            return (Criteria) this;
        }

        public Criteria andCYB08IsNull() {
            addCriterion("CYB08 is null");
            return (Criteria) this;
        }

        public Criteria andCYB08IsNotNull() {
            addCriterion("CYB08 is not null");
            return (Criteria) this;
        }

        public Criteria andCYB08EqualTo(String value) {
            addCriterion("CYB08 =", value, "CYB08");
            return (Criteria) this;
        }

        public Criteria andCYB08NotEqualTo(String value) {
            addCriterion("CYB08 <>", value, "CYB08");
            return (Criteria) this;
        }

        public Criteria andCYB08GreaterThan(String value) {
            addCriterion("CYB08 >", value, "CYB08");
            return (Criteria) this;
        }

        public Criteria andCYB08GreaterThanOrEqualTo(String value) {
            addCriterion("CYB08 >=", value, "CYB08");
            return (Criteria) this;
        }

        public Criteria andCYB08LessThan(String value) {
            addCriterion("CYB08 <", value, "CYB08");
            return (Criteria) this;
        }

        public Criteria andCYB08LessThanOrEqualTo(String value) {
            addCriterion("CYB08 <=", value, "CYB08");
            return (Criteria) this;
        }

        public Criteria andCYB08Like(String value) {
            addCriterion("CYB08 like", value, "CYB08");
            return (Criteria) this;
        }

        public Criteria andCYB08NotLike(String value) {
            addCriterion("CYB08 not like", value, "CYB08");
            return (Criteria) this;
        }

        public Criteria andCYB08In(List<String> values) {
            addCriterion("CYB08 in", values, "CYB08");
            return (Criteria) this;
        }

        public Criteria andCYB08NotIn(List<String> values) {
            addCriterion("CYB08 not in", values, "CYB08");
            return (Criteria) this;
        }

        public Criteria andCYB08Between(String value1, String value2) {
            addCriterion("CYB08 between", value1, value2, "CYB08");
            return (Criteria) this;
        }

        public Criteria andCYB08NotBetween(String value1, String value2) {
            addCriterion("CYB08 not between", value1, value2, "CYB08");
            return (Criteria) this;
        }

        public Criteria andCYB09IsNull() {
            addCriterion("CYB09 is null");
            return (Criteria) this;
        }

        public Criteria andCYB09IsNotNull() {
            addCriterion("CYB09 is not null");
            return (Criteria) this;
        }

        public Criteria andCYB09EqualTo(BigDecimal value) {
            addCriterion("CYB09 =", value, "CYB09");
            return (Criteria) this;
        }

        public Criteria andCYB09NotEqualTo(BigDecimal value) {
            addCriterion("CYB09 <>", value, "CYB09");
            return (Criteria) this;
        }

        public Criteria andCYB09GreaterThan(BigDecimal value) {
            addCriterion("CYB09 >", value, "CYB09");
            return (Criteria) this;
        }

        public Criteria andCYB09GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CYB09 >=", value, "CYB09");
            return (Criteria) this;
        }

        public Criteria andCYB09LessThan(BigDecimal value) {
            addCriterion("CYB09 <", value, "CYB09");
            return (Criteria) this;
        }

        public Criteria andCYB09LessThanOrEqualTo(BigDecimal value) {
            addCriterion("CYB09 <=", value, "CYB09");
            return (Criteria) this;
        }

        public Criteria andCYB09In(List<BigDecimal> values) {
            addCriterion("CYB09 in", values, "CYB09");
            return (Criteria) this;
        }

        public Criteria andCYB09NotIn(List<BigDecimal> values) {
            addCriterion("CYB09 not in", values, "CYB09");
            return (Criteria) this;
        }

        public Criteria andCYB09Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("CYB09 between", value1, value2, "CYB09");
            return (Criteria) this;
        }

        public Criteria andCYB09NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CYB09 not between", value1, value2, "CYB09");
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