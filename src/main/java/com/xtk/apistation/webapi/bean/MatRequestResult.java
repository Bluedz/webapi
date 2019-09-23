package com.xtk.apistation.webapi.bean;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * MAT_REQUEST_RESULT
 * @author 
 */
public class MatRequestResult implements Serializable {
    private BigDecimal tid;

    private BigDecimal serialNumber;

    private String custPo;

    private String custResult;

    private String feedbackTime;

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

    public String getCustPo() {
        return custPo;
    }

    public void setCustPo(String custPo) {
        this.custPo = custPo;
    }

    public String getCustResult() {
        return custResult;
    }

    public void setCustResult(String custResult) {
        this.custResult = custResult;
    }

    public String getFeedbackTime() {
        return feedbackTime;
    }

    public void setFeedbackTime(String feedbackTime) {
        this.feedbackTime = feedbackTime;
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
        MatRequestResult other = (MatRequestResult) that;
        return (this.getTid() == null ? other.getTid() == null : this.getTid().equals(other.getTid()))
            && (this.getSerialNumber() == null ? other.getSerialNumber() == null : this.getSerialNumber().equals(other.getSerialNumber()))
            && (this.getCustPo() == null ? other.getCustPo() == null : this.getCustPo().equals(other.getCustPo()))
            && (this.getCustResult() == null ? other.getCustResult() == null : this.getCustResult().equals(other.getCustResult()))
            && (this.getFeedbackTime() == null ? other.getFeedbackTime() == null : this.getFeedbackTime().equals(other.getFeedbackTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTid() == null) ? 0 : getTid().hashCode());
        result = prime * result + ((getSerialNumber() == null) ? 0 : getSerialNumber().hashCode());
        result = prime * result + ((getCustPo() == null) ? 0 : getCustPo().hashCode());
        result = prime * result + ((getCustResult() == null) ? 0 : getCustResult().hashCode());
        result = prime * result + ((getFeedbackTime() == null) ? 0 : getFeedbackTime().hashCode());
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
        sb.append(", custPo=").append(custPo);
        sb.append(", custResult=").append(custResult);
        sb.append(", feedbackTime=").append(feedbackTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}