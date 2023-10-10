
package com.example.types;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "StoreID",
    "PosID",
    "CustomerType",
    "DeliveryType",
    "DeliveryAddress"
})
@Generated("jsonschema2pojo")
public class PosInvoice
    extends Invoice
{

    @JsonProperty("StoreID")
    private String storeID;
    @JsonProperty("PosID")
    private String posID;
    @JsonProperty("CustomerType")
    private String customerType;
    @JsonProperty("DeliveryType")
    private String deliveryType;
    @JsonProperty("DeliveryAddress")
    private DeliveryAddress deliveryAddress;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("StoreID")
    public String getStoreID() {
        return storeID;
    }

    @JsonProperty("StoreID")
    public void setStoreID(String storeID) {
        this.storeID = storeID;
    }

    @JsonProperty("PosID")
    public String getPosID() {
        return posID;
    }

    @JsonProperty("PosID")
    public void setPosID(String posID) {
        this.posID = posID;
    }

    @JsonProperty("CustomerType")
    public String getCustomerType() {
        return customerType;
    }

    @JsonProperty("CustomerType")
    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    @JsonProperty("DeliveryType")
    public String getDeliveryType() {
        return deliveryType;
    }

    @JsonProperty("DeliveryType")
    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }

    @JsonProperty("DeliveryAddress")
    public DeliveryAddress getDeliveryAddress() {
        return deliveryAddress;
    }

    @JsonProperty("DeliveryAddress")
    public void setDeliveryAddress(DeliveryAddress deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PosInvoice.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        int baseLength = sb.length();
        String superString = super.toString();
        if (superString!= null) {
            int contentStart = superString.indexOf('[');
            int contentEnd = superString.lastIndexOf(']');
            if ((contentStart >= 0)&&(contentEnd >contentStart)) {
                sb.append(superString, (contentStart + 1), contentEnd);
            } else {
                sb.append(superString);
            }
        }
        if (sb.length()>baseLength) {
            sb.append(',');
        }
        sb.append("storeID");
        sb.append('=');
        sb.append(((this.storeID == null)?"<null>":this.storeID));
        sb.append(',');
        sb.append("posID");
        sb.append('=');
        sb.append(((this.posID == null)?"<null>":this.posID));
        sb.append(',');
        sb.append("customerType");
        sb.append('=');
        sb.append(((this.customerType == null)?"<null>":this.customerType));
        sb.append(',');
        sb.append("deliveryType");
        sb.append('=');
        sb.append(((this.deliveryType == null)?"<null>":this.deliveryType));
        sb.append(',');
        sb.append("deliveryAddress");
        sb.append('=');
        sb.append(((this.deliveryAddress == null)?"<null>":this.deliveryAddress));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.posID == null)? 0 :this.posID.hashCode()));
        result = ((result* 31)+((this.customerType == null)? 0 :this.customerType.hashCode()));
        result = ((result* 31)+((this.deliveryAddress == null)? 0 :this.deliveryAddress.hashCode()));
        result = ((result* 31)+((this.deliveryType == null)? 0 :this.deliveryType.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.storeID == null)? 0 :this.storeID.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PosInvoice) == false) {
            return false;
        }
        PosInvoice rhs = ((PosInvoice) other);
        return ((((((super.equals(rhs)&&((this.posID == rhs.posID)||((this.posID!= null)&&this.posID.equals(rhs.posID))))&&((this.customerType == rhs.customerType)||((this.customerType!= null)&&this.customerType.equals(rhs.customerType))))&&((this.deliveryAddress == rhs.deliveryAddress)||((this.deliveryAddress!= null)&&this.deliveryAddress.equals(rhs.deliveryAddress))))&&((this.deliveryType == rhs.deliveryType)||((this.deliveryType!= null)&&this.deliveryType.equals(rhs.deliveryType))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.storeID == rhs.storeID)||((this.storeID!= null)&&this.storeID.equals(rhs.storeID))));
    }

}
