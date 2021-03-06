package org.parcore.domain;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * PAR API
 * <p>
 * PreservationActionType
 * <p>
 * Domain model for the PreservationActionType Core Entity
 * <p>
 * OpenAPI spec version: 1.0.0
 * <p>
 * This class is based on code auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 */
@SuppressWarnings("unused")
@ApiModel(description = "The type of the preservation action as defined by PREMIS v3 event types.  http://id.loc.gov/vocabulary/preservation/eventType.html")
public class PreservationActionType {
    @SerializedName("id")
    private ParIdentifier id = null;

    @SerializedName("label")
    private String label = null;

    @SerializedName("localLastModifiedDate")
    private String localLastModifiedDate = null;


    /**
     * Get id
     *
     * @return id
     **/
    @ApiModelProperty(value = "")
    public ParIdentifier getId() {
        return id;
    }

    public void setId(ParIdentifier id) {
        this.id = id;
    }

    /**
     * Get label
     *
     * @return label
     **/
    @ApiModelProperty(value = "")
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * Get localLastModifiedDate
     *
     * @return localLastModifiedDate
     **/
    @ApiModelProperty(value = "")
    public String getLocalLastModifiedDate() {
        return localLastModifiedDate;
    }

    public void setLocalLastModifiedDate(String uri) {
        this.localLastModifiedDate = uri;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PreservationActionType preservationActionType = (PreservationActionType) o;
        return Objects.equals(this.id, preservationActionType.id) &&
                Objects.equals(this.label, preservationActionType.label) &&
                Objects.equals(this.localLastModifiedDate, preservationActionType.localLastModifiedDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, label, localLastModifiedDate);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PreservationActionType {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    localLastModifiedDate: ").append(toIndentedString(localLastModifiedDate)).append("\n");
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
