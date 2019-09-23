package com.xtk.apistation.webapi.bean;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * MAT_BASIC_INFORMATION
 * @author 
 */
public class MatBasicInformation implements Serializable {
    private BigDecimal tid;

    private BigDecimal serialNumber;

    private String mid;

    private String attachmentName;

    private String type;

    private String keyMaterial;

    private String replaceMaterialNum;

    private String enterpriseName;

    private BigDecimal purchaseCycle;

    private BigDecimal unitPrice;

    private String purchaseId;

    private String local;

    private String isReparable;

    private String unit;

    private String isIncrease;

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

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getAttachmentName() {
        return attachmentName;
    }

    public void setAttachmentName(String attachmentName) {
        this.attachmentName = attachmentName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getKeyMaterial() {
        return keyMaterial;
    }

    public void setKeyMaterial(String keyMaterial) {
        this.keyMaterial = keyMaterial;
    }

    public String getReplaceMaterialNum() {
        return replaceMaterialNum;
    }

    public void setReplaceMaterialNum(String replaceMaterialNum) {
        this.replaceMaterialNum = replaceMaterialNum;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public BigDecimal getPurchaseCycle() {
        return purchaseCycle;
    }

    public void setPurchaseCycle(BigDecimal purchaseCycle) {
        this.purchaseCycle = purchaseCycle;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(String purchaseId) {
        this.purchaseId = purchaseId;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getIsReparable() {
        return isReparable;
    }

    public void setIsReparable(String isReparable) {
        this.isReparable = isReparable;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getIsIncrease() {
        return isIncrease;
    }

    public void setIsIncrease(String isIncrease) {
        this.isIncrease = isIncrease;
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
        MatBasicInformation other = (MatBasicInformation) that;
        return (this.getTid() == null ? other.getTid() == null : this.getTid().equals(other.getTid()))
            && (this.getSerialNumber() == null ? other.getSerialNumber() == null : this.getSerialNumber().equals(other.getSerialNumber()))
            && (this.getMid() == null ? other.getMid() == null : this.getMid().equals(other.getMid()))
            && (this.getAttachmentName() == null ? other.getAttachmentName() == null : this.getAttachmentName().equals(other.getAttachmentName()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getKeyMaterial() == null ? other.getKeyMaterial() == null : this.getKeyMaterial().equals(other.getKeyMaterial()))
            && (this.getReplaceMaterialNum() == null ? other.getReplaceMaterialNum() == null : this.getReplaceMaterialNum().equals(other.getReplaceMaterialNum()))
            && (this.getEnterpriseName() == null ? other.getEnterpriseName() == null : this.getEnterpriseName().equals(other.getEnterpriseName()))
            && (this.getPurchaseCycle() == null ? other.getPurchaseCycle() == null : this.getPurchaseCycle().equals(other.getPurchaseCycle()))
            && (this.getUnitPrice() == null ? other.getUnitPrice() == null : this.getUnitPrice().equals(other.getUnitPrice()))
            && (this.getPurchaseId() == null ? other.getPurchaseId() == null : this.getPurchaseId().equals(other.getPurchaseId()))
            && (this.getLocal() == null ? other.getLocal() == null : this.getLocal().equals(other.getLocal()))
            && (this.getIsReparable() == null ? other.getIsReparable() == null : this.getIsReparable().equals(other.getIsReparable()))
            && (this.getUnit() == null ? other.getUnit() == null : this.getUnit().equals(other.getUnit()))
            && (this.getIsIncrease() == null ? other.getIsIncrease() == null : this.getIsIncrease().equals(other.getIsIncrease()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTid() == null) ? 0 : getTid().hashCode());
        result = prime * result + ((getSerialNumber() == null) ? 0 : getSerialNumber().hashCode());
        result = prime * result + ((getMid() == null) ? 0 : getMid().hashCode());
        result = prime * result + ((getAttachmentName() == null) ? 0 : getAttachmentName().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getKeyMaterial() == null) ? 0 : getKeyMaterial().hashCode());
        result = prime * result + ((getReplaceMaterialNum() == null) ? 0 : getReplaceMaterialNum().hashCode());
        result = prime * result + ((getEnterpriseName() == null) ? 0 : getEnterpriseName().hashCode());
        result = prime * result + ((getPurchaseCycle() == null) ? 0 : getPurchaseCycle().hashCode());
        result = prime * result + ((getUnitPrice() == null) ? 0 : getUnitPrice().hashCode());
        result = prime * result + ((getPurchaseId() == null) ? 0 : getPurchaseId().hashCode());
        result = prime * result + ((getLocal() == null) ? 0 : getLocal().hashCode());
        result = prime * result + ((getIsReparable() == null) ? 0 : getIsReparable().hashCode());
        result = prime * result + ((getUnit() == null) ? 0 : getUnit().hashCode());
        result = prime * result + ((getIsIncrease() == null) ? 0 : getIsIncrease().hashCode());
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
        sb.append(", mid=").append(mid);
        sb.append(", attachmentName=").append(attachmentName);
        sb.append(", type=").append(type);
        sb.append(", keyMaterial=").append(keyMaterial);
        sb.append(", replaceMaterialNum=").append(replaceMaterialNum);
        sb.append(", enterpriseName=").append(enterpriseName);
        sb.append(", purchaseCycle=").append(purchaseCycle);
        sb.append(", unitPrice=").append(unitPrice);
        sb.append(", purchaseId=").append(purchaseId);
        sb.append(", local=").append(local);
        sb.append(", isReparable=").append(isReparable);
        sb.append(", unit=").append(unit);
        sb.append(", isIncrease=").append(isIncrease);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}