package com.xtk.apistation.webapi.bean;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * MAT_PURCHASING_STATUS
 * @author 
 */
public class MatPurchasingStatus implements Serializable {
    private BigDecimal tid;

    private BigDecimal serialNumber;

    private String requestId;

    private String requestNum;

    private String nodeStats;

    private String nodeTime;

    private String feedbackInfo;

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

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getRequestNum() {
        return requestNum;
    }

    public void setRequestNum(String requestNum) {
        this.requestNum = requestNum;
    }

    public String getNodeStats() {
        return nodeStats;
    }

    public void setNodeStats(String nodeStats) {
        this.nodeStats = nodeStats;
    }

    public String getNodeTime() {
        return nodeTime;
    }

    public void setNodeTime(String nodeTime) {
        this.nodeTime = nodeTime;
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
        MatPurchasingStatus other = (MatPurchasingStatus) that;
        return (this.getTid() == null ? other.getTid() == null : this.getTid().equals(other.getTid()))
            && (this.getSerialNumber() == null ? other.getSerialNumber() == null : this.getSerialNumber().equals(other.getSerialNumber()))
            && (this.getRequestId() == null ? other.getRequestId() == null : this.getRequestId().equals(other.getRequestId()))
            && (this.getRequestNum() == null ? other.getRequestNum() == null : this.getRequestNum().equals(other.getRequestNum()))
            && (this.getNodeStats() == null ? other.getNodeStats() == null : this.getNodeStats().equals(other.getNodeStats()))
            && (this.getNodeTime() == null ? other.getNodeTime() == null : this.getNodeTime().equals(other.getNodeTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTid() == null) ? 0 : getTid().hashCode());
        result = prime * result + ((getSerialNumber() == null) ? 0 : getSerialNumber().hashCode());
        result = prime * result + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        result = prime * result + ((getRequestNum() == null) ? 0 : getRequestNum().hashCode());
        result = prime * result + ((getNodeStats() == null) ? 0 : getNodeStats().hashCode());
        result = prime * result + ((getNodeTime() == null) ? 0 : getNodeTime().hashCode());
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
        sb.append(", requestId=").append(requestId);
        sb.append(", requestNum=").append(requestNum);
        sb.append(", nodeStats=").append(nodeStats);
        sb.append(", nodeTime=").append(nodeTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    public String getFeedbackInfo() {
        return feedbackInfo;
    }

    public void setFeedbackInfo(String feedbackInfo) {
        this.feedbackInfo = feedbackInfo;
    }
}