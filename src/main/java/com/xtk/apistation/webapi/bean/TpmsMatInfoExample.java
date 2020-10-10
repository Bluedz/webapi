package com.xtk.apistation.webapi.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TpmsMatInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TpmsMatInfoExample() {
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

        public Criteria andDcMatnumIsNull() {
            addCriterion("DC_MATNUM is null");
            return (Criteria) this;
        }

        public Criteria andDcMatnumIsNotNull() {
            addCriterion("DC_MATNUM is not null");
            return (Criteria) this;
        }

        public Criteria andDcMatnumEqualTo(String value) {
            addCriterion("DC_MATNUM =", value, "dcMatnum");
            return (Criteria) this;
        }

        public Criteria andDcMatnumNotEqualTo(String value) {
            addCriterion("DC_MATNUM <>", value, "dcMatnum");
            return (Criteria) this;
        }

        public Criteria andDcMatnumGreaterThan(String value) {
            addCriterion("DC_MATNUM >", value, "dcMatnum");
            return (Criteria) this;
        }

        public Criteria andDcMatnumGreaterThanOrEqualTo(String value) {
            addCriterion("DC_MATNUM >=", value, "dcMatnum");
            return (Criteria) this;
        }

        public Criteria andDcMatnumLessThan(String value) {
            addCriterion("DC_MATNUM <", value, "dcMatnum");
            return (Criteria) this;
        }

        public Criteria andDcMatnumLessThanOrEqualTo(String value) {
            addCriterion("DC_MATNUM <=", value, "dcMatnum");
            return (Criteria) this;
        }

        public Criteria andDcMatnumLike(String value) {
            addCriterion("DC_MATNUM like", value, "dcMatnum");
            return (Criteria) this;
        }

        public Criteria andDcMatnumNotLike(String value) {
            addCriterion("DC_MATNUM not like", value, "dcMatnum");
            return (Criteria) this;
        }

        public Criteria andDcMatnumIn(List<String> values) {
            addCriterion("DC_MATNUM in", values, "dcMatnum");
            return (Criteria) this;
        }

        public Criteria andDcMatnumNotIn(List<String> values) {
            addCriterion("DC_MATNUM not in", values, "dcMatnum");
            return (Criteria) this;
        }

        public Criteria andDcMatnumBetween(String value1, String value2) {
            addCriterion("DC_MATNUM between", value1, value2, "dcMatnum");
            return (Criteria) this;
        }

        public Criteria andDcMatnumNotBetween(String value1, String value2) {
            addCriterion("DC_MATNUM not between", value1, value2, "dcMatnum");
            return (Criteria) this;
        }

        public Criteria andSvwMatnumIsNull() {
            addCriterion("SVW_MATNUM is null");
            return (Criteria) this;
        }

        public Criteria andSvwMatnumIsNotNull() {
            addCriterion("SVW_MATNUM is not null");
            return (Criteria) this;
        }

        public Criteria andSvwMatnumEqualTo(String value) {
            addCriterion("SVW_MATNUM =", value, "svwMatnum");
            return (Criteria) this;
        }

        public Criteria andSvwMatnumNotEqualTo(String value) {
            addCriterion("SVW_MATNUM <>", value, "svwMatnum");
            return (Criteria) this;
        }

        public Criteria andSvwMatnumGreaterThan(String value) {
            addCriterion("SVW_MATNUM >", value, "svwMatnum");
            return (Criteria) this;
        }

        public Criteria andSvwMatnumGreaterThanOrEqualTo(String value) {
            addCriterion("SVW_MATNUM >=", value, "svwMatnum");
            return (Criteria) this;
        }

        public Criteria andSvwMatnumLessThan(String value) {
            addCriterion("SVW_MATNUM <", value, "svwMatnum");
            return (Criteria) this;
        }

        public Criteria andSvwMatnumLessThanOrEqualTo(String value) {
            addCriterion("SVW_MATNUM <=", value, "svwMatnum");
            return (Criteria) this;
        }

        public Criteria andSvwMatnumLike(String value) {
            addCriterion("SVW_MATNUM like", value, "svwMatnum");
            return (Criteria) this;
        }

        public Criteria andSvwMatnumNotLike(String value) {
            addCriterion("SVW_MATNUM not like", value, "svwMatnum");
            return (Criteria) this;
        }

        public Criteria andSvwMatnumIn(List<String> values) {
            addCriterion("SVW_MATNUM in", values, "svwMatnum");
            return (Criteria) this;
        }

        public Criteria andSvwMatnumNotIn(List<String> values) {
            addCriterion("SVW_MATNUM not in", values, "svwMatnum");
            return (Criteria) this;
        }

        public Criteria andSvwMatnumBetween(String value1, String value2) {
            addCriterion("SVW_MATNUM between", value1, value2, "svwMatnum");
            return (Criteria) this;
        }

        public Criteria andSvwMatnumNotBetween(String value1, String value2) {
            addCriterion("SVW_MATNUM not between", value1, value2, "svwMatnum");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("UNIT is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("UNIT =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("UNIT <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("UNIT >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("UNIT >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("UNIT <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("UNIT <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("UNIT like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("UNIT not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("UNIT in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("UNIT not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("UNIT between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("UNIT not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andDescSpecIsNull() {
            addCriterion("DESC_SPEC is null");
            return (Criteria) this;
        }

        public Criteria andDescSpecIsNotNull() {
            addCriterion("DESC_SPEC is not null");
            return (Criteria) this;
        }

        public Criteria andDescSpecEqualTo(String value) {
            addCriterion("DESC_SPEC =", value, "descSpec");
            return (Criteria) this;
        }

        public Criteria andDescSpecNotEqualTo(String value) {
            addCriterion("DESC_SPEC <>", value, "descSpec");
            return (Criteria) this;
        }

        public Criteria andDescSpecGreaterThan(String value) {
            addCriterion("DESC_SPEC >", value, "descSpec");
            return (Criteria) this;
        }

        public Criteria andDescSpecGreaterThanOrEqualTo(String value) {
            addCriterion("DESC_SPEC >=", value, "descSpec");
            return (Criteria) this;
        }

        public Criteria andDescSpecLessThan(String value) {
            addCriterion("DESC_SPEC <", value, "descSpec");
            return (Criteria) this;
        }

        public Criteria andDescSpecLessThanOrEqualTo(String value) {
            addCriterion("DESC_SPEC <=", value, "descSpec");
            return (Criteria) this;
        }

        public Criteria andDescSpecLike(String value) {
            addCriterion("DESC_SPEC like", value, "descSpec");
            return (Criteria) this;
        }

        public Criteria andDescSpecNotLike(String value) {
            addCriterion("DESC_SPEC not like", value, "descSpec");
            return (Criteria) this;
        }

        public Criteria andDescSpecIn(List<String> values) {
            addCriterion("DESC_SPEC in", values, "descSpec");
            return (Criteria) this;
        }

        public Criteria andDescSpecNotIn(List<String> values) {
            addCriterion("DESC_SPEC not in", values, "descSpec");
            return (Criteria) this;
        }

        public Criteria andDescSpecBetween(String value1, String value2) {
            addCriterion("DESC_SPEC between", value1, value2, "descSpec");
            return (Criteria) this;
        }

        public Criteria andDescSpecNotBetween(String value1, String value2) {
            addCriterion("DESC_SPEC not between", value1, value2, "descSpec");
            return (Criteria) this;
        }

        public Criteria andOgSpecIsNull() {
            addCriterion("OG_SPEC is null");
            return (Criteria) this;
        }

        public Criteria andOgSpecIsNotNull() {
            addCriterion("OG_SPEC is not null");
            return (Criteria) this;
        }

        public Criteria andOgSpecEqualTo(String value) {
            addCriterion("OG_SPEC =", value, "ogSpec");
            return (Criteria) this;
        }

        public Criteria andOgSpecNotEqualTo(String value) {
            addCriterion("OG_SPEC <>", value, "ogSpec");
            return (Criteria) this;
        }

        public Criteria andOgSpecGreaterThan(String value) {
            addCriterion("OG_SPEC >", value, "ogSpec");
            return (Criteria) this;
        }

        public Criteria andOgSpecGreaterThanOrEqualTo(String value) {
            addCriterion("OG_SPEC >=", value, "ogSpec");
            return (Criteria) this;
        }

        public Criteria andOgSpecLessThan(String value) {
            addCriterion("OG_SPEC <", value, "ogSpec");
            return (Criteria) this;
        }

        public Criteria andOgSpecLessThanOrEqualTo(String value) {
            addCriterion("OG_SPEC <=", value, "ogSpec");
            return (Criteria) this;
        }

        public Criteria andOgSpecLike(String value) {
            addCriterion("OG_SPEC like", value, "ogSpec");
            return (Criteria) this;
        }

        public Criteria andOgSpecNotLike(String value) {
            addCriterion("OG_SPEC not like", value, "ogSpec");
            return (Criteria) this;
        }

        public Criteria andOgSpecIn(List<String> values) {
            addCriterion("OG_SPEC in", values, "ogSpec");
            return (Criteria) this;
        }

        public Criteria andOgSpecNotIn(List<String> values) {
            addCriterion("OG_SPEC not in", values, "ogSpec");
            return (Criteria) this;
        }

        public Criteria andOgSpecBetween(String value1, String value2) {
            addCriterion("OG_SPEC between", value1, value2, "ogSpec");
            return (Criteria) this;
        }

        public Criteria andOgSpecNotBetween(String value1, String value2) {
            addCriterion("OG_SPEC not between", value1, value2, "ogSpec");
            return (Criteria) this;
        }

        public Criteria andMfrIsNull() {
            addCriterion("MFR is null");
            return (Criteria) this;
        }

        public Criteria andMfrIsNotNull() {
            addCriterion("MFR is not null");
            return (Criteria) this;
        }

        public Criteria andMfrEqualTo(String value) {
            addCriterion("MFR =", value, "mfr");
            return (Criteria) this;
        }

        public Criteria andMfrNotEqualTo(String value) {
            addCriterion("MFR <>", value, "mfr");
            return (Criteria) this;
        }

        public Criteria andMfrGreaterThan(String value) {
            addCriterion("MFR >", value, "mfr");
            return (Criteria) this;
        }

        public Criteria andMfrGreaterThanOrEqualTo(String value) {
            addCriterion("MFR >=", value, "mfr");
            return (Criteria) this;
        }

        public Criteria andMfrLessThan(String value) {
            addCriterion("MFR <", value, "mfr");
            return (Criteria) this;
        }

        public Criteria andMfrLessThanOrEqualTo(String value) {
            addCriterion("MFR <=", value, "mfr");
            return (Criteria) this;
        }

        public Criteria andMfrLike(String value) {
            addCriterion("MFR like", value, "mfr");
            return (Criteria) this;
        }

        public Criteria andMfrNotLike(String value) {
            addCriterion("MFR not like", value, "mfr");
            return (Criteria) this;
        }

        public Criteria andMfrIn(List<String> values) {
            addCriterion("MFR in", values, "mfr");
            return (Criteria) this;
        }

        public Criteria andMfrNotIn(List<String> values) {
            addCriterion("MFR not in", values, "mfr");
            return (Criteria) this;
        }

        public Criteria andMfrBetween(String value1, String value2) {
            addCriterion("MFR between", value1, value2, "mfr");
            return (Criteria) this;
        }

        public Criteria andMfrNotBetween(String value1, String value2) {
            addCriterion("MFR not between", value1, value2, "mfr");
            return (Criteria) this;
        }

        public Criteria andMfrNoIsNull() {
            addCriterion("`MFR _NO` is null");
            return (Criteria) this;
        }

        public Criteria andMfrNoIsNotNull() {
            addCriterion("`MFR _NO` is not null");
            return (Criteria) this;
        }

        public Criteria andMfrNoEqualTo(String value) {
            addCriterion("`MFR _NO` =", value, "mfrNo");
            return (Criteria) this;
        }

        public Criteria andMfrNoNotEqualTo(String value) {
            addCriterion("`MFR _NO` <>", value, "mfrNo");
            return (Criteria) this;
        }

        public Criteria andMfrNoGreaterThan(String value) {
            addCriterion("`MFR _NO` >", value, "mfrNo");
            return (Criteria) this;
        }

        public Criteria andMfrNoGreaterThanOrEqualTo(String value) {
            addCriterion("`MFR _NO` >=", value, "mfrNo");
            return (Criteria) this;
        }

        public Criteria andMfrNoLessThan(String value) {
            addCriterion("`MFR _NO` <", value, "mfrNo");
            return (Criteria) this;
        }

        public Criteria andMfrNoLessThanOrEqualTo(String value) {
            addCriterion("`MFR _NO` <=", value, "mfrNo");
            return (Criteria) this;
        }

        public Criteria andMfrNoLike(String value) {
            addCriterion("`MFR _NO` like", value, "mfrNo");
            return (Criteria) this;
        }

        public Criteria andMfrNoNotLike(String value) {
            addCriterion("`MFR _NO` not like", value, "mfrNo");
            return (Criteria) this;
        }

        public Criteria andMfrNoIn(List<String> values) {
            addCriterion("`MFR _NO` in", values, "mfrNo");
            return (Criteria) this;
        }

        public Criteria andMfrNoNotIn(List<String> values) {
            addCriterion("`MFR _NO` not in", values, "mfrNo");
            return (Criteria) this;
        }

        public Criteria andMfrNoBetween(String value1, String value2) {
            addCriterion("`MFR _NO` between", value1, value2, "mfrNo");
            return (Criteria) this;
        }

        public Criteria andMfrNoNotBetween(String value1, String value2) {
            addCriterion("`MFR _NO` not between", value1, value2, "mfrNo");
            return (Criteria) this;
        }

        public Criteria andEquipMfrIsNull() {
            addCriterion("`EQUIP_ MFR` is null");
            return (Criteria) this;
        }

        public Criteria andEquipMfrIsNotNull() {
            addCriterion("`EQUIP_ MFR` is not null");
            return (Criteria) this;
        }

        public Criteria andEquipMfrEqualTo(String value) {
            addCriterion("`EQUIP_ MFR` =", value, "equipMfr");
            return (Criteria) this;
        }

        public Criteria andEquipMfrNotEqualTo(String value) {
            addCriterion("`EQUIP_ MFR` <>", value, "equipMfr");
            return (Criteria) this;
        }

        public Criteria andEquipMfrGreaterThan(String value) {
            addCriterion("`EQUIP_ MFR` >", value, "equipMfr");
            return (Criteria) this;
        }

        public Criteria andEquipMfrGreaterThanOrEqualTo(String value) {
            addCriterion("`EQUIP_ MFR` >=", value, "equipMfr");
            return (Criteria) this;
        }

        public Criteria andEquipMfrLessThan(String value) {
            addCriterion("`EQUIP_ MFR` <", value, "equipMfr");
            return (Criteria) this;
        }

        public Criteria andEquipMfrLessThanOrEqualTo(String value) {
            addCriterion("`EQUIP_ MFR` <=", value, "equipMfr");
            return (Criteria) this;
        }

        public Criteria andEquipMfrLike(String value) {
            addCriterion("`EQUIP_ MFR` like", value, "equipMfr");
            return (Criteria) this;
        }

        public Criteria andEquipMfrNotLike(String value) {
            addCriterion("`EQUIP_ MFR` not like", value, "equipMfr");
            return (Criteria) this;
        }

        public Criteria andEquipMfrIn(List<String> values) {
            addCriterion("`EQUIP_ MFR` in", values, "equipMfr");
            return (Criteria) this;
        }

        public Criteria andEquipMfrNotIn(List<String> values) {
            addCriterion("`EQUIP_ MFR` not in", values, "equipMfr");
            return (Criteria) this;
        }

        public Criteria andEquipMfrBetween(String value1, String value2) {
            addCriterion("`EQUIP_ MFR` between", value1, value2, "equipMfr");
            return (Criteria) this;
        }

        public Criteria andEquipMfrNotBetween(String value1, String value2) {
            addCriterion("`EQUIP_ MFR` not between", value1, value2, "equipMfr");
            return (Criteria) this;
        }

        public Criteria andEquipMfrNoIsNull() {
            addCriterion("`EQUIP_ MFR_NO` is null");
            return (Criteria) this;
        }

        public Criteria andEquipMfrNoIsNotNull() {
            addCriterion("`EQUIP_ MFR_NO` is not null");
            return (Criteria) this;
        }

        public Criteria andEquipMfrNoEqualTo(String value) {
            addCriterion("`EQUIP_ MFR_NO` =", value, "equipMfrNo");
            return (Criteria) this;
        }

        public Criteria andEquipMfrNoNotEqualTo(String value) {
            addCriterion("`EQUIP_ MFR_NO` <>", value, "equipMfrNo");
            return (Criteria) this;
        }

        public Criteria andEquipMfrNoGreaterThan(String value) {
            addCriterion("`EQUIP_ MFR_NO` >", value, "equipMfrNo");
            return (Criteria) this;
        }

        public Criteria andEquipMfrNoGreaterThanOrEqualTo(String value) {
            addCriterion("`EQUIP_ MFR_NO` >=", value, "equipMfrNo");
            return (Criteria) this;
        }

        public Criteria andEquipMfrNoLessThan(String value) {
            addCriterion("`EQUIP_ MFR_NO` <", value, "equipMfrNo");
            return (Criteria) this;
        }

        public Criteria andEquipMfrNoLessThanOrEqualTo(String value) {
            addCriterion("`EQUIP_ MFR_NO` <=", value, "equipMfrNo");
            return (Criteria) this;
        }

        public Criteria andEquipMfrNoLike(String value) {
            addCriterion("`EQUIP_ MFR_NO` like", value, "equipMfrNo");
            return (Criteria) this;
        }

        public Criteria andEquipMfrNoNotLike(String value) {
            addCriterion("`EQUIP_ MFR_NO` not like", value, "equipMfrNo");
            return (Criteria) this;
        }

        public Criteria andEquipMfrNoIn(List<String> values) {
            addCriterion("`EQUIP_ MFR_NO` in", values, "equipMfrNo");
            return (Criteria) this;
        }

        public Criteria andEquipMfrNoNotIn(List<String> values) {
            addCriterion("`EQUIP_ MFR_NO` not in", values, "equipMfrNo");
            return (Criteria) this;
        }

        public Criteria andEquipMfrNoBetween(String value1, String value2) {
            addCriterion("`EQUIP_ MFR_NO` between", value1, value2, "equipMfrNo");
            return (Criteria) this;
        }

        public Criteria andEquipMfrNoNotBetween(String value1, String value2) {
            addCriterion("`EQUIP_ MFR_NO` not between", value1, value2, "equipMfrNo");
            return (Criteria) this;
        }

        public Criteria andEquipNoIsNull() {
            addCriterion("EQUIP_NO is null");
            return (Criteria) this;
        }

        public Criteria andEquipNoIsNotNull() {
            addCriterion("EQUIP_NO is not null");
            return (Criteria) this;
        }

        public Criteria andEquipNoEqualTo(String value) {
            addCriterion("EQUIP_NO =", value, "equipNo");
            return (Criteria) this;
        }

        public Criteria andEquipNoNotEqualTo(String value) {
            addCriterion("EQUIP_NO <>", value, "equipNo");
            return (Criteria) this;
        }

        public Criteria andEquipNoGreaterThan(String value) {
            addCriterion("EQUIP_NO >", value, "equipNo");
            return (Criteria) this;
        }

        public Criteria andEquipNoGreaterThanOrEqualTo(String value) {
            addCriterion("EQUIP_NO >=", value, "equipNo");
            return (Criteria) this;
        }

        public Criteria andEquipNoLessThan(String value) {
            addCriterion("EQUIP_NO <", value, "equipNo");
            return (Criteria) this;
        }

        public Criteria andEquipNoLessThanOrEqualTo(String value) {
            addCriterion("EQUIP_NO <=", value, "equipNo");
            return (Criteria) this;
        }

        public Criteria andEquipNoLike(String value) {
            addCriterion("EQUIP_NO like", value, "equipNo");
            return (Criteria) this;
        }

        public Criteria andEquipNoNotLike(String value) {
            addCriterion("EQUIP_NO not like", value, "equipNo");
            return (Criteria) this;
        }

        public Criteria andEquipNoIn(List<String> values) {
            addCriterion("EQUIP_NO in", values, "equipNo");
            return (Criteria) this;
        }

        public Criteria andEquipNoNotIn(List<String> values) {
            addCriterion("EQUIP_NO not in", values, "equipNo");
            return (Criteria) this;
        }

        public Criteria andEquipNoBetween(String value1, String value2) {
            addCriterion("EQUIP_NO between", value1, value2, "equipNo");
            return (Criteria) this;
        }

        public Criteria andEquipNoNotBetween(String value1, String value2) {
            addCriterion("EQUIP_NO not between", value1, value2, "equipNo");
            return (Criteria) this;
        }

        public Criteria andDiagramNoIsNull() {
            addCriterion("DIAGRAM_NO is null");
            return (Criteria) this;
        }

        public Criteria andDiagramNoIsNotNull() {
            addCriterion("DIAGRAM_NO is not null");
            return (Criteria) this;
        }

        public Criteria andDiagramNoEqualTo(String value) {
            addCriterion("DIAGRAM_NO =", value, "diagramNo");
            return (Criteria) this;
        }

        public Criteria andDiagramNoNotEqualTo(String value) {
            addCriterion("DIAGRAM_NO <>", value, "diagramNo");
            return (Criteria) this;
        }

        public Criteria andDiagramNoGreaterThan(String value) {
            addCriterion("DIAGRAM_NO >", value, "diagramNo");
            return (Criteria) this;
        }

        public Criteria andDiagramNoGreaterThanOrEqualTo(String value) {
            addCriterion("DIAGRAM_NO >=", value, "diagramNo");
            return (Criteria) this;
        }

        public Criteria andDiagramNoLessThan(String value) {
            addCriterion("DIAGRAM_NO <", value, "diagramNo");
            return (Criteria) this;
        }

        public Criteria andDiagramNoLessThanOrEqualTo(String value) {
            addCriterion("DIAGRAM_NO <=", value, "diagramNo");
            return (Criteria) this;
        }

        public Criteria andDiagramNoLike(String value) {
            addCriterion("DIAGRAM_NO like", value, "diagramNo");
            return (Criteria) this;
        }

        public Criteria andDiagramNoNotLike(String value) {
            addCriterion("DIAGRAM_NO not like", value, "diagramNo");
            return (Criteria) this;
        }

        public Criteria andDiagramNoIn(List<String> values) {
            addCriterion("DIAGRAM_NO in", values, "diagramNo");
            return (Criteria) this;
        }

        public Criteria andDiagramNoNotIn(List<String> values) {
            addCriterion("DIAGRAM_NO not in", values, "diagramNo");
            return (Criteria) this;
        }

        public Criteria andDiagramNoBetween(String value1, String value2) {
            addCriterion("DIAGRAM_NO between", value1, value2, "diagramNo");
            return (Criteria) this;
        }

        public Criteria andDiagramNoNotBetween(String value1, String value2) {
            addCriterion("DIAGRAM_NO not between", value1, value2, "diagramNo");
            return (Criteria) this;
        }

        public Criteria andProdCodeDescIsNull() {
            addCriterion("PROD_CODE_DESC is null");
            return (Criteria) this;
        }

        public Criteria andProdCodeDescIsNotNull() {
            addCriterion("PROD_CODE_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andProdCodeDescEqualTo(String value) {
            addCriterion("PROD_CODE_DESC =", value, "prodCodeDesc");
            return (Criteria) this;
        }

        public Criteria andProdCodeDescNotEqualTo(String value) {
            addCriterion("PROD_CODE_DESC <>", value, "prodCodeDesc");
            return (Criteria) this;
        }

        public Criteria andProdCodeDescGreaterThan(String value) {
            addCriterion("PROD_CODE_DESC >", value, "prodCodeDesc");
            return (Criteria) this;
        }

        public Criteria andProdCodeDescGreaterThanOrEqualTo(String value) {
            addCriterion("PROD_CODE_DESC >=", value, "prodCodeDesc");
            return (Criteria) this;
        }

        public Criteria andProdCodeDescLessThan(String value) {
            addCriterion("PROD_CODE_DESC <", value, "prodCodeDesc");
            return (Criteria) this;
        }

        public Criteria andProdCodeDescLessThanOrEqualTo(String value) {
            addCriterion("PROD_CODE_DESC <=", value, "prodCodeDesc");
            return (Criteria) this;
        }

        public Criteria andProdCodeDescLike(String value) {
            addCriterion("PROD_CODE_DESC like", value, "prodCodeDesc");
            return (Criteria) this;
        }

        public Criteria andProdCodeDescNotLike(String value) {
            addCriterion("PROD_CODE_DESC not like", value, "prodCodeDesc");
            return (Criteria) this;
        }

        public Criteria andProdCodeDescIn(List<String> values) {
            addCriterion("PROD_CODE_DESC in", values, "prodCodeDesc");
            return (Criteria) this;
        }

        public Criteria andProdCodeDescNotIn(List<String> values) {
            addCriterion("PROD_CODE_DESC not in", values, "prodCodeDesc");
            return (Criteria) this;
        }

        public Criteria andProdCodeDescBetween(String value1, String value2) {
            addCriterion("PROD_CODE_DESC between", value1, value2, "prodCodeDesc");
            return (Criteria) this;
        }

        public Criteria andProdCodeDescNotBetween(String value1, String value2) {
            addCriterion("PROD_CODE_DESC not between", value1, value2, "prodCodeDesc");
            return (Criteria) this;
        }

        public Criteria andAbcCodeIsNull() {
            addCriterion("ABC_CODE is null");
            return (Criteria) this;
        }

        public Criteria andAbcCodeIsNotNull() {
            addCriterion("ABC_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andAbcCodeEqualTo(String value) {
            addCriterion("ABC_CODE =", value, "abcCode");
            return (Criteria) this;
        }

        public Criteria andAbcCodeNotEqualTo(String value) {
            addCriterion("ABC_CODE <>", value, "abcCode");
            return (Criteria) this;
        }

        public Criteria andAbcCodeGreaterThan(String value) {
            addCriterion("ABC_CODE >", value, "abcCode");
            return (Criteria) this;
        }

        public Criteria andAbcCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ABC_CODE >=", value, "abcCode");
            return (Criteria) this;
        }

        public Criteria andAbcCodeLessThan(String value) {
            addCriterion("ABC_CODE <", value, "abcCode");
            return (Criteria) this;
        }

        public Criteria andAbcCodeLessThanOrEqualTo(String value) {
            addCriterion("ABC_CODE <=", value, "abcCode");
            return (Criteria) this;
        }

        public Criteria andAbcCodeLike(String value) {
            addCriterion("ABC_CODE like", value, "abcCode");
            return (Criteria) this;
        }

        public Criteria andAbcCodeNotLike(String value) {
            addCriterion("ABC_CODE not like", value, "abcCode");
            return (Criteria) this;
        }

        public Criteria andAbcCodeIn(List<String> values) {
            addCriterion("ABC_CODE in", values, "abcCode");
            return (Criteria) this;
        }

        public Criteria andAbcCodeNotIn(List<String> values) {
            addCriterion("ABC_CODE not in", values, "abcCode");
            return (Criteria) this;
        }

        public Criteria andAbcCodeBetween(String value1, String value2) {
            addCriterion("ABC_CODE between", value1, value2, "abcCode");
            return (Criteria) this;
        }

        public Criteria andAbcCodeNotBetween(String value1, String value2) {
            addCriterion("ABC_CODE not between", value1, value2, "abcCode");
            return (Criteria) this;
        }

        public Criteria andPlannerCodeIsNull() {
            addCriterion("PLANNER_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPlannerCodeIsNotNull() {
            addCriterion("PLANNER_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPlannerCodeEqualTo(String value) {
            addCriterion("PLANNER_CODE =", value, "plannerCode");
            return (Criteria) this;
        }

        public Criteria andPlannerCodeNotEqualTo(String value) {
            addCriterion("PLANNER_CODE <>", value, "plannerCode");
            return (Criteria) this;
        }

        public Criteria andPlannerCodeGreaterThan(String value) {
            addCriterion("PLANNER_CODE >", value, "plannerCode");
            return (Criteria) this;
        }

        public Criteria andPlannerCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PLANNER_CODE >=", value, "plannerCode");
            return (Criteria) this;
        }

        public Criteria andPlannerCodeLessThan(String value) {
            addCriterion("PLANNER_CODE <", value, "plannerCode");
            return (Criteria) this;
        }

        public Criteria andPlannerCodeLessThanOrEqualTo(String value) {
            addCriterion("PLANNER_CODE <=", value, "plannerCode");
            return (Criteria) this;
        }

        public Criteria andPlannerCodeLike(String value) {
            addCriterion("PLANNER_CODE like", value, "plannerCode");
            return (Criteria) this;
        }

        public Criteria andPlannerCodeNotLike(String value) {
            addCriterion("PLANNER_CODE not like", value, "plannerCode");
            return (Criteria) this;
        }

        public Criteria andPlannerCodeIn(List<String> values) {
            addCriterion("PLANNER_CODE in", values, "plannerCode");
            return (Criteria) this;
        }

        public Criteria andPlannerCodeNotIn(List<String> values) {
            addCriterion("PLANNER_CODE not in", values, "plannerCode");
            return (Criteria) this;
        }

        public Criteria andPlannerCodeBetween(String value1, String value2) {
            addCriterion("PLANNER_CODE between", value1, value2, "plannerCode");
            return (Criteria) this;
        }

        public Criteria andPlannerCodeNotBetween(String value1, String value2) {
            addCriterion("PLANNER_CODE not between", value1, value2, "plannerCode");
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