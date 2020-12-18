package com.xtk.apistation.webapi.pojo;

import lombok.Setter;
import lombok.Getter;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author yuhen
 */

@Setter
@Getter
public class RequestBean {

    @JsonProperty("SerialNumber")
    private Integer SerialNumber;

    @JsonProperty("SpecifiedNumber")
    private Integer SpecifiedNumber;

    @JsonProperty("MaxCount")
    private Integer MaxCount;

/*    @JsonProperty("SerialNumber")
    @Getter @Setter private Integer SerialNumber;

    @JsonProperty("SpecifiedNumber")
    @Getter @Setter private Integer SpecifiedNumber;

    @JsonProperty("MaxCount")
    @Getter @Setter private Integer MaxCount;*/

/*    @JsonProperty("SerialNumber")
    private Integer serialNumber;
    @JsonProperty("SpecifiedNumber")
    private Integer specifiedNumber;
    @JsonProperty("MaxCount")
    private Integer maxCount;

    public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setSpecifiedNumber(Integer specifiedNumber) {
        this.specifiedNumber = specifiedNumber;
    }

    public void setMaxCount(Integer maxCount) {
        this.maxCount = maxCount;
    }


    @JsonIgnore
    public Integer getSerialNumber() {
        return serialNumber;
    }
    @JsonIgnore
    public Integer getSpecifiedNumber() {
        return specifiedNumber;
    }
    @JsonIgnore
    public Integer getMaxCount() {
        return maxCount;
    }*/
}
