package com.huaweicloud.sdk.aad.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class BatchDeleteInstanceIpRuleResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_num")

    private Integer successNum;

    public BatchDeleteInstanceIpRuleResponse withSuccessNum(Integer successNum) {
        this.successNum = successNum;
        return this;
    }

    /**
     * 数量
     * @return successNum
     */
    public Integer getSuccessNum() {
        return successNum;
    }

    public void setSuccessNum(Integer successNum) {
        this.successNum = successNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchDeleteInstanceIpRuleResponse that = (BatchDeleteInstanceIpRuleResponse) obj;
        return Objects.equals(this.successNum, that.successNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(successNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteInstanceIpRuleResponse {\n");
        sb.append("    successNum: ").append(toIndentedString(successNum)).append("\n");
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
