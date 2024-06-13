package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class BatchAddRelationsByOneCaseRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workitem_id")

    private String workitemId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private AddRelationsInfo body;

    public BatchAddRelationsByOneCaseRequest withWorkitemId(String workitemId) {
        this.workitemId = workitemId;
        return this;
    }

    /**
     * 需求/缺陷id
     * @return workitemId
     */
    public String getWorkitemId() {
        return workitemId;
    }

    public void setWorkitemId(String workitemId) {
        this.workitemId = workitemId;
    }

    public BatchAddRelationsByOneCaseRequest withBody(AddRelationsInfo body) {
        this.body = body;
        return this;
    }

    public BatchAddRelationsByOneCaseRequest withBody(Consumer<AddRelationsInfo> bodySetter) {
        if (this.body == null) {
            this.body = new AddRelationsInfo();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public AddRelationsInfo getBody() {
        return body;
    }

    public void setBody(AddRelationsInfo body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchAddRelationsByOneCaseRequest that = (BatchAddRelationsByOneCaseRequest) obj;
        return Objects.equals(this.workitemId, that.workitemId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workitemId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchAddRelationsByOneCaseRequest {\n");
        sb.append("    workitemId: ").append(toIndentedString(workitemId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
