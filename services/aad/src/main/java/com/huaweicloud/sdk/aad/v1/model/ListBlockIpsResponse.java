package com.huaweicloud.sdk.aad.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListBlockIpsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blocking_list")

    private List<BlockListBlockingList> blockingList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ListBlockIpsResponse withBlockingList(List<BlockListBlockingList> blockingList) {
        this.blockingList = blockingList;
        return this;
    }

    public ListBlockIpsResponse addBlockingListItem(BlockListBlockingList blockingListItem) {
        if (this.blockingList == null) {
            this.blockingList = new ArrayList<>();
        }
        this.blockingList.add(blockingListItem);
        return this;
    }

    public ListBlockIpsResponse withBlockingList(Consumer<List<BlockListBlockingList>> blockingListSetter) {
        if (this.blockingList == null) {
            this.blockingList = new ArrayList<>();
        }
        blockingListSetter.accept(this.blockingList);
        return this;
    }

    /**
     * 封堵列表响应体
     * @return blockingList
     */
    public List<BlockListBlockingList> getBlockingList() {
        return blockingList;
    }

    public void setBlockingList(List<BlockListBlockingList> blockingList) {
        this.blockingList = blockingList;
    }

    public ListBlockIpsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总数
     * minimum: 0
     * maximum: 2000
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListBlockIpsResponse that = (ListBlockIpsResponse) obj;
        return Objects.equals(this.blockingList, that.blockingList) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(blockingList, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBlockIpsResponse {\n");
        sb.append("    blockingList: ").append(toIndentedString(blockingList)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
