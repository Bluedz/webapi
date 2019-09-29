package com.xtk.apistation.webapi.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * LOG_OF_IMPORT
 * @author 
 */
public class LogOfImport implements Serializable {
    private BigDecimal tid;

    private Date importTime;

    private String nameOfInterface;

    private String nameOfTxtfile;

    private BigDecimal numberOfLine;

    private String contentOfOneline;

    private String resultOfImport;

    private String errorMessage;

    private static final long serialVersionUID = 1L;

    public BigDecimal getTid() {
        return tid;
    }

    public void setTid(BigDecimal tid) {
        this.tid = tid;
    }

    public Date getImportTime() {
        return importTime;
    }

    public void setImportTime(Date importTime) {
        this.importTime = importTime;
    }

    public String getNameOfInterface() {
        return nameOfInterface;
    }

    public void setNameOfInterface(String nameOfInterface) {
        this.nameOfInterface = nameOfInterface;
    }

    public String getNameOfTxtfile() {
        return nameOfTxtfile;
    }

    public void setNameOfTxtfile(String nameOfTxtfile) {
        this.nameOfTxtfile = nameOfTxtfile;
    }

    public BigDecimal getNumberOfLine() {
        return numberOfLine;
    }

    public void setNumberOfLine(BigDecimal numberOfLine) {
        this.numberOfLine = numberOfLine;
    }

    public String getContentOfOneline() {
        return contentOfOneline;
    }

    public void setContentOfOneline(String contentOfOneline) {
        this.contentOfOneline = contentOfOneline;
    }

    public String getResultOfImport() {
        return resultOfImport;
    }

    public void setResultOfImport(String resultOfImport) {
        this.resultOfImport = resultOfImport;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
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
        LogOfImport other = (LogOfImport) that;
        return (this.getTid() == null ? other.getTid() == null : this.getTid().equals(other.getTid()))
            && (this.getImportTime() == null ? other.getImportTime() == null : this.getImportTime().equals(other.getImportTime()))
            && (this.getNameOfInterface() == null ? other.getNameOfInterface() == null : this.getNameOfInterface().equals(other.getNameOfInterface()))
            && (this.getNameOfTxtfile() == null ? other.getNameOfTxtfile() == null : this.getNameOfTxtfile().equals(other.getNameOfTxtfile()))
            && (this.getNumberOfLine() == null ? other.getNumberOfLine() == null : this.getNumberOfLine().equals(other.getNumberOfLine()))
            && (this.getContentOfOneline() == null ? other.getContentOfOneline() == null : this.getContentOfOneline().equals(other.getContentOfOneline()))
            && (this.getResultOfImport() == null ? other.getResultOfImport() == null : this.getResultOfImport().equals(other.getResultOfImport()))
            && (this.getErrorMessage() == null ? other.getErrorMessage() == null : this.getErrorMessage().equals(other.getErrorMessage()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTid() == null) ? 0 : getTid().hashCode());
        result = prime * result + ((getImportTime() == null) ? 0 : getImportTime().hashCode());
        result = prime * result + ((getNameOfInterface() == null) ? 0 : getNameOfInterface().hashCode());
        result = prime * result + ((getNameOfTxtfile() == null) ? 0 : getNameOfTxtfile().hashCode());
        result = prime * result + ((getNumberOfLine() == null) ? 0 : getNumberOfLine().hashCode());
        result = prime * result + ((getContentOfOneline() == null) ? 0 : getContentOfOneline().hashCode());
        result = prime * result + ((getResultOfImport() == null) ? 0 : getResultOfImport().hashCode());
        result = prime * result + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tid=").append(tid);
        sb.append(", importTime=").append(importTime);
        sb.append(", nameOfInterface=").append(nameOfInterface);
        sb.append(", nameOfTxtfile=").append(nameOfTxtfile);
        sb.append(", numberOfLine=").append(numberOfLine);
        sb.append(", contentOfOneline=").append(contentOfOneline);
        sb.append(", resultOfImport=").append(resultOfImport);
        sb.append(", errorMessage=").append(errorMessage);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}