package com.xtk.apistation.webapi.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TpmsMatStriExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TpmsMatStriExample() {
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

        public Criteria andFactoryCoIsNull() {
            addCriterion("FACTORY_CO is null");
            return (Criteria) this;
        }

        public Criteria andFactoryCoIsNotNull() {
            addCriterion("FACTORY_CO is not null");
            return (Criteria) this;
        }

        public Criteria andFactoryCoEqualTo(String value) {
            addCriterion("FACTORY_CO =", value, "factoryCo");
            return (Criteria) this;
        }

        public Criteria andFactoryCoNotEqualTo(String value) {
            addCriterion("FACTORY_CO <>", value, "factoryCo");
            return (Criteria) this;
        }

        public Criteria andFactoryCoGreaterThan(String value) {
            addCriterion("FACTORY_CO >", value, "factoryCo");
            return (Criteria) this;
        }

        public Criteria andFactoryCoGreaterThanOrEqualTo(String value) {
            addCriterion("FACTORY_CO >=", value, "factoryCo");
            return (Criteria) this;
        }

        public Criteria andFactoryCoLessThan(String value) {
            addCriterion("FACTORY_CO <", value, "factoryCo");
            return (Criteria) this;
        }

        public Criteria andFactoryCoLessThanOrEqualTo(String value) {
            addCriterion("FACTORY_CO <=", value, "factoryCo");
            return (Criteria) this;
        }

        public Criteria andFactoryCoLike(String value) {
            addCriterion("FACTORY_CO like", value, "factoryCo");
            return (Criteria) this;
        }

        public Criteria andFactoryCoNotLike(String value) {
            addCriterion("FACTORY_CO not like", value, "factoryCo");
            return (Criteria) this;
        }

        public Criteria andFactoryCoIn(List<String> values) {
            addCriterion("FACTORY_CO in", values, "factoryCo");
            return (Criteria) this;
        }

        public Criteria andFactoryCoNotIn(List<String> values) {
            addCriterion("FACTORY_CO not in", values, "factoryCo");
            return (Criteria) this;
        }

        public Criteria andFactoryCoBetween(String value1, String value2) {
            addCriterion("FACTORY_CO between", value1, value2, "factoryCo");
            return (Criteria) this;
        }

        public Criteria andFactoryCoNotBetween(String value1, String value2) {
            addCriterion("FACTORY_CO not between", value1, value2, "factoryCo");
            return (Criteria) this;
        }

        public Criteria andFactoryNameIsNull() {
            addCriterion("FACTORY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFactoryNameIsNotNull() {
            addCriterion("FACTORY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFactoryNameEqualTo(String value) {
            addCriterion("FACTORY_NAME =", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameNotEqualTo(String value) {
            addCriterion("FACTORY_NAME <>", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameGreaterThan(String value) {
            addCriterion("FACTORY_NAME >", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("FACTORY_NAME >=", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameLessThan(String value) {
            addCriterion("FACTORY_NAME <", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameLessThanOrEqualTo(String value) {
            addCriterion("FACTORY_NAME <=", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameLike(String value) {
            addCriterion("FACTORY_NAME like", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameNotLike(String value) {
            addCriterion("FACTORY_NAME not like", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameIn(List<String> values) {
            addCriterion("FACTORY_NAME in", values, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameNotIn(List<String> values) {
            addCriterion("FACTORY_NAME not in", values, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameBetween(String value1, String value2) {
            addCriterion("FACTORY_NAME between", value1, value2, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameNotBetween(String value1, String value2) {
            addCriterion("FACTORY_NAME not between", value1, value2, "factoryName");
            return (Criteria) this;
        }

        public Criteria andDcMaterialNoIsNull() {
            addCriterion("DC_MATERIAL_NO is null");
            return (Criteria) this;
        }

        public Criteria andDcMaterialNoIsNotNull() {
            addCriterion("DC_MATERIAL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andDcMaterialNoEqualTo(String value) {
            addCriterion("DC_MATERIAL_NO =", value, "dcMaterialNo");
            return (Criteria) this;
        }

        public Criteria andDcMaterialNoNotEqualTo(String value) {
            addCriterion("DC_MATERIAL_NO <>", value, "dcMaterialNo");
            return (Criteria) this;
        }

        public Criteria andDcMaterialNoGreaterThan(String value) {
            addCriterion("DC_MATERIAL_NO >", value, "dcMaterialNo");
            return (Criteria) this;
        }

        public Criteria andDcMaterialNoGreaterThanOrEqualTo(String value) {
            addCriterion("DC_MATERIAL_NO >=", value, "dcMaterialNo");
            return (Criteria) this;
        }

        public Criteria andDcMaterialNoLessThan(String value) {
            addCriterion("DC_MATERIAL_NO <", value, "dcMaterialNo");
            return (Criteria) this;
        }

        public Criteria andDcMaterialNoLessThanOrEqualTo(String value) {
            addCriterion("DC_MATERIAL_NO <=", value, "dcMaterialNo");
            return (Criteria) this;
        }

        public Criteria andDcMaterialNoLike(String value) {
            addCriterion("DC_MATERIAL_NO like", value, "dcMaterialNo");
            return (Criteria) this;
        }

        public Criteria andDcMaterialNoNotLike(String value) {
            addCriterion("DC_MATERIAL_NO not like", value, "dcMaterialNo");
            return (Criteria) this;
        }

        public Criteria andDcMaterialNoIn(List<String> values) {
            addCriterion("DC_MATERIAL_NO in", values, "dcMaterialNo");
            return (Criteria) this;
        }

        public Criteria andDcMaterialNoNotIn(List<String> values) {
            addCriterion("DC_MATERIAL_NO not in", values, "dcMaterialNo");
            return (Criteria) this;
        }

        public Criteria andDcMaterialNoBetween(String value1, String value2) {
            addCriterion("DC_MATERIAL_NO between", value1, value2, "dcMaterialNo");
            return (Criteria) this;
        }

        public Criteria andDcMaterialNoNotBetween(String value1, String value2) {
            addCriterion("DC_MATERIAL_NO not between", value1, value2, "dcMaterialNo");
            return (Criteria) this;
        }

        public Criteria andSvwMaterialNoIsNull() {
            addCriterion("SVW_MATERIAL_NO is null");
            return (Criteria) this;
        }

        public Criteria andSvwMaterialNoIsNotNull() {
            addCriterion("SVW_MATERIAL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andSvwMaterialNoEqualTo(String value) {
            addCriterion("SVW_MATERIAL_NO =", value, "svwMaterialNo");
            return (Criteria) this;
        }

        public Criteria andSvwMaterialNoNotEqualTo(String value) {
            addCriterion("SVW_MATERIAL_NO <>", value, "svwMaterialNo");
            return (Criteria) this;
        }

        public Criteria andSvwMaterialNoGreaterThan(String value) {
            addCriterion("SVW_MATERIAL_NO >", value, "svwMaterialNo");
            return (Criteria) this;
        }

        public Criteria andSvwMaterialNoGreaterThanOrEqualTo(String value) {
            addCriterion("SVW_MATERIAL_NO >=", value, "svwMaterialNo");
            return (Criteria) this;
        }

        public Criteria andSvwMaterialNoLessThan(String value) {
            addCriterion("SVW_MATERIAL_NO <", value, "svwMaterialNo");
            return (Criteria) this;
        }

        public Criteria andSvwMaterialNoLessThanOrEqualTo(String value) {
            addCriterion("SVW_MATERIAL_NO <=", value, "svwMaterialNo");
            return (Criteria) this;
        }

        public Criteria andSvwMaterialNoLike(String value) {
            addCriterion("SVW_MATERIAL_NO like", value, "svwMaterialNo");
            return (Criteria) this;
        }

        public Criteria andSvwMaterialNoNotLike(String value) {
            addCriterion("SVW_MATERIAL_NO not like", value, "svwMaterialNo");
            return (Criteria) this;
        }

        public Criteria andSvwMaterialNoIn(List<String> values) {
            addCriterion("SVW_MATERIAL_NO in", values, "svwMaterialNo");
            return (Criteria) this;
        }

        public Criteria andSvwMaterialNoNotIn(List<String> values) {
            addCriterion("SVW_MATERIAL_NO not in", values, "svwMaterialNo");
            return (Criteria) this;
        }

        public Criteria andSvwMaterialNoBetween(String value1, String value2) {
            addCriterion("SVW_MATERIAL_NO between", value1, value2, "svwMaterialNo");
            return (Criteria) this;
        }

        public Criteria andSvwMaterialNoNotBetween(String value1, String value2) {
            addCriterion("SVW_MATERIAL_NO not between", value1, value2, "svwMaterialNo");
            return (Criteria) this;
        }

        public Criteria andMinSafetyStockIsNull() {
            addCriterion("MIN_SAFETY_STOCK is null");
            return (Criteria) this;
        }

        public Criteria andMinSafetyStockIsNotNull() {
            addCriterion("MIN_SAFETY_STOCK is not null");
            return (Criteria) this;
        }

        public Criteria andMinSafetyStockEqualTo(String value) {
            addCriterion("MIN_SAFETY_STOCK =", value, "minSafetyStock");
            return (Criteria) this;
        }

        public Criteria andMinSafetyStockNotEqualTo(String value) {
            addCriterion("MIN_SAFETY_STOCK <>", value, "minSafetyStock");
            return (Criteria) this;
        }

        public Criteria andMinSafetyStockGreaterThan(String value) {
            addCriterion("MIN_SAFETY_STOCK >", value, "minSafetyStock");
            return (Criteria) this;
        }

        public Criteria andMinSafetyStockGreaterThanOrEqualTo(String value) {
            addCriterion("MIN_SAFETY_STOCK >=", value, "minSafetyStock");
            return (Criteria) this;
        }

        public Criteria andMinSafetyStockLessThan(String value) {
            addCriterion("MIN_SAFETY_STOCK <", value, "minSafetyStock");
            return (Criteria) this;
        }

        public Criteria andMinSafetyStockLessThanOrEqualTo(String value) {
            addCriterion("MIN_SAFETY_STOCK <=", value, "minSafetyStock");
            return (Criteria) this;
        }

        public Criteria andMinSafetyStockLike(String value) {
            addCriterion("MIN_SAFETY_STOCK like", value, "minSafetyStock");
            return (Criteria) this;
        }

        public Criteria andMinSafetyStockNotLike(String value) {
            addCriterion("MIN_SAFETY_STOCK not like", value, "minSafetyStock");
            return (Criteria) this;
        }

        public Criteria andMinSafetyStockIn(List<String> values) {
            addCriterion("MIN_SAFETY_STOCK in", values, "minSafetyStock");
            return (Criteria) this;
        }

        public Criteria andMinSafetyStockNotIn(List<String> values) {
            addCriterion("MIN_SAFETY_STOCK not in", values, "minSafetyStock");
            return (Criteria) this;
        }

        public Criteria andMinSafetyStockBetween(String value1, String value2) {
            addCriterion("MIN_SAFETY_STOCK between", value1, value2, "minSafetyStock");
            return (Criteria) this;
        }

        public Criteria andMinSafetyStockNotBetween(String value1, String value2) {
            addCriterion("MIN_SAFETY_STOCK not between", value1, value2, "minSafetyStock");
            return (Criteria) this;
        }

        public Criteria andMaxSafetyStockIsNull() {
            addCriterion("MAX_SAFETY_STOCK is null");
            return (Criteria) this;
        }

        public Criteria andMaxSafetyStockIsNotNull() {
            addCriterion("MAX_SAFETY_STOCK is not null");
            return (Criteria) this;
        }

        public Criteria andMaxSafetyStockEqualTo(String value) {
            addCriterion("MAX_SAFETY_STOCK =", value, "maxSafetyStock");
            return (Criteria) this;
        }

        public Criteria andMaxSafetyStockNotEqualTo(String value) {
            addCriterion("MAX_SAFETY_STOCK <>", value, "maxSafetyStock");
            return (Criteria) this;
        }

        public Criteria andMaxSafetyStockGreaterThan(String value) {
            addCriterion("MAX_SAFETY_STOCK >", value, "maxSafetyStock");
            return (Criteria) this;
        }

        public Criteria andMaxSafetyStockGreaterThanOrEqualTo(String value) {
            addCriterion("MAX_SAFETY_STOCK >=", value, "maxSafetyStock");
            return (Criteria) this;
        }

        public Criteria andMaxSafetyStockLessThan(String value) {
            addCriterion("MAX_SAFETY_STOCK <", value, "maxSafetyStock");
            return (Criteria) this;
        }

        public Criteria andMaxSafetyStockLessThanOrEqualTo(String value) {
            addCriterion("MAX_SAFETY_STOCK <=", value, "maxSafetyStock");
            return (Criteria) this;
        }

        public Criteria andMaxSafetyStockLike(String value) {
            addCriterion("MAX_SAFETY_STOCK like", value, "maxSafetyStock");
            return (Criteria) this;
        }

        public Criteria andMaxSafetyStockNotLike(String value) {
            addCriterion("MAX_SAFETY_STOCK not like", value, "maxSafetyStock");
            return (Criteria) this;
        }

        public Criteria andMaxSafetyStockIn(List<String> values) {
            addCriterion("MAX_SAFETY_STOCK in", values, "maxSafetyStock");
            return (Criteria) this;
        }

        public Criteria andMaxSafetyStockNotIn(List<String> values) {
            addCriterion("MAX_SAFETY_STOCK not in", values, "maxSafetyStock");
            return (Criteria) this;
        }

        public Criteria andMaxSafetyStockBetween(String value1, String value2) {
            addCriterion("MAX_SAFETY_STOCK between", value1, value2, "maxSafetyStock");
            return (Criteria) this;
        }

        public Criteria andMaxSafetyStockNotBetween(String value1, String value2) {
            addCriterion("MAX_SAFETY_STOCK not between", value1, value2, "maxSafetyStock");
            return (Criteria) this;
        }

        public Criteria andRefPriceIsNull() {
            addCriterion("REF_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andRefPriceIsNotNull() {
            addCriterion("REF_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andRefPriceEqualTo(String value) {
            addCriterion("REF_PRICE =", value, "refPrice");
            return (Criteria) this;
        }

        public Criteria andRefPriceNotEqualTo(String value) {
            addCriterion("REF_PRICE <>", value, "refPrice");
            return (Criteria) this;
        }

        public Criteria andRefPriceGreaterThan(String value) {
            addCriterion("REF_PRICE >", value, "refPrice");
            return (Criteria) this;
        }

        public Criteria andRefPriceGreaterThanOrEqualTo(String value) {
            addCriterion("REF_PRICE >=", value, "refPrice");
            return (Criteria) this;
        }

        public Criteria andRefPriceLessThan(String value) {
            addCriterion("REF_PRICE <", value, "refPrice");
            return (Criteria) this;
        }

        public Criteria andRefPriceLessThanOrEqualTo(String value) {
            addCriterion("REF_PRICE <=", value, "refPrice");
            return (Criteria) this;
        }

        public Criteria andRefPriceLike(String value) {
            addCriterion("REF_PRICE like", value, "refPrice");
            return (Criteria) this;
        }

        public Criteria andRefPriceNotLike(String value) {
            addCriterion("REF_PRICE not like", value, "refPrice");
            return (Criteria) this;
        }

        public Criteria andRefPriceIn(List<String> values) {
            addCriterion("REF_PRICE in", values, "refPrice");
            return (Criteria) this;
        }

        public Criteria andRefPriceNotIn(List<String> values) {
            addCriterion("REF_PRICE not in", values, "refPrice");
            return (Criteria) this;
        }

        public Criteria andRefPriceBetween(String value1, String value2) {
            addCriterion("REF_PRICE between", value1, value2, "refPrice");
            return (Criteria) this;
        }

        public Criteria andRefPriceNotBetween(String value1, String value2) {
            addCriterion("REF_PRICE not between", value1, value2, "refPrice");
            return (Criteria) this;
        }

        public Criteria andTotalInventoryIsNull() {
            addCriterion("TOTAL_INVENTORY is null");
            return (Criteria) this;
        }

        public Criteria andTotalInventoryIsNotNull() {
            addCriterion("TOTAL_INVENTORY is not null");
            return (Criteria) this;
        }

        public Criteria andTotalInventoryEqualTo(String value) {
            addCriterion("TOTAL_INVENTORY =", value, "totalInventory");
            return (Criteria) this;
        }

        public Criteria andTotalInventoryNotEqualTo(String value) {
            addCriterion("TOTAL_INVENTORY <>", value, "totalInventory");
            return (Criteria) this;
        }

        public Criteria andTotalInventoryGreaterThan(String value) {
            addCriterion("TOTAL_INVENTORY >", value, "totalInventory");
            return (Criteria) this;
        }

        public Criteria andTotalInventoryGreaterThanOrEqualTo(String value) {
            addCriterion("TOTAL_INVENTORY >=", value, "totalInventory");
            return (Criteria) this;
        }

        public Criteria andTotalInventoryLessThan(String value) {
            addCriterion("TOTAL_INVENTORY <", value, "totalInventory");
            return (Criteria) this;
        }

        public Criteria andTotalInventoryLessThanOrEqualTo(String value) {
            addCriterion("TOTAL_INVENTORY <=", value, "totalInventory");
            return (Criteria) this;
        }

        public Criteria andTotalInventoryLike(String value) {
            addCriterion("TOTAL_INVENTORY like", value, "totalInventory");
            return (Criteria) this;
        }

        public Criteria andTotalInventoryNotLike(String value) {
            addCriterion("TOTAL_INVENTORY not like", value, "totalInventory");
            return (Criteria) this;
        }

        public Criteria andTotalInventoryIn(List<String> values) {
            addCriterion("TOTAL_INVENTORY in", values, "totalInventory");
            return (Criteria) this;
        }

        public Criteria andTotalInventoryNotIn(List<String> values) {
            addCriterion("TOTAL_INVENTORY not in", values, "totalInventory");
            return (Criteria) this;
        }

        public Criteria andTotalInventoryBetween(String value1, String value2) {
            addCriterion("TOTAL_INVENTORY between", value1, value2, "totalInventory");
            return (Criteria) this;
        }

        public Criteria andTotalInventoryNotBetween(String value1, String value2) {
            addCriterion("TOTAL_INVENTORY not between", value1, value2, "totalInventory");
            return (Criteria) this;
        }

        public Criteria andSharingIsNull() {
            addCriterion("SHARING is null");
            return (Criteria) this;
        }

        public Criteria andSharingIsNotNull() {
            addCriterion("SHARING is not null");
            return (Criteria) this;
        }

        public Criteria andSharingEqualTo(String value) {
            addCriterion("SHARING =", value, "sharing");
            return (Criteria) this;
        }

        public Criteria andSharingNotEqualTo(String value) {
            addCriterion("SHARING <>", value, "sharing");
            return (Criteria) this;
        }

        public Criteria andSharingGreaterThan(String value) {
            addCriterion("SHARING >", value, "sharing");
            return (Criteria) this;
        }

        public Criteria andSharingGreaterThanOrEqualTo(String value) {
            addCriterion("SHARING >=", value, "sharing");
            return (Criteria) this;
        }

        public Criteria andSharingLessThan(String value) {
            addCriterion("SHARING <", value, "sharing");
            return (Criteria) this;
        }

        public Criteria andSharingLessThanOrEqualTo(String value) {
            addCriterion("SHARING <=", value, "sharing");
            return (Criteria) this;
        }

        public Criteria andSharingLike(String value) {
            addCriterion("SHARING like", value, "sharing");
            return (Criteria) this;
        }

        public Criteria andSharingNotLike(String value) {
            addCriterion("SHARING not like", value, "sharing");
            return (Criteria) this;
        }

        public Criteria andSharingIn(List<String> values) {
            addCriterion("SHARING in", values, "sharing");
            return (Criteria) this;
        }

        public Criteria andSharingNotIn(List<String> values) {
            addCriterion("SHARING not in", values, "sharing");
            return (Criteria) this;
        }

        public Criteria andSharingBetween(String value1, String value2) {
            addCriterion("SHARING between", value1, value2, "sharing");
            return (Criteria) this;
        }

        public Criteria andSharingNotBetween(String value1, String value2) {
            addCriterion("SHARING not between", value1, value2, "sharing");
            return (Criteria) this;
        }

        public Criteria andSafetyIdIsNull() {
            addCriterion("SAFETY_ID is null");
            return (Criteria) this;
        }

        public Criteria andSafetyIdIsNotNull() {
            addCriterion("SAFETY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSafetyIdEqualTo(String value) {
            addCriterion("SAFETY_ID =", value, "safetyId");
            return (Criteria) this;
        }

        public Criteria andSafetyIdNotEqualTo(String value) {
            addCriterion("SAFETY_ID <>", value, "safetyId");
            return (Criteria) this;
        }

        public Criteria andSafetyIdGreaterThan(String value) {
            addCriterion("SAFETY_ID >", value, "safetyId");
            return (Criteria) this;
        }

        public Criteria andSafetyIdGreaterThanOrEqualTo(String value) {
            addCriterion("SAFETY_ID >=", value, "safetyId");
            return (Criteria) this;
        }

        public Criteria andSafetyIdLessThan(String value) {
            addCriterion("SAFETY_ID <", value, "safetyId");
            return (Criteria) this;
        }

        public Criteria andSafetyIdLessThanOrEqualTo(String value) {
            addCriterion("SAFETY_ID <=", value, "safetyId");
            return (Criteria) this;
        }

        public Criteria andSafetyIdLike(String value) {
            addCriterion("SAFETY_ID like", value, "safetyId");
            return (Criteria) this;
        }

        public Criteria andSafetyIdNotLike(String value) {
            addCriterion("SAFETY_ID not like", value, "safetyId");
            return (Criteria) this;
        }

        public Criteria andSafetyIdIn(List<String> values) {
            addCriterion("SAFETY_ID in", values, "safetyId");
            return (Criteria) this;
        }

        public Criteria andSafetyIdNotIn(List<String> values) {
            addCriterion("SAFETY_ID not in", values, "safetyId");
            return (Criteria) this;
        }

        public Criteria andSafetyIdBetween(String value1, String value2) {
            addCriterion("SAFETY_ID between", value1, value2, "safetyId");
            return (Criteria) this;
        }

        public Criteria andSafetyIdNotBetween(String value1, String value2) {
            addCriterion("SAFETY_ID not between", value1, value2, "safetyId");
            return (Criteria) this;
        }

        public Criteria andPlaceOfProductionIsNull() {
            addCriterion("PLACE_OF_PRODUCTION is null");
            return (Criteria) this;
        }

        public Criteria andPlaceOfProductionIsNotNull() {
            addCriterion("PLACE_OF_PRODUCTION is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceOfProductionEqualTo(String value) {
            addCriterion("PLACE_OF_PRODUCTION =", value, "placeOfProduction");
            return (Criteria) this;
        }

        public Criteria andPlaceOfProductionNotEqualTo(String value) {
            addCriterion("PLACE_OF_PRODUCTION <>", value, "placeOfProduction");
            return (Criteria) this;
        }

        public Criteria andPlaceOfProductionGreaterThan(String value) {
            addCriterion("PLACE_OF_PRODUCTION >", value, "placeOfProduction");
            return (Criteria) this;
        }

        public Criteria andPlaceOfProductionGreaterThanOrEqualTo(String value) {
            addCriterion("PLACE_OF_PRODUCTION >=", value, "placeOfProduction");
            return (Criteria) this;
        }

        public Criteria andPlaceOfProductionLessThan(String value) {
            addCriterion("PLACE_OF_PRODUCTION <", value, "placeOfProduction");
            return (Criteria) this;
        }

        public Criteria andPlaceOfProductionLessThanOrEqualTo(String value) {
            addCriterion("PLACE_OF_PRODUCTION <=", value, "placeOfProduction");
            return (Criteria) this;
        }

        public Criteria andPlaceOfProductionLike(String value) {
            addCriterion("PLACE_OF_PRODUCTION like", value, "placeOfProduction");
            return (Criteria) this;
        }

        public Criteria andPlaceOfProductionNotLike(String value) {
            addCriterion("PLACE_OF_PRODUCTION not like", value, "placeOfProduction");
            return (Criteria) this;
        }

        public Criteria andPlaceOfProductionIn(List<String> values) {
            addCriterion("PLACE_OF_PRODUCTION in", values, "placeOfProduction");
            return (Criteria) this;
        }

        public Criteria andPlaceOfProductionNotIn(List<String> values) {
            addCriterion("PLACE_OF_PRODUCTION not in", values, "placeOfProduction");
            return (Criteria) this;
        }

        public Criteria andPlaceOfProductionBetween(String value1, String value2) {
            addCriterion("PLACE_OF_PRODUCTION between", value1, value2, "placeOfProduction");
            return (Criteria) this;
        }

        public Criteria andPlaceOfProductionNotBetween(String value1, String value2) {
            addCriterion("PLACE_OF_PRODUCTION not between", value1, value2, "placeOfProduction");
            return (Criteria) this;
        }

        public Criteria andTotalCollectionIsNull() {
            addCriterion("TOTAL_COLLECTION is null");
            return (Criteria) this;
        }

        public Criteria andTotalCollectionIsNotNull() {
            addCriterion("TOTAL_COLLECTION is not null");
            return (Criteria) this;
        }

        public Criteria andTotalCollectionEqualTo(String value) {
            addCriterion("TOTAL_COLLECTION =", value, "totalCollection");
            return (Criteria) this;
        }

        public Criteria andTotalCollectionNotEqualTo(String value) {
            addCriterion("TOTAL_COLLECTION <>", value, "totalCollection");
            return (Criteria) this;
        }

        public Criteria andTotalCollectionGreaterThan(String value) {
            addCriterion("TOTAL_COLLECTION >", value, "totalCollection");
            return (Criteria) this;
        }

        public Criteria andTotalCollectionGreaterThanOrEqualTo(String value) {
            addCriterion("TOTAL_COLLECTION >=", value, "totalCollection");
            return (Criteria) this;
        }

        public Criteria andTotalCollectionLessThan(String value) {
            addCriterion("TOTAL_COLLECTION <", value, "totalCollection");
            return (Criteria) this;
        }

        public Criteria andTotalCollectionLessThanOrEqualTo(String value) {
            addCriterion("TOTAL_COLLECTION <=", value, "totalCollection");
            return (Criteria) this;
        }

        public Criteria andTotalCollectionLike(String value) {
            addCriterion("TOTAL_COLLECTION like", value, "totalCollection");
            return (Criteria) this;
        }

        public Criteria andTotalCollectionNotLike(String value) {
            addCriterion("TOTAL_COLLECTION not like", value, "totalCollection");
            return (Criteria) this;
        }

        public Criteria andTotalCollectionIn(List<String> values) {
            addCriterion("TOTAL_COLLECTION in", values, "totalCollection");
            return (Criteria) this;
        }

        public Criteria andTotalCollectionNotIn(List<String> values) {
            addCriterion("TOTAL_COLLECTION not in", values, "totalCollection");
            return (Criteria) this;
        }

        public Criteria andTotalCollectionBetween(String value1, String value2) {
            addCriterion("TOTAL_COLLECTION between", value1, value2, "totalCollection");
            return (Criteria) this;
        }

        public Criteria andTotalCollectionNotBetween(String value1, String value2) {
            addCriterion("TOTAL_COLLECTION not between", value1, value2, "totalCollection");
            return (Criteria) this;
        }

        public Criteria andAnnualConsumptionIsNull() {
            addCriterion("ANNUAL_CONSUMPTION is null");
            return (Criteria) this;
        }

        public Criteria andAnnualConsumptionIsNotNull() {
            addCriterion("ANNUAL_CONSUMPTION is not null");
            return (Criteria) this;
        }

        public Criteria andAnnualConsumptionEqualTo(String value) {
            addCriterion("ANNUAL_CONSUMPTION =", value, "annualConsumption");
            return (Criteria) this;
        }

        public Criteria andAnnualConsumptionNotEqualTo(String value) {
            addCriterion("ANNUAL_CONSUMPTION <>", value, "annualConsumption");
            return (Criteria) this;
        }

        public Criteria andAnnualConsumptionGreaterThan(String value) {
            addCriterion("ANNUAL_CONSUMPTION >", value, "annualConsumption");
            return (Criteria) this;
        }

        public Criteria andAnnualConsumptionGreaterThanOrEqualTo(String value) {
            addCriterion("ANNUAL_CONSUMPTION >=", value, "annualConsumption");
            return (Criteria) this;
        }

        public Criteria andAnnualConsumptionLessThan(String value) {
            addCriterion("ANNUAL_CONSUMPTION <", value, "annualConsumption");
            return (Criteria) this;
        }

        public Criteria andAnnualConsumptionLessThanOrEqualTo(String value) {
            addCriterion("ANNUAL_CONSUMPTION <=", value, "annualConsumption");
            return (Criteria) this;
        }

        public Criteria andAnnualConsumptionLike(String value) {
            addCriterion("ANNUAL_CONSUMPTION like", value, "annualConsumption");
            return (Criteria) this;
        }

        public Criteria andAnnualConsumptionNotLike(String value) {
            addCriterion("ANNUAL_CONSUMPTION not like", value, "annualConsumption");
            return (Criteria) this;
        }

        public Criteria andAnnualConsumptionIn(List<String> values) {
            addCriterion("ANNUAL_CONSUMPTION in", values, "annualConsumption");
            return (Criteria) this;
        }

        public Criteria andAnnualConsumptionNotIn(List<String> values) {
            addCriterion("ANNUAL_CONSUMPTION not in", values, "annualConsumption");
            return (Criteria) this;
        }

        public Criteria andAnnualConsumptionBetween(String value1, String value2) {
            addCriterion("ANNUAL_CONSUMPTION between", value1, value2, "annualConsumption");
            return (Criteria) this;
        }

        public Criteria andAnnualConsumptionNotBetween(String value1, String value2) {
            addCriterion("ANNUAL_CONSUMPTION not between", value1, value2, "annualConsumption");
            return (Criteria) this;
        }

        public Criteria andAnnualCollectionTimesIsNull() {
            addCriterion("ANNUAL_COLLECTION_TIMES is null");
            return (Criteria) this;
        }

        public Criteria andAnnualCollectionTimesIsNotNull() {
            addCriterion("ANNUAL_COLLECTION_TIMES is not null");
            return (Criteria) this;
        }

        public Criteria andAnnualCollectionTimesEqualTo(String value) {
            addCriterion("ANNUAL_COLLECTION_TIMES =", value, "annualCollectionTimes");
            return (Criteria) this;
        }

        public Criteria andAnnualCollectionTimesNotEqualTo(String value) {
            addCriterion("ANNUAL_COLLECTION_TIMES <>", value, "annualCollectionTimes");
            return (Criteria) this;
        }

        public Criteria andAnnualCollectionTimesGreaterThan(String value) {
            addCriterion("ANNUAL_COLLECTION_TIMES >", value, "annualCollectionTimes");
            return (Criteria) this;
        }

        public Criteria andAnnualCollectionTimesGreaterThanOrEqualTo(String value) {
            addCriterion("ANNUAL_COLLECTION_TIMES >=", value, "annualCollectionTimes");
            return (Criteria) this;
        }

        public Criteria andAnnualCollectionTimesLessThan(String value) {
            addCriterion("ANNUAL_COLLECTION_TIMES <", value, "annualCollectionTimes");
            return (Criteria) this;
        }

        public Criteria andAnnualCollectionTimesLessThanOrEqualTo(String value) {
            addCriterion("ANNUAL_COLLECTION_TIMES <=", value, "annualCollectionTimes");
            return (Criteria) this;
        }

        public Criteria andAnnualCollectionTimesLike(String value) {
            addCriterion("ANNUAL_COLLECTION_TIMES like", value, "annualCollectionTimes");
            return (Criteria) this;
        }

        public Criteria andAnnualCollectionTimesNotLike(String value) {
            addCriterion("ANNUAL_COLLECTION_TIMES not like", value, "annualCollectionTimes");
            return (Criteria) this;
        }

        public Criteria andAnnualCollectionTimesIn(List<String> values) {
            addCriterion("ANNUAL_COLLECTION_TIMES in", values, "annualCollectionTimes");
            return (Criteria) this;
        }

        public Criteria andAnnualCollectionTimesNotIn(List<String> values) {
            addCriterion("ANNUAL_COLLECTION_TIMES not in", values, "annualCollectionTimes");
            return (Criteria) this;
        }

        public Criteria andAnnualCollectionTimesBetween(String value1, String value2) {
            addCriterion("ANNUAL_COLLECTION_TIMES between", value1, value2, "annualCollectionTimes");
            return (Criteria) this;
        }

        public Criteria andAnnualCollectionTimesNotBetween(String value1, String value2) {
            addCriterion("ANNUAL_COLLECTION_TIMES not between", value1, value2, "annualCollectionTimes");
            return (Criteria) this;
        }

        public Criteria andHistoricalCollectionQuantityIsNull() {
            addCriterion("HISTORICAL_COLLECTION_QUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andHistoricalCollectionQuantityIsNotNull() {
            addCriterion("HISTORICAL_COLLECTION_QUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andHistoricalCollectionQuantityEqualTo(String value) {
            addCriterion("HISTORICAL_COLLECTION_QUANTITY =", value, "historicalCollectionQuantity");
            return (Criteria) this;
        }

        public Criteria andHistoricalCollectionQuantityNotEqualTo(String value) {
            addCriterion("HISTORICAL_COLLECTION_QUANTITY <>", value, "historicalCollectionQuantity");
            return (Criteria) this;
        }

        public Criteria andHistoricalCollectionQuantityGreaterThan(String value) {
            addCriterion("HISTORICAL_COLLECTION_QUANTITY >", value, "historicalCollectionQuantity");
            return (Criteria) this;
        }

        public Criteria andHistoricalCollectionQuantityGreaterThanOrEqualTo(String value) {
            addCriterion("HISTORICAL_COLLECTION_QUANTITY >=", value, "historicalCollectionQuantity");
            return (Criteria) this;
        }

        public Criteria andHistoricalCollectionQuantityLessThan(String value) {
            addCriterion("HISTORICAL_COLLECTION_QUANTITY <", value, "historicalCollectionQuantity");
            return (Criteria) this;
        }

        public Criteria andHistoricalCollectionQuantityLessThanOrEqualTo(String value) {
            addCriterion("HISTORICAL_COLLECTION_QUANTITY <=", value, "historicalCollectionQuantity");
            return (Criteria) this;
        }

        public Criteria andHistoricalCollectionQuantityLike(String value) {
            addCriterion("HISTORICAL_COLLECTION_QUANTITY like", value, "historicalCollectionQuantity");
            return (Criteria) this;
        }

        public Criteria andHistoricalCollectionQuantityNotLike(String value) {
            addCriterion("HISTORICAL_COLLECTION_QUANTITY not like", value, "historicalCollectionQuantity");
            return (Criteria) this;
        }

        public Criteria andHistoricalCollectionQuantityIn(List<String> values) {
            addCriterion("HISTORICAL_COLLECTION_QUANTITY in", values, "historicalCollectionQuantity");
            return (Criteria) this;
        }

        public Criteria andHistoricalCollectionQuantityNotIn(List<String> values) {
            addCriterion("HISTORICAL_COLLECTION_QUANTITY not in", values, "historicalCollectionQuantity");
            return (Criteria) this;
        }

        public Criteria andHistoricalCollectionQuantityBetween(String value1, String value2) {
            addCriterion("HISTORICAL_COLLECTION_QUANTITY between", value1, value2, "historicalCollectionQuantity");
            return (Criteria) this;
        }

        public Criteria andHistoricalCollectionQuantityNotBetween(String value1, String value2) {
            addCriterion("HISTORICAL_COLLECTION_QUANTITY not between", value1, value2, "historicalCollectionQuantity");
            return (Criteria) this;
        }

        public Criteria andMaterialAttributeIsNull() {
            addCriterion("MATERIAL_ATTRIBUTE is null");
            return (Criteria) this;
        }

        public Criteria andMaterialAttributeIsNotNull() {
            addCriterion("MATERIAL_ATTRIBUTE is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialAttributeEqualTo(String value) {
            addCriterion("MATERIAL_ATTRIBUTE =", value, "materialAttribute");
            return (Criteria) this;
        }

        public Criteria andMaterialAttributeNotEqualTo(String value) {
            addCriterion("MATERIAL_ATTRIBUTE <>", value, "materialAttribute");
            return (Criteria) this;
        }

        public Criteria andMaterialAttributeGreaterThan(String value) {
            addCriterion("MATERIAL_ATTRIBUTE >", value, "materialAttribute");
            return (Criteria) this;
        }

        public Criteria andMaterialAttributeGreaterThanOrEqualTo(String value) {
            addCriterion("MATERIAL_ATTRIBUTE >=", value, "materialAttribute");
            return (Criteria) this;
        }

        public Criteria andMaterialAttributeLessThan(String value) {
            addCriterion("MATERIAL_ATTRIBUTE <", value, "materialAttribute");
            return (Criteria) this;
        }

        public Criteria andMaterialAttributeLessThanOrEqualTo(String value) {
            addCriterion("MATERIAL_ATTRIBUTE <=", value, "materialAttribute");
            return (Criteria) this;
        }

        public Criteria andMaterialAttributeLike(String value) {
            addCriterion("MATERIAL_ATTRIBUTE like", value, "materialAttribute");
            return (Criteria) this;
        }

        public Criteria andMaterialAttributeNotLike(String value) {
            addCriterion("MATERIAL_ATTRIBUTE not like", value, "materialAttribute");
            return (Criteria) this;
        }

        public Criteria andMaterialAttributeIn(List<String> values) {
            addCriterion("MATERIAL_ATTRIBUTE in", values, "materialAttribute");
            return (Criteria) this;
        }

        public Criteria andMaterialAttributeNotIn(List<String> values) {
            addCriterion("MATERIAL_ATTRIBUTE not in", values, "materialAttribute");
            return (Criteria) this;
        }

        public Criteria andMaterialAttributeBetween(String value1, String value2) {
            addCriterion("MATERIAL_ATTRIBUTE between", value1, value2, "materialAttribute");
            return (Criteria) this;
        }

        public Criteria andMaterialAttributeNotBetween(String value1, String value2) {
            addCriterion("MATERIAL_ATTRIBUTE not between", value1, value2, "materialAttribute");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("REMARKS is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("REMARKS is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("REMARKS =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("REMARKS <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("REMARKS >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("REMARKS >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("REMARKS <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("REMARKS <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("REMARKS like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("REMARKS not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("REMARKS in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("REMARKS not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("REMARKS between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("REMARKS not between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andAttributeIsNull() {
            addCriterion("`ATTRIBUTE` is null");
            return (Criteria) this;
        }

        public Criteria andAttributeIsNotNull() {
            addCriterion("`ATTRIBUTE` is not null");
            return (Criteria) this;
        }

        public Criteria andAttributeEqualTo(String value) {
            addCriterion("`ATTRIBUTE` =", value, "attribute");
            return (Criteria) this;
        }

        public Criteria andAttributeNotEqualTo(String value) {
            addCriterion("`ATTRIBUTE` <>", value, "attribute");
            return (Criteria) this;
        }

        public Criteria andAttributeGreaterThan(String value) {
            addCriterion("`ATTRIBUTE` >", value, "attribute");
            return (Criteria) this;
        }

        public Criteria andAttributeGreaterThanOrEqualTo(String value) {
            addCriterion("`ATTRIBUTE` >=", value, "attribute");
            return (Criteria) this;
        }

        public Criteria andAttributeLessThan(String value) {
            addCriterion("`ATTRIBUTE` <", value, "attribute");
            return (Criteria) this;
        }

        public Criteria andAttributeLessThanOrEqualTo(String value) {
            addCriterion("`ATTRIBUTE` <=", value, "attribute");
            return (Criteria) this;
        }

        public Criteria andAttributeLike(String value) {
            addCriterion("`ATTRIBUTE` like", value, "attribute");
            return (Criteria) this;
        }

        public Criteria andAttributeNotLike(String value) {
            addCriterion("`ATTRIBUTE` not like", value, "attribute");
            return (Criteria) this;
        }

        public Criteria andAttributeIn(List<String> values) {
            addCriterion("`ATTRIBUTE` in", values, "attribute");
            return (Criteria) this;
        }

        public Criteria andAttributeNotIn(List<String> values) {
            addCriterion("`ATTRIBUTE` not in", values, "attribute");
            return (Criteria) this;
        }

        public Criteria andAttributeBetween(String value1, String value2) {
            addCriterion("`ATTRIBUTE` between", value1, value2, "attribute");
            return (Criteria) this;
        }

        public Criteria andAttributeNotBetween(String value1, String value2) {
            addCriterion("`ATTRIBUTE` not between", value1, value2, "attribute");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNull() {
            addCriterion("PHOTO is null");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNotNull() {
            addCriterion("PHOTO is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoEqualTo(String value) {
            addCriterion("PHOTO =", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotEqualTo(String value) {
            addCriterion("PHOTO <>", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThan(String value) {
            addCriterion("PHOTO >", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("PHOTO >=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThan(String value) {
            addCriterion("PHOTO <", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThanOrEqualTo(String value) {
            addCriterion("PHOTO <=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLike(String value) {
            addCriterion("PHOTO like", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotLike(String value) {
            addCriterion("PHOTO not like", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoIn(List<String> values) {
            addCriterion("PHOTO in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotIn(List<String> values) {
            addCriterion("PHOTO not in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoBetween(String value1, String value2) {
            addCriterion("PHOTO between", value1, value2, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotBetween(String value1, String value2) {
            addCriterion("PHOTO not between", value1, value2, "photo");
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

        public Criteria andPurchaseCycleEqualTo(String value) {
            addCriterion("PURCHASE_CYCLE =", value, "purchaseCycle");
            return (Criteria) this;
        }

        public Criteria andPurchaseCycleNotEqualTo(String value) {
            addCriterion("PURCHASE_CYCLE <>", value, "purchaseCycle");
            return (Criteria) this;
        }

        public Criteria andPurchaseCycleGreaterThan(String value) {
            addCriterion("PURCHASE_CYCLE >", value, "purchaseCycle");
            return (Criteria) this;
        }

        public Criteria andPurchaseCycleGreaterThanOrEqualTo(String value) {
            addCriterion("PURCHASE_CYCLE >=", value, "purchaseCycle");
            return (Criteria) this;
        }

        public Criteria andPurchaseCycleLessThan(String value) {
            addCriterion("PURCHASE_CYCLE <", value, "purchaseCycle");
            return (Criteria) this;
        }

        public Criteria andPurchaseCycleLessThanOrEqualTo(String value) {
            addCriterion("PURCHASE_CYCLE <=", value, "purchaseCycle");
            return (Criteria) this;
        }

        public Criteria andPurchaseCycleLike(String value) {
            addCriterion("PURCHASE_CYCLE like", value, "purchaseCycle");
            return (Criteria) this;
        }

        public Criteria andPurchaseCycleNotLike(String value) {
            addCriterion("PURCHASE_CYCLE not like", value, "purchaseCycle");
            return (Criteria) this;
        }

        public Criteria andPurchaseCycleIn(List<String> values) {
            addCriterion("PURCHASE_CYCLE in", values, "purchaseCycle");
            return (Criteria) this;
        }

        public Criteria andPurchaseCycleNotIn(List<String> values) {
            addCriterion("PURCHASE_CYCLE not in", values, "purchaseCycle");
            return (Criteria) this;
        }

        public Criteria andPurchaseCycleBetween(String value1, String value2) {
            addCriterion("PURCHASE_CYCLE between", value1, value2, "purchaseCycle");
            return (Criteria) this;
        }

        public Criteria andPurchaseCycleNotBetween(String value1, String value2) {
            addCriterion("PURCHASE_CYCLE not between", value1, value2, "purchaseCycle");
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