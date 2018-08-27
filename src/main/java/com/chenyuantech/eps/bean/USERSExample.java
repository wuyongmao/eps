package com.chenyuantech.eps.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class USERSExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public USERSExample() {
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

        public Criteria andACCIDIsNull() {
            addCriterion("ACCID is null");
            return (Criteria) this;
        }

        public Criteria andACCIDIsNotNull() {
            addCriterion("ACCID is not null");
            return (Criteria) this;
        }

        public Criteria andACCIDEqualTo(String value) {
            addCriterion("ACCID =", value, "ACCID");
            return (Criteria) this;
        }

        public Criteria andACCIDNotEqualTo(String value) {
            addCriterion("ACCID <>", value, "ACCID");
            return (Criteria) this;
        }

        public Criteria andACCIDGreaterThan(String value) {
            addCriterion("ACCID >", value, "ACCID");
            return (Criteria) this;
        }

        public Criteria andACCIDGreaterThanOrEqualTo(String value) {
            addCriterion("ACCID >=", value, "ACCID");
            return (Criteria) this;
        }

        public Criteria andACCIDLessThan(String value) {
            addCriterion("ACCID <", value, "ACCID");
            return (Criteria) this;
        }

        public Criteria andACCIDLessThanOrEqualTo(String value) {
            addCriterion("ACCID <=", value, "ACCID");
            return (Criteria) this;
        }

        public Criteria andACCIDLike(String value) {
            addCriterion("ACCID like", value, "ACCID");
            return (Criteria) this;
        }

        public Criteria andACCIDNotLike(String value) {
            addCriterion("ACCID not like", value, "ACCID");
            return (Criteria) this;
        }

        public Criteria andACCIDIn(List<String> values) {
            addCriterion("ACCID in", values, "ACCID");
            return (Criteria) this;
        }

        public Criteria andACCIDNotIn(List<String> values) {
            addCriterion("ACCID not in", values, "ACCID");
            return (Criteria) this;
        }

        public Criteria andACCIDBetween(String value1, String value2) {
            addCriterion("ACCID between", value1, value2, "ACCID");
            return (Criteria) this;
        }

        public Criteria andACCIDNotBetween(String value1, String value2) {
            addCriterion("ACCID not between", value1, value2, "ACCID");
            return (Criteria) this;
        }

        public Criteria andNAMEIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNAMEIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNAMEEqualTo(String value) {
            addCriterion("NAME =", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMENotEqualTo(String value) {
            addCriterion("NAME <>", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMEGreaterThan(String value) {
            addCriterion("NAME >", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMEGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMELessThan(String value) {
            addCriterion("NAME <", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMELessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMELike(String value) {
            addCriterion("NAME like", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMENotLike(String value) {
            addCriterion("NAME not like", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMEIn(List<String> values) {
            addCriterion("NAME in", values, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMENotIn(List<String> values) {
            addCriterion("NAME not in", values, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMEBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMENotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "NAME");
            return (Criteria) this;
        }

        public Criteria andPWDIsNull() {
            addCriterion("PWD is null");
            return (Criteria) this;
        }

        public Criteria andPWDIsNotNull() {
            addCriterion("PWD is not null");
            return (Criteria) this;
        }

        public Criteria andPWDEqualTo(String value) {
            addCriterion("PWD =", value, "PWD");
            return (Criteria) this;
        }

        public Criteria andPWDNotEqualTo(String value) {
            addCriterion("PWD <>", value, "PWD");
            return (Criteria) this;
        }

        public Criteria andPWDGreaterThan(String value) {
            addCriterion("PWD >", value, "PWD");
            return (Criteria) this;
        }

        public Criteria andPWDGreaterThanOrEqualTo(String value) {
            addCriterion("PWD >=", value, "PWD");
            return (Criteria) this;
        }

        public Criteria andPWDLessThan(String value) {
            addCriterion("PWD <", value, "PWD");
            return (Criteria) this;
        }

        public Criteria andPWDLessThanOrEqualTo(String value) {
            addCriterion("PWD <=", value, "PWD");
            return (Criteria) this;
        }

        public Criteria andPWDLike(String value) {
            addCriterion("PWD like", value, "PWD");
            return (Criteria) this;
        }

        public Criteria andPWDNotLike(String value) {
            addCriterion("PWD not like", value, "PWD");
            return (Criteria) this;
        }

        public Criteria andPWDIn(List<String> values) {
            addCriterion("PWD in", values, "PWD");
            return (Criteria) this;
        }

        public Criteria andPWDNotIn(List<String> values) {
            addCriterion("PWD not in", values, "PWD");
            return (Criteria) this;
        }

        public Criteria andPWDBetween(String value1, String value2) {
            addCriterion("PWD between", value1, value2, "PWD");
            return (Criteria) this;
        }

        public Criteria andPWDNotBetween(String value1, String value2) {
            addCriterion("PWD not between", value1, value2, "PWD");
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

        public Criteria andQQIsNull() {
            addCriterion("QQ is null");
            return (Criteria) this;
        }

        public Criteria andQQIsNotNull() {
            addCriterion("QQ is not null");
            return (Criteria) this;
        }

        public Criteria andQQEqualTo(String value) {
            addCriterion("QQ =", value, "QQ");
            return (Criteria) this;
        }

        public Criteria andQQNotEqualTo(String value) {
            addCriterion("QQ <>", value, "QQ");
            return (Criteria) this;
        }

        public Criteria andQQGreaterThan(String value) {
            addCriterion("QQ >", value, "QQ");
            return (Criteria) this;
        }

        public Criteria andQQGreaterThanOrEqualTo(String value) {
            addCriterion("QQ >=", value, "QQ");
            return (Criteria) this;
        }

        public Criteria andQQLessThan(String value) {
            addCriterion("QQ <", value, "QQ");
            return (Criteria) this;
        }

        public Criteria andQQLessThanOrEqualTo(String value) {
            addCriterion("QQ <=", value, "QQ");
            return (Criteria) this;
        }

        public Criteria andQQLike(String value) {
            addCriterion("QQ like", value, "QQ");
            return (Criteria) this;
        }

        public Criteria andQQNotLike(String value) {
            addCriterion("QQ not like", value, "QQ");
            return (Criteria) this;
        }

        public Criteria andQQIn(List<String> values) {
            addCriterion("QQ in", values, "QQ");
            return (Criteria) this;
        }

        public Criteria andQQNotIn(List<String> values) {
            addCriterion("QQ not in", values, "QQ");
            return (Criteria) this;
        }

        public Criteria andQQBetween(String value1, String value2) {
            addCriterion("QQ between", value1, value2, "QQ");
            return (Criteria) this;
        }

        public Criteria andQQNotBetween(String value1, String value2) {
            addCriterion("QQ not between", value1, value2, "QQ");
            return (Criteria) this;
        }

        public Criteria andEMAILIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEMAILIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEMAILEqualTo(String value) {
            addCriterion("EMAIL =", value, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILGreaterThan(String value) {
            addCriterion("EMAIL >", value, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILLessThan(String value) {
            addCriterion("EMAIL <", value, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILLike(String value) {
            addCriterion("EMAIL like", value, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILNotLike(String value) {
            addCriterion("EMAIL not like", value, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILIn(List<String> values) {
            addCriterion("EMAIL in", values, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andWECHATIsNull() {
            addCriterion("WECHAT is null");
            return (Criteria) this;
        }

        public Criteria andWECHATIsNotNull() {
            addCriterion("WECHAT is not null");
            return (Criteria) this;
        }

        public Criteria andWECHATEqualTo(String value) {
            addCriterion("WECHAT =", value, "WECHAT");
            return (Criteria) this;
        }

        public Criteria andWECHATNotEqualTo(String value) {
            addCriterion("WECHAT <>", value, "WECHAT");
            return (Criteria) this;
        }

        public Criteria andWECHATGreaterThan(String value) {
            addCriterion("WECHAT >", value, "WECHAT");
            return (Criteria) this;
        }

        public Criteria andWECHATGreaterThanOrEqualTo(String value) {
            addCriterion("WECHAT >=", value, "WECHAT");
            return (Criteria) this;
        }

        public Criteria andWECHATLessThan(String value) {
            addCriterion("WECHAT <", value, "WECHAT");
            return (Criteria) this;
        }

        public Criteria andWECHATLessThanOrEqualTo(String value) {
            addCriterion("WECHAT <=", value, "WECHAT");
            return (Criteria) this;
        }

        public Criteria andWECHATLike(String value) {
            addCriterion("WECHAT like", value, "WECHAT");
            return (Criteria) this;
        }

        public Criteria andWECHATNotLike(String value) {
            addCriterion("WECHAT not like", value, "WECHAT");
            return (Criteria) this;
        }

        public Criteria andWECHATIn(List<String> values) {
            addCriterion("WECHAT in", values, "WECHAT");
            return (Criteria) this;
        }

        public Criteria andWECHATNotIn(List<String> values) {
            addCriterion("WECHAT not in", values, "WECHAT");
            return (Criteria) this;
        }

        public Criteria andWECHATBetween(String value1, String value2) {
            addCriterion("WECHAT between", value1, value2, "WECHAT");
            return (Criteria) this;
        }

        public Criteria andWECHATNotBetween(String value1, String value2) {
            addCriterion("WECHAT not between", value1, value2, "WECHAT");
            return (Criteria) this;
        }

        public Criteria andTELIsNull() {
            addCriterion("TEL is null");
            return (Criteria) this;
        }

        public Criteria andTELIsNotNull() {
            addCriterion("TEL is not null");
            return (Criteria) this;
        }

        public Criteria andTELEqualTo(String value) {
            addCriterion("TEL =", value, "TEL");
            return (Criteria) this;
        }

        public Criteria andTELNotEqualTo(String value) {
            addCriterion("TEL <>", value, "TEL");
            return (Criteria) this;
        }

        public Criteria andTELGreaterThan(String value) {
            addCriterion("TEL >", value, "TEL");
            return (Criteria) this;
        }

        public Criteria andTELGreaterThanOrEqualTo(String value) {
            addCriterion("TEL >=", value, "TEL");
            return (Criteria) this;
        }

        public Criteria andTELLessThan(String value) {
            addCriterion("TEL <", value, "TEL");
            return (Criteria) this;
        }

        public Criteria andTELLessThanOrEqualTo(String value) {
            addCriterion("TEL <=", value, "TEL");
            return (Criteria) this;
        }

        public Criteria andTELLike(String value) {
            addCriterion("TEL like", value, "TEL");
            return (Criteria) this;
        }

        public Criteria andTELNotLike(String value) {
            addCriterion("TEL not like", value, "TEL");
            return (Criteria) this;
        }

        public Criteria andTELIn(List<String> values) {
            addCriterion("TEL in", values, "TEL");
            return (Criteria) this;
        }

        public Criteria andTELNotIn(List<String> values) {
            addCriterion("TEL not in", values, "TEL");
            return (Criteria) this;
        }

        public Criteria andTELBetween(String value1, String value2) {
            addCriterion("TEL between", value1, value2, "TEL");
            return (Criteria) this;
        }

        public Criteria andTELNotBetween(String value1, String value2) {
            addCriterion("TEL not between", value1, value2, "TEL");
            return (Criteria) this;
        }

        public Criteria andHPIsNull() {
            addCriterion("HP is null");
            return (Criteria) this;
        }

        public Criteria andHPIsNotNull() {
            addCriterion("HP is not null");
            return (Criteria) this;
        }

        public Criteria andHPEqualTo(String value) {
            addCriterion("HP =", value, "HP");
            return (Criteria) this;
        }

        public Criteria andHPNotEqualTo(String value) {
            addCriterion("HP <>", value, "HP");
            return (Criteria) this;
        }

        public Criteria andHPGreaterThan(String value) {
            addCriterion("HP >", value, "HP");
            return (Criteria) this;
        }

        public Criteria andHPGreaterThanOrEqualTo(String value) {
            addCriterion("HP >=", value, "HP");
            return (Criteria) this;
        }

        public Criteria andHPLessThan(String value) {
            addCriterion("HP <", value, "HP");
            return (Criteria) this;
        }

        public Criteria andHPLessThanOrEqualTo(String value) {
            addCriterion("HP <=", value, "HP");
            return (Criteria) this;
        }

        public Criteria andHPLike(String value) {
            addCriterion("HP like", value, "HP");
            return (Criteria) this;
        }

        public Criteria andHPNotLike(String value) {
            addCriterion("HP not like", value, "HP");
            return (Criteria) this;
        }

        public Criteria andHPIn(List<String> values) {
            addCriterion("HP in", values, "HP");
            return (Criteria) this;
        }

        public Criteria andHPNotIn(List<String> values) {
            addCriterion("HP not in", values, "HP");
            return (Criteria) this;
        }

        public Criteria andHPBetween(String value1, String value2) {
            addCriterion("HP between", value1, value2, "HP");
            return (Criteria) this;
        }

        public Criteria andHPNotBetween(String value1, String value2) {
            addCriterion("HP not between", value1, value2, "HP");
            return (Criteria) this;
        }

        public Criteria andACCIsNull() {
            addCriterion("ACC is null");
            return (Criteria) this;
        }

        public Criteria andACCIsNotNull() {
            addCriterion("ACC is not null");
            return (Criteria) this;
        }

        public Criteria andACCEqualTo(String value) {
            addCriterion("ACC =", value, "ACC");
            return (Criteria) this;
        }

        public Criteria andACCNotEqualTo(String value) {
            addCriterion("ACC <>", value, "ACC");
            return (Criteria) this;
        }

        public Criteria andACCGreaterThan(String value) {
            addCriterion("ACC >", value, "ACC");
            return (Criteria) this;
        }

        public Criteria andACCGreaterThanOrEqualTo(String value) {
            addCriterion("ACC >=", value, "ACC");
            return (Criteria) this;
        }

        public Criteria andACCLessThan(String value) {
            addCriterion("ACC <", value, "ACC");
            return (Criteria) this;
        }

        public Criteria andACCLessThanOrEqualTo(String value) {
            addCriterion("ACC <=", value, "ACC");
            return (Criteria) this;
        }

        public Criteria andACCLike(String value) {
            addCriterion("ACC like", value, "ACC");
            return (Criteria) this;
        }

        public Criteria andACCNotLike(String value) {
            addCriterion("ACC not like", value, "ACC");
            return (Criteria) this;
        }

        public Criteria andACCIn(List<String> values) {
            addCriterion("ACC in", values, "ACC");
            return (Criteria) this;
        }

        public Criteria andACCNotIn(List<String> values) {
            addCriterion("ACC not in", values, "ACC");
            return (Criteria) this;
        }

        public Criteria andACCBetween(String value1, String value2) {
            addCriterion("ACC between", value1, value2, "ACC");
            return (Criteria) this;
        }

        public Criteria andACCNotBetween(String value1, String value2) {
            addCriterion("ACC not between", value1, value2, "ACC");
            return (Criteria) this;
        }

        public Criteria andDEPTIsNull() {
            addCriterion("DEPT is null");
            return (Criteria) this;
        }

        public Criteria andDEPTIsNotNull() {
            addCriterion("DEPT is not null");
            return (Criteria) this;
        }

        public Criteria andDEPTEqualTo(String value) {
            addCriterion("DEPT =", value, "DEPT");
            return (Criteria) this;
        }

        public Criteria andDEPTNotEqualTo(String value) {
            addCriterion("DEPT <>", value, "DEPT");
            return (Criteria) this;
        }

        public Criteria andDEPTGreaterThan(String value) {
            addCriterion("DEPT >", value, "DEPT");
            return (Criteria) this;
        }

        public Criteria andDEPTGreaterThanOrEqualTo(String value) {
            addCriterion("DEPT >=", value, "DEPT");
            return (Criteria) this;
        }

        public Criteria andDEPTLessThan(String value) {
            addCriterion("DEPT <", value, "DEPT");
            return (Criteria) this;
        }

        public Criteria andDEPTLessThanOrEqualTo(String value) {
            addCriterion("DEPT <=", value, "DEPT");
            return (Criteria) this;
        }

        public Criteria andDEPTLike(String value) {
            addCriterion("DEPT like", value, "DEPT");
            return (Criteria) this;
        }

        public Criteria andDEPTNotLike(String value) {
            addCriterion("DEPT not like", value, "DEPT");
            return (Criteria) this;
        }

        public Criteria andDEPTIn(List<String> values) {
            addCriterion("DEPT in", values, "DEPT");
            return (Criteria) this;
        }

        public Criteria andDEPTNotIn(List<String> values) {
            addCriterion("DEPT not in", values, "DEPT");
            return (Criteria) this;
        }

        public Criteria andDEPTBetween(String value1, String value2) {
            addCriterion("DEPT between", value1, value2, "DEPT");
            return (Criteria) this;
        }

        public Criteria andDEPTNotBetween(String value1, String value2) {
            addCriterion("DEPT not between", value1, value2, "DEPT");
            return (Criteria) this;
        }

        public Criteria andORGIsNull() {
            addCriterion("ORG is null");
            return (Criteria) this;
        }

        public Criteria andORGIsNotNull() {
            addCriterion("ORG is not null");
            return (Criteria) this;
        }

        public Criteria andORGEqualTo(String value) {
            addCriterion("ORG =", value, "ORG");
            return (Criteria) this;
        }

        public Criteria andORGNotEqualTo(String value) {
            addCriterion("ORG <>", value, "ORG");
            return (Criteria) this;
        }

        public Criteria andORGGreaterThan(String value) {
            addCriterion("ORG >", value, "ORG");
            return (Criteria) this;
        }

        public Criteria andORGGreaterThanOrEqualTo(String value) {
            addCriterion("ORG >=", value, "ORG");
            return (Criteria) this;
        }

        public Criteria andORGLessThan(String value) {
            addCriterion("ORG <", value, "ORG");
            return (Criteria) this;
        }

        public Criteria andORGLessThanOrEqualTo(String value) {
            addCriterion("ORG <=", value, "ORG");
            return (Criteria) this;
        }

        public Criteria andORGLike(String value) {
            addCriterion("ORG like", value, "ORG");
            return (Criteria) this;
        }

        public Criteria andORGNotLike(String value) {
            addCriterion("ORG not like", value, "ORG");
            return (Criteria) this;
        }

        public Criteria andORGIn(List<String> values) {
            addCriterion("ORG in", values, "ORG");
            return (Criteria) this;
        }

        public Criteria andORGNotIn(List<String> values) {
            addCriterion("ORG not in", values, "ORG");
            return (Criteria) this;
        }

        public Criteria andORGBetween(String value1, String value2) {
            addCriterion("ORG between", value1, value2, "ORG");
            return (Criteria) this;
        }

        public Criteria andORGNotBetween(String value1, String value2) {
            addCriterion("ORG not between", value1, value2, "ORG");
            return (Criteria) this;
        }

        public Criteria andCHGTIMEIsNull() {
            addCriterion("CHGTIME is null");
            return (Criteria) this;
        }

        public Criteria andCHGTIMEIsNotNull() {
            addCriterion("CHGTIME is not null");
            return (Criteria) this;
        }

        public Criteria andCHGTIMEEqualTo(String value) {
            addCriterion("CHGTIME =", value, "CHGTIME");
            return (Criteria) this;
        }

        public Criteria andCHGTIMENotEqualTo(String value) {
            addCriterion("CHGTIME <>", value, "CHGTIME");
            return (Criteria) this;
        }

        public Criteria andCHGTIMEGreaterThan(String value) {
            addCriterion("CHGTIME >", value, "CHGTIME");
            return (Criteria) this;
        }

        public Criteria andCHGTIMEGreaterThanOrEqualTo(String value) {
            addCriterion("CHGTIME >=", value, "CHGTIME");
            return (Criteria) this;
        }

        public Criteria andCHGTIMELessThan(String value) {
            addCriterion("CHGTIME <", value, "CHGTIME");
            return (Criteria) this;
        }

        public Criteria andCHGTIMELessThanOrEqualTo(String value) {
            addCriterion("CHGTIME <=", value, "CHGTIME");
            return (Criteria) this;
        }

        public Criteria andCHGTIMELike(String value) {
            addCriterion("CHGTIME like", value, "CHGTIME");
            return (Criteria) this;
        }

        public Criteria andCHGTIMENotLike(String value) {
            addCriterion("CHGTIME not like", value, "CHGTIME");
            return (Criteria) this;
        }

        public Criteria andCHGTIMEIn(List<String> values) {
            addCriterion("CHGTIME in", values, "CHGTIME");
            return (Criteria) this;
        }

        public Criteria andCHGTIMENotIn(List<String> values) {
            addCriterion("CHGTIME not in", values, "CHGTIME");
            return (Criteria) this;
        }

        public Criteria andCHGTIMEBetween(String value1, String value2) {
            addCriterion("CHGTIME between", value1, value2, "CHGTIME");
            return (Criteria) this;
        }

        public Criteria andCHGTIMENotBetween(String value1, String value2) {
            addCriterion("CHGTIME not between", value1, value2, "CHGTIME");
            return (Criteria) this;
        }

        public Criteria andSTATUSIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andSTATUSIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andSTATUSEqualTo(String value) {
            addCriterion("STATUS =", value, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSGreaterThan(String value) {
            addCriterion("STATUS >", value, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSLessThan(String value) {
            addCriterion("STATUS <", value, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSLike(String value) {
            addCriterion("STATUS like", value, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSNotLike(String value) {
            addCriterion("STATUS not like", value, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSIn(List<String> values) {
            addCriterion("STATUS in", values, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "STATUS");
            return (Criteria) this;
        }

        public Criteria andROLEIsNull() {
            addCriterion("ROLE is null");
            return (Criteria) this;
        }

        public Criteria andROLEIsNotNull() {
            addCriterion("ROLE is not null");
            return (Criteria) this;
        }

        public Criteria andROLEEqualTo(String value) {
            addCriterion("ROLE =", value, "ROLE");
            return (Criteria) this;
        }

        public Criteria andROLENotEqualTo(String value) {
            addCriterion("ROLE <>", value, "ROLE");
            return (Criteria) this;
        }

        public Criteria andROLEGreaterThan(String value) {
            addCriterion("ROLE >", value, "ROLE");
            return (Criteria) this;
        }

        public Criteria andROLEGreaterThanOrEqualTo(String value) {
            addCriterion("ROLE >=", value, "ROLE");
            return (Criteria) this;
        }

        public Criteria andROLELessThan(String value) {
            addCriterion("ROLE <", value, "ROLE");
            return (Criteria) this;
        }

        public Criteria andROLELessThanOrEqualTo(String value) {
            addCriterion("ROLE <=", value, "ROLE");
            return (Criteria) this;
        }

        public Criteria andROLELike(String value) {
            addCriterion("ROLE like", value, "ROLE");
            return (Criteria) this;
        }

        public Criteria andROLENotLike(String value) {
            addCriterion("ROLE not like", value, "ROLE");
            return (Criteria) this;
        }

        public Criteria andROLEIn(List<String> values) {
            addCriterion("ROLE in", values, "ROLE");
            return (Criteria) this;
        }

        public Criteria andROLENotIn(List<String> values) {
            addCriterion("ROLE not in", values, "ROLE");
            return (Criteria) this;
        }

        public Criteria andROLEBetween(String value1, String value2) {
            addCriterion("ROLE between", value1, value2, "ROLE");
            return (Criteria) this;
        }

        public Criteria andROLENotBetween(String value1, String value2) {
            addCriterion("ROLE not between", value1, value2, "ROLE");
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