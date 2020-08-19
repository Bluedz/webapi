package com.xtk.apistation.webapi.bean;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * TPMS_MAT_INFO
 * @author 
 */
public class TpmsMatInfo implements Serializable {
    private BigDecimal tid;

    private BigDecimal serialNumber;

    private String dcMatnum;

    private String svwMatnum;

    private String unit;

    private String descSpec;

    private String ogSpec;

    private String mfr;

    private String mfrNo;

    private String equipMfr;

    private String equipMfrNo;

    private String equipNo;

    private String diagramNo;

    private String prodCodeDesc;

    private String abcCode;

    private String plannerCode;

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

    public String getDcMatnum() {
        return dcMatnum;
    }

    public void setDcMatnum(String dcMatnum) {
        this.dcMatnum = dcMatnum;
    }

    public String getSvwMatnum() {
        return svwMatnum;
    }

    public void setSvwMatnum(String svwMatnum) {
        this.svwMatnum = svwMatnum;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getDescSpec() {
        return descSpec;
    }

    public void setDescSpec(String descSpec) {
        this.descSpec = descSpec;
    }

    public String getOgSpec() {
        return ogSpec;
    }

    public void setOgSpec(String ogSpec) {
        this.ogSpec = ogSpec;
    }

    public String getMfr() {
        return mfr;
    }

    public void setMfr(String mfr) {
        this.mfr = mfr;
    }

    public String getMfrNo() {
        return mfrNo;
    }

    public void setMfrNo(String mfrNo) {
        this.mfrNo = mfrNo;
    }

    public String getEquipMfr() {
        return equipMfr;
    }

    public void setEquipMfr(String equipMfr) {
        this.equipMfr = equipMfr;
    }

    public String getEquipMfrNo() {
        return equipMfrNo;
    }

    public void setEquipMfrNo(String equipMfrNo) {
        this.equipMfrNo = equipMfrNo;
    }

    public String getEquipNo() {
        return equipNo;
    }

    public void setEquipNo(String equipNo) {
        this.equipNo = equipNo;
    }

    public String getDiagramNo() {
        return diagramNo;
    }

    public void setDiagramNo(String diagramNo) {
        this.diagramNo = diagramNo;
    }

    public String getProdCodeDesc() {
        return prodCodeDesc;
    }

    public void setProdCodeDesc(String prodCodeDesc) {
        this.prodCodeDesc = prodCodeDesc;
    }

    public String getAbcCode() {
        return abcCode;
    }

    public void setAbcCode(String abcCode) {
        this.abcCode = abcCode;
    }

    public String getPlannerCode() {
        return plannerCode;
    }

    public void setPlannerCode(String plannerCode) {
        this.plannerCode = plannerCode;
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
        TpmsMatInfo other = (TpmsMatInfo) that;
        return (this.getTid() == null ? other.getTid() == null : this.getTid().equals(other.getTid()))
            && (this.getSerialNumber() == null ? other.getSerialNumber() == null : this.getSerialNumber().equals(other.getSerialNumber()))
            && (this.getDcMatnum() == null ? other.getDcMatnum() == null : this.getDcMatnum().equals(other.getDcMatnum()))
            && (this.getSvwMatnum() == null ? other.getSvwMatnum() == null : this.getSvwMatnum().equals(other.getSvwMatnum()))
            && (this.getUnit() == null ? other.getUnit() == null : this.getUnit().equals(other.getUnit()))
            && (this.getDescSpec() == null ? other.getDescSpec() == null : this.getDescSpec().equals(other.getDescSpec()))
            && (this.getOgSpec() == null ? other.getOgSpec() == null : this.getOgSpec().equals(other.getOgSpec()))
            && (this.getMfr() == null ? other.getMfr() == null : this.getMfr().equals(other.getMfr()))
            && (this.getMfrNo() == null ? other.getMfrNo() == null : this.getMfrNo().equals(other.getMfrNo()))
            && (this.getEquipMfr() == null ? other.getEquipMfr() == null : this.getEquipMfr().equals(other.getEquipMfr()))
            && (this.getEquipMfrNo() == null ? other.getEquipMfrNo() == null : this.getEquipMfrNo().equals(other.getEquipMfrNo()))
            && (this.getEquipNo() == null ? other.getEquipNo() == null : this.getEquipNo().equals(other.getEquipNo()))
            && (this.getDiagramNo() == null ? other.getDiagramNo() == null : this.getDiagramNo().equals(other.getDiagramNo()))
            && (this.getProdCodeDesc() == null ? other.getProdCodeDesc() == null : this.getProdCodeDesc().equals(other.getProdCodeDesc()))
            && (this.getAbcCode() == null ? other.getAbcCode() == null : this.getAbcCode().equals(other.getAbcCode()))
            && (this.getPlannerCode() == null ? other.getPlannerCode() == null : this.getPlannerCode().equals(other.getPlannerCode()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTid() == null) ? 0 : getTid().hashCode());
        result = prime * result + ((getSerialNumber() == null) ? 0 : getSerialNumber().hashCode());
        result = prime * result + ((getDcMatnum() == null) ? 0 : getDcMatnum().hashCode());
        result = prime * result + ((getSvwMatnum() == null) ? 0 : getSvwMatnum().hashCode());
        result = prime * result + ((getUnit() == null) ? 0 : getUnit().hashCode());
        result = prime * result + ((getDescSpec() == null) ? 0 : getDescSpec().hashCode());
        result = prime * result + ((getOgSpec() == null) ? 0 : getOgSpec().hashCode());
        result = prime * result + ((getMfr() == null) ? 0 : getMfr().hashCode());
        result = prime * result + ((getMfrNo() == null) ? 0 : getMfrNo().hashCode());
        result = prime * result + ((getEquipMfr() == null) ? 0 : getEquipMfr().hashCode());
        result = prime * result + ((getEquipMfrNo() == null) ? 0 : getEquipMfrNo().hashCode());
        result = prime * result + ((getEquipNo() == null) ? 0 : getEquipNo().hashCode());
        result = prime * result + ((getDiagramNo() == null) ? 0 : getDiagramNo().hashCode());
        result = prime * result + ((getProdCodeDesc() == null) ? 0 : getProdCodeDesc().hashCode());
        result = prime * result + ((getAbcCode() == null) ? 0 : getAbcCode().hashCode());
        result = prime * result + ((getPlannerCode() == null) ? 0 : getPlannerCode().hashCode());
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
        sb.append(", dcMatnum=").append(dcMatnum);
        sb.append(", svwMatnum=").append(svwMatnum);
        sb.append(", unit=").append(unit);
        sb.append(", descSpec=").append(descSpec);
        sb.append(", ogSpec=").append(ogSpec);
        sb.append(", mfr=").append(mfr);
        sb.append(", mfrNo=").append(mfrNo);
        sb.append(", equipMfr=").append(equipMfr);
        sb.append(", equipMfrNo=").append(equipMfrNo);
        sb.append(", equipNo=").append(equipNo);
        sb.append(", diagramNo=").append(diagramNo);
        sb.append(", prodCodeDesc=").append(prodCodeDesc);
        sb.append(", abcCode=").append(abcCode);
        sb.append(", plannerCode=").append(plannerCode);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}