package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListWorkspacesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ad_domains")

    private AdInfo adDomains;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_name")

    private String vpcName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_mode")

    private String accessMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dedicated_subnets")

    private String dedicatedSubnets;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dedicated_access_address")

    private String dedicatedAccessAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "internet_access_address")

    private String internetAccessAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "internet_access_port")

    private String internetAccessPort;

    /**
     * 云办公服务的状态。 - PREPARING：准备开通。 - SUBSCRIBING：开通中。 - SUBSCRIBED：已开通。 - SUBSCRIPTION_FAILED：开通失败。 - DEREGISTERING：销户中。 - DEREGISTRATION_FAILED：销户失败。 - CLOSED：已销户未开通。
     */
    public static final class StatusEnum {

        /**
         * Enum PREPARING for value: "PREPARING"
         */
        public static final StatusEnum PREPARING = new StatusEnum("PREPARING");

        /**
         * Enum SUBSCRIBING for value: "SUBSCRIBING"
         */
        public static final StatusEnum SUBSCRIBING = new StatusEnum("SUBSCRIBING");

        /**
         * Enum SUBSCRIBED for value: "SUBSCRIBED"
         */
        public static final StatusEnum SUBSCRIBED = new StatusEnum("SUBSCRIBED");

        /**
         * Enum SUBSCRIPTION_FAILED for value: "SUBSCRIPTION_FAILED"
         */
        public static final StatusEnum SUBSCRIPTION_FAILED = new StatusEnum("SUBSCRIPTION_FAILED");

        /**
         * Enum DEREGISTERING for value: "DEREGISTERING"
         */
        public static final StatusEnum DEREGISTERING = new StatusEnum("DEREGISTERING");

        /**
         * Enum DEREGISTRATION_FAILED for value: "DEREGISTRATION_FAILED"
         */
        public static final StatusEnum DEREGISTRATION_FAILED = new StatusEnum("DEREGISTRATION_FAILED");

        /**
         * Enum CLOSED for value: "CLOSED"
         */
        public static final StatusEnum CLOSED = new StatusEnum("CLOSED");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("PREPARING", PREPARING);
            map.put("SUBSCRIBING", SUBSCRIBING);
            map.put("SUBSCRIBED", SUBSCRIBED);
            map.put("SUBSCRIPTION_FAILED", SUBSCRIPTION_FAILED);
            map.put("DEREGISTERING", DEREGISTERING);
            map.put("DEREGISTRATION_FAILED", DEREGISTRATION_FAILED);
            map.put("CLOSED", CLOSED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_status")

    private String accessStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_ids")

    private List<SubnetInfo> subnetIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "management_subnet_cidr")

    private String managementSubnetCidr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "infrastructure_security_group")

    private SecurityGroup infrastructureSecurityGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_security_group")

    private SecurityGroup desktopSecurityGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "closable")

    private Boolean closable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_status")

    private String configStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progress")

    private String progress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_code")

    private Integer failCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_reason")

    private String failReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_id")

    private String enterpriseId;

    public ListWorkspacesResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 唯一标识ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListWorkspacesResponse withAdDomains(AdInfo adDomains) {
        this.adDomains = adDomains;
        return this;
    }

    public ListWorkspacesResponse withAdDomains(Consumer<AdInfo> adDomainsSetter) {
        if (this.adDomains == null) {
            this.adDomains = new AdInfo();
            adDomainsSetter.accept(this.adDomains);
        }

        return this;
    }

    /**
     * Get adDomains
     * @return adDomains
     */
    public AdInfo getAdDomains() {
        return adDomains;
    }

    public void setAdDomains(AdInfo adDomains) {
        this.adDomains = adDomains;
    }

    public ListWorkspacesResponse withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * VPC ID。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public ListWorkspacesResponse withVpcName(String vpcName) {
        this.vpcName = vpcName;
        return this;
    }

    /**
     * VPC名称。
     * @return vpcName
     */
    public String getVpcName() {
        return vpcName;
    }

    public void setVpcName(String vpcName) {
        this.vpcName = vpcName;
    }

    public ListWorkspacesResponse withAccessMode(String accessMode) {
        this.accessMode = accessMode;
        return this;
    }

    /**
     * 接入方式。 - INTERNET：表示互联网接入。 - DEDICATED：表示专线接入。 - BOTH：表示同时支持互联网接入和专线接入。
     * @return accessMode
     */
    public String getAccessMode() {
        return accessMode;
    }

    public void setAccessMode(String accessMode) {
        this.accessMode = accessMode;
    }

    public ListWorkspacesResponse withDedicatedSubnets(String dedicatedSubnets) {
        this.dedicatedSubnets = dedicatedSubnets;
        return this;
    }

    /**
     * 专线接入网段，只有access_mode为“DEDICATED”或“BOTH”时才会返回该参数。
     * @return dedicatedSubnets
     */
    public String getDedicatedSubnets() {
        return dedicatedSubnets;
    }

    public void setDedicatedSubnets(String dedicatedSubnets) {
        this.dedicatedSubnets = dedicatedSubnets;
    }

    public ListWorkspacesResponse withDedicatedAccessAddress(String dedicatedAccessAddress) {
        this.dedicatedAccessAddress = dedicatedAccessAddress;
        return this;
    }

    /**
     * 专线接入地址，只有access_mode为“DEDICATED”或“BOTH”时才会返回该参数。
     * @return dedicatedAccessAddress
     */
    public String getDedicatedAccessAddress() {
        return dedicatedAccessAddress;
    }

    public void setDedicatedAccessAddress(String dedicatedAccessAddress) {
        this.dedicatedAccessAddress = dedicatedAccessAddress;
    }

    public ListWorkspacesResponse withInternetAccessAddress(String internetAccessAddress) {
        this.internetAccessAddress = internetAccessAddress;
        return this;
    }

    /**
     * 互联网接入地址，只有access_mode为“INTERNET”或“BOTH”时才会返回该参数。
     * @return internetAccessAddress
     */
    public String getInternetAccessAddress() {
        return internetAccessAddress;
    }

    public void setInternetAccessAddress(String internetAccessAddress) {
        this.internetAccessAddress = internetAccessAddress;
    }

    public ListWorkspacesResponse withInternetAccessPort(String internetAccessPort) {
        this.internetAccessPort = internetAccessPort;
        return this;
    }

    /**
     * 互联网接入端口。
     * @return internetAccessPort
     */
    public String getInternetAccessPort() {
        return internetAccessPort;
    }

    public void setInternetAccessPort(String internetAccessPort) {
        this.internetAccessPort = internetAccessPort;
    }

    public ListWorkspacesResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 云办公服务的状态。 - PREPARING：准备开通。 - SUBSCRIBING：开通中。 - SUBSCRIBED：已开通。 - SUBSCRIPTION_FAILED：开通失败。 - DEREGISTERING：销户中。 - DEREGISTRATION_FAILED：销户失败。 - CLOSED：已销户未开通。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ListWorkspacesResponse withAccessStatus(String accessStatus) {
        this.accessStatus = accessStatus;
        return this;
    }

    /**
     * 互联网和专线切换任务的状态。 - init： 初始化 - 开通服务后的初始状态。 - available： 可用 - 执行过任务且成功后恢复的正常状态。 - internetOpening： 开启中 - 开通互联网接入开启中。 - dedicatedOpening： 开启中 - 开通专线接入开启中。 - internetOpenFailed： 开启失败 - 开通互联网接入开启失败。 - dedicatedOpenFailed： 开启失败 - 开通专线接入开启失败。 - openSuccess： 开启成功 - 开通互联网接入成功。 - internetClosing： 关闭中 - 关闭互联网接入关闭中。 - dedicatedClosing： 关闭中 - 关闭专线接入关闭中。 - internetCloseFailed： 关闭失败 - 关闭互联网接入方式失败。 - dedicatedCloseFailed： 关闭失败 - 关闭专线接入方式失败。 - closeSuccess： 关闭成功 - 关闭接入方式成功。 - internetAccessPortModifying： 互联网接入端口修改中。 - internetAccessPortModifyFailed： 端口修改失败。
     * @return accessStatus
     */
    public String getAccessStatus() {
        return accessStatus;
    }

    public void setAccessStatus(String accessStatus) {
        this.accessStatus = accessStatus;
    }

    public ListWorkspacesResponse withSubnetIds(List<SubnetInfo> subnetIds) {
        this.subnetIds = subnetIds;
        return this;
    }

    public ListWorkspacesResponse addSubnetIdsItem(SubnetInfo subnetIdsItem) {
        if (this.subnetIds == null) {
            this.subnetIds = new ArrayList<>();
        }
        this.subnetIds.add(subnetIdsItem);
        return this;
    }

    public ListWorkspacesResponse withSubnetIds(Consumer<List<SubnetInfo>> subnetIdsSetter) {
        if (this.subnetIds == null) {
            this.subnetIds = new ArrayList<>();
        }
        subnetIdsSetter.accept(this.subnetIds);
        return this;
    }

    /**
     * 业务子网，可以指定返回的网络ID订购桌面。
     * @return subnetIds
     */
    public List<SubnetInfo> getSubnetIds() {
        return subnetIds;
    }

    public void setSubnetIds(List<SubnetInfo> subnetIds) {
        this.subnetIds = subnetIds;
    }

    public ListWorkspacesResponse withManagementSubnetCidr(String managementSubnetCidr) {
        this.managementSubnetCidr = managementSubnetCidr;
        return this;
    }

    /**
     * 管理组件的子网网段。
     * @return managementSubnetCidr
     */
    public String getManagementSubnetCidr() {
        return managementSubnetCidr;
    }

    public void setManagementSubnetCidr(String managementSubnetCidr) {
        this.managementSubnetCidr = managementSubnetCidr;
    }

    public ListWorkspacesResponse withInfrastructureSecurityGroup(SecurityGroup infrastructureSecurityGroup) {
        this.infrastructureSecurityGroup = infrastructureSecurityGroup;
        return this;
    }

    public ListWorkspacesResponse withInfrastructureSecurityGroup(
        Consumer<SecurityGroup> infrastructureSecurityGroupSetter) {
        if (this.infrastructureSecurityGroup == null) {
            this.infrastructureSecurityGroup = new SecurityGroup();
            infrastructureSecurityGroupSetter.accept(this.infrastructureSecurityGroup);
        }

        return this;
    }

    /**
     * Get infrastructureSecurityGroup
     * @return infrastructureSecurityGroup
     */
    public SecurityGroup getInfrastructureSecurityGroup() {
        return infrastructureSecurityGroup;
    }

    public void setInfrastructureSecurityGroup(SecurityGroup infrastructureSecurityGroup) {
        this.infrastructureSecurityGroup = infrastructureSecurityGroup;
    }

    public ListWorkspacesResponse withDesktopSecurityGroup(SecurityGroup desktopSecurityGroup) {
        this.desktopSecurityGroup = desktopSecurityGroup;
        return this;
    }

    public ListWorkspacesResponse withDesktopSecurityGroup(Consumer<SecurityGroup> desktopSecurityGroupSetter) {
        if (this.desktopSecurityGroup == null) {
            this.desktopSecurityGroup = new SecurityGroup();
            desktopSecurityGroupSetter.accept(this.desktopSecurityGroup);
        }

        return this;
    }

    /**
     * Get desktopSecurityGroup
     * @return desktopSecurityGroup
     */
    public SecurityGroup getDesktopSecurityGroup() {
        return desktopSecurityGroup;
    }

    public void setDesktopSecurityGroup(SecurityGroup desktopSecurityGroup) {
        this.desktopSecurityGroup = desktopSecurityGroup;
    }

    public ListWorkspacesResponse withClosable(Boolean closable) {
        this.closable = closable;
        return this;
    }

    /**
     * 是否可以取消服务。
     * @return closable
     */
    public Boolean getClosable() {
        return closable;
    }

    public void setClosable(Boolean closable) {
        this.closable = closable;
    }

    public ListWorkspacesResponse withConfigStatus(String configStatus) {
        this.configStatus = configStatus;
        return this;
    }

    /**
     * 配置状态。 - \"0\"： 开通服务成功，且对接AD成功。 - \"1\"： 开通服务成功，但AD配置失败。 - \"2\"： 开通服务成功，但AD配置失败后存在其他错误。 - \"3\"： 开通服务成功，AD未开启对接。
     * @return configStatus
     */
    public String getConfigStatus() {
        return configStatus;
    }

    public void setConfigStatus(String configStatus) {
        this.configStatus = configStatus;
    }

    public ListWorkspacesResponse withProgress(String progress) {
        this.progress = progress;
        return this;
    }

    /**
     * 开通服务或注销服务的进度，格式为百分比，如：100%。
     * @return progress
     */
    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    public ListWorkspacesResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 开通服务或取消服务的任务ID。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public ListWorkspacesResponse withFailCode(Integer failCode) {
        this.failCode = failCode;
        return this;
    }

    /**
     * 失败错误码。
     * minimum: 0
     * maximum: 99999999
     * @return failCode
     */
    public Integer getFailCode() {
        return failCode;
    }

    public void setFailCode(Integer failCode) {
        this.failCode = failCode;
    }

    public ListWorkspacesResponse withFailReason(String failReason) {
        this.failReason = failReason;
        return this;
    }

    /**
     * 失败原因。
     * @return failReason
     */
    public String getFailReason() {
        return failReason;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason;
    }

    public ListWorkspacesResponse withEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }

    /**
     * 企业ID。
     * @return enterpriseId
     */
    public String getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListWorkspacesResponse listWorkspacesResponse = (ListWorkspacesResponse) o;
        return Objects.equals(this.id, listWorkspacesResponse.id)
            && Objects.equals(this.adDomains, listWorkspacesResponse.adDomains)
            && Objects.equals(this.vpcId, listWorkspacesResponse.vpcId)
            && Objects.equals(this.vpcName, listWorkspacesResponse.vpcName)
            && Objects.equals(this.accessMode, listWorkspacesResponse.accessMode)
            && Objects.equals(this.dedicatedSubnets, listWorkspacesResponse.dedicatedSubnets)
            && Objects.equals(this.dedicatedAccessAddress, listWorkspacesResponse.dedicatedAccessAddress)
            && Objects.equals(this.internetAccessAddress, listWorkspacesResponse.internetAccessAddress)
            && Objects.equals(this.internetAccessPort, listWorkspacesResponse.internetAccessPort)
            && Objects.equals(this.status, listWorkspacesResponse.status)
            && Objects.equals(this.accessStatus, listWorkspacesResponse.accessStatus)
            && Objects.equals(this.subnetIds, listWorkspacesResponse.subnetIds)
            && Objects.equals(this.managementSubnetCidr, listWorkspacesResponse.managementSubnetCidr)
            && Objects.equals(this.infrastructureSecurityGroup, listWorkspacesResponse.infrastructureSecurityGroup)
            && Objects.equals(this.desktopSecurityGroup, listWorkspacesResponse.desktopSecurityGroup)
            && Objects.equals(this.closable, listWorkspacesResponse.closable)
            && Objects.equals(this.configStatus, listWorkspacesResponse.configStatus)
            && Objects.equals(this.progress, listWorkspacesResponse.progress)
            && Objects.equals(this.jobId, listWorkspacesResponse.jobId)
            && Objects.equals(this.failCode, listWorkspacesResponse.failCode)
            && Objects.equals(this.failReason, listWorkspacesResponse.failReason)
            && Objects.equals(this.enterpriseId, listWorkspacesResponse.enterpriseId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            adDomains,
            vpcId,
            vpcName,
            accessMode,
            dedicatedSubnets,
            dedicatedAccessAddress,
            internetAccessAddress,
            internetAccessPort,
            status,
            accessStatus,
            subnetIds,
            managementSubnetCidr,
            infrastructureSecurityGroup,
            desktopSecurityGroup,
            closable,
            configStatus,
            progress,
            jobId,
            failCode,
            failReason,
            enterpriseId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListWorkspacesResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    adDomains: ").append(toIndentedString(adDomains)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    vpcName: ").append(toIndentedString(vpcName)).append("\n");
        sb.append("    accessMode: ").append(toIndentedString(accessMode)).append("\n");
        sb.append("    dedicatedSubnets: ").append(toIndentedString(dedicatedSubnets)).append("\n");
        sb.append("    dedicatedAccessAddress: ").append(toIndentedString(dedicatedAccessAddress)).append("\n");
        sb.append("    internetAccessAddress: ").append(toIndentedString(internetAccessAddress)).append("\n");
        sb.append("    internetAccessPort: ").append(toIndentedString(internetAccessPort)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    accessStatus: ").append(toIndentedString(accessStatus)).append("\n");
        sb.append("    subnetIds: ").append(toIndentedString(subnetIds)).append("\n");
        sb.append("    managementSubnetCidr: ").append(toIndentedString(managementSubnetCidr)).append("\n");
        sb.append("    infrastructureSecurityGroup: ")
            .append(toIndentedString(infrastructureSecurityGroup))
            .append("\n");
        sb.append("    desktopSecurityGroup: ").append(toIndentedString(desktopSecurityGroup)).append("\n");
        sb.append("    closable: ").append(toIndentedString(closable)).append("\n");
        sb.append("    configStatus: ").append(toIndentedString(configStatus)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    failCode: ").append(toIndentedString(failCode)).append("\n");
        sb.append("    failReason: ").append(toIndentedString(failReason)).append("\n");
        sb.append("    enterpriseId: ").append(toIndentedString(enterpriseId)).append("\n");
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
