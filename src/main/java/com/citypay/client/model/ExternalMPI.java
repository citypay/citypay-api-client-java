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
 * ExternalMPI
 */
public class ExternalMPI {
  public static final String SERIALIZED_NAME_AUTHEN_RESULT = "authen_result";
  @SerializedName(SERIALIZED_NAME_AUTHEN_RESULT)
  private String authenResult;

  public static final String SERIALIZED_NAME_CAVV = "cavv";
  @SerializedName(SERIALIZED_NAME_CAVV)
  private String cavv;

  public static final String SERIALIZED_NAME_ECI = "eci";
  @SerializedName(SERIALIZED_NAME_ECI)
  private Integer eci;

  public static final String SERIALIZED_NAME_ENROLLED = "enrolled";
  @SerializedName(SERIALIZED_NAME_ENROLLED)
  private String enrolled;

  public static final String SERIALIZED_NAME_XID = "xid";
  @SerializedName(SERIALIZED_NAME_XID)
  private String xid;

  public ExternalMPI() {
  }

  public ExternalMPI authenResult(String authenResult) {
    this.authenResult = authenResult;
    return this;
  }

   /**
   * The authentication result available from the MPI.
   * @return authenResult
  **/
  @javax.annotation.Nullable
  public String getAuthenResult() {
    return authenResult;
  }

  public void setAuthenResult(String authenResult) {
    this.authenResult = authenResult;
  }


  public ExternalMPI cavv(String cavv) {
    this.cavv = cavv;
    return this;
  }

   /**
   * A value determining the cardholder verification value supplied by the card scheme.
   * @return cavv
  **/
  @javax.annotation.Nullable
  public String getCavv() {
    return cavv;
  }

  public void setCavv(String cavv) {
    this.cavv = cavv;
  }


  public ExternalMPI eci(Integer eci) {
    this.eci = eci;
    return this;
  }

   /**
   * The obtained e-commerce indicator from the MPI.
   * @return eci
  **/
  @javax.annotation.Nullable
  public Integer getEci() {
    return eci;
  }

  public void setEci(Integer eci) {
    this.eci = eci;
  }


  public ExternalMPI enrolled(String enrolled) {
    this.enrolled = enrolled;
    return this;
  }

   /**
   * A value determining whether the card holder was enrolled.
   * @return enrolled
  **/
  @javax.annotation.Nullable
  public String getEnrolled() {
    return enrolled;
  }

  public void setEnrolled(String enrolled) {
    this.enrolled = enrolled;
  }


  public ExternalMPI xid(String xid) {
    this.xid = xid;
    return this;
  }

   /**
   * The XID used for processing with the MPI.
   * @return xid
  **/
  @javax.annotation.Nullable
  public String getXid() {
    return xid;
  }

  public void setXid(String xid) {
    this.xid = xid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalMPI externalMPI = (ExternalMPI) o;
    return Objects.equals(this.authenResult, externalMPI.authenResult) &&
        Objects.equals(this.cavv, externalMPI.cavv) &&
        Objects.equals(this.eci, externalMPI.eci) &&
        Objects.equals(this.enrolled, externalMPI.enrolled) &&
        Objects.equals(this.xid, externalMPI.xid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenResult, cavv, eci, enrolled, xid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalMPI {\n");
    sb.append("    authenResult: ").append(toIndentedString(authenResult)).append("\n");
    sb.append("    cavv: ").append(toIndentedString(cavv)).append("\n");
    sb.append("    eci: ").append(toIndentedString(eci)).append("\n");
    sb.append("    enrolled: ").append(toIndentedString(enrolled)).append("\n");
    sb.append("    xid: ").append(toIndentedString(xid)).append("\n");
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
    openapiFields.add("authen_result");
    openapiFields.add("cavv");
    openapiFields.add("eci");
    openapiFields.add("enrolled");
    openapiFields.add("xid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ExternalMPI
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ExternalMPI.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExternalMPI is not found in the empty JSON string", ExternalMPI.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ExternalMPI.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ExternalMPI` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("authen_result") != null && !jsonObj.get("authen_result").isJsonNull()) && !jsonObj.get("authen_result").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `authen_result` to be a primitive type in the JSON string but got `%s`", jsonObj.get("authen_result").toString()));
      }
      if ((jsonObj.get("cavv") != null && !jsonObj.get("cavv").isJsonNull()) && !jsonObj.get("cavv").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cavv` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cavv").toString()));
      }
      if ((jsonObj.get("enrolled") != null && !jsonObj.get("enrolled").isJsonNull()) && !jsonObj.get("enrolled").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enrolled` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enrolled").toString()));
      }
      if ((jsonObj.get("xid") != null && !jsonObj.get("xid").isJsonNull()) && !jsonObj.get("xid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `xid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("xid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExternalMPI.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExternalMPI' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExternalMPI> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExternalMPI.class));

       return (TypeAdapter<T>) new TypeAdapter<ExternalMPI>() {
           @Override
           public void write(JsonWriter out, ExternalMPI value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ExternalMPI read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ExternalMPI given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExternalMPI
  * @throws IOException if the JSON string is invalid with respect to ExternalMPI
  */
  public static ExternalMPI fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExternalMPI.class);
  }

 /**
  * Convert an instance of ExternalMPI to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

