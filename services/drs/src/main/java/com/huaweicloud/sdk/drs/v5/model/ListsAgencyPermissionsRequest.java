package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ListsAgencyPermissionsRequest {

    /**
     * 请求语言类型。
     */
    public static final class XLanguageEnum {

        /**
         * Enum EN_US for value: "en-us"
         */
        public static final XLanguageEnum EN_US = new XLanguageEnum("en-us");

        /**
         * Enum ZH_CN for value: "zh-cn"
         */
        public static final XLanguageEnum ZH_CN = new XLanguageEnum("zh-cn");

        private static final Map<String, XLanguageEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, XLanguageEnum> createStaticFields() {
            Map<String, XLanguageEnum> map = new HashMap<>();
            map.put("en-us", EN_US);
            map.put("zh-cn", ZH_CN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        XLanguageEnum(String value) {
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
        public static XLanguageEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new XLanguageEnum(value));
        }

        public static XLanguageEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof XLanguageEnum) {
                return this.value.equals(((XLanguageEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")

    private XLanguageEnum xLanguage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_type")

    private String sourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_type")

    private String targetType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_non_dbs")

    private Boolean isNonDbs;

    public ListsAgencyPermissionsRequest withXLanguage(XLanguageEnum xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    /**
     * 请求语言类型。
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")
    public XLanguageEnum getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(XLanguageEnum xLanguage) {
        this.xLanguage = xLanguage;
    }

    public ListsAgencyPermissionsRequest withSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * 源库类型 - mysql - sqlserver - postgresql - hwsql - mongodb - dws - oracle - taurus - tauruslite - ddm - kafka - mrsKafka - gaussdb - gaussdbv5 - gaussdbv5ha - gaussmongodb - cassandra - dmq - gaussdbt - gaussdb300 - gaussdbtha - elasticsearch - db2 - tidb - redis - rediscluster - gaussredis - mariadb - gaussdbv1 - informix - dynamo - gausscassandra - oceanbase
     * @return sourceType
     */
    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public ListsAgencyPermissionsRequest withTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }

    /**
     * 目标库类型 - mysql - sqlserver - postgresql - hwsql - mongodb - dws - oracle - taurus - tauruslite - ddm - kafka - mrsKafka - gaussdb - gaussdbv5 - gaussdbv5ha - gaussmongodb - cassandra - dmq - gaussdbt - gaussdb300 - gaussdbtha - elasticsearch - db2 - tidb - redis - rediscluster - gaussredis - mariadb - gaussdbv1 - informix - dynamo - gausscassandra - oceanbase
     * @return targetType
     */
    public String getTargetType() {
        return targetType;
    }

    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    public ListsAgencyPermissionsRequest withIsNonDbs(Boolean isNonDbs) {
        this.isNonDbs = isNonDbs;
        return this;
    }

    /**
     * 是否自建。
     * @return isNonDbs
     */
    public Boolean getIsNonDbs() {
        return isNonDbs;
    }

    public void setIsNonDbs(Boolean isNonDbs) {
        this.isNonDbs = isNonDbs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListsAgencyPermissionsRequest that = (ListsAgencyPermissionsRequest) obj;
        return Objects.equals(this.xLanguage, that.xLanguage) && Objects.equals(this.sourceType, that.sourceType)
            && Objects.equals(this.targetType, that.targetType) && Objects.equals(this.isNonDbs, that.isNonDbs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xLanguage, sourceType, targetType, isNonDbs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListsAgencyPermissionsRequest {\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
        sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
        sb.append("    isNonDbs: ").append(toIndentedString(isNonDbs)).append("\n");
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
