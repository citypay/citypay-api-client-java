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

/**
 * RegisterCard
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-08-04T15:49:38.101Z[GMT]")
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


  public RegisterCard cardnumber(String cardnumber) {
    
    this.cardnumber = cardnumber;
    return this;
  }

   /**
   * The primary number of the card.
   * @return cardnumber
  **/
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
  @ApiModelProperty(example = "2023", required = true, value = "The expiry year of the card.")

  public Integer getExpyear() {
    return expyear;
  }


  public void setExpyear(Integer expyear) {
    this.expyear = expyear;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
        Objects.equals(this.expyear, registerCard.expyear);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardnumber, _default, expmonth, expyear);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegisterCard {\n");
    sb.append("    cardnumber: ").append(toIndentedString(cardnumber)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    expmonth: ").append(toIndentedString(expmonth)).append("\n");
    sb.append("    expyear: ").append(toIndentedString(expyear)).append("\n");
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

