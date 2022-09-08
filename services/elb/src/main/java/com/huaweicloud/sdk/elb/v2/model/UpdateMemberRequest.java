package com.huaweicloud.sdk.elb.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateMemberRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_id")

    private String memberId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool_id")

    private String poolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateMemberRequestBody body;

    public UpdateMemberRequest withMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }

    /**
     * 后端云服务器id
     * @return memberId
     */
    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public UpdateMemberRequest withPoolId(String poolId) {
        this.poolId = poolId;
        return this;
    }

    /**
     * 后端云服务器组id
     * @return poolId
     */
    public String getPoolId() {
        return poolId;
    }

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    public UpdateMemberRequest withBody(UpdateMemberRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateMemberRequest withBody(Consumer<UpdateMemberRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateMemberRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateMemberRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateMemberRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateMemberRequest updateMemberRequest = (UpdateMemberRequest) o;
        return Objects.equals(this.memberId, updateMemberRequest.memberId)
            && Objects.equals(this.poolId, updateMemberRequest.poolId)
            && Objects.equals(this.body, updateMemberRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memberId, poolId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateMemberRequest {\n");
        sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
        sb.append("    poolId: ").append(toIndentedString(poolId)).append("\n");
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
