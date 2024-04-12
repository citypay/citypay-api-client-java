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
import java.time.OffsetDateTime;
import java.util.Arrays;

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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.citypay.client.JSON;

/**
 * RemittanceData
 */
public class RemittanceData {
  public static final String SERIALIZED_NAME_DATE_CREATED = "date_created";
  @SerializedName(SERIALIZED_NAME_DATE_CREATED)
  private OffsetDateTime dateCreated;

  public static final String SERIALIZED_NAME_NET_AMOUNT = "net_amount";
  @SerializedName(SERIALIZED_NAME_NET_AMOUNT)
  private Integer netAmount;

  public static final String SERIALIZED_NAME_REFUND_AMOUNT = "refund_amount";
  @SerializedName(SERIALIZED_NAME_REFUND_AMOUNT)
  private Integer refundAmount;

  public static final String SERIALIZED_NAME_REFUND_COUNT = "refund_count";
  @SerializedName(SERIALIZED_NAME_REFUND_COUNT)
  private Integer refundCount;

  public static final String SERIALIZED_NAME_SALES_AMOUNT = "sales_amount";
  @SerializedName(SERIALIZED_NAME_SALES_AMOUNT)
  private Integer salesAmount;

  public static final String SERIALIZED_NAME_SALES_COUNT = "sales_count";
  @SerializedName(SERIALIZED_NAME_SALES_COUNT)
  private Integer salesCount;

  public RemittanceData() {
  }

  public RemittanceData dateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * Represents the date and time when the remittance was processed. This timestamp follows the ISO 8601 format for datetime representation.
   * @return dateCreated
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
  }


  public RemittanceData netAmount(Integer netAmount) {
    this.netAmount = netAmount;
    return this;
  }

   /**
   * Represents the net amount after accounting for refunds. This is calculated as SalesAmount - RefundAmount and expressed in the smallest currency unit.
   * minimum: 0
   * maximum: 999999999
   * @return netAmount
  **/
  @javax.annotation.Nullable
  public Integer getNetAmount() {
    return netAmount;
  }

  public void setNetAmount(Integer netAmount) {
    this.netAmount = netAmount;
  }


  public RemittanceData refundAmount(Integer refundAmount) {
    this.refundAmount = refundAmount;
    return this;
  }

   /**
   * The total amount refunded to customers.
   * minimum: 0
   * maximum: 999999999
   * @return refundAmount
  **/
  @javax.annotation.Nullable
  public Integer getRefundAmount() {
    return refundAmount;
  }

  public void setRefundAmount(Integer refundAmount) {
    this.refundAmount = refundAmount;
  }


  public RemittanceData refundCount(Integer refundCount) {
    this.refundCount = refundCount;
    return this;
  }

   /**
   * The total number of refund transactions processed. This figure helps in understanding the frequency of refunds relative to sales.
   * minimum: 0
   * maximum: 999999999
   * @return refundCount
  **/
  @javax.annotation.Nullable
  public Integer getRefundCount() {
    return refundCount;
  }

  public void setRefundCount(Integer refundCount) {
    this.refundCount = refundCount;
  }


  public RemittanceData salesAmount(Integer salesAmount) {
    this.salesAmount = salesAmount;
    return this;
  }

   /**
   * The total monetary amount of sales transactions.
   * minimum: 0
   * maximum: 999999999
   * @return salesAmount
  **/
  @javax.annotation.Nullable
  public Integer getSalesAmount() {
    return salesAmount;
  }

  public void setSalesAmount(Integer salesAmount) {
    this.salesAmount = salesAmount;
  }


  public RemittanceData salesCount(Integer salesCount) {
    this.salesCount = salesCount;
    return this;
  }

   /**
   * Indicates the total number of sales transactions that occurred. This count provides insight into the volume of sales.
   * minimum: 0
   * maximum: 999999999
   * @return salesCount
  **/
  @javax.annotation.Nullable
  public Integer getSalesCount() {
    return salesCount;
  }

  public void setSalesCount(Integer salesCount) {
    this.salesCount = salesCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemittanceData remittanceData = (RemittanceData) o;
    return Objects.equals(this.dateCreated, remittanceData.dateCreated) &&
        Objects.equals(this.netAmount, remittanceData.netAmount) &&
        Objects.equals(this.refundAmount, remittanceData.refundAmount) &&
        Objects.equals(this.refundCount, remittanceData.refundCount) &&
        Objects.equals(this.salesAmount, remittanceData.salesAmount) &&
        Objects.equals(this.salesCount, remittanceData.salesCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateCreated, netAmount, refundAmount, refundCount, salesAmount, salesCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemittanceData {\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    netAmount: ").append(toIndentedString(netAmount)).append("\n");
    sb.append("    refundAmount: ").append(toIndentedString(refundAmount)).append("\n");
    sb.append("    refundCount: ").append(toIndentedString(refundCount)).append("\n");
    sb.append("    salesAmount: ").append(toIndentedString(salesAmount)).append("\n");
    sb.append("    salesCount: ").append(toIndentedString(salesCount)).append("\n");
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
    openapiFields.add("date_created");
    openapiFields.add("net_amount");
    openapiFields.add("refund_amount");
    openapiFields.add("refund_count");
    openapiFields.add("sales_amount");
    openapiFields.add("sales_count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RemittanceData
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RemittanceData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RemittanceData is not found in the empty JSON string", RemittanceData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RemittanceData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RemittanceData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RemittanceData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RemittanceData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RemittanceData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RemittanceData.class));

       return (TypeAdapter<T>) new TypeAdapter<RemittanceData>() {
           @Override
           public void write(JsonWriter out, RemittanceData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RemittanceData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RemittanceData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RemittanceData
  * @throws IOException if the JSON string is invalid with respect to RemittanceData
  */
  public static RemittanceData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RemittanceData.class);
  }

 /**
  * Convert an instance of RemittanceData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

