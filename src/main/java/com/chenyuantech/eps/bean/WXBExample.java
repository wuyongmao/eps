package com.chenyuantech.eps.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class WXBExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WXBExample() {
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

        public Criteria andWXB01IsNull() {
            addCriterion("WXB01 is null");
            return (Criteria) this;
        }

        public Criteria andWXB01IsNotNull() {
            addCriterion("WXB01 is not null");
            return (Criteria) this;
        }

        public Criteria andWXB01EqualTo(String value) {
            addCriterion("WXB01 =", value, "WXB01");
            return (Criteria) this;
        }

        public Criteria andWXB01NotEqualTo(String value) {
            addCriterion("WXB01 <>", value, "WXB01");
            return (Criteria) this;
        }

        public Criteria andWXB01GreaterThan(String value) {
            addCriterion("WXB01 >", value, "WXB01");
            return (Criteria) this;
        }

        public Criteria andWXB01GreaterThanOrEqualTo(String value) {
            addCriterion("WXB01 >=", value, "WXB01");
            return (Criteria) this;
        }

        public Criteria andWXB01LessThan(String value) {
            addCriterion("WXB01 <", value, "WXB01");
            return (Criteria) this;
        }

        public Criteria andWXB01LessThanOrEqualTo(String value) {
            addCriterion("WXB01 <=", value, "WXB01");
            return (Criteria) this;
        }

        public Criteria andWXB01Like(String value) {
            addCriterion("WXB01 like", value, "WXB01");
            return (Criteria) this;
        }

        public Criteria andWXB01NotLike(String value) {
            addCriterion("WXB01 not like", value, "WXB01");
            return (Criteria) this;
        }

        public Criteria andWXB01In(List<String> values) {
            addCriterion("WXB01 in", values, "WXB01");
            return (Criteria) this;
        }

        public Criteria andWXB01NotIn(List<String> values) {
            addCriterion("WXB01 not in", values, "WXB01");
            return (Criteria) this;
        }

        public Criteria andWXB01Between(String value1, String value2) {
            addCriterion("WXB01 between", value1, value2, "WXB01");
            return (Criteria) this;
        }

        public Criteria andWXB01NotBetween(String value1, String value2) {
            addCriterion("WXB01 not between", value1, value2, "WXB01");
            return (Criteria) this;
        }

        public Criteria andWXB02IsNull() {
            addCriterion("WXB02 is null");
            return (Criteria) this;
        }

        public Criteria andWXB02IsNotNull() {
            addCriterion("WXB02 is not null");
            return (Criteria) this;
        }

        public Criteria andWXB02EqualTo(Integer value) {
            addCriterion("WXB02 =", value, "WXB02");
            return (Criteria) this;
        }

        public Criteria andWXB02NotEqualTo(Integer value) {
            addCriterion("WXB02 <>", value, "WXB02");
            return (Criteria) this;
        }

        public Criteria andWXB02GreaterThan(Integer value) {
            addCriterion("WXB02 >", value, "WXB02");
            return (Criteria) this;
        }

        public Criteria andWXB02GreaterThanOrEqualTo(Integer value) {
            addCriterion("WXB02 >=", value, "WXB02");
            return (Criteria) this;
        }

        public Criteria andWXB02LessThan(Integer value) {
            addCriterion("WXB02 <", value, "WXB02");
            return (Criteria) this;
        }

        public Criteria andWXB02LessThanOrEqualTo(Integer value) {
            addCriterion("WXB02 <=", value, "WXB02");
            return (Criteria) this;
        }

        public Criteria andWXB02In(List<Integer> values) {
            addCriterion("WXB02 in", values, "WXB02");
            return (Criteria) this;
        }

        public Criteria andWXB02NotIn(List<Integer> values) {
            addCriterion("WXB02 not in", values, "WXB02");
            return (Criteria) this;
        }

        public Criteria andWXB02Between(Integer value1, Integer value2) {
            addCriterion("WXB02 between", value1, value2, "WXB02");
            return (Criteria) this;
        }

        public Criteria andWXB02NotBetween(Integer value1, Integer value2) {
            addCriterion("WXB02 not between", value1, value2, "WXB02");
            return (Criteria) this;
        }

        public Criteria andWXB03IsNull() {
            addCriterion("WXB03 is null");
            return (Criteria) this;
        }

        public Criteria andWXB03IsNotNull() {
            addCriterion("WXB03 is not null");
            return (Criteria) this;
        }

        public Criteria andWXB03EqualTo(String value) {
            addCriterion("WXB03 =", value, "WXB03");
            return (Criteria) this;
        }

        public Criteria andWXB03NotEqualTo(String value) {
            addCriterion("WXB03 <>", value, "WXB03");
            return (Criteria) this;
        }

        public Criteria andWXB03GreaterThan(String value) {
            addCriterion("WXB03 >", value, "WXB03");
            return (Criteria) this;
        }

        public Criteria andWXB03GreaterThanOrEqualTo(String value) {
            addCriterion("WXB03 >=", value, "WXB03");
            return (Criteria) this;
        }

        public Criteria andWXB03LessThan(String value) {
            addCriterion("WXB03 <", value, "WXB03");
            return (Criteria) this;
        }

        public Criteria andWXB03LessThanOrEqualTo(String value) {
            addCriterion("WXB03 <=", value, "WXB03");
            return (Criteria) this;
        }

        public Criteria andWXB03Like(String value) {
            addCriterion("WXB03 like", value, "WXB03");
            return (Criteria) this;
        }

        public Criteria andWXB03NotLike(String value) {
            addCriterion("WXB03 not like", value, "WXB03");
            return (Criteria) this;
        }

        public Criteria andWXB03In(List<String> values) {
            addCriterion("WXB03 in", values, "WXB03");
            return (Criteria) this;
        }

        public Criteria andWXB03NotIn(List<String> values) {
            addCriterion("WXB03 not in", values, "WXB03");
            return (Criteria) this;
        }

        public Criteria andWXB03Between(String value1, String value2) {
            addCriterion("WXB03 between", value1, value2, "WXB03");
            return (Criteria) this;
        }

        public Criteria andWXB03NotBetween(String value1, String value2) {
            addCriterion("WXB03 not between", value1, value2, "WXB03");
            return (Criteria) this;
        }

        public Criteria andWXB04IsNull() {
            addCriterion("WXB04 is null");
            return (Criteria) this;
        }

        public Criteria andWXB04IsNotNull() {
            addCriterion("WXB04 is not null");
            return (Criteria) this;
        }

        public Criteria andWXB04EqualTo(String value) {
            addCriterion("WXB04 =", value, "WXB04");
            return (Criteria) this;
        }

        public Criteria andWXB04NotEqualTo(String value) {
            addCriterion("WXB04 <>", value, "WXB04");
            return (Criteria) this;
        }

        public Criteria andWXB04GreaterThan(String value) {
            addCriterion("WXB04 >", value, "WXB04");
            return (Criteria) this;
        }

        public Criteria andWXB04GreaterThanOrEqualTo(String value) {
            addCriterion("WXB04 >=", value, "WXB04");
            return (Criteria) this;
        }

        public Criteria andWXB04LessThan(String value) {
            addCriterion("WXB04 <", value, "WXB04");
            return (Criteria) this;
        }

        public Criteria andWXB04LessThanOrEqualTo(String value) {
            addCriterion("WXB04 <=", value, "WXB04");
            return (Criteria) this;
        }

        public Criteria andWXB04Like(String value) {
            addCriterion("WXB04 like", value, "WXB04");
            return (Criteria) this;
        }

        public Criteria andWXB04NotLike(String value) {
            addCriterion("WXB04 not like", value, "WXB04");
            return (Criteria) this;
        }

        public Criteria andWXB04In(List<String> values) {
            addCriterion("WXB04 in", values, "WXB04");
            return (Criteria) this;
        }

        public Criteria andWXB04NotIn(List<String> values) {
            addCriterion("WXB04 not in", values, "WXB04");
            return (Criteria) this;
        }

        public Criteria andWXB04Between(String value1, String value2) {
            addCriterion("WXB04 between", value1, value2, "WXB04");
            return (Criteria) this;
        }

        public Criteria andWXB04NotBetween(String value1, String value2) {
            addCriterion("WXB04 not between", value1, value2, "WXB04");
            return (Criteria) this;
        }

        public Criteria andWXB06IsNull() {
            addCriterion("WXB06 is null");
            return (Criteria) this;
        }

        public Criteria andWXB06IsNotNull() {
            addCriterion("WXB06 is not null");
            return (Criteria) this;
        }

        public Criteria andWXB06EqualTo(String value) {
            addCriterion("WXB06 =", value, "WXB06");
            return (Criteria) this;
        }

        public Criteria andWXB06NotEqualTo(String value) {
            addCriterion("WXB06 <>", value, "WXB06");
            return (Criteria) this;
        }

        public Criteria andWXB06GreaterThan(String value) {
            addCriterion("WXB06 >", value, "WXB06");
            return (Criteria) this;
        }

        public Criteria andWXB06GreaterThanOrEqualTo(String value) {
            addCriterion("WXB06 >=", value, "WXB06");
            return (Criteria) this;
        }

        public Criteria andWXB06LessThan(String value) {
            addCriterion("WXB06 <", value, "WXB06");
            return (Criteria) this;
        }

        public Criteria andWXB06LessThanOrEqualTo(String value) {
            addCriterion("WXB06 <=", value, "WXB06");
            return (Criteria) this;
        }

        public Criteria andWXB06Like(String value) {
            addCriterion("WXB06 like", value, "WXB06");
            return (Criteria) this;
        }

        public Criteria andWXB06NotLike(String value) {
            addCriterion("WXB06 not like", value, "WXB06");
            return (Criteria) this;
        }

        public Criteria andWXB06In(List<String> values) {
            addCriterion("WXB06 in", values, "WXB06");
            return (Criteria) this;
        }

        public Criteria andWXB06NotIn(List<String> values) {
            addCriterion("WXB06 not in", values, "WXB06");
            return (Criteria) this;
        }

        public Criteria andWXB06Between(String value1, String value2) {
            addCriterion("WXB06 between", value1, value2, "WXB06");
            return (Criteria) this;
        }

        public Criteria andWXB06NotBetween(String value1, String value2) {
            addCriterion("WXB06 not between", value1, value2, "WXB06");
            return (Criteria) this;
        }

        public Criteria andWXB07IsNull() {
            addCriterion("WXB07 is null");
            return (Criteria) this;
        }

        public Criteria andWXB07IsNotNull() {
            addCriterion("WXB07 is not null");
            return (Criteria) this;
        }

        public Criteria andWXB07EqualTo(String value) {
            addCriterion("WXB07 =", value, "WXB07");
            return (Criteria) this;
        }

        public Criteria andWXB07NotEqualTo(String value) {
            addCriterion("WXB07 <>", value, "WXB07");
            return (Criteria) this;
        }

        public Criteria andWXB07GreaterThan(String value) {
            addCriterion("WXB07 >", value, "WXB07");
            return (Criteria) this;
        }

        public Criteria andWXB07GreaterThanOrEqualTo(String value) {
            addCriterion("WXB07 >=", value, "WXB07");
            return (Criteria) this;
        }

        public Criteria andWXB07LessThan(String value) {
            addCriterion("WXB07 <", value, "WXB07");
            return (Criteria) this;
        }

        public Criteria andWXB07LessThanOrEqualTo(String value) {
            addCriterion("WXB07 <=", value, "WXB07");
            return (Criteria) this;
        }

        public Criteria andWXB07Like(String value) {
            addCriterion("WXB07 like", value, "WXB07");
            return (Criteria) this;
        }

        public Criteria andWXB07NotLike(String value) {
            addCriterion("WXB07 not like", value, "WXB07");
            return (Criteria) this;
        }

        public Criteria andWXB07In(List<String> values) {
            addCriterion("WXB07 in", values, "WXB07");
            return (Criteria) this;
        }

        public Criteria andWXB07NotIn(List<String> values) {
            addCriterion("WXB07 not in", values, "WXB07");
            return (Criteria) this;
        }

        public Criteria andWXB07Between(String value1, String value2) {
            addCriterion("WXB07 between", value1, value2, "WXB07");
            return (Criteria) this;
        }

        public Criteria andWXB07NotBetween(String value1, String value2) {
            addCriterion("WXB07 not between", value1, value2, "WXB07");
            return (Criteria) this;
        }

        public Criteria andWXB08IsNull() {
            addCriterion("WXB08 is null");
            return (Criteria) this;
        }

        public Criteria andWXB08IsNotNull() {
            addCriterion("WXB08 is not null");
            return (Criteria) this;
        }

        public Criteria andWXB08EqualTo(BigDecimal value) {
            addCriterion("WXB08 =", value, "WXB08");
            return (Criteria) this;
        }

        public Criteria andWXB08NotEqualTo(BigDecimal value) {
            addCriterion("WXB08 <>", value, "WXB08");
            return (Criteria) this;
        }

        public Criteria andWXB08GreaterThan(BigDecimal value) {
            addCriterion("WXB08 >", value, "WXB08");
            return (Criteria) this;
        }

        public Criteria andWXB08GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WXB08 >=", value, "WXB08");
            return (Criteria) this;
        }

        public Criteria andWXB08LessThan(BigDecimal value) {
            addCriterion("WXB08 <", value, "WXB08");
            return (Criteria) this;
        }

        public Criteria andWXB08LessThanOrEqualTo(BigDecimal value) {
            addCriterion("WXB08 <=", value, "WXB08");
            return (Criteria) this;
        }

        public Criteria andWXB08In(List<BigDecimal> values) {
            addCriterion("WXB08 in", values, "WXB08");
            return (Criteria) this;
        }

        public Criteria andWXB08NotIn(List<BigDecimal> values) {
            addCriterion("WXB08 not in", values, "WXB08");
            return (Criteria) this;
        }

        public Criteria andWXB08Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("WXB08 between", value1, value2, "WXB08");
            return (Criteria) this;
        }

        public Criteria andWXB08NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WXB08 not between", value1, value2, "WXB08");
            return (Criteria) this;
        }

        public Criteria andWXB09IsNull() {
            addCriterion("WXB09 is null");
            return (Criteria) this;
        }

        public Criteria andWXB09IsNotNull() {
            addCriterion("WXB09 is not null");
            return (Criteria) this;
        }

        public Criteria andWXB09EqualTo(BigDecimal value) {
            addCriterion("WXB09 =", value, "WXB09");
            return (Criteria) this;
        }

        public Criteria andWXB09NotEqualTo(BigDecimal value) {
            addCriterion("WXB09 <>", value, "WXB09");
            return (Criteria) this;
        }

        public Criteria andWXB09GreaterThan(BigDecimal value) {
            addCriterion("WXB09 >", value, "WXB09");
            return (Criteria) this;
        }

        public Criteria andWXB09GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WXB09 >=", value, "WXB09");
            return (Criteria) this;
        }

        public Criteria andWXB09LessThan(BigDecimal value) {
            addCriterion("WXB09 <", value, "WXB09");
            return (Criteria) this;
        }

        public Criteria andWXB09LessThanOrEqualTo(BigDecimal value) {
            addCriterion("WXB09 <=", value, "WXB09");
            return (Criteria) this;
        }

        public Criteria andWXB09In(List<BigDecimal> values) {
            addCriterion("WXB09 in", values, "WXB09");
            return (Criteria) this;
        }

        public Criteria andWXB09NotIn(List<BigDecimal> values) {
            addCriterion("WXB09 not in", values, "WXB09");
            return (Criteria) this;
        }

        public Criteria andWXB09Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("WXB09 between", value1, value2, "WXB09");
            return (Criteria) this;
        }

        public Criteria andWXB09NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WXB09 not between", value1, value2, "WXB09");
            return (Criteria) this;
        }

        public Criteria andWXB10IsNull() {
            addCriterion("WXB10 is null");
            return (Criteria) this;
        }

        public Criteria andWXB10IsNotNull() {
            addCriterion("WXB10 is not null");
            return (Criteria) this;
        }

        public Criteria andWXB10EqualTo(Integer value) {
            addCriterion("WXB10 =", value, "WXB10");
            return (Criteria) this;
        }

        public Criteria andWXB10NotEqualTo(Integer value) {
            addCriterion("WXB10 <>", value, "WXB10");
            return (Criteria) this;
        }

        public Criteria andWXB10GreaterThan(Integer value) {
            addCriterion("WXB10 >", value, "WXB10");
            return (Criteria) this;
        }

        public Criteria andWXB10GreaterThanOrEqualTo(Integer value) {
            addCriterion("WXB10 >=", value, "WXB10");
            return (Criteria) this;
        }

        public Criteria andWXB10LessThan(Integer value) {
            addCriterion("WXB10 <", value, "WXB10");
            return (Criteria) this;
        }

        public Criteria andWXB10LessThanOrEqualTo(Integer value) {
            addCriterion("WXB10 <=", value, "WXB10");
            return (Criteria) this;
        }

        public Criteria andWXB10In(List<Integer> values) {
            addCriterion("WXB10 in", values, "WXB10");
            return (Criteria) this;
        }

        public Criteria andWXB10NotIn(List<Integer> values) {
            addCriterion("WXB10 not in", values, "WXB10");
            return (Criteria) this;
        }

        public Criteria andWXB10Between(Integer value1, Integer value2) {
            addCriterion("WXB10 between", value1, value2, "WXB10");
            return (Criteria) this;
        }

        public Criteria andWXB10NotBetween(Integer value1, Integer value2) {
            addCriterion("WXB10 not between", value1, value2, "WXB10");
            return (Criteria) this;
        }

        public Criteria andWXB11IsNull() {
            addCriterion("WXB11 is null");
            return (Criteria) this;
        }

        public Criteria andWXB11IsNotNull() {
            addCriterion("WXB11 is not null");
            return (Criteria) this;
        }

        public Criteria andWXB11EqualTo(Date value) {
            addCriterionForJDBCDate("WXB11 =", value, "WXB11");
            return (Criteria) this;
        }

        public Criteria andWXB11NotEqualTo(Date value) {
            addCriterionForJDBCDate("WXB11 <>", value, "WXB11");
            return (Criteria) this;
        }

        public Criteria andWXB11GreaterThan(Date value) {
            addCriterionForJDBCDate("WXB11 >", value, "WXB11");
            return (Criteria) this;
        }

        public Criteria andWXB11GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("WXB11 >=", value, "WXB11");
            return (Criteria) this;
        }

        public Criteria andWXB11LessThan(Date value) {
            addCriterionForJDBCDate("WXB11 <", value, "WXB11");
            return (Criteria) this;
        }

        public Criteria andWXB11LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("WXB11 <=", value, "WXB11");
            return (Criteria) this;
        }

        public Criteria andWXB11In(List<Date> values) {
            addCriterionForJDBCDate("WXB11 in", values, "WXB11");
            return (Criteria) this;
        }

        public Criteria andWXB11NotIn(List<Date> values) {
            addCriterionForJDBCDate("WXB11 not in", values, "WXB11");
            return (Criteria) this;
        }

        public Criteria andWXB11Between(Date value1, Date value2) {
            addCriterionForJDBCDate("WXB11 between", value1, value2, "WXB11");
            return (Criteria) this;
        }

        public Criteria andWXB11NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("WXB11 not between", value1, value2, "WXB11");
            return (Criteria) this;
        }

        public Criteria andWXB12IsNull() {
            addCriterion("WXB12 is null");
            return (Criteria) this;
        }

        public Criteria andWXB12IsNotNull() {
            addCriterion("WXB12 is not null");
            return (Criteria) this;
        }

        public Criteria andWXB12EqualTo(Date value) {
            addCriterionForJDBCDate("WXB12 =", value, "WXB12");
            return (Criteria) this;
        }

        public Criteria andWXB12NotEqualTo(Date value) {
            addCriterionForJDBCDate("WXB12 <>", value, "WXB12");
            return (Criteria) this;
        }

        public Criteria andWXB12GreaterThan(Date value) {
            addCriterionForJDBCDate("WXB12 >", value, "WXB12");
            return (Criteria) this;
        }

        public Criteria andWXB12GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("WXB12 >=", value, "WXB12");
            return (Criteria) this;
        }

        public Criteria andWXB12LessThan(Date value) {
            addCriterionForJDBCDate("WXB12 <", value, "WXB12");
            return (Criteria) this;
        }

        public Criteria andWXB12LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("WXB12 <=", value, "WXB12");
            return (Criteria) this;
        }

        public Criteria andWXB12In(List<Date> values) {
            addCriterionForJDBCDate("WXB12 in", values, "WXB12");
            return (Criteria) this;
        }

        public Criteria andWXB12NotIn(List<Date> values) {
            addCriterionForJDBCDate("WXB12 not in", values, "WXB12");
            return (Criteria) this;
        }

        public Criteria andWXB12Between(Date value1, Date value2) {
            addCriterionForJDBCDate("WXB12 between", value1, value2, "WXB12");
            return (Criteria) this;
        }

        public Criteria andWXB12NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("WXB12 not between", value1, value2, "WXB12");
            return (Criteria) this;
        }

        public Criteria andWXB13IsNull() {
            addCriterion("WXB13 is null");
            return (Criteria) this;
        }

        public Criteria andWXB13IsNotNull() {
            addCriterion("WXB13 is not null");
            return (Criteria) this;
        }

        public Criteria andWXB13EqualTo(String value) {
            addCriterion("WXB13 =", value, "WXB13");
            return (Criteria) this;
        }

        public Criteria andWXB13NotEqualTo(String value) {
            addCriterion("WXB13 <>", value, "WXB13");
            return (Criteria) this;
        }

        public Criteria andWXB13GreaterThan(String value) {
            addCriterion("WXB13 >", value, "WXB13");
            return (Criteria) this;
        }

        public Criteria andWXB13GreaterThanOrEqualTo(String value) {
            addCriterion("WXB13 >=", value, "WXB13");
            return (Criteria) this;
        }

        public Criteria andWXB13LessThan(String value) {
            addCriterion("WXB13 <", value, "WXB13");
            return (Criteria) this;
        }

        public Criteria andWXB13LessThanOrEqualTo(String value) {
            addCriterion("WXB13 <=", value, "WXB13");
            return (Criteria) this;
        }

        public Criteria andWXB13Like(String value) {
            addCriterion("WXB13 like", value, "WXB13");
            return (Criteria) this;
        }

        public Criteria andWXB13NotLike(String value) {
            addCriterion("WXB13 not like", value, "WXB13");
            return (Criteria) this;
        }

        public Criteria andWXB13In(List<String> values) {
            addCriterion("WXB13 in", values, "WXB13");
            return (Criteria) this;
        }

        public Criteria andWXB13NotIn(List<String> values) {
            addCriterion("WXB13 not in", values, "WXB13");
            return (Criteria) this;
        }

        public Criteria andWXB13Between(String value1, String value2) {
            addCriterion("WXB13 between", value1, value2, "WXB13");
            return (Criteria) this;
        }

        public Criteria andWXB13NotBetween(String value1, String value2) {
            addCriterion("WXB13 not between", value1, value2, "WXB13");
            return (Criteria) this;
        }

        public Criteria andWXB14IsNull() {
            addCriterion("WXB14 is null");
            return (Criteria) this;
        }

        public Criteria andWXB14IsNotNull() {
            addCriterion("WXB14 is not null");
            return (Criteria) this;
        }

        public Criteria andWXB14EqualTo(String value) {
            addCriterion("WXB14 =", value, "WXB14");
            return (Criteria) this;
        }

        public Criteria andWXB14NotEqualTo(String value) {
            addCriterion("WXB14 <>", value, "WXB14");
            return (Criteria) this;
        }

        public Criteria andWXB14GreaterThan(String value) {
            addCriterion("WXB14 >", value, "WXB14");
            return (Criteria) this;
        }

        public Criteria andWXB14GreaterThanOrEqualTo(String value) {
            addCriterion("WXB14 >=", value, "WXB14");
            return (Criteria) this;
        }

        public Criteria andWXB14LessThan(String value) {
            addCriterion("WXB14 <", value, "WXB14");
            return (Criteria) this;
        }

        public Criteria andWXB14LessThanOrEqualTo(String value) {
            addCriterion("WXB14 <=", value, "WXB14");
            return (Criteria) this;
        }

        public Criteria andWXB14Like(String value) {
            addCriterion("WXB14 like", value, "WXB14");
            return (Criteria) this;
        }

        public Criteria andWXB14NotLike(String value) {
            addCriterion("WXB14 not like", value, "WXB14");
            return (Criteria) this;
        }

        public Criteria andWXB14In(List<String> values) {
            addCriterion("WXB14 in", values, "WXB14");
            return (Criteria) this;
        }

        public Criteria andWXB14NotIn(List<String> values) {
            addCriterion("WXB14 not in", values, "WXB14");
            return (Criteria) this;
        }

        public Criteria andWXB14Between(String value1, String value2) {
            addCriterion("WXB14 between", value1, value2, "WXB14");
            return (Criteria) this;
        }

        public Criteria andWXB14NotBetween(String value1, String value2) {
            addCriterion("WXB14 not between", value1, value2, "WXB14");
            return (Criteria) this;
        }

        public Criteria andWXB15IsNull() {
            addCriterion("WXB15 is null");
            return (Criteria) this;
        }

        public Criteria andWXB15IsNotNull() {
            addCriterion("WXB15 is not null");
            return (Criteria) this;
        }

        public Criteria andWXB15EqualTo(String value) {
            addCriterion("WXB15 =", value, "WXB15");
            return (Criteria) this;
        }

        public Criteria andWXB15NotEqualTo(String value) {
            addCriterion("WXB15 <>", value, "WXB15");
            return (Criteria) this;
        }

        public Criteria andWXB15GreaterThan(String value) {
            addCriterion("WXB15 >", value, "WXB15");
            return (Criteria) this;
        }

        public Criteria andWXB15GreaterThanOrEqualTo(String value) {
            addCriterion("WXB15 >=", value, "WXB15");
            return (Criteria) this;
        }

        public Criteria andWXB15LessThan(String value) {
            addCriterion("WXB15 <", value, "WXB15");
            return (Criteria) this;
        }

        public Criteria andWXB15LessThanOrEqualTo(String value) {
            addCriterion("WXB15 <=", value, "WXB15");
            return (Criteria) this;
        }

        public Criteria andWXB15Like(String value) {
            addCriterion("WXB15 like", value, "WXB15");
            return (Criteria) this;
        }

        public Criteria andWXB15NotLike(String value) {
            addCriterion("WXB15 not like", value, "WXB15");
            return (Criteria) this;
        }

        public Criteria andWXB15In(List<String> values) {
            addCriterion("WXB15 in", values, "WXB15");
            return (Criteria) this;
        }

        public Criteria andWXB15NotIn(List<String> values) {
            addCriterion("WXB15 not in", values, "WXB15");
            return (Criteria) this;
        }

        public Criteria andWXB15Between(String value1, String value2) {
            addCriterion("WXB15 between", value1, value2, "WXB15");
            return (Criteria) this;
        }

        public Criteria andWXB15NotBetween(String value1, String value2) {
            addCriterion("WXB15 not between", value1, value2, "WXB15");
            return (Criteria) this;
        }

        public Criteria andWXB16IsNull() {
            addCriterion("WXB16 is null");
            return (Criteria) this;
        }

        public Criteria andWXB16IsNotNull() {
            addCriterion("WXB16 is not null");
            return (Criteria) this;
        }

        public Criteria andWXB16EqualTo(BigDecimal value) {
            addCriterion("WXB16 =", value, "WXB16");
            return (Criteria) this;
        }

        public Criteria andWXB16NotEqualTo(BigDecimal value) {
            addCriterion("WXB16 <>", value, "WXB16");
            return (Criteria) this;
        }

        public Criteria andWXB16GreaterThan(BigDecimal value) {
            addCriterion("WXB16 >", value, "WXB16");
            return (Criteria) this;
        }

        public Criteria andWXB16GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WXB16 >=", value, "WXB16");
            return (Criteria) this;
        }

        public Criteria andWXB16LessThan(BigDecimal value) {
            addCriterion("WXB16 <", value, "WXB16");
            return (Criteria) this;
        }

        public Criteria andWXB16LessThanOrEqualTo(BigDecimal value) {
            addCriterion("WXB16 <=", value, "WXB16");
            return (Criteria) this;
        }

        public Criteria andWXB16In(List<BigDecimal> values) {
            addCriterion("WXB16 in", values, "WXB16");
            return (Criteria) this;
        }

        public Criteria andWXB16NotIn(List<BigDecimal> values) {
            addCriterion("WXB16 not in", values, "WXB16");
            return (Criteria) this;
        }

        public Criteria andWXB16Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("WXB16 between", value1, value2, "WXB16");
            return (Criteria) this;
        }

        public Criteria andWXB16NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WXB16 not between", value1, value2, "WXB16");
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