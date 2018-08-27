package com.chenyuantech.eps.bean;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class INSPECTIONExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public INSPECTIONExample() {
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

        public Criteria andREGULATIONIDIsNull() {
            addCriterion("REGULATIONID is null");
            return (Criteria) this;
        }

        public Criteria andREGULATIONIDIsNotNull() {
            addCriterion("REGULATIONID is not null");
            return (Criteria) this;
        }

        public Criteria andREGULATIONIDEqualTo(String value) {
            addCriterion("REGULATIONID =", value, "REGULATIONID");
            return (Criteria) this;
        }

        public Criteria andREGULATIONIDNotEqualTo(String value) {
            addCriterion("REGULATIONID <>", value, "REGULATIONID");
            return (Criteria) this;
        }

        public Criteria andREGULATIONIDGreaterThan(String value) {
            addCriterion("REGULATIONID >", value, "REGULATIONID");
            return (Criteria) this;
        }

        public Criteria andREGULATIONIDGreaterThanOrEqualTo(String value) {
            addCriterion("REGULATIONID >=", value, "REGULATIONID");
            return (Criteria) this;
        }

        public Criteria andREGULATIONIDLessThan(String value) {
            addCriterion("REGULATIONID <", value, "REGULATIONID");
            return (Criteria) this;
        }

        public Criteria andREGULATIONIDLessThanOrEqualTo(String value) {
            addCriterion("REGULATIONID <=", value, "REGULATIONID");
            return (Criteria) this;
        }

        public Criteria andREGULATIONIDLike(String value) {
            addCriterion("REGULATIONID like", value, "REGULATIONID");
            return (Criteria) this;
        }

        public Criteria andREGULATIONIDNotLike(String value) {
            addCriterion("REGULATIONID not like", value, "REGULATIONID");
            return (Criteria) this;
        }

        public Criteria andREGULATIONIDIn(List<String> values) {
            addCriterion("REGULATIONID in", values, "REGULATIONID");
            return (Criteria) this;
        }

        public Criteria andREGULATIONIDNotIn(List<String> values) {
            addCriterion("REGULATIONID not in", values, "REGULATIONID");
            return (Criteria) this;
        }

        public Criteria andREGULATIONIDBetween(String value1, String value2) {
            addCriterion("REGULATIONID between", value1, value2, "REGULATIONID");
            return (Criteria) this;
        }

        public Criteria andREGULATIONIDNotBetween(String value1, String value2) {
            addCriterion("REGULATIONID not between", value1, value2, "REGULATIONID");
            return (Criteria) this;
        }

        public Criteria andDELLOTMINIsNull() {
            addCriterion("DELLOTMIN is null");
            return (Criteria) this;
        }

        public Criteria andDELLOTMINIsNotNull() {
            addCriterion("DELLOTMIN is not null");
            return (Criteria) this;
        }

        public Criteria andDELLOTMINEqualTo(String value) {
            addCriterion("DELLOTMIN =", value, "DELLOTMIN");
            return (Criteria) this;
        }

        public Criteria andDELLOTMINNotEqualTo(String value) {
            addCriterion("DELLOTMIN <>", value, "DELLOTMIN");
            return (Criteria) this;
        }

        public Criteria andDELLOTMINGreaterThan(String value) {
            addCriterion("DELLOTMIN >", value, "DELLOTMIN");
            return (Criteria) this;
        }

        public Criteria andDELLOTMINGreaterThanOrEqualTo(String value) {
            addCriterion("DELLOTMIN >=", value, "DELLOTMIN");
            return (Criteria) this;
        }

        public Criteria andDELLOTMINLessThan(String value) {
            addCriterion("DELLOTMIN <", value, "DELLOTMIN");
            return (Criteria) this;
        }

        public Criteria andDELLOTMINLessThanOrEqualTo(String value) {
            addCriterion("DELLOTMIN <=", value, "DELLOTMIN");
            return (Criteria) this;
        }

        public Criteria andDELLOTMINLike(String value) {
            addCriterion("DELLOTMIN like", value, "DELLOTMIN");
            return (Criteria) this;
        }

        public Criteria andDELLOTMINNotLike(String value) {
            addCriterion("DELLOTMIN not like", value, "DELLOTMIN");
            return (Criteria) this;
        }

        public Criteria andDELLOTMINIn(List<String> values) {
            addCriterion("DELLOTMIN in", values, "DELLOTMIN");
            return (Criteria) this;
        }

        public Criteria andDELLOTMINNotIn(List<String> values) {
            addCriterion("DELLOTMIN not in", values, "DELLOTMIN");
            return (Criteria) this;
        }

        public Criteria andDELLOTMINBetween(String value1, String value2) {
            addCriterion("DELLOTMIN between", value1, value2, "DELLOTMIN");
            return (Criteria) this;
        }

        public Criteria andDELLOTMINNotBetween(String value1, String value2) {
            addCriterion("DELLOTMIN not between", value1, value2, "DELLOTMIN");
            return (Criteria) this;
        }

        public Criteria andDELLOTMAXIsNull() {
            addCriterion("DELLOTMAX is null");
            return (Criteria) this;
        }

        public Criteria andDELLOTMAXIsNotNull() {
            addCriterion("DELLOTMAX is not null");
            return (Criteria) this;
        }

        public Criteria andDELLOTMAXEqualTo(String value) {
            addCriterion("DELLOTMAX =", value, "DELLOTMAX");
            return (Criteria) this;
        }

        public Criteria andDELLOTMAXNotEqualTo(String value) {
            addCriterion("DELLOTMAX <>", value, "DELLOTMAX");
            return (Criteria) this;
        }

        public Criteria andDELLOTMAXGreaterThan(String value) {
            addCriterion("DELLOTMAX >", value, "DELLOTMAX");
            return (Criteria) this;
        }

        public Criteria andDELLOTMAXGreaterThanOrEqualTo(String value) {
            addCriterion("DELLOTMAX >=", value, "DELLOTMAX");
            return (Criteria) this;
        }

        public Criteria andDELLOTMAXLessThan(String value) {
            addCriterion("DELLOTMAX <", value, "DELLOTMAX");
            return (Criteria) this;
        }

        public Criteria andDELLOTMAXLessThanOrEqualTo(String value) {
            addCriterion("DELLOTMAX <=", value, "DELLOTMAX");
            return (Criteria) this;
        }

        public Criteria andDELLOTMAXLike(String value) {
            addCriterion("DELLOTMAX like", value, "DELLOTMAX");
            return (Criteria) this;
        }

        public Criteria andDELLOTMAXNotLike(String value) {
            addCriterion("DELLOTMAX not like", value, "DELLOTMAX");
            return (Criteria) this;
        }

        public Criteria andDELLOTMAXIn(List<String> values) {
            addCriterion("DELLOTMAX in", values, "DELLOTMAX");
            return (Criteria) this;
        }

        public Criteria andDELLOTMAXNotIn(List<String> values) {
            addCriterion("DELLOTMAX not in", values, "DELLOTMAX");
            return (Criteria) this;
        }

        public Criteria andDELLOTMAXBetween(String value1, String value2) {
            addCriterion("DELLOTMAX between", value1, value2, "DELLOTMAX");
            return (Criteria) this;
        }

        public Criteria andDELLOTMAXNotBetween(String value1, String value2) {
            addCriterion("DELLOTMAX not between", value1, value2, "DELLOTMAX");
            return (Criteria) this;
        }

        public Criteria andSAMPLESIsNull() {
            addCriterion("SAMPLES is null");
            return (Criteria) this;
        }

        public Criteria andSAMPLESIsNotNull() {
            addCriterion("SAMPLES is not null");
            return (Criteria) this;
        }

        public Criteria andSAMPLESEqualTo(String value) {
            addCriterion("SAMPLES =", value, "SAMPLES");
            return (Criteria) this;
        }

        public Criteria andSAMPLESNotEqualTo(String value) {
            addCriterion("SAMPLES <>", value, "SAMPLES");
            return (Criteria) this;
        }

        public Criteria andSAMPLESGreaterThan(String value) {
            addCriterion("SAMPLES >", value, "SAMPLES");
            return (Criteria) this;
        }

        public Criteria andSAMPLESGreaterThanOrEqualTo(String value) {
            addCriterion("SAMPLES >=", value, "SAMPLES");
            return (Criteria) this;
        }

        public Criteria andSAMPLESLessThan(String value) {
            addCriterion("SAMPLES <", value, "SAMPLES");
            return (Criteria) this;
        }

        public Criteria andSAMPLESLessThanOrEqualTo(String value) {
            addCriterion("SAMPLES <=", value, "SAMPLES");
            return (Criteria) this;
        }

        public Criteria andSAMPLESLike(String value) {
            addCriterion("SAMPLES like", value, "SAMPLES");
            return (Criteria) this;
        }

        public Criteria andSAMPLESNotLike(String value) {
            addCriterion("SAMPLES not like", value, "SAMPLES");
            return (Criteria) this;
        }

        public Criteria andSAMPLESIn(List<String> values) {
            addCriterion("SAMPLES in", values, "SAMPLES");
            return (Criteria) this;
        }

        public Criteria andSAMPLESNotIn(List<String> values) {
            addCriterion("SAMPLES not in", values, "SAMPLES");
            return (Criteria) this;
        }

        public Criteria andSAMPLESBetween(String value1, String value2) {
            addCriterion("SAMPLES between", value1, value2, "SAMPLES");
            return (Criteria) this;
        }

        public Criteria andSAMPLESNotBetween(String value1, String value2) {
            addCriterion("SAMPLES not between", value1, value2, "SAMPLES");
            return (Criteria) this;
        }

        public Criteria andACIsNull() {
            addCriterion("AC is null");
            return (Criteria) this;
        }

        public Criteria andACIsNotNull() {
            addCriterion("AC is not null");
            return (Criteria) this;
        }

        public Criteria andACEqualTo(String value) {
            addCriterion("AC =", value, "AC");
            return (Criteria) this;
        }

        public Criteria andACNotEqualTo(String value) {
            addCriterion("AC <>", value, "AC");
            return (Criteria) this;
        }

        public Criteria andACGreaterThan(String value) {
            addCriterion("AC >", value, "AC");
            return (Criteria) this;
        }

        public Criteria andACGreaterThanOrEqualTo(String value) {
            addCriterion("AC >=", value, "AC");
            return (Criteria) this;
        }

        public Criteria andACLessThan(String value) {
            addCriterion("AC <", value, "AC");
            return (Criteria) this;
        }

        public Criteria andACLessThanOrEqualTo(String value) {
            addCriterion("AC <=", value, "AC");
            return (Criteria) this;
        }

        public Criteria andACLike(String value) {
            addCriterion("AC like", value, "AC");
            return (Criteria) this;
        }

        public Criteria andACNotLike(String value) {
            addCriterion("AC not like", value, "AC");
            return (Criteria) this;
        }

        public Criteria andACIn(List<String> values) {
            addCriterion("AC in", values, "AC");
            return (Criteria) this;
        }

        public Criteria andACNotIn(List<String> values) {
            addCriterion("AC not in", values, "AC");
            return (Criteria) this;
        }

        public Criteria andACBetween(String value1, String value2) {
            addCriterion("AC between", value1, value2, "AC");
            return (Criteria) this;
        }

        public Criteria andACNotBetween(String value1, String value2) {
            addCriterion("AC not between", value1, value2, "AC");
            return (Criteria) this;
        }

        public Criteria andREIsNull() {
            addCriterion("RE is null");
            return (Criteria) this;
        }

        public Criteria andREIsNotNull() {
            addCriterion("RE is not null");
            return (Criteria) this;
        }

        public Criteria andREEqualTo(String value) {
            addCriterion("RE =", value, "RE");
            return (Criteria) this;
        }

        public Criteria andRENotEqualTo(String value) {
            addCriterion("RE <>", value, "RE");
            return (Criteria) this;
        }

        public Criteria andREGreaterThan(String value) {
            addCriterion("RE >", value, "RE");
            return (Criteria) this;
        }

        public Criteria andREGreaterThanOrEqualTo(String value) {
            addCriterion("RE >=", value, "RE");
            return (Criteria) this;
        }

        public Criteria andRELessThan(String value) {
            addCriterion("RE <", value, "RE");
            return (Criteria) this;
        }

        public Criteria andRELessThanOrEqualTo(String value) {
            addCriterion("RE <=", value, "RE");
            return (Criteria) this;
        }

        public Criteria andRELike(String value) {
            addCriterion("RE like", value, "RE");
            return (Criteria) this;
        }

        public Criteria andRENotLike(String value) {
            addCriterion("RE not like", value, "RE");
            return (Criteria) this;
        }

        public Criteria andREIn(List<String> values) {
            addCriterion("RE in", values, "RE");
            return (Criteria) this;
        }

        public Criteria andRENotIn(List<String> values) {
            addCriterion("RE not in", values, "RE");
            return (Criteria) this;
        }

        public Criteria andREBetween(String value1, String value2) {
            addCriterion("RE between", value1, value2, "RE");
            return (Criteria) this;
        }

        public Criteria andRENotBetween(String value1, String value2) {
            addCriterion("RE not between", value1, value2, "RE");
            return (Criteria) this;
        }

        public Criteria andINPUTTERIsNull() {
            addCriterion("INPUTTER is null");
            return (Criteria) this;
        }

        public Criteria andINPUTTERIsNotNull() {
            addCriterion("INPUTTER is not null");
            return (Criteria) this;
        }

        public Criteria andINPUTTEREqualTo(String value) {
            addCriterion("INPUTTER =", value, "INPUTTER");
            return (Criteria) this;
        }

        public Criteria andINPUTTERNotEqualTo(String value) {
            addCriterion("INPUTTER <>", value, "INPUTTER");
            return (Criteria) this;
        }

        public Criteria andINPUTTERGreaterThan(String value) {
            addCriterion("INPUTTER >", value, "INPUTTER");
            return (Criteria) this;
        }

        public Criteria andINPUTTERGreaterThanOrEqualTo(String value) {
            addCriterion("INPUTTER >=", value, "INPUTTER");
            return (Criteria) this;
        }

        public Criteria andINPUTTERLessThan(String value) {
            addCriterion("INPUTTER <", value, "INPUTTER");
            return (Criteria) this;
        }

        public Criteria andINPUTTERLessThanOrEqualTo(String value) {
            addCriterion("INPUTTER <=", value, "INPUTTER");
            return (Criteria) this;
        }

        public Criteria andINPUTTERLike(String value) {
            addCriterion("INPUTTER like", value, "INPUTTER");
            return (Criteria) this;
        }

        public Criteria andINPUTTERNotLike(String value) {
            addCriterion("INPUTTER not like", value, "INPUTTER");
            return (Criteria) this;
        }

        public Criteria andINPUTTERIn(List<String> values) {
            addCriterion("INPUTTER in", values, "INPUTTER");
            return (Criteria) this;
        }

        public Criteria andINPUTTERNotIn(List<String> values) {
            addCriterion("INPUTTER not in", values, "INPUTTER");
            return (Criteria) this;
        }

        public Criteria andINPUTTERBetween(String value1, String value2) {
            addCriterion("INPUTTER between", value1, value2, "INPUTTER");
            return (Criteria) this;
        }

        public Criteria andINPUTTERNotBetween(String value1, String value2) {
            addCriterion("INPUTTER not between", value1, value2, "INPUTTER");
            return (Criteria) this;
        }

        public Criteria andINPUTDATEIsNull() {
            addCriterion("INPUTDATE is null");
            return (Criteria) this;
        }

        public Criteria andINPUTDATEIsNotNull() {
            addCriterion("INPUTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andINPUTDATEEqualTo(String value) {
            addCriterion("INPUTDATE =", value, "INPUTDATE");
            return (Criteria) this;
        }

        public Criteria andINPUTDATENotEqualTo(String value) {
            addCriterion("INPUTDATE <>", value, "INPUTDATE");
            return (Criteria) this;
        }

        public Criteria andINPUTDATEGreaterThan(String value) {
            addCriterion("INPUTDATE >", value, "INPUTDATE");
            return (Criteria) this;
        }

        public Criteria andINPUTDATEGreaterThanOrEqualTo(String value) {
            addCriterion("INPUTDATE >=", value, "INPUTDATE");
            return (Criteria) this;
        }

        public Criteria andINPUTDATELessThan(String value) {
            addCriterion("INPUTDATE <", value, "INPUTDATE");
            return (Criteria) this;
        }

        public Criteria andINPUTDATELessThanOrEqualTo(String value) {
            addCriterion("INPUTDATE <=", value, "INPUTDATE");
            return (Criteria) this;
        }

        public Criteria andINPUTDATELike(String value) {
            addCriterion("INPUTDATE like", value, "INPUTDATE");
            return (Criteria) this;
        }

        public Criteria andINPUTDATENotLike(String value) {
            addCriterion("INPUTDATE not like", value, "INPUTDATE");
            return (Criteria) this;
        }

        public Criteria andINPUTDATEIn(List<String> values) {
            addCriterion("INPUTDATE in", values, "INPUTDATE");
            return (Criteria) this;
        }

        public Criteria andINPUTDATENotIn(List<String> values) {
            addCriterion("INPUTDATE not in", values, "INPUTDATE");
            return (Criteria) this;
        }

        public Criteria andINPUTDATEBetween(String value1, String value2) {
            addCriterion("INPUTDATE between", value1, value2, "INPUTDATE");
            return (Criteria) this;
        }

        public Criteria andINPUTDATENotBetween(String value1, String value2) {
            addCriterion("INPUTDATE not between", value1, value2, "INPUTDATE");
            return (Criteria) this;
        }

        public Criteria andCONFIRMIsNull() {
            addCriterion("CONFIRM is null");
            return (Criteria) this;
        }

        public Criteria andCONFIRMIsNotNull() {
            addCriterion("CONFIRM is not null");
            return (Criteria) this;
        }

        public Criteria andCONFIRMEqualTo(String value) {
            addCriterion("CONFIRM =", value, "CONFIRM");
            return (Criteria) this;
        }

        public Criteria andCONFIRMNotEqualTo(String value) {
            addCriterion("CONFIRM <>", value, "CONFIRM");
            return (Criteria) this;
        }

        public Criteria andCONFIRMGreaterThan(String value) {
            addCriterion("CONFIRM >", value, "CONFIRM");
            return (Criteria) this;
        }

        public Criteria andCONFIRMGreaterThanOrEqualTo(String value) {
            addCriterion("CONFIRM >=", value, "CONFIRM");
            return (Criteria) this;
        }

        public Criteria andCONFIRMLessThan(String value) {
            addCriterion("CONFIRM <", value, "CONFIRM");
            return (Criteria) this;
        }

        public Criteria andCONFIRMLessThanOrEqualTo(String value) {
            addCriterion("CONFIRM <=", value, "CONFIRM");
            return (Criteria) this;
        }

        public Criteria andCONFIRMLike(String value) {
            addCriterion("CONFIRM like", value, "CONFIRM");
            return (Criteria) this;
        }

        public Criteria andCONFIRMNotLike(String value) {
            addCriterion("CONFIRM not like", value, "CONFIRM");
            return (Criteria) this;
        }

        public Criteria andCONFIRMIn(List<String> values) {
            addCriterion("CONFIRM in", values, "CONFIRM");
            return (Criteria) this;
        }

        public Criteria andCONFIRMNotIn(List<String> values) {
            addCriterion("CONFIRM not in", values, "CONFIRM");
            return (Criteria) this;
        }

        public Criteria andCONFIRMBetween(String value1, String value2) {
            addCriterion("CONFIRM between", value1, value2, "CONFIRM");
            return (Criteria) this;
        }

        public Criteria andCONFIRMNotBetween(String value1, String value2) {
            addCriterion("CONFIRM not between", value1, value2, "CONFIRM");
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