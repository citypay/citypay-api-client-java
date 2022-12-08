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
 * RegisterCard
 */
public class RegisterCard {
  public static final String SERIALIZED_NAME_CARDNUMBER = "cardnumber";
  @SerializedName(SERIALIZED_NAME_CARDNUMBER)
  private String cardnumber;

  public static final String SERIALIZED_NAME_DEFAULT = "default";
  @SerializedName(SERIALIZED_NAME_DEFAULT)
  private Boolean _default;

  public static final String SERIALIZED_NAME_EXPMONTH = "expmonth";
  @SerializedName(SERIALIZED_NAME_EXPMONTH)
  private Integer expmonth;

  public static final String SERIALIZED_NAME_EXPYEAR = "expyear";
  @SerializedName(SERIALIZED_NAME_EXPYEAR)
  private Integer expyear;

  public static final String SERIALIZED_NAME_NAME_ON_CARD = "name_on_card";
  @SerializedName(SERIALIZED_NAME_NAME_ON_CARD)
  private String nameOnCard;

  public RegisterCard() {
  }

  public RegisterCard cardnumber(String cardnumber) {
    
    this.cardnumber = cardnumber;
    return this;
  }

   /**
   * The primary number of the card.
   * @return cardnumber
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "4000 0000 0000 0002", required = true, value = "The primary number of the card.")

  public String getCardnumber() {
    return cardnumber;
  }


  public void setCardnumber(String cardnumber) {
    this.cardnumber = cardnumber;
  }


  public RegisterCard _default(Boolean _default) {
    
    this._default = _default;
    return this;
  }

   /**
   * Determines whether the card should be the new default card.
   * @return _default
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines whether the card should be the new default card.")

  public Boolean isDefault() {
    return _default;
  }


  public void setDefault(Boolean _default) {
    this._default = _default;
  }


  public RegisterCard expmonth(Integer expmonth) {
    
    this.expmonth = expmonth;
    return this;
  }

   /**
   * The expiry month of the card.
   * minimum: 1
   * maximum: 12
   * @return expmonth
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "9", required = true, value = "The expiry month of the card.")

  public Integer getExpmonth() {
    return expmonth;
  }


  public void setExpmonth(Integer expmonth) {
    this.expmonth = expmonth;
  }


  public RegisterCard expyear(Integer expyear) {
    
    this.expyear = expyear;
    return this;
  }

   /**
   * The expiry year of the card.
   * minimum: 2000
   * maximum: 2100
   * @return expyear
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2025", required = true, value = "The expiry year of the card.")

  public Integer getExpyear() {
    return expyear;
  }


  public void setExpyear(Integer expyear) {
    this.expyear = expyear;
  }


  public RegisterCard nameOnCard(String nameOnCard) {
    
    this.nameOnCard = nameOnCard;
    return this;
  }

   /**
   * The card holder name as it appears on the card. The value is required if the account is to be used for 3dsv2 processing, otherwise it is optional.
   * @return nameOnCard
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MR NE BODY", value = "The card holder name as it appears on the card. The value is required if the account is to be used for 3dsv2 processing, otherwise it is optional.")

  public String getNameOnCard() {
    return nameOnCard;
  }


  public void setNameOnCard(String nameOnCard) {
    this.nameOnCard = nameOnCard;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegisterCard registerCard = (RegisterCard) o;
    return Objects.equals(this.cardnumber, registerCard.cardnumber) &&
        Objects.equals(this._default, registerCard._default) &&
        Objects.equals(this.expmonth, registerCard.expmonth) &&
        Objects.equals(this.expyear, registerCard.expyear) &&
        Objects.equals(this.nameOnCard, registerCard.nameOnCard);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardnumber, _default, expmonth, expyear, nameOnCard);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegisterCard {\n");
    sb.append("    cardnumber: ").append(toIndentedString(cardnumber)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    expmonth: ").append(toIndentedString(expmonth)).append("\n");
    sb.append("    expyear: ").append(toIndentedString(expyear)).append("\n");
    sb.append("    nameOnCard: ").append(toIndentedString(nameOnCard)).append("\n");
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
    openapiFields.add("cardnumber");
    openapiFields.add("default");
    openapiFields.add("expmonth");
    openapiFields.add("expyear");
    openapiFields.add("name_on_card");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("cardnumber");
    openapiRequiredFields.add("expmonth");
    openapiRequiredFields.add("expyear");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RegisterCard
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RegisterCard.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RegisterCard is not found in the empty JSON string", RegisterCard.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RegisterCard.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RegisterCard` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RegisterCard.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("cardnumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cardnumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cardnumber").toString()));
      }
      if ((jsonObj.get("name_on_card") != null && !jsonObj.get("name_on_card").isJsonNull()) && !jsonObj.get("name_on_card").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name_on_card` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name_on_card").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RegisterCard.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RegisterCard' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RegisterCard> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RegisterCard.class));

       return (TypeAdapter<T>) new TypeAdapter<RegisterCard>() {
           @Override
           public void write(JsonWriter out, RegisterCard value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RegisterCard read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RegisterCard given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RegisterCard
  * @throws IOException if the JSON string is invalid with respect to RegisterCard
  */
  public static RegisterCard fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RegisterCard.class);
  }

 /**
  * Convert an instance of RegisterCard to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

