package com.huaweicloud.sdk.cloudpipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowPipleineStatusRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")

    private String xLanguage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipeline_id")

    private String pipelineId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build_id")

    private String buildId;

    public ShowPipleineStatusRequest withXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    /**
     * 语言类型 中文:zh-cn 英文:en-us，默认en-us
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")
    public String getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
    }

    public ShowPipleineStatusRequest withPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }

    /**
     * 要获取状态的流水线ID
     * @return pipelineId
     */
    public String getPipelineId() {
        return pipelineId;
    }

    public void setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
    }

    public ShowPipleineStatusRequest withBuildId(String buildId) {
        this.buildId = buildId;
        return this;
    }

    /**
     * 要获取状态的执行ID
     * @return buildId
     */
    public String getBuildId() {
        return buildId;
    }

    public void setBuildId(String buildId) {
        this.buildId = buildId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowPipleineStatusRequest showPipleineStatusRequest = (ShowPipleineStatusRequest) o;
        return Objects.equals(this.xLanguage, showPipleineStatusRequest.xLanguage)
            && Objects.equals(this.pipelineId, showPipleineStatusRequest.pipelineId)
            && Objects.equals(this.buildId, showPipleineStatusRequest.buildId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xLanguage, pipelineId, buildId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPipleineStatusRequest {\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    pipelineId: ").append(toIndentedString(pipelineId)).append("\n");
        sb.append("    buildId: ").append(toIndentedString(buildId)).append("\n");
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
