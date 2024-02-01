package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListGlobalConnectionBandwidthSpecCodesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_codes")

    private List<GlobalConnectionBandwidthSpecCode> specCodes = null;

    public ListGlobalConnectionBandwidthSpecCodesResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 资源ID标识符。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ListGlobalConnectionBandwidthSpecCodesResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListGlobalConnectionBandwidthSpecCodesResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new PageInfo();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public ListGlobalConnectionBandwidthSpecCodesResponse withSpecCodes(
        List<GlobalConnectionBandwidthSpecCode> specCodes) {
        this.specCodes = specCodes;
        return this;
    }

    public ListGlobalConnectionBandwidthSpecCodesResponse addSpecCodesItem(
        GlobalConnectionBandwidthSpecCode specCodesItem) {
        if (this.specCodes == null) {
            this.specCodes = new ArrayList<>();
        }
        this.specCodes.add(specCodesItem);
        return this;
    }

    public ListGlobalConnectionBandwidthSpecCodesResponse withSpecCodes(
        Consumer<List<GlobalConnectionBandwidthSpecCode>> specCodesSetter) {
        if (this.specCodes == null) {
            this.specCodes = new ArrayList<>();
        }
        specCodesSetter.accept(this.specCodes);
        return this;
    }

    /**
     * 线路规格列表响应体。
     * @return specCodes
     */
    public List<GlobalConnectionBandwidthSpecCode> getSpecCodes() {
        return specCodes;
    }

    public void setSpecCodes(List<GlobalConnectionBandwidthSpecCode> specCodes) {
        this.specCodes = specCodes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListGlobalConnectionBandwidthSpecCodesResponse that = (ListGlobalConnectionBandwidthSpecCodesResponse) obj;
        return Objects.equals(this.requestId, that.requestId) && Objects.equals(this.pageInfo, that.pageInfo)
            && Objects.equals(this.specCodes, that.specCodes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, pageInfo, specCodes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListGlobalConnectionBandwidthSpecCodesResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
        sb.append("    specCodes: ").append(toIndentedString(specCodes)).append("\n");
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
