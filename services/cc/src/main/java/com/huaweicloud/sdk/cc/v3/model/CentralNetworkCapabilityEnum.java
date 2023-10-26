package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 能力类型定义： - central-network.is-support: 支持中心网络 - central-network.is-support-enterprise-project: 支持中心网络的企业项目 - central-network.is-support-tag: 支持中心网络的标签能力 - connection-bandwidth.size-range: 跨地域连接带宽大小的范围 - connection-bandwidth.charge-mode: 跨地域连接带宽计费类型 - er-instance.support-regions: 支持ER实例的Region列表 - er-instance.support-ipv6-regions: 支持IPV6的ER实例Region列表 - er-instance.support-dscp-regions:支持带宽包金银铜配置的region列表 - er-instance.support-sites: 支持ER实例的站点列表 - gdgw-attachment.is-support: 支持GDGW附件 - gdgw-attachment.support-regions: 支持GDGW附件的Region列表 - gdgw-attachment.support-sites: 支持GDGW附件的站点列表 - er-route-table-attachment.is-support: 支持路由表附件 - er-route-table-attachment.support-regions: 支持路由表附件的Region列表 - er-route-table-attachment.support-sites: 支持路由表附件的站点列表 - cloud-alliance.support-regions: 支持云联盟场景的Region列表
 */
public class CentralNetworkCapabilityEnum {

    /**
     * Enum CENTRAL_NETWORK_IS_SUPPORT for value: "central-network.is-support"
     */
    public static final CentralNetworkCapabilityEnum CENTRAL_NETWORK_IS_SUPPORT =
        new CentralNetworkCapabilityEnum("central-network.is-support");

    /**
     * Enum CENTRAL_NETWORK_IS_SUPPORT_ENTERPRISE_PROJECT for value: "central-network.is-support-enterprise-project"
     */
    public static final CentralNetworkCapabilityEnum CENTRAL_NETWORK_IS_SUPPORT_ENTERPRISE_PROJECT =
        new CentralNetworkCapabilityEnum("central-network.is-support-enterprise-project");

    /**
     * Enum CENTRAL_NETWORK_IS_SUPPORT_TAG for value: "central-network.is-support-tag"
     */
    public static final CentralNetworkCapabilityEnum CENTRAL_NETWORK_IS_SUPPORT_TAG =
        new CentralNetworkCapabilityEnum("central-network.is-support-tag");

    /**
     * Enum CONNECTION_BANDWIDTH_SIZE_RANGE for value: "connection-bandwidth.size-range"
     */
    public static final CentralNetworkCapabilityEnum CONNECTION_BANDWIDTH_SIZE_RANGE =
        new CentralNetworkCapabilityEnum("connection-bandwidth.size-range");

    /**
     * Enum CONNECTION_BANDWIDTH_CHARGE_MODE for value: "connection-bandwidth.charge-mode"
     */
    public static final CentralNetworkCapabilityEnum CONNECTION_BANDWIDTH_CHARGE_MODE =
        new CentralNetworkCapabilityEnum("connection-bandwidth.charge-mode");

    /**
     * Enum ER_INSTANCE_SUPPORT_REGIONS for value: "er-instance.support-regions"
     */
    public static final CentralNetworkCapabilityEnum ER_INSTANCE_SUPPORT_REGIONS =
        new CentralNetworkCapabilityEnum("er-instance.support-regions");

    /**
     * Enum ER_INSTANCE_SUPPORT_IPV6_REGIONS for value: "er-instance.support-ipv6-regions"
     */
    public static final CentralNetworkCapabilityEnum ER_INSTANCE_SUPPORT_IPV6_REGIONS =
        new CentralNetworkCapabilityEnum("er-instance.support-ipv6-regions");

    /**
     * Enum ER_INSTANCE_SUPPORT_DSCP_REGIONS for value: "er-instance.support-dscp-regions"
     */
    public static final CentralNetworkCapabilityEnum ER_INSTANCE_SUPPORT_DSCP_REGIONS =
        new CentralNetworkCapabilityEnum("er-instance.support-dscp-regions");

    /**
     * Enum ER_INSTANCE_SUPPORT_SITES for value: "er-instance.support-sites"
     */
    public static final CentralNetworkCapabilityEnum ER_INSTANCE_SUPPORT_SITES =
        new CentralNetworkCapabilityEnum("er-instance.support-sites");

    /**
     * Enum GDGW_ATTACHMENT_IS_SUPPORT for value: "gdgw-attachment.is-support"
     */
    public static final CentralNetworkCapabilityEnum GDGW_ATTACHMENT_IS_SUPPORT =
        new CentralNetworkCapabilityEnum("gdgw-attachment.is-support");

    /**
     * Enum GDGW_ATTACHMENT_SUPPORT_REGIONS for value: "gdgw-attachment.support-regions"
     */
    public static final CentralNetworkCapabilityEnum GDGW_ATTACHMENT_SUPPORT_REGIONS =
        new CentralNetworkCapabilityEnum("gdgw-attachment.support-regions");

    /**
     * Enum GDGW_ATTACHMENT_SUPPORT_SITES for value: "gdgw-attachment.support-sites"
     */
    public static final CentralNetworkCapabilityEnum GDGW_ATTACHMENT_SUPPORT_SITES =
        new CentralNetworkCapabilityEnum("gdgw-attachment.support-sites");

    /**
     * Enum ER_ROUTE_TABLE_ATTACHMENT_IS_SUPPORT for value: "er-route-table-attachment.is-support"
     */
    public static final CentralNetworkCapabilityEnum ER_ROUTE_TABLE_ATTACHMENT_IS_SUPPORT =
        new CentralNetworkCapabilityEnum("er-route-table-attachment.is-support");

    /**
     * Enum ER_ROUTE_TABLE_ATTACHMENT_SUPPORT_REGIONS for value: "er-route-table-attachment.support-regions"
     */
    public static final CentralNetworkCapabilityEnum ER_ROUTE_TABLE_ATTACHMENT_SUPPORT_REGIONS =
        new CentralNetworkCapabilityEnum("er-route-table-attachment.support-regions");

    /**
     * Enum ER_ROUTE_TABLE_ATTACHMENT_SUPPORT_SITES for value: "er-route-table-attachment.support-sites"
     */
    public static final CentralNetworkCapabilityEnum ER_ROUTE_TABLE_ATTACHMENT_SUPPORT_SITES =
        new CentralNetworkCapabilityEnum("er-route-table-attachment.support-sites");

    /**
     * Enum CLOUD_ALLIANCE_SUPPORT_REGIONS for value: "cloud-alliance.support-regions"
     */
    public static final CentralNetworkCapabilityEnum CLOUD_ALLIANCE_SUPPORT_REGIONS =
        new CentralNetworkCapabilityEnum("cloud-alliance.support-regions");

    private static final Map<String, CentralNetworkCapabilityEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, CentralNetworkCapabilityEnum> createStaticFields() {
        Map<String, CentralNetworkCapabilityEnum> map = new HashMap<>();
        map.put("central-network.is-support", CENTRAL_NETWORK_IS_SUPPORT);
        map.put("central-network.is-support-enterprise-project", CENTRAL_NETWORK_IS_SUPPORT_ENTERPRISE_PROJECT);
        map.put("central-network.is-support-tag", CENTRAL_NETWORK_IS_SUPPORT_TAG);
        map.put("connection-bandwidth.size-range", CONNECTION_BANDWIDTH_SIZE_RANGE);
        map.put("connection-bandwidth.charge-mode", CONNECTION_BANDWIDTH_CHARGE_MODE);
        map.put("er-instance.support-regions", ER_INSTANCE_SUPPORT_REGIONS);
        map.put("er-instance.support-ipv6-regions", ER_INSTANCE_SUPPORT_IPV6_REGIONS);
        map.put("er-instance.support-dscp-regions", ER_INSTANCE_SUPPORT_DSCP_REGIONS);
        map.put("er-instance.support-sites", ER_INSTANCE_SUPPORT_SITES);
        map.put("gdgw-attachment.is-support", GDGW_ATTACHMENT_IS_SUPPORT);
        map.put("gdgw-attachment.support-regions", GDGW_ATTACHMENT_SUPPORT_REGIONS);
        map.put("gdgw-attachment.support-sites", GDGW_ATTACHMENT_SUPPORT_SITES);
        map.put("er-route-table-attachment.is-support", ER_ROUTE_TABLE_ATTACHMENT_IS_SUPPORT);
        map.put("er-route-table-attachment.support-regions", ER_ROUTE_TABLE_ATTACHMENT_SUPPORT_REGIONS);
        map.put("er-route-table-attachment.support-sites", ER_ROUTE_TABLE_ATTACHMENT_SUPPORT_SITES);
        map.put("cloud-alliance.support-regions", CLOUD_ALLIANCE_SUPPORT_REGIONS);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    CentralNetworkCapabilityEnum(String value) {
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
    public static CentralNetworkCapabilityEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CentralNetworkCapabilityEnum(value));
    }

    public static CentralNetworkCapabilityEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof CentralNetworkCapabilityEnum) {
            return this.value.equals(((CentralNetworkCapabilityEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
