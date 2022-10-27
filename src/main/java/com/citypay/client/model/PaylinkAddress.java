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

/**
 * PaylinkAddress
 */
public class PaylinkAddress {
  public static final String SERIALIZED_NAME_ADDRESS1 = "address1";
  @SerializedName(SERIALIZED_NAME_ADDRESS1)
  private String address1;

  public static final String SERIALIZED_NAME_ADDRESS2 = "address2";
  @SerializedName(SERIALIZED_NAME_ADDRESS2)
  private String address2;

  public static final String SERIALIZED_NAME_ADDRESS3 = "address3";
  @SerializedName(SERIALIZED_NAME_ADDRESS3)
  private String address3;

  public static final String SERIALIZED_NAME_AREA = "area";
  @SerializedName(SERIALIZED_NAME_AREA)
  private String area;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  public static final String SERIALIZED_NAME_POSTCODE = "postcode";
  @SerializedName(SERIALIZED_NAME_POSTCODE)
  private String postcode;


  public PaylinkAddress address1(String address1) {
    
    this.address1 = address1;
    return this;
  }

   /**
   * The first line of the address.
   * @return address1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "79 Parliament St", value = "The first line of the address.")

  public String getAddress1() {
    return address1;
  }


  public void setAddress1(String address1) {
    this.address1 = address1;
  }


  public PaylinkAddress address2(String address2) {
    
    this.address2 = address2;
    return this;
  }

   /**
   * The second line of the address.
   * @return address2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Westminster", value = "The second line of the address.")

  public String getAddress2() {
    return address2;
  }


  public void setAddress2(String address2) {
    this.address2 = address2;
  }


  public PaylinkAddress address3(String address3) {
    
    this.address3 = address3;
    return this;
  }

   /**
   * The third line of the address.
   * @return address3
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The third line of the address.")

  public String getAddress3() {
    return address3;
  }


  public void setAddress3(String address3) {
    this.address3 = address3;
  }


  public PaylinkAddress area(String area) {
    
    this.area = area;
    return this;
  }

   /**
   * The area such as city, department, town or parish.
   * @return area
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "London", value = "The area such as city, department, town or parish.")

  public String getArea() {
    return area;
  }


  public void setArea(String area) {
    this.area = area;
  }


  public PaylinkAddress country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * The country code in ISO 3166 format. The country code should be an ISO-3166 2 or 3 digit country code.
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "GB", value = "The country code in ISO 3166 format. The country code should be an ISO-3166 2 or 3 digit country code.")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public PaylinkAddress label(String label) {
    
    this.label = label;
    return this;
  }

   /**
   * A label for the address such as Head Office, Home Address.
   * @return label
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Head Office", value = "A label for the address such as Head Office, Home Address.")

  public String getLabel() {
    return label;
  }


  public void setLabel(String label) {
    this.label = label;
  }


  public PaylinkAddress postcode(String postcode) {
    
    this.postcode = postcode;
    return this;
  }

   /**
   * The postcode or zip code of the address.
   * @return postcode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "L1 789", value = "The postcode or zip code of the address.")

  public String getPostcode() {
    return postcode;
  }


  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaylinkAddress paylinkAddress = (PaylinkAddress) o;
    return Objects.equals(this.address1, paylinkAddress.address1) &&
        Objects.equals(this.address2, paylinkAddress.address2) &&
        Objects.equals(this.address3, paylinkAddress.address3) &&
        Objects.equals(this.area, paylinkAddress.area) &&
        Objects.equals(this.country, paylinkAddress.country) &&
        Objects.equals(this.label, paylinkAddress.label) &&
        Objects.equals(this.postcode, paylinkAddress.postcode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address1, address2, address3, area, country, label, postcode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaylinkAddress {\n");
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    address3: ").append(toIndentedString(address3)).append("\n");
    sb.append("    area: ").append(toIndentedString(area)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    postcode: ").append(toIndentedString(postcode)).append("\n");
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

}
