/*
 * CityPay Payment API
 *  This CityPay API is a HTTP RESTful payment API used for direct server to server transactional processing. It provides a number of payment mechanisms including: Internet, MOTO, Continuous Authority transaction processing, 3-D Secure decision handling using RFA Secure, Authorisation, Refunding, Pre-Authorisation, Cancellation/Voids and Completion processing. The API is also capable of tokinsed payments using Card Holder Accounts.  ## Compliance and Security Your application will need to adhere to PCI-DSS standards to operate safely and to meet requirements set out by  Visa and MasterCard and the PCI Security Standards Council. These include  * Data must be collected using TLS version 1.2 using [strong cryptography](#enabled-tls-ciphers). We will not accept calls to our API at   lower grade encryption levels. We regularly scan our TLS endpoints for vulnerabilities and perform TLS assessments   as part of our compliance program. * The application must not store sensitive card holder data (CHD) such as the card security code (CSC) or   primary access number (PAN) * The application must not display the full card number on receipts, it is recommended to mask the PAN   and show the last 4 digits. The API will return this for you for ease of receipt creation * If you are developing a website, you will be required to perform regular scans on the network where you host the   application to meet your compliance obligations * You will be required to be PCI Compliant and the application must adhere to the security standard. Further information   is available from [https://www.pcisecuritystandards.org/](https://www.pcisecuritystandards.org/) * The API verifies that the request is for a valid account and originates from a trusted source using the remote IP   address. Our application firewalls analyse data that may be an attempt to break a large number of security common   security vulnerabilities. 
 *
 * Contact: support@citypay.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.citypay.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.citypay.client.JSON;

/**
 * PaylinkPartPayments
 */
public class PaylinkPartPayments {
  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private String enabled;

  public static final String SERIALIZED_NAME_FLOOR = "floor";
  @SerializedName(SERIALIZED_NAME_FLOOR)
  private String floor;

  public static final String SERIALIZED_NAME_MAX = "max";
  @SerializedName(SERIALIZED_NAME_MAX)
  private String max;

  public static final String SERIALIZED_NAME_MAX_RATE = "max_rate";
  @SerializedName(SERIALIZED_NAME_MAX_RATE)
  private String maxRate;

  public static final String SERIALIZED_NAME_MIN = "min";
  @SerializedName(SERIALIZED_NAME_MIN)
  private String min;

  public static final String SERIALIZED_NAME_MIN_RATE = "min_rate";
  @SerializedName(SERIALIZED_NAME_MIN_RATE)
  private String minRate;

  public PaylinkPartPayments() {
  }

  public PaylinkPartPayments enabled(String enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Determines if part payments is enabled. Default is false.
   * @return enabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines if part payments is enabled. Default is false.")

  public String getEnabled() {
    return enabled;
  }


  public void setEnabled(String enabled) {
    this.enabled = enabled;
  }


  public PaylinkPartPayments floor(String floor) {
    
    this.floor = floor;
    return this;
  }

   /**
   * The floor amount specifies a value that the minimum rate cannot go under. If 0 the amount of min rate is applied.
   * @return floor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The floor amount specifies a value that the minimum rate cannot go under. If 0 the amount of min rate is applied.")

  public String getFloor() {
    return floor;
  }


  public void setFloor(String floor) {
    this.floor = floor;
  }


  public PaylinkPartPayments max(String max) {
    
    this.max = max;
    return this;
  }

   /**
   * a maximum percentage to charge i.e. 90%.
   * @return max
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "a maximum percentage to charge i.e. 90%.")

  public String getMax() {
    return max;
  }


  public void setMax(String max) {
    this.max = max;
  }


  public PaylinkPartPayments maxRate(String maxRate) {
    
    this.maxRate = maxRate;
    return this;
  }

   /**
   * a rate as fixed or percentage.
   * @return maxRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "a rate as fixed or percentage.")

  public String getMaxRate() {
    return maxRate;
  }


  public void setMaxRate(String maxRate) {
    this.maxRate = maxRate;
  }


  public PaylinkPartPayments min(String min) {
    
    this.min = min;
    return this;
  }

   /**
   * a minimum percentage to charge i.e. 10.
   * @return min
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "a minimum percentage to charge i.e. 10.")

  public String getMin() {
    return min;
  }


  public void setMin(String min) {
    this.min = min;
  }


  public PaylinkPartPayments minRate(String minRate) {
    
    this.minRate = minRate;
    return this;
  }

   /**
   * a rate as fixed or percentage.
   * @return minRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "a rate as fixed or percentage.")

  public String getMinRate() {
    return minRate;
  }


  public void setMinRate(String minRate) {
    this.minRate = minRate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaylinkPartPayments paylinkPartPayments = (PaylinkPartPayments) o;
    return Objects.equals(this.enabled, paylinkPartPayments.enabled) &&
        Objects.equals(this.floor, paylinkPartPayments.floor) &&
        Objects.equals(this.max, paylinkPartPayments.max) &&
        Objects.equals(this.maxRate, paylinkPartPayments.maxRate) &&
        Objects.equals(this.min, paylinkPartPayments.min) &&
        Objects.equals(this.minRate, paylinkPartPayments.minRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, floor, max, maxRate, min, minRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaylinkPartPayments {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    floor: ").append(toIndentedString(floor)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    maxRate: ").append(toIndentedString(maxRate)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    minRate: ").append(toIndentedString(minRate)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("enabled");
    openapiFields.add("floor");
    openapiFields.add("max");
    openapiFields.add("max_rate");
    openapiFields.add("min");
    openapiFields.add("min_rate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaylinkPartPayments
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PaylinkPartPayments.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaylinkPartPayments is not found in the empty JSON string", PaylinkPartPayments.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PaylinkPartPayments.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PaylinkPartPayments` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("enabled") != null && !jsonObj.get("enabled").isJsonNull()) && !jsonObj.get("enabled").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enabled` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enabled").toString()));
      }
      if ((jsonObj.get("floor") != null && !jsonObj.get("floor").isJsonNull()) && !jsonObj.get("floor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `floor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("floor").toString()));
      }
      if ((jsonObj.get("max") != null && !jsonObj.get("max").isJsonNull()) && !jsonObj.get("max").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `max` to be a primitive type in the JSON string but got `%s`", jsonObj.get("max").toString()));
      }
      if ((jsonObj.get("max_rate") != null && !jsonObj.get("max_rate").isJsonNull()) && !jsonObj.get("max_rate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `max_rate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("max_rate").toString()));
      }
      if ((jsonObj.get("min") != null && !jsonObj.get("min").isJsonNull()) && !jsonObj.get("min").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `min` to be a primitive type in the JSON string but got `%s`", jsonObj.get("min").toString()));
      }
      if ((jsonObj.get("min_rate") != null && !jsonObj.get("min_rate").isJsonNull()) && !jsonObj.get("min_rate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `min_rate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("min_rate").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaylinkPartPayments.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaylinkPartPayments' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaylinkPartPayments> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaylinkPartPayments.class));

       return (TypeAdapter<T>) new TypeAdapter<PaylinkPartPayments>() {
           @Override
           public void write(JsonWriter out, PaylinkPartPayments value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaylinkPartPayments read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PaylinkPartPayments given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaylinkPartPayments
  * @throws IOException if the JSON string is invalid with respect to PaylinkPartPayments
  */
  public static PaylinkPartPayments fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaylinkPartPayments.class);
  }

 /**
  * Convert an instance of PaylinkPartPayments to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

