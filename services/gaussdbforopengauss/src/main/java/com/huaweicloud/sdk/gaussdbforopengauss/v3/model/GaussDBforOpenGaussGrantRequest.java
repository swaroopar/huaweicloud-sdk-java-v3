package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.GaussDBforOpenGaussUserWithPrivilege;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * GaussDBforOpenGaussGrantRequest
 */
public class GaussDBforOpenGaussGrantRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="db_name")
    
    
    private String dbName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="users")
    
    
    private List<GaussDBforOpenGaussUserWithPrivilege> users = null;
    
    public GaussDBforOpenGaussGrantRequest withDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    


    /**
     * 数据库名称。  数据库名称在1到63个字符之间，由字母、数字、或下划线组成，不能包含其他特殊字符，不能以“pg”和数字开头，且不能和GaussDB for OpenGauss模板库重名。  GaussDB for OpenGauss模板库包括postgres， template0 ，template1。
     * @return dbName
     */
    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    

    public GaussDBforOpenGaussGrantRequest withUsers(List<GaussDBforOpenGaussUserWithPrivilege> users) {
        this.users = users;
        return this;
    }

    
    public GaussDBforOpenGaussGrantRequest addUsersItem(GaussDBforOpenGaussUserWithPrivilege usersItem) {
        if(this.users == null) {
            this.users = new ArrayList<>();
        }
        this.users.add(usersItem);
        return this;
    }

    public GaussDBforOpenGaussGrantRequest withUsers(Consumer<List<GaussDBforOpenGaussUserWithPrivilege>> usersSetter) {
        if(this.users == null) {
            this.users = new ArrayList<>();
        }
        usersSetter.accept(this.users);
        return this;
    }

    /**
     * 每个元素都是与数据库相关联的帐号。单次请求最多支持50个元素。
     * @return users
     */
    public List<GaussDBforOpenGaussUserWithPrivilege> getUsers() {
        return users;
    }

    public void setUsers(List<GaussDBforOpenGaussUserWithPrivilege> users) {
        this.users = users;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GaussDBforOpenGaussGrantRequest gaussDBforOpenGaussGrantRequest = (GaussDBforOpenGaussGrantRequest) o;
        return Objects.equals(this.dbName, gaussDBforOpenGaussGrantRequest.dbName) &&
            Objects.equals(this.users, gaussDBforOpenGaussGrantRequest.users);
    }
    @Override
    public int hashCode() {
        return Objects.hash(dbName, users);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GaussDBforOpenGaussGrantRequest {\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    users: ").append(toIndentedString(users)).append("\n");
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

