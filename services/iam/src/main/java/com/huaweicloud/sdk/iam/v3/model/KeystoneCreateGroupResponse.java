package com.huaweicloud.sdk.iam.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.KeystoneGroupResultWithLinksSelf;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class KeystoneCreateGroupResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="group")
    
    private KeystoneGroupResultWithLinksSelf group = null;

    public KeystoneCreateGroupResponse withGroup(KeystoneGroupResultWithLinksSelf group) {
        this.group = group;
        return this;
    }

    public KeystoneCreateGroupResponse withGroup(Consumer<KeystoneGroupResultWithLinksSelf> groupSetter) {
        if(this.group == null ){
            this.group = new KeystoneGroupResultWithLinksSelf();
            groupSetter.accept(this.group);
        }
        
        return this;
    }


    /**
     * Get group
     * @return group
     */
    public KeystoneGroupResultWithLinksSelf getGroup() {
        return group;
    }

    public void setGroup(KeystoneGroupResultWithLinksSelf group) {
        this.group = group;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeystoneCreateGroupResponse keystoneCreateGroupResponse = (KeystoneCreateGroupResponse) o;
        return Objects.equals(this.group, keystoneCreateGroupResponse.group);
    }
    @Override
    public int hashCode() {
        return Objects.hash(group);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoneCreateGroupResponse {\n");
        sb.append("    group: ").append(toIndentedString(group)).append("\n");
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

