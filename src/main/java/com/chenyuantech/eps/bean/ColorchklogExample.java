package com.chenyuantech.eps.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ColorchklogExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public ColorchklogExample() {
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

        public Criteria andChkidIsNull() {
            addCriterion("CHKID is null");
            return (Criteria) this;
        }

        public Criteria andChkidIsNotNull() {
            addCriterion("CHKID is not null");
            return (Criteria) this;
        }

        public Criteria andChkidEqualTo(String value) {
            addCriterion("CHKID =", value, "chkid");
            return (Criteria) this;
        }

        public Criteria andChkidNotEqualTo(String value) {
            addCriterion("CHKID <>", value, "chkid");
            return (Criteria) this;
        }

        public Criteria andChkidGreaterThan(String value) {
            addCriterion("CHKID >", value, "chkid");
            return (Criteria) this;
        }

        public Criteria andChkidGreaterThanOrEqualTo(String value) {
            addCriterion("CHKID >=", value, "chkid");
            return (Criteria) this;
        }

        public Criteria andChkidLessThan(String value) {
            addCriterion("CHKID <", value, "chkid");
            return (Criteria) this;
        }

        public Criteria andChkidLessThanOrEqualTo(String value) {
            addCriterion("CHKID <=", value, "chkid");
            return (Criteria) this;
        }

        public Criteria andChkidLike(String value) {
            addCriterion("CHKID like", value, "chkid");
            return (Criteria) this;
        }

        public Criteria andChkidNotLike(String value) {
            addCriterion("CHKID not like", value, "chkid");
            return (Criteria) this;
        }

        public Criteria andChkidIn(List<String> values) {
            addCriterion("CHKID in", values, "chkid");
            return (Criteria) this;
        }

        public Criteria andChkidNotIn(List<String> values) {
            addCriterion("CHKID not in", values, "chkid");
            return (Criteria) this;
        }

        public Criteria andChkidBetween(String value1, String value2) {
            addCriterion("CHKID between", value1, value2, "chkid");
            return (Criteria) this;
        }

        public Criteria andChkidNotBetween(String value1, String value2) {
            addCriterion("CHKID not between", value1, value2, "chkid");
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

        public Criteria andSeqIsNull() {
            addCriterion("SEQ is null");
            return (Criteria) this;
        }

        public Criteria andSeqIsNotNull() {
            addCriterion("SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andSeqEqualTo(Long value) {
            addCriterion("SEQ =", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqNotEqualTo(Long value) {
            addCriterion("SEQ <>", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqGreaterThan(Long value) {
            addCriterion("SEQ >", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqGreaterThanOrEqualTo(Long value) {
            addCriterion("SEQ >=", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqLessThan(Long value) {
            addCriterion("SEQ <", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqLessThanOrEqualTo(Long value) {
            addCriterion("SEQ <=", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqIn(List<Long> values) {
            addCriterion("SEQ in", values, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqNotIn(List<Long> values) {
            addCriterion("SEQ not in", values, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqBetween(Long value1, Long value2) {
            addCriterion("SEQ between", value1, value2, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqNotBetween(Long value1, Long value2) {
            addCriterion("SEQ not between", value1, value2, "seq");
            return (Criteria) this;
        }

        public Criteria andRdresultIsNull() {
            addCriterion("RDRESULT is null");
            return (Criteria) this;
        }

        public Criteria andRdresultIsNotNull() {
            addCriterion("RDRESULT is not null");
            return (Criteria) this;
        }

        public Criteria andRdresultEqualTo(String value) {
            addCriterion("RDRESULT =", value, "rdresult");
            return (Criteria) this;
        }

        public Criteria andRdresultNotEqualTo(String value) {
            addCriterion("RDRESULT <>", value, "rdresult");
            return (Criteria) this;
        }

        public Criteria andRdresultGreaterThan(String value) {
            addCriterion("RDRESULT >", value, "rdresult");
            return (Criteria) this;
        }

        public Criteria andRdresultGreaterThanOrEqualTo(String value) {
            addCriterion("RDRESULT >=", value, "rdresult");
            return (Criteria) this;
        }

        public Criteria andRdresultLessThan(String value) {
            addCriterion("RDRESULT <", value, "rdresult");
            return (Criteria) this;
        }

        public Criteria andRdresultLessThanOrEqualTo(String value) {
            addCriterion("RDRESULT <=", value, "rdresult");
            return (Criteria) this;
        }

        public Criteria andRdresultLike(String value) {
            addCriterion("RDRESULT like", value, "rdresult");
            return (Criteria) this;
        }

        public Criteria andRdresultNotLike(String value) {
            addCriterion("RDRESULT not like", value, "rdresult");
            return (Criteria) this;
        }

        public Criteria andRdresultIn(List<String> values) {
            addCriterion("RDRESULT in", values, "rdresult");
            return (Criteria) this;
        }

        public Criteria andRdresultNotIn(List<String> values) {
            addCriterion("RDRESULT not in", values, "rdresult");
            return (Criteria) this;
        }

        public Criteria andRdresultBetween(String value1, String value2) {
            addCriterion("RDRESULT between", value1, value2, "rdresult");
            return (Criteria) this;
        }

        public Criteria andRdresultNotBetween(String value1, String value2) {
            addCriterion("RDRESULT not between", value1, value2, "rdresult");
            return (Criteria) this;
        }

        public Criteria andQcresultIsNull() {
            addCriterion("QCRESULT is null");
            return (Criteria) this;
        }

        public Criteria andQcresultIsNotNull() {
            addCriterion("QCRESULT is not null");
            return (Criteria) this;
        }

        public Criteria andQcresultEqualTo(String value) {
            addCriterion("QCRESULT =", value, "qcresult");
            return (Criteria) this;
        }

        public Criteria andQcresultNotEqualTo(String value) {
            addCriterion("QCRESULT <>", value, "qcresult");
            return (Criteria) this;
        }

        public Criteria andQcresultGreaterThan(String value) {
            addCriterion("QCRESULT >", value, "qcresult");
            return (Criteria) this;
        }

        public Criteria andQcresultGreaterThanOrEqualTo(String value) {
            addCriterion("QCRESULT >=", value, "qcresult");
            return (Criteria) this;
        }

        public Criteria andQcresultLessThan(String value) {
            addCriterion("QCRESULT <", value, "qcresult");
            return (Criteria) this;
        }

        public Criteria andQcresultLessThanOrEqualTo(String value) {
            addCriterion("QCRESULT <=", value, "qcresult");
            return (Criteria) this;
        }

        public Criteria andQcresultLike(String value) {
            addCriterion("QCRESULT like", value, "qcresult");
            return (Criteria) this;
        }

        public Criteria andQcresultNotLike(String value) {
            addCriterion("QCRESULT not like", value, "qcresult");
            return (Criteria) this;
        }

        public Criteria andQcresultIn(List<String> values) {
            addCriterion("QCRESULT in", values, "qcresult");
            return (Criteria) this;
        }

        public Criteria andQcresultNotIn(List<String> values) {
            addCriterion("QCRESULT not in", values, "qcresult");
            return (Criteria) this;
        }

        public Criteria andQcresultBetween(String value1, String value2) {
            addCriterion("QCRESULT between", value1, value2, "qcresult");
            return (Criteria) this;
        }

        public Criteria andQcresultNotBetween(String value1, String value2) {
            addCriterion("QCRESULT not between", value1, value2, "qcresult");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("MEMO is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("MEMO =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("MEMO <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("MEMO >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("MEMO >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("MEMO <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("MEMO <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("MEMO like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("MEMO not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("MEMO in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("MEMO not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("MEMO between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("MEMO not between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andAttrIsNull() {
            addCriterion("ATTR is null");
            return (Criteria) this;
        }

        public Criteria andAttrIsNotNull() {
            addCriterion("ATTR is not null");
            return (Criteria) this;
        }

        public Criteria andAttrEqualTo(String value) {
            addCriterion("ATTR =", value, "attr");
            return (Criteria) this;
        }

        public Criteria andAttrNotEqualTo(String value) {
            addCriterion("ATTR <>", value, "attr");
            return (Criteria) this;
        }

        public Criteria andAttrGreaterThan(String value) {
            addCriterion("ATTR >", value, "attr");
            return (Criteria) this;
        }

        public Criteria andAttrGreaterThanOrEqualTo(String value) {
            addCriterion("ATTR >=", value, "attr");
            return (Criteria) this;
        }

        public Criteria andAttrLessThan(String value) {
            addCriterion("ATTR <", value, "attr");
            return (Criteria) this;
        }

        public Criteria andAttrLessThanOrEqualTo(String value) {
            addCriterion("ATTR <=", value, "attr");
            return (Criteria) this;
        }

        public Criteria andAttrLike(String value) {
            addCriterion("ATTR like", value, "attr");
            return (Criteria) this;
        }

        public Criteria andAttrNotLike(String value) {
            addCriterion("ATTR not like", value, "attr");
            return (Criteria) this;
        }

        public Criteria andAttrIn(List<String> values) {
            addCriterion("ATTR in", values, "attr");
            return (Criteria) this;
        }

        public Criteria andAttrNotIn(List<String> values) {
            addCriterion("ATTR not in", values, "attr");
            return (Criteria) this;
        }

        public Criteria andAttrBetween(String value1, String value2) {
            addCriterion("ATTR between", value1, value2, "attr");
            return (Criteria) this;
        }

        public Criteria andAttrNotBetween(String value1, String value2) {
            addCriterion("ATTR not between", value1, value2, "attr");
            return (Criteria) this;
        }

        public Criteria andChktimeIsNull() {
            addCriterion("CHKTIME is null");
            return (Criteria) this;
        }

        public Criteria andChktimeIsNotNull() {
            addCriterion("CHKTIME is not null");
            return (Criteria) this;
        }

        public Criteria andChktimeEqualTo(String value) {
            addCriterion("CHKTIME =", value, "chktime");
            return (Criteria) this;
        }

        public Criteria andChktimeNotEqualTo(String value) {
            addCriterion("CHKTIME <>", value, "chktime");
            return (Criteria) this;
        }

        public Criteria andChktimeGreaterThan(String value) {
            addCriterion("CHKTIME >", value, "chktime");
            return (Criteria) this;
        }

        public Criteria andChktimeGreaterThanOrEqualTo(String value) {
            addCriterion("CHKTIME >=", value, "chktime");
            return (Criteria) this;
        }

        public Criteria andChktimeLessThan(String value) {
            addCriterion("CHKTIME <", value, "chktime");
            return (Criteria) this;
        }

        public Criteria andChktimeLessThanOrEqualTo(String value) {
            addCriterion("CHKTIME <=", value, "chktime");
            return (Criteria) this;
        }

        public Criteria andChktimeLike(String value) {
            addCriterion("CHKTIME like", value, "chktime");
            return (Criteria) this;
        }

        public Criteria andChktimeNotLike(String value) {
            addCriterion("CHKTIME not like", value, "chktime");
            return (Criteria) this;
        }

        public Criteria andChktimeIn(List<String> values) {
            addCriterion("CHKTIME in", values, "chktime");
            return (Criteria) this;
        }

        public Criteria andChktimeNotIn(List<String> values) {
            addCriterion("CHKTIME not in", values, "chktime");
            return (Criteria) this;
        }

        public Criteria andChktimeBetween(String value1, String value2) {
            addCriterion("CHKTIME between", value1, value2, "chktime");
            return (Criteria) this;
        }

        public Criteria andChktimeNotBetween(String value1, String value2) {
            addCriterion("CHKTIME not between", value1, value2, "chktime");
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

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
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