package com.chenyuantech.eps.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class RvbExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public RvbExample() {
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

        public Criteria andRvb01IsNull() {
            addCriterion("RVB01 is null");
            return (Criteria) this;
        }

        public Criteria andRvb01IsNotNull() {
            addCriterion("RVB01 is not null");
            return (Criteria) this;
        }

        public Criteria andRvb01EqualTo(String value) {
            addCriterion("RVB01 =", value, "rvb01");
            return (Criteria) this;
        }

        public Criteria andRvb01NotEqualTo(String value) {
            addCriterion("RVB01 <>", value, "rvb01");
            return (Criteria) this;
        }

        public Criteria andRvb01GreaterThan(String value) {
            addCriterion("RVB01 >", value, "rvb01");
            return (Criteria) this;
        }

        public Criteria andRvb01GreaterThanOrEqualTo(String value) {
            addCriterion("RVB01 >=", value, "rvb01");
            return (Criteria) this;
        }

        public Criteria andRvb01LessThan(String value) {
            addCriterion("RVB01 <", value, "rvb01");
            return (Criteria) this;
        }

        public Criteria andRvb01LessThanOrEqualTo(String value) {
            addCriterion("RVB01 <=", value, "rvb01");
            return (Criteria) this;
        }

        public Criteria andRvb01Like(String value) {
            addCriterion("RVB01 like", value, "rvb01");
            return (Criteria) this;
        }

        public Criteria andRvb01NotLike(String value) {
            addCriterion("RVB01 not like", value, "rvb01");
            return (Criteria) this;
        }

        public Criteria andRvb01In(List<String> values) {
            addCriterion("RVB01 in", values, "rvb01");
            return (Criteria) this;
        }

        public Criteria andRvb01NotIn(List<String> values) {
            addCriterion("RVB01 not in", values, "rvb01");
            return (Criteria) this;
        }

        public Criteria andRvb01Between(String value1, String value2) {
            addCriterion("RVB01 between", value1, value2, "rvb01");
            return (Criteria) this;
        }

        public Criteria andRvb01NotBetween(String value1, String value2) {
            addCriterion("RVB01 not between", value1, value2, "rvb01");
            return (Criteria) this;
        }

        public Criteria andRvb02IsNull() {
            addCriterion("RVB02 is null");
            return (Criteria) this;
        }

        public Criteria andRvb02IsNotNull() {
            addCriterion("RVB02 is not null");
            return (Criteria) this;
        }

        public Criteria andRvb02EqualTo(Integer value) {
            addCriterion("RVB02 =", value, "rvb02");
            return (Criteria) this;
        }

        public Criteria andRvb02NotEqualTo(Integer value) {
            addCriterion("RVB02 <>", value, "rvb02");
            return (Criteria) this;
        }

        public Criteria andRvb02GreaterThan(Integer value) {
            addCriterion("RVB02 >", value, "rvb02");
            return (Criteria) this;
        }

        public Criteria andRvb02GreaterThanOrEqualTo(Integer value) {
            addCriterion("RVB02 >=", value, "rvb02");
            return (Criteria) this;
        }

        public Criteria andRvb02LessThan(Integer value) {
            addCriterion("RVB02 <", value, "rvb02");
            return (Criteria) this;
        }

        public Criteria andRvb02LessThanOrEqualTo(Integer value) {
            addCriterion("RVB02 <=", value, "rvb02");
            return (Criteria) this;
        }

        public Criteria andRvb02In(List<Integer> values) {
            addCriterion("RVB02 in", values, "rvb02");
            return (Criteria) this;
        }

        public Criteria andRvb02NotIn(List<Integer> values) {
            addCriterion("RVB02 not in", values, "rvb02");
            return (Criteria) this;
        }

        public Criteria andRvb02Between(Integer value1, Integer value2) {
            addCriterion("RVB02 between", value1, value2, "rvb02");
            return (Criteria) this;
        }

        public Criteria andRvb02NotBetween(Integer value1, Integer value2) {
            addCriterion("RVB02 not between", value1, value2, "rvb02");
            return (Criteria) this;
        }

        public Criteria andRvb03IsNull() {
            addCriterion("RVB03 is null");
            return (Criteria) this;
        }

        public Criteria andRvb03IsNotNull() {
            addCriterion("RVB03 is not null");
            return (Criteria) this;
        }

        public Criteria andRvb03EqualTo(Integer value) {
            addCriterion("RVB03 =", value, "rvb03");
            return (Criteria) this;
        }

        public Criteria andRvb03NotEqualTo(Integer value) {
            addCriterion("RVB03 <>", value, "rvb03");
            return (Criteria) this;
        }

        public Criteria andRvb03GreaterThan(Integer value) {
            addCriterion("RVB03 >", value, "rvb03");
            return (Criteria) this;
        }

        public Criteria andRvb03GreaterThanOrEqualTo(Integer value) {
            addCriterion("RVB03 >=", value, "rvb03");
            return (Criteria) this;
        }

        public Criteria andRvb03LessThan(Integer value) {
            addCriterion("RVB03 <", value, "rvb03");
            return (Criteria) this;
        }

        public Criteria andRvb03LessThanOrEqualTo(Integer value) {
            addCriterion("RVB03 <=", value, "rvb03");
            return (Criteria) this;
        }

        public Criteria andRvb03In(List<Integer> values) {
            addCriterion("RVB03 in", values, "rvb03");
            return (Criteria) this;
        }

        public Criteria andRvb03NotIn(List<Integer> values) {
            addCriterion("RVB03 not in", values, "rvb03");
            return (Criteria) this;
        }

        public Criteria andRvb03Between(Integer value1, Integer value2) {
            addCriterion("RVB03 between", value1, value2, "rvb03");
            return (Criteria) this;
        }

        public Criteria andRvb03NotBetween(Integer value1, Integer value2) {
            addCriterion("RVB03 not between", value1, value2, "rvb03");
            return (Criteria) this;
        }

        public Criteria andRvb04IsNull() {
            addCriterion("RVB04 is null");
            return (Criteria) this;
        }

        public Criteria andRvb04IsNotNull() {
            addCriterion("RVB04 is not null");
            return (Criteria) this;
        }

        public Criteria andRvb04EqualTo(String value) {
            addCriterion("RVB04 =", value, "rvb04");
            return (Criteria) this;
        }

        public Criteria andRvb04NotEqualTo(String value) {
            addCriterion("RVB04 <>", value, "rvb04");
            return (Criteria) this;
        }

        public Criteria andRvb04GreaterThan(String value) {
            addCriterion("RVB04 >", value, "rvb04");
            return (Criteria) this;
        }

        public Criteria andRvb04GreaterThanOrEqualTo(String value) {
            addCriterion("RVB04 >=", value, "rvb04");
            return (Criteria) this;
        }

        public Criteria andRvb04LessThan(String value) {
            addCriterion("RVB04 <", value, "rvb04");
            return (Criteria) this;
        }

        public Criteria andRvb04LessThanOrEqualTo(String value) {
            addCriterion("RVB04 <=", value, "rvb04");
            return (Criteria) this;
        }

        public Criteria andRvb04Like(String value) {
            addCriterion("RVB04 like", value, "rvb04");
            return (Criteria) this;
        }

        public Criteria andRvb04NotLike(String value) {
            addCriterion("RVB04 not like", value, "rvb04");
            return (Criteria) this;
        }

        public Criteria andRvb04In(List<String> values) {
            addCriterion("RVB04 in", values, "rvb04");
            return (Criteria) this;
        }

        public Criteria andRvb04NotIn(List<String> values) {
            addCriterion("RVB04 not in", values, "rvb04");
            return (Criteria) this;
        }

        public Criteria andRvb04Between(String value1, String value2) {
            addCriterion("RVB04 between", value1, value2, "rvb04");
            return (Criteria) this;
        }

        public Criteria andRvb04NotBetween(String value1, String value2) {
            addCriterion("RVB04 not between", value1, value2, "rvb04");
            return (Criteria) this;
        }

        public Criteria andRvb07IsNull() {
            addCriterion("RVB07 is null");
            return (Criteria) this;
        }

        public Criteria andRvb07IsNotNull() {
            addCriterion("RVB07 is not null");
            return (Criteria) this;
        }

        public Criteria andRvb07EqualTo(BigDecimal value) {
            addCriterion("RVB07 =", value, "rvb07");
            return (Criteria) this;
        }

        public Criteria andRvb07NotEqualTo(BigDecimal value) {
            addCriterion("RVB07 <>", value, "rvb07");
            return (Criteria) this;
        }

        public Criteria andRvb07GreaterThan(BigDecimal value) {
            addCriterion("RVB07 >", value, "rvb07");
            return (Criteria) this;
        }

        public Criteria andRvb07GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RVB07 >=", value, "rvb07");
            return (Criteria) this;
        }

        public Criteria andRvb07LessThan(BigDecimal value) {
            addCriterion("RVB07 <", value, "rvb07");
            return (Criteria) this;
        }

        public Criteria andRvb07LessThanOrEqualTo(BigDecimal value) {
            addCriterion("RVB07 <=", value, "rvb07");
            return (Criteria) this;
        }

        public Criteria andRvb07In(List<BigDecimal> values) {
            addCriterion("RVB07 in", values, "rvb07");
            return (Criteria) this;
        }

        public Criteria andRvb07NotIn(List<BigDecimal> values) {
            addCriterion("RVB07 not in", values, "rvb07");
            return (Criteria) this;
        }

        public Criteria andRvb07Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("RVB07 between", value1, value2, "rvb07");
            return (Criteria) this;
        }

        public Criteria andRvb07NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RVB07 not between", value1, value2, "rvb07");
            return (Criteria) this;
        }

        public Criteria andPmn20IsNull() {
            addCriterion("PMN20 is null");
            return (Criteria) this;
        }

        public Criteria andPmn20IsNotNull() {
            addCriterion("PMN20 is not null");
            return (Criteria) this;
        }

        public Criteria andPmn20EqualTo(BigDecimal value) {
            addCriterion("PMN20 =", value, "pmn20");
            return (Criteria) this;
        }

        public Criteria andPmn20NotEqualTo(BigDecimal value) {
            addCriterion("PMN20 <>", value, "pmn20");
            return (Criteria) this;
        }

        public Criteria andPmn20GreaterThan(BigDecimal value) {
            addCriterion("PMN20 >", value, "pmn20");
            return (Criteria) this;
        }

        public Criteria andPmn20GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PMN20 >=", value, "pmn20");
            return (Criteria) this;
        }

        public Criteria andPmn20LessThan(BigDecimal value) {
            addCriterion("PMN20 <", value, "pmn20");
            return (Criteria) this;
        }

        public Criteria andPmn20LessThanOrEqualTo(BigDecimal value) {
            addCriterion("PMN20 <=", value, "pmn20");
            return (Criteria) this;
        }

        public Criteria andPmn20In(List<BigDecimal> values) {
            addCriterion("PMN20 in", values, "pmn20");
            return (Criteria) this;
        }

        public Criteria andPmn20NotIn(List<BigDecimal> values) {
            addCriterion("PMN20 not in", values, "pmn20");
            return (Criteria) this;
        }

        public Criteria andPmn20Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("PMN20 between", value1, value2, "pmn20");
            return (Criteria) this;
        }

        public Criteria andPmn20NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PMN20 not between", value1, value2, "pmn20");
            return (Criteria) this;
        }

        public Criteria andRvb29IsNull() {
            addCriterion("RVB29 is null");
            return (Criteria) this;
        }

        public Criteria andRvb29IsNotNull() {
            addCriterion("RVB29 is not null");
            return (Criteria) this;
        }

        public Criteria andRvb29EqualTo(BigDecimal value) {
            addCriterion("RVB29 =", value, "rvb29");
            return (Criteria) this;
        }

        public Criteria andRvb29NotEqualTo(BigDecimal value) {
            addCriterion("RVB29 <>", value, "rvb29");
            return (Criteria) this;
        }

        public Criteria andRvb29GreaterThan(BigDecimal value) {
            addCriterion("RVB29 >", value, "rvb29");
            return (Criteria) this;
        }

        public Criteria andRvb29GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RVB29 >=", value, "rvb29");
            return (Criteria) this;
        }

        public Criteria andRvb29LessThan(BigDecimal value) {
            addCriterion("RVB29 <", value, "rvb29");
            return (Criteria) this;
        }

        public Criteria andRvb29LessThanOrEqualTo(BigDecimal value) {
            addCriterion("RVB29 <=", value, "rvb29");
            return (Criteria) this;
        }

        public Criteria andRvb29In(List<BigDecimal> values) {
            addCriterion("RVB29 in", values, "rvb29");
            return (Criteria) this;
        }

        public Criteria andRvb29NotIn(List<BigDecimal> values) {
            addCriterion("RVB29 not in", values, "rvb29");
            return (Criteria) this;
        }

        public Criteria andRvb29Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("RVB29 between", value1, value2, "rvb29");
            return (Criteria) this;
        }

        public Criteria andRvb29NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RVB29 not between", value1, value2, "rvb29");
            return (Criteria) this;
        }

        public Criteria andPmn5055IsNull() {
            addCriterion("PMN50_55 is null");
            return (Criteria) this;
        }

        public Criteria andPmn5055IsNotNull() {
            addCriterion("PMN50_55 is not null");
            return (Criteria) this;
        }

        public Criteria andPmn5055EqualTo(BigDecimal value) {
            addCriterion("PMN50_55 =", value, "pmn5055");
            return (Criteria) this;
        }

        public Criteria andPmn5055NotEqualTo(BigDecimal value) {
            addCriterion("PMN50_55 <>", value, "pmn5055");
            return (Criteria) this;
        }

        public Criteria andPmn5055GreaterThan(BigDecimal value) {
            addCriterion("PMN50_55 >", value, "pmn5055");
            return (Criteria) this;
        }

        public Criteria andPmn5055GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PMN50_55 >=", value, "pmn5055");
            return (Criteria) this;
        }

        public Criteria andPmn5055LessThan(BigDecimal value) {
            addCriterion("PMN50_55 <", value, "pmn5055");
            return (Criteria) this;
        }

        public Criteria andPmn5055LessThanOrEqualTo(BigDecimal value) {
            addCriterion("PMN50_55 <=", value, "pmn5055");
            return (Criteria) this;
        }

        public Criteria andPmn5055In(List<BigDecimal> values) {
            addCriterion("PMN50_55 in", values, "pmn5055");
            return (Criteria) this;
        }

        public Criteria andPmn5055NotIn(List<BigDecimal> values) {
            addCriterion("PMN50_55 not in", values, "pmn5055");
            return (Criteria) this;
        }

        public Criteria andPmn5055Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("PMN50_55 between", value1, value2, "pmn5055");
            return (Criteria) this;
        }

        public Criteria andPmn5055NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PMN50_55 not between", value1, value2, "pmn5055");
            return (Criteria) this;
        }

        public Criteria andRvb38IsNull() {
            addCriterion("RVB38 is null");
            return (Criteria) this;
        }

        public Criteria andRvb38IsNotNull() {
            addCriterion("RVB38 is not null");
            return (Criteria) this;
        }

        public Criteria andRvb38EqualTo(String value) {
            addCriterion("RVB38 =", value, "rvb38");
            return (Criteria) this;
        }

        public Criteria andRvb38NotEqualTo(String value) {
            addCriterion("RVB38 <>", value, "rvb38");
            return (Criteria) this;
        }

        public Criteria andRvb38GreaterThan(String value) {
            addCriterion("RVB38 >", value, "rvb38");
            return (Criteria) this;
        }

        public Criteria andRvb38GreaterThanOrEqualTo(String value) {
            addCriterion("RVB38 >=", value, "rvb38");
            return (Criteria) this;
        }

        public Criteria andRvb38LessThan(String value) {
            addCriterion("RVB38 <", value, "rvb38");
            return (Criteria) this;
        }

        public Criteria andRvb38LessThanOrEqualTo(String value) {
            addCriterion("RVB38 <=", value, "rvb38");
            return (Criteria) this;
        }

        public Criteria andRvb38Like(String value) {
            addCriterion("RVB38 like", value, "rvb38");
            return (Criteria) this;
        }

        public Criteria andRvb38NotLike(String value) {
            addCriterion("RVB38 not like", value, "rvb38");
            return (Criteria) this;
        }

        public Criteria andRvb38In(List<String> values) {
            addCriterion("RVB38 in", values, "rvb38");
            return (Criteria) this;
        }

        public Criteria andRvb38NotIn(List<String> values) {
            addCriterion("RVB38 not in", values, "rvb38");
            return (Criteria) this;
        }

        public Criteria andRvb38Between(String value1, String value2) {
            addCriterion("RVB38 between", value1, value2, "rvb38");
            return (Criteria) this;
        }

        public Criteria andRvb38NotBetween(String value1, String value2) {
            addCriterion("RVB38 not between", value1, value2, "rvb38");
            return (Criteria) this;
        }

        public Criteria andRvb30IsNull() {
            addCriterion("RVB30 is null");
            return (Criteria) this;
        }

        public Criteria andRvb30IsNotNull() {
            addCriterion("RVB30 is not null");
            return (Criteria) this;
        }

        public Criteria andRvb30EqualTo(BigDecimal value) {
            addCriterion("RVB30 =", value, "rvb30");
            return (Criteria) this;
        }

        public Criteria andRvb30NotEqualTo(BigDecimal value) {
            addCriterion("RVB30 <>", value, "rvb30");
            return (Criteria) this;
        }

        public Criteria andRvb30GreaterThan(BigDecimal value) {
            addCriterion("RVB30 >", value, "rvb30");
            return (Criteria) this;
        }

        public Criteria andRvb30GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RVB30 >=", value, "rvb30");
            return (Criteria) this;
        }

        public Criteria andRvb30LessThan(BigDecimal value) {
            addCriterion("RVB30 <", value, "rvb30");
            return (Criteria) this;
        }

        public Criteria andRvb30LessThanOrEqualTo(BigDecimal value) {
            addCriterion("RVB30 <=", value, "rvb30");
            return (Criteria) this;
        }

        public Criteria andRvb30In(List<BigDecimal> values) {
            addCriterion("RVB30 in", values, "rvb30");
            return (Criteria) this;
        }

        public Criteria andRvb30NotIn(List<BigDecimal> values) {
            addCriterion("RVB30 not in", values, "rvb30");
            return (Criteria) this;
        }

        public Criteria andRvb30Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("RVB30 between", value1, value2, "rvb30");
            return (Criteria) this;
        }

        public Criteria andRvb30NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RVB30 not between", value1, value2, "rvb30");
            return (Criteria) this;
        }

        public Criteria andJinduIsNull() {
            addCriterion("JINDU is null");
            return (Criteria) this;
        }

        public Criteria andJinduIsNotNull() {
            addCriterion("JINDU is not null");
            return (Criteria) this;
        }

        public Criteria andJinduEqualTo(Integer value) {
            addCriterion("JINDU =", value, "jindu");
            return (Criteria) this;
        }

        public Criteria andJinduNotEqualTo(Integer value) {
            addCriterion("JINDU <>", value, "jindu");
            return (Criteria) this;
        }

        public Criteria andJinduGreaterThan(Integer value) {
            addCriterion("JINDU >", value, "jindu");
            return (Criteria) this;
        }

        public Criteria andJinduGreaterThanOrEqualTo(Integer value) {
            addCriterion("JINDU >=", value, "jindu");
            return (Criteria) this;
        }

        public Criteria andJinduLessThan(Integer value) {
            addCriterion("JINDU <", value, "jindu");
            return (Criteria) this;
        }

        public Criteria andJinduLessThanOrEqualTo(Integer value) {
            addCriterion("JINDU <=", value, "jindu");
            return (Criteria) this;
        }

        public Criteria andJinduIn(List<Integer> values) {
            addCriterion("JINDU in", values, "jindu");
            return (Criteria) this;
        }

        public Criteria andJinduNotIn(List<Integer> values) {
            addCriterion("JINDU not in", values, "jindu");
            return (Criteria) this;
        }

        public Criteria andJinduBetween(Integer value1, Integer value2) {
            addCriterion("JINDU between", value1, value2, "jindu");
            return (Criteria) this;
        }

        public Criteria andJinduNotBetween(Integer value1, Integer value2) {
            addCriterion("JINDU not between", value1, value2, "jindu");
            return (Criteria) this;
        }

        public Criteria andRvb36IsNull() {
            addCriterion("RVB36 is null");
            return (Criteria) this;
        }

        public Criteria andRvb36IsNotNull() {
            addCriterion("RVB36 is not null");
            return (Criteria) this;
        }

        public Criteria andRvb36EqualTo(String value) {
            addCriterion("RVB36 =", value, "rvb36");
            return (Criteria) this;
        }

        public Criteria andRvb36NotEqualTo(String value) {
            addCriterion("RVB36 <>", value, "rvb36");
            return (Criteria) this;
        }

        public Criteria andRvb36GreaterThan(String value) {
            addCriterion("RVB36 >", value, "rvb36");
            return (Criteria) this;
        }

        public Criteria andRvb36GreaterThanOrEqualTo(String value) {
            addCriterion("RVB36 >=", value, "rvb36");
            return (Criteria) this;
        }

        public Criteria andRvb36LessThan(String value) {
            addCriterion("RVB36 <", value, "rvb36");
            return (Criteria) this;
        }

        public Criteria andRvb36LessThanOrEqualTo(String value) {
            addCriterion("RVB36 <=", value, "rvb36");
            return (Criteria) this;
        }

        public Criteria andRvb36Like(String value) {
            addCriterion("RVB36 like", value, "rvb36");
            return (Criteria) this;
        }

        public Criteria andRvb36NotLike(String value) {
            addCriterion("RVB36 not like", value, "rvb36");
            return (Criteria) this;
        }

        public Criteria andRvb36In(List<String> values) {
            addCriterion("RVB36 in", values, "rvb36");
            return (Criteria) this;
        }

        public Criteria andRvb36NotIn(List<String> values) {
            addCriterion("RVB36 not in", values, "rvb36");
            return (Criteria) this;
        }

        public Criteria andRvb36Between(String value1, String value2) {
            addCriterion("RVB36 between", value1, value2, "rvb36");
            return (Criteria) this;
        }

        public Criteria andRvb36NotBetween(String value1, String value2) {
            addCriterion("RVB36 not between", value1, value2, "rvb36");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("FLAG is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(String value) {
            addCriterion("FLAG =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(String value) {
            addCriterion("FLAG <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(String value) {
            addCriterion("FLAG >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(String value) {
            addCriterion("FLAG >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(String value) {
            addCriterion("FLAG <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(String value) {
            addCriterion("FLAG <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLike(String value) {
            addCriterion("FLAG like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotLike(String value) {
            addCriterion("FLAG not like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<String> values) {
            addCriterion("FLAG in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<String> values) {
            addCriterion("FLAG not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(String value1, String value2) {
            addCriterion("FLAG between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(String value1, String value2) {
            addCriterion("FLAG not between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andRvb39IsNull() {
            addCriterion("RVB39 is null");
            return (Criteria) this;
        }

        public Criteria andRvb39IsNotNull() {
            addCriterion("RVB39 is not null");
            return (Criteria) this;
        }

        public Criteria andRvb39EqualTo(String value) {
            addCriterion("RVB39 =", value, "rvb39");
            return (Criteria) this;
        }

        public Criteria andRvb39NotEqualTo(String value) {
            addCriterion("RVB39 <>", value, "rvb39");
            return (Criteria) this;
        }

        public Criteria andRvb39GreaterThan(String value) {
            addCriterion("RVB39 >", value, "rvb39");
            return (Criteria) this;
        }

        public Criteria andRvb39GreaterThanOrEqualTo(String value) {
            addCriterion("RVB39 >=", value, "rvb39");
            return (Criteria) this;
        }

        public Criteria andRvb39LessThan(String value) {
            addCriterion("RVB39 <", value, "rvb39");
            return (Criteria) this;
        }

        public Criteria andRvb39LessThanOrEqualTo(String value) {
            addCriterion("RVB39 <=", value, "rvb39");
            return (Criteria) this;
        }

        public Criteria andRvb39Like(String value) {
            addCriterion("RVB39 like", value, "rvb39");
            return (Criteria) this;
        }

        public Criteria andRvb39NotLike(String value) {
            addCriterion("RVB39 not like", value, "rvb39");
            return (Criteria) this;
        }

        public Criteria andRvb39In(List<String> values) {
            addCriterion("RVB39 in", values, "rvb39");
            return (Criteria) this;
        }

        public Criteria andRvb39NotIn(List<String> values) {
            addCriterion("RVB39 not in", values, "rvb39");
            return (Criteria) this;
        }

        public Criteria andRvb39Between(String value1, String value2) {
            addCriterion("RVB39 between", value1, value2, "rvb39");
            return (Criteria) this;
        }

        public Criteria andRvb39NotBetween(String value1, String value2) {
            addCriterion("RVB39 not between", value1, value2, "rvb39");
            return (Criteria) this;
        }

        public Criteria andRvv17IsNull() {
            addCriterion("RVV17 is null");
            return (Criteria) this;
        }

        public Criteria andRvv17IsNotNull() {
            addCriterion("RVV17 is not null");
            return (Criteria) this;
        }

        public Criteria andRvv17EqualTo(BigDecimal value) {
            addCriterion("RVV17 =", value, "rvv17");
            return (Criteria) this;
        }

        public Criteria andRvv17NotEqualTo(BigDecimal value) {
            addCriterion("RVV17 <>", value, "rvv17");
            return (Criteria) this;
        }

        public Criteria andRvv17GreaterThan(BigDecimal value) {
            addCriterion("RVV17 >", value, "rvv17");
            return (Criteria) this;
        }

        public Criteria andRvv17GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RVV17 >=", value, "rvv17");
            return (Criteria) this;
        }

        public Criteria andRvv17LessThan(BigDecimal value) {
            addCriterion("RVV17 <", value, "rvv17");
            return (Criteria) this;
        }

        public Criteria andRvv17LessThanOrEqualTo(BigDecimal value) {
            addCriterion("RVV17 <=", value, "rvv17");
            return (Criteria) this;
        }

        public Criteria andRvv17In(List<BigDecimal> values) {
            addCriterion("RVV17 in", values, "rvv17");
            return (Criteria) this;
        }

        public Criteria andRvv17NotIn(List<BigDecimal> values) {
            addCriterion("RVV17 not in", values, "rvv17");
            return (Criteria) this;
        }

        public Criteria andRvv17Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("RVV17 between", value1, value2, "rvv17");
            return (Criteria) this;
        }

        public Criteria andRvv17NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RVV17 not between", value1, value2, "rvv17");
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