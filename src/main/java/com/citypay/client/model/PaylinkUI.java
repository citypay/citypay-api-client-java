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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.citypay.client.JSON;

/**
 * PaylinkUI
 */
public class PaylinkUI {
  public static final String SERIALIZED_NAME_ADDRESS_MANDATORY = "address_mandatory";
  @SerializedName(SERIALIZED_NAME_ADDRESS_MANDATORY)
  private Boolean addressMandatory;

  public static final String SERIALIZED_NAME_FORM_AUTO_COMPLETE = "form_auto_complete";
  @SerializedName(SERIALIZED_NAME_FORM_AUTO_COMPLETE)
  private String formAutoComplete;

  public static final String SERIALIZED_NAME_ORDERING = "ordering";
  @SerializedName(SERIALIZED_NAME_ORDERING)
  private Integer ordering;

  public static final String SERIALIZED_NAME_POSTCODE_MANDATORY = "postcode_mandatory";
  @SerializedName(SERIALIZED_NAME_POSTCODE_MANDATORY)
  private Boolean postcodeMandatory;

  public PaylinkUI() {
  }

  public PaylinkUI addressMandatory(Boolean addressMandatory) {
    this.addressMandatory = addressMandatory;
    return this;
  }

   /**
   * whether the address is forced as mandatory.
   * @return addressMandatory
  **/
  @javax.annotation.Nullable
  public Boolean isAddressMandatory() {
    return addressMandatory;
  }

  public void setAddressMandatory(Boolean addressMandatory) {
    this.addressMandatory = addressMandatory;
  }


  public PaylinkUI formAutoComplete(String formAutoComplete) {
    this.formAutoComplete = formAutoComplete;
    return this;
  }

   /**
   * specify the form autocomplete setting, default to on. If set to off the UI will set autocomplete&#x3D;\&quot;off\&quot; on the form level and prevent elements from adding it.
   * @return formAutoComplete
  **/
  @javax.annotation.Nullable
  public String getFormAutoComplete() {
    return formAutoComplete;
  }

  public void setFormAutoComplete(String formAutoComplete) {
    this.formAutoComplete = formAutoComplete;
  }


  public PaylinkUI ordering(Integer ordering) {
    this.ordering = ordering;
    return this;
  }

   /**
   * the logical ordering of the ui groups.
   * @return ordering
  **/
  @javax.annotation.Nullable
  public Integer getOrdering() {
    return ordering;
  }

  public void setOrdering(Integer ordering) {
    this.ordering = ordering;
  }


  public PaylinkUI postcodeMandatory(Boolean postcodeMandatory) {
    this.postcodeMandatory = postcodeMandatory;
    return this;
  }

   /**
   * whether the postcode is forced as mandatory.
   * @return postcodeMandatory
  **/
  @javax.annotation.Nullable
  public Boolean isPostcodeMandatory() {
    return postcodeMandatory;
  }

  public void setPostcodeMandatory(Boolean postcodeMandatory) {
    this.postcodeMandatory = postcodeMandatory;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaylinkUI paylinkUI = (PaylinkUI) o;
    return Objects.equals(this.addressMandatory, paylinkUI.addressMandatory) &&
        Objects.equals(this.formAutoComplete, paylinkUI.formAutoComplete) &&
        Objects.equals(this.ordering, paylinkUI.ordering) &&
        Objects.equals(this.postcodeMandatory, paylinkUI.postcodeMandatory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressMandatory, formAutoComplete, ordering, postcodeMandatory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaylinkUI {\n");
    sb.append("    addressMandatory: ").append(toIndentedString(addressMandatory)).append("\n");
    sb.append("    formAutoComplete: ").append(toIndentedString(formAutoComplete)).append("\n");
    sb.append("    ordering: ").append(toIndentedString(ordering)).append("\n");
    sb.append("    postcodeMandatory: ").append(toIndentedString(postcodeMandatory)).append("\n");
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
    openapiFields.add("address_mandatory");
    openapiFields.add("form_auto_complete");
    openapiFields.add("ordering");
    openapiFields.add("postcode_mandatory");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PaylinkUI
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PaylinkUI.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaylinkUI is not found in the empty JSON string", PaylinkUI.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PaylinkUI.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PaylinkUI` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("form_auto_complete") != null && !jsonObj.get("form_auto_complete").isJsonNull()) && !jsonObj.get("form_auto_complete").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `form_auto_complete` to be a primitive type in the JSON string but got `%s`", jsonObj.get("form_auto_complete").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaylinkUI.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaylinkUI' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaylinkUI> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaylinkUI.class));

       return (TypeAdapter<T>) new TypeAdapter<PaylinkUI>() {
           @Override
           public void write(JsonWriter out, PaylinkUI value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaylinkUI read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PaylinkUI given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaylinkUI
  * @throws IOException if the JSON string is invalid with respect to PaylinkUI
  */
  public static PaylinkUI fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaylinkUI.class);
  }

 /**
  * Convert an instance of PaylinkUI to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

