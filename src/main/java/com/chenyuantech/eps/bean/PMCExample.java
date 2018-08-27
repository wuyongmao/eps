package com.chenyuantech.eps.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PMCExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public PMCExample() {
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

        public Criteria andPMC01IsNull() {
            addCriterion("PMC01 is null");
            return (Criteria) this;
        }

        public Criteria andPMC01IsNotNull() {
            addCriterion("PMC01 is not null");
            return (Criteria) this;
        }

        public Criteria andPMC01EqualTo(String value) {
            addCriterion("PMC01 =", value, "PMC01");
            return (Criteria) this;
        }

        public Criteria andPMC01NotEqualTo(String value) {
            addCriterion("PMC01 <>", value, "PMC01");
            return (Criteria) this;
        }

        public Criteria andPMC01GreaterThan(String value) {
            addCriterion("PMC01 >", value, "PMC01");
            return (Criteria) this;
        }

        public Criteria andPMC01GreaterThanOrEqualTo(String value) {
            addCriterion("PMC01 >=", value, "PMC01");
            return (Criteria) this;
        }

        public Criteria andPMC01LessThan(String value) {
            addCriterion("PMC01 <", value, "PMC01");
            return (Criteria) this;
        }

        public Criteria andPMC01LessThanOrEqualTo(String value) {
            addCriterion("PMC01 <=", value, "PMC01");
            return (Criteria) this;
        }

        public Criteria andPMC01Like(String value) {
            addCriterion("PMC01 like", value, "PMC01");
            return (Criteria) this;
        }

        public Criteria andPMC01NotLike(String value) {
            addCriterion("PMC01 not like", value, "PMC01");
            return (Criteria) this;
        }

        public Criteria andPMC01In(List<String> values) {
            addCriterion("PMC01 in", values, "PMC01");
            return (Criteria) this;
        }

        public Criteria andPMC01NotIn(List<String> values) {
            addCriterion("PMC01 not in", values, "PMC01");
            return (Criteria) this;
        }

        public Criteria andPMC01Between(String value1, String value2) {
            addCriterion("PMC01 between", value1, value2, "PMC01");
            return (Criteria) this;
        }

        public Criteria andPMC01NotBetween(String value1, String value2) {
            addCriterion("PMC01 not between", value1, value2, "PMC01");
            return (Criteria) this;
        }

        public Criteria andPMC02IsNull() {
            addCriterion("PMC02 is null");
            return (Criteria) this;
        }

        public Criteria andPMC02IsNotNull() {
            addCriterion("PMC02 is not null");
            return (Criteria) this;
        }

        public Criteria andPMC02EqualTo(String value) {
            addCriterion("PMC02 =", value, "PMC02");
            return (Criteria) this;
        }

        public Criteria andPMC02NotEqualTo(String value) {
            addCriterion("PMC02 <>", value, "PMC02");
            return (Criteria) this;
        }

        public Criteria andPMC02GreaterThan(String value) {
            addCriterion("PMC02 >", value, "PMC02");
            return (Criteria) this;
        }

        public Criteria andPMC02GreaterThanOrEqualTo(String value) {
            addCriterion("PMC02 >=", value, "PMC02");
            return (Criteria) this;
        }

        public Criteria andPMC02LessThan(String value) {
            addCriterion("PMC02 <", value, "PMC02");
            return (Criteria) this;
        }

        public Criteria andPMC02LessThanOrEqualTo(String value) {
            addCriterion("PMC02 <=", value, "PMC02");
            return (Criteria) this;
        }

        public Criteria andPMC02Like(String value) {
            addCriterion("PMC02 like", value, "PMC02");
            return (Criteria) this;
        }

        public Criteria andPMC02NotLike(String value) {
            addCriterion("PMC02 not like", value, "PMC02");
            return (Criteria) this;
        }

        public Criteria andPMC02In(List<String> values) {
            addCriterion("PMC02 in", values, "PMC02");
            return (Criteria) this;
        }

        public Criteria andPMC02NotIn(List<String> values) {
            addCriterion("PMC02 not in", values, "PMC02");
            return (Criteria) this;
        }

        public Criteria andPMC02Between(String value1, String value2) {
            addCriterion("PMC02 between", value1, value2, "PMC02");
            return (Criteria) this;
        }

        public Criteria andPMC02NotBetween(String value1, String value2) {
            addCriterion("PMC02 not between", value1, value2, "PMC02");
            return (Criteria) this;
        }

        public Criteria andPMC03IsNull() {
            addCriterion("PMC03 is null");
            return (Criteria) this;
        }

        public Criteria andPMC03IsNotNull() {
            addCriterion("PMC03 is not null");
            return (Criteria) this;
        }

        public Criteria andPMC03EqualTo(String value) {
            addCriterion("PMC03 =", value, "PMC03");
            return (Criteria) this;
        }

        public Criteria andPMC03NotEqualTo(String value) {
            addCriterion("PMC03 <>", value, "PMC03");
            return (Criteria) this;
        }

        public Criteria andPMC03GreaterThan(String value) {
            addCriterion("PMC03 >", value, "PMC03");
            return (Criteria) this;
        }

        public Criteria andPMC03GreaterThanOrEqualTo(String value) {
            addCriterion("PMC03 >=", value, "PMC03");
            return (Criteria) this;
        }

        public Criteria andPMC03LessThan(String value) {
            addCriterion("PMC03 <", value, "PMC03");
            return (Criteria) this;
        }

        public Criteria andPMC03LessThanOrEqualTo(String value) {
            addCriterion("PMC03 <=", value, "PMC03");
            return (Criteria) this;
        }

        public Criteria andPMC03Like(String value) {
            addCriterion("PMC03 like", value, "PMC03");
            return (Criteria) this;
        }

        public Criteria andPMC03NotLike(String value) {
            addCriterion("PMC03 not like", value, "PMC03");
            return (Criteria) this;
        }

        public Criteria andPMC03In(List<String> values) {
            addCriterion("PMC03 in", values, "PMC03");
            return (Criteria) this;
        }

        public Criteria andPMC03NotIn(List<String> values) {
            addCriterion("PMC03 not in", values, "PMC03");
            return (Criteria) this;
        }

        public Criteria andPMC03Between(String value1, String value2) {
            addCriterion("PMC03 between", value1, value2, "PMC03");
            return (Criteria) this;
        }

        public Criteria andPMC03NotBetween(String value1, String value2) {
            addCriterion("PMC03 not between", value1, value2, "PMC03");
            return (Criteria) this;
        }

        public Criteria andPMC081IsNull() {
            addCriterion("PMC081 is null");
            return (Criteria) this;
        }

        public Criteria andPMC081IsNotNull() {
            addCriterion("PMC081 is not null");
            return (Criteria) this;
        }

        public Criteria andPMC081EqualTo(String value) {
            addCriterion("PMC081 =", value, "PMC081");
            return (Criteria) this;
        }

        public Criteria andPMC081NotEqualTo(String value) {
            addCriterion("PMC081 <>", value, "PMC081");
            return (Criteria) this;
        }

        public Criteria andPMC081GreaterThan(String value) {
            addCriterion("PMC081 >", value, "PMC081");
            return (Criteria) this;
        }

        public Criteria andPMC081GreaterThanOrEqualTo(String value) {
            addCriterion("PMC081 >=", value, "PMC081");
            return (Criteria) this;
        }

        public Criteria andPMC081LessThan(String value) {
            addCriterion("PMC081 <", value, "PMC081");
            return (Criteria) this;
        }

        public Criteria andPMC081LessThanOrEqualTo(String value) {
            addCriterion("PMC081 <=", value, "PMC081");
            return (Criteria) this;
        }

        public Criteria andPMC081Like(String value) {
            addCriterion("PMC081 like", value, "PMC081");
            return (Criteria) this;
        }

        public Criteria andPMC081NotLike(String value) {
            addCriterion("PMC081 not like", value, "PMC081");
            return (Criteria) this;
        }

        public Criteria andPMC081In(List<String> values) {
            addCriterion("PMC081 in", values, "PMC081");
            return (Criteria) this;
        }

        public Criteria andPMC081NotIn(List<String> values) {
            addCriterion("PMC081 not in", values, "PMC081");
            return (Criteria) this;
        }

        public Criteria andPMC081Between(String value1, String value2) {
            addCriterion("PMC081 between", value1, value2, "PMC081");
            return (Criteria) this;
        }

        public Criteria andPMC081NotBetween(String value1, String value2) {
            addCriterion("PMC081 not between", value1, value2, "PMC081");
            return (Criteria) this;
        }

        public Criteria andPMC082IsNull() {
            addCriterion("PMC082 is null");
            return (Criteria) this;
        }

        public Criteria andPMC082IsNotNull() {
            addCriterion("PMC082 is not null");
            return (Criteria) this;
        }

        public Criteria andPMC082EqualTo(String value) {
            addCriterion("PMC082 =", value, "PMC082");
            return (Criteria) this;
        }

        public Criteria andPMC082NotEqualTo(String value) {
            addCriterion("PMC082 <>", value, "PMC082");
            return (Criteria) this;
        }

        public Criteria andPMC082GreaterThan(String value) {
            addCriterion("PMC082 >", value, "PMC082");
            return (Criteria) this;
        }

        public Criteria andPMC082GreaterThanOrEqualTo(String value) {
            addCriterion("PMC082 >=", value, "PMC082");
            return (Criteria) this;
        }

        public Criteria andPMC082LessThan(String value) {
            addCriterion("PMC082 <", value, "PMC082");
            return (Criteria) this;
        }

        public Criteria andPMC082LessThanOrEqualTo(String value) {
            addCriterion("PMC082 <=", value, "PMC082");
            return (Criteria) this;
        }

        public Criteria andPMC082Like(String value) {
            addCriterion("PMC082 like", value, "PMC082");
            return (Criteria) this;
        }

        public Criteria andPMC082NotLike(String value) {
            addCriterion("PMC082 not like", value, "PMC082");
            return (Criteria) this;
        }

        public Criteria andPMC082In(List<String> values) {
            addCriterion("PMC082 in", values, "PMC082");
            return (Criteria) this;
        }

        public Criteria andPMC082NotIn(List<String> values) {
            addCriterion("PMC082 not in", values, "PMC082");
            return (Criteria) this;
        }

        public Criteria andPMC082Between(String value1, String value2) {
            addCriterion("PMC082 between", value1, value2, "PMC082");
            return (Criteria) this;
        }

        public Criteria andPMC082NotBetween(String value1, String value2) {
            addCriterion("PMC082 not between", value1, value2, "PMC082");
            return (Criteria) this;
        }

        public Criteria andPMC091IsNull() {
            addCriterion("PMC091 is null");
            return (Criteria) this;
        }

        public Criteria andPMC091IsNotNull() {
            addCriterion("PMC091 is not null");
            return (Criteria) this;
        }

        public Criteria andPMC091EqualTo(String value) {
            addCriterion("PMC091 =", value, "PMC091");
            return (Criteria) this;
        }

        public Criteria andPMC091NotEqualTo(String value) {
            addCriterion("PMC091 <>", value, "PMC091");
            return (Criteria) this;
        }

        public Criteria andPMC091GreaterThan(String value) {
            addCriterion("PMC091 >", value, "PMC091");
            return (Criteria) this;
        }

        public Criteria andPMC091GreaterThanOrEqualTo(String value) {
            addCriterion("PMC091 >=", value, "PMC091");
            return (Criteria) this;
        }

        public Criteria andPMC091LessThan(String value) {
            addCriterion("PMC091 <", value, "PMC091");
            return (Criteria) this;
        }

        public Criteria andPMC091LessThanOrEqualTo(String value) {
            addCriterion("PMC091 <=", value, "PMC091");
            return (Criteria) this;
        }

        public Criteria andPMC091Like(String value) {
            addCriterion("PMC091 like", value, "PMC091");
            return (Criteria) this;
        }

        public Criteria andPMC091NotLike(String value) {
            addCriterion("PMC091 not like", value, "PMC091");
            return (Criteria) this;
        }

        public Criteria andPMC091In(List<String> values) {
            addCriterion("PMC091 in", values, "PMC091");
            return (Criteria) this;
        }

        public Criteria andPMC091NotIn(List<String> values) {
            addCriterion("PMC091 not in", values, "PMC091");
            return (Criteria) this;
        }

        public Criteria andPMC091Between(String value1, String value2) {
            addCriterion("PMC091 between", value1, value2, "PMC091");
            return (Criteria) this;
        }

        public Criteria andPMC091NotBetween(String value1, String value2) {
            addCriterion("PMC091 not between", value1, value2, "PMC091");
            return (Criteria) this;
        }

        public Criteria andPMC092IsNull() {
            addCriterion("PMC092 is null");
            return (Criteria) this;
        }

        public Criteria andPMC092IsNotNull() {
            addCriterion("PMC092 is not null");
            return (Criteria) this;
        }

        public Criteria andPMC092EqualTo(String value) {
            addCriterion("PMC092 =", value, "PMC092");
            return (Criteria) this;
        }

        public Criteria andPMC092NotEqualTo(String value) {
            addCriterion("PMC092 <>", value, "PMC092");
            return (Criteria) this;
        }

        public Criteria andPMC092GreaterThan(String value) {
            addCriterion("PMC092 >", value, "PMC092");
            return (Criteria) this;
        }

        public Criteria andPMC092GreaterThanOrEqualTo(String value) {
            addCriterion("PMC092 >=", value, "PMC092");
            return (Criteria) this;
        }

        public Criteria andPMC092LessThan(String value) {
            addCriterion("PMC092 <", value, "PMC092");
            return (Criteria) this;
        }

        public Criteria andPMC092LessThanOrEqualTo(String value) {
            addCriterion("PMC092 <=", value, "PMC092");
            return (Criteria) this;
        }

        public Criteria andPMC092Like(String value) {
            addCriterion("PMC092 like", value, "PMC092");
            return (Criteria) this;
        }

        public Criteria andPMC092NotLike(String value) {
            addCriterion("PMC092 not like", value, "PMC092");
            return (Criteria) this;
        }

        public Criteria andPMC092In(List<String> values) {
            addCriterion("PMC092 in", values, "PMC092");
            return (Criteria) this;
        }

        public Criteria andPMC092NotIn(List<String> values) {
            addCriterion("PMC092 not in", values, "PMC092");
            return (Criteria) this;
        }

        public Criteria andPMC092Between(String value1, String value2) {
            addCriterion("PMC092 between", value1, value2, "PMC092");
            return (Criteria) this;
        }

        public Criteria andPMC092NotBetween(String value1, String value2) {
            addCriterion("PMC092 not between", value1, value2, "PMC092");
            return (Criteria) this;
        }

        public Criteria andPMC093IsNull() {
            addCriterion("PMC093 is null");
            return (Criteria) this;
        }

        public Criteria andPMC093IsNotNull() {
            addCriterion("PMC093 is not null");
            return (Criteria) this;
        }

        public Criteria andPMC093EqualTo(String value) {
            addCriterion("PMC093 =", value, "PMC093");
            return (Criteria) this;
        }

        public Criteria andPMC093NotEqualTo(String value) {
            addCriterion("PMC093 <>", value, "PMC093");
            return (Criteria) this;
        }

        public Criteria andPMC093GreaterThan(String value) {
            addCriterion("PMC093 >", value, "PMC093");
            return (Criteria) this;
        }

        public Criteria andPMC093GreaterThanOrEqualTo(String value) {
            addCriterion("PMC093 >=", value, "PMC093");
            return (Criteria) this;
        }

        public Criteria andPMC093LessThan(String value) {
            addCriterion("PMC093 <", value, "PMC093");
            return (Criteria) this;
        }

        public Criteria andPMC093LessThanOrEqualTo(String value) {
            addCriterion("PMC093 <=", value, "PMC093");
            return (Criteria) this;
        }

        public Criteria andPMC093Like(String value) {
            addCriterion("PMC093 like", value, "PMC093");
            return (Criteria) this;
        }

        public Criteria andPMC093NotLike(String value) {
            addCriterion("PMC093 not like", value, "PMC093");
            return (Criteria) this;
        }

        public Criteria andPMC093In(List<String> values) {
            addCriterion("PMC093 in", values, "PMC093");
            return (Criteria) this;
        }

        public Criteria andPMC093NotIn(List<String> values) {
            addCriterion("PMC093 not in", values, "PMC093");
            return (Criteria) this;
        }

        public Criteria andPMC093Between(String value1, String value2) {
            addCriterion("PMC093 between", value1, value2, "PMC093");
            return (Criteria) this;
        }

        public Criteria andPMC093NotBetween(String value1, String value2) {
            addCriterion("PMC093 not between", value1, value2, "PMC093");
            return (Criteria) this;
        }

        public Criteria andPMC10IsNull() {
            addCriterion("PMC10 is null");
            return (Criteria) this;
        }

        public Criteria andPMC10IsNotNull() {
            addCriterion("PMC10 is not null");
            return (Criteria) this;
        }

        public Criteria andPMC10EqualTo(String value) {
            addCriterion("PMC10 =", value, "PMC10");
            return (Criteria) this;
        }

        public Criteria andPMC10NotEqualTo(String value) {
            addCriterion("PMC10 <>", value, "PMC10");
            return (Criteria) this;
        }

        public Criteria andPMC10GreaterThan(String value) {
            addCriterion("PMC10 >", value, "PMC10");
            return (Criteria) this;
        }

        public Criteria andPMC10GreaterThanOrEqualTo(String value) {
            addCriterion("PMC10 >=", value, "PMC10");
            return (Criteria) this;
        }

        public Criteria andPMC10LessThan(String value) {
            addCriterion("PMC10 <", value, "PMC10");
            return (Criteria) this;
        }

        public Criteria andPMC10LessThanOrEqualTo(String value) {
            addCriterion("PMC10 <=", value, "PMC10");
            return (Criteria) this;
        }

        public Criteria andPMC10Like(String value) {
            addCriterion("PMC10 like", value, "PMC10");
            return (Criteria) this;
        }

        public Criteria andPMC10NotLike(String value) {
            addCriterion("PMC10 not like", value, "PMC10");
            return (Criteria) this;
        }

        public Criteria andPMC10In(List<String> values) {
            addCriterion("PMC10 in", values, "PMC10");
            return (Criteria) this;
        }

        public Criteria andPMC10NotIn(List<String> values) {
            addCriterion("PMC10 not in", values, "PMC10");
            return (Criteria) this;
        }

        public Criteria andPMC10Between(String value1, String value2) {
            addCriterion("PMC10 between", value1, value2, "PMC10");
            return (Criteria) this;
        }

        public Criteria andPMC10NotBetween(String value1, String value2) {
            addCriterion("PMC10 not between", value1, value2, "PMC10");
            return (Criteria) this;
        }

        public Criteria andPMC11IsNull() {
            addCriterion("PMC11 is null");
            return (Criteria) this;
        }

        public Criteria andPMC11IsNotNull() {
            addCriterion("PMC11 is not null");
            return (Criteria) this;
        }

        public Criteria andPMC11EqualTo(String value) {
            addCriterion("PMC11 =", value, "PMC11");
            return (Criteria) this;
        }

        public Criteria andPMC11NotEqualTo(String value) {
            addCriterion("PMC11 <>", value, "PMC11");
            return (Criteria) this;
        }

        public Criteria andPMC11GreaterThan(String value) {
            addCriterion("PMC11 >", value, "PMC11");
            return (Criteria) this;
        }

        public Criteria andPMC11GreaterThanOrEqualTo(String value) {
            addCriterion("PMC11 >=", value, "PMC11");
            return (Criteria) this;
        }

        public Criteria andPMC11LessThan(String value) {
            addCriterion("PMC11 <", value, "PMC11");
            return (Criteria) this;
        }

        public Criteria andPMC11LessThanOrEqualTo(String value) {
            addCriterion("PMC11 <=", value, "PMC11");
            return (Criteria) this;
        }

        public Criteria andPMC11Like(String value) {
            addCriterion("PMC11 like", value, "PMC11");
            return (Criteria) this;
        }

        public Criteria andPMC11NotLike(String value) {
            addCriterion("PMC11 not like", value, "PMC11");
            return (Criteria) this;
        }

        public Criteria andPMC11In(List<String> values) {
            addCriterion("PMC11 in", values, "PMC11");
            return (Criteria) this;
        }

        public Criteria andPMC11NotIn(List<String> values) {
            addCriterion("PMC11 not in", values, "PMC11");
            return (Criteria) this;
        }

        public Criteria andPMC11Between(String value1, String value2) {
            addCriterion("PMC11 between", value1, value2, "PMC11");
            return (Criteria) this;
        }

        public Criteria andPMC11NotBetween(String value1, String value2) {
            addCriterion("PMC11 not between", value1, value2, "PMC11");
            return (Criteria) this;
        }

        public Criteria andPMC12IsNull() {
            addCriterion("PMC12 is null");
            return (Criteria) this;
        }

        public Criteria andPMC12IsNotNull() {
            addCriterion("PMC12 is not null");
            return (Criteria) this;
        }

        public Criteria andPMC12EqualTo(String value) {
            addCriterion("PMC12 =", value, "PMC12");
            return (Criteria) this;
        }

        public Criteria andPMC12NotEqualTo(String value) {
            addCriterion("PMC12 <>", value, "PMC12");
            return (Criteria) this;
        }

        public Criteria andPMC12GreaterThan(String value) {
            addCriterion("PMC12 >", value, "PMC12");
            return (Criteria) this;
        }

        public Criteria andPMC12GreaterThanOrEqualTo(String value) {
            addCriterion("PMC12 >=", value, "PMC12");
            return (Criteria) this;
        }

        public Criteria andPMC12LessThan(String value) {
            addCriterion("PMC12 <", value, "PMC12");
            return (Criteria) this;
        }

        public Criteria andPMC12LessThanOrEqualTo(String value) {
            addCriterion("PMC12 <=", value, "PMC12");
            return (Criteria) this;
        }

        public Criteria andPMC12Like(String value) {
            addCriterion("PMC12 like", value, "PMC12");
            return (Criteria) this;
        }

        public Criteria andPMC12NotLike(String value) {
            addCriterion("PMC12 not like", value, "PMC12");
            return (Criteria) this;
        }

        public Criteria andPMC12In(List<String> values) {
            addCriterion("PMC12 in", values, "PMC12");
            return (Criteria) this;
        }

        public Criteria andPMC12NotIn(List<String> values) {
            addCriterion("PMC12 not in", values, "PMC12");
            return (Criteria) this;
        }

        public Criteria andPMC12Between(String value1, String value2) {
            addCriterion("PMC12 between", value1, value2, "PMC12");
            return (Criteria) this;
        }

        public Criteria andPMC12NotBetween(String value1, String value2) {
            addCriterion("PMC12 not between", value1, value2, "PMC12");
            return (Criteria) this;
        }

        public Criteria andPMCDATEIsNull() {
            addCriterion("PMCDATE is null");
            return (Criteria) this;
        }

        public Criteria andPMCDATEIsNotNull() {
            addCriterion("PMCDATE is not null");
            return (Criteria) this;
        }

        public Criteria andPMCDATEEqualTo(String value) {
            addCriterion("PMCDATE =", value, "PMCDATE");
            return (Criteria) this;
        }

        public Criteria andPMCDATENotEqualTo(String value) {
            addCriterion("PMCDATE <>", value, "PMCDATE");
            return (Criteria) this;
        }

        public Criteria andPMCDATEGreaterThan(String value) {
            addCriterion("PMCDATE >", value, "PMCDATE");
            return (Criteria) this;
        }

        public Criteria andPMCDATEGreaterThanOrEqualTo(String value) {
            addCriterion("PMCDATE >=", value, "PMCDATE");
            return (Criteria) this;
        }

        public Criteria andPMCDATELessThan(String value) {
            addCriterion("PMCDATE <", value, "PMCDATE");
            return (Criteria) this;
        }

        public Criteria andPMCDATELessThanOrEqualTo(String value) {
            addCriterion("PMCDATE <=", value, "PMCDATE");
            return (Criteria) this;
        }

        public Criteria andPMCDATELike(String value) {
            addCriterion("PMCDATE like", value, "PMCDATE");
            return (Criteria) this;
        }

        public Criteria andPMCDATENotLike(String value) {
            addCriterion("PMCDATE not like", value, "PMCDATE");
            return (Criteria) this;
        }

        public Criteria andPMCDATEIn(List<String> values) {
            addCriterion("PMCDATE in", values, "PMCDATE");
            return (Criteria) this;
        }

        public Criteria andPMCDATENotIn(List<String> values) {
            addCriterion("PMCDATE not in", values, "PMCDATE");
            return (Criteria) this;
        }

        public Criteria andPMCDATEBetween(String value1, String value2) {
            addCriterion("PMCDATE between", value1, value2, "PMCDATE");
            return (Criteria) this;
        }

        public Criteria andPMCDATENotBetween(String value1, String value2) {
            addCriterion("PMCDATE not between", value1, value2, "PMCDATE");
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