package com.chenyuantech.eps.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class PMMExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public PMMExample() {
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

        public Criteria andPMM01IsNull() {
            addCriterion("PMM01 is null");
            return (Criteria) this;
        }

        public Criteria andPMM01IsNotNull() {
            addCriterion("PMM01 is not null");
            return (Criteria) this;
        }

        public Criteria andPMM01EqualTo(String value) {
            addCriterion("PMM01 =", value, "PMM01");
            return (Criteria) this;
        }

        public Criteria andPMM01NotEqualTo(String value) {
            addCriterion("PMM01 <>", value, "PMM01");
            return (Criteria) this;
        }

        public Criteria andPMM01GreaterThan(String value) {
            addCriterion("PMM01 >", value, "PMM01");
            return (Criteria) this;
        }

        public Criteria andPMM01GreaterThanOrEqualTo(String value) {
            addCriterion("PMM01 >=", value, "PMM01");
            return (Criteria) this;
        }

        public Criteria andPMM01LessThan(String value) {
            addCriterion("PMM01 <", value, "PMM01");
            return (Criteria) this;
        }

        public Criteria andPMM01LessThanOrEqualTo(String value) {
            addCriterion("PMM01 <=", value, "PMM01");
            return (Criteria) this;
        }

        public Criteria andPMM01Like(String value) {
            addCriterion("PMM01 like", value, "PMM01");
            return (Criteria) this;
        }

        public Criteria andPMM01NotLike(String value) {
            addCriterion("PMM01 not like", value, "PMM01");
            return (Criteria) this;
        }

        public Criteria andPMM01In(List<String> values) {
            addCriterion("PMM01 in", values, "PMM01");
            return (Criteria) this;
        }

        public Criteria andPMM01NotIn(List<String> values) {
            addCriterion("PMM01 not in", values, "PMM01");
            return (Criteria) this;
        }

        public Criteria andPMM01Between(String value1, String value2) {
            addCriterion("PMM01 between", value1, value2, "PMM01");
            return (Criteria) this;
        }

        public Criteria andPMM01NotBetween(String value1, String value2) {
            addCriterion("PMM01 not between", value1, value2, "PMM01");
            return (Criteria) this;
        }

        public Criteria andTA_PMM05IsNull() {
            addCriterion("TA_PMM05 is null");
            return (Criteria) this;
        }

        public Criteria andTA_PMM05IsNotNull() {
            addCriterion("TA_PMM05 is not null");
            return (Criteria) this;
        }

        public Criteria andTA_PMM05EqualTo(String value) {
            addCriterion("TA_PMM05 =", value, "TA_PMM05");
            return (Criteria) this;
        }

        public Criteria andTA_PMM05NotEqualTo(String value) {
            addCriterion("TA_PMM05 <>", value, "TA_PMM05");
            return (Criteria) this;
        }

        public Criteria andTA_PMM05GreaterThan(String value) {
            addCriterion("TA_PMM05 >", value, "TA_PMM05");
            return (Criteria) this;
        }

        public Criteria andTA_PMM05GreaterThanOrEqualTo(String value) {
            addCriterion("TA_PMM05 >=", value, "TA_PMM05");
            return (Criteria) this;
        }

        public Criteria andTA_PMM05LessThan(String value) {
            addCriterion("TA_PMM05 <", value, "TA_PMM05");
            return (Criteria) this;
        }

        public Criteria andTA_PMM05LessThanOrEqualTo(String value) {
            addCriterion("TA_PMM05 <=", value, "TA_PMM05");
            return (Criteria) this;
        }

        public Criteria andTA_PMM05Like(String value) {
            addCriterion("TA_PMM05 like", value, "TA_PMM05");
            return (Criteria) this;
        }

        public Criteria andTA_PMM05NotLike(String value) {
            addCriterion("TA_PMM05 not like", value, "TA_PMM05");
            return (Criteria) this;
        }

        public Criteria andTA_PMM05In(List<String> values) {
            addCriterion("TA_PMM05 in", values, "TA_PMM05");
            return (Criteria) this;
        }

        public Criteria andTA_PMM05NotIn(List<String> values) {
            addCriterion("TA_PMM05 not in", values, "TA_PMM05");
            return (Criteria) this;
        }

        public Criteria andTA_PMM05Between(String value1, String value2) {
            addCriterion("TA_PMM05 between", value1, value2, "TA_PMM05");
            return (Criteria) this;
        }

        public Criteria andTA_PMM05NotBetween(String value1, String value2) {
            addCriterion("TA_PMM05 not between", value1, value2, "TA_PMM05");
            return (Criteria) this;
        }

        public Criteria andPMM03IsNull() {
            addCriterion("PMM03 is null");
            return (Criteria) this;
        }

        public Criteria andPMM03IsNotNull() {
            addCriterion("PMM03 is not null");
            return (Criteria) this;
        }

        public Criteria andPMM03EqualTo(String value) {
            addCriterion("PMM03 =", value, "PMM03");
            return (Criteria) this;
        }

        public Criteria andPMM03NotEqualTo(String value) {
            addCriterion("PMM03 <>", value, "PMM03");
            return (Criteria) this;
        }

        public Criteria andPMM03GreaterThan(String value) {
            addCriterion("PMM03 >", value, "PMM03");
            return (Criteria) this;
        }

        public Criteria andPMM03GreaterThanOrEqualTo(String value) {
            addCriterion("PMM03 >=", value, "PMM03");
            return (Criteria) this;
        }

        public Criteria andPMM03LessThan(String value) {
            addCriterion("PMM03 <", value, "PMM03");
            return (Criteria) this;
        }

        public Criteria andPMM03LessThanOrEqualTo(String value) {
            addCriterion("PMM03 <=", value, "PMM03");
            return (Criteria) this;
        }

        public Criteria andPMM03Like(String value) {
            addCriterion("PMM03 like", value, "PMM03");
            return (Criteria) this;
        }

        public Criteria andPMM03NotLike(String value) {
            addCriterion("PMM03 not like", value, "PMM03");
            return (Criteria) this;
        }

        public Criteria andPMM03In(List<String> values) {
            addCriterion("PMM03 in", values, "PMM03");
            return (Criteria) this;
        }

        public Criteria andPMM03NotIn(List<String> values) {
            addCriterion("PMM03 not in", values, "PMM03");
            return (Criteria) this;
        }

        public Criteria andPMM03Between(String value1, String value2) {
            addCriterion("PMM03 between", value1, value2, "PMM03");
            return (Criteria) this;
        }

        public Criteria andPMM03NotBetween(String value1, String value2) {
            addCriterion("PMM03 not between", value1, value2, "PMM03");
            return (Criteria) this;
        }

        public Criteria andPMMUD02IsNull() {
            addCriterion("PMMUD02 is null");
            return (Criteria) this;
        }

        public Criteria andPMMUD02IsNotNull() {
            addCriterion("PMMUD02 is not null");
            return (Criteria) this;
        }

        public Criteria andPMMUD02EqualTo(String value) {
            addCriterion("PMMUD02 =", value, "PMMUD02");
            return (Criteria) this;
        }

        public Criteria andPMMUD02NotEqualTo(String value) {
            addCriterion("PMMUD02 <>", value, "PMMUD02");
            return (Criteria) this;
        }

        public Criteria andPMMUD02GreaterThan(String value) {
            addCriterion("PMMUD02 >", value, "PMMUD02");
            return (Criteria) this;
        }

        public Criteria andPMMUD02GreaterThanOrEqualTo(String value) {
            addCriterion("PMMUD02 >=", value, "PMMUD02");
            return (Criteria) this;
        }

        public Criteria andPMMUD02LessThan(String value) {
            addCriterion("PMMUD02 <", value, "PMMUD02");
            return (Criteria) this;
        }

        public Criteria andPMMUD02LessThanOrEqualTo(String value) {
            addCriterion("PMMUD02 <=", value, "PMMUD02");
            return (Criteria) this;
        }

        public Criteria andPMMUD02Like(String value) {
            addCriterion("PMMUD02 like", value, "PMMUD02");
            return (Criteria) this;
        }

        public Criteria andPMMUD02NotLike(String value) {
            addCriterion("PMMUD02 not like", value, "PMMUD02");
            return (Criteria) this;
        }

        public Criteria andPMMUD02In(List<String> values) {
            addCriterion("PMMUD02 in", values, "PMMUD02");
            return (Criteria) this;
        }

        public Criteria andPMMUD02NotIn(List<String> values) {
            addCriterion("PMMUD02 not in", values, "PMMUD02");
            return (Criteria) this;
        }

        public Criteria andPMMUD02Between(String value1, String value2) {
            addCriterion("PMMUD02 between", value1, value2, "PMMUD02");
            return (Criteria) this;
        }

        public Criteria andPMMUD02NotBetween(String value1, String value2) {
            addCriterion("PMMUD02 not between", value1, value2, "PMMUD02");
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

        public Criteria andPMM909IsNull() {
            addCriterion("PMM909 is null");
            return (Criteria) this;
        }

        public Criteria andPMM909IsNotNull() {
            addCriterion("PMM909 is not null");
            return (Criteria) this;
        }

        public Criteria andPMM909EqualTo(String value) {
            addCriterion("PMM909 =", value, "PMM909");
            return (Criteria) this;
        }

        public Criteria andPMM909NotEqualTo(String value) {
            addCriterion("PMM909 <>", value, "PMM909");
            return (Criteria) this;
        }

        public Criteria andPMM909GreaterThan(String value) {
            addCriterion("PMM909 >", value, "PMM909");
            return (Criteria) this;
        }

        public Criteria andPMM909GreaterThanOrEqualTo(String value) {
            addCriterion("PMM909 >=", value, "PMM909");
            return (Criteria) this;
        }

        public Criteria andPMM909LessThan(String value) {
            addCriterion("PMM909 <", value, "PMM909");
            return (Criteria) this;
        }

        public Criteria andPMM909LessThanOrEqualTo(String value) {
            addCriterion("PMM909 <=", value, "PMM909");
            return (Criteria) this;
        }

        public Criteria andPMM909Like(String value) {
            addCriterion("PMM909 like", value, "PMM909");
            return (Criteria) this;
        }

        public Criteria andPMM909NotLike(String value) {
            addCriterion("PMM909 not like", value, "PMM909");
            return (Criteria) this;
        }

        public Criteria andPMM909In(List<String> values) {
            addCriterion("PMM909 in", values, "PMM909");
            return (Criteria) this;
        }

        public Criteria andPMM909NotIn(List<String> values) {
            addCriterion("PMM909 not in", values, "PMM909");
            return (Criteria) this;
        }

        public Criteria andPMM909Between(String value1, String value2) {
            addCriterion("PMM909 between", value1, value2, "PMM909");
            return (Criteria) this;
        }

        public Criteria andPMM909NotBetween(String value1, String value2) {
            addCriterion("PMM909 not between", value1, value2, "PMM909");
            return (Criteria) this;
        }

        public Criteria andPMM02IsNull() {
            addCriterion("PMM02 is null");
            return (Criteria) this;
        }

        public Criteria andPMM02IsNotNull() {
            addCriterion("PMM02 is not null");
            return (Criteria) this;
        }

        public Criteria andPMM02EqualTo(String value) {
            addCriterion("PMM02 =", value, "PMM02");
            return (Criteria) this;
        }

        public Criteria andPMM02NotEqualTo(String value) {
            addCriterion("PMM02 <>", value, "PMM02");
            return (Criteria) this;
        }

        public Criteria andPMM02GreaterThan(String value) {
            addCriterion("PMM02 >", value, "PMM02");
            return (Criteria) this;
        }

        public Criteria andPMM02GreaterThanOrEqualTo(String value) {
            addCriterion("PMM02 >=", value, "PMM02");
            return (Criteria) this;
        }

        public Criteria andPMM02LessThan(String value) {
            addCriterion("PMM02 <", value, "PMM02");
            return (Criteria) this;
        }

        public Criteria andPMM02LessThanOrEqualTo(String value) {
            addCriterion("PMM02 <=", value, "PMM02");
            return (Criteria) this;
        }

        public Criteria andPMM02Like(String value) {
            addCriterion("PMM02 like", value, "PMM02");
            return (Criteria) this;
        }

        public Criteria andPMM02NotLike(String value) {
            addCriterion("PMM02 not like", value, "PMM02");
            return (Criteria) this;
        }

        public Criteria andPMM02In(List<String> values) {
            addCriterion("PMM02 in", values, "PMM02");
            return (Criteria) this;
        }

        public Criteria andPMM02NotIn(List<String> values) {
            addCriterion("PMM02 not in", values, "PMM02");
            return (Criteria) this;
        }

        public Criteria andPMM02Between(String value1, String value2) {
            addCriterion("PMM02 between", value1, value2, "PMM02");
            return (Criteria) this;
        }

        public Criteria andPMM02NotBetween(String value1, String value2) {
            addCriterion("PMM02 not between", value1, value2, "PMM02");
            return (Criteria) this;
        }

        public Criteria andPMM07IsNull() {
            addCriterion("PMM07 is null");
            return (Criteria) this;
        }

        public Criteria andPMM07IsNotNull() {
            addCriterion("PMM07 is not null");
            return (Criteria) this;
        }

        public Criteria andPMM07EqualTo(String value) {
            addCriterion("PMM07 =", value, "PMM07");
            return (Criteria) this;
        }

        public Criteria andPMM07NotEqualTo(String value) {
            addCriterion("PMM07 <>", value, "PMM07");
            return (Criteria) this;
        }

        public Criteria andPMM07GreaterThan(String value) {
            addCriterion("PMM07 >", value, "PMM07");
            return (Criteria) this;
        }

        public Criteria andPMM07GreaterThanOrEqualTo(String value) {
            addCriterion("PMM07 >=", value, "PMM07");
            return (Criteria) this;
        }

        public Criteria andPMM07LessThan(String value) {
            addCriterion("PMM07 <", value, "PMM07");
            return (Criteria) this;
        }

        public Criteria andPMM07LessThanOrEqualTo(String value) {
            addCriterion("PMM07 <=", value, "PMM07");
            return (Criteria) this;
        }

        public Criteria andPMM07Like(String value) {
            addCriterion("PMM07 like", value, "PMM07");
            return (Criteria) this;
        }

        public Criteria andPMM07NotLike(String value) {
            addCriterion("PMM07 not like", value, "PMM07");
            return (Criteria) this;
        }

        public Criteria andPMM07In(List<String> values) {
            addCriterion("PMM07 in", values, "PMM07");
            return (Criteria) this;
        }

        public Criteria andPMM07NotIn(List<String> values) {
            addCriterion("PMM07 not in", values, "PMM07");
            return (Criteria) this;
        }

        public Criteria andPMM07Between(String value1, String value2) {
            addCriterion("PMM07 between", value1, value2, "PMM07");
            return (Criteria) this;
        }

        public Criteria andPMM07NotBetween(String value1, String value2) {
            addCriterion("PMM07 not between", value1, value2, "PMM07");
            return (Criteria) this;
        }

        public Criteria andPMM13IsNull() {
            addCriterion("PMM13 is null");
            return (Criteria) this;
        }

        public Criteria andPMM13IsNotNull() {
            addCriterion("PMM13 is not null");
            return (Criteria) this;
        }

        public Criteria andPMM13EqualTo(String value) {
            addCriterion("PMM13 =", value, "PMM13");
            return (Criteria) this;
        }

        public Criteria andPMM13NotEqualTo(String value) {
            addCriterion("PMM13 <>", value, "PMM13");
            return (Criteria) this;
        }

        public Criteria andPMM13GreaterThan(String value) {
            addCriterion("PMM13 >", value, "PMM13");
            return (Criteria) this;
        }

        public Criteria andPMM13GreaterThanOrEqualTo(String value) {
            addCriterion("PMM13 >=", value, "PMM13");
            return (Criteria) this;
        }

        public Criteria andPMM13LessThan(String value) {
            addCriterion("PMM13 <", value, "PMM13");
            return (Criteria) this;
        }

        public Criteria andPMM13LessThanOrEqualTo(String value) {
            addCriterion("PMM13 <=", value, "PMM13");
            return (Criteria) this;
        }

        public Criteria andPMM13Like(String value) {
            addCriterion("PMM13 like", value, "PMM13");
            return (Criteria) this;
        }

        public Criteria andPMM13NotLike(String value) {
            addCriterion("PMM13 not like", value, "PMM13");
            return (Criteria) this;
        }

        public Criteria andPMM13In(List<String> values) {
            addCriterion("PMM13 in", values, "PMM13");
            return (Criteria) this;
        }

        public Criteria andPMM13NotIn(List<String> values) {
            addCriterion("PMM13 not in", values, "PMM13");
            return (Criteria) this;
        }

        public Criteria andPMM13Between(String value1, String value2) {
            addCriterion("PMM13 between", value1, value2, "PMM13");
            return (Criteria) this;
        }

        public Criteria andPMM13NotBetween(String value1, String value2) {
            addCriterion("PMM13 not between", value1, value2, "PMM13");
            return (Criteria) this;
        }

        public Criteria andGEM02IsNull() {
            addCriterion("GEM02 is null");
            return (Criteria) this;
        }

        public Criteria andGEM02IsNotNull() {
            addCriterion("GEM02 is not null");
            return (Criteria) this;
        }

        public Criteria andGEM02EqualTo(String value) {
            addCriterion("GEM02 =", value, "GEM02");
            return (Criteria) this;
        }

        public Criteria andGEM02NotEqualTo(String value) {
            addCriterion("GEM02 <>", value, "GEM02");
            return (Criteria) this;
        }

        public Criteria andGEM02GreaterThan(String value) {
            addCriterion("GEM02 >", value, "GEM02");
            return (Criteria) this;
        }

        public Criteria andGEM02GreaterThanOrEqualTo(String value) {
            addCriterion("GEM02 >=", value, "GEM02");
            return (Criteria) this;
        }

        public Criteria andGEM02LessThan(String value) {
            addCriterion("GEM02 <", value, "GEM02");
            return (Criteria) this;
        }

        public Criteria andGEM02LessThanOrEqualTo(String value) {
            addCriterion("GEM02 <=", value, "GEM02");
            return (Criteria) this;
        }

        public Criteria andGEM02Like(String value) {
            addCriterion("GEM02 like", value, "GEM02");
            return (Criteria) this;
        }

        public Criteria andGEM02NotLike(String value) {
            addCriterion("GEM02 not like", value, "GEM02");
            return (Criteria) this;
        }

        public Criteria andGEM02In(List<String> values) {
            addCriterion("GEM02 in", values, "GEM02");
            return (Criteria) this;
        }

        public Criteria andGEM02NotIn(List<String> values) {
            addCriterion("GEM02 not in", values, "GEM02");
            return (Criteria) this;
        }

        public Criteria andGEM02Between(String value1, String value2) {
            addCriterion("GEM02 between", value1, value2, "GEM02");
            return (Criteria) this;
        }

        public Criteria andGEM02NotBetween(String value1, String value2) {
            addCriterion("GEM02 not between", value1, value2, "GEM02");
            return (Criteria) this;
        }

        public Criteria andPMMCONDIsNull() {
            addCriterion("PMMCOND is null");
            return (Criteria) this;
        }

        public Criteria andPMMCONDIsNotNull() {
            addCriterion("PMMCOND is not null");
            return (Criteria) this;
        }

        public Criteria andPMMCONDEqualTo(String value) {
            addCriterion("PMMCOND =", value, "PMMCOND");
            return (Criteria) this;
        }

        public Criteria andPMMCONDNotEqualTo(String value) {
            addCriterion("PMMCOND <>", value, "PMMCOND");
            return (Criteria) this;
        }

        public Criteria andPMMCONDGreaterThan(String value) {
            addCriterion("PMMCOND >", value, "PMMCOND");
            return (Criteria) this;
        }

        public Criteria andPMMCONDGreaterThanOrEqualTo(String value) {
            addCriterion("PMMCOND >=", value, "PMMCOND");
            return (Criteria) this;
        }

        public Criteria andPMMCONDLessThan(String value) {
            addCriterion("PMMCOND <", value, "PMMCOND");
            return (Criteria) this;
        }

        public Criteria andPMMCONDLessThanOrEqualTo(String value) {
            addCriterion("PMMCOND <=", value, "PMMCOND");
            return (Criteria) this;
        }

        public Criteria andPMMCONDLike(String value) {
            addCriterion("PMMCOND like", value, "PMMCOND");
            return (Criteria) this;
        }

        public Criteria andPMMCONDNotLike(String value) {
            addCriterion("PMMCOND not like", value, "PMMCOND");
            return (Criteria) this;
        }

        public Criteria andPMMCONDIn(List<String> values) {
            addCriterion("PMMCOND in", values, "PMMCOND");
            return (Criteria) this;
        }

        public Criteria andPMMCONDNotIn(List<String> values) {
            addCriterion("PMMCOND not in", values, "PMMCOND");
            return (Criteria) this;
        }

        public Criteria andPMMCONDBetween(String value1, String value2) {
            addCriterion("PMMCOND between", value1, value2, "PMMCOND");
            return (Criteria) this;
        }

        public Criteria andPMMCONDNotBetween(String value1, String value2) {
            addCriterion("PMMCOND not between", value1, value2, "PMMCOND");
            return (Criteria) this;
        }

        public Criteria andPMM04IsNull() {
            addCriterion("PMM04 is null");
            return (Criteria) this;
        }

        public Criteria andPMM04IsNotNull() {
            addCriterion("PMM04 is not null");
            return (Criteria) this;
        }

        public Criteria andPMM04EqualTo(String value) {
            addCriterion("PMM04 =", value, "PMM04");
            return (Criteria) this;
        }

        public Criteria andPMM04NotEqualTo(String value) {
            addCriterion("PMM04 <>", value, "PMM04");
            return (Criteria) this;
        }

        public Criteria andPMM04GreaterThan(String value) {
            addCriterion("PMM04 >", value, "PMM04");
            return (Criteria) this;
        }

        public Criteria andPMM04GreaterThanOrEqualTo(String value) {
            addCriterion("PMM04 >=", value, "PMM04");
            return (Criteria) this;
        }

        public Criteria andPMM04LessThan(String value) {
            addCriterion("PMM04 <", value, "PMM04");
            return (Criteria) this;
        }

        public Criteria andPMM04LessThanOrEqualTo(String value) {
            addCriterion("PMM04 <=", value, "PMM04");
            return (Criteria) this;
        }

        public Criteria andPMM04Like(String value) {
            addCriterion("PMM04 like", value, "PMM04");
            return (Criteria) this;
        }

        public Criteria andPMM04NotLike(String value) {
            addCriterion("PMM04 not like", value, "PMM04");
            return (Criteria) this;
        }

        public Criteria andPMM04In(List<String> values) {
            addCriterion("PMM04 in", values, "PMM04");
            return (Criteria) this;
        }

        public Criteria andPMM04NotIn(List<String> values) {
            addCriterion("PMM04 not in", values, "PMM04");
            return (Criteria) this;
        }

        public Criteria andPMM04Between(String value1, String value2) {
            addCriterion("PMM04 between", value1, value2, "PMM04");
            return (Criteria) this;
        }

        public Criteria andPMM04NotBetween(String value1, String value2) {
            addCriterion("PMM04 not between", value1, value2, "PMM04");
            return (Criteria) this;
        }

        public Criteria andPMMCONUIsNull() {
            addCriterion("PMMCONU is null");
            return (Criteria) this;
        }

        public Criteria andPMMCONUIsNotNull() {
            addCriterion("PMMCONU is not null");
            return (Criteria) this;
        }

        public Criteria andPMMCONUEqualTo(String value) {
            addCriterion("PMMCONU =", value, "PMMCONU");
            return (Criteria) this;
        }

        public Criteria andPMMCONUNotEqualTo(String value) {
            addCriterion("PMMCONU <>", value, "PMMCONU");
            return (Criteria) this;
        }

        public Criteria andPMMCONUGreaterThan(String value) {
            addCriterion("PMMCONU >", value, "PMMCONU");
            return (Criteria) this;
        }

        public Criteria andPMMCONUGreaterThanOrEqualTo(String value) {
            addCriterion("PMMCONU >=", value, "PMMCONU");
            return (Criteria) this;
        }

        public Criteria andPMMCONULessThan(String value) {
            addCriterion("PMMCONU <", value, "PMMCONU");
            return (Criteria) this;
        }

        public Criteria andPMMCONULessThanOrEqualTo(String value) {
            addCriterion("PMMCONU <=", value, "PMMCONU");
            return (Criteria) this;
        }

        public Criteria andPMMCONULike(String value) {
            addCriterion("PMMCONU like", value, "PMMCONU");
            return (Criteria) this;
        }

        public Criteria andPMMCONUNotLike(String value) {
            addCriterion("PMMCONU not like", value, "PMMCONU");
            return (Criteria) this;
        }

        public Criteria andPMMCONUIn(List<String> values) {
            addCriterion("PMMCONU in", values, "PMMCONU");
            return (Criteria) this;
        }

        public Criteria andPMMCONUNotIn(List<String> values) {
            addCriterion("PMMCONU not in", values, "PMMCONU");
            return (Criteria) this;
        }

        public Criteria andPMMCONUBetween(String value1, String value2) {
            addCriterion("PMMCONU between", value1, value2, "PMMCONU");
            return (Criteria) this;
        }

        public Criteria andPMMCONUNotBetween(String value1, String value2) {
            addCriterion("PMMCONU not between", value1, value2, "PMMCONU");
            return (Criteria) this;
        }

        public Criteria andGEN02IsNull() {
            addCriterion("GEN02 is null");
            return (Criteria) this;
        }

        public Criteria andGEN02IsNotNull() {
            addCriterion("GEN02 is not null");
            return (Criteria) this;
        }

        public Criteria andGEN02EqualTo(String value) {
            addCriterion("GEN02 =", value, "GEN02");
            return (Criteria) this;
        }

        public Criteria andGEN02NotEqualTo(String value) {
            addCriterion("GEN02 <>", value, "GEN02");
            return (Criteria) this;
        }

        public Criteria andGEN02GreaterThan(String value) {
            addCriterion("GEN02 >", value, "GEN02");
            return (Criteria) this;
        }

        public Criteria andGEN02GreaterThanOrEqualTo(String value) {
            addCriterion("GEN02 >=", value, "GEN02");
            return (Criteria) this;
        }

        public Criteria andGEN02LessThan(String value) {
            addCriterion("GEN02 <", value, "GEN02");
            return (Criteria) this;
        }

        public Criteria andGEN02LessThanOrEqualTo(String value) {
            addCriterion("GEN02 <=", value, "GEN02");
            return (Criteria) this;
        }

        public Criteria andGEN02Like(String value) {
            addCriterion("GEN02 like", value, "GEN02");
            return (Criteria) this;
        }

        public Criteria andGEN02NotLike(String value) {
            addCriterion("GEN02 not like", value, "GEN02");
            return (Criteria) this;
        }

        public Criteria andGEN02In(List<String> values) {
            addCriterion("GEN02 in", values, "GEN02");
            return (Criteria) this;
        }

        public Criteria andGEN02NotIn(List<String> values) {
            addCriterion("GEN02 not in", values, "GEN02");
            return (Criteria) this;
        }

        public Criteria andGEN02Between(String value1, String value2) {
            addCriterion("GEN02 between", value1, value2, "GEN02");
            return (Criteria) this;
        }

        public Criteria andGEN02NotBetween(String value1, String value2) {
            addCriterion("GEN02 not between", value1, value2, "GEN02");
            return (Criteria) this;
        }

        public Criteria andPMM12IsNull() {
            addCriterion("PMM12 is null");
            return (Criteria) this;
        }

        public Criteria andPMM12IsNotNull() {
            addCriterion("PMM12 is not null");
            return (Criteria) this;
        }

        public Criteria andPMM12EqualTo(String value) {
            addCriterion("PMM12 =", value, "PMM12");
            return (Criteria) this;
        }

        public Criteria andPMM12NotEqualTo(String value) {
            addCriterion("PMM12 <>", value, "PMM12");
            return (Criteria) this;
        }

        public Criteria andPMM12GreaterThan(String value) {
            addCriterion("PMM12 >", value, "PMM12");
            return (Criteria) this;
        }

        public Criteria andPMM12GreaterThanOrEqualTo(String value) {
            addCriterion("PMM12 >=", value, "PMM12");
            return (Criteria) this;
        }

        public Criteria andPMM12LessThan(String value) {
            addCriterion("PMM12 <", value, "PMM12");
            return (Criteria) this;
        }

        public Criteria andPMM12LessThanOrEqualTo(String value) {
            addCriterion("PMM12 <=", value, "PMM12");
            return (Criteria) this;
        }

        public Criteria andPMM12Like(String value) {
            addCriterion("PMM12 like", value, "PMM12");
            return (Criteria) this;
        }

        public Criteria andPMM12NotLike(String value) {
            addCriterion("PMM12 not like", value, "PMM12");
            return (Criteria) this;
        }

        public Criteria andPMM12In(List<String> values) {
            addCriterion("PMM12 in", values, "PMM12");
            return (Criteria) this;
        }

        public Criteria andPMM12NotIn(List<String> values) {
            addCriterion("PMM12 not in", values, "PMM12");
            return (Criteria) this;
        }

        public Criteria andPMM12Between(String value1, String value2) {
            addCriterion("PMM12 between", value1, value2, "PMM12");
            return (Criteria) this;
        }

        public Criteria andPMM12NotBetween(String value1, String value2) {
            addCriterion("PMM12 not between", value1, value2, "PMM12");
            return (Criteria) this;
        }

        public Criteria andGEN021IsNull() {
            addCriterion("GEN021 is null");
            return (Criteria) this;
        }

        public Criteria andGEN021IsNotNull() {
            addCriterion("GEN021 is not null");
            return (Criteria) this;
        }

        public Criteria andGEN021EqualTo(String value) {
            addCriterion("GEN021 =", value, "GEN021");
            return (Criteria) this;
        }

        public Criteria andGEN021NotEqualTo(String value) {
            addCriterion("GEN021 <>", value, "GEN021");
            return (Criteria) this;
        }

        public Criteria andGEN021GreaterThan(String value) {
            addCriterion("GEN021 >", value, "GEN021");
            return (Criteria) this;
        }

        public Criteria andGEN021GreaterThanOrEqualTo(String value) {
            addCriterion("GEN021 >=", value, "GEN021");
            return (Criteria) this;
        }

        public Criteria andGEN021LessThan(String value) {
            addCriterion("GEN021 <", value, "GEN021");
            return (Criteria) this;
        }

        public Criteria andGEN021LessThanOrEqualTo(String value) {
            addCriterion("GEN021 <=", value, "GEN021");
            return (Criteria) this;
        }

        public Criteria andGEN021Like(String value) {
            addCriterion("GEN021 like", value, "GEN021");
            return (Criteria) this;
        }

        public Criteria andGEN021NotLike(String value) {
            addCriterion("GEN021 not like", value, "GEN021");
            return (Criteria) this;
        }

        public Criteria andGEN021In(List<String> values) {
            addCriterion("GEN021 in", values, "GEN021");
            return (Criteria) this;
        }

        public Criteria andGEN021NotIn(List<String> values) {
            addCriterion("GEN021 not in", values, "GEN021");
            return (Criteria) this;
        }

        public Criteria andGEN021Between(String value1, String value2) {
            addCriterion("GEN021 between", value1, value2, "GEN021");
            return (Criteria) this;
        }

        public Criteria andGEN021NotBetween(String value1, String value2) {
            addCriterion("GEN021 not between", value1, value2, "GEN021");
            return (Criteria) this;
        }

        public Criteria andTA_PMM06IsNull() {
            addCriterion("TA_PMM06 is null");
            return (Criteria) this;
        }

        public Criteria andTA_PMM06IsNotNull() {
            addCriterion("TA_PMM06 is not null");
            return (Criteria) this;
        }

        public Criteria andTA_PMM06EqualTo(String value) {
            addCriterion("TA_PMM06 =", value, "TA_PMM06");
            return (Criteria) this;
        }

        public Criteria andTA_PMM06NotEqualTo(String value) {
            addCriterion("TA_PMM06 <>", value, "TA_PMM06");
            return (Criteria) this;
        }

        public Criteria andTA_PMM06GreaterThan(String value) {
            addCriterion("TA_PMM06 >", value, "TA_PMM06");
            return (Criteria) this;
        }

        public Criteria andTA_PMM06GreaterThanOrEqualTo(String value) {
            addCriterion("TA_PMM06 >=", value, "TA_PMM06");
            return (Criteria) this;
        }

        public Criteria andTA_PMM06LessThan(String value) {
            addCriterion("TA_PMM06 <", value, "TA_PMM06");
            return (Criteria) this;
        }

        public Criteria andTA_PMM06LessThanOrEqualTo(String value) {
            addCriterion("TA_PMM06 <=", value, "TA_PMM06");
            return (Criteria) this;
        }

        public Criteria andTA_PMM06Like(String value) {
            addCriterion("TA_PMM06 like", value, "TA_PMM06");
            return (Criteria) this;
        }

        public Criteria andTA_PMM06NotLike(String value) {
            addCriterion("TA_PMM06 not like", value, "TA_PMM06");
            return (Criteria) this;
        }

        public Criteria andTA_PMM06In(List<String> values) {
            addCriterion("TA_PMM06 in", values, "TA_PMM06");
            return (Criteria) this;
        }

        public Criteria andTA_PMM06NotIn(List<String> values) {
            addCriterion("TA_PMM06 not in", values, "TA_PMM06");
            return (Criteria) this;
        }

        public Criteria andTA_PMM06Between(String value1, String value2) {
            addCriterion("TA_PMM06 between", value1, value2, "TA_PMM06");
            return (Criteria) this;
        }

        public Criteria andTA_PMM06NotBetween(String value1, String value2) {
            addCriterion("TA_PMM06 not between", value1, value2, "TA_PMM06");
            return (Criteria) this;
        }

        public Criteria andTC_ZZD02IsNull() {
            addCriterion("TC_ZZD02 is null");
            return (Criteria) this;
        }

        public Criteria andTC_ZZD02IsNotNull() {
            addCriterion("TC_ZZD02 is not null");
            return (Criteria) this;
        }

        public Criteria andTC_ZZD02EqualTo(String value) {
            addCriterion("TC_ZZD02 =", value, "TC_ZZD02");
            return (Criteria) this;
        }

        public Criteria andTC_ZZD02NotEqualTo(String value) {
            addCriterion("TC_ZZD02 <>", value, "TC_ZZD02");
            return (Criteria) this;
        }

        public Criteria andTC_ZZD02GreaterThan(String value) {
            addCriterion("TC_ZZD02 >", value, "TC_ZZD02");
            return (Criteria) this;
        }

        public Criteria andTC_ZZD02GreaterThanOrEqualTo(String value) {
            addCriterion("TC_ZZD02 >=", value, "TC_ZZD02");
            return (Criteria) this;
        }

        public Criteria andTC_ZZD02LessThan(String value) {
            addCriterion("TC_ZZD02 <", value, "TC_ZZD02");
            return (Criteria) this;
        }

        public Criteria andTC_ZZD02LessThanOrEqualTo(String value) {
            addCriterion("TC_ZZD02 <=", value, "TC_ZZD02");
            return (Criteria) this;
        }

        public Criteria andTC_ZZD02Like(String value) {
            addCriterion("TC_ZZD02 like", value, "TC_ZZD02");
            return (Criteria) this;
        }

        public Criteria andTC_ZZD02NotLike(String value) {
            addCriterion("TC_ZZD02 not like", value, "TC_ZZD02");
            return (Criteria) this;
        }

        public Criteria andTC_ZZD02In(List<String> values) {
            addCriterion("TC_ZZD02 in", values, "TC_ZZD02");
            return (Criteria) this;
        }

        public Criteria andTC_ZZD02NotIn(List<String> values) {
            addCriterion("TC_ZZD02 not in", values, "TC_ZZD02");
            return (Criteria) this;
        }

        public Criteria andTC_ZZD02Between(String value1, String value2) {
            addCriterion("TC_ZZD02 between", value1, value2, "TC_ZZD02");
            return (Criteria) this;
        }

        public Criteria andTC_ZZD02NotBetween(String value1, String value2) {
            addCriterion("TC_ZZD02 not between", value1, value2, "TC_ZZD02");
            return (Criteria) this;
        }

        public Criteria andPMMUSERIsNull() {
            addCriterion("PMMUSER is null");
            return (Criteria) this;
        }

        public Criteria andPMMUSERIsNotNull() {
            addCriterion("PMMUSER is not null");
            return (Criteria) this;
        }

        public Criteria andPMMUSEREqualTo(String value) {
            addCriterion("PMMUSER =", value, "PMMUSER");
            return (Criteria) this;
        }

        public Criteria andPMMUSERNotEqualTo(String value) {
            addCriterion("PMMUSER <>", value, "PMMUSER");
            return (Criteria) this;
        }

        public Criteria andPMMUSERGreaterThan(String value) {
            addCriterion("PMMUSER >", value, "PMMUSER");
            return (Criteria) this;
        }

        public Criteria andPMMUSERGreaterThanOrEqualTo(String value) {
            addCriterion("PMMUSER >=", value, "PMMUSER");
            return (Criteria) this;
        }

        public Criteria andPMMUSERLessThan(String value) {
            addCriterion("PMMUSER <", value, "PMMUSER");
            return (Criteria) this;
        }

        public Criteria andPMMUSERLessThanOrEqualTo(String value) {
            addCriterion("PMMUSER <=", value, "PMMUSER");
            return (Criteria) this;
        }

        public Criteria andPMMUSERLike(String value) {
            addCriterion("PMMUSER like", value, "PMMUSER");
            return (Criteria) this;
        }

        public Criteria andPMMUSERNotLike(String value) {
            addCriterion("PMMUSER not like", value, "PMMUSER");
            return (Criteria) this;
        }

        public Criteria andPMMUSERIn(List<String> values) {
            addCriterion("PMMUSER in", values, "PMMUSER");
            return (Criteria) this;
        }

        public Criteria andPMMUSERNotIn(List<String> values) {
            addCriterion("PMMUSER not in", values, "PMMUSER");
            return (Criteria) this;
        }

        public Criteria andPMMUSERBetween(String value1, String value2) {
            addCriterion("PMMUSER between", value1, value2, "PMMUSER");
            return (Criteria) this;
        }

        public Criteria andPMMUSERNotBetween(String value1, String value2) {
            addCriterion("PMMUSER not between", value1, value2, "PMMUSER");
            return (Criteria) this;
        }

        public Criteria andPMMMODUIsNull() {
            addCriterion("PMMMODU is null");
            return (Criteria) this;
        }

        public Criteria andPMMMODUIsNotNull() {
            addCriterion("PMMMODU is not null");
            return (Criteria) this;
        }

        public Criteria andPMMMODUEqualTo(String value) {
            addCriterion("PMMMODU =", value, "PMMMODU");
            return (Criteria) this;
        }

        public Criteria andPMMMODUNotEqualTo(String value) {
            addCriterion("PMMMODU <>", value, "PMMMODU");
            return (Criteria) this;
        }

        public Criteria andPMMMODUGreaterThan(String value) {
            addCriterion("PMMMODU >", value, "PMMMODU");
            return (Criteria) this;
        }

        public Criteria andPMMMODUGreaterThanOrEqualTo(String value) {
            addCriterion("PMMMODU >=", value, "PMMMODU");
            return (Criteria) this;
        }

        public Criteria andPMMMODULessThan(String value) {
            addCriterion("PMMMODU <", value, "PMMMODU");
            return (Criteria) this;
        }

        public Criteria andPMMMODULessThanOrEqualTo(String value) {
            addCriterion("PMMMODU <=", value, "PMMMODU");
            return (Criteria) this;
        }

        public Criteria andPMMMODULike(String value) {
            addCriterion("PMMMODU like", value, "PMMMODU");
            return (Criteria) this;
        }

        public Criteria andPMMMODUNotLike(String value) {
            addCriterion("PMMMODU not like", value, "PMMMODU");
            return (Criteria) this;
        }

        public Criteria andPMMMODUIn(List<String> values) {
            addCriterion("PMMMODU in", values, "PMMMODU");
            return (Criteria) this;
        }

        public Criteria andPMMMODUNotIn(List<String> values) {
            addCriterion("PMMMODU not in", values, "PMMMODU");
            return (Criteria) this;
        }

        public Criteria andPMMMODUBetween(String value1, String value2) {
            addCriterion("PMMMODU between", value1, value2, "PMMMODU");
            return (Criteria) this;
        }

        public Criteria andPMMMODUNotBetween(String value1, String value2) {
            addCriterion("PMMMODU not between", value1, value2, "PMMMODU");
            return (Criteria) this;
        }

        public Criteria andPMMGRUPIsNull() {
            addCriterion("PMMGRUP is null");
            return (Criteria) this;
        }

        public Criteria andPMMGRUPIsNotNull() {
            addCriterion("PMMGRUP is not null");
            return (Criteria) this;
        }

        public Criteria andPMMGRUPEqualTo(String value) {
            addCriterion("PMMGRUP =", value, "PMMGRUP");
            return (Criteria) this;
        }

        public Criteria andPMMGRUPNotEqualTo(String value) {
            addCriterion("PMMGRUP <>", value, "PMMGRUP");
            return (Criteria) this;
        }

        public Criteria andPMMGRUPGreaterThan(String value) {
            addCriterion("PMMGRUP >", value, "PMMGRUP");
            return (Criteria) this;
        }

        public Criteria andPMMGRUPGreaterThanOrEqualTo(String value) {
            addCriterion("PMMGRUP >=", value, "PMMGRUP");
            return (Criteria) this;
        }

        public Criteria andPMMGRUPLessThan(String value) {
            addCriterion("PMMGRUP <", value, "PMMGRUP");
            return (Criteria) this;
        }

        public Criteria andPMMGRUPLessThanOrEqualTo(String value) {
            addCriterion("PMMGRUP <=", value, "PMMGRUP");
            return (Criteria) this;
        }

        public Criteria andPMMGRUPLike(String value) {
            addCriterion("PMMGRUP like", value, "PMMGRUP");
            return (Criteria) this;
        }

        public Criteria andPMMGRUPNotLike(String value) {
            addCriterion("PMMGRUP not like", value, "PMMGRUP");
            return (Criteria) this;
        }

        public Criteria andPMMGRUPIn(List<String> values) {
            addCriterion("PMMGRUP in", values, "PMMGRUP");
            return (Criteria) this;
        }

        public Criteria andPMMGRUPNotIn(List<String> values) {
            addCriterion("PMMGRUP not in", values, "PMMGRUP");
            return (Criteria) this;
        }

        public Criteria andPMMGRUPBetween(String value1, String value2) {
            addCriterion("PMMGRUP between", value1, value2, "PMMGRUP");
            return (Criteria) this;
        }

        public Criteria andPMMGRUPNotBetween(String value1, String value2) {
            addCriterion("PMMGRUP not between", value1, value2, "PMMGRUP");
            return (Criteria) this;
        }

        public Criteria andPMMDATEIsNull() {
            addCriterion("PMMDATE is null");
            return (Criteria) this;
        }

        public Criteria andPMMDATEIsNotNull() {
            addCriterion("PMMDATE is not null");
            return (Criteria) this;
        }

        public Criteria andPMMDATEEqualTo(String value) {
            addCriterion("PMMDATE =", value, "PMMDATE");
            return (Criteria) this;
        }

        public Criteria andPMMDATENotEqualTo(String value) {
            addCriterion("PMMDATE <>", value, "PMMDATE");
            return (Criteria) this;
        }

        public Criteria andPMMDATEGreaterThan(String value) {
            addCriterion("PMMDATE >", value, "PMMDATE");
            return (Criteria) this;
        }

        public Criteria andPMMDATEGreaterThanOrEqualTo(String value) {
            addCriterion("PMMDATE >=", value, "PMMDATE");
            return (Criteria) this;
        }

        public Criteria andPMMDATELessThan(String value) {
            addCriterion("PMMDATE <", value, "PMMDATE");
            return (Criteria) this;
        }

        public Criteria andPMMDATELessThanOrEqualTo(String value) {
            addCriterion("PMMDATE <=", value, "PMMDATE");
            return (Criteria) this;
        }

        public Criteria andPMMDATELike(String value) {
            addCriterion("PMMDATE like", value, "PMMDATE");
            return (Criteria) this;
        }

        public Criteria andPMMDATENotLike(String value) {
            addCriterion("PMMDATE not like", value, "PMMDATE");
            return (Criteria) this;
        }

        public Criteria andPMMDATEIn(List<String> values) {
            addCriterion("PMMDATE in", values, "PMMDATE");
            return (Criteria) this;
        }

        public Criteria andPMMDATENotIn(List<String> values) {
            addCriterion("PMMDATE not in", values, "PMMDATE");
            return (Criteria) this;
        }

        public Criteria andPMMDATEBetween(String value1, String value2) {
            addCriterion("PMMDATE between", value1, value2, "PMMDATE");
            return (Criteria) this;
        }

        public Criteria andPMMDATENotBetween(String value1, String value2) {
            addCriterion("PMMDATE not between", value1, value2, "PMMDATE");
            return (Criteria) this;
        }

        public Criteria andPMMORIUIsNull() {
            addCriterion("PMMORIU is null");
            return (Criteria) this;
        }

        public Criteria andPMMORIUIsNotNull() {
            addCriterion("PMMORIU is not null");
            return (Criteria) this;
        }

        public Criteria andPMMORIUEqualTo(String value) {
            addCriterion("PMMORIU =", value, "PMMORIU");
            return (Criteria) this;
        }

        public Criteria andPMMORIUNotEqualTo(String value) {
            addCriterion("PMMORIU <>", value, "PMMORIU");
            return (Criteria) this;
        }

        public Criteria andPMMORIUGreaterThan(String value) {
            addCriterion("PMMORIU >", value, "PMMORIU");
            return (Criteria) this;
        }

        public Criteria andPMMORIUGreaterThanOrEqualTo(String value) {
            addCriterion("PMMORIU >=", value, "PMMORIU");
            return (Criteria) this;
        }

        public Criteria andPMMORIULessThan(String value) {
            addCriterion("PMMORIU <", value, "PMMORIU");
            return (Criteria) this;
        }

        public Criteria andPMMORIULessThanOrEqualTo(String value) {
            addCriterion("PMMORIU <=", value, "PMMORIU");
            return (Criteria) this;
        }

        public Criteria andPMMORIULike(String value) {
            addCriterion("PMMORIU like", value, "PMMORIU");
            return (Criteria) this;
        }

        public Criteria andPMMORIUNotLike(String value) {
            addCriterion("PMMORIU not like", value, "PMMORIU");
            return (Criteria) this;
        }

        public Criteria andPMMORIUIn(List<String> values) {
            addCriterion("PMMORIU in", values, "PMMORIU");
            return (Criteria) this;
        }

        public Criteria andPMMORIUNotIn(List<String> values) {
            addCriterion("PMMORIU not in", values, "PMMORIU");
            return (Criteria) this;
        }

        public Criteria andPMMORIUBetween(String value1, String value2) {
            addCriterion("PMMORIU between", value1, value2, "PMMORIU");
            return (Criteria) this;
        }

        public Criteria andPMMORIUNotBetween(String value1, String value2) {
            addCriterion("PMMORIU not between", value1, value2, "PMMORIU");
            return (Criteria) this;
        }

        public Criteria andTA_PMM10IsNull() {
            addCriterion("TA_PMM10 is null");
            return (Criteria) this;
        }

        public Criteria andTA_PMM10IsNotNull() {
            addCriterion("TA_PMM10 is not null");
            return (Criteria) this;
        }

        public Criteria andTA_PMM10EqualTo(String value) {
            addCriterion("TA_PMM10 =", value, "TA_PMM10");
            return (Criteria) this;
        }

        public Criteria andTA_PMM10NotEqualTo(String value) {
            addCriterion("TA_PMM10 <>", value, "TA_PMM10");
            return (Criteria) this;
        }

        public Criteria andTA_PMM10GreaterThan(String value) {
            addCriterion("TA_PMM10 >", value, "TA_PMM10");
            return (Criteria) this;
        }

        public Criteria andTA_PMM10GreaterThanOrEqualTo(String value) {
            addCriterion("TA_PMM10 >=", value, "TA_PMM10");
            return (Criteria) this;
        }

        public Criteria andTA_PMM10LessThan(String value) {
            addCriterion("TA_PMM10 <", value, "TA_PMM10");
            return (Criteria) this;
        }

        public Criteria andTA_PMM10LessThanOrEqualTo(String value) {
            addCriterion("TA_PMM10 <=", value, "TA_PMM10");
            return (Criteria) this;
        }

        public Criteria andTA_PMM10Like(String value) {
            addCriterion("TA_PMM10 like", value, "TA_PMM10");
            return (Criteria) this;
        }

        public Criteria andTA_PMM10NotLike(String value) {
            addCriterion("TA_PMM10 not like", value, "TA_PMM10");
            return (Criteria) this;
        }

        public Criteria andTA_PMM10In(List<String> values) {
            addCriterion("TA_PMM10 in", values, "TA_PMM10");
            return (Criteria) this;
        }

        public Criteria andTA_PMM10NotIn(List<String> values) {
            addCriterion("TA_PMM10 not in", values, "TA_PMM10");
            return (Criteria) this;
        }

        public Criteria andTA_PMM10Between(String value1, String value2) {
            addCriterion("TA_PMM10 between", value1, value2, "TA_PMM10");
            return (Criteria) this;
        }

        public Criteria andTA_PMM10NotBetween(String value1, String value2) {
            addCriterion("TA_PMM10 not between", value1, value2, "TA_PMM10");
            return (Criteria) this;
        }

        public Criteria andPMMORIGIsNull() {
            addCriterion("PMMORIG is null");
            return (Criteria) this;
        }

        public Criteria andPMMORIGIsNotNull() {
            addCriterion("PMMORIG is not null");
            return (Criteria) this;
        }

        public Criteria andPMMORIGEqualTo(String value) {
            addCriterion("PMMORIG =", value, "PMMORIG");
            return (Criteria) this;
        }

        public Criteria andPMMORIGNotEqualTo(String value) {
            addCriterion("PMMORIG <>", value, "PMMORIG");
            return (Criteria) this;
        }

        public Criteria andPMMORIGGreaterThan(String value) {
            addCriterion("PMMORIG >", value, "PMMORIG");
            return (Criteria) this;
        }

        public Criteria andPMMORIGGreaterThanOrEqualTo(String value) {
            addCriterion("PMMORIG >=", value, "PMMORIG");
            return (Criteria) this;
        }

        public Criteria andPMMORIGLessThan(String value) {
            addCriterion("PMMORIG <", value, "PMMORIG");
            return (Criteria) this;
        }

        public Criteria andPMMORIGLessThanOrEqualTo(String value) {
            addCriterion("PMMORIG <=", value, "PMMORIG");
            return (Criteria) this;
        }

        public Criteria andPMMORIGLike(String value) {
            addCriterion("PMMORIG like", value, "PMMORIG");
            return (Criteria) this;
        }

        public Criteria andPMMORIGNotLike(String value) {
            addCriterion("PMMORIG not like", value, "PMMORIG");
            return (Criteria) this;
        }

        public Criteria andPMMORIGIn(List<String> values) {
            addCriterion("PMMORIG in", values, "PMMORIG");
            return (Criteria) this;
        }

        public Criteria andPMMORIGNotIn(List<String> values) {
            addCriterion("PMMORIG not in", values, "PMMORIG");
            return (Criteria) this;
        }

        public Criteria andPMMORIGBetween(String value1, String value2) {
            addCriterion("PMMORIG between", value1, value2, "PMMORIG");
            return (Criteria) this;
        }

        public Criteria andPMMORIGNotBetween(String value1, String value2) {
            addCriterion("PMMORIG not between", value1, value2, "PMMORIG");
            return (Criteria) this;
        }

        public Criteria andPMMUD13IsNull() {
            addCriterion("PMMUD13 is null");
            return (Criteria) this;
        }

        public Criteria andPMMUD13IsNotNull() {
            addCriterion("PMMUD13 is not null");
            return (Criteria) this;
        }

        public Criteria andPMMUD13EqualTo(String value) {
            addCriterion("PMMUD13 =", value, "PMMUD13");
            return (Criteria) this;
        }

        public Criteria andPMMUD13NotEqualTo(String value) {
            addCriterion("PMMUD13 <>", value, "PMMUD13");
            return (Criteria) this;
        }

        public Criteria andPMMUD13GreaterThan(String value) {
            addCriterion("PMMUD13 >", value, "PMMUD13");
            return (Criteria) this;
        }

        public Criteria andPMMUD13GreaterThanOrEqualTo(String value) {
            addCriterion("PMMUD13 >=", value, "PMMUD13");
            return (Criteria) this;
        }

        public Criteria andPMMUD13LessThan(String value) {
            addCriterion("PMMUD13 <", value, "PMMUD13");
            return (Criteria) this;
        }

        public Criteria andPMMUD13LessThanOrEqualTo(String value) {
            addCriterion("PMMUD13 <=", value, "PMMUD13");
            return (Criteria) this;
        }

        public Criteria andPMMUD13Like(String value) {
            addCriterion("PMMUD13 like", value, "PMMUD13");
            return (Criteria) this;
        }

        public Criteria andPMMUD13NotLike(String value) {
            addCriterion("PMMUD13 not like", value, "PMMUD13");
            return (Criteria) this;
        }

        public Criteria andPMMUD13In(List<String> values) {
            addCriterion("PMMUD13 in", values, "PMMUD13");
            return (Criteria) this;
        }

        public Criteria andPMMUD13NotIn(List<String> values) {
            addCriterion("PMMUD13 not in", values, "PMMUD13");
            return (Criteria) this;
        }

        public Criteria andPMMUD13Between(String value1, String value2) {
            addCriterion("PMMUD13 between", value1, value2, "PMMUD13");
            return (Criteria) this;
        }

        public Criteria andPMMUD13NotBetween(String value1, String value2) {
            addCriterion("PMMUD13 not between", value1, value2, "PMMUD13");
            return (Criteria) this;
        }

        public Criteria andPMM18IsNull() {
            addCriterion("PMM18 is null");
            return (Criteria) this;
        }

        public Criteria andPMM18IsNotNull() {
            addCriterion("PMM18 is not null");
            return (Criteria) this;
        }

        public Criteria andPMM18EqualTo(String value) {
            addCriterion("PMM18 =", value, "PMM18");
            return (Criteria) this;
        }

        public Criteria andPMM18NotEqualTo(String value) {
            addCriterion("PMM18 <>", value, "PMM18");
            return (Criteria) this;
        }

        public Criteria andPMM18GreaterThan(String value) {
            addCriterion("PMM18 >", value, "PMM18");
            return (Criteria) this;
        }

        public Criteria andPMM18GreaterThanOrEqualTo(String value) {
            addCriterion("PMM18 >=", value, "PMM18");
            return (Criteria) this;
        }

        public Criteria andPMM18LessThan(String value) {
            addCriterion("PMM18 <", value, "PMM18");
            return (Criteria) this;
        }

        public Criteria andPMM18LessThanOrEqualTo(String value) {
            addCriterion("PMM18 <=", value, "PMM18");
            return (Criteria) this;
        }

        public Criteria andPMM18Like(String value) {
            addCriterion("PMM18 like", value, "PMM18");
            return (Criteria) this;
        }

        public Criteria andPMM18NotLike(String value) {
            addCriterion("PMM18 not like", value, "PMM18");
            return (Criteria) this;
        }

        public Criteria andPMM18In(List<String> values) {
            addCriterion("PMM18 in", values, "PMM18");
            return (Criteria) this;
        }

        public Criteria andPMM18NotIn(List<String> values) {
            addCriterion("PMM18 not in", values, "PMM18");
            return (Criteria) this;
        }

        public Criteria andPMM18Between(String value1, String value2) {
            addCriterion("PMM18 between", value1, value2, "PMM18");
            return (Criteria) this;
        }

        public Criteria andPMM18NotBetween(String value1, String value2) {
            addCriterion("PMM18 not between", value1, value2, "PMM18");
            return (Criteria) this;
        }

        public Criteria andPMM25IsNull() {
            addCriterion("PMM25 is null");
            return (Criteria) this;
        }

        public Criteria andPMM25IsNotNull() {
            addCriterion("PMM25 is not null");
            return (Criteria) this;
        }

        public Criteria andPMM25EqualTo(String value) {
            addCriterion("PMM25 =", value, "PMM25");
            return (Criteria) this;
        }

        public Criteria andPMM25NotEqualTo(String value) {
            addCriterion("PMM25 <>", value, "PMM25");
            return (Criteria) this;
        }

        public Criteria andPMM25GreaterThan(String value) {
            addCriterion("PMM25 >", value, "PMM25");
            return (Criteria) this;
        }

        public Criteria andPMM25GreaterThanOrEqualTo(String value) {
            addCriterion("PMM25 >=", value, "PMM25");
            return (Criteria) this;
        }

        public Criteria andPMM25LessThan(String value) {
            addCriterion("PMM25 <", value, "PMM25");
            return (Criteria) this;
        }

        public Criteria andPMM25LessThanOrEqualTo(String value) {
            addCriterion("PMM25 <=", value, "PMM25");
            return (Criteria) this;
        }

        public Criteria andPMM25Like(String value) {
            addCriterion("PMM25 like", value, "PMM25");
            return (Criteria) this;
        }

        public Criteria andPMM25NotLike(String value) {
            addCriterion("PMM25 not like", value, "PMM25");
            return (Criteria) this;
        }

        public Criteria andPMM25In(List<String> values) {
            addCriterion("PMM25 in", values, "PMM25");
            return (Criteria) this;
        }

        public Criteria andPMM25NotIn(List<String> values) {
            addCriterion("PMM25 not in", values, "PMM25");
            return (Criteria) this;
        }

        public Criteria andPMM25Between(String value1, String value2) {
            addCriterion("PMM25 between", value1, value2, "PMM25");
            return (Criteria) this;
        }

        public Criteria andPMM25NotBetween(String value1, String value2) {
            addCriterion("PMM25 not between", value1, value2, "PMM25");
            return (Criteria) this;
        }

        public Criteria andTC_TQA03IsNull() {
            addCriterion("TC_TQA03 is null");
            return (Criteria) this;
        }

        public Criteria andTC_TQA03IsNotNull() {
            addCriterion("TC_TQA03 is not null");
            return (Criteria) this;
        }

        public Criteria andTC_TQA03EqualTo(String value) {
            addCriterion("TC_TQA03 =", value, "TC_TQA03");
            return (Criteria) this;
        }

        public Criteria andTC_TQA03NotEqualTo(String value) {
            addCriterion("TC_TQA03 <>", value, "TC_TQA03");
            return (Criteria) this;
        }

        public Criteria andTC_TQA03GreaterThan(String value) {
            addCriterion("TC_TQA03 >", value, "TC_TQA03");
            return (Criteria) this;
        }

        public Criteria andTC_TQA03GreaterThanOrEqualTo(String value) {
            addCriterion("TC_TQA03 >=", value, "TC_TQA03");
            return (Criteria) this;
        }

        public Criteria andTC_TQA03LessThan(String value) {
            addCriterion("TC_TQA03 <", value, "TC_TQA03");
            return (Criteria) this;
        }

        public Criteria andTC_TQA03LessThanOrEqualTo(String value) {
            addCriterion("TC_TQA03 <=", value, "TC_TQA03");
            return (Criteria) this;
        }

        public Criteria andTC_TQA03Like(String value) {
            addCriterion("TC_TQA03 like", value, "TC_TQA03");
            return (Criteria) this;
        }

        public Criteria andTC_TQA03NotLike(String value) {
            addCriterion("TC_TQA03 not like", value, "TC_TQA03");
            return (Criteria) this;
        }

        public Criteria andTC_TQA03In(List<String> values) {
            addCriterion("TC_TQA03 in", values, "TC_TQA03");
            return (Criteria) this;
        }

        public Criteria andTC_TQA03NotIn(List<String> values) {
            addCriterion("TC_TQA03 not in", values, "TC_TQA03");
            return (Criteria) this;
        }

        public Criteria andTC_TQA03Between(String value1, String value2) {
            addCriterion("TC_TQA03 between", value1, value2, "TC_TQA03");
            return (Criteria) this;
        }

        public Criteria andTC_TQA03NotBetween(String value1, String value2) {
            addCriterion("TC_TQA03 not between", value1, value2, "TC_TQA03");
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