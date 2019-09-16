package org.parcore.domain;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * PAR API
 * <p>
 * Parameter
 * <p>
 * Domain model for the Parameter object (part of the Tool Core Entity)
 * <p>
 * OpenAPI spec version: 1.0.0
 * <p>
 * This class is based on code auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 */
@SuppressWarnings("unused")
public class Parameter {

    @SerializedName("description")
    private String description = null;

    @SerializedName("type")
    private String type = null;

    @SerializedName("value")
    private String value = null;

    @ApiModelProperty(value = "")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @ApiModelProperty(value = "")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @ApiModelProperty(value = "")
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Parameter parameter = (Parameter) o;
        return Objects.equals(this.description, parameter.description) &&
                Objects.equals(this.type, parameter.type) &&
                Objects.equals(this.value, parameter.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, type, value);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Parameter {\n");

        sb.append("    description: ").append(toIndentedString(description));
        sb.append("    type: ").append(toIndentedString(type));
        sb.append("    value: ").append(toIndentedString(value));
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