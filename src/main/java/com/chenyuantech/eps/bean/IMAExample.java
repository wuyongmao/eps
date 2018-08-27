package com.chenyuantech.eps.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class IMAExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IMAExample() {
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

        public Criteria andIMA01IsNull() {
            addCriterion("IMA01 is null");
            return (Criteria) this;
        }

        public Criteria andIMA01IsNotNull() {
            addCriterion("IMA01 is not null");
            return (Criteria) this;
        }

        public Criteria andIMA01EqualTo(String value) {
            addCriterion("IMA01 =", value, "IMA01");
            return (Criteria) this;
        }

        public Criteria andIMA01NotEqualTo(String value) {
            addCriterion("IMA01 <>", value, "IMA01");
            return (Criteria) this;
        }

        public Criteria andIMA01GreaterThan(String value) {
            addCriterion("IMA01 >", value, "IMA01");
            return (Criteria) this;
        }

        public Criteria andIMA01GreaterThanOrEqualTo(String value) {
            addCriterion("IMA01 >=", value, "IMA01");
            return (Criteria) this;
        }

        public Criteria andIMA01LessThan(String value) {
            addCriterion("IMA01 <", value, "IMA01");
            return (Criteria) this;
        }

        public Criteria andIMA01LessThanOrEqualTo(String value) {
            addCriterion("IMA01 <=", value, "IMA01");
            return (Criteria) this;
        }

        public Criteria andIMA01Like(String value) {
            addCriterion("IMA01 like", value, "IMA01");
            return (Criteria) this;
        }

        public Criteria andIMA01NotLike(String value) {
            addCriterion("IMA01 not like", value, "IMA01");
            return (Criteria) this;
        }

        public Criteria andIMA01In(List<String> values) {
            addCriterion("IMA01 in", values, "IMA01");
            return (Criteria) this;
        }

        public Criteria andIMA01NotIn(List<String> values) {
            addCriterion("IMA01 not in", values, "IMA01");
            return (Criteria) this;
        }

        public Criteria andIMA01Between(String value1, String value2) {
            addCriterion("IMA01 between", value1, value2, "IMA01");
            return (Criteria) this;
        }

        public Criteria andIMA01NotBetween(String value1, String value2) {
            addCriterion("IMA01 not between", value1, value2, "IMA01");
            return (Criteria) this;
        }

        public Criteria andIMA02IsNull() {
            addCriterion("IMA02 is null");
            return (Criteria) this;
        }

        public Criteria andIMA02IsNotNull() {
            addCriterion("IMA02 is not null");
            return (Criteria) this;
        }

        public Criteria andIMA02EqualTo(String value) {
            addCriterion("IMA02 =", value, "IMA02");
            return (Criteria) this;
        }

        public Criteria andIMA02NotEqualTo(String value) {
            addCriterion("IMA02 <>", value, "IMA02");
            return (Criteria) this;
        }

        public Criteria andIMA02GreaterThan(String value) {
            addCriterion("IMA02 >", value, "IMA02");
            return (Criteria) this;
        }

        public Criteria andIMA02GreaterThanOrEqualTo(String value) {
            addCriterion("IMA02 >=", value, "IMA02");
            return (Criteria) this;
        }

        public Criteria andIMA02LessThan(String value) {
            addCriterion("IMA02 <", value, "IMA02");
            return (Criteria) this;
        }

        public Criteria andIMA02LessThanOrEqualTo(String value) {
            addCriterion("IMA02 <=", value, "IMA02");
            return (Criteria) this;
        }

        public Criteria andIMA02Like(String value) {
            addCriterion("IMA02 like", value, "IMA02");
            return (Criteria) this;
        }

        public Criteria andIMA02NotLike(String value) {
            addCriterion("IMA02 not like", value, "IMA02");
            return (Criteria) this;
        }

        public Criteria andIMA02In(List<String> values) {
            addCriterion("IMA02 in", values, "IMA02");
            return (Criteria) this;
        }

        public Criteria andIMA02NotIn(List<String> values) {
            addCriterion("IMA02 not in", values, "IMA02");
            return (Criteria) this;
        }

        public Criteria andIMA02Between(String value1, String value2) {
            addCriterion("IMA02 between", value1, value2, "IMA02");
            return (Criteria) this;
        }

        public Criteria andIMA02NotBetween(String value1, String value2) {
            addCriterion("IMA02 not between", value1, value2, "IMA02");
            return (Criteria) this;
        }

        public Criteria andTA_IMA01IsNull() {
            addCriterion("TA_IMA01 is null");
            return (Criteria) this;
        }

        public Criteria andTA_IMA01IsNotNull() {
            addCriterion("TA_IMA01 is not null");
            return (Criteria) this;
        }

        public Criteria andTA_IMA01EqualTo(String value) {
            addCriterion("TA_IMA01 =", value, "TA_IMA01");
            return (Criteria) this;
        }

        public Criteria andTA_IMA01NotEqualTo(String value) {
            addCriterion("TA_IMA01 <>", value, "TA_IMA01");
            return (Criteria) this;
        }

        public Criteria andTA_IMA01GreaterThan(String value) {
            addCriterion("TA_IMA01 >", value, "TA_IMA01");
            return (Criteria) this;
        }

        public Criteria andTA_IMA01GreaterThanOrEqualTo(String value) {
            addCriterion("TA_IMA01 >=", value, "TA_IMA01");
            return (Criteria) this;
        }

        public Criteria andTA_IMA01LessThan(String value) {
            addCriterion("TA_IMA01 <", value, "TA_IMA01");
            return (Criteria) this;
        }

        public Criteria andTA_IMA01LessThanOrEqualTo(String value) {
            addCriterion("TA_IMA01 <=", value, "TA_IMA01");
            return (Criteria) this;
        }

        public Criteria andTA_IMA01Like(String value) {
            addCriterion("TA_IMA01 like", value, "TA_IMA01");
            return (Criteria) this;
        }

        public Criteria andTA_IMA01NotLike(String value) {
            addCriterion("TA_IMA01 not like", value, "TA_IMA01");
            return (Criteria) this;
        }

        public Criteria andTA_IMA01In(List<String> values) {
            addCriterion("TA_IMA01 in", values, "TA_IMA01");
            return (Criteria) this;
        }

        public Criteria andTA_IMA01NotIn(List<String> values) {
            addCriterion("TA_IMA01 not in", values, "TA_IMA01");
            return (Criteria) this;
        }

        public Criteria andTA_IMA01Between(String value1, String value2) {
            addCriterion("TA_IMA01 between", value1, value2, "TA_IMA01");
            return (Criteria) this;
        }

        public Criteria andTA_IMA01NotBetween(String value1, String value2) {
            addCriterion("TA_IMA01 not between", value1, value2, "TA_IMA01");
            return (Criteria) this;
        }

        public Criteria andIMA63IsNull() {
            addCriterion("IMA63 is null");
            return (Criteria) this;
        }

        public Criteria andIMA63IsNotNull() {
            addCriterion("IMA63 is not null");
            return (Criteria) this;
        }

        public Criteria andIMA63EqualTo(String value) {
            addCriterion("IMA63 =", value, "IMA63");
            return (Criteria) this;
        }

        public Criteria andIMA63NotEqualTo(String value) {
            addCriterion("IMA63 <>", value, "IMA63");
            return (Criteria) this;
        }

        public Criteria andIMA63GreaterThan(String value) {
            addCriterion("IMA63 >", value, "IMA63");
            return (Criteria) this;
        }

        public Criteria andIMA63GreaterThanOrEqualTo(String value) {
            addCriterion("IMA63 >=", value, "IMA63");
            return (Criteria) this;
        }

        public Criteria andIMA63LessThan(String value) {
            addCriterion("IMA63 <", value, "IMA63");
            return (Criteria) this;
        }

        public Criteria andIMA63LessThanOrEqualTo(String value) {
            addCriterion("IMA63 <=", value, "IMA63");
            return (Criteria) this;
        }

        public Criteria andIMA63Like(String value) {
            addCriterion("IMA63 like", value, "IMA63");
            return (Criteria) this;
        }

        public Criteria andIMA63NotLike(String value) {
            addCriterion("IMA63 not like", value, "IMA63");
            return (Criteria) this;
        }

        public Criteria andIMA63In(List<String> values) {
            addCriterion("IMA63 in", values, "IMA63");
            return (Criteria) this;
        }

        public Criteria andIMA63NotIn(List<String> values) {
            addCriterion("IMA63 not in", values, "IMA63");
            return (Criteria) this;
        }

        public Criteria andIMA63Between(String value1, String value2) {
            addCriterion("IMA63 between", value1, value2, "IMA63");
            return (Criteria) this;
        }

        public Criteria andIMA63NotBetween(String value1, String value2) {
            addCriterion("IMA63 not between", value1, value2, "IMA63");
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

        public Criteria andIMAUD13IsNull() {
            addCriterion("IMAUD13 is null");
            return (Criteria) this;
        }

        public Criteria andIMAUD13IsNotNull() {
            addCriterion("IMAUD13 is not null");
            return (Criteria) this;
        }

        public Criteria andIMAUD13EqualTo(Date value) {
            addCriterionForJDBCDate("IMAUD13 =", value, "IMAUD13");
            return (Criteria) this;
        }

        public Criteria andIMAUD13NotEqualTo(Date value) {
            addCriterionForJDBCDate("IMAUD13 <>", value, "IMAUD13");
            return (Criteria) this;
        }

        public Criteria andIMAUD13GreaterThan(Date value) {
            addCriterionForJDBCDate("IMAUD13 >", value, "IMAUD13");
            return (Criteria) this;
        }

        public Criteria andIMAUD13GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("IMAUD13 >=", value, "IMAUD13");
            return (Criteria) this;
        }

        public Criteria andIMAUD13LessThan(Date value) {
            addCriterionForJDBCDate("IMAUD13 <", value, "IMAUD13");
            return (Criteria) this;
        }

        public Criteria andIMAUD13LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("IMAUD13 <=", value, "IMAUD13");
            return (Criteria) this;
        }

        public Criteria andIMAUD13In(List<Date> values) {
            addCriterionForJDBCDate("IMAUD13 in", values, "IMAUD13");
            return (Criteria) this;
        }

        public Criteria andIMAUD13NotIn(List<Date> values) {
            addCriterionForJDBCDate("IMAUD13 not in", values, "IMAUD13");
            return (Criteria) this;
        }

        public Criteria andIMAUD13Between(Date value1, Date value2) {
            addCriterionForJDBCDate("IMAUD13 between", value1, value2, "IMAUD13");
            return (Criteria) this;
        }

        public Criteria andIMAUD13NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("IMAUD13 not between", value1, value2, "IMAUD13");
            return (Criteria) this;
        }

        public Criteria andIMADATEIsNull() {
            addCriterion("IMADATE is null");
            return (Criteria) this;
        }

        public Criteria andIMADATEIsNotNull() {
            addCriterion("IMADATE is not null");
            return (Criteria) this;
        }

        public Criteria andIMADATEEqualTo(Date value) {
            addCriterionForJDBCDate("IMADATE =", value, "IMADATE");
            return (Criteria) this;
        }

        public Criteria andIMADATENotEqualTo(Date value) {
            addCriterionForJDBCDate("IMADATE <>", value, "IMADATE");
            return (Criteria) this;
        }

        public Criteria andIMADATEGreaterThan(Date value) {
            addCriterionForJDBCDate("IMADATE >", value, "IMADATE");
            return (Criteria) this;
        }

        public Criteria andIMADATEGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("IMADATE >=", value, "IMADATE");
            return (Criteria) this;
        }

        public Criteria andIMADATELessThan(Date value) {
            addCriterionForJDBCDate("IMADATE <", value, "IMADATE");
            return (Criteria) this;
        }

        public Criteria andIMADATELessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("IMADATE <=", value, "IMADATE");
            return (Criteria) this;
        }

        public Criteria andIMADATEIn(List<Date> values) {
            addCriterionForJDBCDate("IMADATE in", values, "IMADATE");
            return (Criteria) this;
        }

        public Criteria andIMADATENotIn(List<Date> values) {
            addCriterionForJDBCDate("IMADATE not in", values, "IMADATE");
            return (Criteria) this;
        }

        public Criteria andIMADATEBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("IMADATE between", value1, value2, "IMADATE");
            return (Criteria) this;
        }

        public Criteria andIMADATENotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("IMADATE not between", value1, value2, "IMADATE");
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