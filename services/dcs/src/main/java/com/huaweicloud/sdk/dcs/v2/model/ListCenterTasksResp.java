package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 任务详情数组
 */
public class ListCenterTasksResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "details")

    private DetailsBody details;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "params")

    private String params;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_show")

    private Boolean enableShow;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    public ListCenterTasksResp withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 后台任务ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListCenterTasksResp withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 后台任务名，目前支持以下取值：  EXTEND：变更规格  BindEip：开启公网访问  UnBindEip：关闭公网访问  AddReplica：添加副本  DelReplica：删除副本  AddWhitelist：设置IP白名单  UpdatePort：修改端口  RemoveIpFromDns：域名摘除IP  masterStandbySwapJob: 主备切换任务  modify：修改密码 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListCenterTasksResp withDetails(DetailsBody details) {
        this.details = details;
        return this;
    }

    public ListCenterTasksResp withDetails(Consumer<DetailsBody> detailsSetter) {
        if (this.details == null) {
            this.details = new DetailsBody();
            detailsSetter.accept(this.details);
        }

        return this;
    }

    /**
     * Get details
     * @return details
     */
    public DetailsBody getDetails() {
        return details;
    }

    public void setDetails(DetailsBody details) {
        this.details = details;
    }

    public ListCenterTasksResp withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 用户名
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ListCenterTasksResp withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 用户ID
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ListCenterTasksResp withParams(String params) {
        this.params = params;
        return this;
    }

    /**
     * 任务相关参数
     * @return params
     */
    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public ListCenterTasksResp withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 任务状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListCenterTasksResp withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 任务启动时间，格式为2020-06-17T07:38:42.503Z
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public ListCenterTasksResp withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 任务结束时间，格式为2020-06-17T07:38:42.503Z
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ListCenterTasksResp withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 错误代码
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public ListCenterTasksResp withEnableShow(Boolean enableShow) {
        this.enableShow = enableShow;
        return this;
    }

    /**
     * 是否有详细任务进展，可以展开查看
     * @return enableShow
     */
    public Boolean getEnableShow() {
        return enableShow;
    }

    public void setEnableShow(Boolean enableShow) {
        this.enableShow = enableShow;
    }

    public ListCenterTasksResp withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 任务ID
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCenterTasksResp that = (ListCenterTasksResp) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.details, that.details) && Objects.equals(this.userName, that.userName)
            && Objects.equals(this.userId, that.userId) && Objects.equals(this.params, that.params)
            && Objects.equals(this.status, that.status) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.updatedAt, that.updatedAt) && Objects.equals(this.errorCode, that.errorCode)
            && Objects.equals(this.enableShow, that.enableShow) && Objects.equals(this.jobId, that.jobId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            details,
            userName,
            userId,
            params,
            status,
            createdAt,
            updatedAt,
            errorCode,
            enableShow,
            jobId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCenterTasksResp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    details: ").append(toIndentedString(details)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    params: ").append(toIndentedString(params)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    enableShow: ").append(toIndentedString(enableShow)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
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
