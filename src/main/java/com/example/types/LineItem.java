
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
    "ItemCode",
    "ItemDescription",
    "ItemPrice",
    "ItemQty",
    "TotalValue"
})
@Generated("jsonschema2pojo")
public class LineItem {

    @JsonProperty("ItemCode")
    private String itemCode;
    @JsonProperty("ItemDescription")
    private String itemDescription;
    @JsonProperty("ItemPrice")
    private Double itemPrice;
    @JsonProperty("ItemQty")
    private Integer itemQty;
    @JsonProperty("TotalValue")
    private Double totalValue;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("ItemCode")
    public String getItemCode() {
        return itemCode;
    }

    @JsonProperty("ItemCode")
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    @JsonProperty("ItemDescription")
    public String getItemDescription() {
        return itemDescription;
    }

    @JsonProperty("ItemDescription")
    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    @JsonProperty("ItemPrice")
    public Double getItemPrice() {
        return itemPrice;
    }

    @JsonProperty("ItemPrice")
    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }

    @JsonProperty("ItemQty")
    public Integer getItemQty() {
        return itemQty;
    }

    @JsonProperty("ItemQty")
    public void setItemQty(Integer itemQty) {
        this.itemQty = itemQty;
    }

    @JsonProperty("TotalValue")
    public Double getTotalValue() {
        return totalValue;
    }

    @JsonProperty("TotalValue")
    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
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
        sb.append(LineItem.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("itemCode");
        sb.append('=');
        sb.append(((this.itemCode == null)?"<null>":this.itemCode));
        sb.append(',');
        sb.append("itemDescription");
        sb.append('=');
        sb.append(((this.itemDescription == null)?"<null>":this.itemDescription));
        sb.append(',');
        sb.append("itemPrice");
        sb.append('=');
        sb.append(((this.itemPrice == null)?"<null>":this.itemPrice));
        sb.append(',');
        sb.append("itemQty");
        sb.append('=');
        sb.append(((this.itemQty == null)?"<null>":this.itemQty));
        sb.append(',');
        sb.append("totalValue");
        sb.append('=');
        sb.append(((this.totalValue == null)?"<null>":this.totalValue));
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
        result = ((result* 31)+((this.totalValue == null)? 0 :this.totalValue.hashCode()));
        result = ((result* 31)+((this.itemQty == null)? 0 :this.itemQty.hashCode()));
        result = ((result* 31)+((this.itemCode == null)? 0 :this.itemCode.hashCode()));
        result = ((result* 31)+((this.itemPrice == null)? 0 :this.itemPrice.hashCode()));
        result = ((result* 31)+((this.itemDescription == null)? 0 :this.itemDescription.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LineItem) == false) {
            return false;
        }
        LineItem rhs = ((LineItem) other);
        return (((((((this.totalValue == rhs.totalValue)||((this.totalValue!= null)&&this.totalValue.equals(rhs.totalValue)))&&((this.itemQty == rhs.itemQty)||((this.itemQty!= null)&&this.itemQty.equals(rhs.itemQty))))&&((this.itemCode == rhs.itemCode)||((this.itemCode!= null)&&this.itemCode.equals(rhs.itemCode))))&&((this.itemPrice == rhs.itemPrice)||((this.itemPrice!= null)&&this.itemPrice.equals(rhs.itemPrice))))&&((this.itemDescription == rhs.itemDescription)||((this.itemDescription!= null)&&this.itemDescription.equals(rhs.itemDescription))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
