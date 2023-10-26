package com.huaweicloud.sdk.hss.v5.model;

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
public class ShowVulScanPolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_period")

    private String scanPeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_vul_types")

    private List<String> scanVulTypes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_range_type")

    private String scanRangeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_ids")

    private List<String> hostIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_host_num")

    private Long totalHostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public ShowVulScanPolicyResponse withScanPeriod(String scanPeriod) {
        this.scanPeriod = scanPeriod;
        return this;
    }

    /**
     * 扫描周期 - one_day : 每天 - three_day : 每三天 - one_week : 每周
     * @return scanPeriod
     */
    public String getScanPeriod() {
        return scanPeriod;
    }

    public void setScanPeriod(String scanPeriod) {
        this.scanPeriod = scanPeriod;
    }

    public ShowVulScanPolicyResponse withScanVulTypes(List<String> scanVulTypes) {
        this.scanVulTypes = scanVulTypes;
        return this;
    }

    public ShowVulScanPolicyResponse addScanVulTypesItem(String scanVulTypesItem) {
        if (this.scanVulTypes == null) {
            this.scanVulTypes = new ArrayList<>();
        }
        this.scanVulTypes.add(scanVulTypesItem);
        return this;
    }

    public ShowVulScanPolicyResponse withScanVulTypes(Consumer<List<String>> scanVulTypesSetter) {
        if (this.scanVulTypes == null) {
            this.scanVulTypes = new ArrayList<>();
        }
        scanVulTypesSetter.accept(this.scanVulTypes);
        return this;
    }

    /**
     * 扫描的漏洞类型列表
     * @return scanVulTypes
     */
    public List<String> getScanVulTypes() {
        return scanVulTypes;
    }

    public void setScanVulTypes(List<String> scanVulTypes) {
        this.scanVulTypes = scanVulTypes;
    }

    public ShowVulScanPolicyResponse withScanRangeType(String scanRangeType) {
        this.scanRangeType = scanRangeType;
        return this;
    }

    /**
     * 扫描主机的范围，包含如下：   -all_host : 扫描全部主机   -specific_host : 扫描指定主机
     * @return scanRangeType
     */
    public String getScanRangeType() {
        return scanRangeType;
    }

    public void setScanRangeType(String scanRangeType) {
        this.scanRangeType = scanRangeType;
    }

    public ShowVulScanPolicyResponse withHostIds(List<String> hostIds) {
        this.hostIds = hostIds;
        return this;
    }

    public ShowVulScanPolicyResponse addHostIdsItem(String hostIdsItem) {
        if (this.hostIds == null) {
            this.hostIds = new ArrayList<>();
        }
        this.hostIds.add(hostIdsItem);
        return this;
    }

    public ShowVulScanPolicyResponse withHostIds(Consumer<List<String>> hostIdsSetter) {
        if (this.hostIds == null) {
            this.hostIds = new ArrayList<>();
        }
        hostIdsSetter.accept(this.hostIds);
        return this;
    }

    /**
     * 主机ID列表；当scan_range_type的值为specific_host时表示扫描的主机列表
     * @return hostIds
     */
    public List<String> getHostIds() {
        return hostIds;
    }

    public void setHostIds(List<String> hostIds) {
        this.hostIds = hostIds;
    }

    public ShowVulScanPolicyResponse withTotalHostNum(Long totalHostNum) {
        this.totalHostNum = totalHostNum;
        return this;
    }

    /**
     * 可进行漏洞扫描的主机总数
     * minimum: 0
     * maximum: 20000
     * @return totalHostNum
     */
    public Long getTotalHostNum() {
        return totalHostNum;
    }

    public void setTotalHostNum(Long totalHostNum) {
        this.totalHostNum = totalHostNum;
    }

    public ShowVulScanPolicyResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 扫描策略状态，包含如下：   -open : 开启   -close : 关闭
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowVulScanPolicyResponse that = (ShowVulScanPolicyResponse) obj;
        return Objects.equals(this.scanPeriod, that.scanPeriod) && Objects.equals(this.scanVulTypes, that.scanVulTypes)
            && Objects.equals(this.scanRangeType, that.scanRangeType) && Objects.equals(this.hostIds, that.hostIds)
            && Objects.equals(this.totalHostNum, that.totalHostNum) && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scanPeriod, scanVulTypes, scanRangeType, hostIds, totalHostNum, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowVulScanPolicyResponse {\n");
        sb.append("    scanPeriod: ").append(toIndentedString(scanPeriod)).append("\n");
        sb.append("    scanVulTypes: ").append(toIndentedString(scanVulTypes)).append("\n");
        sb.append("    scanRangeType: ").append(toIndentedString(scanRangeType)).append("\n");
        sb.append("    hostIds: ").append(toIndentedString(hostIds)).append("\n");
        sb.append("    totalHostNum: ").append(toIndentedString(totalHostNum)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
