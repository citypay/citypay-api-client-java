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
  @ApiModelProperty(value = "whether the address is forced as mandatory.")

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
  @ApiModelProperty(example = "true", value = "specify the form autocomplete setting, default to on. If set to off the UI will set autocomplete=\"off\" on the form level and prevent elements from adding it.")

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
  @ApiModelProperty(value = "the logical ordering of the ui groups.")

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
  @ApiModelProperty(value = "whether the postcode is forced as mandatory.")

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
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaylinkUI
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PaylinkUI.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaylinkUI is not found in the empty JSON string", PaylinkUI.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PaylinkUI.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PaylinkUI` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
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
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
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

