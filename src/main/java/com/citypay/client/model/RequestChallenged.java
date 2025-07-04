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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.citypay.client.JSON;

/**
 * RequestChallenged
 */
public class RequestChallenged {
  public static final String SERIALIZED_NAME_ACS_URL = "acs_url";
  @SerializedName(SERIALIZED_NAME_ACS_URL)
  @javax.annotation.Nullable
  private String acsUrl;

  public static final String SERIALIZED_NAME_CREQ = "creq";
  @SerializedName(SERIALIZED_NAME_CREQ)
  @javax.annotation.Nullable
  private String creq;

  public static final String SERIALIZED_NAME_MERCHANTID = "merchantid";
  @SerializedName(SERIALIZED_NAME_MERCHANTID)
  @javax.annotation.Nullable
  private Integer merchantid;

  public static final String SERIALIZED_NAME_THREEDSERVER_TRANS_ID = "threedserver_trans_id";
  @SerializedName(SERIALIZED_NAME_THREEDSERVER_TRANS_ID)
  @javax.annotation.Nullable
  private String threedserverTransId;

  public static final String SERIALIZED_NAME_TRANSNO = "transno";
  @SerializedName(SERIALIZED_NAME_TRANSNO)
  @javax.annotation.Nullable
  private Integer transno;

  public RequestChallenged() {
  }

  public RequestChallenged acsUrl(@javax.annotation.Nullable String acsUrl) {
    this.acsUrl = acsUrl;
    return this;
  }

  /**
   * The url of the Access Control Server (ACS) to forward the user to. 
   * @return acsUrl
   */
  @javax.annotation.Nullable
  public String getAcsUrl() {
    return acsUrl;
  }

  public void setAcsUrl(@javax.annotation.Nullable String acsUrl) {
    this.acsUrl = acsUrl;
  }


  public RequestChallenged creq(@javax.annotation.Nullable String creq) {
    this.creq = creq;
    return this;
  }

  /**
   * The challenge request data which is encoded for usage by the ACS.
   * @return creq
   */
  @javax.annotation.Nullable
  public String getCreq() {
    return creq;
  }

  public void setCreq(@javax.annotation.Nullable String creq) {
    this.creq = creq;
  }


  public RequestChallenged merchantid(@javax.annotation.Nullable Integer merchantid) {
    this.merchantid = merchantid;
    return this;
  }

  /**
   * The merchant id that processed this transaction.
   * @return merchantid
   */
  @javax.annotation.Nullable
  public Integer getMerchantid() {
    return merchantid;
  }

  public void setMerchantid(@javax.annotation.Nullable Integer merchantid) {
    this.merchantid = merchantid;
  }


  public RequestChallenged threedserverTransId(@javax.annotation.Nullable String threedserverTransId) {
    this.threedserverTransId = threedserverTransId;
    return this;
  }

  /**
   * The 3DSv2 trans id reference for the challenge process. May be used to create the ThreeDSSessionData value to send to the ACS.
   * @return threedserverTransId
   */
  @javax.annotation.Nullable
  public String getThreedserverTransId() {
    return threedserverTransId;
  }

  public void setThreedserverTransId(@javax.annotation.Nullable String threedserverTransId) {
    this.threedserverTransId = threedserverTransId;
  }


  public RequestChallenged transno(@javax.annotation.Nullable Integer transno) {
    this.transno = transno;
    return this;
  }

  /**
   * The transaction number for the challenge, ordered incrementally from 1 for every merchant_id. 
   * @return transno
   */
  @javax.annotation.Nullable
  public Integer getTransno() {
    return transno;
  }

  public void setTransno(@javax.annotation.Nullable Integer transno) {
    this.transno = transno;
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
   * @return the RequestChallenged instance itself
   */
  public RequestChallenged putAdditionalProperty(String key, Object value) {
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
    RequestChallenged requestChallenged = (RequestChallenged) o;
    return Objects.equals(this.acsUrl, requestChallenged.acsUrl) &&
        Objects.equals(this.creq, requestChallenged.creq) &&
        Objects.equals(this.merchantid, requestChallenged.merchantid) &&
        Objects.equals(this.threedserverTransId, requestChallenged.threedserverTransId) &&
        Objects.equals(this.transno, requestChallenged.transno)&&
        Objects.equals(this.additionalProperties, requestChallenged.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acsUrl, creq, merchantid, threedserverTransId, transno, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestChallenged {\n");
    sb.append("    acsUrl: ").append(toIndentedString(acsUrl)).append("\n");
    sb.append("    creq: ").append(toIndentedString(creq)).append("\n");
    sb.append("    merchantid: ").append(toIndentedString(merchantid)).append("\n");
    sb.append("    threedserverTransId: ").append(toIndentedString(threedserverTransId)).append("\n");
    sb.append("    transno: ").append(toIndentedString(transno)).append("\n");
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
    openapiFields.add("acs_url");
    openapiFields.add("creq");
    openapiFields.add("merchantid");
    openapiFields.add("threedserver_trans_id");
    openapiFields.add("transno");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RequestChallenged
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RequestChallenged.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RequestChallenged is not found in the empty JSON string", RequestChallenged.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("acs_url") != null && !jsonObj.get("acs_url").isJsonNull()) && !jsonObj.get("acs_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `acs_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("acs_url").toString()));
      }
      if ((jsonObj.get("creq") != null && !jsonObj.get("creq").isJsonNull()) && !jsonObj.get("creq").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `creq` to be a primitive type in the JSON string but got `%s`", jsonObj.get("creq").toString()));
      }
      if ((jsonObj.get("threedserver_trans_id") != null && !jsonObj.get("threedserver_trans_id").isJsonNull()) && !jsonObj.get("threedserver_trans_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `threedserver_trans_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("threedserver_trans_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RequestChallenged.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RequestChallenged' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RequestChallenged> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RequestChallenged.class));

       return (TypeAdapter<T>) new TypeAdapter<RequestChallenged>() {
           @Override
           public void write(JsonWriter out, RequestChallenged value) throws IOException {
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
           public RequestChallenged read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             RequestChallenged instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of RequestChallenged given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RequestChallenged
   * @throws IOException if the JSON string is invalid with respect to RequestChallenged
   */
  public static RequestChallenged fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RequestChallenged.class);
  }

  /**
   * Convert an instance of RequestChallenged to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

