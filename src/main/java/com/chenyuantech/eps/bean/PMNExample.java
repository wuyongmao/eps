package com.chenyuantech.eps.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class PMNExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PMNExample() {
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

        public Criteria andPMN02IsNull() {
            addCriterion("PMN02 is null");
            return (Criteria) this;
        }

        public Criteria andPMN02IsNotNull() {
            addCriterion("PMN02 is not null");
            return (Criteria) this;
        }

        public Criteria andPMN02EqualTo(Integer value) {
            addCriterion("PMN02 =", value, "PMN02");
            return (Criteria) this;
        }

        public Criteria andPMN02NotEqualTo(Integer value) {
            addCriterion("PMN02 <>", value, "PMN02");
            return (Criteria) this;
        }

        public Criteria andPMN02GreaterThan(Integer value) {
            addCriterion("PMN02 >", value, "PMN02");
            return (Criteria) this;
        }

        public Criteria andPMN02GreaterThanOrEqualTo(Integer value) {
            addCriterion("PMN02 >=", value, "PMN02");
            return (Criteria) this;
        }

        public Criteria andPMN02LessThan(Integer value) {
            addCriterion("PMN02 <", value, "PMN02");
            return (Criteria) this;
        }

        public Criteria andPMN02LessThanOrEqualTo(Integer value) {
            addCriterion("PMN02 <=", value, "PMN02");
            return (Criteria) this;
        }

        public Criteria andPMN02In(List<Integer> values) {
            addCriterion("PMN02 in", values, "PMN02");
            return (Criteria) this;
        }

        public Criteria andPMN02NotIn(List<Integer> values) {
            addCriterion("PMN02 not in", values, "PMN02");
            return (Criteria) this;
        }

        public Criteria andPMN02Between(Integer value1, Integer value2) {
            addCriterion("PMN02 between", value1, value2, "PMN02");
            return (Criteria) this;
        }

        public Criteria andPMN02NotBetween(Integer value1, Integer value2) {
            addCriterion("PMN02 not between", value1, value2, "PMN02");
            return (Criteria) this;
        }

        public Criteria andPMN24IsNull() {
            addCriterion("PMN24 is null");
            return (Criteria) this;
        }

        public Criteria andPMN24IsNotNull() {
            addCriterion("PMN24 is not null");
            return (Criteria) this;
        }

        public Criteria andPMN24EqualTo(String value) {
            addCriterion("PMN24 =", value, "PMN24");
            return (Criteria) this;
        }

        public Criteria andPMN24NotEqualTo(String value) {
            addCriterion("PMN24 <>", value, "PMN24");
            return (Criteria) this;
        }

        public Criteria andPMN24GreaterThan(String value) {
            addCriterion("PMN24 >", value, "PMN24");
            return (Criteria) this;
        }

        public Criteria andPMN24GreaterThanOrEqualTo(String value) {
            addCriterion("PMN24 >=", value, "PMN24");
            return (Criteria) this;
        }

        public Criteria andPMN24LessThan(String value) {
            addCriterion("PMN24 <", value, "PMN24");
            return (Criteria) this;
        }

        public Criteria andPMN24LessThanOrEqualTo(String value) {
            addCriterion("PMN24 <=", value, "PMN24");
            return (Criteria) this;
        }

        public Criteria andPMN24Like(String value) {
            addCriterion("PMN24 like", value, "PMN24");
            return (Criteria) this;
        }

        public Criteria andPMN24NotLike(String value) {
            addCriterion("PMN24 not like", value, "PMN24");
            return (Criteria) this;
        }

        public Criteria andPMN24In(List<String> values) {
            addCriterion("PMN24 in", values, "PMN24");
            return (Criteria) this;
        }

        public Criteria andPMN24NotIn(List<String> values) {
            addCriterion("PMN24 not in", values, "PMN24");
            return (Criteria) this;
        }

        public Criteria andPMN24Between(String value1, String value2) {
            addCriterion("PMN24 between", value1, value2, "PMN24");
            return (Criteria) this;
        }

        public Criteria andPMN24NotBetween(String value1, String value2) {
            addCriterion("PMN24 not between", value1, value2, "PMN24");
            return (Criteria) this;
        }

        public Criteria andPMN25IsNull() {
            addCriterion("PMN25 is null");
            return (Criteria) this;
        }

        public Criteria andPMN25IsNotNull() {
            addCriterion("PMN25 is not null");
            return (Criteria) this;
        }

        public Criteria andPMN25EqualTo(String value) {
            addCriterion("PMN25 =", value, "PMN25");
            return (Criteria) this;
        }

        public Criteria andPMN25NotEqualTo(String value) {
            addCriterion("PMN25 <>", value, "PMN25");
            return (Criteria) this;
        }

        public Criteria andPMN25GreaterThan(String value) {
            addCriterion("PMN25 >", value, "PMN25");
            return (Criteria) this;
        }

        public Criteria andPMN25GreaterThanOrEqualTo(String value) {
            addCriterion("PMN25 >=", value, "PMN25");
            return (Criteria) this;
        }

        public Criteria andPMN25LessThan(String value) {
            addCriterion("PMN25 <", value, "PMN25");
            return (Criteria) this;
        }

        public Criteria andPMN25LessThanOrEqualTo(String value) {
            addCriterion("PMN25 <=", value, "PMN25");
            return (Criteria) this;
        }

        public Criteria andPMN25Like(String value) {
            addCriterion("PMN25 like", value, "PMN25");
            return (Criteria) this;
        }

        public Criteria andPMN25NotLike(String value) {
            addCriterion("PMN25 not like", value, "PMN25");
            return (Criteria) this;
        }

        public Criteria andPMN25In(List<String> values) {
            addCriterion("PMN25 in", values, "PMN25");
            return (Criteria) this;
        }

        public Criteria andPMN25NotIn(List<String> values) {
            addCriterion("PMN25 not in", values, "PMN25");
            return (Criteria) this;
        }

        public Criteria andPMN25Between(String value1, String value2) {
            addCriterion("PMN25 between", value1, value2, "PMN25");
            return (Criteria) this;
        }

        public Criteria andPMN25NotBetween(String value1, String value2) {
            addCriterion("PMN25 not between", value1, value2, "PMN25");
            return (Criteria) this;
        }

        public Criteria andTA_PMN05IsNull() {
            addCriterion("TA_PMN05 is null");
            return (Criteria) this;
        }

        public Criteria andTA_PMN05IsNotNull() {
            addCriterion("TA_PMN05 is not null");
            return (Criteria) this;
        }

        public Criteria andTA_PMN05EqualTo(String value) {
            addCriterion("TA_PMN05 =", value, "TA_PMN05");
            return (Criteria) this;
        }

        public Criteria andTA_PMN05NotEqualTo(String value) {
            addCriterion("TA_PMN05 <>", value, "TA_PMN05");
            return (Criteria) this;
        }

        public Criteria andTA_PMN05GreaterThan(String value) {
            addCriterion("TA_PMN05 >", value, "TA_PMN05");
            return (Criteria) this;
        }

        public Criteria andTA_PMN05GreaterThanOrEqualTo(String value) {
            addCriterion("TA_PMN05 >=", value, "TA_PMN05");
            return (Criteria) this;
        }

        public Criteria andTA_PMN05LessThan(String value) {
            addCriterion("TA_PMN05 <", value, "TA_PMN05");
            return (Criteria) this;
        }

        public Criteria andTA_PMN05LessThanOrEqualTo(String value) {
            addCriterion("TA_PMN05 <=", value, "TA_PMN05");
            return (Criteria) this;
        }

        public Criteria andTA_PMN05Like(String value) {
            addCriterion("TA_PMN05 like", value, "TA_PMN05");
            return (Criteria) this;
        }

        public Criteria andTA_PMN05NotLike(String value) {
            addCriterion("TA_PMN05 not like", value, "TA_PMN05");
            return (Criteria) this;
        }

        public Criteria andTA_PMN05In(List<String> values) {
            addCriterion("TA_PMN05 in", values, "TA_PMN05");
            return (Criteria) this;
        }

        public Criteria andTA_PMN05NotIn(List<String> values) {
            addCriterion("TA_PMN05 not in", values, "TA_PMN05");
            return (Criteria) this;
        }

        public Criteria andTA_PMN05Between(String value1, String value2) {
            addCriterion("TA_PMN05 between", value1, value2, "TA_PMN05");
            return (Criteria) this;
        }

        public Criteria andTA_PMN05NotBetween(String value1, String value2) {
            addCriterion("TA_PMN05 not between", value1, value2, "TA_PMN05");
            return (Criteria) this;
        }

        public Criteria andTA_PMN05_DSIsNull() {
            addCriterion("TA_PMN05_DS is null");
            return (Criteria) this;
        }

        public Criteria andTA_PMN05_DSIsNotNull() {
            addCriterion("TA_PMN05_DS is not null");
            return (Criteria) this;
        }

        public Criteria andTA_PMN05_DSEqualTo(String value) {
            addCriterion("TA_PMN05_DS =", value, "TA_PMN05_DS");
            return (Criteria) this;
        }

        public Criteria andTA_PMN05_DSNotEqualTo(String value) {
            addCriterion("TA_PMN05_DS <>", value, "TA_PMN05_DS");
            return (Criteria) this;
        }

        public Criteria andTA_PMN05_DSGreaterThan(String value) {
            addCriterion("TA_PMN05_DS >", value, "TA_PMN05_DS");
            return (Criteria) this;
        }

        public Criteria andTA_PMN05_DSGreaterThanOrEqualTo(String value) {
            addCriterion("TA_PMN05_DS >=", value, "TA_PMN05_DS");
            return (Criteria) this;
        }

        public Criteria andTA_PMN05_DSLessThan(String value) {
            addCriterion("TA_PMN05_DS <", value, "TA_PMN05_DS");
            return (Criteria) this;
        }

        public Criteria andTA_PMN05_DSLessThanOrEqualTo(String value) {
            addCriterion("TA_PMN05_DS <=", value, "TA_PMN05_DS");
            return (Criteria) this;
        }

        public Criteria andTA_PMN05_DSLike(String value) {
            addCriterion("TA_PMN05_DS like", value, "TA_PMN05_DS");
            return (Criteria) this;
        }

        public Criteria andTA_PMN05_DSNotLike(String value) {
            addCriterion("TA_PMN05_DS not like", value, "TA_PMN05_DS");
            return (Criteria) this;
        }

        public Criteria andTA_PMN05_DSIn(List<String> values) {
            addCriterion("TA_PMN05_DS in", values, "TA_PMN05_DS");
            return (Criteria) this;
        }

        public Criteria andTA_PMN05_DSNotIn(List<String> values) {
            addCriterion("TA_PMN05_DS not in", values, "TA_PMN05_DS");
            return (Criteria) this;
        }

        public Criteria andTA_PMN05_DSBetween(String value1, String value2) {
            addCriterion("TA_PMN05_DS between", value1, value2, "TA_PMN05_DS");
            return (Criteria) this;
        }

        public Criteria andTA_PMN05_DSNotBetween(String value1, String value2) {
            addCriterion("TA_PMN05_DS not between", value1, value2, "TA_PMN05_DS");
            return (Criteria) this;
        }

        public Criteria andPMN16IsNull() {
            addCriterion("PMN16 is null");
            return (Criteria) this;
        }

        public Criteria andPMN16IsNotNull() {
            addCriterion("PMN16 is not null");
            return (Criteria) this;
        }

        public Criteria andPMN16EqualTo(String value) {
            addCriterion("PMN16 =", value, "PMN16");
            return (Criteria) this;
        }

        public Criteria andPMN16NotEqualTo(String value) {
            addCriterion("PMN16 <>", value, "PMN16");
            return (Criteria) this;
        }

        public Criteria andPMN16GreaterThan(String value) {
            addCriterion("PMN16 >", value, "PMN16");
            return (Criteria) this;
        }

        public Criteria andPMN16GreaterThanOrEqualTo(String value) {
            addCriterion("PMN16 >=", value, "PMN16");
            return (Criteria) this;
        }

        public Criteria andPMN16LessThan(String value) {
            addCriterion("PMN16 <", value, "PMN16");
            return (Criteria) this;
        }

        public Criteria andPMN16LessThanOrEqualTo(String value) {
            addCriterion("PMN16 <=", value, "PMN16");
            return (Criteria) this;
        }

        public Criteria andPMN16Like(String value) {
            addCriterion("PMN16 like", value, "PMN16");
            return (Criteria) this;
        }

        public Criteria andPMN16NotLike(String value) {
            addCriterion("PMN16 not like", value, "PMN16");
            return (Criteria) this;
        }

        public Criteria andPMN16In(List<String> values) {
            addCriterion("PMN16 in", values, "PMN16");
            return (Criteria) this;
        }

        public Criteria andPMN16NotIn(List<String> values) {
            addCriterion("PMN16 not in", values, "PMN16");
            return (Criteria) this;
        }

        public Criteria andPMN16Between(String value1, String value2) {
            addCriterion("PMN16 between", value1, value2, "PMN16");
            return (Criteria) this;
        }

        public Criteria andPMN16NotBetween(String value1, String value2) {
            addCriterion("PMN16 not between", value1, value2, "PMN16");
            return (Criteria) this;
        }

        public Criteria andPMNUD13IsNull() {
            addCriterion("PMNUD13 is null");
            return (Criteria) this;
        }

        public Criteria andPMNUD13IsNotNull() {
            addCriterion("PMNUD13 is not null");
            return (Criteria) this;
        }

        public Criteria andPMNUD13EqualTo(String value) {
            addCriterion("PMNUD13 =", value, "PMNUD13");
            return (Criteria) this;
        }

        public Criteria andPMNUD13NotEqualTo(String value) {
            addCriterion("PMNUD13 <>", value, "PMNUD13");
            return (Criteria) this;
        }

        public Criteria andPMNUD13GreaterThan(String value) {
            addCriterion("PMNUD13 >", value, "PMNUD13");
            return (Criteria) this;
        }

        public Criteria andPMNUD13GreaterThanOrEqualTo(String value) {
            addCriterion("PMNUD13 >=", value, "PMNUD13");
            return (Criteria) this;
        }

        public Criteria andPMNUD13LessThan(String value) {
            addCriterion("PMNUD13 <", value, "PMNUD13");
            return (Criteria) this;
        }

        public Criteria andPMNUD13LessThanOrEqualTo(String value) {
            addCriterion("PMNUD13 <=", value, "PMNUD13");
            return (Criteria) this;
        }

        public Criteria andPMNUD13Like(String value) {
            addCriterion("PMNUD13 like", value, "PMNUD13");
            return (Criteria) this;
        }

        public Criteria andPMNUD13NotLike(String value) {
            addCriterion("PMNUD13 not like", value, "PMNUD13");
            return (Criteria) this;
        }

        public Criteria andPMNUD13In(List<String> values) {
            addCriterion("PMNUD13 in", values, "PMNUD13");
            return (Criteria) this;
        }

        public Criteria andPMNUD13NotIn(List<String> values) {
            addCriterion("PMNUD13 not in", values, "PMNUD13");
            return (Criteria) this;
        }

        public Criteria andPMNUD13Between(String value1, String value2) {
            addCriterion("PMNUD13 between", value1, value2, "PMNUD13");
            return (Criteria) this;
        }

        public Criteria andPMNUD13NotBetween(String value1, String value2) {
            addCriterion("PMNUD13 not between", value1, value2, "PMNUD13");
            return (Criteria) this;
        }

        public Criteria andGEN02YIsNull() {
            addCriterion("GEN02Y is null");
            return (Criteria) this;
        }

        public Criteria andGEN02YIsNotNull() {
            addCriterion("GEN02Y is not null");
            return (Criteria) this;
        }

        public Criteria andGEN02YEqualTo(String value) {
            addCriterion("GEN02Y =", value, "GEN02Y");
            return (Criteria) this;
        }

        public Criteria andGEN02YNotEqualTo(String value) {
            addCriterion("GEN02Y <>", value, "GEN02Y");
            return (Criteria) this;
        }

        public Criteria andGEN02YGreaterThan(String value) {
            addCriterion("GEN02Y >", value, "GEN02Y");
            return (Criteria) this;
        }

        public Criteria andGEN02YGreaterThanOrEqualTo(String value) {
            addCriterion("GEN02Y >=", value, "GEN02Y");
            return (Criteria) this;
        }

        public Criteria andGEN02YLessThan(String value) {
            addCriterion("GEN02Y <", value, "GEN02Y");
            return (Criteria) this;
        }

        public Criteria andGEN02YLessThanOrEqualTo(String value) {
            addCriterion("GEN02Y <=", value, "GEN02Y");
            return (Criteria) this;
        }

        public Criteria andGEN02YLike(String value) {
            addCriterion("GEN02Y like", value, "GEN02Y");
            return (Criteria) this;
        }

        public Criteria andGEN02YNotLike(String value) {
            addCriterion("GEN02Y not like", value, "GEN02Y");
            return (Criteria) this;
        }

        public Criteria andGEN02YIn(List<String> values) {
            addCriterion("GEN02Y in", values, "GEN02Y");
            return (Criteria) this;
        }

        public Criteria andGEN02YNotIn(List<String> values) {
            addCriterion("GEN02Y not in", values, "GEN02Y");
            return (Criteria) this;
        }

        public Criteria andGEN02YBetween(String value1, String value2) {
            addCriterion("GEN02Y between", value1, value2, "GEN02Y");
            return (Criteria) this;
        }

        public Criteria andGEN02YNotBetween(String value1, String value2) {
            addCriterion("GEN02Y not between", value1, value2, "GEN02Y");
            return (Criteria) this;
        }

        public Criteria andPMN04IsNull() {
            addCriterion("PMN04 is null");
            return (Criteria) this;
        }

        public Criteria andPMN04IsNotNull() {
            addCriterion("PMN04 is not null");
            return (Criteria) this;
        }

        public Criteria andPMN04EqualTo(String value) {
            addCriterion("PMN04 =", value, "PMN04");
            return (Criteria) this;
        }

        public Criteria andPMN04NotEqualTo(String value) {
            addCriterion("PMN04 <>", value, "PMN04");
            return (Criteria) this;
        }

        public Criteria andPMN04GreaterThan(String value) {
            addCriterion("PMN04 >", value, "PMN04");
            return (Criteria) this;
        }

        public Criteria andPMN04GreaterThanOrEqualTo(String value) {
            addCriterion("PMN04 >=", value, "PMN04");
            return (Criteria) this;
        }

        public Criteria andPMN04LessThan(String value) {
            addCriterion("PMN04 <", value, "PMN04");
            return (Criteria) this;
        }

        public Criteria andPMN04LessThanOrEqualTo(String value) {
            addCriterion("PMN04 <=", value, "PMN04");
            return (Criteria) this;
        }

        public Criteria andPMN04Like(String value) {
            addCriterion("PMN04 like", value, "PMN04");
            return (Criteria) this;
        }

        public Criteria andPMN04NotLike(String value) {
            addCriterion("PMN04 not like", value, "PMN04");
            return (Criteria) this;
        }

        public Criteria andPMN04In(List<String> values) {
            addCriterion("PMN04 in", values, "PMN04");
            return (Criteria) this;
        }

        public Criteria andPMN04NotIn(List<String> values) {
            addCriterion("PMN04 not in", values, "PMN04");
            return (Criteria) this;
        }

        public Criteria andPMN04Between(String value1, String value2) {
            addCriterion("PMN04 between", value1, value2, "PMN04");
            return (Criteria) this;
        }

        public Criteria andPMN04NotBetween(String value1, String value2) {
            addCriterion("PMN04 not between", value1, value2, "PMN04");
            return (Criteria) this;
        }

        public Criteria andPMN041IsNull() {
            addCriterion("PMN041 is null");
            return (Criteria) this;
        }

        public Criteria andPMN041IsNotNull() {
            addCriterion("PMN041 is not null");
            return (Criteria) this;
        }

        public Criteria andPMN041EqualTo(String value) {
            addCriterion("PMN041 =", value, "PMN041");
            return (Criteria) this;
        }

        public Criteria andPMN041NotEqualTo(String value) {
            addCriterion("PMN041 <>", value, "PMN041");
            return (Criteria) this;
        }

        public Criteria andPMN041GreaterThan(String value) {
            addCriterion("PMN041 >", value, "PMN041");
            return (Criteria) this;
        }

        public Criteria andPMN041GreaterThanOrEqualTo(String value) {
            addCriterion("PMN041 >=", value, "PMN041");
            return (Criteria) this;
        }

        public Criteria andPMN041LessThan(String value) {
            addCriterion("PMN041 <", value, "PMN041");
            return (Criteria) this;
        }

        public Criteria andPMN041LessThanOrEqualTo(String value) {
            addCriterion("PMN041 <=", value, "PMN041");
            return (Criteria) this;
        }

        public Criteria andPMN041Like(String value) {
            addCriterion("PMN041 like", value, "PMN041");
            return (Criteria) this;
        }

        public Criteria andPMN041NotLike(String value) {
            addCriterion("PMN041 not like", value, "PMN041");
            return (Criteria) this;
        }

        public Criteria andPMN041In(List<String> values) {
            addCriterion("PMN041 in", values, "PMN041");
            return (Criteria) this;
        }

        public Criteria andPMN041NotIn(List<String> values) {
            addCriterion("PMN041 not in", values, "PMN041");
            return (Criteria) this;
        }

        public Criteria andPMN041Between(String value1, String value2) {
            addCriterion("PMN041 between", value1, value2, "PMN041");
            return (Criteria) this;
        }

        public Criteria andPMN041NotBetween(String value1, String value2) {
            addCriterion("PMN041 not between", value1, value2, "PMN041");
            return (Criteria) this;
        }

        public Criteria andIMA021IsNull() {
            addCriterion("IMA021 is null");
            return (Criteria) this;
        }

        public Criteria andIMA021IsNotNull() {
            addCriterion("IMA021 is not null");
            return (Criteria) this;
        }

        public Criteria andIMA021EqualTo(String value) {
            addCriterion("IMA021 =", value, "IMA021");
            return (Criteria) this;
        }

        public Criteria andIMA021NotEqualTo(String value) {
            addCriterion("IMA021 <>", value, "IMA021");
            return (Criteria) this;
        }

        public Criteria andIMA021GreaterThan(String value) {
            addCriterion("IMA021 >", value, "IMA021");
            return (Criteria) this;
        }

        public Criteria andIMA021GreaterThanOrEqualTo(String value) {
            addCriterion("IMA021 >=", value, "IMA021");
            return (Criteria) this;
        }

        public Criteria andIMA021LessThan(String value) {
            addCriterion("IMA021 <", value, "IMA021");
            return (Criteria) this;
        }

        public Criteria andIMA021LessThanOrEqualTo(String value) {
            addCriterion("IMA021 <=", value, "IMA021");
            return (Criteria) this;
        }

        public Criteria andIMA021Like(String value) {
            addCriterion("IMA021 like", value, "IMA021");
            return (Criteria) this;
        }

        public Criteria andIMA021NotLike(String value) {
            addCriterion("IMA021 not like", value, "IMA021");
            return (Criteria) this;
        }

        public Criteria andIMA021In(List<String> values) {
            addCriterion("IMA021 in", values, "IMA021");
            return (Criteria) this;
        }

        public Criteria andIMA021NotIn(List<String> values) {
            addCriterion("IMA021 not in", values, "IMA021");
            return (Criteria) this;
        }

        public Criteria andIMA021Between(String value1, String value2) {
            addCriterion("IMA021 between", value1, value2, "IMA021");
            return (Criteria) this;
        }

        public Criteria andIMA021NotBetween(String value1, String value2) {
            addCriterion("IMA021 not between", value1, value2, "IMA021");
            return (Criteria) this;
        }

        public Criteria andPMN07IsNull() {
            addCriterion("PMN07 is null");
            return (Criteria) this;
        }

        public Criteria andPMN07IsNotNull() {
            addCriterion("PMN07 is not null");
            return (Criteria) this;
        }

        public Criteria andPMN07EqualTo(String value) {
            addCriterion("PMN07 =", value, "PMN07");
            return (Criteria) this;
        }

        public Criteria andPMN07NotEqualTo(String value) {
            addCriterion("PMN07 <>", value, "PMN07");
            return (Criteria) this;
        }

        public Criteria andPMN07GreaterThan(String value) {
            addCriterion("PMN07 >", value, "PMN07");
            return (Criteria) this;
        }

        public Criteria andPMN07GreaterThanOrEqualTo(String value) {
            addCriterion("PMN07 >=", value, "PMN07");
            return (Criteria) this;
        }

        public Criteria andPMN07LessThan(String value) {
            addCriterion("PMN07 <", value, "PMN07");
            return (Criteria) this;
        }

        public Criteria andPMN07LessThanOrEqualTo(String value) {
            addCriterion("PMN07 <=", value, "PMN07");
            return (Criteria) this;
        }

        public Criteria andPMN07Like(String value) {
            addCriterion("PMN07 like", value, "PMN07");
            return (Criteria) this;
        }

        public Criteria andPMN07NotLike(String value) {
            addCriterion("PMN07 not like", value, "PMN07");
            return (Criteria) this;
        }

        public Criteria andPMN07In(List<String> values) {
            addCriterion("PMN07 in", values, "PMN07");
            return (Criteria) this;
        }

        public Criteria andPMN07NotIn(List<String> values) {
            addCriterion("PMN07 not in", values, "PMN07");
            return (Criteria) this;
        }

        public Criteria andPMN07Between(String value1, String value2) {
            addCriterion("PMN07 between", value1, value2, "PMN07");
            return (Criteria) this;
        }

        public Criteria andPMN07NotBetween(String value1, String value2) {
            addCriterion("PMN07 not between", value1, value2, "PMN07");
            return (Criteria) this;
        }

        public Criteria andPMNUD05IsNull() {
            addCriterion("PMNUD05 is null");
            return (Criteria) this;
        }

        public Criteria andPMNUD05IsNotNull() {
            addCriterion("PMNUD05 is not null");
            return (Criteria) this;
        }

        public Criteria andPMNUD05EqualTo(String value) {
            addCriterion("PMNUD05 =", value, "PMNUD05");
            return (Criteria) this;
        }

        public Criteria andPMNUD05NotEqualTo(String value) {
            addCriterion("PMNUD05 <>", value, "PMNUD05");
            return (Criteria) this;
        }

        public Criteria andPMNUD05GreaterThan(String value) {
            addCriterion("PMNUD05 >", value, "PMNUD05");
            return (Criteria) this;
        }

        public Criteria andPMNUD05GreaterThanOrEqualTo(String value) {
            addCriterion("PMNUD05 >=", value, "PMNUD05");
            return (Criteria) this;
        }

        public Criteria andPMNUD05LessThan(String value) {
            addCriterion("PMNUD05 <", value, "PMNUD05");
            return (Criteria) this;
        }

        public Criteria andPMNUD05LessThanOrEqualTo(String value) {
            addCriterion("PMNUD05 <=", value, "PMNUD05");
            return (Criteria) this;
        }

        public Criteria andPMNUD05Like(String value) {
            addCriterion("PMNUD05 like", value, "PMNUD05");
            return (Criteria) this;
        }

        public Criteria andPMNUD05NotLike(String value) {
            addCriterion("PMNUD05 not like", value, "PMNUD05");
            return (Criteria) this;
        }

        public Criteria andPMNUD05In(List<String> values) {
            addCriterion("PMNUD05 in", values, "PMNUD05");
            return (Criteria) this;
        }

        public Criteria andPMNUD05NotIn(List<String> values) {
            addCriterion("PMNUD05 not in", values, "PMNUD05");
            return (Criteria) this;
        }

        public Criteria andPMNUD05Between(String value1, String value2) {
            addCriterion("PMNUD05 between", value1, value2, "PMNUD05");
            return (Criteria) this;
        }

        public Criteria andPMNUD05NotBetween(String value1, String value2) {
            addCriterion("PMNUD05 not between", value1, value2, "PMNUD05");
            return (Criteria) this;
        }

        public Criteria andPMNUD05_DSIsNull() {
            addCriterion("PMNUD05_DS is null");
            return (Criteria) this;
        }

        public Criteria andPMNUD05_DSIsNotNull() {
            addCriterion("PMNUD05_DS is not null");
            return (Criteria) this;
        }

        public Criteria andPMNUD05_DSEqualTo(String value) {
            addCriterion("PMNUD05_DS =", value, "PMNUD05_DS");
            return (Criteria) this;
        }

        public Criteria andPMNUD05_DSNotEqualTo(String value) {
            addCriterion("PMNUD05_DS <>", value, "PMNUD05_DS");
            return (Criteria) this;
        }

        public Criteria andPMNUD05_DSGreaterThan(String value) {
            addCriterion("PMNUD05_DS >", value, "PMNUD05_DS");
            return (Criteria) this;
        }

        public Criteria andPMNUD05_DSGreaterThanOrEqualTo(String value) {
            addCriterion("PMNUD05_DS >=", value, "PMNUD05_DS");
            return (Criteria) this;
        }

        public Criteria andPMNUD05_DSLessThan(String value) {
            addCriterion("PMNUD05_DS <", value, "PMNUD05_DS");
            return (Criteria) this;
        }

        public Criteria andPMNUD05_DSLessThanOrEqualTo(String value) {
            addCriterion("PMNUD05_DS <=", value, "PMNUD05_DS");
            return (Criteria) this;
        }

        public Criteria andPMNUD05_DSLike(String value) {
            addCriterion("PMNUD05_DS like", value, "PMNUD05_DS");
            return (Criteria) this;
        }

        public Criteria andPMNUD05_DSNotLike(String value) {
            addCriterion("PMNUD05_DS not like", value, "PMNUD05_DS");
            return (Criteria) this;
        }

        public Criteria andPMNUD05_DSIn(List<String> values) {
            addCriterion("PMNUD05_DS in", values, "PMNUD05_DS");
            return (Criteria) this;
        }

        public Criteria andPMNUD05_DSNotIn(List<String> values) {
            addCriterion("PMNUD05_DS not in", values, "PMNUD05_DS");
            return (Criteria) this;
        }

        public Criteria andPMNUD05_DSBetween(String value1, String value2) {
            addCriterion("PMNUD05_DS between", value1, value2, "PMNUD05_DS");
            return (Criteria) this;
        }

        public Criteria andPMNUD05_DSNotBetween(String value1, String value2) {
            addCriterion("PMNUD05_DS not between", value1, value2, "PMNUD05_DS");
            return (Criteria) this;
        }

        public Criteria andPMN20IsNull() {
            addCriterion("PMN20 is null");
            return (Criteria) this;
        }

        public Criteria andPMN20IsNotNull() {
            addCriterion("PMN20 is not null");
            return (Criteria) this;
        }

        public Criteria andPMN20EqualTo(BigDecimal value) {
            addCriterion("PMN20 =", value, "PMN20");
            return (Criteria) this;
        }

        public Criteria andPMN20NotEqualTo(BigDecimal value) {
            addCriterion("PMN20 <>", value, "PMN20");
            return (Criteria) this;
        }

        public Criteria andPMN20GreaterThan(BigDecimal value) {
            addCriterion("PMN20 >", value, "PMN20");
            return (Criteria) this;
        }

        public Criteria andPMN20GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PMN20 >=", value, "PMN20");
            return (Criteria) this;
        }

        public Criteria andPMN20LessThan(BigDecimal value) {
            addCriterion("PMN20 <", value, "PMN20");
            return (Criteria) this;
        }

        public Criteria andPMN20LessThanOrEqualTo(BigDecimal value) {
            addCriterion("PMN20 <=", value, "PMN20");
            return (Criteria) this;
        }

        public Criteria andPMN20In(List<BigDecimal> values) {
            addCriterion("PMN20 in", values, "PMN20");
            return (Criteria) this;
        }

        public Criteria andPMN20NotIn(List<BigDecimal> values) {
            addCriterion("PMN20 not in", values, "PMN20");
            return (Criteria) this;
        }

        public Criteria andPMN20Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("PMN20 between", value1, value2, "PMN20");
            return (Criteria) this;
        }

        public Criteria andPMN20NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PMN20 not between", value1, value2, "PMN20");
            return (Criteria) this;
        }

        public Criteria andCJLIsNull() {
            addCriterion("CJL is null");
            return (Criteria) this;
        }

        public Criteria andCJLIsNotNull() {
            addCriterion("CJL is not null");
            return (Criteria) this;
        }

        public Criteria andCJLEqualTo(String value) {
            addCriterion("CJL =", value, "CJL");
            return (Criteria) this;
        }

        public Criteria andCJLNotEqualTo(String value) {
            addCriterion("CJL <>", value, "CJL");
            return (Criteria) this;
        }

        public Criteria andCJLGreaterThan(String value) {
            addCriterion("CJL >", value, "CJL");
            return (Criteria) this;
        }

        public Criteria andCJLGreaterThanOrEqualTo(String value) {
            addCriterion("CJL >=", value, "CJL");
            return (Criteria) this;
        }

        public Criteria andCJLLessThan(String value) {
            addCriterion("CJL <", value, "CJL");
            return (Criteria) this;
        }

        public Criteria andCJLLessThanOrEqualTo(String value) {
            addCriterion("CJL <=", value, "CJL");
            return (Criteria) this;
        }

        public Criteria andCJLLike(String value) {
            addCriterion("CJL like", value, "CJL");
            return (Criteria) this;
        }

        public Criteria andCJLNotLike(String value) {
            addCriterion("CJL not like", value, "CJL");
            return (Criteria) this;
        }

        public Criteria andCJLIn(List<String> values) {
            addCriterion("CJL in", values, "CJL");
            return (Criteria) this;
        }

        public Criteria andCJLNotIn(List<String> values) {
            addCriterion("CJL not in", values, "CJL");
            return (Criteria) this;
        }

        public Criteria andCJLBetween(String value1, String value2) {
            addCriterion("CJL between", value1, value2, "CJL");
            return (Criteria) this;
        }

        public Criteria andCJLNotBetween(String value1, String value2) {
            addCriterion("CJL not between", value1, value2, "CJL");
            return (Criteria) this;
        }

        public Criteria andPMN86IsNull() {
            addCriterion("PMN86 is null");
            return (Criteria) this;
        }

        public Criteria andPMN86IsNotNull() {
            addCriterion("PMN86 is not null");
            return (Criteria) this;
        }

        public Criteria andPMN86EqualTo(String value) {
            addCriterion("PMN86 =", value, "PMN86");
            return (Criteria) this;
        }

        public Criteria andPMN86NotEqualTo(String value) {
            addCriterion("PMN86 <>", value, "PMN86");
            return (Criteria) this;
        }

        public Criteria andPMN86GreaterThan(String value) {
            addCriterion("PMN86 >", value, "PMN86");
            return (Criteria) this;
        }

        public Criteria andPMN86GreaterThanOrEqualTo(String value) {
            addCriterion("PMN86 >=", value, "PMN86");
            return (Criteria) this;
        }

        public Criteria andPMN86LessThan(String value) {
            addCriterion("PMN86 <", value, "PMN86");
            return (Criteria) this;
        }

        public Criteria andPMN86LessThanOrEqualTo(String value) {
            addCriterion("PMN86 <=", value, "PMN86");
            return (Criteria) this;
        }

        public Criteria andPMN86Like(String value) {
            addCriterion("PMN86 like", value, "PMN86");
            return (Criteria) this;
        }

        public Criteria andPMN86NotLike(String value) {
            addCriterion("PMN86 not like", value, "PMN86");
            return (Criteria) this;
        }

        public Criteria andPMN86In(List<String> values) {
            addCriterion("PMN86 in", values, "PMN86");
            return (Criteria) this;
        }

        public Criteria andPMN86NotIn(List<String> values) {
            addCriterion("PMN86 not in", values, "PMN86");
            return (Criteria) this;
        }

        public Criteria andPMN86Between(String value1, String value2) {
            addCriterion("PMN86 between", value1, value2, "PMN86");
            return (Criteria) this;
        }

        public Criteria andPMN86NotBetween(String value1, String value2) {
            addCriterion("PMN86 not between", value1, value2, "PMN86");
            return (Criteria) this;
        }

        public Criteria andPMN33IsNull() {
            addCriterion("PMN33 is null");
            return (Criteria) this;
        }

        public Criteria andPMN33IsNotNull() {
            addCriterion("PMN33 is not null");
            return (Criteria) this;
        }

        public Criteria andPMN33EqualTo(String value) {
            addCriterion("PMN33 =", value, "PMN33");
            return (Criteria) this;
        }

        public Criteria andPMN33NotEqualTo(String value) {
            addCriterion("PMN33 <>", value, "PMN33");
            return (Criteria) this;
        }

        public Criteria andPMN33GreaterThan(String value) {
            addCriterion("PMN33 >", value, "PMN33");
            return (Criteria) this;
        }

        public Criteria andPMN33GreaterThanOrEqualTo(String value) {
            addCriterion("PMN33 >=", value, "PMN33");
            return (Criteria) this;
        }

        public Criteria andPMN33LessThan(String value) {
            addCriterion("PMN33 <", value, "PMN33");
            return (Criteria) this;
        }

        public Criteria andPMN33LessThanOrEqualTo(String value) {
            addCriterion("PMN33 <=", value, "PMN33");
            return (Criteria) this;
        }

        public Criteria andPMN33Like(String value) {
            addCriterion("PMN33 like", value, "PMN33");
            return (Criteria) this;
        }

        public Criteria andPMN33NotLike(String value) {
            addCriterion("PMN33 not like", value, "PMN33");
            return (Criteria) this;
        }

        public Criteria andPMN33In(List<String> values) {
            addCriterion("PMN33 in", values, "PMN33");
            return (Criteria) this;
        }

        public Criteria andPMN33NotIn(List<String> values) {
            addCriterion("PMN33 not in", values, "PMN33");
            return (Criteria) this;
        }

        public Criteria andPMN33Between(String value1, String value2) {
            addCriterion("PMN33 between", value1, value2, "PMN33");
            return (Criteria) this;
        }

        public Criteria andPMN33NotBetween(String value1, String value2) {
            addCriterion("PMN33 not between", value1, value2, "PMN33");
            return (Criteria) this;
        }

        public Criteria andPMN34IsNull() {
            addCriterion("PMN34 is null");
            return (Criteria) this;
        }

        public Criteria andPMN34IsNotNull() {
            addCriterion("PMN34 is not null");
            return (Criteria) this;
        }

        public Criteria andPMN34EqualTo(String value) {
            addCriterion("PMN34 =", value, "PMN34");
            return (Criteria) this;
        }

        public Criteria andPMN34NotEqualTo(String value) {
            addCriterion("PMN34 <>", value, "PMN34");
            return (Criteria) this;
        }

        public Criteria andPMN34GreaterThan(String value) {
            addCriterion("PMN34 >", value, "PMN34");
            return (Criteria) this;
        }

        public Criteria andPMN34GreaterThanOrEqualTo(String value) {
            addCriterion("PMN34 >=", value, "PMN34");
            return (Criteria) this;
        }

        public Criteria andPMN34LessThan(String value) {
            addCriterion("PMN34 <", value, "PMN34");
            return (Criteria) this;
        }

        public Criteria andPMN34LessThanOrEqualTo(String value) {
            addCriterion("PMN34 <=", value, "PMN34");
            return (Criteria) this;
        }

        public Criteria andPMN34Like(String value) {
            addCriterion("PMN34 like", value, "PMN34");
            return (Criteria) this;
        }

        public Criteria andPMN34NotLike(String value) {
            addCriterion("PMN34 not like", value, "PMN34");
            return (Criteria) this;
        }

        public Criteria andPMN34In(List<String> values) {
            addCriterion("PMN34 in", values, "PMN34");
            return (Criteria) this;
        }

        public Criteria andPMN34NotIn(List<String> values) {
            addCriterion("PMN34 not in", values, "PMN34");
            return (Criteria) this;
        }

        public Criteria andPMN34Between(String value1, String value2) {
            addCriterion("PMN34 between", value1, value2, "PMN34");
            return (Criteria) this;
        }

        public Criteria andPMN34NotBetween(String value1, String value2) {
            addCriterion("PMN34 not between", value1, value2, "PMN34");
            return (Criteria) this;
        }

        public Criteria andPMN35IsNull() {
            addCriterion("PMN35 is null");
            return (Criteria) this;
        }

        public Criteria andPMN35IsNotNull() {
            addCriterion("PMN35 is not null");
            return (Criteria) this;
        }

        public Criteria andPMN35EqualTo(String value) {
            addCriterion("PMN35 =", value, "PMN35");
            return (Criteria) this;
        }

        public Criteria andPMN35NotEqualTo(String value) {
            addCriterion("PMN35 <>", value, "PMN35");
            return (Criteria) this;
        }

        public Criteria andPMN35GreaterThan(String value) {
            addCriterion("PMN35 >", value, "PMN35");
            return (Criteria) this;
        }

        public Criteria andPMN35GreaterThanOrEqualTo(String value) {
            addCriterion("PMN35 >=", value, "PMN35");
            return (Criteria) this;
        }

        public Criteria andPMN35LessThan(String value) {
            addCriterion("PMN35 <", value, "PMN35");
            return (Criteria) this;
        }

        public Criteria andPMN35LessThanOrEqualTo(String value) {
            addCriterion("PMN35 <=", value, "PMN35");
            return (Criteria) this;
        }

        public Criteria andPMN35Like(String value) {
            addCriterion("PMN35 like", value, "PMN35");
            return (Criteria) this;
        }

        public Criteria andPMN35NotLike(String value) {
            addCriterion("PMN35 not like", value, "PMN35");
            return (Criteria) this;
        }

        public Criteria andPMN35In(List<String> values) {
            addCriterion("PMN35 in", values, "PMN35");
            return (Criteria) this;
        }

        public Criteria andPMN35NotIn(List<String> values) {
            addCriterion("PMN35 not in", values, "PMN35");
            return (Criteria) this;
        }

        public Criteria andPMN35Between(String value1, String value2) {
            addCriterion("PMN35 between", value1, value2, "PMN35");
            return (Criteria) this;
        }

        public Criteria andPMN35NotBetween(String value1, String value2) {
            addCriterion("PMN35 not between", value1, value2, "PMN35");
            return (Criteria) this;
        }

        public Criteria andPMN67IsNull() {
            addCriterion("PMN67 is null");
            return (Criteria) this;
        }

        public Criteria andPMN67IsNotNull() {
            addCriterion("PMN67 is not null");
            return (Criteria) this;
        }

        public Criteria andPMN67EqualTo(String value) {
            addCriterion("PMN67 =", value, "PMN67");
            return (Criteria) this;
        }

        public Criteria andPMN67NotEqualTo(String value) {
            addCriterion("PMN67 <>", value, "PMN67");
            return (Criteria) this;
        }

        public Criteria andPMN67GreaterThan(String value) {
            addCriterion("PMN67 >", value, "PMN67");
            return (Criteria) this;
        }

        public Criteria andPMN67GreaterThanOrEqualTo(String value) {
            addCriterion("PMN67 >=", value, "PMN67");
            return (Criteria) this;
        }

        public Criteria andPMN67LessThan(String value) {
            addCriterion("PMN67 <", value, "PMN67");
            return (Criteria) this;
        }

        public Criteria andPMN67LessThanOrEqualTo(String value) {
            addCriterion("PMN67 <=", value, "PMN67");
            return (Criteria) this;
        }

        public Criteria andPMN67Like(String value) {
            addCriterion("PMN67 like", value, "PMN67");
            return (Criteria) this;
        }

        public Criteria andPMN67NotLike(String value) {
            addCriterion("PMN67 not like", value, "PMN67");
            return (Criteria) this;
        }

        public Criteria andPMN67In(List<String> values) {
            addCriterion("PMN67 in", values, "PMN67");
            return (Criteria) this;
        }

        public Criteria andPMN67NotIn(List<String> values) {
            addCriterion("PMN67 not in", values, "PMN67");
            return (Criteria) this;
        }

        public Criteria andPMN67Between(String value1, String value2) {
            addCriterion("PMN67 between", value1, value2, "PMN67");
            return (Criteria) this;
        }

        public Criteria andPMN67NotBetween(String value1, String value2) {
            addCriterion("PMN67 not between", value1, value2, "PMN67");
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

        public Criteria andPMNUD04IsNull() {
            addCriterion("PMNUD04 is null");
            return (Criteria) this;
        }

        public Criteria andPMNUD04IsNotNull() {
            addCriterion("PMNUD04 is not null");
            return (Criteria) this;
        }

        public Criteria andPMNUD04EqualTo(String value) {
            addCriterion("PMNUD04 =", value, "PMNUD04");
            return (Criteria) this;
        }

        public Criteria andPMNUD04NotEqualTo(String value) {
            addCriterion("PMNUD04 <>", value, "PMNUD04");
            return (Criteria) this;
        }

        public Criteria andPMNUD04GreaterThan(String value) {
            addCriterion("PMNUD04 >", value, "PMNUD04");
            return (Criteria) this;
        }

        public Criteria andPMNUD04GreaterThanOrEqualTo(String value) {
            addCriterion("PMNUD04 >=", value, "PMNUD04");
            return (Criteria) this;
        }

        public Criteria andPMNUD04LessThan(String value) {
            addCriterion("PMNUD04 <", value, "PMNUD04");
            return (Criteria) this;
        }

        public Criteria andPMNUD04LessThanOrEqualTo(String value) {
            addCriterion("PMNUD04 <=", value, "PMNUD04");
            return (Criteria) this;
        }

        public Criteria andPMNUD04Like(String value) {
            addCriterion("PMNUD04 like", value, "PMNUD04");
            return (Criteria) this;
        }

        public Criteria andPMNUD04NotLike(String value) {
            addCriterion("PMNUD04 not like", value, "PMNUD04");
            return (Criteria) this;
        }

        public Criteria andPMNUD04In(List<String> values) {
            addCriterion("PMNUD04 in", values, "PMNUD04");
            return (Criteria) this;
        }

        public Criteria andPMNUD04NotIn(List<String> values) {
            addCriterion("PMNUD04 not in", values, "PMNUD04");
            return (Criteria) this;
        }

        public Criteria andPMNUD04Between(String value1, String value2) {
            addCriterion("PMNUD04 between", value1, value2, "PMNUD04");
            return (Criteria) this;
        }

        public Criteria andPMNUD04NotBetween(String value1, String value2) {
            addCriterion("PMNUD04 not between", value1, value2, "PMNUD04");
            return (Criteria) this;
        }

        public Criteria andPMN01IsNull() {
            addCriterion("PMN01 is null");
            return (Criteria) this;
        }

        public Criteria andPMN01IsNotNull() {
            addCriterion("PMN01 is not null");
            return (Criteria) this;
        }

        public Criteria andPMN01EqualTo(String value) {
            addCriterion("PMN01 =", value, "PMN01");
            return (Criteria) this;
        }

        public Criteria andPMN01NotEqualTo(String value) {
            addCriterion("PMN01 <>", value, "PMN01");
            return (Criteria) this;
        }

        public Criteria andPMN01GreaterThan(String value) {
            addCriterion("PMN01 >", value, "PMN01");
            return (Criteria) this;
        }

        public Criteria andPMN01GreaterThanOrEqualTo(String value) {
            addCriterion("PMN01 >=", value, "PMN01");
            return (Criteria) this;
        }

        public Criteria andPMN01LessThan(String value) {
            addCriterion("PMN01 <", value, "PMN01");
            return (Criteria) this;
        }

        public Criteria andPMN01LessThanOrEqualTo(String value) {
            addCriterion("PMN01 <=", value, "PMN01");
            return (Criteria) this;
        }

        public Criteria andPMN01Like(String value) {
            addCriterion("PMN01 like", value, "PMN01");
            return (Criteria) this;
        }

        public Criteria andPMN01NotLike(String value) {
            addCriterion("PMN01 not like", value, "PMN01");
            return (Criteria) this;
        }

        public Criteria andPMN01In(List<String> values) {
            addCriterion("PMN01 in", values, "PMN01");
            return (Criteria) this;
        }

        public Criteria andPMN01NotIn(List<String> values) {
            addCriterion("PMN01 not in", values, "PMN01");
            return (Criteria) this;
        }

        public Criteria andPMN01Between(String value1, String value2) {
            addCriterion("PMN01 between", value1, value2, "PMN01");
            return (Criteria) this;
        }

        public Criteria andPMN01NotBetween(String value1, String value2) {
            addCriterion("PMN01 not between", value1, value2, "PMN01");
            return (Criteria) this;
        }

        public Criteria andSHDZIsNull() {
            addCriterion("SHDZ is null");
            return (Criteria) this;
        }

        public Criteria andSHDZIsNotNull() {
            addCriterion("SHDZ is not null");
            return (Criteria) this;
        }

        public Criteria andSHDZEqualTo(String value) {
            addCriterion("SHDZ =", value, "SHDZ");
            return (Criteria) this;
        }

        public Criteria andSHDZNotEqualTo(String value) {
            addCriterion("SHDZ <>", value, "SHDZ");
            return (Criteria) this;
        }

        public Criteria andSHDZGreaterThan(String value) {
            addCriterion("SHDZ >", value, "SHDZ");
            return (Criteria) this;
        }

        public Criteria andSHDZGreaterThanOrEqualTo(String value) {
            addCriterion("SHDZ >=", value, "SHDZ");
            return (Criteria) this;
        }

        public Criteria andSHDZLessThan(String value) {
            addCriterion("SHDZ <", value, "SHDZ");
            return (Criteria) this;
        }

        public Criteria andSHDZLessThanOrEqualTo(String value) {
            addCriterion("SHDZ <=", value, "SHDZ");
            return (Criteria) this;
        }

        public Criteria andSHDZLike(String value) {
            addCriterion("SHDZ like", value, "SHDZ");
            return (Criteria) this;
        }

        public Criteria andSHDZNotLike(String value) {
            addCriterion("SHDZ not like", value, "SHDZ");
            return (Criteria) this;
        }

        public Criteria andSHDZIn(List<String> values) {
            addCriterion("SHDZ in", values, "SHDZ");
            return (Criteria) this;
        }

        public Criteria andSHDZNotIn(List<String> values) {
            addCriterion("SHDZ not in", values, "SHDZ");
            return (Criteria) this;
        }

        public Criteria andSHDZBetween(String value1, String value2) {
            addCriterion("SHDZ between", value1, value2, "SHDZ");
            return (Criteria) this;
        }

        public Criteria andSHDZNotBetween(String value1, String value2) {
            addCriterion("SHDZ not between", value1, value2, "SHDZ");
            return (Criteria) this;
        }

        public Criteria andPSFLAGIsNull() {
            addCriterion("PSFLAG is null");
            return (Criteria) this;
        }

        public Criteria andPSFLAGIsNotNull() {
            addCriterion("PSFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andPSFLAGEqualTo(String value) {
            addCriterion("PSFLAG =", value, "PSFLAG");
            return (Criteria) this;
        }

        public Criteria andPSFLAGNotEqualTo(String value) {
            addCriterion("PSFLAG <>", value, "PSFLAG");
            return (Criteria) this;
        }

        public Criteria andPSFLAGGreaterThan(String value) {
            addCriterion("PSFLAG >", value, "PSFLAG");
            return (Criteria) this;
        }

        public Criteria andPSFLAGGreaterThanOrEqualTo(String value) {
            addCriterion("PSFLAG >=", value, "PSFLAG");
            return (Criteria) this;
        }

        public Criteria andPSFLAGLessThan(String value) {
            addCriterion("PSFLAG <", value, "PSFLAG");
            return (Criteria) this;
        }

        public Criteria andPSFLAGLessThanOrEqualTo(String value) {
            addCriterion("PSFLAG <=", value, "PSFLAG");
            return (Criteria) this;
        }

        public Criteria andPSFLAGLike(String value) {
            addCriterion("PSFLAG like", value, "PSFLAG");
            return (Criteria) this;
        }

        public Criteria andPSFLAGNotLike(String value) {
            addCriterion("PSFLAG not like", value, "PSFLAG");
            return (Criteria) this;
        }

        public Criteria andPSFLAGIn(List<String> values) {
            addCriterion("PSFLAG in", values, "PSFLAG");
            return (Criteria) this;
        }

        public Criteria andPSFLAGNotIn(List<String> values) {
            addCriterion("PSFLAG not in", values, "PSFLAG");
            return (Criteria) this;
        }

        public Criteria andPSFLAGBetween(String value1, String value2) {
            addCriterion("PSFLAG between", value1, value2, "PSFLAG");
            return (Criteria) this;
        }

        public Criteria andPSFLAGNotBetween(String value1, String value2) {
            addCriterion("PSFLAG not between", value1, value2, "PSFLAG");
            return (Criteria) this;
        }

        public Criteria andSFB02IsNull() {
            addCriterion("SFB02 is null");
            return (Criteria) this;
        }

        public Criteria andSFB02IsNotNull() {
            addCriterion("SFB02 is not null");
            return (Criteria) this;
        }

        public Criteria andSFB02EqualTo(String value) {
            addCriterion("SFB02 =", value, "SFB02");
            return (Criteria) this;
        }

        public Criteria andSFB02NotEqualTo(String value) {
            addCriterion("SFB02 <>", value, "SFB02");
            return (Criteria) this;
        }

        public Criteria andSFB02GreaterThan(String value) {
            addCriterion("SFB02 >", value, "SFB02");
            return (Criteria) this;
        }

        public Criteria andSFB02GreaterThanOrEqualTo(String value) {
            addCriterion("SFB02 >=", value, "SFB02");
            return (Criteria) this;
        }

        public Criteria andSFB02LessThan(String value) {
            addCriterion("SFB02 <", value, "SFB02");
            return (Criteria) this;
        }

        public Criteria andSFB02LessThanOrEqualTo(String value) {
            addCriterion("SFB02 <=", value, "SFB02");
            return (Criteria) this;
        }

        public Criteria andSFB02Like(String value) {
            addCriterion("SFB02 like", value, "SFB02");
            return (Criteria) this;
        }

        public Criteria andSFB02NotLike(String value) {
            addCriterion("SFB02 not like", value, "SFB02");
            return (Criteria) this;
        }

        public Criteria andSFB02In(List<String> values) {
            addCriterion("SFB02 in", values, "SFB02");
            return (Criteria) this;
        }

        public Criteria andSFB02NotIn(List<String> values) {
            addCriterion("SFB02 not in", values, "SFB02");
            return (Criteria) this;
        }

        public Criteria andSFB02Between(String value1, String value2) {
            addCriterion("SFB02 between", value1, value2, "SFB02");
            return (Criteria) this;
        }

        public Criteria andSFB02NotBetween(String value1, String value2) {
            addCriterion("SFB02 not between", value1, value2, "SFB02");
            return (Criteria) this;
        }

        public Criteria andPMN41IsNull() {
            addCriterion("PMN41 is null");
            return (Criteria) this;
        }

        public Criteria andPMN41IsNotNull() {
            addCriterion("PMN41 is not null");
            return (Criteria) this;
        }

        public Criteria andPMN41EqualTo(String value) {
            addCriterion("PMN41 =", value, "PMN41");
            return (Criteria) this;
        }

        public Criteria andPMN41NotEqualTo(String value) {
            addCriterion("PMN41 <>", value, "PMN41");
            return (Criteria) this;
        }

        public Criteria andPMN41GreaterThan(String value) {
            addCriterion("PMN41 >", value, "PMN41");
            return (Criteria) this;
        }

        public Criteria andPMN41GreaterThanOrEqualTo(String value) {
            addCriterion("PMN41 >=", value, "PMN41");
            return (Criteria) this;
        }

        public Criteria andPMN41LessThan(String value) {
            addCriterion("PMN41 <", value, "PMN41");
            return (Criteria) this;
        }

        public Criteria andPMN41LessThanOrEqualTo(String value) {
            addCriterion("PMN41 <=", value, "PMN41");
            return (Criteria) this;
        }

        public Criteria andPMN41Like(String value) {
            addCriterion("PMN41 like", value, "PMN41");
            return (Criteria) this;
        }

        public Criteria andPMN41NotLike(String value) {
            addCriterion("PMN41 not like", value, "PMN41");
            return (Criteria) this;
        }

        public Criteria andPMN41In(List<String> values) {
            addCriterion("PMN41 in", values, "PMN41");
            return (Criteria) this;
        }

        public Criteria andPMN41NotIn(List<String> values) {
            addCriterion("PMN41 not in", values, "PMN41");
            return (Criteria) this;
        }

        public Criteria andPMN41Between(String value1, String value2) {
            addCriterion("PMN41 between", value1, value2, "PMN41");
            return (Criteria) this;
        }

        public Criteria andPMN41NotBetween(String value1, String value2) {
            addCriterion("PMN41 not between", value1, value2, "PMN41");
            return (Criteria) this;
        }

        public Criteria andYSIsNull() {
            addCriterion("YS is null");
            return (Criteria) this;
        }

        public Criteria andYSIsNotNull() {
            addCriterion("YS is not null");
            return (Criteria) this;
        }

        public Criteria andYSEqualTo(String value) {
            addCriterion("YS =", value, "YS");
            return (Criteria) this;
        }

        public Criteria andYSNotEqualTo(String value) {
            addCriterion("YS <>", value, "YS");
            return (Criteria) this;
        }

        public Criteria andYSGreaterThan(String value) {
            addCriterion("YS >", value, "YS");
            return (Criteria) this;
        }

        public Criteria andYSGreaterThanOrEqualTo(String value) {
            addCriterion("YS >=", value, "YS");
            return (Criteria) this;
        }

        public Criteria andYSLessThan(String value) {
            addCriterion("YS <", value, "YS");
            return (Criteria) this;
        }

        public Criteria andYSLessThanOrEqualTo(String value) {
            addCriterion("YS <=", value, "YS");
            return (Criteria) this;
        }

        public Criteria andYSLike(String value) {
            addCriterion("YS like", value, "YS");
            return (Criteria) this;
        }

        public Criteria andYSNotLike(String value) {
            addCriterion("YS not like", value, "YS");
            return (Criteria) this;
        }

        public Criteria andYSIn(List<String> values) {
            addCriterion("YS in", values, "YS");
            return (Criteria) this;
        }

        public Criteria andYSNotIn(List<String> values) {
            addCriterion("YS not in", values, "YS");
            return (Criteria) this;
        }

        public Criteria andYSBetween(String value1, String value2) {
            addCriterion("YS between", value1, value2, "YS");
            return (Criteria) this;
        }

        public Criteria andYSNotBetween(String value1, String value2) {
            addCriterion("YS not between", value1, value2, "YS");
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