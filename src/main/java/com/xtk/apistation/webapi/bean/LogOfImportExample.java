package com.xtk.apistation.webapi.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LogOfImportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LogOfImportExample() {
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

        public Criteria andImportTimeIsNull() {
            addCriterion("IMPORT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andImportTimeIsNotNull() {
            addCriterion("IMPORT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andImportTimeEqualTo(Date value) {
            addCriterion("IMPORT_TIME =", value, "importTime");
            return (Criteria) this;
        }

        public Criteria andImportTimeNotEqualTo(Date value) {
            addCriterion("IMPORT_TIME <>", value, "importTime");
            return (Criteria) this;
        }

        public Criteria andImportTimeGreaterThan(Date value) {
            addCriterion("IMPORT_TIME >", value, "importTime");
            return (Criteria) this;
        }

        public Criteria andImportTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("IMPORT_TIME >=", value, "importTime");
            return (Criteria) this;
        }

        public Criteria andImportTimeLessThan(Date value) {
            addCriterion("IMPORT_TIME <", value, "importTime");
            return (Criteria) this;
        }

        public Criteria andImportTimeLessThanOrEqualTo(Date value) {
            addCriterion("IMPORT_TIME <=", value, "importTime");
            return (Criteria) this;
        }

        public Criteria andImportTimeIn(List<Date> values) {
            addCriterion("IMPORT_TIME in", values, "importTime");
            return (Criteria) this;
        }

        public Criteria andImportTimeNotIn(List<Date> values) {
            addCriterion("IMPORT_TIME not in", values, "importTime");
            return (Criteria) this;
        }

        public Criteria andImportTimeBetween(Date value1, Date value2) {
            addCriterion("IMPORT_TIME between", value1, value2, "importTime");
            return (Criteria) this;
        }

        public Criteria andImportTimeNotBetween(Date value1, Date value2) {
            addCriterion("IMPORT_TIME not between", value1, value2, "importTime");
            return (Criteria) this;
        }

        public Criteria andNameOfInterfaceIsNull() {
            addCriterion("NAME_OF_INTERFACE is null");
            return (Criteria) this;
        }

        public Criteria andNameOfInterfaceIsNotNull() {
            addCriterion("NAME_OF_INTERFACE is not null");
            return (Criteria) this;
        }

        public Criteria andNameOfInterfaceEqualTo(String value) {
            addCriterion("NAME_OF_INTERFACE =", value, "nameOfInterface");
            return (Criteria) this;
        }

        public Criteria andNameOfInterfaceNotEqualTo(String value) {
            addCriterion("NAME_OF_INTERFACE <>", value, "nameOfInterface");
            return (Criteria) this;
        }

        public Criteria andNameOfInterfaceGreaterThan(String value) {
            addCriterion("NAME_OF_INTERFACE >", value, "nameOfInterface");
            return (Criteria) this;
        }

        public Criteria andNameOfInterfaceGreaterThanOrEqualTo(String value) {
            addCriterion("NAME_OF_INTERFACE >=", value, "nameOfInterface");
            return (Criteria) this;
        }

        public Criteria andNameOfInterfaceLessThan(String value) {
            addCriterion("NAME_OF_INTERFACE <", value, "nameOfInterface");
            return (Criteria) this;
        }

        public Criteria andNameOfInterfaceLessThanOrEqualTo(String value) {
            addCriterion("NAME_OF_INTERFACE <=", value, "nameOfInterface");
            return (Criteria) this;
        }

        public Criteria andNameOfInterfaceLike(String value) {
            addCriterion("NAME_OF_INTERFACE like", value, "nameOfInterface");
            return (Criteria) this;
        }

        public Criteria andNameOfInterfaceNotLike(String value) {
            addCriterion("NAME_OF_INTERFACE not like", value, "nameOfInterface");
            return (Criteria) this;
        }

        public Criteria andNameOfInterfaceIn(List<String> values) {
            addCriterion("NAME_OF_INTERFACE in", values, "nameOfInterface");
            return (Criteria) this;
        }

        public Criteria andNameOfInterfaceNotIn(List<String> values) {
            addCriterion("NAME_OF_INTERFACE not in", values, "nameOfInterface");
            return (Criteria) this;
        }

        public Criteria andNameOfInterfaceBetween(String value1, String value2) {
            addCriterion("NAME_OF_INTERFACE between", value1, value2, "nameOfInterface");
            return (Criteria) this;
        }

        public Criteria andNameOfInterfaceNotBetween(String value1, String value2) {
            addCriterion("NAME_OF_INTERFACE not between", value1, value2, "nameOfInterface");
            return (Criteria) this;
        }

        public Criteria andNameOfTxtfileIsNull() {
            addCriterion("NAME_OF_TXTFILE is null");
            return (Criteria) this;
        }

        public Criteria andNameOfTxtfileIsNotNull() {
            addCriterion("NAME_OF_TXTFILE is not null");
            return (Criteria) this;
        }

        public Criteria andNameOfTxtfileEqualTo(String value) {
            addCriterion("NAME_OF_TXTFILE =", value, "nameOfTxtfile");
            return (Criteria) this;
        }

        public Criteria andNameOfTxtfileNotEqualTo(String value) {
            addCriterion("NAME_OF_TXTFILE <>", value, "nameOfTxtfile");
            return (Criteria) this;
        }

        public Criteria andNameOfTxtfileGreaterThan(String value) {
            addCriterion("NAME_OF_TXTFILE >", value, "nameOfTxtfile");
            return (Criteria) this;
        }

        public Criteria andNameOfTxtfileGreaterThanOrEqualTo(String value) {
            addCriterion("NAME_OF_TXTFILE >=", value, "nameOfTxtfile");
            return (Criteria) this;
        }

        public Criteria andNameOfTxtfileLessThan(String value) {
            addCriterion("NAME_OF_TXTFILE <", value, "nameOfTxtfile");
            return (Criteria) this;
        }

        public Criteria andNameOfTxtfileLessThanOrEqualTo(String value) {
            addCriterion("NAME_OF_TXTFILE <=", value, "nameOfTxtfile");
            return (Criteria) this;
        }

        public Criteria andNameOfTxtfileLike(String value) {
            addCriterion("NAME_OF_TXTFILE like", value, "nameOfTxtfile");
            return (Criteria) this;
        }

        public Criteria andNameOfTxtfileNotLike(String value) {
            addCriterion("NAME_OF_TXTFILE not like", value, "nameOfTxtfile");
            return (Criteria) this;
        }

        public Criteria andNameOfTxtfileIn(List<String> values) {
            addCriterion("NAME_OF_TXTFILE in", values, "nameOfTxtfile");
            return (Criteria) this;
        }

        public Criteria andNameOfTxtfileNotIn(List<String> values) {
            addCriterion("NAME_OF_TXTFILE not in", values, "nameOfTxtfile");
            return (Criteria) this;
        }

        public Criteria andNameOfTxtfileBetween(String value1, String value2) {
            addCriterion("NAME_OF_TXTFILE between", value1, value2, "nameOfTxtfile");
            return (Criteria) this;
        }

        public Criteria andNameOfTxtfileNotBetween(String value1, String value2) {
            addCriterion("NAME_OF_TXTFILE not between", value1, value2, "nameOfTxtfile");
            return (Criteria) this;
        }

        public Criteria andNumberOfLineIsNull() {
            addCriterion("NUMBER_OF_LINE is null");
            return (Criteria) this;
        }

        public Criteria andNumberOfLineIsNotNull() {
            addCriterion("NUMBER_OF_LINE is not null");
            return (Criteria) this;
        }

        public Criteria andNumberOfLineEqualTo(BigDecimal value) {
            addCriterion("NUMBER_OF_LINE =", value, "numberOfLine");
            return (Criteria) this;
        }

        public Criteria andNumberOfLineNotEqualTo(BigDecimal value) {
            addCriterion("NUMBER_OF_LINE <>", value, "numberOfLine");
            return (Criteria) this;
        }

        public Criteria andNumberOfLineGreaterThan(BigDecimal value) {
            addCriterion("NUMBER_OF_LINE >", value, "numberOfLine");
            return (Criteria) this;
        }

        public Criteria andNumberOfLineGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NUMBER_OF_LINE >=", value, "numberOfLine");
            return (Criteria) this;
        }

        public Criteria andNumberOfLineLessThan(BigDecimal value) {
            addCriterion("NUMBER_OF_LINE <", value, "numberOfLine");
            return (Criteria) this;
        }

        public Criteria andNumberOfLineLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NUMBER_OF_LINE <=", value, "numberOfLine");
            return (Criteria) this;
        }

        public Criteria andNumberOfLineIn(List<BigDecimal> values) {
            addCriterion("NUMBER_OF_LINE in", values, "numberOfLine");
            return (Criteria) this;
        }

        public Criteria andNumberOfLineNotIn(List<BigDecimal> values) {
            addCriterion("NUMBER_OF_LINE not in", values, "numberOfLine");
            return (Criteria) this;
        }

        public Criteria andNumberOfLineBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NUMBER_OF_LINE between", value1, value2, "numberOfLine");
            return (Criteria) this;
        }

        public Criteria andNumberOfLineNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NUMBER_OF_LINE not between", value1, value2, "numberOfLine");
            return (Criteria) this;
        }

        public Criteria andContentOfOnelineIsNull() {
            addCriterion("CONTENT_OF_ONELINE is null");
            return (Criteria) this;
        }

        public Criteria andContentOfOnelineIsNotNull() {
            addCriterion("CONTENT_OF_ONELINE is not null");
            return (Criteria) this;
        }

        public Criteria andContentOfOnelineEqualTo(String value) {
            addCriterion("CONTENT_OF_ONELINE =", value, "contentOfOneline");
            return (Criteria) this;
        }

        public Criteria andContentOfOnelineNotEqualTo(String value) {
            addCriterion("CONTENT_OF_ONELINE <>", value, "contentOfOneline");
            return (Criteria) this;
        }

        public Criteria andContentOfOnelineGreaterThan(String value) {
            addCriterion("CONTENT_OF_ONELINE >", value, "contentOfOneline");
            return (Criteria) this;
        }

        public Criteria andContentOfOnelineGreaterThanOrEqualTo(String value) {
            addCriterion("CONTENT_OF_ONELINE >=", value, "contentOfOneline");
            return (Criteria) this;
        }

        public Criteria andContentOfOnelineLessThan(String value) {
            addCriterion("CONTENT_OF_ONELINE <", value, "contentOfOneline");
            return (Criteria) this;
        }

        public Criteria andContentOfOnelineLessThanOrEqualTo(String value) {
            addCriterion("CONTENT_OF_ONELINE <=", value, "contentOfOneline");
            return (Criteria) this;
        }

        public Criteria andContentOfOnelineLike(String value) {
            addCriterion("CONTENT_OF_ONELINE like", value, "contentOfOneline");
            return (Criteria) this;
        }

        public Criteria andContentOfOnelineNotLike(String value) {
            addCriterion("CONTENT_OF_ONELINE not like", value, "contentOfOneline");
            return (Criteria) this;
        }

        public Criteria andContentOfOnelineIn(List<String> values) {
            addCriterion("CONTENT_OF_ONELINE in", values, "contentOfOneline");
            return (Criteria) this;
        }

        public Criteria andContentOfOnelineNotIn(List<String> values) {
            addCriterion("CONTENT_OF_ONELINE not in", values, "contentOfOneline");
            return (Criteria) this;
        }

        public Criteria andContentOfOnelineBetween(String value1, String value2) {
            addCriterion("CONTENT_OF_ONELINE between", value1, value2, "contentOfOneline");
            return (Criteria) this;
        }

        public Criteria andContentOfOnelineNotBetween(String value1, String value2) {
            addCriterion("CONTENT_OF_ONELINE not between", value1, value2, "contentOfOneline");
            return (Criteria) this;
        }

        public Criteria andResultOfImportIsNull() {
            addCriterion("RESULT_OF_IMPORT is null");
            return (Criteria) this;
        }

        public Criteria andResultOfImportIsNotNull() {
            addCriterion("RESULT_OF_IMPORT is not null");
            return (Criteria) this;
        }

        public Criteria andResultOfImportEqualTo(String value) {
            addCriterion("RESULT_OF_IMPORT =", value, "resultOfImport");
            return (Criteria) this;
        }

        public Criteria andResultOfImportNotEqualTo(String value) {
            addCriterion("RESULT_OF_IMPORT <>", value, "resultOfImport");
            return (Criteria) this;
        }

        public Criteria andResultOfImportGreaterThan(String value) {
            addCriterion("RESULT_OF_IMPORT >", value, "resultOfImport");
            return (Criteria) this;
        }

        public Criteria andResultOfImportGreaterThanOrEqualTo(String value) {
            addCriterion("RESULT_OF_IMPORT >=", value, "resultOfImport");
            return (Criteria) this;
        }

        public Criteria andResultOfImportLessThan(String value) {
            addCriterion("RESULT_OF_IMPORT <", value, "resultOfImport");
            return (Criteria) this;
        }

        public Criteria andResultOfImportLessThanOrEqualTo(String value) {
            addCriterion("RESULT_OF_IMPORT <=", value, "resultOfImport");
            return (Criteria) this;
        }

        public Criteria andResultOfImportLike(String value) {
            addCriterion("RESULT_OF_IMPORT like", value, "resultOfImport");
            return (Criteria) this;
        }

        public Criteria andResultOfImportNotLike(String value) {
            addCriterion("RESULT_OF_IMPORT not like", value, "resultOfImport");
            return (Criteria) this;
        }

        public Criteria andResultOfImportIn(List<String> values) {
            addCriterion("RESULT_OF_IMPORT in", values, "resultOfImport");
            return (Criteria) this;
        }

        public Criteria andResultOfImportNotIn(List<String> values) {
            addCriterion("RESULT_OF_IMPORT not in", values, "resultOfImport");
            return (Criteria) this;
        }

        public Criteria andResultOfImportBetween(String value1, String value2) {
            addCriterion("RESULT_OF_IMPORT between", value1, value2, "resultOfImport");
            return (Criteria) this;
        }

        public Criteria andResultOfImportNotBetween(String value1, String value2) {
            addCriterion("RESULT_OF_IMPORT not between", value1, value2, "resultOfImport");
            return (Criteria) this;
        }

        public Criteria andErrorMessageIsNull() {
            addCriterion("ERROR_MESSAGE is null");
            return (Criteria) this;
        }

        public Criteria andErrorMessageIsNotNull() {
            addCriterion("ERROR_MESSAGE is not null");
            return (Criteria) this;
        }

        public Criteria andErrorMessageEqualTo(String value) {
            addCriterion("ERROR_MESSAGE =", value, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andErrorMessageNotEqualTo(String value) {
            addCriterion("ERROR_MESSAGE <>", value, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andErrorMessageGreaterThan(String value) {
            addCriterion("ERROR_MESSAGE >", value, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andErrorMessageGreaterThanOrEqualTo(String value) {
            addCriterion("ERROR_MESSAGE >=", value, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andErrorMessageLessThan(String value) {
            addCriterion("ERROR_MESSAGE <", value, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andErrorMessageLessThanOrEqualTo(String value) {
            addCriterion("ERROR_MESSAGE <=", value, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andErrorMessageLike(String value) {
            addCriterion("ERROR_MESSAGE like", value, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andErrorMessageNotLike(String value) {
            addCriterion("ERROR_MESSAGE not like", value, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andErrorMessageIn(List<String> values) {
            addCriterion("ERROR_MESSAGE in", values, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andErrorMessageNotIn(List<String> values) {
            addCriterion("ERROR_MESSAGE not in", values, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andErrorMessageBetween(String value1, String value2) {
            addCriterion("ERROR_MESSAGE between", value1, value2, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andErrorMessageNotBetween(String value1, String value2) {
            addCriterion("ERROR_MESSAGE not between", value1, value2, "errorMessage");
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