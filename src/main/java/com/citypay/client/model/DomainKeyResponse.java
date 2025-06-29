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
 * DomainKeyResponse
 */
public class DomainKeyResponse {
  public static final String SERIALIZED_NAME_DATE_CREATED = "date_created";
  @SerializedName(SERIALIZED_NAME_DATE_CREATED)
  @javax.annotation.Nullable
  private OffsetDateTime dateCreated;

  public static final String SERIALIZED_NAME_DOMAIN = "domain";
  @SerializedName(SERIALIZED_NAME_DOMAIN)
  @javax.annotation.Nonnull
  private List<String> domain = new ArrayList<>();

  public static final String SERIALIZED_NAME_DOMAIN_KEY = "domain_key";
  @SerializedName(SERIALIZED_NAME_DOMAIN_KEY)
  @javax.annotation.Nullable
  private String domainKey;

  public static final String SERIALIZED_NAME_LIVE = "live";
  @SerializedName(SERIALIZED_NAME_LIVE)
  @javax.annotation.Nullable
  private Boolean live;

  public static final String SERIALIZED_NAME_MERCHANTID = "merchantid";
  @SerializedName(SERIALIZED_NAME_MERCHANTID)
  @javax.annotation.Nonnull
  private Integer merchantid;

  public DomainKeyResponse() {
  }

  public DomainKeyResponse dateCreated(@javax.annotation.Nullable OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }

  /**
   * The date the domain key was generated. 
   * @return dateCreated
   */
  @javax.annotation.Nullable
  public OffsetDateTime getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(@javax.annotation.Nullable OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
  }


  public DomainKeyResponse domain(@javax.annotation.Nonnull List<String> domain) {
    this.domain = domain;
    return this;
  }

  public DomainKeyResponse addDomainItem(String domainItem) {
    if (this.domain == null) {
      this.domain = new ArrayList<>();
    }
    this.domain.add(domainItem);
    return this;
  }

  /**
   * Get domain
   * @return domain
   */
  @javax.annotation.Nonnull
  public List<String> getDomain() {
    return domain;
  }

  public void setDomain(@javax.annotation.Nonnull List<String> domain) {
    this.domain = domain;
  }


  public DomainKeyResponse domainKey(@javax.annotation.Nullable String domainKey) {
    this.domainKey = domainKey;
    return this;
  }

  /**
   * The domain key generated. 
   * @return domainKey
   */
  @javax.annotation.Nullable
  public String getDomainKey() {
    return domainKey;
  }

  public void setDomainKey(@javax.annotation.Nullable String domainKey) {
    this.domainKey = domainKey;
  }


  public DomainKeyResponse live(@javax.annotation.Nullable Boolean live) {
    this.live = live;
    return this;
  }

  /**
   * true if this key is a production key. 
   * @return live
   */
  @javax.annotation.Nullable
  public Boolean isLive() {
    return live;
  }

  public void setLive(@javax.annotation.Nullable Boolean live) {
    this.live = live;
  }


  public DomainKeyResponse merchantid(@javax.annotation.Nonnull Integer merchantid) {
    this.merchantid = merchantid;
    return this;
  }

  /**
   * The merchant id the domain key is to be used for. 
   * @return merchantid
   */
  @javax.annotation.Nonnull
  public Integer getMerchantid() {
    return merchantid;
  }

  public void setMerchantid(@javax.annotation.Nonnull Integer merchantid) {
    this.merchantid = merchantid;
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
   * @return the DomainKeyResponse instance itself
   */
  public DomainKeyResponse putAdditionalProperty(String key, Object value) {
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
    DomainKeyResponse domainKeyResponse = (DomainKeyResponse) o;
    return Objects.equals(this.dateCreated, domainKeyResponse.dateCreated) &&
        Objects.equals(this.domain, domainKeyResponse.domain) &&
        Objects.equals(this.domainKey, domainKeyResponse.domainKey) &&
        Objects.equals(this.live, domainKeyResponse.live) &&
        Objects.equals(this.merchantid, domainKeyResponse.merchantid)&&
        Objects.equals(this.additionalProperties, domainKeyResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateCreated, domain, domainKey, live, merchantid, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainKeyResponse {\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    domainKey: ").append(toIndentedString(domainKey)).append("\n");
    sb.append("    live: ").append(toIndentedString(live)).append("\n");
    sb.append("    merchantid: ").append(toIndentedString(merchantid)).append("\n");
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
    openapiFields.add("date_created");
    openapiFields.add("domain");
    openapiFields.add("domain_key");
    openapiFields.add("live");
    openapiFields.add("merchantid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("domain");
    openapiRequiredFields.add("merchantid");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DomainKeyResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DomainKeyResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DomainKeyResponse is not found in the empty JSON string", DomainKeyResponse.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DomainKeyResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the required json array is present
      if (jsonObj.get("domain") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("domain").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `domain` to be an array in the JSON string but got `%s`", jsonObj.get("domain").toString()));
      }
      if ((jsonObj.get("domain_key") != null && !jsonObj.get("domain_key").isJsonNull()) && !jsonObj.get("domain_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `domain_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("domain_key").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DomainKeyResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DomainKeyResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DomainKeyResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DomainKeyResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<DomainKeyResponse>() {
           @Override
           public void write(JsonWriter out, DomainKeyResponse value) throws IOException {
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
           public DomainKeyResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             DomainKeyResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of DomainKeyResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DomainKeyResponse
   * @throws IOException if the JSON string is invalid with respect to DomainKeyResponse
   */
  public static DomainKeyResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DomainKeyResponse.class);
  }

  /**
   * Convert an instance of DomainKeyResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

