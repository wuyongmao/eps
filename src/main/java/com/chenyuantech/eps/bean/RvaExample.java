package com.chenyuantech.eps.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class RvaExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public RvaExample() {
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

        public Criteria andRva01IsNull() {
            addCriterion("RVA01 is null");
            return (Criteria) this;
        }

        public Criteria andRva01IsNotNull() {
            addCriterion("RVA01 is not null");
            return (Criteria) this;
        }

        public Criteria andRva01EqualTo(String value) {
            addCriterion("RVA01 =", value, "rva01");
            return (Criteria) this;
        }

        public Criteria andRva01NotEqualTo(String value) {
            addCriterion("RVA01 <>", value, "rva01");
            return (Criteria) this;
        }

        public Criteria andRva01GreaterThan(String value) {
            addCriterion("RVA01 >", value, "rva01");
            return (Criteria) this;
        }

        public Criteria andRva01GreaterThanOrEqualTo(String value) {
            addCriterion("RVA01 >=", value, "rva01");
            return (Criteria) this;
        }

        public Criteria andRva01LessThan(String value) {
            addCriterion("RVA01 <", value, "rva01");
            return (Criteria) this;
        }

        public Criteria andRva01LessThanOrEqualTo(String value) {
            addCriterion("RVA01 <=", value, "rva01");
            return (Criteria) this;
        }

        public Criteria andRva01Like(String value) {
            addCriterion("RVA01 like", value, "rva01");
            return (Criteria) this;
        }

        public Criteria andRva01NotLike(String value) {
            addCriterion("RVA01 not like", value, "rva01");
            return (Criteria) this;
        }

        public Criteria andRva01In(List<String> values) {
            addCriterion("RVA01 in", values, "rva01");
            return (Criteria) this;
        }

        public Criteria andRva01NotIn(List<String> values) {
            addCriterion("RVA01 not in", values, "rva01");
            return (Criteria) this;
        }

        public Criteria andRva01Between(String value1, String value2) {
            addCriterion("RVA01 between", value1, value2, "rva01");
            return (Criteria) this;
        }

        public Criteria andRva01NotBetween(String value1, String value2) {
            addCriterion("RVA01 not between", value1, value2, "rva01");
            return (Criteria) this;
        }

        public Criteria andRva02IsNull() {
            addCriterion("RVA02 is null");
            return (Criteria) this;
        }

        public Criteria andRva02IsNotNull() {
            addCriterion("RVA02 is not null");
            return (Criteria) this;
        }

        public Criteria andRva02EqualTo(String value) {
            addCriterion("RVA02 =", value, "rva02");
            return (Criteria) this;
        }

        public Criteria andRva02NotEqualTo(String value) {
            addCriterion("RVA02 <>", value, "rva02");
            return (Criteria) this;
        }

        public Criteria andRva02GreaterThan(String value) {
            addCriterion("RVA02 >", value, "rva02");
            return (Criteria) this;
        }

        public Criteria andRva02GreaterThanOrEqualTo(String value) {
            addCriterion("RVA02 >=", value, "rva02");
            return (Criteria) this;
        }

        public Criteria andRva02LessThan(String value) {
            addCriterion("RVA02 <", value, "rva02");
            return (Criteria) this;
        }

        public Criteria andRva02LessThanOrEqualTo(String value) {
            addCriterion("RVA02 <=", value, "rva02");
            return (Criteria) this;
        }

        public Criteria andRva02Like(String value) {
            addCriterion("RVA02 like", value, "rva02");
            return (Criteria) this;
        }

        public Criteria andRva02NotLike(String value) {
            addCriterion("RVA02 not like", value, "rva02");
            return (Criteria) this;
        }

        public Criteria andRva02In(List<String> values) {
            addCriterion("RVA02 in", values, "rva02");
            return (Criteria) this;
        }

        public Criteria andRva02NotIn(List<String> values) {
            addCriterion("RVA02 not in", values, "rva02");
            return (Criteria) this;
        }

        public Criteria andRva02Between(String value1, String value2) {
            addCriterion("RVA02 between", value1, value2, "rva02");
            return (Criteria) this;
        }

        public Criteria andRva02NotBetween(String value1, String value2) {
            addCriterion("RVA02 not between", value1, value2, "rva02");
            return (Criteria) this;
        }

        public Criteria andRva06IsNull() {
            addCriterion("RVA06 is null");
            return (Criteria) this;
        }

        public Criteria andRva06IsNotNull() {
            addCriterion("RVA06 is not null");
            return (Criteria) this;
        }

        public Criteria andRva06EqualTo(String value) {
            addCriterion("RVA06 =", value, "rva06");
            return (Criteria) this;
        }

        public Criteria andRva06NotEqualTo(String value) {
            addCriterion("RVA06 <>", value, "rva06");
            return (Criteria) this;
        }

        public Criteria andRva06GreaterThan(String value) {
            addCriterion("RVA06 >", value, "rva06");
            return (Criteria) this;
        }

        public Criteria andRva06GreaterThanOrEqualTo(String value) {
            addCriterion("RVA06 >=", value, "rva06");
            return (Criteria) this;
        }

        public Criteria andRva06LessThan(String value) {
            addCriterion("RVA06 <", value, "rva06");
            return (Criteria) this;
        }

        public Criteria andRva06LessThanOrEqualTo(String value) {
            addCriterion("RVA06 <=", value, "rva06");
            return (Criteria) this;
        }

        public Criteria andRva06Like(String value) {
            addCriterion("RVA06 like", value, "rva06");
            return (Criteria) this;
        }

        public Criteria andRva06NotLike(String value) {
            addCriterion("RVA06 not like", value, "rva06");
            return (Criteria) this;
        }

        public Criteria andRva06In(List<String> values) {
            addCriterion("RVA06 in", values, "rva06");
            return (Criteria) this;
        }

        public Criteria andRva06NotIn(List<String> values) {
            addCriterion("RVA06 not in", values, "rva06");
            return (Criteria) this;
        }

        public Criteria andRva06Between(String value1, String value2) {
            addCriterion("RVA06 between", value1, value2, "rva06");
            return (Criteria) this;
        }

        public Criteria andRva06NotBetween(String value1, String value2) {
            addCriterion("RVA06 not between", value1, value2, "rva06");
            return (Criteria) this;
        }

        public Criteria andRva32IsNull() {
            addCriterion("RVA32 is null");
            return (Criteria) this;
        }

        public Criteria andRva32IsNotNull() {
            addCriterion("RVA32 is not null");
            return (Criteria) this;
        }

        public Criteria andRva32EqualTo(String value) {
            addCriterion("RVA32 =", value, "rva32");
            return (Criteria) this;
        }

        public Criteria andRva32NotEqualTo(String value) {
            addCriterion("RVA32 <>", value, "rva32");
            return (Criteria) this;
        }

        public Criteria andRva32GreaterThan(String value) {
            addCriterion("RVA32 >", value, "rva32");
            return (Criteria) this;
        }

        public Criteria andRva32GreaterThanOrEqualTo(String value) {
            addCriterion("RVA32 >=", value, "rva32");
            return (Criteria) this;
        }

        public Criteria andRva32LessThan(String value) {
            addCriterion("RVA32 <", value, "rva32");
            return (Criteria) this;
        }

        public Criteria andRva32LessThanOrEqualTo(String value) {
            addCriterion("RVA32 <=", value, "rva32");
            return (Criteria) this;
        }

        public Criteria andRva32Like(String value) {
            addCriterion("RVA32 like", value, "rva32");
            return (Criteria) this;
        }

        public Criteria andRva32NotLike(String value) {
            addCriterion("RVA32 not like", value, "rva32");
            return (Criteria) this;
        }

        public Criteria andRva32In(List<String> values) {
            addCriterion("RVA32 in", values, "rva32");
            return (Criteria) this;
        }

        public Criteria andRva32NotIn(List<String> values) {
            addCriterion("RVA32 not in", values, "rva32");
            return (Criteria) this;
        }

        public Criteria andRva32Between(String value1, String value2) {
            addCriterion("RVA32 between", value1, value2, "rva32");
            return (Criteria) this;
        }

        public Criteria andRva32NotBetween(String value1, String value2) {
            addCriterion("RVA32 not between", value1, value2, "rva32");
            return (Criteria) this;
        }

        public Criteria andRvaconfIsNull() {
            addCriterion("RVACONF is null");
            return (Criteria) this;
        }

        public Criteria andRvaconfIsNotNull() {
            addCriterion("RVACONF is not null");
            return (Criteria) this;
        }

        public Criteria andRvaconfEqualTo(String value) {
            addCriterion("RVACONF =", value, "rvaconf");
            return (Criteria) this;
        }

        public Criteria andRvaconfNotEqualTo(String value) {
            addCriterion("RVACONF <>", value, "rvaconf");
            return (Criteria) this;
        }

        public Criteria andRvaconfGreaterThan(String value) {
            addCriterion("RVACONF >", value, "rvaconf");
            return (Criteria) this;
        }

        public Criteria andRvaconfGreaterThanOrEqualTo(String value) {
            addCriterion("RVACONF >=", value, "rvaconf");
            return (Criteria) this;
        }

        public Criteria andRvaconfLessThan(String value) {
            addCriterion("RVACONF <", value, "rvaconf");
            return (Criteria) this;
        }

        public Criteria andRvaconfLessThanOrEqualTo(String value) {
            addCriterion("RVACONF <=", value, "rvaconf");
            return (Criteria) this;
        }

        public Criteria andRvaconfLike(String value) {
            addCriterion("RVACONF like", value, "rvaconf");
            return (Criteria) this;
        }

        public Criteria andRvaconfNotLike(String value) {
            addCriterion("RVACONF not like", value, "rvaconf");
            return (Criteria) this;
        }

        public Criteria andRvaconfIn(List<String> values) {
            addCriterion("RVACONF in", values, "rvaconf");
            return (Criteria) this;
        }

        public Criteria andRvaconfNotIn(List<String> values) {
            addCriterion("RVACONF not in", values, "rvaconf");
            return (Criteria) this;
        }

        public Criteria andRvaconfBetween(String value1, String value2) {
            addCriterion("RVACONF between", value1, value2, "rvaconf");
            return (Criteria) this;
        }

        public Criteria andRvaconfNotBetween(String value1, String value2) {
            addCriterion("RVACONF not between", value1, value2, "rvaconf");
            return (Criteria) this;
        }

        public Criteria andRvauserIsNull() {
            addCriterion("RVAUSER is null");
            return (Criteria) this;
        }

        public Criteria andRvauserIsNotNull() {
            addCriterion("RVAUSER is not null");
            return (Criteria) this;
        }

        public Criteria andRvauserEqualTo(String value) {
            addCriterion("RVAUSER =", value, "rvauser");
            return (Criteria) this;
        }

        public Criteria andRvauserNotEqualTo(String value) {
            addCriterion("RVAUSER <>", value, "rvauser");
            return (Criteria) this;
        }

        public Criteria andRvauserGreaterThan(String value) {
            addCriterion("RVAUSER >", value, "rvauser");
            return (Criteria) this;
        }

        public Criteria andRvauserGreaterThanOrEqualTo(String value) {
            addCriterion("RVAUSER >=", value, "rvauser");
            return (Criteria) this;
        }

        public Criteria andRvauserLessThan(String value) {
            addCriterion("RVAUSER <", value, "rvauser");
            return (Criteria) this;
        }

        public Criteria andRvauserLessThanOrEqualTo(String value) {
            addCriterion("RVAUSER <=", value, "rvauser");
            return (Criteria) this;
        }

        public Criteria andRvauserLike(String value) {
            addCriterion("RVAUSER like", value, "rvauser");
            return (Criteria) this;
        }

        public Criteria andRvauserNotLike(String value) {
            addCriterion("RVAUSER not like", value, "rvauser");
            return (Criteria) this;
        }

        public Criteria andRvauserIn(List<String> values) {
            addCriterion("RVAUSER in", values, "rvauser");
            return (Criteria) this;
        }

        public Criteria andRvauserNotIn(List<String> values) {
            addCriterion("RVAUSER not in", values, "rvauser");
            return (Criteria) this;
        }

        public Criteria andRvauserBetween(String value1, String value2) {
            addCriterion("RVAUSER between", value1, value2, "rvauser");
            return (Criteria) this;
        }

        public Criteria andRvauserNotBetween(String value1, String value2) {
            addCriterion("RVAUSER not between", value1, value2, "rvauser");
            return (Criteria) this;
        }

        public Criteria andRvaoriuIsNull() {
            addCriterion("RVAORIU is null");
            return (Criteria) this;
        }

        public Criteria andRvaoriuIsNotNull() {
            addCriterion("RVAORIU is not null");
            return (Criteria) this;
        }

        public Criteria andRvaoriuEqualTo(String value) {
            addCriterion("RVAORIU =", value, "rvaoriu");
            return (Criteria) this;
        }

        public Criteria andRvaoriuNotEqualTo(String value) {
            addCriterion("RVAORIU <>", value, "rvaoriu");
            return (Criteria) this;
        }

        public Criteria andRvaoriuGreaterThan(String value) {
            addCriterion("RVAORIU >", value, "rvaoriu");
            return (Criteria) this;
        }

        public Criteria andRvaoriuGreaterThanOrEqualTo(String value) {
            addCriterion("RVAORIU >=", value, "rvaoriu");
            return (Criteria) this;
        }

        public Criteria andRvaoriuLessThan(String value) {
            addCriterion("RVAORIU <", value, "rvaoriu");
            return (Criteria) this;
        }

        public Criteria andRvaoriuLessThanOrEqualTo(String value) {
            addCriterion("RVAORIU <=", value, "rvaoriu");
            return (Criteria) this;
        }

        public Criteria andRvaoriuLike(String value) {
            addCriterion("RVAORIU like", value, "rvaoriu");
            return (Criteria) this;
        }

        public Criteria andRvaoriuNotLike(String value) {
            addCriterion("RVAORIU not like", value, "rvaoriu");
            return (Criteria) this;
        }

        public Criteria andRvaoriuIn(List<String> values) {
            addCriterion("RVAORIU in", values, "rvaoriu");
            return (Criteria) this;
        }

        public Criteria andRvaoriuNotIn(List<String> values) {
            addCriterion("RVAORIU not in", values, "rvaoriu");
            return (Criteria) this;
        }

        public Criteria andRvaoriuBetween(String value1, String value2) {
            addCriterion("RVAORIU between", value1, value2, "rvaoriu");
            return (Criteria) this;
        }

        public Criteria andRvaoriuNotBetween(String value1, String value2) {
            addCriterion("RVAORIU not between", value1, value2, "rvaoriu");
            return (Criteria) this;
        }

        public Criteria andRuamoduIsNull() {
            addCriterion("RUAMODU is null");
            return (Criteria) this;
        }

        public Criteria andRuamoduIsNotNull() {
            addCriterion("RUAMODU is not null");
            return (Criteria) this;
        }

        public Criteria andRuamoduEqualTo(String value) {
            addCriterion("RUAMODU =", value, "ruamodu");
            return (Criteria) this;
        }

        public Criteria andRuamoduNotEqualTo(String value) {
            addCriterion("RUAMODU <>", value, "ruamodu");
            return (Criteria) this;
        }

        public Criteria andRuamoduGreaterThan(String value) {
            addCriterion("RUAMODU >", value, "ruamodu");
            return (Criteria) this;
        }

        public Criteria andRuamoduGreaterThanOrEqualTo(String value) {
            addCriterion("RUAMODU >=", value, "ruamodu");
            return (Criteria) this;
        }

        public Criteria andRuamoduLessThan(String value) {
            addCriterion("RUAMODU <", value, "ruamodu");
            return (Criteria) this;
        }

        public Criteria andRuamoduLessThanOrEqualTo(String value) {
            addCriterion("RUAMODU <=", value, "ruamodu");
            return (Criteria) this;
        }

        public Criteria andRuamoduLike(String value) {
            addCriterion("RUAMODU like", value, "ruamodu");
            return (Criteria) this;
        }

        public Criteria andRuamoduNotLike(String value) {
            addCriterion("RUAMODU not like", value, "ruamodu");
            return (Criteria) this;
        }

        public Criteria andRuamoduIn(List<String> values) {
            addCriterion("RUAMODU in", values, "ruamodu");
            return (Criteria) this;
        }

        public Criteria andRuamoduNotIn(List<String> values) {
            addCriterion("RUAMODU not in", values, "ruamodu");
            return (Criteria) this;
        }

        public Criteria andRuamoduBetween(String value1, String value2) {
            addCriterion("RUAMODU between", value1, value2, "ruamodu");
            return (Criteria) this;
        }

        public Criteria andRuamoduNotBetween(String value1, String value2) {
            addCriterion("RUAMODU not between", value1, value2, "ruamodu");
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