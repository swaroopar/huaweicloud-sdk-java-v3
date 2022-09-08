package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 创建IEF消息通道请求body体。
 */
public class CreateIefMessageChannelReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    public CreateIefMessageChannelReq withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * 创建IEF消息通道指定的边缘节点ID，uuid格式
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateIefMessageChannelReq createIefMessageChannelReq = (CreateIefMessageChannelReq) o;
        return Objects.equals(this.nodeId, createIefMessageChannelReq.nodeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateIefMessageChannelReq {\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
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
