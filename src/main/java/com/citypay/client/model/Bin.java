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
 * Bin
 */
public class Bin {
  public static final String SERIALIZED_NAME_BIN_COMMERCIAL = "bin_commercial";
  @SerializedName(SERIALIZED_NAME_BIN_COMMERCIAL)
  private Boolean binCommercial;

  public static final String SERIALIZED_NAME_BIN_CORPORATE = "bin_corporate";
  @SerializedName(SERIALIZED_NAME_BIN_CORPORATE)
  private Boolean binCorporate;

  public static final String SERIALIZED_NAME_BIN_COUNTRY_ISSUED = "bin_country_issued";
  @SerializedName(SERIALIZED_NAME_BIN_COUNTRY_ISSUED)
  private String binCountryIssued;

  public static final String SERIALIZED_NAME_BIN_CREDIT = "bin_credit";
  @SerializedName(SERIALIZED_NAME_BIN_CREDIT)
  private Boolean binCredit;

  public static final String SERIALIZED_NAME_BIN_CURRENCY = "bin_currency";
  @SerializedName(SERIALIZED_NAME_BIN_CURRENCY)
  private String binCurrency;

  public static final String SERIALIZED_NAME_BIN_DEBIT = "bin_debit";
  @SerializedName(SERIALIZED_NAME_BIN_DEBIT)
  private Boolean binDebit;

  public static final String SERIALIZED_NAME_BIN_DESCRIPTION = "bin_description";
  @SerializedName(SERIALIZED_NAME_BIN_DESCRIPTION)
  private String binDescription;

  public static final String SERIALIZED_NAME_BIN_EU = "bin_eu";
  @SerializedName(SERIALIZED_NAME_BIN_EU)
  private Boolean binEu;

  public static final String SERIALIZED_NAME_SCHEME = "scheme";
  @SerializedName(SERIALIZED_NAME_SCHEME)
  private String scheme;

  public Bin() {
  }

  public Bin binCommercial(Boolean binCommercial) {
    this.binCommercial = binCommercial;
    return this;
  }

   /**
   * Defines whether the card is a commercial card.
   * @return binCommercial
  **/
  @javax.annotation.Nullable
  public Boolean isBinCommercial() {
    return binCommercial;
  }

  public void setBinCommercial(Boolean binCommercial) {
    this.binCommercial = binCommercial;
  }


  public Bin binCorporate(Boolean binCorporate) {
    this.binCorporate = binCorporate;
    return this;
  }

   /**
   * Defines whether the card is a corporate business card.
   * @return binCorporate
  **/
  @javax.annotation.Nullable
  public Boolean isBinCorporate() {
    return binCorporate;
  }

  public void setBinCorporate(Boolean binCorporate) {
    this.binCorporate = binCorporate;
  }


  public Bin binCountryIssued(String binCountryIssued) {
    this.binCountryIssued = binCountryIssued;
    return this;
  }

   /**
   * The determined country where the card was issued.
   * @return binCountryIssued
  **/
  @javax.annotation.Nullable
  public String getBinCountryIssued() {
    return binCountryIssued;
  }

  public void setBinCountryIssued(String binCountryIssued) {
    this.binCountryIssued = binCountryIssued;
  }


  public Bin binCredit(Boolean binCredit) {
    this.binCredit = binCredit;
    return this;
  }

   /**
   * Defines whether the card is a credit card.
   * @return binCredit
  **/
  @javax.annotation.Nullable
  public Boolean isBinCredit() {
    return binCredit;
  }

  public void setBinCredit(Boolean binCredit) {
    this.binCredit = binCredit;
  }


  public Bin binCurrency(String binCurrency) {
    this.binCurrency = binCurrency;
    return this;
  }

   /**
   * The default currency determined for the card.
   * @return binCurrency
  **/
  @javax.annotation.Nullable
  public String getBinCurrency() {
    return binCurrency;
  }

  public void setBinCurrency(String binCurrency) {
    this.binCurrency = binCurrency;
  }


  public Bin binDebit(Boolean binDebit) {
    this.binDebit = binDebit;
    return this;
  }

   /**
   * Defines whether the card is a debit card.
   * @return binDebit
  **/
  @javax.annotation.Nullable
  public Boolean isBinDebit() {
    return binDebit;
  }

  public void setBinDebit(Boolean binDebit) {
    this.binDebit = binDebit;
  }


  public Bin binDescription(String binDescription) {
    this.binDescription = binDescription;
    return this;
  }

   /**
   * A description of the bin on the card to identify what type of product the card is.
   * @return binDescription
  **/
  @javax.annotation.Nullable
  public String getBinDescription() {
    return binDescription;
  }

  public void setBinDescription(String binDescription) {
    this.binDescription = binDescription;
  }


  public Bin binEu(Boolean binEu) {
    this.binEu = binEu;
    return this;
  }

   /**
   * Defines whether the card is regulated within the EU.
   * @return binEu
  **/
  @javax.annotation.Nullable
  public Boolean isBinEu() {
    return binEu;
  }

  public void setBinEu(Boolean binEu) {
    this.binEu = binEu;
  }


  public Bin scheme(String scheme) {
    this.scheme = scheme;
    return this;
  }

   /**
   * The scheme that issued the card.
   * @return scheme
  **/
  @javax.annotation.Nullable
  public String getScheme() {
    return scheme;
  }

  public void setScheme(String scheme) {
    this.scheme = scheme;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Bin bin = (Bin) o;
    return Objects.equals(this.binCommercial, bin.binCommercial) &&
        Objects.equals(this.binCorporate, bin.binCorporate) &&
        Objects.equals(this.binCountryIssued, bin.binCountryIssued) &&
        Objects.equals(this.binCredit, bin.binCredit) &&
        Objects.equals(this.binCurrency, bin.binCurrency) &&
        Objects.equals(this.binDebit, bin.binDebit) &&
        Objects.equals(this.binDescription, bin.binDescription) &&
        Objects.equals(this.binEu, bin.binEu) &&
        Objects.equals(this.scheme, bin.scheme);
  }

  @Override
  public int hashCode() {
    return Objects.hash(binCommercial, binCorporate, binCountryIssued, binCredit, binCurrency, binDebit, binDescription, binEu, scheme);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Bin {\n");
    sb.append("    binCommercial: ").append(toIndentedString(binCommercial)).append("\n");
    sb.append("    binCorporate: ").append(toIndentedString(binCorporate)).append("\n");
    sb.append("    binCountryIssued: ").append(toIndentedString(binCountryIssued)).append("\n");
    sb.append("    binCredit: ").append(toIndentedString(binCredit)).append("\n");
    sb.append("    binCurrency: ").append(toIndentedString(binCurrency)).append("\n");
    sb.append("    binDebit: ").append(toIndentedString(binDebit)).append("\n");
    sb.append("    binDescription: ").append(toIndentedString(binDescription)).append("\n");
    sb.append("    binEu: ").append(toIndentedString(binEu)).append("\n");
    sb.append("    scheme: ").append(toIndentedString(scheme)).append("\n");
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
    openapiFields.add("bin_commercial");
    openapiFields.add("bin_corporate");
    openapiFields.add("bin_country_issued");
    openapiFields.add("bin_credit");
    openapiFields.add("bin_currency");
    openapiFields.add("bin_debit");
    openapiFields.add("bin_description");
    openapiFields.add("bin_eu");
    openapiFields.add("scheme");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Bin
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Bin.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Bin is not found in the empty JSON string", Bin.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Bin.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Bin` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("bin_country_issued") != null && !jsonObj.get("bin_country_issued").isJsonNull()) && !jsonObj.get("bin_country_issued").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bin_country_issued` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bin_country_issued").toString()));
      }
      if ((jsonObj.get("bin_currency") != null && !jsonObj.get("bin_currency").isJsonNull()) && !jsonObj.get("bin_currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bin_currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bin_currency").toString()));
      }
      if ((jsonObj.get("bin_description") != null && !jsonObj.get("bin_description").isJsonNull()) && !jsonObj.get("bin_description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bin_description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bin_description").toString()));
      }
      if ((jsonObj.get("scheme") != null && !jsonObj.get("scheme").isJsonNull()) && !jsonObj.get("scheme").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scheme` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scheme").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Bin.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Bin' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Bin> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Bin.class));

       return (TypeAdapter<T>) new TypeAdapter<Bin>() {
           @Override
           public void write(JsonWriter out, Bin value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Bin read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Bin given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Bin
  * @throws IOException if the JSON string is invalid with respect to Bin
  */
  public static Bin fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Bin.class);
  }

 /**
  * Convert an instance of Bin to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

