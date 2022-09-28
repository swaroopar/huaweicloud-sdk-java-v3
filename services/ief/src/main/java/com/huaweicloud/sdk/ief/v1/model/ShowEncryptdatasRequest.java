package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowEncryptdatasRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encryptdata_id")

    private String encryptdataId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ief-instance-id")

    private String iefInstanceId;

    public ShowEncryptdatasRequest withEncryptdataId(String encryptdataId) {
        this.encryptdataId = encryptdataId;
        return this;
    }

    /**
     * 加密数据ID
     * @return encryptdataId
     */
    public String getEncryptdataId() {
        return encryptdataId;
    }

    public void setEncryptdataId(String encryptdataId) {
        this.encryptdataId = encryptdataId;
    }

    public ShowEncryptdatasRequest withIefInstanceId(String iefInstanceId) {
        this.iefInstanceId = iefInstanceId;
        return this;
    }

    /**
     * 铂金版实例ID，专业版实例为空值
     * @return iefInstanceId
     */
    public String getIefInstanceId() {
        return iefInstanceId;
    }

    public void setIefInstanceId(String iefInstanceId) {
        this.iefInstanceId = iefInstanceId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowEncryptdatasRequest showEncryptdatasRequest = (ShowEncryptdatasRequest) o;
        return Objects.equals(this.encryptdataId, showEncryptdatasRequest.encryptdataId)
            && Objects.equals(this.iefInstanceId, showEncryptdatasRequest.iefInstanceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(encryptdataId, iefInstanceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowEncryptdatasRequest {\n");
        sb.append("    encryptdataId: ").append(toIndentedString(encryptdataId)).append("\n");
        sb.append("    iefInstanceId: ").append(toIndentedString(iefInstanceId)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
