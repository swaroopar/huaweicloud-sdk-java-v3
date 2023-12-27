package com.huaweicloud.sdk.lts.v2.model;

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
public class UpdateSqlAlarmRuleResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_alarm_rule_name")

    private String sqlAlarmRuleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_rule_alias")

    private String alarmRuleAlias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_css_sql")

    private Boolean isCssSql;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "indexId")

    private String indexId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "projectId")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_alarm_rule_id")

    private String sqlAlarmRuleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_alarm_rule_description")

    private String sqlAlarmRuleDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_requests")

    private List<SqlRequest> sqlRequests = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frequency")

    private FrequencyRespBody frequency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition_expression")

    private String conditionExpression;

    /**
     * 告警级别
     */
    public static final class SqlAlarmLevelEnum {

        /**
         * Enum INFO for value: "Info"
         */
        public static final SqlAlarmLevelEnum INFO = new SqlAlarmLevelEnum("Info");

        /**
         * Enum MINOR for value: "Minor"
         */
        public static final SqlAlarmLevelEnum MINOR = new SqlAlarmLevelEnum("Minor");

        /**
         * Enum MAJOR for value: "Major"
         */
        public static final SqlAlarmLevelEnum MAJOR = new SqlAlarmLevelEnum("Major");

        /**
         * Enum CRITICAL for value: "CRITICAL"
         */
        public static final SqlAlarmLevelEnum CRITICAL = new SqlAlarmLevelEnum("CRITICAL");

        private static final Map<String, SqlAlarmLevelEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SqlAlarmLevelEnum> createStaticFields() {
            Map<String, SqlAlarmLevelEnum> map = new HashMap<>();
            map.put("Info", INFO);
            map.put("Minor", MINOR);
            map.put("Major", MAJOR);
            map.put("CRITICAL", CRITICAL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SqlAlarmLevelEnum(String value) {
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
        public static SqlAlarmLevelEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SqlAlarmLevelEnum(value));
        }

        public static SqlAlarmLevelEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SqlAlarmLevelEnum) {
                return this.value.equals(((SqlAlarmLevelEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_alarm_level")

    private SqlAlarmLevelEnum sqlAlarmLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_alarm_send")

    private Boolean sqlAlarmSend;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topics")

    private List<Topics> topics = null;

    /**
     * 邮件附加信息语言
     */
    public static final class LanguageEnum {

        /**
         * Enum ZH_CN for value: "zh-cn"
         */
        public static final LanguageEnum ZH_CN = new LanguageEnum("zh-cn");

        /**
         * Enum EN_US for value: "en-us"
         */
        public static final LanguageEnum EN_US = new LanguageEnum("en-us");

        private static final Map<String, LanguageEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LanguageEnum> createStaticFields() {
            Map<String, LanguageEnum> map = new HashMap<>();
            map.put("zh-cn", ZH_CN);
            map.put("en-us", EN_US);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LanguageEnum(String value) {
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
        public static LanguageEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new LanguageEnum(value));
        }

        public static LanguageEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LanguageEnum) {
                return this.value.equals(((LanguageEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private LanguageEnum language;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    /**
     * 通知频率,单位(分钟)
     */
    public static final class NotificationFrequencyEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final NotificationFrequencyEnum NUMBER_0 = new NotificationFrequencyEnum(0);

        /**
         * Enum NUMBER_5 for value: 5
         */
        public static final NotificationFrequencyEnum NUMBER_5 = new NotificationFrequencyEnum(5);

        /**
         * Enum NUMBER_10 for value: 10
         */
        public static final NotificationFrequencyEnum NUMBER_10 = new NotificationFrequencyEnum(10);

        /**
         * Enum NUMBER_15 for value: 15
         */
        public static final NotificationFrequencyEnum NUMBER_15 = new NotificationFrequencyEnum(15);

        /**
         * Enum NUMBER_30 for value: 30
         */
        public static final NotificationFrequencyEnum NUMBER_30 = new NotificationFrequencyEnum(30);

        /**
         * Enum NUMBER_60 for value: 60
         */
        public static final NotificationFrequencyEnum NUMBER_60 = new NotificationFrequencyEnum(60);

        /**
         * Enum NUMBER_180 for value: 180
         */
        public static final NotificationFrequencyEnum NUMBER_180 = new NotificationFrequencyEnum(180);

        /**
         * Enum NUMBER_360 for value: 360
         */
        public static final NotificationFrequencyEnum NUMBER_360 = new NotificationFrequencyEnum(360);

        private static final Map<Integer, NotificationFrequencyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, NotificationFrequencyEnum> createStaticFields() {
            Map<Integer, NotificationFrequencyEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(5, NUMBER_5);
            map.put(10, NUMBER_10);
            map.put(15, NUMBER_15);
            map.put(30, NUMBER_30);
            map.put(60, NUMBER_60);
            map.put(180, NUMBER_180);
            map.put(360, NUMBER_360);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        NotificationFrequencyEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static NotificationFrequencyEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new NotificationFrequencyEnum(value));
        }

        public static NotificationFrequencyEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof NotificationFrequencyEnum) {
                return this.value.equals(((NotificationFrequencyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_frequency")

    private NotificationFrequencyEnum notificationFrequency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_action_rule_name")

    private String alarmActionRuleName;

    public UpdateSqlAlarmRuleResponse withSqlAlarmRuleName(String sqlAlarmRuleName) {
        this.sqlAlarmRuleName = sqlAlarmRuleName;
        return this;
    }

    /**
     * SQL告警名称
     * @return sqlAlarmRuleName
     */
    public String getSqlAlarmRuleName() {
        return sqlAlarmRuleName;
    }

    public void setSqlAlarmRuleName(String sqlAlarmRuleName) {
        this.sqlAlarmRuleName = sqlAlarmRuleName;
    }

    public UpdateSqlAlarmRuleResponse withAlarmRuleAlias(String alarmRuleAlias) {
        this.alarmRuleAlias = alarmRuleAlias;
        return this;
    }

    /**
     * 规则名称
     * @return alarmRuleAlias
     */
    public String getAlarmRuleAlias() {
        return alarmRuleAlias;
    }

    public void setAlarmRuleAlias(String alarmRuleAlias) {
        this.alarmRuleAlias = alarmRuleAlias;
    }

    public UpdateSqlAlarmRuleResponse withIsCssSql(Boolean isCssSql) {
        this.isCssSql = isCssSql;
        return this;
    }

    /**
     * 是否管道符sql查询
     * @return isCssSql
     */
    public Boolean getIsCssSql() {
        return isCssSql;
    }

    public void setIsCssSql(Boolean isCssSql) {
        this.isCssSql = isCssSql;
    }

    public UpdateSqlAlarmRuleResponse withIndexId(String indexId) {
        this.indexId = indexId;
        return this;
    }

    /**
     * 索引id
     * @return indexId
     */
    public String getIndexId() {
        return indexId;
    }

    public void setIndexId(String indexId) {
        this.indexId = indexId;
    }

    public UpdateSqlAlarmRuleResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public UpdateSqlAlarmRuleResponse withSqlAlarmRuleId(String sqlAlarmRuleId) {
        this.sqlAlarmRuleId = sqlAlarmRuleId;
        return this;
    }

    /**
     * SQL告警规则id
     * @return sqlAlarmRuleId
     */
    public String getSqlAlarmRuleId() {
        return sqlAlarmRuleId;
    }

    public void setSqlAlarmRuleId(String sqlAlarmRuleId) {
        this.sqlAlarmRuleId = sqlAlarmRuleId;
    }

    public UpdateSqlAlarmRuleResponse withSqlAlarmRuleDescription(String sqlAlarmRuleDescription) {
        this.sqlAlarmRuleDescription = sqlAlarmRuleDescription;
        return this;
    }

    /**
     * SQL告警信息描述
     * @return sqlAlarmRuleDescription
     */
    public String getSqlAlarmRuleDescription() {
        return sqlAlarmRuleDescription;
    }

    public void setSqlAlarmRuleDescription(String sqlAlarmRuleDescription) {
        this.sqlAlarmRuleDescription = sqlAlarmRuleDescription;
    }

    public UpdateSqlAlarmRuleResponse withSqlRequests(List<SqlRequest> sqlRequests) {
        this.sqlRequests = sqlRequests;
        return this;
    }

    public UpdateSqlAlarmRuleResponse addSqlRequestsItem(SqlRequest sqlRequestsItem) {
        if (this.sqlRequests == null) {
            this.sqlRequests = new ArrayList<>();
        }
        this.sqlRequests.add(sqlRequestsItem);
        return this;
    }

    public UpdateSqlAlarmRuleResponse withSqlRequests(Consumer<List<SqlRequest>> sqlRequestsSetter) {
        if (this.sqlRequests == null) {
            this.sqlRequests = new ArrayList<>();
        }
        sqlRequestsSetter.accept(this.sqlRequests);
        return this;
    }

    /**
     * SQL详细信息
     * @return sqlRequests
     */
    public List<SqlRequest> getSqlRequests() {
        return sqlRequests;
    }

    public void setSqlRequests(List<SqlRequest> sqlRequests) {
        this.sqlRequests = sqlRequests;
    }

    public UpdateSqlAlarmRuleResponse withFrequency(FrequencyRespBody frequency) {
        this.frequency = frequency;
        return this;
    }

    public UpdateSqlAlarmRuleResponse withFrequency(Consumer<FrequencyRespBody> frequencySetter) {
        if (this.frequency == null) {
            this.frequency = new FrequencyRespBody();
            frequencySetter.accept(this.frequency);
        }

        return this;
    }

    /**
     * Get frequency
     * @return frequency
     */
    public FrequencyRespBody getFrequency() {
        return frequency;
    }

    public void setFrequency(FrequencyRespBody frequency) {
        this.frequency = frequency;
    }

    public UpdateSqlAlarmRuleResponse withConditionExpression(String conditionExpression) {
        this.conditionExpression = conditionExpression;
        return this;
    }

    /**
     * 条件表达式
     * @return conditionExpression
     */
    public String getConditionExpression() {
        return conditionExpression;
    }

    public void setConditionExpression(String conditionExpression) {
        this.conditionExpression = conditionExpression;
    }

    public UpdateSqlAlarmRuleResponse withSqlAlarmLevel(SqlAlarmLevelEnum sqlAlarmLevel) {
        this.sqlAlarmLevel = sqlAlarmLevel;
        return this;
    }

    /**
     * 告警级别
     * @return sqlAlarmLevel
     */
    public SqlAlarmLevelEnum getSqlAlarmLevel() {
        return sqlAlarmLevel;
    }

    public void setSqlAlarmLevel(SqlAlarmLevelEnum sqlAlarmLevel) {
        this.sqlAlarmLevel = sqlAlarmLevel;
    }

    public UpdateSqlAlarmRuleResponse withSqlAlarmSend(Boolean sqlAlarmSend) {
        this.sqlAlarmSend = sqlAlarmSend;
        return this;
    }

    /**
     * 是否发送
     * @return sqlAlarmSend
     */
    public Boolean getSqlAlarmSend() {
        return sqlAlarmSend;
    }

    public void setSqlAlarmSend(Boolean sqlAlarmSend) {
        this.sqlAlarmSend = sqlAlarmSend;
    }

    public UpdateSqlAlarmRuleResponse withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * domainId
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public UpdateSqlAlarmRuleResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间（毫秒时间戳）
     * minimum: 13
     * maximum: 13
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public UpdateSqlAlarmRuleResponse withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间（毫秒时间戳）
     * minimum: 13
     * maximum: 13
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public UpdateSqlAlarmRuleResponse withTopics(List<Topics> topics) {
        this.topics = topics;
        return this;
    }

    public UpdateSqlAlarmRuleResponse addTopicsItem(Topics topicsItem) {
        if (this.topics == null) {
            this.topics = new ArrayList<>();
        }
        this.topics.add(topicsItem);
        return this;
    }

    public UpdateSqlAlarmRuleResponse withTopics(Consumer<List<Topics>> topicsSetter) {
        if (this.topics == null) {
            this.topics = new ArrayList<>();
        }
        topicsSetter.accept(this.topics);
        return this;
    }

    /**
     * 主题
     * @return topics
     */
    public List<Topics> getTopics() {
        return topics;
    }

    public void setTopics(List<Topics> topics) {
        this.topics = topics;
    }

    public UpdateSqlAlarmRuleResponse withLanguage(LanguageEnum language) {
        this.language = language;
        return this;
    }

    /**
     * 邮件附加信息语言
     * @return language
     */
    public LanguageEnum getLanguage() {
        return language;
    }

    public void setLanguage(LanguageEnum language) {
        this.language = language;
    }

    public UpdateSqlAlarmRuleResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 规则ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UpdateSqlAlarmRuleResponse withNotificationFrequency(NotificationFrequencyEnum notificationFrequency) {
        this.notificationFrequency = notificationFrequency;
        return this;
    }

    /**
     * 通知频率,单位(分钟)
     * @return notificationFrequency
     */
    public NotificationFrequencyEnum getNotificationFrequency() {
        return notificationFrequency;
    }

    public void setNotificationFrequency(NotificationFrequencyEnum notificationFrequency) {
        this.notificationFrequency = notificationFrequency;
    }

    public UpdateSqlAlarmRuleResponse withAlarmActionRuleName(String alarmActionRuleName) {
        this.alarmActionRuleName = alarmActionRuleName;
        return this;
    }

    /**
     * 告警行动规则名称 >alarm_action_rule_name和notification_save_rule可以选填一个，如果都填，优先选择alarm_action_rule_name
     * @return alarmActionRuleName
     */
    public String getAlarmActionRuleName() {
        return alarmActionRuleName;
    }

    public void setAlarmActionRuleName(String alarmActionRuleName) {
        this.alarmActionRuleName = alarmActionRuleName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateSqlAlarmRuleResponse that = (UpdateSqlAlarmRuleResponse) obj;
        return Objects.equals(this.sqlAlarmRuleName, that.sqlAlarmRuleName)
            && Objects.equals(this.alarmRuleAlias, that.alarmRuleAlias) && Objects.equals(this.isCssSql, that.isCssSql)
            && Objects.equals(this.indexId, that.indexId) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.sqlAlarmRuleId, that.sqlAlarmRuleId)
            && Objects.equals(this.sqlAlarmRuleDescription, that.sqlAlarmRuleDescription)
            && Objects.equals(this.sqlRequests, that.sqlRequests) && Objects.equals(this.frequency, that.frequency)
            && Objects.equals(this.conditionExpression, that.conditionExpression)
            && Objects.equals(this.sqlAlarmLevel, that.sqlAlarmLevel)
            && Objects.equals(this.sqlAlarmSend, that.sqlAlarmSend) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.topics, that.topics) && Objects.equals(this.language, that.language)
            && Objects.equals(this.id, that.id)
            && Objects.equals(this.notificationFrequency, that.notificationFrequency)
            && Objects.equals(this.alarmActionRuleName, that.alarmActionRuleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sqlAlarmRuleName,
            alarmRuleAlias,
            isCssSql,
            indexId,
            projectId,
            sqlAlarmRuleId,
            sqlAlarmRuleDescription,
            sqlRequests,
            frequency,
            conditionExpression,
            sqlAlarmLevel,
            sqlAlarmSend,
            domainId,
            createTime,
            updateTime,
            topics,
            language,
            id,
            notificationFrequency,
            alarmActionRuleName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSqlAlarmRuleResponse {\n");
        sb.append("    sqlAlarmRuleName: ").append(toIndentedString(sqlAlarmRuleName)).append("\n");
        sb.append("    alarmRuleAlias: ").append(toIndentedString(alarmRuleAlias)).append("\n");
        sb.append("    isCssSql: ").append(toIndentedString(isCssSql)).append("\n");
        sb.append("    indexId: ").append(toIndentedString(indexId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    sqlAlarmRuleId: ").append(toIndentedString(sqlAlarmRuleId)).append("\n");
        sb.append("    sqlAlarmRuleDescription: ").append(toIndentedString(sqlAlarmRuleDescription)).append("\n");
        sb.append("    sqlRequests: ").append(toIndentedString(sqlRequests)).append("\n");
        sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
        sb.append("    conditionExpression: ").append(toIndentedString(conditionExpression)).append("\n");
        sb.append("    sqlAlarmLevel: ").append(toIndentedString(sqlAlarmLevel)).append("\n");
        sb.append("    sqlAlarmSend: ").append(toIndentedString(sqlAlarmSend)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    topics: ").append(toIndentedString(topics)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    notificationFrequency: ").append(toIndentedString(notificationFrequency)).append("\n");
        sb.append("    alarmActionRuleName: ").append(toIndentedString(alarmActionRuleName)).append("\n");
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
