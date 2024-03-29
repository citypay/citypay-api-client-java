/*
 * CityPay Payment API
 *  This CityPay API is an HTTP RESTful payment API used for direct server to server transactional processing. It provides a number of payment mechanisms including: Internet, MOTO, Continuous Authority transaction processing, 3-D Secure decision handling using RFA Secure, Authorisation, Refunding, Pre-Authorisation, Cancellation/Voids and Completion processing. The API is also capable of tokenized payments using cardholder Accounts.  ## Compliance and Security Your application will need to adhere to PCI-DSS standards to operate safely and to meet requirements set out by  Visa and MasterCard and the PCI Security Standards Council. These include  * Data must be collected using TLS version 1.2 using [strong cryptography](https://citypay.github.io/api-docs/payment-api/#enabled-tls-ciphers). We will not accept calls to our API at   lower grade encryption levels. We regularly scan our TLS endpoints for vulnerabilities and perform TLS assessments   as part of our compliance program. * The application must not store sensitive cardholder data (CHD) such as the card security code (CSC) or   primary access number (PAN) * The application must not display the full card number on receipts, it is recommended to mask the PAN   and show the last 4 digits. The API will return this for you for ease of receipt creation * If you are developing a website, you will be required to perform regular scans on the network where you host the   application to meet your compliance obligations * You will be required to be PCI Compliant and the application must adhere to the security standard. Further information   is available from [https://www.pcisecuritystandards.org/](https://www.pcisecuritystandards.org/) * The API verifies that the request is for a valid account and originates from a trusted source using the remote IP   address. Our application firewalls analyse data that may be an attempt to break a large number of security common   security vulnerabilities. 
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.citypay.client.JSON;

/**
 * PaylinkEmailNotificationPath
 */
public class PaylinkEmailNotificationPath {
  public static final String SERIALIZED_NAME_BCC = "bcc";
  @SerializedName(SERIALIZED_NAME_BCC)
  private List<String> bcc;

  public static final String SERIALIZED_NAME_CC = "cc";
  @SerializedName(SERIALIZED_NAME_CC)
  private List<String> cc;

  public static final String SERIALIZED_NAME_REPLY_TO = "reply_to";
  @SerializedName(SERIALIZED_NAME_REPLY_TO)
  private List<String> replyTo;

  public static final String SERIALIZED_NAME_TEMPLATE = "template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  private String template;

  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  private List<String> to = new ArrayList<>();

  public PaylinkEmailNotificationPath() {
  }

  public PaylinkEmailNotificationPath bcc(List<String> bcc) {
    this.bcc = bcc;
    return this;
  }

  public PaylinkEmailNotificationPath addBccItem(String bccItem) {
    if (this.bcc == null) {
      this.bcc = new ArrayList<>();
    }
    this.bcc.add(bccItem);
    return this;
  }

   /**
   * Get bcc
   * @return bcc
  **/
  @javax.annotation.Nullable
  public List<String> getBcc() {
    return bcc;
  }

  public void setBcc(List<String> bcc) {
    this.bcc = bcc;
  }


  public PaylinkEmailNotificationPath cc(List<String> cc) {
    this.cc = cc;
    return this;
  }

  public PaylinkEmailNotificationPath addCcItem(String ccItem) {
    if (this.cc == null) {
      this.cc = new ArrayList<>();
    }
    this.cc.add(ccItem);
    return this;
  }

   /**
   * Get cc
   * @return cc
  **/
  @javax.annotation.Nullable
  public List<String> getCc() {
    return cc;
  }

  public void setCc(List<String> cc) {
    this.cc = cc;
  }


  public PaylinkEmailNotificationPath replyTo(List<String> replyTo) {
    this.replyTo = replyTo;
    return this;
  }

  public PaylinkEmailNotificationPath addReplyToItem(String replyToItem) {
    if (this.replyTo == null) {
      this.replyTo = new ArrayList<>();
    }
    this.replyTo.add(replyToItem);
    return this;
  }

   /**
   * Get replyTo
   * @return replyTo
  **/
  @javax.annotation.Nullable
  public List<String> getReplyTo() {
    return replyTo;
  }

  public void setReplyTo(List<String> replyTo) {
    this.replyTo = replyTo;
  }


  public PaylinkEmailNotificationPath template(String template) {
    this.template = template;
    return this;
  }

   /**
   * An optional template name to use a template other than the default.
   * @return template
  **/
  @javax.annotation.Nullable
  public String getTemplate() {
    return template;
  }

  public void setTemplate(String template) {
    this.template = template;
  }


  public PaylinkEmailNotificationPath to(List<String> to) {
    this.to = to;
    return this;
  }

  public PaylinkEmailNotificationPath addToItem(String toItem) {
    if (this.to == null) {
      this.to = new ArrayList<>();
    }
    this.to.add(toItem);
    return this;
  }

   /**
   * Get to
   * @return to
  **/
  @javax.annotation.Nonnull
  public List<String> getTo() {
    return to;
  }

  public void setTo(List<String> to) {
    this.to = to;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaylinkEmailNotificationPath paylinkEmailNotificationPath = (PaylinkEmailNotificationPath) o;
    return Objects.equals(this.bcc, paylinkEmailNotificationPath.bcc) &&
        Objects.equals(this.cc, paylinkEmailNotificationPath.cc) &&
        Objects.equals(this.replyTo, paylinkEmailNotificationPath.replyTo) &&
        Objects.equals(this.template, paylinkEmailNotificationPath.template) &&
        Objects.equals(this.to, paylinkEmailNotificationPath.to);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bcc, cc, replyTo, template, to);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaylinkEmailNotificationPath {\n");
    sb.append("    bcc: ").append(toIndentedString(bcc)).append("\n");
    sb.append("    cc: ").append(toIndentedString(cc)).append("\n");
    sb.append("    replyTo: ").append(toIndentedString(replyTo)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
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
    openapiFields.add("bcc");
    openapiFields.add("cc");
    openapiFields.add("reply_to");
    openapiFields.add("template");
    openapiFields.add("to");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("to");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PaylinkEmailNotificationPath
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PaylinkEmailNotificationPath.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaylinkEmailNotificationPath is not found in the empty JSON string", PaylinkEmailNotificationPath.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PaylinkEmailNotificationPath.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PaylinkEmailNotificationPath` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PaylinkEmailNotificationPath.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("bcc") != null && !jsonObj.get("bcc").isJsonNull() && !jsonObj.get("bcc").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `bcc` to be an array in the JSON string but got `%s`", jsonObj.get("bcc").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("cc") != null && !jsonObj.get("cc").isJsonNull() && !jsonObj.get("cc").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `cc` to be an array in the JSON string but got `%s`", jsonObj.get("cc").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("reply_to") != null && !jsonObj.get("reply_to").isJsonNull() && !jsonObj.get("reply_to").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `reply_to` to be an array in the JSON string but got `%s`", jsonObj.get("reply_to").toString()));
      }
      if ((jsonObj.get("template") != null && !jsonObj.get("template").isJsonNull()) && !jsonObj.get("template").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `template` to be a primitive type in the JSON string but got `%s`", jsonObj.get("template").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("to") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("to").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `to` to be an array in the JSON string but got `%s`", jsonObj.get("to").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaylinkEmailNotificationPath.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaylinkEmailNotificationPath' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaylinkEmailNotificationPath> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaylinkEmailNotificationPath.class));

       return (TypeAdapter<T>) new TypeAdapter<PaylinkEmailNotificationPath>() {
           @Override
           public void write(JsonWriter out, PaylinkEmailNotificationPath value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaylinkEmailNotificationPath read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PaylinkEmailNotificationPath given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaylinkEmailNotificationPath
  * @throws IOException if the JSON string is invalid with respect to PaylinkEmailNotificationPath
  */
  public static PaylinkEmailNotificationPath fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaylinkEmailNotificationPath.class);
  }

 /**
  * Convert an instance of PaylinkEmailNotificationPath to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

