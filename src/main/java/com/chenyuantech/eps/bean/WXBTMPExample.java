package com.chenyuantech.eps.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class WXBTMPExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WXBTMPExample() {
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

        public Criteria andWIDIsNull() {
            addCriterion("WID is null");
            return (Criteria) this;
        }

        public Criteria andWIDIsNotNull() {
            addCriterion("WID is not null");
            return (Criteria) this;
        }

        public Criteria andWIDEqualTo(String value) {
            addCriterion("WID =", value, "WID");
            return (Criteria) this;
        }

        public Criteria andWIDNotEqualTo(String value) {
            addCriterion("WID <>", value, "WID");
            return (Criteria) this;
        }

        public Criteria andWIDGreaterThan(String value) {
            addCriterion("WID >", value, "WID");
            return (Criteria) this;
        }

        public Criteria andWIDGreaterThanOrEqualTo(String value) {
            addCriterion("WID >=", value, "WID");
            return (Criteria) this;
        }

        public Criteria andWIDLessThan(String value) {
            addCriterion("WID <", value, "WID");
            return (Criteria) this;
        }

        public Criteria andWIDLessThanOrEqualTo(String value) {
            addCriterion("WID <=", value, "WID");
            return (Criteria) this;
        }

        public Criteria andWIDLike(String value) {
            addCriterion("WID like", value, "WID");
            return (Criteria) this;
        }

        public Criteria andWIDNotLike(String value) {
            addCriterion("WID not like", value, "WID");
            return (Criteria) this;
        }

        public Criteria andWIDIn(List<String> values) {
            addCriterion("WID in", values, "WID");
            return (Criteria) this;
        }

        public Criteria andWIDNotIn(List<String> values) {
            addCriterion("WID not in", values, "WID");
            return (Criteria) this;
        }

        public Criteria andWIDBetween(String value1, String value2) {
            addCriterion("WID between", value1, value2, "WID");
            return (Criteria) this;
        }

        public Criteria andWIDNotBetween(String value1, String value2) {
            addCriterion("WID not between", value1, value2, "WID");
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

        public Criteria andWDATEIsNull() {
            addCriterion("WDATE is null");
            return (Criteria) this;
        }

        public Criteria andWDATEIsNotNull() {
            addCriterion("WDATE is not null");
            return (Criteria) this;
        }

        public Criteria andWDATEEqualTo(Date value) {
            addCriterionForJDBCDate("WDATE =", value, "WDATE");
            return (Criteria) this;
        }

        public Criteria andWDATENotEqualTo(Date value) {
            addCriterionForJDBCDate("WDATE <>", value, "WDATE");
            return (Criteria) this;
        }

        public Criteria andWDATEGreaterThan(Date value) {
            addCriterionForJDBCDate("WDATE >", value, "WDATE");
            return (Criteria) this;
        }

        public Criteria andWDATEGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("WDATE >=", value, "WDATE");
            return (Criteria) this;
        }

        public Criteria andWDATELessThan(Date value) {
            addCriterionForJDBCDate("WDATE <", value, "WDATE");
            return (Criteria) this;
        }

        public Criteria andWDATELessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("WDATE <=", value, "WDATE");
            return (Criteria) this;
        }

        public Criteria andWDATEIn(List<Date> values) {
            addCriterionForJDBCDate("WDATE in", values, "WDATE");
            return (Criteria) this;
        }

        public Criteria andWDATENotIn(List<Date> values) {
            addCriterionForJDBCDate("WDATE not in", values, "WDATE");
            return (Criteria) this;
        }

        public Criteria andWDATEBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("WDATE between", value1, value2, "WDATE");
            return (Criteria) this;
        }

        public Criteria andWDATENotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("WDATE not between", value1, value2, "WDATE");
            return (Criteria) this;
        }

        public Criteria andWSIZEIsNull() {
            addCriterion("WSIZE is null");
            return (Criteria) this;
        }

        public Criteria andWSIZEIsNotNull() {
            addCriterion("WSIZE is not null");
            return (Criteria) this;
        }

        public Criteria andWSIZEEqualTo(String value) {
            addCriterion("WSIZE =", value, "WSIZE");
            return (Criteria) this;
        }

        public Criteria andWSIZENotEqualTo(String value) {
            addCriterion("WSIZE <>", value, "WSIZE");
            return (Criteria) this;
        }

        public Criteria andWSIZEGreaterThan(String value) {
            addCriterion("WSIZE >", value, "WSIZE");
            return (Criteria) this;
        }

        public Criteria andWSIZEGreaterThanOrEqualTo(String value) {
            addCriterion("WSIZE >=", value, "WSIZE");
            return (Criteria) this;
        }

        public Criteria andWSIZELessThan(String value) {
            addCriterion("WSIZE <", value, "WSIZE");
            return (Criteria) this;
        }

        public Criteria andWSIZELessThanOrEqualTo(String value) {
            addCriterion("WSIZE <=", value, "WSIZE");
            return (Criteria) this;
        }

        public Criteria andWSIZELike(String value) {
            addCriterion("WSIZE like", value, "WSIZE");
            return (Criteria) this;
        }

        public Criteria andWSIZENotLike(String value) {
            addCriterion("WSIZE not like", value, "WSIZE");
            return (Criteria) this;
        }

        public Criteria andWSIZEIn(List<String> values) {
            addCriterion("WSIZE in", values, "WSIZE");
            return (Criteria) this;
        }

        public Criteria andWSIZENotIn(List<String> values) {
            addCriterion("WSIZE not in", values, "WSIZE");
            return (Criteria) this;
        }

        public Criteria andWSIZEBetween(String value1, String value2) {
            addCriterion("WSIZE between", value1, value2, "WSIZE");
            return (Criteria) this;
        }

        public Criteria andWSIZENotBetween(String value1, String value2) {
            addCriterion("WSIZE not between", value1, value2, "WSIZE");
            return (Criteria) this;
        }

        public Criteria andWTRIsNull() {
            addCriterion("WTR is null");
            return (Criteria) this;
        }

        public Criteria andWTRIsNotNull() {
            addCriterion("WTR is not null");
            return (Criteria) this;
        }

        public Criteria andWTREqualTo(String value) {
            addCriterion("WTR =", value, "WTR");
            return (Criteria) this;
        }

        public Criteria andWTRNotEqualTo(String value) {
            addCriterion("WTR <>", value, "WTR");
            return (Criteria) this;
        }

        public Criteria andWTRGreaterThan(String value) {
            addCriterion("WTR >", value, "WTR");
            return (Criteria) this;
        }

        public Criteria andWTRGreaterThanOrEqualTo(String value) {
            addCriterion("WTR >=", value, "WTR");
            return (Criteria) this;
        }

        public Criteria andWTRLessThan(String value) {
            addCriterion("WTR <", value, "WTR");
            return (Criteria) this;
        }

        public Criteria andWTRLessThanOrEqualTo(String value) {
            addCriterion("WTR <=", value, "WTR");
            return (Criteria) this;
        }

        public Criteria andWTRLike(String value) {
            addCriterion("WTR like", value, "WTR");
            return (Criteria) this;
        }

        public Criteria andWTRNotLike(String value) {
            addCriterion("WTR not like", value, "WTR");
            return (Criteria) this;
        }

        public Criteria andWTRIn(List<String> values) {
            addCriterion("WTR in", values, "WTR");
            return (Criteria) this;
        }

        public Criteria andWTRNotIn(List<String> values) {
            addCriterion("WTR not in", values, "WTR");
            return (Criteria) this;
        }

        public Criteria andWTRBetween(String value1, String value2) {
            addCriterion("WTR between", value1, value2, "WTR");
            return (Criteria) this;
        }

        public Criteria andWTRNotBetween(String value1, String value2) {
            addCriterion("WTR not between", value1, value2, "WTR");
            return (Criteria) this;
        }

        public Criteria andWXB05TIsNull() {
            addCriterion("WXB05T is null");
            return (Criteria) this;
        }

        public Criteria andWXB05TIsNotNull() {
            addCriterion("WXB05T is not null");
            return (Criteria) this;
        }

        public Criteria andWXB05TEqualTo(String value) {
            addCriterion("WXB05T =", value, "WXB05T");
            return (Criteria) this;
        }

        public Criteria andWXB05TNotEqualTo(String value) {
            addCriterion("WXB05T <>", value, "WXB05T");
            return (Criteria) this;
        }

        public Criteria andWXB05TGreaterThan(String value) {
            addCriterion("WXB05T >", value, "WXB05T");
            return (Criteria) this;
        }

        public Criteria andWXB05TGreaterThanOrEqualTo(String value) {
            addCriterion("WXB05T >=", value, "WXB05T");
            return (Criteria) this;
        }

        public Criteria andWXB05TLessThan(String value) {
            addCriterion("WXB05T <", value, "WXB05T");
            return (Criteria) this;
        }

        public Criteria andWXB05TLessThanOrEqualTo(String value) {
            addCriterion("WXB05T <=", value, "WXB05T");
            return (Criteria) this;
        }

        public Criteria andWXB05TLike(String value) {
            addCriterion("WXB05T like", value, "WXB05T");
            return (Criteria) this;
        }

        public Criteria andWXB05TNotLike(String value) {
            addCriterion("WXB05T not like", value, "WXB05T");
            return (Criteria) this;
        }

        public Criteria andWXB05TIn(List<String> values) {
            addCriterion("WXB05T in", values, "WXB05T");
            return (Criteria) this;
        }

        public Criteria andWXB05TNotIn(List<String> values) {
            addCriterion("WXB05T not in", values, "WXB05T");
            return (Criteria) this;
        }

        public Criteria andWXB05TBetween(String value1, String value2) {
            addCriterion("WXB05T between", value1, value2, "WXB05T");
            return (Criteria) this;
        }

        public Criteria andWXB05TNotBetween(String value1, String value2) {
            addCriterion("WXB05T not between", value1, value2, "WXB05T");
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