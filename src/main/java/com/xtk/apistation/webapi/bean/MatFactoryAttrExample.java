package com.xtk.apistation.webapi.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MatFactoryAttrExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MatFactoryAttrExample() {
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

        public Criteria andMaterialNumberIsNull() {
            addCriterion("MATERIAL_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andMaterialNumberIsNotNull() {
            addCriterion("MATERIAL_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialNumberEqualTo(String value) {
            addCriterion("MATERIAL_NUMBER =", value, "materialNumber");
            return (Criteria) this;
        }

        public Criteria andMaterialNumberNotEqualTo(String value) {
            addCriterion("MATERIAL_NUMBER <>", value, "materialNumber");
            return (Criteria) this;
        }

        public Criteria andMaterialNumberGreaterThan(String value) {
            addCriterion("MATERIAL_NUMBER >", value, "materialNumber");
            return (Criteria) this;
        }

        public Criteria andMaterialNumberGreaterThanOrEqualTo(String value) {
            addCriterion("MATERIAL_NUMBER >=", value, "materialNumber");
            return (Criteria) this;
        }

        public Criteria andMaterialNumberLessThan(String value) {
            addCriterion("MATERIAL_NUMBER <", value, "materialNumber");
            return (Criteria) this;
        }

        public Criteria andMaterialNumberLessThanOrEqualTo(String value) {
            addCriterion("MATERIAL_NUMBER <=", value, "materialNumber");
            return (Criteria) this;
        }

        public Criteria andMaterialNumberLike(String value) {
            addCriterion("MATERIAL_NUMBER like", value, "materialNumber");
            return (Criteria) this;
        }

        public Criteria andMaterialNumberNotLike(String value) {
            addCriterion("MATERIAL_NUMBER not like", value, "materialNumber");
            return (Criteria) this;
        }

        public Criteria andMaterialNumberIn(List<String> values) {
            addCriterion("MATERIAL_NUMBER in", values, "materialNumber");
            return (Criteria) this;
        }

        public Criteria andMaterialNumberNotIn(List<String> values) {
            addCriterion("MATERIAL_NUMBER not in", values, "materialNumber");
            return (Criteria) this;
        }

        public Criteria andMaterialNumberBetween(String value1, String value2) {
            addCriterion("MATERIAL_NUMBER between", value1, value2, "materialNumber");
            return (Criteria) this;
        }

        public Criteria andMaterialNumberNotBetween(String value1, String value2) {
            addCriterion("MATERIAL_NUMBER not between", value1, value2, "materialNumber");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("AREA is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("AREA is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("AREA =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("AREA <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("AREA >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("AREA >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("AREA <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("AREA <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("AREA like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("AREA not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("AREA in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("AREA not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("AREA between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("AREA not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andStockMaxIsNull() {
            addCriterion("STOCK_MAX is null");
            return (Criteria) this;
        }

        public Criteria andStockMaxIsNotNull() {
            addCriterion("STOCK_MAX is not null");
            return (Criteria) this;
        }

        public Criteria andStockMaxEqualTo(BigDecimal value) {
            addCriterion("STOCK_MAX =", value, "stockMax");
            return (Criteria) this;
        }

        public Criteria andStockMaxNotEqualTo(BigDecimal value) {
            addCriterion("STOCK_MAX <>", value, "stockMax");
            return (Criteria) this;
        }

        public Criteria andStockMaxGreaterThan(BigDecimal value) {
            addCriterion("STOCK_MAX >", value, "stockMax");
            return (Criteria) this;
        }

        public Criteria andStockMaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("STOCK_MAX >=", value, "stockMax");
            return (Criteria) this;
        }

        public Criteria andStockMaxLessThan(BigDecimal value) {
            addCriterion("STOCK_MAX <", value, "stockMax");
            return (Criteria) this;
        }

        public Criteria andStockMaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("STOCK_MAX <=", value, "stockMax");
            return (Criteria) this;
        }

        public Criteria andStockMaxIn(List<BigDecimal> values) {
            addCriterion("STOCK_MAX in", values, "stockMax");
            return (Criteria) this;
        }

        public Criteria andStockMaxNotIn(List<BigDecimal> values) {
            addCriterion("STOCK_MAX not in", values, "stockMax");
            return (Criteria) this;
        }

        public Criteria andStockMaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STOCK_MAX between", value1, value2, "stockMax");
            return (Criteria) this;
        }

        public Criteria andStockMaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STOCK_MAX not between", value1, value2, "stockMax");
            return (Criteria) this;
        }

        public Criteria andStockMinIsNull() {
            addCriterion("STOCK_MIN is null");
            return (Criteria) this;
        }

        public Criteria andStockMinIsNotNull() {
            addCriterion("STOCK_MIN is not null");
            return (Criteria) this;
        }

        public Criteria andStockMinEqualTo(BigDecimal value) {
            addCriterion("STOCK_MIN =", value, "stockMin");
            return (Criteria) this;
        }

        public Criteria andStockMinNotEqualTo(BigDecimal value) {
            addCriterion("STOCK_MIN <>", value, "stockMin");
            return (Criteria) this;
        }

        public Criteria andStockMinGreaterThan(BigDecimal value) {
            addCriterion("STOCK_MIN >", value, "stockMin");
            return (Criteria) this;
        }

        public Criteria andStockMinGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("STOCK_MIN >=", value, "stockMin");
            return (Criteria) this;
        }

        public Criteria andStockMinLessThan(BigDecimal value) {
            addCriterion("STOCK_MIN <", value, "stockMin");
            return (Criteria) this;
        }

        public Criteria andStockMinLessThanOrEqualTo(BigDecimal value) {
            addCriterion("STOCK_MIN <=", value, "stockMin");
            return (Criteria) this;
        }

        public Criteria andStockMinIn(List<BigDecimal> values) {
            addCriterion("STOCK_MIN in", values, "stockMin");
            return (Criteria) this;
        }

        public Criteria andStockMinNotIn(List<BigDecimal> values) {
            addCriterion("STOCK_MIN not in", values, "stockMin");
            return (Criteria) this;
        }

        public Criteria andStockMinBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STOCK_MIN between", value1, value2, "stockMin");
            return (Criteria) this;
        }

        public Criteria andStockMinNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STOCK_MIN not between", value1, value2, "stockMin");
            return (Criteria) this;
        }

        public Criteria andQualityAssuranceIsNull() {
            addCriterion("QUALITY_ASSURANCE is null");
            return (Criteria) this;
        }

        public Criteria andQualityAssuranceIsNotNull() {
            addCriterion("QUALITY_ASSURANCE is not null");
            return (Criteria) this;
        }

        public Criteria andQualityAssuranceEqualTo(BigDecimal value) {
            addCriterion("QUALITY_ASSURANCE =", value, "qualityAssurance");
            return (Criteria) this;
        }

        public Criteria andQualityAssuranceNotEqualTo(BigDecimal value) {
            addCriterion("QUALITY_ASSURANCE <>", value, "qualityAssurance");
            return (Criteria) this;
        }

        public Criteria andQualityAssuranceGreaterThan(BigDecimal value) {
            addCriterion("QUALITY_ASSURANCE >", value, "qualityAssurance");
            return (Criteria) this;
        }

        public Criteria andQualityAssuranceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QUALITY_ASSURANCE >=", value, "qualityAssurance");
            return (Criteria) this;
        }

        public Criteria andQualityAssuranceLessThan(BigDecimal value) {
            addCriterion("QUALITY_ASSURANCE <", value, "qualityAssurance");
            return (Criteria) this;
        }

        public Criteria andQualityAssuranceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QUALITY_ASSURANCE <=", value, "qualityAssurance");
            return (Criteria) this;
        }

        public Criteria andQualityAssuranceIn(List<BigDecimal> values) {
            addCriterion("QUALITY_ASSURANCE in", values, "qualityAssurance");
            return (Criteria) this;
        }

        public Criteria andQualityAssuranceNotIn(List<BigDecimal> values) {
            addCriterion("QUALITY_ASSURANCE not in", values, "qualityAssurance");
            return (Criteria) this;
        }

        public Criteria andQualityAssuranceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QUALITY_ASSURANCE between", value1, value2, "qualityAssurance");
            return (Criteria) this;
        }

        public Criteria andQualityAssuranceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QUALITY_ASSURANCE not between", value1, value2, "qualityAssurance");
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