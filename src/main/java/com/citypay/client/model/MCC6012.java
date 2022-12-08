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
  @ApiModelProperty(value = "The account number of the recipient.")

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
  @ApiModelProperty(value = "The date of birth of the recipient.")

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
  @ApiModelProperty(value = "The lastname of ther recepient.")

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
  @ApiModelProperty(value = "The postcode of the recipient.")

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
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MCC6012
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!MCC6012.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MCC6012 is not found in the empty JSON string", MCC6012.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!MCC6012.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MCC6012` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
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
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
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

