/*
 * CityPay Payment API
 *  This CityPay API is a HTTP RESTful payment API used for direct server to server transactional processing. It provides a number of payment mechanisms including: Internet, MOTO, Continuous Authority transaction processing, 3-D Secure decision handling using RFA Secure, Authorisation, Refunding, Pre-Authorisation, Cancellation/Voids and Completion processing. The API is also capable of tokinsed payments using Card Holder Accounts.  ## Compliance and Security <aside class=\"notice\">   Before we begin a reminder that your application will need to adhere to PCI-DSS standards to operate safely   and to meet requirements set out by Visa and MasterCard and the PCI Security Standards Council including: </aside>  * Data must be collected using TLS version 1.2 using [strong cryptography](#enabled-tls-ciphers). We will not accept calls to our API at   lower grade encryption levels. We regularly scan our TLS endpoints for vulnerabilities and perform TLS assessments   as part of our compliance program. * The application must not store sensitive card holder data (CHD) such as the card security code (CSC) or   primary access number (PAN) * The application must not display the full card number on receipts, it is recommended to mask the PAN   and show the last 4 digits. The API will return this for you for ease of receipt creation * If you are developing a website, you will be required to perform regular scans on the network where you host the   application to meet your compliance obligations * You will be required to be PCI Compliant and the application must adhere to the security standard. Further information   is available from [https://www.pcisecuritystandards.org/](https://www.pcisecuritystandards.org/) * The API verifies that the request is for a valid account and originates from a trusted source using the remote IP   address. Our application firewalls analyse data that may be an attempt to break a large number of security common   security vulnerabilities. 
 *
 * The version of the OpenAPI document: 6.0.0
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

/**
 * AirlineSegment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-08-04T15:49:38.101Z[GMT]")
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


  public AirlineSegment arrivalLocationCode(String arrivalLocationCode) {
    
    this.arrivalLocationCode = arrivalLocationCode;
    return this;
  }

   /**
   * A standard airline routing code (airport code or location identifier) applicable to the arrival portion of this segment. 
   * @return arrivalLocationCode
  **/
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
  @ApiModelProperty(example = "Sat Aug 01 00:00:00 GMT 2020", required = true, value = "The Departure Date for the travel segment in ISO Date Format (yyyy-MM-dd).")

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
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

