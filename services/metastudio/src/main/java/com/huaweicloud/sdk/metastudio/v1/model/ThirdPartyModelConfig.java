package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 第三方语言模型配置
 */
public class ThirdPartyModelConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_key")

    private String appKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "llm_url")

    private String llmUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_stream")

    private Boolean isStream;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chat_rounds")

    private Integer chatRounds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sis_region")

    private Integer sisRegion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sis_project_id")

    private String sisProjectId;

    public ThirdPartyModelConfig withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * 第三方语言模型应用ID。
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public ThirdPartyModelConfig withAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }

    /**
     * 第三方语言模型应用密钥。
     * @return appKey
     */
    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public ThirdPartyModelConfig withLlmUrl(String llmUrl) {
        this.llmUrl = llmUrl;
        return this;
    }

    /**
     * 第三方语言模型地址。
     * @return llmUrl
     */
    public String getLlmUrl() {
        return llmUrl;
    }

    public void setLlmUrl(String llmUrl) {
        this.llmUrl = llmUrl;
    }

    public ThirdPartyModelConfig withIsStream(Boolean isStream) {
        this.isStream = isStream;
        return this;
    }

    /**
     * 是否采用流式响应。
     * @return isStream
     */
    public Boolean getIsStream() {
        return isStream;
    }

    public void setIsStream(Boolean isStream) {
        this.isStream = isStream;
    }

    public ThirdPartyModelConfig withChatRounds(Integer chatRounds) {
        this.chatRounds = chatRounds;
        return this;
    }

    /**
     * 支持的多轮对话数量，取值大于1时，请求第三方语言模型时将携带历史对话信息。
     * minimum: 1
     * maximum: 10
     * @return chatRounds
     */
    public Integer getChatRounds() {
        return chatRounds;
    }

    public void setChatRounds(Integer chatRounds) {
        this.chatRounds = chatRounds;
    }

    public ThirdPartyModelConfig withSisRegion(Integer sisRegion) {
        this.sisRegion = sisRegion;
        return this;
    }

    /**
     * SIS所在区域
     * minimum: 0
     * maximum: 32
     * @return sisRegion
     */
    public Integer getSisRegion() {
        return sisRegion;
    }

    public void setSisRegion(Integer sisRegion) {
        this.sisRegion = sisRegion;
    }

    public ThirdPartyModelConfig withSisProjectId(String sisProjectId) {
        this.sisProjectId = sisProjectId;
        return this;
    }

    /**
     * SIS所在区域的projectId
     * @return sisProjectId
     */
    public String getSisProjectId() {
        return sisProjectId;
    }

    public void setSisProjectId(String sisProjectId) {
        this.sisProjectId = sisProjectId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ThirdPartyModelConfig that = (ThirdPartyModelConfig) obj;
        return Objects.equals(this.appId, that.appId) && Objects.equals(this.appKey, that.appKey)
            && Objects.equals(this.llmUrl, that.llmUrl) && Objects.equals(this.isStream, that.isStream)
            && Objects.equals(this.chatRounds, that.chatRounds) && Objects.equals(this.sisRegion, that.sisRegion)
            && Objects.equals(this.sisProjectId, that.sisProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appId, appKey, llmUrl, isStream, chatRounds, sisRegion, sisProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ThirdPartyModelConfig {\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    appKey: ").append(toIndentedString(appKey)).append("\n");
        sb.append("    llmUrl: ").append(toIndentedString(llmUrl)).append("\n");
        sb.append("    isStream: ").append(toIndentedString(isStream)).append("\n");
        sb.append("    chatRounds: ").append(toIndentedString(chatRounds)).append("\n");
        sb.append("    sisRegion: ").append(toIndentedString(sisRegion)).append("\n");
        sb.append("    sisProjectId: ").append(toIndentedString(sisProjectId)).append("\n");
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
