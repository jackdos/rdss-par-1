package org.parcore.domain;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

/**
 * PAR API
 * <p>
 * ProvenanceInformation
 * <p>
 * Domain model for the ProvenanceInformation object (part of the FileFormat Core Entity)
 * <p>
 * OpenAPI spec version: 1.0.0
 * <p>
 * This class is based on code auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 */
@SuppressWarnings("unused")
public class ProvenanceInformation {
    @SerializedName("provenanceSourceId")
    private String provenanceSourceId = null;

    @SerializedName("provenanceSourceNamespace")
    private String provenanceSourceNamespace = null;

    @SerializedName("provenanceName")
    private String provenanceName = null;

    @SerializedName("provenanceSourceDate")
    private String provenanceSourceDate = null;

    @SerializedName("provenanceDescription")
    private String provenanceDescription = null;

    /**
     * Get provenanceSourceId
     *
     * @return provenanceSourceId
     **/
    @ApiModelProperty(required = true, value = "")
    public String getProvenanceSourceId() {
        return provenanceSourceId;
    }

    public void setProvenanceSourceId(String provenanceSourceId) {
        this.provenanceSourceId = provenanceSourceId;
    }

    /**
     * Get provenanceSourceNamespace
     *
     * @return provenanceSourceNamespace
     **/
    @ApiModelProperty(required = true, value = "")
    public String getProvenanceSourceNamespace() {
        return provenanceSourceNamespace;
    }

    public void setProvenanceSourceNamespace(String provenanceSourceNamespace) {
        this.provenanceSourceNamespace = provenanceSourceNamespace;
    }

    /**
     * Get provenanceName
     *
     * @return provenanceName
     **/
    @ApiModelProperty(value = "")
    public String getProvenanceName() {
        return provenanceName;
    }

    public void setProvenanceName(String provenanceName) {
        this.provenanceName = provenanceName;
    }

    /**
     * Get provenanceSourceDate
     *
     * @return provenanceSourceDate
     **/
    @ApiModelProperty(value = "")
    public String getProvenanceSourceDate() {
        return provenanceSourceDate;
    }

    public void setProvenanceSourceDate(String provenanceSourceDate) {
        this.provenanceSourceDate = provenanceSourceDate;
    }

    /**
     * Get provenanceDescription
     *
     * @return provenanceDescription
     **/
    @ApiModelProperty(value = "")
    public String getProvenanceDescription() {
        return provenanceDescription;
    }

    public void setProvenanceDescription(String provenanceDescription) {
        this.provenanceDescription = provenanceDescription;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProvenanceInformation provenanceInformation = (ProvenanceInformation) o;
        return Objects.equals(this.provenanceSourceId, provenanceInformation.provenanceSourceId) &&
                Objects.equals(this.provenanceSourceNamespace, provenanceInformation.provenanceSourceNamespace) &&
                Objects.equals(this.provenanceName, provenanceInformation.provenanceName) &&
                Objects.equals(this.provenanceSourceDate, provenanceInformation.provenanceSourceDate) &&
                Objects.equals(this.provenanceDescription, provenanceInformation.provenanceDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(provenanceSourceId, provenanceSourceNamespace, provenanceName, provenanceSourceDate, provenanceDescription);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProvenanceInformation {\n");

        sb.append("    provenanceSourceId: ").append(toIndentedString(provenanceSourceId)).append("\n");
        sb.append("    provenanceSourceNamespace: ").append(toIndentedString(provenanceSourceNamespace)).append("\n");
        sb.append("    provenanceName: ").append(toIndentedString(provenanceName)).append("\n");
        sb.append("    provenanceSourceDate: ").append(toIndentedString(provenanceSourceDate)).append("\n");
        sb.append("    provenanceDescription: ").append(toIndentedString(provenanceDescription)).append("\n");
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
