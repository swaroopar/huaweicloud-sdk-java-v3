package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class SearchStatisticConferenceInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private List<StatisticConferenceDataItem> data = null;

    public SearchStatisticConferenceInfoResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /** 总记录数。 minimum: 0
     * 
     * @return count */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public SearchStatisticConferenceInfoResponse withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /** 查询条目数量。 minimum: 10 maximum: 500
     * 
     * @return limit */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public SearchStatisticConferenceInfoResponse withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /** 查询偏移量。 minimum: 0
     * 
     * @return offset */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public SearchStatisticConferenceInfoResponse withData(List<StatisticConferenceDataItem> data) {
        this.data = data;
        return this;
    }

    public SearchStatisticConferenceInfoResponse addDataItem(StatisticConferenceDataItem dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    public SearchStatisticConferenceInfoResponse withData(Consumer<List<StatisticConferenceDataItem>> dataSetter) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        dataSetter.accept(this.data);
        return this;
    }

    /** 会议总体数据按时间点统计的查询结果数组。
     * 
     * @return data */
    public List<StatisticConferenceDataItem> getData() {
        return data;
    }

    public void setData(List<StatisticConferenceDataItem> data) {
        this.data = data;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SearchStatisticConferenceInfoResponse searchStatisticConferenceInfoResponse =
            (SearchStatisticConferenceInfoResponse) o;
        return Objects.equals(this.count, searchStatisticConferenceInfoResponse.count)
            && Objects.equals(this.limit, searchStatisticConferenceInfoResponse.limit)
            && Objects.equals(this.offset, searchStatisticConferenceInfoResponse.offset)
            && Objects.equals(this.data, searchStatisticConferenceInfoResponse.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, limit, offset, data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchStatisticConferenceInfoResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
