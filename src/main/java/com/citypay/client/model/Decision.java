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
import com.citypay.client.model.AuthResponse;
import com.citypay.client.model.AuthenRequired;
import com.citypay.client.model.RequestChallenged;
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
 * Decision
 */
public class Decision {
  public static final String SERIALIZED_NAME_AUTHEN_REQUIRED = "AuthenRequired";
  @SerializedName(SERIALIZED_NAME_AUTHEN_REQUIRED)
  private AuthenRequired authenRequired;

  public static final String SERIALIZED_NAME_AUTH_RESPONSE = "AuthResponse";
  @SerializedName(SERIALIZED_NAME_AUTH_RESPONSE)
  private AuthResponse authResponse;

  public static final String SERIALIZED_NAME_REQUEST_CHALLENGED = "RequestChallenged";
  @SerializedName(SERIALIZED_NAME_REQUEST_CHALLENGED)
  private RequestChallenged requestChallenged;

  public Decision() {
  }

  public Decision authenRequired(AuthenRequired authenRequired) {
    
    this.authenRequired = authenRequired;
    return this;
  }

   /**
   * Get authenRequired
   * @return authenRequired
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AuthenRequired getAuthenRequired() {
    return authenRequired;
  }


  public void setAuthenRequired(AuthenRequired authenRequired) {
    this.authenRequired = authenRequired;
  }


  public Decision authResponse(AuthResponse authResponse) {
    
    this.authResponse = authResponse;
    return this;
  }

   /**
   * Get authResponse
   * @return authResponse
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AuthResponse getAuthResponse() {
    return authResponse;
  }


  public void setAuthResponse(AuthResponse authResponse) {
    this.authResponse = authResponse;
  }


  public Decision requestChallenged(RequestChallenged requestChallenged) {
    
    this.requestChallenged = requestChallenged;
    return this;
  }

   /**
   * Get requestChallenged
   * @return requestChallenged
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RequestChallenged getRequestChallenged() {
    return requestChallenged;
  }


  public void setRequestChallenged(RequestChallenged requestChallenged) {
    this.requestChallenged = requestChallenged;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Decision decision = (Decision) o;
    return Objects.equals(this.authenRequired, decision.authenRequired) &&
        Objects.equals(this.authResponse, decision.authResponse) &&
        Objects.equals(this.requestChallenged, decision.requestChallenged);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenRequired, authResponse, requestChallenged);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Decision {\n");
    sb.append("    authenRequired: ").append(toIndentedString(authenRequired)).append("\n");
    sb.append("    authResponse: ").append(toIndentedString(authResponse)).append("\n");
    sb.append("    requestChallenged: ").append(toIndentedString(requestChallenged)).append("\n");
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
    openapiFields.add("AuthenRequired");
    openapiFields.add("AuthResponse");
    openapiFields.add("RequestChallenged");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Decision
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Decision.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Decision is not found in the empty JSON string", Decision.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Decision.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Decision` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `AuthenRequired`
      if (jsonObj.get("AuthenRequired") != null && !jsonObj.get("AuthenRequired").isJsonNull()) {
        AuthenRequired.validateJsonObject(jsonObj.getAsJsonObject("AuthenRequired"));
      }
      // validate the optional field `AuthResponse`
      if (jsonObj.get("AuthResponse") != null && !jsonObj.get("AuthResponse").isJsonNull()) {
        AuthResponse.validateJsonObject(jsonObj.getAsJsonObject("AuthResponse"));
      }
      // validate the optional field `RequestChallenged`
      if (jsonObj.get("RequestChallenged") != null && !jsonObj.get("RequestChallenged").isJsonNull()) {
        RequestChallenged.validateJsonObject(jsonObj.getAsJsonObject("RequestChallenged"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Decision.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Decision' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Decision> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Decision.class));

       return (TypeAdapter<T>) new TypeAdapter<Decision>() {
           @Override
           public void write(JsonWriter out, Decision value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Decision read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Decision given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Decision
  * @throws IOException if the JSON string is invalid with respect to Decision
  */
  public static Decision fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Decision.class);
  }

 /**
  * Convert an instance of Decision to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

