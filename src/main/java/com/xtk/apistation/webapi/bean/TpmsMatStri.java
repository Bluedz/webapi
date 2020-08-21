package com.xtk.apistation.webapi.bean;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * TPMS_MAT_STRI
 * @author 
 */
public class TpmsMatStri implements Serializable {
    private BigDecimal tid;

    private BigDecimal serialNumber;

    private String factoryCo;

    private String factoryName;

    private String dcMaterialNo;

    private String svwMaterialNo;

    private String minSafetyStock;

    private String maxSafetyStock;

    private String refPrice;

    private String totalInventory;

    private String sharing;

    private String safetyId;

    private String placeOfProduction;

    private String totalCollection;

    private String annualConsumption;

    private String annualCollectionTimes;

    private String historicalCollectionQuantity;

    private String materialAttribute;

    private String remarks;

    private String attribute;

    private String photo;

    private String purchaseCycle;

    private static final long serialVersionUID = 1L;

    public BigDecimal getTid() {
        return tid;
    }

    public void setTid(BigDecimal tid) {
        this.tid = tid;
    }

    public BigDecimal getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(BigDecimal serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getFactoryCo() {
        return factoryCo;
    }

    public void setFactoryCo(String factoryCo) {
        this.factoryCo = factoryCo;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public String getDcMaterialNo() {
        return dcMaterialNo;
    }

    public void setDcMaterialNo(String dcMaterialNo) {
        this.dcMaterialNo = dcMaterialNo;
    }

    public String getSvwMaterialNo() {
        return svwMaterialNo;
    }

    public void setSvwMaterialNo(String svwMaterialNo) {
        this.svwMaterialNo = svwMaterialNo;
    }

    public String getMinSafetyStock() {
        return minSafetyStock;
    }

    public void setMinSafetyStock(String minSafetyStock) {
        this.minSafetyStock = minSafetyStock;
    }

    public String getMaxSafetyStock() {
        return maxSafetyStock;
    }

    public void setMaxSafetyStock(String maxSafetyStock) {
        this.maxSafetyStock = maxSafetyStock;
    }

    public String getRefPrice() {
        return refPrice;
    }

    public void setRefPrice(String refPrice) {
        this.refPrice = refPrice;
    }

    public String getTotalInventory() {
        return totalInventory;
    }

    public void setTotalInventory(String totalInventory) {
        this.totalInventory = totalInventory;
    }

    public String getSharing() {
        return sharing;
    }

    public void setSharing(String sharing) {
        this.sharing = sharing;
    }

    public String getSafetyId() {
        return safetyId;
    }

    public void setSafetyId(String safetyId) {
        this.safetyId = safetyId;
    }

    public String getPlaceOfProduction() {
        return placeOfProduction;
    }

    public void setPlaceOfProduction(String placeOfProduction) {
        this.placeOfProduction = placeOfProduction;
    }

    public String getTotalCollection() {
        return totalCollection;
    }

    public void setTotalCollection(String totalCollection) {
        this.totalCollection = totalCollection;
    }

    public String getAnnualConsumption() {
        return annualConsumption;
    }

    public void setAnnualConsumption(String annualConsumption) {
        this.annualConsumption = annualConsumption;
    }

    public String getAnnualCollectionTimes() {
        return annualCollectionTimes;
    }

    public void setAnnualCollectionTimes(String annualCollectionTimes) {
        this.annualCollectionTimes = annualCollectionTimes;
    }

    public String getHistoricalCollectionQuantity() {
        return historicalCollectionQuantity;
    }

    public void setHistoricalCollectionQuantity(String historicalCollectionQuantity) {
        this.historicalCollectionQuantity = historicalCollectionQuantity;
    }

    public String getMaterialAttribute() {
        return materialAttribute;
    }

    public void setMaterialAttribute(String materialAttribute) {
        this.materialAttribute = materialAttribute;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getPurchaseCycle() {
        return purchaseCycle;
    }

    public void setPurchaseCycle(String purchaseCycle) {
        this.purchaseCycle = purchaseCycle;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TpmsMatStri other = (TpmsMatStri) that;
        return (this.getTid() == null ? other.getTid() == null : this.getTid().equals(other.getTid()))
            && (this.getSerialNumber() == null ? other.getSerialNumber() == null : this.getSerialNumber().equals(other.getSerialNumber()))
            && (this.getFactoryCo() == null ? other.getFactoryCo() == null : this.getFactoryCo().equals(other.getFactoryCo()))
            && (this.getFactoryName() == null ? other.getFactoryName() == null : this.getFactoryName().equals(other.getFactoryName()))
            && (this.getDcMaterialNo() == null ? other.getDcMaterialNo() == null : this.getDcMaterialNo().equals(other.getDcMaterialNo()))
            && (this.getSvwMaterialNo() == null ? other.getSvwMaterialNo() == null : this.getSvwMaterialNo().equals(other.getSvwMaterialNo()))
            && (this.getMinSafetyStock() == null ? other.getMinSafetyStock() == null : this.getMinSafetyStock().equals(other.getMinSafetyStock()))
            && (this.getMaxSafetyStock() == null ? other.getMaxSafetyStock() == null : this.getMaxSafetyStock().equals(other.getMaxSafetyStock()))
            && (this.getRefPrice() == null ? other.getRefPrice() == null : this.getRefPrice().equals(other.getRefPrice()))
            && (this.getTotalInventory() == null ? other.getTotalInventory() == null : this.getTotalInventory().equals(other.getTotalInventory()))
            && (this.getSharing() == null ? other.getSharing() == null : this.getSharing().equals(other.getSharing()))
            && (this.getSafetyId() == null ? other.getSafetyId() == null : this.getSafetyId().equals(other.getSafetyId()))
            && (this.getPlaceOfProduction() == null ? other.getPlaceOfProduction() == null : this.getPlaceOfProduction().equals(other.getPlaceOfProduction()))
            && (this.getTotalCollection() == null ? other.getTotalCollection() == null : this.getTotalCollection().equals(other.getTotalCollection()))
            && (this.getAnnualConsumption() == null ? other.getAnnualConsumption() == null : this.getAnnualConsumption().equals(other.getAnnualConsumption()))
            && (this.getAnnualCollectionTimes() == null ? other.getAnnualCollectionTimes() == null : this.getAnnualCollectionTimes().equals(other.getAnnualCollectionTimes()))
            && (this.getHistoricalCollectionQuantity() == null ? other.getHistoricalCollectionQuantity() == null : this.getHistoricalCollectionQuantity().equals(other.getHistoricalCollectionQuantity()))
            && (this.getMaterialAttribute() == null ? other.getMaterialAttribute() == null : this.getMaterialAttribute().equals(other.getMaterialAttribute()))
            && (this.getRemarks() == null ? other.getRemarks() == null : this.getRemarks().equals(other.getRemarks()))
            && (this.getAttribute() == null ? other.getAttribute() == null : this.getAttribute().equals(other.getAttribute()))
            && (this.getPhoto() == null ? other.getPhoto() == null : this.getPhoto().equals(other.getPhoto()))
            && (this.getPurchaseCycle() == null ? other.getPurchaseCycle() == null : this.getPurchaseCycle().equals(other.getPurchaseCycle()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTid() == null) ? 0 : getTid().hashCode());
        result = prime * result + ((getSerialNumber() == null) ? 0 : getSerialNumber().hashCode());
        result = prime * result + ((getFactoryCo() == null) ? 0 : getFactoryCo().hashCode());
        result = prime * result + ((getFactoryName() == null) ? 0 : getFactoryName().hashCode());
        result = prime * result + ((getDcMaterialNo() == null) ? 0 : getDcMaterialNo().hashCode());
        result = prime * result + ((getSvwMaterialNo() == null) ? 0 : getSvwMaterialNo().hashCode());
        result = prime * result + ((getMinSafetyStock() == null) ? 0 : getMinSafetyStock().hashCode());
        result = prime * result + ((getMaxSafetyStock() == null) ? 0 : getMaxSafetyStock().hashCode());
        result = prime * result + ((getRefPrice() == null) ? 0 : getRefPrice().hashCode());
        result = prime * result + ((getTotalInventory() == null) ? 0 : getTotalInventory().hashCode());
        result = prime * result + ((getSharing() == null) ? 0 : getSharing().hashCode());
        result = prime * result + ((getSafetyId() == null) ? 0 : getSafetyId().hashCode());
        result = prime * result + ((getPlaceOfProduction() == null) ? 0 : getPlaceOfProduction().hashCode());
        result = prime * result + ((getTotalCollection() == null) ? 0 : getTotalCollection().hashCode());
        result = prime * result + ((getAnnualConsumption() == null) ? 0 : getAnnualConsumption().hashCode());
        result = prime * result + ((getAnnualCollectionTimes() == null) ? 0 : getAnnualCollectionTimes().hashCode());
        result = prime * result + ((getHistoricalCollectionQuantity() == null) ? 0 : getHistoricalCollectionQuantity().hashCode());
        result = prime * result + ((getMaterialAttribute() == null) ? 0 : getMaterialAttribute().hashCode());
        result = prime * result + ((getRemarks() == null) ? 0 : getRemarks().hashCode());
        result = prime * result + ((getAttribute() == null) ? 0 : getAttribute().hashCode());
        result = prime * result + ((getPhoto() == null) ? 0 : getPhoto().hashCode());
        result = prime * result + ((getPurchaseCycle() == null) ? 0 : getPurchaseCycle().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tid=").append(tid);
        sb.append(", serialNumber=").append(serialNumber);
        sb.append(", factoryCo=").append(factoryCo);
        sb.append(", factoryName=").append(factoryName);
        sb.append(", dcMaterialNo=").append(dcMaterialNo);
        sb.append(", svwMaterialNo=").append(svwMaterialNo);
        sb.append(", minSafetyStock=").append(minSafetyStock);
        sb.append(", maxSafetyStock=").append(maxSafetyStock);
        sb.append(", refPrice=").append(refPrice);
        sb.append(", totalInventory=").append(totalInventory);
        sb.append(", sharing=").append(sharing);
        sb.append(", safetyId=").append(safetyId);
        sb.append(", placeOfProduction=").append(placeOfProduction);
        sb.append(", totalCollection=").append(totalCollection);
        sb.append(", annualConsumption=").append(annualConsumption);
        sb.append(", annualCollectionTimes=").append(annualCollectionTimes);
        sb.append(", historicalCollectionQuantity=").append(historicalCollectionQuantity);
        sb.append(", materialAttribute=").append(materialAttribute);
        sb.append(", remarks=").append(remarks);
        sb.append(", attribute=").append(attribute);
        sb.append(", photo=").append(photo);
        sb.append(", purchaseCycle=").append(purchaseCycle);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}