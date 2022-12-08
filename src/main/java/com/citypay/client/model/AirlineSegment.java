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
import java.time.LocalDate;

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
 * AirlineSegment
 */
public class AirlineSegment {
  public static final String SERIALIZED_NAME_ARRIVAL_LOCATION_CODE = "arrival_location_code";
  @SerializedName(SERIALIZED_NAME_ARRIVAL_LOCATION_CODE)
  private String arrivalLocationCode;

  public static final String SERIALIZED_NAME_CARRIER_CODE = "carrier_code";
  @SerializedName(SERIALIZED_NAME_CARRIER_CODE)
  private String carrierCode;

  public static final String SERIALIZED_NAME_CLASS_SERVICE_CODE = "class_service_code";
  @SerializedName(SERIALIZED_NAME_CLASS_SERVICE_CODE)
  private String classServiceCode;

  public static final String SERIALIZED_NAME_DEPARTURE_DATE = "departure_date";
  @SerializedName(SERIALIZED_NAME_DEPARTURE_DATE)
  private LocalDate departureDate;

  public static final String SERIALIZED_NAME_DEPARTURE_LOCATION_CODE = "departure_location_code";
  @SerializedName(SERIALIZED_NAME_DEPARTURE_LOCATION_CODE)
  private String departureLocationCode;

  public static final String SERIALIZED_NAME_FLIGHT_NUMBER = "flight_number";
  @SerializedName(SERIALIZED_NAME_FLIGHT_NUMBER)
  private String flightNumber;

  public static final String SERIALIZED_NAME_SEGMENT_FARE = "segment_fare";
  @SerializedName(SERIALIZED_NAME_SEGMENT_FARE)
  private Integer segmentFare;

  public static final String SERIALIZED_NAME_STOP_OVER_INDICATOR = "stop_over_indicator";
  @SerializedName(SERIALIZED_NAME_STOP_OVER_INDICATOR)
  private String stopOverIndicator;

  public AirlineSegment() {
  }

  public AirlineSegment arrivalLocationCode(String arrivalLocationCode) {
    
    this.arrivalLocationCode = arrivalLocationCode;
    return this;
  }

   /**
   * A standard airline routing code (airport code or location identifier) applicable to the arrival portion of this segment. 
   * @return arrivalLocationCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "SOU", required = true, value = "A standard airline routing code (airport code or location identifier) applicable to the arrival portion of this segment. ")

  public String getArrivalLocationCode() {
    return arrivalLocationCode;
  }


  public void setArrivalLocationCode(String arrivalLocationCode) {
    this.arrivalLocationCode = arrivalLocationCode;
  }


  public AirlineSegment carrierCode(String carrierCode) {
    
    this.carrierCode = carrierCode;
    return this;
  }

   /**
   * This field contains the two character airline designator code (air carrier code or airline code) that corresponds to the airline carrier applicable for up to four flight segments of this trip itinerary. 
   * @return carrierCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "ZZ", required = true, value = "This field contains the two character airline designator code (air carrier code or airline code) that corresponds to the airline carrier applicable for up to four flight segments of this trip itinerary. ")

  public String getCarrierCode() {
    return carrierCode;
  }


  public void setCarrierCode(String carrierCode) {
    this.carrierCode = carrierCode;
  }


  public AirlineSegment classServiceCode(String classServiceCode) {
    
    this.classServiceCode = classServiceCode;
    return this;
  }

   /**
   * This field contains a code that corresponds to the fare class (A, B, C, D, Premium, Discounted, etc.) within the overall class of service (e.g., First Class, Business, Economy) applicable to this travel segment, as specified in the IATA Standard Code allocation table. 
   * @return classServiceCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "CC", required = true, value = "This field contains a code that corresponds to the fare class (A, B, C, D, Premium, Discounted, etc.) within the overall class of service (e.g., First Class, Business, Economy) applicable to this travel segment, as specified in the IATA Standard Code allocation table. ")

  public String getClassServiceCode() {
    return classServiceCode;
  }


  public void setClassServiceCode(String classServiceCode) {
    this.classServiceCode = classServiceCode;
  }


  public AirlineSegment departureDate(LocalDate departureDate) {
    
    this.departureDate = departureDate;
    return this;
  }

   /**
   * The Departure Date for the travel segment in ISO Date Format (yyyy-MM-dd).
   * @return departureDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Sat Aug 01 00:00:00 UTC 2020", required = true, value = "The Departure Date for the travel segment in ISO Date Format (yyyy-MM-dd).")

  public LocalDate getDepartureDate() {
    return departureDate;
  }


  public void setDepartureDate(LocalDate departureDate) {
    this.departureDate = departureDate;
  }


  public AirlineSegment departureLocationCode(String departureLocationCode) {
    
    this.departureLocationCode = departureLocationCode;
    return this;
  }

   /**
   * A standard airline routing code (airport code or location identifier) applicable to the departure portion of this segment. 
   * @return departureLocationCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "JER", value = "A standard airline routing code (airport code or location identifier) applicable to the departure portion of this segment. ")

  public String getDepartureLocationCode() {
    return departureLocationCode;
  }


  public void setDepartureLocationCode(String departureLocationCode) {
    this.departureLocationCode = departureLocationCode;
  }


  public AirlineSegment flightNumber(String flightNumber) {
    
    this.flightNumber = flightNumber;
    return this;
  }

   /**
   * This field contains the carrier-assigned Flight Number for this travel segment.
   * @return flightNumber
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "772", required = true, value = "This field contains the carrier-assigned Flight Number for this travel segment.")

  public String getFlightNumber() {
    return flightNumber;
  }


  public void setFlightNumber(String flightNumber) {
    this.flightNumber = flightNumber;
  }


  public AirlineSegment segmentFare(Integer segmentFare) {
    
    this.segmentFare = segmentFare;
    return this;
  }

   /**
   * This field contains the total Fare for this travel segment.
   * @return segmentFare
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "7500", value = "This field contains the total Fare for this travel segment.")

  public Integer getSegmentFare() {
    return segmentFare;
  }


  public void setSegmentFare(Integer segmentFare) {
    this.segmentFare = segmentFare;
  }


  public AirlineSegment stopOverIndicator(String stopOverIndicator) {
    
    this.stopOverIndicator = stopOverIndicator;
    return this;
  }

   /**
   * O &#x3D; Stopover allowed, X &#x3D; Stopover not allowed.
   * @return stopOverIndicator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "O = Stopover allowed, X = Stopover not allowed.")

  public String getStopOverIndicator() {
    return stopOverIndicator;
  }


  public void setStopOverIndicator(String stopOverIndicator) {
    this.stopOverIndicator = stopOverIndicator;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AirlineSegment airlineSegment = (AirlineSegment) o;
    return Objects.equals(this.arrivalLocationCode, airlineSegment.arrivalLocationCode) &&
        Objects.equals(this.carrierCode, airlineSegment.carrierCode) &&
        Objects.equals(this.classServiceCode, airlineSegment.classServiceCode) &&
        Objects.equals(this.departureDate, airlineSegment.departureDate) &&
        Objects.equals(this.departureLocationCode, airlineSegment.departureLocationCode) &&
        Objects.equals(this.flightNumber, airlineSegment.flightNumber) &&
        Objects.equals(this.segmentFare, airlineSegment.segmentFare) &&
        Objects.equals(this.stopOverIndicator, airlineSegment.stopOverIndicator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arrivalLocationCode, carrierCode, classServiceCode, departureDate, departureLocationCode, flightNumber, segmentFare, stopOverIndicator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AirlineSegment {\n");
    sb.append("    arrivalLocationCode: ").append(toIndentedString(arrivalLocationCode)).append("\n");
    sb.append("    carrierCode: ").append(toIndentedString(carrierCode)).append("\n");
    sb.append("    classServiceCode: ").append(toIndentedString(classServiceCode)).append("\n");
    sb.append("    departureDate: ").append(toIndentedString(departureDate)).append("\n");
    sb.append("    departureLocationCode: ").append(toIndentedString(departureLocationCode)).append("\n");
    sb.append("    flightNumber: ").append(toIndentedString(flightNumber)).append("\n");
    sb.append("    segmentFare: ").append(toIndentedString(segmentFare)).append("\n");
    sb.append("    stopOverIndicator: ").append(toIndentedString(stopOverIndicator)).append("\n");
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
    openapiFields.add("arrival_location_code");
    openapiFields.add("carrier_code");
    openapiFields.add("class_service_code");
    openapiFields.add("departure_date");
    openapiFields.add("departure_location_code");
    openapiFields.add("flight_number");
    openapiFields.add("segment_fare");
    openapiFields.add("stop_over_indicator");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("arrival_location_code");
    openapiRequiredFields.add("carrier_code");
    openapiRequiredFields.add("class_service_code");
    openapiRequiredFields.add("departure_date");
    openapiRequiredFields.add("flight_number");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AirlineSegment
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AirlineSegment.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AirlineSegment is not found in the empty JSON string", AirlineSegment.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AirlineSegment.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AirlineSegment` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AirlineSegment.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("arrival_location_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `arrival_location_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("arrival_location_code").toString()));
      }
      if (!jsonObj.get("carrier_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `carrier_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("carrier_code").toString()));
      }
      if (!jsonObj.get("class_service_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `class_service_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("class_service_code").toString()));
      }
      if ((jsonObj.get("departure_location_code") != null && !jsonObj.get("departure_location_code").isJsonNull()) && !jsonObj.get("departure_location_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `departure_location_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("departure_location_code").toString()));
      }
      if (!jsonObj.get("flight_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `flight_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("flight_number").toString()));
      }
      if ((jsonObj.get("stop_over_indicator") != null && !jsonObj.get("stop_over_indicator").isJsonNull()) && !jsonObj.get("stop_over_indicator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stop_over_indicator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stop_over_indicator").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AirlineSegment.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AirlineSegment' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AirlineSegment> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AirlineSegment.class));

       return (TypeAdapter<T>) new TypeAdapter<AirlineSegment>() {
           @Override
           public void write(JsonWriter out, AirlineSegment value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AirlineSegment read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AirlineSegment given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AirlineSegment
  * @throws IOException if the JSON string is invalid with respect to AirlineSegment
  */
  public static AirlineSegment fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AirlineSegment.class);
  }

 /**
  * Convert an instance of AirlineSegment to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

