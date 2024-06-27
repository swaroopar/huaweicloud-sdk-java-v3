package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 标签值。
 */
public class CreateChInstanceRequestBodyTagsInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sys_tags")

    private List<CreateChInstanceRequestBodyTagsInfoSysTags> sysTags = null;

    public CreateChInstanceRequestBodyTagsInfo withSysTags(List<CreateChInstanceRequestBodyTagsInfoSysTags> sysTags) {
        this.sysTags = sysTags;
        return this;
    }

    public CreateChInstanceRequestBodyTagsInfo addSysTagsItem(CreateChInstanceRequestBodyTagsInfoSysTags sysTagsItem) {
        if (this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        this.sysTags.add(sysTagsItem);
        return this;
    }

    public CreateChInstanceRequestBodyTagsInfo withSysTags(
        Consumer<List<CreateChInstanceRequestBodyTagsInfoSysTags>> sysTagsSetter) {
        if (this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        sysTagsSetter.accept(this.sysTags);
        return this;
    }

    /**
     * 系统标签。
     * @return sysTags
     */
    public List<CreateChInstanceRequestBodyTagsInfoSysTags> getSysTags() {
        return sysTags;
    }

    public void setSysTags(List<CreateChInstanceRequestBodyTagsInfoSysTags> sysTags) {
        this.sysTags = sysTags;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateChInstanceRequestBodyTagsInfo that = (CreateChInstanceRequestBodyTagsInfo) obj;
        return Objects.equals(this.sysTags, that.sysTags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sysTags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateChInstanceRequestBodyTagsInfo {\n");
        sb.append("    sysTags: ").append(toIndentedString(sysTags)).append("\n");
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
