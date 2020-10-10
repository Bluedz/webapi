package com.xtk.apistation.webapi.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MatBasicInformationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MatBasicInformationExample() {
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

        public Criteria andMidIsNull() {
            addCriterion("MID is null");
            return (Criteria) this;
        }

        public Criteria andMidIsNotNull() {
            addCriterion("MID is not null");
            return (Criteria) this;
        }

        public Criteria andMidEqualTo(String value) {
            addCriterion("MID =", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotEqualTo(String value) {
            addCriterion("MID <>", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThan(String value) {
            addCriterion("MID >", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThanOrEqualTo(String value) {
            addCriterion("MID >=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThan(String value) {
            addCriterion("MID <", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThanOrEqualTo(String value) {
            addCriterion("MID <=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLike(String value) {
            addCriterion("MID like", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotLike(String value) {
            addCriterion("MID not like", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidIn(List<String> values) {
            addCriterion("MID in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotIn(List<String> values) {
            addCriterion("MID not in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidBetween(String value1, String value2) {
            addCriterion("MID between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotBetween(String value1, String value2) {
            addCriterion("MID not between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameIsNull() {
            addCriterion("ATTACHMENT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameIsNotNull() {
            addCriterion("ATTACHMENT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameEqualTo(String value) {
            addCriterion("ATTACHMENT_NAME =", value, "attachmentName");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameNotEqualTo(String value) {
            addCriterion("ATTACHMENT_NAME <>", value, "attachmentName");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameGreaterThan(String value) {
            addCriterion("ATTACHMENT_NAME >", value, "attachmentName");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameGreaterThanOrEqualTo(String value) {
            addCriterion("ATTACHMENT_NAME >=", value, "attachmentName");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameLessThan(String value) {
            addCriterion("ATTACHMENT_NAME <", value, "attachmentName");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameLessThanOrEqualTo(String value) {
            addCriterion("ATTACHMENT_NAME <=", value, "attachmentName");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameLike(String value) {
            addCriterion("ATTACHMENT_NAME like", value, "attachmentName");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameNotLike(String value) {
            addCriterion("ATTACHMENT_NAME not like", value, "attachmentName");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameIn(List<String> values) {
            addCriterion("ATTACHMENT_NAME in", values, "attachmentName");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameNotIn(List<String> values) {
            addCriterion("ATTACHMENT_NAME not in", values, "attachmentName");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameBetween(String value1, String value2) {
            addCriterion("ATTACHMENT_NAME between", value1, value2, "attachmentName");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameNotBetween(String value1, String value2) {
            addCriterion("ATTACHMENT_NAME not between", value1, value2, "attachmentName");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("`TYPE` is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("`TYPE` is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("`TYPE` =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("`TYPE` <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("`TYPE` >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("`TYPE` >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("`TYPE` <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("`TYPE` <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("`TYPE` like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("`TYPE` not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("`TYPE` in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("`TYPE` not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("`TYPE` between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("`TYPE` not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andKeyMaterialIsNull() {
            addCriterion("KEY_MATERIAL is null");
            return (Criteria) this;
        }

        public Criteria andKeyMaterialIsNotNull() {
            addCriterion("KEY_MATERIAL is not null");
            return (Criteria) this;
        }

        public Criteria andKeyMaterialEqualTo(String value) {
            addCriterion("KEY_MATERIAL =", value, "keyMaterial");
            return (Criteria) this;
        }

        public Criteria andKeyMaterialNotEqualTo(String value) {
            addCriterion("KEY_MATERIAL <>", value, "keyMaterial");
            return (Criteria) this;
        }

        public Criteria andKeyMaterialGreaterThan(String value) {
            addCriterion("KEY_MATERIAL >", value, "keyMaterial");
            return (Criteria) this;
        }

        public Criteria andKeyMaterialGreaterThanOrEqualTo(String value) {
            addCriterion("KEY_MATERIAL >=", value, "keyMaterial");
            return (Criteria) this;
        }

        public Criteria andKeyMaterialLessThan(String value) {
            addCriterion("KEY_MATERIAL <", value, "keyMaterial");
            return (Criteria) this;
        }

        public Criteria andKeyMaterialLessThanOrEqualTo(String value) {
            addCriterion("KEY_MATERIAL <=", value, "keyMaterial");
            return (Criteria) this;
        }

        public Criteria andKeyMaterialLike(String value) {
            addCriterion("KEY_MATERIAL like", value, "keyMaterial");
            return (Criteria) this;
        }

        public Criteria andKeyMaterialNotLike(String value) {
            addCriterion("KEY_MATERIAL not like", value, "keyMaterial");
            return (Criteria) this;
        }

        public Criteria andKeyMaterialIn(List<String> values) {
            addCriterion("KEY_MATERIAL in", values, "keyMaterial");
            return (Criteria) this;
        }

        public Criteria andKeyMaterialNotIn(List<String> values) {
            addCriterion("KEY_MATERIAL not in", values, "keyMaterial");
            return (Criteria) this;
        }

        public Criteria andKeyMaterialBetween(String value1, String value2) {
            addCriterion("KEY_MATERIAL between", value1, value2, "keyMaterial");
            return (Criteria) this;
        }

        public Criteria andKeyMaterialNotBetween(String value1, String value2) {
            addCriterion("KEY_MATERIAL not between", value1, value2, "keyMaterial");
            return (Criteria) this;
        }

        public Criteria andReplaceMaterialNumIsNull() {
            addCriterion("REPLACE_MATERIAL_NUM is null");
            return (Criteria) this;
        }

        public Criteria andReplaceMaterialNumIsNotNull() {
            addCriterion("REPLACE_MATERIAL_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andReplaceMaterialNumEqualTo(String value) {
            addCriterion("REPLACE_MATERIAL_NUM =", value, "replaceMaterialNum");
            return (Criteria) this;
        }

        public Criteria andReplaceMaterialNumNotEqualTo(String value) {
            addCriterion("REPLACE_MATERIAL_NUM <>", value, "replaceMaterialNum");
            return (Criteria) this;
        }

        public Criteria andReplaceMaterialNumGreaterThan(String value) {
            addCriterion("REPLACE_MATERIAL_NUM >", value, "replaceMaterialNum");
            return (Criteria) this;
        }

        public Criteria andReplaceMaterialNumGreaterThanOrEqualTo(String value) {
            addCriterion("REPLACE_MATERIAL_NUM >=", value, "replaceMaterialNum");
            return (Criteria) this;
        }

        public Criteria andReplaceMaterialNumLessThan(String value) {
            addCriterion("REPLACE_MATERIAL_NUM <", value, "replaceMaterialNum");
            return (Criteria) this;
        }

        public Criteria andReplaceMaterialNumLessThanOrEqualTo(String value) {
            addCriterion("REPLACE_MATERIAL_NUM <=", value, "replaceMaterialNum");
            return (Criteria) this;
        }

        public Criteria andReplaceMaterialNumLike(String value) {
            addCriterion("REPLACE_MATERIAL_NUM like", value, "replaceMaterialNum");
            return (Criteria) this;
        }

        public Criteria andReplaceMaterialNumNotLike(String value) {
            addCriterion("REPLACE_MATERIAL_NUM not like", value, "replaceMaterialNum");
            return (Criteria) this;
        }

        public Criteria andReplaceMaterialNumIn(List<String> values) {
            addCriterion("REPLACE_MATERIAL_NUM in", values, "replaceMaterialNum");
            return (Criteria) this;
        }

        public Criteria andReplaceMaterialNumNotIn(List<String> values) {
            addCriterion("REPLACE_MATERIAL_NUM not in", values, "replaceMaterialNum");
            return (Criteria) this;
        }

        public Criteria andReplaceMaterialNumBetween(String value1, String value2) {
            addCriterion("REPLACE_MATERIAL_NUM between", value1, value2, "replaceMaterialNum");
            return (Criteria) this;
        }

        public Criteria andReplaceMaterialNumNotBetween(String value1, String value2) {
            addCriterion("REPLACE_MATERIAL_NUM not between", value1, value2, "replaceMaterialNum");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameIsNull() {
            addCriterion("ENTERPRISE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameIsNotNull() {
            addCriterion("ENTERPRISE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameEqualTo(String value) {
            addCriterion("ENTERPRISE_NAME =", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameNotEqualTo(String value) {
            addCriterion("ENTERPRISE_NAME <>", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameGreaterThan(String value) {
            addCriterion("ENTERPRISE_NAME >", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameGreaterThanOrEqualTo(String value) {
            addCriterion("ENTERPRISE_NAME >=", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameLessThan(String value) {
            addCriterion("ENTERPRISE_NAME <", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameLessThanOrEqualTo(String value) {
            addCriterion("ENTERPRISE_NAME <=", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameLike(String value) {
            addCriterion("ENTERPRISE_NAME like", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameNotLike(String value) {
            addCriterion("ENTERPRISE_NAME not like", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameIn(List<String> values) {
            addCriterion("ENTERPRISE_NAME in", values, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameNotIn(List<String> values) {
            addCriterion("ENTERPRISE_NAME not in", values, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameBetween(String value1, String value2) {
            addCriterion("ENTERPRISE_NAME between", value1, value2, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameNotBetween(String value1, String value2) {
            addCriterion("ENTERPRISE_NAME not between", value1, value2, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andPurchaseCycleIsNull() {
            addCriterion("PURCHASE_CYCLE is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseCycleIsNotNull() {
            addCriterion("PURCHASE_CYCLE is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseCycleEqualTo(BigDecimal value) {
            addCriterion("PURCHASE_CYCLE =", value, "purchaseCycle");
            return (Criteria) this;
        }

        public Criteria andPurchaseCycleNotEqualTo(BigDecimal value) {
            addCriterion("PURCHASE_CYCLE <>", value, "purchaseCycle");
            return (Criteria) this;
        }

        public Criteria andPurchaseCycleGreaterThan(BigDecimal value) {
            addCriterion("PURCHASE_CYCLE >", value, "purchaseCycle");
            return (Criteria) this;
        }

        public Criteria andPurchaseCycleGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PURCHASE_CYCLE >=", value, "purchaseCycle");
            return (Criteria) this;
        }

        public Criteria andPurchaseCycleLessThan(BigDecimal value) {
            addCriterion("PURCHASE_CYCLE <", value, "purchaseCycle");
            return (Criteria) this;
        }

        public Criteria andPurchaseCycleLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PURCHASE_CYCLE <=", value, "purchaseCycle");
            return (Criteria) this;
        }

        public Criteria andPurchaseCycleIn(List<BigDecimal> values) {
            addCriterion("PURCHASE_CYCLE in", values, "purchaseCycle");
            return (Criteria) this;
        }

        public Criteria andPurchaseCycleNotIn(List<BigDecimal> values) {
            addCriterion("PURCHASE_CYCLE not in", values, "purchaseCycle");
            return (Criteria) this;
        }

        public Criteria andPurchaseCycleBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PURCHASE_CYCLE between", value1, value2, "purchaseCycle");
            return (Criteria) this;
        }

        public Criteria andPurchaseCycleNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PURCHASE_CYCLE not between", value1, value2, "purchaseCycle");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIsNull() {
            addCriterion("UNIT_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIsNotNull() {
            addCriterion("UNIT_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andUnitPriceEqualTo(BigDecimal value) {
            addCriterion("UNIT_PRICE =", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotEqualTo(BigDecimal value) {
            addCriterion("UNIT_PRICE <>", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThan(BigDecimal value) {
            addCriterion("UNIT_PRICE >", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UNIT_PRICE >=", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThan(BigDecimal value) {
            addCriterion("UNIT_PRICE <", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UNIT_PRICE <=", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIn(List<BigDecimal> values) {
            addCriterion("UNIT_PRICE in", values, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotIn(List<BigDecimal> values) {
            addCriterion("UNIT_PRICE not in", values, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UNIT_PRICE between", value1, value2, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UNIT_PRICE not between", value1, value2, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdIsNull() {
            addCriterion("PURCHASE_ID is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdIsNotNull() {
            addCriterion("PURCHASE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdEqualTo(String value) {
            addCriterion("PURCHASE_ID =", value, "purchaseId");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdNotEqualTo(String value) {
            addCriterion("PURCHASE_ID <>", value, "purchaseId");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdGreaterThan(String value) {
            addCriterion("PURCHASE_ID >", value, "purchaseId");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdGreaterThanOrEqualTo(String value) {
            addCriterion("PURCHASE_ID >=", value, "purchaseId");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdLessThan(String value) {
            addCriterion("PURCHASE_ID <", value, "purchaseId");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdLessThanOrEqualTo(String value) {
            addCriterion("PURCHASE_ID <=", value, "purchaseId");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdLike(String value) {
            addCriterion("PURCHASE_ID like", value, "purchaseId");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdNotLike(String value) {
            addCriterion("PURCHASE_ID not like", value, "purchaseId");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdIn(List<String> values) {
            addCriterion("PURCHASE_ID in", values, "purchaseId");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdNotIn(List<String> values) {
            addCriterion("PURCHASE_ID not in", values, "purchaseId");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdBetween(String value1, String value2) {
            addCriterion("PURCHASE_ID between", value1, value2, "purchaseId");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdNotBetween(String value1, String value2) {
            addCriterion("PURCHASE_ID not between", value1, value2, "purchaseId");
            return (Criteria) this;
        }

        public Criteria andLocalIsNull() {
            addCriterion("`LOCAL` is null");
            return (Criteria) this;
        }

        public Criteria andLocalIsNotNull() {
            addCriterion("`LOCAL` is not null");
            return (Criteria) this;
        }

        public Criteria andLocalEqualTo(String value) {
            addCriterion("`LOCAL` =", value, "local");
            return (Criteria) this;
        }

        public Criteria andLocalNotEqualTo(String value) {
            addCriterion("`LOCAL` <>", value, "local");
            return (Criteria) this;
        }

        public Criteria andLocalGreaterThan(String value) {
            addCriterion("`LOCAL` >", value, "local");
            return (Criteria) this;
        }

        public Criteria andLocalGreaterThanOrEqualTo(String value) {
            addCriterion("`LOCAL` >=", value, "local");
            return (Criteria) this;
        }

        public Criteria andLocalLessThan(String value) {
            addCriterion("`LOCAL` <", value, "local");
            return (Criteria) this;
        }

        public Criteria andLocalLessThanOrEqualTo(String value) {
            addCriterion("`LOCAL` <=", value, "local");
            return (Criteria) this;
        }

        public Criteria andLocalLike(String value) {
            addCriterion("`LOCAL` like", value, "local");
            return (Criteria) this;
        }

        public Criteria andLocalNotLike(String value) {
            addCriterion("`LOCAL` not like", value, "local");
            return (Criteria) this;
        }

        public Criteria andLocalIn(List<String> values) {
            addCriterion("`LOCAL` in", values, "local");
            return (Criteria) this;
        }

        public Criteria andLocalNotIn(List<String> values) {
            addCriterion("`LOCAL` not in", values, "local");
            return (Criteria) this;
        }

        public Criteria andLocalBetween(String value1, String value2) {
            addCriterion("`LOCAL` between", value1, value2, "local");
            return (Criteria) this;
        }

        public Criteria andLocalNotBetween(String value1, String value2) {
            addCriterion("`LOCAL` not between", value1, value2, "local");
            return (Criteria) this;
        }

        public Criteria andIsReparableIsNull() {
            addCriterion("IS_REPARABLE is null");
            return (Criteria) this;
        }

        public Criteria andIsReparableIsNotNull() {
            addCriterion("IS_REPARABLE is not null");
            return (Criteria) this;
        }

        public Criteria andIsReparableEqualTo(String value) {
            addCriterion("IS_REPARABLE =", value, "isReparable");
            return (Criteria) this;
        }

        public Criteria andIsReparableNotEqualTo(String value) {
            addCriterion("IS_REPARABLE <>", value, "isReparable");
            return (Criteria) this;
        }

        public Criteria andIsReparableGreaterThan(String value) {
            addCriterion("IS_REPARABLE >", value, "isReparable");
            return (Criteria) this;
        }

        public Criteria andIsReparableGreaterThanOrEqualTo(String value) {
            addCriterion("IS_REPARABLE >=", value, "isReparable");
            return (Criteria) this;
        }

        public Criteria andIsReparableLessThan(String value) {
            addCriterion("IS_REPARABLE <", value, "isReparable");
            return (Criteria) this;
        }

        public Criteria andIsReparableLessThanOrEqualTo(String value) {
            addCriterion("IS_REPARABLE <=", value, "isReparable");
            return (Criteria) this;
        }

        public Criteria andIsReparableLike(String value) {
            addCriterion("IS_REPARABLE like", value, "isReparable");
            return (Criteria) this;
        }

        public Criteria andIsReparableNotLike(String value) {
            addCriterion("IS_REPARABLE not like", value, "isReparable");
            return (Criteria) this;
        }

        public Criteria andIsReparableIn(List<String> values) {
            addCriterion("IS_REPARABLE in", values, "isReparable");
            return (Criteria) this;
        }

        public Criteria andIsReparableNotIn(List<String> values) {
            addCriterion("IS_REPARABLE not in", values, "isReparable");
            return (Criteria) this;
        }

        public Criteria andIsReparableBetween(String value1, String value2) {
            addCriterion("IS_REPARABLE between", value1, value2, "isReparable");
            return (Criteria) this;
        }

        public Criteria andIsReparableNotBetween(String value1, String value2) {
            addCriterion("IS_REPARABLE not between", value1, value2, "isReparable");
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

        public Criteria andIsIncreaseIsNull() {
            addCriterion("IS_INCREASE is null");
            return (Criteria) this;
        }

        public Criteria andIsIncreaseIsNotNull() {
            addCriterion("IS_INCREASE is not null");
            return (Criteria) this;
        }

        public Criteria andIsIncreaseEqualTo(String value) {
            addCriterion("IS_INCREASE =", value, "isIncrease");
            return (Criteria) this;
        }

        public Criteria andIsIncreaseNotEqualTo(String value) {
            addCriterion("IS_INCREASE <>", value, "isIncrease");
            return (Criteria) this;
        }

        public Criteria andIsIncreaseGreaterThan(String value) {
            addCriterion("IS_INCREASE >", value, "isIncrease");
            return (Criteria) this;
        }

        public Criteria andIsIncreaseGreaterThanOrEqualTo(String value) {
            addCriterion("IS_INCREASE >=", value, "isIncrease");
            return (Criteria) this;
        }

        public Criteria andIsIncreaseLessThan(String value) {
            addCriterion("IS_INCREASE <", value, "isIncrease");
            return (Criteria) this;
        }

        public Criteria andIsIncreaseLessThanOrEqualTo(String value) {
            addCriterion("IS_INCREASE <=", value, "isIncrease");
            return (Criteria) this;
        }

        public Criteria andIsIncreaseLike(String value) {
            addCriterion("IS_INCREASE like", value, "isIncrease");
            return (Criteria) this;
        }

        public Criteria andIsIncreaseNotLike(String value) {
            addCriterion("IS_INCREASE not like", value, "isIncrease");
            return (Criteria) this;
        }

        public Criteria andIsIncreaseIn(List<String> values) {
            addCriterion("IS_INCREASE in", values, "isIncrease");
            return (Criteria) this;
        }

        public Criteria andIsIncreaseNotIn(List<String> values) {
            addCriterion("IS_INCREASE not in", values, "isIncrease");
            return (Criteria) this;
        }

        public Criteria andIsIncreaseBetween(String value1, String value2) {
            addCriterion("IS_INCREASE between", value1, value2, "isIncrease");
            return (Criteria) this;
        }

        public Criteria andIsIncreaseNotBetween(String value1, String value2) {
            addCriterion("IS_INCREASE not between", value1, value2, "isIncrease");
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