package com.huaweicloud.sdk.cdn.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cdn.v1.model.OriginRequest;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class UpdateDomainOriginRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain_id")
    
    private String domainId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    private String enterpriseProjectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private OriginRequest body;

    public UpdateDomainOriginRequest withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    


    /**
     * 加速域名ID。获取方法请参见查询加速域名。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    

    public UpdateDomainOriginRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    


    /**
     * 当用户开启企业项目功能时，该参数生效，表示查询资源所属项目，不传表示查询默认项目。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    

    public UpdateDomainOriginRequest withBody(OriginRequest body) {
        this.body = body;
        return this;
    }

    public UpdateDomainOriginRequest withBody(Consumer<OriginRequest> bodySetter) {
        if(this.body == null ){
            this.body = new OriginRequest();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public OriginRequest getBody() {
        return body;
    }

    public void setBody(OriginRequest body) {
        this.body = body;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateDomainOriginRequest updateDomainOriginRequest = (UpdateDomainOriginRequest) o;
        return Objects.equals(this.domainId, updateDomainOriginRequest.domainId) &&
            Objects.equals(this.enterpriseProjectId, updateDomainOriginRequest.enterpriseProjectId) &&
            Objects.equals(this.body, updateDomainOriginRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(domainId, enterpriseProjectId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDomainOriginRequest {\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

