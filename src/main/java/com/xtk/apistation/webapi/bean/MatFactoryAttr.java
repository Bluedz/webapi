package com.xtk.apistation.webapi.bean;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * MAT_FACTORY_ATTR
 * @author 
 */
public class MatFactoryAttr implements Serializable {
    private BigDecimal tid;

    private BigDecimal serialNumber;

    private String materialNumber;

    private String area;

    private BigDecimal stockMax;

    private BigDecimal stockMin;

    private BigDecimal qualityAssurance;

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

    public String getMaterialNumber() {
        return materialNumber;
    }

    public void setMaterialNumber(String materialNumber) {
        this.materialNumber = materialNumber;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public BigDecimal getStockMax() {
        return stockMax;
    }

    public void setStockMax(BigDecimal stockMax) {
        this.stockMax = stockMax;
    }

    public BigDecimal getStockMin() {
        return stockMin;
    }

    public void setStockMin(BigDecimal stockMin) {
        this.stockMin = stockMin;
    }

    public BigDecimal getQualityAssurance() {
        return qualityAssurance;
    }

    public void setQualityAssurance(BigDecimal qualityAssurance) {
        this.qualityAssurance = qualityAssurance;
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
        MatFactoryAttr other = (MatFactoryAttr) that;
        return (this.getTid() == null ? other.getTid() == null : this.getTid().equals(other.getTid()))
            && (this.getSerialNumber() == null ? other.getSerialNumber() == null : this.getSerialNumber().equals(other.getSerialNumber()))
            && (this.getMaterialNumber() == null ? other.getMaterialNumber() == null : this.getMaterialNumber().equals(other.getMaterialNumber()))
            && (this.getArea() == null ? other.getArea() == null : this.getArea().equals(other.getArea()))
            && (this.getStockMax() == null ? other.getStockMax() == null : this.getStockMax().equals(other.getStockMax()))
            && (this.getStockMin() == null ? other.getStockMin() == null : this.getStockMin().equals(other.getStockMin()))
            && (this.getQualityAssurance() == null ? other.getQualityAssurance() == null : this.getQualityAssurance().equals(other.getQualityAssurance()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTid() == null) ? 0 : getTid().hashCode());
        result = prime * result + ((getSerialNumber() == null) ? 0 : getSerialNumber().hashCode());
        result = prime * result + ((getMaterialNumber() == null) ? 0 : getMaterialNumber().hashCode());
        result = prime * result + ((getArea() == null) ? 0 : getArea().hashCode());
        result = prime * result + ((getStockMax() == null) ? 0 : getStockMax().hashCode());
        result = prime * result + ((getStockMin() == null) ? 0 : getStockMin().hashCode());
        result = prime * result + ((getQualityAssurance() == null) ? 0 : getQualityAssurance().hashCode());
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
        sb.append(", materialNumber=").append(materialNumber);
        sb.append(", area=").append(area);
        sb.append(", stockMax=").append(stockMax);
        sb.append(", stockMin=").append(stockMin);
        sb.append(", qualityAssurance=").append(qualityAssurance);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}