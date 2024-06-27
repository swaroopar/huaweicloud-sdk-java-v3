package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TemplateV2
 */
public class TemplateV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_name")

    private String creatorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_num")

    private String creatorNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_default")

    private String isDefault;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mindmap")

    private String mindmap;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "editPermission")

    private Boolean editPermission;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deletePermission")

    private Boolean deletePermission;

    public TemplateV2 withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public TemplateV2 withCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }

    /**
     * 创建人名称
     * @return creatorName
     */
    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public TemplateV2 withCreatorNum(String creatorNum) {
        this.creatorNum = creatorNum;
        return this;
    }

    /**
     * 创建人工号
     * @return creatorNum
     */
    public String getCreatorNum() {
        return creatorNum;
    }

    public void setCreatorNum(String creatorNum) {
        this.creatorNum = creatorNum;
    }

    public TemplateV2 withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TemplateV2 withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * id 主键
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TemplateV2 withIsDefault(String isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    /**
     * 是否默认
     * @return isDefault
     */
    public String getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }

    public TemplateV2 withMindmap(String mindmap) {
        this.mindmap = mindmap;
        return this;
    }

    /**
     * 脑图json
     * @return mindmap
     */
    public String getMindmap() {
        return mindmap;
    }

    public void setMindmap(String mindmap) {
        this.mindmap = mindmap;
    }

    public TemplateV2 withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TemplateV2 withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public TemplateV2 withEditPermission(Boolean editPermission) {
        this.editPermission = editPermission;
        return this;
    }

    /**
     * 编辑权限
     * @return editPermission
     */
    public Boolean getEditPermission() {
        return editPermission;
    }

    public void setEditPermission(Boolean editPermission) {
        this.editPermission = editPermission;
    }

    public TemplateV2 withDeletePermission(Boolean deletePermission) {
        this.deletePermission = deletePermission;
        return this;
    }

    /**
     * 删除权限
     * @return deletePermission
     */
    public Boolean getDeletePermission() {
        return deletePermission;
    }

    public void setDeletePermission(Boolean deletePermission) {
        this.deletePermission = deletePermission;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TemplateV2 that = (TemplateV2) obj;
        return Objects.equals(this.createTime, that.createTime) && Objects.equals(this.creatorName, that.creatorName)
            && Objects.equals(this.creatorNum, that.creatorNum) && Objects.equals(this.description, that.description)
            && Objects.equals(this.id, that.id) && Objects.equals(this.isDefault, that.isDefault)
            && Objects.equals(this.mindmap, that.mindmap) && Objects.equals(this.name, that.name)
            && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.editPermission, that.editPermission)
            && Objects.equals(this.deletePermission, that.deletePermission);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createTime,
            creatorName,
            creatorNum,
            description,
            id,
            isDefault,
            mindmap,
            name,
            updateTime,
            editPermission,
            deletePermission);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TemplateV2 {\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    creatorName: ").append(toIndentedString(creatorName)).append("\n");
        sb.append("    creatorNum: ").append(toIndentedString(creatorNum)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
        sb.append("    mindmap: ").append(toIndentedString(mindmap)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    editPermission: ").append(toIndentedString(editPermission)).append("\n");
        sb.append("    deletePermission: ").append(toIndentedString(deletePermission)).append("\n");
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
