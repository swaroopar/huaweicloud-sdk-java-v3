package com.huaweicloud.sdk.organizations.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowHandshakeRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "handshake_id")

    private String handshakeId;

    public ShowHandshakeRequest withHandshakeId(String handshakeId) {
        this.handshakeId = handshakeId;
        return this;
    }

    /**
     * 邀请的唯一标识符（ID）。账号在发起邀请时创建ID。
     * @return handshakeId
     */
    public String getHandshakeId() {
        return handshakeId;
    }

    public void setHandshakeId(String handshakeId) {
        this.handshakeId = handshakeId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowHandshakeRequest that = (ShowHandshakeRequest) obj;
        return Objects.equals(this.handshakeId, that.handshakeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(handshakeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowHandshakeRequest {\n");
        sb.append("    handshakeId: ").append(toIndentedString(handshakeId)).append("\n");
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
