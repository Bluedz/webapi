package com.xtk.apistation.webapi.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MatPurchasingStatusExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MatPurchasingStatusExample() {
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

        public Criteria andRequestIdIsNull() {
            addCriterion("REQUEST_ID is null");
            return (Criteria) this;
        }

        public Criteria andRequestIdIsNotNull() {
            addCriterion("REQUEST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRequestIdEqualTo(String value) {
            addCriterion("REQUEST_ID =", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdNotEqualTo(String value) {
            addCriterion("REQUEST_ID <>", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdGreaterThan(String value) {
            addCriterion("REQUEST_ID >", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdGreaterThanOrEqualTo(String value) {
            addCriterion("REQUEST_ID >=", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdLessThan(String value) {
            addCriterion("REQUEST_ID <", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdLessThanOrEqualTo(String value) {
            addCriterion("REQUEST_ID <=", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdLike(String value) {
            addCriterion("REQUEST_ID like", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdNotLike(String value) {
            addCriterion("REQUEST_ID not like", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdIn(List<String> values) {
            addCriterion("REQUEST_ID in", values, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdNotIn(List<String> values) {
            addCriterion("REQUEST_ID not in", values, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdBetween(String value1, String value2) {
            addCriterion("REQUEST_ID between", value1, value2, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdNotBetween(String value1, String value2) {
            addCriterion("REQUEST_ID not between", value1, value2, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestNumIsNull() {
            addCriterion("REQUEST_NUM is null");
            return (Criteria) this;
        }

        public Criteria andRequestNumIsNotNull() {
            addCriterion("REQUEST_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andRequestNumEqualTo(String value) {
            addCriterion("REQUEST_NUM =", value, "requestNum");
            return (Criteria) this;
        }

        public Criteria andRequestNumNotEqualTo(String value) {
            addCriterion("REQUEST_NUM <>", value, "requestNum");
            return (Criteria) this;
        }

        public Criteria andRequestNumGreaterThan(String value) {
            addCriterion("REQUEST_NUM >", value, "requestNum");
            return (Criteria) this;
        }

        public Criteria andRequestNumGreaterThanOrEqualTo(String value) {
            addCriterion("REQUEST_NUM >=", value, "requestNum");
            return (Criteria) this;
        }

        public Criteria andRequestNumLessThan(String value) {
            addCriterion("REQUEST_NUM <", value, "requestNum");
            return (Criteria) this;
        }

        public Criteria andRequestNumLessThanOrEqualTo(String value) {
            addCriterion("REQUEST_NUM <=", value, "requestNum");
            return (Criteria) this;
        }

        public Criteria andRequestNumLike(String value) {
            addCriterion("REQUEST_NUM like", value, "requestNum");
            return (Criteria) this;
        }

        public Criteria andRequestNumNotLike(String value) {
            addCriterion("REQUEST_NUM not like", value, "requestNum");
            return (Criteria) this;
        }

        public Criteria andRequestNumIn(List<String> values) {
            addCriterion("REQUEST_NUM in", values, "requestNum");
            return (Criteria) this;
        }

        public Criteria andRequestNumNotIn(List<String> values) {
            addCriterion("REQUEST_NUM not in", values, "requestNum");
            return (Criteria) this;
        }

        public Criteria andRequestNumBetween(String value1, String value2) {
            addCriterion("REQUEST_NUM between", value1, value2, "requestNum");
            return (Criteria) this;
        }

        public Criteria andRequestNumNotBetween(String value1, String value2) {
            addCriterion("REQUEST_NUM not between", value1, value2, "requestNum");
            return (Criteria) this;
        }

        public Criteria andNodeStatsIsNull() {
            addCriterion("NODE_STATS is null");
            return (Criteria) this;
        }

        public Criteria andNodeStatsIsNotNull() {
            addCriterion("NODE_STATS is not null");
            return (Criteria) this;
        }

        public Criteria andNodeStatsEqualTo(String value) {
            addCriterion("NODE_STATS =", value, "nodeStats");
            return (Criteria) this;
        }

        public Criteria andNodeStatsNotEqualTo(String value) {
            addCriterion("NODE_STATS <>", value, "nodeStats");
            return (Criteria) this;
        }

        public Criteria andNodeStatsGreaterThan(String value) {
            addCriterion("NODE_STATS >", value, "nodeStats");
            return (Criteria) this;
        }

        public Criteria andNodeStatsGreaterThanOrEqualTo(String value) {
            addCriterion("NODE_STATS >=", value, "nodeStats");
            return (Criteria) this;
        }

        public Criteria andNodeStatsLessThan(String value) {
            addCriterion("NODE_STATS <", value, "nodeStats");
            return (Criteria) this;
        }

        public Criteria andNodeStatsLessThanOrEqualTo(String value) {
            addCriterion("NODE_STATS <=", value, "nodeStats");
            return (Criteria) this;
        }

        public Criteria andNodeStatsLike(String value) {
            addCriterion("NODE_STATS like", value, "nodeStats");
            return (Criteria) this;
        }

        public Criteria andNodeStatsNotLike(String value) {
            addCriterion("NODE_STATS not like", value, "nodeStats");
            return (Criteria) this;
        }

        public Criteria andNodeStatsIn(List<String> values) {
            addCriterion("NODE_STATS in", values, "nodeStats");
            return (Criteria) this;
        }

        public Criteria andNodeStatsNotIn(List<String> values) {
            addCriterion("NODE_STATS not in", values, "nodeStats");
            return (Criteria) this;
        }

        public Criteria andNodeStatsBetween(String value1, String value2) {
            addCriterion("NODE_STATS between", value1, value2, "nodeStats");
            return (Criteria) this;
        }

        public Criteria andNodeStatsNotBetween(String value1, String value2) {
            addCriterion("NODE_STATS not between", value1, value2, "nodeStats");
            return (Criteria) this;
        }

        public Criteria andNodeTimeIsNull() {
            addCriterion("NODE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andNodeTimeIsNotNull() {
            addCriterion("NODE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andNodeTimeEqualTo(String value) {
            addCriterion("NODE_TIME =", value, "nodeTime");
            return (Criteria) this;
        }

        public Criteria andNodeTimeNotEqualTo(String value) {
            addCriterion("NODE_TIME <>", value, "nodeTime");
            return (Criteria) this;
        }

        public Criteria andNodeTimeGreaterThan(String value) {
            addCriterion("NODE_TIME >", value, "nodeTime");
            return (Criteria) this;
        }

        public Criteria andNodeTimeGreaterThanOrEqualTo(String value) {
            addCriterion("NODE_TIME >=", value, "nodeTime");
            return (Criteria) this;
        }

        public Criteria andNodeTimeLessThan(String value) {
            addCriterion("NODE_TIME <", value, "nodeTime");
            return (Criteria) this;
        }

        public Criteria andNodeTimeLessThanOrEqualTo(String value) {
            addCriterion("NODE_TIME <=", value, "nodeTime");
            return (Criteria) this;
        }

        public Criteria andNodeTimeLike(String value) {
            addCriterion("NODE_TIME like", value, "nodeTime");
            return (Criteria) this;
        }

        public Criteria andNodeTimeNotLike(String value) {
            addCriterion("NODE_TIME not like", value, "nodeTime");
            return (Criteria) this;
        }

        public Criteria andNodeTimeIn(List<String> values) {
            addCriterion("NODE_TIME in", values, "nodeTime");
            return (Criteria) this;
        }

        public Criteria andNodeTimeNotIn(List<String> values) {
            addCriterion("NODE_TIME not in", values, "nodeTime");
            return (Criteria) this;
        }

        public Criteria andNodeTimeBetween(String value1, String value2) {
            addCriterion("NODE_TIME between", value1, value2, "nodeTime");
            return (Criteria) this;
        }

        public Criteria andNodeTimeNotBetween(String value1, String value2) {
            addCriterion("NODE_TIME not between", value1, value2, "nodeTime");
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