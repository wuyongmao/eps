package com.chenyuantech.eps.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class PnbExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public PnbExample() {
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

        public Criteria andPnb01IsNull() {
            addCriterion("PNB01 is null");
            return (Criteria) this;
        }

        public Criteria andPnb01IsNotNull() {
            addCriterion("PNB01 is not null");
            return (Criteria) this;
        }

        public Criteria andPnb01EqualTo(String value) {
            addCriterion("PNB01 =", value, "pnb01");
            return (Criteria) this;
        }

        public Criteria andPnb01NotEqualTo(String value) {
            addCriterion("PNB01 <>", value, "pnb01");
            return (Criteria) this;
        }

        public Criteria andPnb01GreaterThan(String value) {
            addCriterion("PNB01 >", value, "pnb01");
            return (Criteria) this;
        }

        public Criteria andPnb01GreaterThanOrEqualTo(String value) {
            addCriterion("PNB01 >=", value, "pnb01");
            return (Criteria) this;
        }

        public Criteria andPnb01LessThan(String value) {
            addCriterion("PNB01 <", value, "pnb01");
            return (Criteria) this;
        }

        public Criteria andPnb01LessThanOrEqualTo(String value) {
            addCriterion("PNB01 <=", value, "pnb01");
            return (Criteria) this;
        }

        public Criteria andPnb01Like(String value) {
            addCriterion("PNB01 like", value, "pnb01");
            return (Criteria) this;
        }

        public Criteria andPnb01NotLike(String value) {
            addCriterion("PNB01 not like", value, "pnb01");
            return (Criteria) this;
        }

        public Criteria andPnb01In(List<String> values) {
            addCriterion("PNB01 in", values, "pnb01");
            return (Criteria) this;
        }

        public Criteria andPnb01NotIn(List<String> values) {
            addCriterion("PNB01 not in", values, "pnb01");
            return (Criteria) this;
        }

        public Criteria andPnb01Between(String value1, String value2) {
            addCriterion("PNB01 between", value1, value2, "pnb01");
            return (Criteria) this;
        }

        public Criteria andPnb01NotBetween(String value1, String value2) {
            addCriterion("PNB01 not between", value1, value2, "pnb01");
            return (Criteria) this;
        }

        public Criteria andPnb02IsNull() {
            addCriterion("PNB02 is null");
            return (Criteria) this;
        }

        public Criteria andPnb02IsNotNull() {
            addCriterion("PNB02 is not null");
            return (Criteria) this;
        }

        public Criteria andPnb02EqualTo(Integer value) {
            addCriterion("PNB02 =", value, "pnb02");
            return (Criteria) this;
        }

        public Criteria andPnb02NotEqualTo(Integer value) {
            addCriterion("PNB02 <>", value, "pnb02");
            return (Criteria) this;
        }

        public Criteria andPnb02GreaterThan(Integer value) {
            addCriterion("PNB02 >", value, "pnb02");
            return (Criteria) this;
        }

        public Criteria andPnb02GreaterThanOrEqualTo(Integer value) {
            addCriterion("PNB02 >=", value, "pnb02");
            return (Criteria) this;
        }

        public Criteria andPnb02LessThan(Integer value) {
            addCriterion("PNB02 <", value, "pnb02");
            return (Criteria) this;
        }

        public Criteria andPnb02LessThanOrEqualTo(Integer value) {
            addCriterion("PNB02 <=", value, "pnb02");
            return (Criteria) this;
        }

        public Criteria andPnb02In(List<Integer> values) {
            addCriterion("PNB02 in", values, "pnb02");
            return (Criteria) this;
        }

        public Criteria andPnb02NotIn(List<Integer> values) {
            addCriterion("PNB02 not in", values, "pnb02");
            return (Criteria) this;
        }

        public Criteria andPnb02Between(Integer value1, Integer value2) {
            addCriterion("PNB02 between", value1, value2, "pnb02");
            return (Criteria) this;
        }

        public Criteria andPnb02NotBetween(Integer value1, Integer value2) {
            addCriterion("PNB02 not between", value1, value2, "pnb02");
            return (Criteria) this;
        }

        public Criteria andPnb03IsNull() {
            addCriterion("PNB03 is null");
            return (Criteria) this;
        }

        public Criteria andPnb03IsNotNull() {
            addCriterion("PNB03 is not null");
            return (Criteria) this;
        }

        public Criteria andPnb03EqualTo(Integer value) {
            addCriterion("PNB03 =", value, "pnb03");
            return (Criteria) this;
        }

        public Criteria andPnb03NotEqualTo(Integer value) {
            addCriterion("PNB03 <>", value, "pnb03");
            return (Criteria) this;
        }

        public Criteria andPnb03GreaterThan(Integer value) {
            addCriterion("PNB03 >", value, "pnb03");
            return (Criteria) this;
        }

        public Criteria andPnb03GreaterThanOrEqualTo(Integer value) {
            addCriterion("PNB03 >=", value, "pnb03");
            return (Criteria) this;
        }

        public Criteria andPnb03LessThan(Integer value) {
            addCriterion("PNB03 <", value, "pnb03");
            return (Criteria) this;
        }

        public Criteria andPnb03LessThanOrEqualTo(Integer value) {
            addCriterion("PNB03 <=", value, "pnb03");
            return (Criteria) this;
        }

        public Criteria andPnb03In(List<Integer> values) {
            addCriterion("PNB03 in", values, "pnb03");
            return (Criteria) this;
        }

        public Criteria andPnb03NotIn(List<Integer> values) {
            addCriterion("PNB03 not in", values, "pnb03");
            return (Criteria) this;
        }

        public Criteria andPnb03Between(Integer value1, Integer value2) {
            addCriterion("PNB03 between", value1, value2, "pnb03");
            return (Criteria) this;
        }

        public Criteria andPnb03NotBetween(Integer value1, Integer value2) {
            addCriterion("PNB03 not between", value1, value2, "pnb03");
            return (Criteria) this;
        }

        public Criteria andPnb20bIsNull() {
            addCriterion("PNB20B is null");
            return (Criteria) this;
        }

        public Criteria andPnb20bIsNotNull() {
            addCriterion("PNB20B is not null");
            return (Criteria) this;
        }

        public Criteria andPnb20bEqualTo(BigDecimal value) {
            addCriterion("PNB20B =", value, "pnb20b");
            return (Criteria) this;
        }

        public Criteria andPnb20bNotEqualTo(BigDecimal value) {
            addCriterion("PNB20B <>", value, "pnb20b");
            return (Criteria) this;
        }

        public Criteria andPnb20bGreaterThan(BigDecimal value) {
            addCriterion("PNB20B >", value, "pnb20b");
            return (Criteria) this;
        }

        public Criteria andPnb20bGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PNB20B >=", value, "pnb20b");
            return (Criteria) this;
        }

        public Criteria andPnb20bLessThan(BigDecimal value) {
            addCriterion("PNB20B <", value, "pnb20b");
            return (Criteria) this;
        }

        public Criteria andPnb20bLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PNB20B <=", value, "pnb20b");
            return (Criteria) this;
        }

        public Criteria andPnb20bIn(List<BigDecimal> values) {
            addCriterion("PNB20B in", values, "pnb20b");
            return (Criteria) this;
        }

        public Criteria andPnb20bNotIn(List<BigDecimal> values) {
            addCriterion("PNB20B not in", values, "pnb20b");
            return (Criteria) this;
        }

        public Criteria andPnb20bBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PNB20B between", value1, value2, "pnb20b");
            return (Criteria) this;
        }

        public Criteria andPnb20bNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PNB20B not between", value1, value2, "pnb20b");
            return (Criteria) this;
        }

        public Criteria andPnb20aIsNull() {
            addCriterion("PNB20A is null");
            return (Criteria) this;
        }

        public Criteria andPnb20aIsNotNull() {
            addCriterion("PNB20A is not null");
            return (Criteria) this;
        }

        public Criteria andPnb20aEqualTo(BigDecimal value) {
            addCriterion("PNB20A =", value, "pnb20a");
            return (Criteria) this;
        }

        public Criteria andPnb20aNotEqualTo(BigDecimal value) {
            addCriterion("PNB20A <>", value, "pnb20a");
            return (Criteria) this;
        }

        public Criteria andPnb20aGreaterThan(BigDecimal value) {
            addCriterion("PNB20A >", value, "pnb20a");
            return (Criteria) this;
        }

        public Criteria andPnb20aGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PNB20A >=", value, "pnb20a");
            return (Criteria) this;
        }

        public Criteria andPnb20aLessThan(BigDecimal value) {
            addCriterion("PNB20A <", value, "pnb20a");
            return (Criteria) this;
        }

        public Criteria andPnb20aLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PNB20A <=", value, "pnb20a");
            return (Criteria) this;
        }

        public Criteria andPnb20aIn(List<BigDecimal> values) {
            addCriterion("PNB20A in", values, "pnb20a");
            return (Criteria) this;
        }

        public Criteria andPnb20aNotIn(List<BigDecimal> values) {
            addCriterion("PNB20A not in", values, "pnb20a");
            return (Criteria) this;
        }

        public Criteria andPnb20aBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PNB20A between", value1, value2, "pnb20a");
            return (Criteria) this;
        }

        public Criteria andPnb20aNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PNB20A not between", value1, value2, "pnb20a");
            return (Criteria) this;
        }

        public Criteria andPnasenddIsNull() {
            addCriterion("PNASENDD is null");
            return (Criteria) this;
        }

        public Criteria andPnasenddIsNotNull() {
            addCriterion("PNASENDD is not null");
            return (Criteria) this;
        }

        public Criteria andPnasenddEqualTo(String value) {
            addCriterion("PNASENDD =", value, "pnasendd");
            return (Criteria) this;
        }

        public Criteria andPnasenddNotEqualTo(String value) {
            addCriterion("PNASENDD <>", value, "pnasendd");
            return (Criteria) this;
        }

        public Criteria andPnasenddGreaterThan(String value) {
            addCriterion("PNASENDD >", value, "pnasendd");
            return (Criteria) this;
        }

        public Criteria andPnasenddGreaterThanOrEqualTo(String value) {
            addCriterion("PNASENDD >=", value, "pnasendd");
            return (Criteria) this;
        }

        public Criteria andPnasenddLessThan(String value) {
            addCriterion("PNASENDD <", value, "pnasendd");
            return (Criteria) this;
        }

        public Criteria andPnasenddLessThanOrEqualTo(String value) {
            addCriterion("PNASENDD <=", value, "pnasendd");
            return (Criteria) this;
        }

        public Criteria andPnasenddLike(String value) {
            addCriterion("PNASENDD like", value, "pnasendd");
            return (Criteria) this;
        }

        public Criteria andPnasenddNotLike(String value) {
            addCriterion("PNASENDD not like", value, "pnasendd");
            return (Criteria) this;
        }

        public Criteria andPnasenddIn(List<String> values) {
            addCriterion("PNASENDD in", values, "pnasendd");
            return (Criteria) this;
        }

        public Criteria andPnasenddNotIn(List<String> values) {
            addCriterion("PNASENDD not in", values, "pnasendd");
            return (Criteria) this;
        }

        public Criteria andPnasenddBetween(String value1, String value2) {
            addCriterion("PNASENDD between", value1, value2, "pnasendd");
            return (Criteria) this;
        }

        public Criteria andPnasenddNotBetween(String value1, String value2) {
            addCriterion("PNASENDD not between", value1, value2, "pnasendd");
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