package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新路由请求体
 */
public class UpdateRoutesRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "routes")

    private List<RouteOption> routes = null;

    public UpdateRoutesRequestBody withRoutes(List<RouteOption> routes) {
        this.routes = routes;
        return this;
    }

    public UpdateRoutesRequestBody addRoutesItem(RouteOption routesItem) {
        if (this.routes == null) {
            this.routes = new ArrayList<>();
        }
        this.routes.add(routesItem);
        return this;
    }

    public UpdateRoutesRequestBody withRoutes(Consumer<List<RouteOption>> routesSetter) {
        if (this.routes == null) {
            this.routes = new ArrayList<>();
        }
        routesSetter.accept(this.routes);
        return this;
    }

    /**
     * 待更新的路由信息
     * @return routes
     */
    public List<RouteOption> getRoutes() {
        return routes;
    }

    public void setRoutes(List<RouteOption> routes) {
        this.routes = routes;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateRoutesRequestBody updateRoutesRequestBody = (UpdateRoutesRequestBody) o;
        return Objects.equals(this.routes, updateRoutesRequestBody.routes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(routes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateRoutesRequestBody {\n");
        sb.append("    routes: ").append(toIndentedString(routes)).append("\n");
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
