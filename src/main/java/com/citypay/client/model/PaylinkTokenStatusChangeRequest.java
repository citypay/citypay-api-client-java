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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

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
 * PaylinkTokenStatusChangeRequest
 */
public class PaylinkTokenStatusChangeRequest {
  public static final String SERIALIZED_NAME_AFTER = "after";
  @SerializedName(SERIALIZED_NAME_AFTER)
  private OffsetDateTime after;

  public static final String SERIALIZED_NAME_MAX_RESULTS = "maxResults";
  @SerializedName(SERIALIZED_NAME_MAX_RESULTS)
  private Integer maxResults;

  public static final String SERIALIZED_NAME_MERCHANTID = "merchantid";
  @SerializedName(SERIALIZED_NAME_MERCHANTID)
  private Integer merchantid;

  public static final String SERIALIZED_NAME_NEXT_TOKEN = "nextToken";
  @SerializedName(SERIALIZED_NAME_NEXT_TOKEN)
  private String nextToken;

  public static final String SERIALIZED_NAME_ORDER_BY = "orderBy";
  @SerializedName(SERIALIZED_NAME_ORDER_BY)
  private List<String> orderBy = null;

  public PaylinkTokenStatusChangeRequest() {
  }

  public PaylinkTokenStatusChangeRequest after(OffsetDateTime after) {
    
    this.after = after;
    return this;
  }

   /**
   * identifies the date and time to lookup changes after.
   * @return after
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "identifies the date and time to lookup changes after.")

  public OffsetDateTime getAfter() {
    return after;
  }


  public void setAfter(OffsetDateTime after) {
    this.after = after;
  }


  public PaylinkTokenStatusChangeRequest maxResults(Integer maxResults) {
    
    this.maxResults = maxResults;
    return this;
  }

   /**
   * the maximum number of results between 5 and 250 to return. Default is 50.
   * @return maxResults
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the maximum number of results between 5 and 250 to return. Default is 50.")

  public Integer getMaxResults() {
    return maxResults;
  }


  public void setMaxResults(Integer maxResults) {
    this.maxResults = maxResults;
  }


  public PaylinkTokenStatusChangeRequest merchantid(Integer merchantid) {
    
    this.merchantid = merchantid;
    return this;
  }

   /**
   * the merchant id to review tokens for.
   * @return merchantid
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "11223344", required = true, value = "the merchant id to review tokens for.")

  public Integer getMerchantid() {
    return merchantid;
  }


  public void setMerchantid(Integer merchantid) {
    this.merchantid = merchantid;
  }


  public PaylinkTokenStatusChangeRequest nextToken(String nextToken) {
    
    this.nextToken = nextToken;
    return this;
  }

   /**
   * the next token value when more results are available.
   * @return nextToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the next token value when more results are available.")

  public String getNextToken() {
    return nextToken;
  }


  public void setNextToken(String nextToken) {
    this.nextToken = nextToken;
  }


  public PaylinkTokenStatusChangeRequest orderBy(List<String> orderBy) {
    
    this.orderBy = orderBy;
    return this;
  }

  public PaylinkTokenStatusChangeRequest addOrderByItem(String orderByItem) {
    if (this.orderBy == null) {
      this.orderBy = new ArrayList<>();
    }
    this.orderBy.add(orderByItem);
    return this;
  }

   /**
   * Get orderBy
   * @return orderBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getOrderBy() {
    return orderBy;
  }


  public void setOrderBy(List<String> orderBy) {
    this.orderBy = orderBy;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaylinkTokenStatusChangeRequest paylinkTokenStatusChangeRequest = (PaylinkTokenStatusChangeRequest) o;
    return Objects.equals(this.after, paylinkTokenStatusChangeRequest.after) &&
        Objects.equals(this.maxResults, paylinkTokenStatusChangeRequest.maxResults) &&
        Objects.equals(this.merchantid, paylinkTokenStatusChangeRequest.merchantid) &&
        Objects.equals(this.nextToken, paylinkTokenStatusChangeRequest.nextToken) &&
        Objects.equals(this.orderBy, paylinkTokenStatusChangeRequest.orderBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(after, maxResults, merchantid, nextToken, orderBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaylinkTokenStatusChangeRequest {\n");
    sb.append("    after: ").append(toIndentedString(after)).append("\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
    sb.append("    merchantid: ").append(toIndentedString(merchantid)).append("\n");
    sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
    sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
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
    openapiFields.add("after");
    openapiFields.add("maxResults");
    openapiFields.add("merchantid");
    openapiFields.add("nextToken");
    openapiFields.add("orderBy");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("after");
    openapiRequiredFields.add("merchantid");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaylinkTokenStatusChangeRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PaylinkTokenStatusChangeRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaylinkTokenStatusChangeRequest is not found in the empty JSON string", PaylinkTokenStatusChangeRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PaylinkTokenStatusChangeRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PaylinkTokenStatusChangeRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PaylinkTokenStatusChangeRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("nextToken") != null && !jsonObj.get("nextToken").isJsonNull()) && !jsonObj.get("nextToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nextToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nextToken").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("orderBy") != null && !jsonObj.get("orderBy").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `orderBy` to be an array in the JSON string but got `%s`", jsonObj.get("orderBy").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaylinkTokenStatusChangeRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaylinkTokenStatusChangeRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaylinkTokenStatusChangeRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaylinkTokenStatusChangeRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<PaylinkTokenStatusChangeRequest>() {
           @Override
           public void write(JsonWriter out, PaylinkTokenStatusChangeRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaylinkTokenStatusChangeRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PaylinkTokenStatusChangeRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaylinkTokenStatusChangeRequest
  * @throws IOException if the JSON string is invalid with respect to PaylinkTokenStatusChangeRequest
  */
  public static PaylinkTokenStatusChangeRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaylinkTokenStatusChangeRequest.class);
  }

 /**
  * Convert an instance of PaylinkTokenStatusChangeRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

