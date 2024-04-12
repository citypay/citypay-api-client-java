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
 * MCC6012
 */
public class MCC6012 {
  public static final String SERIALIZED_NAME_RECIPIENT_ACCOUNT = "recipient_account";
  @SerializedName(SERIALIZED_NAME_RECIPIENT_ACCOUNT)
  private String recipientAccount;

  public static final String SERIALIZED_NAME_RECIPIENT_DOB = "recipient_dob";
  @SerializedName(SERIALIZED_NAME_RECIPIENT_DOB)
  private String recipientDob;

  public static final String SERIALIZED_NAME_RECIPIENT_LASTNAME = "recipient_lastname";
  @SerializedName(SERIALIZED_NAME_RECIPIENT_LASTNAME)
  private String recipientLastname;

  public static final String SERIALIZED_NAME_RECIPIENT_POSTCODE = "recipient_postcode";
  @SerializedName(SERIALIZED_NAME_RECIPIENT_POSTCODE)
  private String recipientPostcode;

  public MCC6012() {
  }

  public MCC6012 recipientAccount(String recipientAccount) {
    this.recipientAccount = recipientAccount;
    return this;
  }

   /**
   * The account number of the recipient.
   * @return recipientAccount
  **/
  @javax.annotation.Nullable
  public String getRecipientAccount() {
    return recipientAccount;
  }

  public void setRecipientAccount(String recipientAccount) {
    this.recipientAccount = recipientAccount;
  }


  public MCC6012 recipientDob(String recipientDob) {
    this.recipientDob = recipientDob;
    return this;
  }

   /**
   * The date of birth of the recipient.
   * @return recipientDob
  **/
  @javax.annotation.Nullable
  public String getRecipientDob() {
    return recipientDob;
  }

  public void setRecipientDob(String recipientDob) {
    this.recipientDob = recipientDob;
  }


  public MCC6012 recipientLastname(String recipientLastname) {
    this.recipientLastname = recipientLastname;
    return this;
  }

   /**
   * The lastname of ther recepient.
   * @return recipientLastname
  **/
  @javax.annotation.Nullable
  public String getRecipientLastname() {
    return recipientLastname;
  }

  public void setRecipientLastname(String recipientLastname) {
    this.recipientLastname = recipientLastname;
  }


  public MCC6012 recipientPostcode(String recipientPostcode) {
    this.recipientPostcode = recipientPostcode;
    return this;
  }

   /**
   * The postcode of the recipient.
   * @return recipientPostcode
  **/
  @javax.annotation.Nullable
  public String getRecipientPostcode() {
    return recipientPostcode;
  }

  public void setRecipientPostcode(String recipientPostcode) {
    this.recipientPostcode = recipientPostcode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MCC6012 MCC6012 = (MCC6012) o;
    return Objects.equals(this.recipientAccount, MCC6012.recipientAccount) &&
        Objects.equals(this.recipientDob, MCC6012.recipientDob) &&
        Objects.equals(this.recipientLastname, MCC6012.recipientLastname) &&
        Objects.equals(this.recipientPostcode, MCC6012.recipientPostcode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recipientAccount, recipientDob, recipientLastname, recipientPostcode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MCC6012 {\n");
    sb.append("    recipientAccount: ").append(toIndentedString(recipientAccount)).append("\n");
    sb.append("    recipientDob: ").append(toIndentedString(recipientDob)).append("\n");
    sb.append("    recipientLastname: ").append(toIndentedString(recipientLastname)).append("\n");
    sb.append("    recipientPostcode: ").append(toIndentedString(recipientPostcode)).append("\n");
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
    openapiFields.add("recipient_account");
    openapiFields.add("recipient_dob");
    openapiFields.add("recipient_lastname");
    openapiFields.add("recipient_postcode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MCC6012
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MCC6012.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MCC6012 is not found in the empty JSON string", MCC6012.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MCC6012.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MCC6012` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("recipient_account") != null && !jsonObj.get("recipient_account").isJsonNull()) && !jsonObj.get("recipient_account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recipient_account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recipient_account").toString()));
      }
      if ((jsonObj.get("recipient_dob") != null && !jsonObj.get("recipient_dob").isJsonNull()) && !jsonObj.get("recipient_dob").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recipient_dob` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recipient_dob").toString()));
      }
      if ((jsonObj.get("recipient_lastname") != null && !jsonObj.get("recipient_lastname").isJsonNull()) && !jsonObj.get("recipient_lastname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recipient_lastname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recipient_lastname").toString()));
      }
      if ((jsonObj.get("recipient_postcode") != null && !jsonObj.get("recipient_postcode").isJsonNull()) && !jsonObj.get("recipient_postcode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recipient_postcode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recipient_postcode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MCC6012.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MCC6012' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MCC6012> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MCC6012.class));

       return (TypeAdapter<T>) new TypeAdapter<MCC6012>() {
           @Override
           public void write(JsonWriter out, MCC6012 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MCC6012 read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MCC6012 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MCC6012
  * @throws IOException if the JSON string is invalid with respect to MCC6012
  */
  public static MCC6012 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MCC6012.class);
  }

 /**
  * Convert an instance of MCC6012 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

