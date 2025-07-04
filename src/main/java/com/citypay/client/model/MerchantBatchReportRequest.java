/*
 * CityPay Payment API
 *  Welcome to the CityPay API, a robust HTTP API payment solution designed for seamless server-to-server  transactional processing. Our API facilitates a wide array of payment operations, catering to diverse business needs.  Whether you're integrating Internet payments, handling Mail Order/Telephone Order (MOTO) transactions, managing  Subscriptions with Recurring and Continuous Authority payments, or navigating the complexities of 3-D Secure  authentication, our API is equipped to support your requirements. Additionally, we offer functionalities for  Authorisation, Refunding, Pre-Authorisation, Cancellation/Voids, and Completion processing, alongside the capability  for tokenised payments.  ## Compliance and Security Overview <aside class=\"notice\">   Ensuring the security of payment transactions and compliance with industry standards is paramount. Our API is    designed with stringent security measures and compliance protocols to safeguard sensitive information and meet    the rigorous requirements of Visa, MasterCard, and the PCI Security Standards Council. </aside>  ### Key Compliance and Security Measures  * **TLS Encryption**: All data transmissions must utilise TLS version 1.2 or higher, employing [strong cryptography](#enabled-tls-ciphers). Our infrastructure strictly enforces this requirement to maintain the integrity and confidentiality of data in transit. We conduct regular scans and assessments of our TLS endpoints to identify and mitigate vulnerabilities. * **Data Storage Prohibitions**: Storing sensitive cardholder data (CHD), such as the card security code (CSC) or primary account number (PAN), is strictly prohibited. Our API is designed to minimize your exposure to sensitive data, thereby reducing your compliance burden. * **Data Masking**: For consumer protection and compliance, full card numbers must not be displayed on receipts or any customer-facing materials. Our API automatically masks PANs, displaying only the last four digits to facilitate safe receipt generation. * **Network Scans**: If your application is web-based, regular scans of your hosting environment are mandatory to identify and rectify potential vulnerabilities. This proactive measure is crucial for maintaining a secure and compliant online presence. * **PCI Compliance**: Adherence to PCI DSS standards is not optional; it's a requirement for operating securely and legally in the payments ecosystem. For detailed information on compliance requirements and resources, please visit the PCI Security Standards Council website [https://www.pcisecuritystandards.org/](https://www.pcisecuritystandards.org/). * **Request Validation**: Our API includes mechanisms to verify the legitimacy of each request, ensuring it pertains to a valid account and originates from a trusted source. We leverage remote IP address verification alongside sophisticated application firewall technologies to thwart a wide array of common security threats.  ## Getting Started Before integrating with the CityPay API, ensure your application and development practices align with the outlined compliance and security measures. This preparatory step is crucial for a smooth integration process and the long-term success of your payment processing operations.  For further details on API endpoints, request/response formats, and code examples, proceed to the subsequent sections of our documentation. Our aim is to provide you with all the necessary tools and information to integrate our payment processing capabilities seamlessly into your application.  Thank you for choosing CityPay API. We look forward to supporting your payment processing needs with our secure, compliant, and versatile API solution. 
 *
 * Contact: support@citypay.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.citypay.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
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
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.citypay.client.JSON;

/**
 * MerchantBatchReportRequest
 */
public class MerchantBatchReportRequest {
  public static final String SERIALIZED_NAME_DATE_FROM = "date_from";
  @SerializedName(SERIALIZED_NAME_DATE_FROM)
  @javax.annotation.Nullable
  private LocalDate dateFrom;

  public static final String SERIALIZED_NAME_DATE_UNTIL = "date_until";
  @SerializedName(SERIALIZED_NAME_DATE_UNTIL)
  @javax.annotation.Nullable
  private LocalDate dateUntil;

  public static final String SERIALIZED_NAME_MAX_RESULTS = "maxResults";
  @SerializedName(SERIALIZED_NAME_MAX_RESULTS)
  @javax.annotation.Nullable
  private Integer maxResults;

  public static final String SERIALIZED_NAME_MERCHANT_ID = "merchant_id";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ID)
  @javax.annotation.Nullable
  private List<Integer> merchantId = new ArrayList<>();

  public static final String SERIALIZED_NAME_NEXT_TOKEN = "nextToken";
  @SerializedName(SERIALIZED_NAME_NEXT_TOKEN)
  @javax.annotation.Nullable
  private String nextToken;

  public static final String SERIALIZED_NAME_ORDER_BY = "orderBy";
  @SerializedName(SERIALIZED_NAME_ORDER_BY)
  @javax.annotation.Nullable
  private String orderBy;

  public MerchantBatchReportRequest() {
  }

  public MerchantBatchReportRequest dateFrom(@javax.annotation.Nullable LocalDate dateFrom) {
    this.dateFrom = dateFrom;
    return this;
  }

  /**
   * Start date (YYYY-MM-DD) for batch retrieval range, inclusive. Maximum value is 3 years ago.
   * @return dateFrom
   */
  @javax.annotation.Nullable
  public LocalDate getDateFrom() {
    return dateFrom;
  }

  public void setDateFrom(@javax.annotation.Nullable LocalDate dateFrom) {
    this.dateFrom = dateFrom;
  }


  public MerchantBatchReportRequest dateUntil(@javax.annotation.Nullable LocalDate dateUntil) {
    this.dateUntil = dateUntil;
    return this;
  }

  /**
   * End date (YYYY-MM-DD) for batch retrieval range, inclusive.
   * @return dateUntil
   */
  @javax.annotation.Nullable
  public LocalDate getDateUntil() {
    return dateUntil;
  }

  public void setDateUntil(@javax.annotation.Nullable LocalDate dateUntil) {
    this.dateUntil = dateUntil;
  }


  public MerchantBatchReportRequest maxResults(@javax.annotation.Nullable Integer maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  /**
   * The maximum number of results to return in a single response. This value is used to limit the size of data returned by the API, enhancing performance and manageability. Values should be between 5 and 250.
   * @return maxResults
   */
  @javax.annotation.Nullable
  public Integer getMaxResults() {
    return maxResults;
  }

  public void setMaxResults(@javax.annotation.Nullable Integer maxResults) {
    this.maxResults = maxResults;
  }


  public MerchantBatchReportRequest merchantId(@javax.annotation.Nullable List<Integer> merchantId) {
    this.merchantId = merchantId;
    return this;
  }

  public MerchantBatchReportRequest addMerchantIdItem(Integer merchantIdItem) {
    if (this.merchantId == null) {
      this.merchantId = new ArrayList<>();
    }
    this.merchantId.add(merchantIdItem);
    return this;
  }

  /**
   * Get merchantId
   * @return merchantId
   */
  @javax.annotation.Nullable
  public List<Integer> getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(@javax.annotation.Nullable List<Integer> merchantId) {
    this.merchantId = merchantId;
  }


  public MerchantBatchReportRequest nextToken(@javax.annotation.Nullable String nextToken) {
    this.nextToken = nextToken;
    return this;
  }

  /**
   * A token that identifies the starting point of the page of results to be returned. An empty value indicates the start of the dataset. When supplied, it is validated and used to fetch the subsequent page of results. This token is typically obtained from the response of a previous pagination request.
   * @return nextToken
   */
  @javax.annotation.Nullable
  public String getNextToken() {
    return nextToken;
  }

  public void setNextToken(@javax.annotation.Nullable String nextToken) {
    this.nextToken = nextToken;
  }


  public MerchantBatchReportRequest orderBy(@javax.annotation.Nullable String orderBy) {
    this.orderBy = orderBy;
    return this;
  }

  /**
   * Specifies the field by which results are ordered. Available fields are [merchant_id,batch_no,net_amount]. By default, fields are ordered by OrderByExpression(merchant_id,ASC),OrderByExpression(batch_no,ASC). To order in descending order, prefix with &#39;-&#39; or suffix with &#39; DESC&#39;.
   * @return orderBy
   */
  @javax.annotation.Nullable
  public String getOrderBy() {
    return orderBy;
  }

  public void setOrderBy(@javax.annotation.Nullable String orderBy) {
    this.orderBy = orderBy;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the MerchantBatchReportRequest instance itself
   */
  public MerchantBatchReportRequest putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantBatchReportRequest merchantBatchReportRequest = (MerchantBatchReportRequest) o;
    return Objects.equals(this.dateFrom, merchantBatchReportRequest.dateFrom) &&
        Objects.equals(this.dateUntil, merchantBatchReportRequest.dateUntil) &&
        Objects.equals(this.maxResults, merchantBatchReportRequest.maxResults) &&
        Objects.equals(this.merchantId, merchantBatchReportRequest.merchantId) &&
        Objects.equals(this.nextToken, merchantBatchReportRequest.nextToken) &&
        Objects.equals(this.orderBy, merchantBatchReportRequest.orderBy)&&
        Objects.equals(this.additionalProperties, merchantBatchReportRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateFrom, dateUntil, maxResults, merchantId, nextToken, orderBy, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantBatchReportRequest {\n");
    sb.append("    dateFrom: ").append(toIndentedString(dateFrom)).append("\n");
    sb.append("    dateUntil: ").append(toIndentedString(dateUntil)).append("\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
    sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("date_from");
    openapiFields.add("date_until");
    openapiFields.add("maxResults");
    openapiFields.add("merchant_id");
    openapiFields.add("nextToken");
    openapiFields.add("orderBy");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to MerchantBatchReportRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MerchantBatchReportRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MerchantBatchReportRequest is not found in the empty JSON string", MerchantBatchReportRequest.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("merchant_id") != null && !jsonObj.get("merchant_id").isJsonNull() && !jsonObj.get("merchant_id").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_id` to be an array in the JSON string but got `%s`", jsonObj.get("merchant_id").toString()));
      }
      if ((jsonObj.get("nextToken") != null && !jsonObj.get("nextToken").isJsonNull()) && !jsonObj.get("nextToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nextToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nextToken").toString()));
      }
      if ((jsonObj.get("orderBy") != null && !jsonObj.get("orderBy").isJsonNull()) && !jsonObj.get("orderBy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orderBy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orderBy").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MerchantBatchReportRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MerchantBatchReportRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MerchantBatchReportRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MerchantBatchReportRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<MerchantBatchReportRequest>() {
           @Override
           public void write(JsonWriter out, MerchantBatchReportRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   JsonElement jsonElement = gson.toJsonTree(entry.getValue());
                   if (jsonElement.isJsonArray()) {
                     obj.add(entry.getKey(), jsonElement.getAsJsonArray());
                   } else {
                     obj.add(entry.getKey(), jsonElement.getAsJsonObject());
                   }
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public MerchantBatchReportRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             MerchantBatchReportRequest instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of MerchantBatchReportRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of MerchantBatchReportRequest
   * @throws IOException if the JSON string is invalid with respect to MerchantBatchReportRequest
   */
  public static MerchantBatchReportRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MerchantBatchReportRequest.class);
  }

  /**
   * Convert an instance of MerchantBatchReportRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

