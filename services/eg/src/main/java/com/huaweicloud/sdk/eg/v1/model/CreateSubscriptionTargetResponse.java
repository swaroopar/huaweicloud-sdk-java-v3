package com.huaweicloud.sdk.eg.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateSubscriptionTargetResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider_type")

    private String providerType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_id")

    private String connectionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detail")

    private Object detail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transform")

    private TransForm transform;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dead_letter_queue")

    private DeadLetterQueue deadLetterQueue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private String createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_time")

    private String updatedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public CreateSubscriptionTargetResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 订阅目标ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CreateSubscriptionTargetResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 订阅的事件目标名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateSubscriptionTargetResponse withProviderType(String providerType) {
        this.providerType = providerType;
        return this;
    }

    /**
     * 订阅的事件目标的提供方类型
     * @return providerType
     */
    public String getProviderType() {
        return providerType;
    }

    public void setProviderType(String providerType) {
        this.providerType = providerType;
    }

    public CreateSubscriptionTargetResponse withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }

    /**
     * 订阅的事件目标使用的目标链接ID
     * @return connectionId
     */
    public String getConnectionId() {
        return connectionId;
    }

    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    public CreateSubscriptionTargetResponse withDetail(Object detail) {
        this.detail = detail;
        return this;
    }

    /**
     * 订阅的事件目标参数列表
     * @return detail
     */
    public Object getDetail() {
        return detail;
    }

    public void setDetail(Object detail) {
        this.detail = detail;
    }

    public CreateSubscriptionTargetResponse withTransform(TransForm transform) {
        this.transform = transform;
        return this;
    }

    public CreateSubscriptionTargetResponse withTransform(Consumer<TransForm> transformSetter) {
        if (this.transform == null) {
            this.transform = new TransForm();
            transformSetter.accept(this.transform);
        }

        return this;
    }

    /**
     * Get transform
     * @return transform
     */
    public TransForm getTransform() {
        return transform;
    }

    public void setTransform(TransForm transform) {
        this.transform = transform;
    }

    public CreateSubscriptionTargetResponse withDeadLetterQueue(DeadLetterQueue deadLetterQueue) {
        this.deadLetterQueue = deadLetterQueue;
        return this;
    }

    public CreateSubscriptionTargetResponse withDeadLetterQueue(Consumer<DeadLetterQueue> deadLetterQueueSetter) {
        if (this.deadLetterQueue == null) {
            this.deadLetterQueue = new DeadLetterQueue();
            deadLetterQueueSetter.accept(this.deadLetterQueue);
        }

        return this;
    }

    /**
     * Get deadLetterQueue
     * @return deadLetterQueue
     */
    public DeadLetterQueue getDeadLetterQueue() {
        return deadLetterQueue;
    }

    public void setDeadLetterQueue(DeadLetterQueue deadLetterQueue) {
        this.deadLetterQueue = deadLetterQueue;
    }

    public CreateSubscriptionTargetResponse withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * 创建时间
     * @return createdTime
     */
    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public CreateSubscriptionTargetResponse withUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    /**
     * 更新时间
     * @return updatedTime
     */
    public String getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }

    public CreateSubscriptionTargetResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateSubscriptionTargetResponse that = (CreateSubscriptionTargetResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.providerType, that.providerType)
            && Objects.equals(this.connectionId, that.connectionId) && Objects.equals(this.detail, that.detail)
            && Objects.equals(this.transform, that.transform)
            && Objects.equals(this.deadLetterQueue, that.deadLetterQueue)
            && Objects.equals(this.createdTime, that.createdTime) && Objects.equals(this.updatedTime, that.updatedTime)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            providerType,
            connectionId,
            detail,
            transform,
            deadLetterQueue,
            createdTime,
            updatedTime,
            xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSubscriptionTargetResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    providerType: ").append(toIndentedString(providerType)).append("\n");
        sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
        sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
        sb.append("    transform: ").append(toIndentedString(transform)).append("\n");
        sb.append("    deadLetterQueue: ").append(toIndentedString(deadLetterQueue)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
