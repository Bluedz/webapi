package com.xtk.apistation.webapi.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MatRequestResultExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MatRequestResultExample() {
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

        public Criteria andTidIsNull() {
            addCriterion("TID is null");
            return (Criteria) this;
        }

        public Criteria andTidIsNotNull() {
            addCriterion("TID is not null");
            return (Criteria) this;
        }

        public Criteria andTidEqualTo(BigDecimal value) {
            addCriterion("TID =", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotEqualTo(BigDecimal value) {
            addCriterion("TID <>", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThan(BigDecimal value) {
            addCriterion("TID >", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TID >=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThan(BigDecimal value) {
            addCriterion("TID <", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TID <=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidIn(List<BigDecimal> values) {
            addCriterion("TID in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotIn(List<BigDecimal> values) {
            addCriterion("TID not in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TID between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TID not between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andSerialNumberIsNull() {
            addCriterion("SERIAL_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andSerialNumberIsNotNull() {
            addCriterion("SERIAL_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andSerialNumberEqualTo(BigDecimal value) {
            addCriterion("SERIAL_NUMBER =", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotEqualTo(BigDecimal value) {
            addCriterion("SERIAL_NUMBER <>", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberGreaterThan(BigDecimal value) {
            addCriterion("SERIAL_NUMBER >", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SERIAL_NUMBER >=", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberLessThan(BigDecimal value) {
            addCriterion("SERIAL_NUMBER <", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SERIAL_NUMBER <=", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberIn(List<BigDecimal> values) {
            addCriterion("SERIAL_NUMBER in", values, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotIn(List<BigDecimal> values) {
            addCriterion("SERIAL_NUMBER not in", values, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SERIAL_NUMBER between", value1, value2, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SERIAL_NUMBER not between", value1, value2, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andCustPoIsNull() {
            addCriterion("CUST_PO is null");
            return (Criteria) this;
        }

        public Criteria andCustPoIsNotNull() {
            addCriterion("CUST_PO is not null");
            return (Criteria) this;
        }

        public Criteria andCustPoEqualTo(String value) {
            addCriterion("CUST_PO =", value, "custPo");
            return (Criteria) this;
        }

        public Criteria andCustPoNotEqualTo(String value) {
            addCriterion("CUST_PO <>", value, "custPo");
            return (Criteria) this;
        }

        public Criteria andCustPoGreaterThan(String value) {
            addCriterion("CUST_PO >", value, "custPo");
            return (Criteria) this;
        }

        public Criteria andCustPoGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_PO >=", value, "custPo");
            return (Criteria) this;
        }

        public Criteria andCustPoLessThan(String value) {
            addCriterion("CUST_PO <", value, "custPo");
            return (Criteria) this;
        }

        public Criteria andCustPoLessThanOrEqualTo(String value) {
            addCriterion("CUST_PO <=", value, "custPo");
            return (Criteria) this;
        }

        public Criteria andCustPoLike(String value) {
            addCriterion("CUST_PO like", value, "custPo");
            return (Criteria) this;
        }

        public Criteria andCustPoNotLike(String value) {
            addCriterion("CUST_PO not like", value, "custPo");
            return (Criteria) this;
        }

        public Criteria andCustPoIn(List<String> values) {
            addCriterion("CUST_PO in", values, "custPo");
            return (Criteria) this;
        }

        public Criteria andCustPoNotIn(List<String> values) {
            addCriterion("CUST_PO not in", values, "custPo");
            return (Criteria) this;
        }

        public Criteria andCustPoBetween(String value1, String value2) {
            addCriterion("CUST_PO between", value1, value2, "custPo");
            return (Criteria) this;
        }

        public Criteria andCustPoNotBetween(String value1, String value2) {
            addCriterion("CUST_PO not between", value1, value2, "custPo");
            return (Criteria) this;
        }

        public Criteria andCustResultIsNull() {
            addCriterion("CUST_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andCustResultIsNotNull() {
            addCriterion("CUST_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andCustResultEqualTo(String value) {
            addCriterion("CUST_RESULT =", value, "custResult");
            return (Criteria) this;
        }

        public Criteria andCustResultNotEqualTo(String value) {
            addCriterion("CUST_RESULT <>", value, "custResult");
            return (Criteria) this;
        }

        public Criteria andCustResultGreaterThan(String value) {
            addCriterion("CUST_RESULT >", value, "custResult");
            return (Criteria) this;
        }

        public Criteria andCustResultGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_RESULT >=", value, "custResult");
            return (Criteria) this;
        }

        public Criteria andCustResultLessThan(String value) {
            addCriterion("CUST_RESULT <", value, "custResult");
            return (Criteria) this;
        }

        public Criteria andCustResultLessThanOrEqualTo(String value) {
            addCriterion("CUST_RESULT <=", value, "custResult");
            return (Criteria) this;
        }

        public Criteria andCustResultLike(String value) {
            addCriterion("CUST_RESULT like", value, "custResult");
            return (Criteria) this;
        }

        public Criteria andCustResultNotLike(String value) {
            addCriterion("CUST_RESULT not like", value, "custResult");
            return (Criteria) this;
        }

        public Criteria andCustResultIn(List<String> values) {
            addCriterion("CUST_RESULT in", values, "custResult");
            return (Criteria) this;
        }

        public Criteria andCustResultNotIn(List<String> values) {
            addCriterion("CUST_RESULT not in", values, "custResult");
            return (Criteria) this;
        }

        public Criteria andCustResultBetween(String value1, String value2) {
            addCriterion("CUST_RESULT between", value1, value2, "custResult");
            return (Criteria) this;
        }

        public Criteria andCustResultNotBetween(String value1, String value2) {
            addCriterion("CUST_RESULT not between", value1, value2, "custResult");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeIsNull() {
            addCriterion("FEEDBACK_TIME is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeIsNotNull() {
            addCriterion("FEEDBACK_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeEqualTo(String value) {
            addCriterion("FEEDBACK_TIME =", value, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeNotEqualTo(String value) {
            addCriterion("FEEDBACK_TIME <>", value, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeGreaterThan(String value) {
            addCriterion("FEEDBACK_TIME >", value, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeGreaterThanOrEqualTo(String value) {
            addCriterion("FEEDBACK_TIME >=", value, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeLessThan(String value) {
            addCriterion("FEEDBACK_TIME <", value, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeLessThanOrEqualTo(String value) {
            addCriterion("FEEDBACK_TIME <=", value, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeLike(String value) {
            addCriterion("FEEDBACK_TIME like", value, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeNotLike(String value) {
            addCriterion("FEEDBACK_TIME not like", value, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeIn(List<String> values) {
            addCriterion("FEEDBACK_TIME in", values, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeNotIn(List<String> values) {
            addCriterion("FEEDBACK_TIME not in", values, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeBetween(String value1, String value2) {
            addCriterion("FEEDBACK_TIME between", value1, value2, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeNotBetween(String value1, String value2) {
            addCriterion("FEEDBACK_TIME not between", value1, value2, "feedbackTime");
            return (Criteria) this;
        }
    }

    /**
     */
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