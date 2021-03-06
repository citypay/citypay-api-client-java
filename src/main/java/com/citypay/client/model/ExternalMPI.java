/*
 * CityPay Payment API
 *  This CityPay API is a HTTP RESTful payment API used for direct server to server transactional processing. It provides a number of payment mechanisms including: Internet, MOTO, Continuous Authority transaction processing, 3-D Secure decision handling using RFA Secure, Authorisation, Refunding, Pre-Authorisation, Cancellation/Voids and Completion processing. The API is also capable of tokinsed payments using Card Holder Accounts.  ## Compliance and Security <aside class=\"notice\">   Before we begin a reminder that your application will need to adhere to PCI-DSS standards to operate safely   and to meet requirements set out by Visa and MasterCard and the PCI Security Standards Council including: </aside>  * Data must be collected using TLS version 1.2 using [strong cryptography](#enabled-tls-ciphers). We will not accept calls to our API at   lower grade encryption levels. We regularly scan our TLS endpoints for vulnerabilities and perform TLS assessments   as part of our compliance program. * The application must not store sensitive card holder data (CHD) such as the card security code (CSC) or   primary access number (PAN) * The application must not display the full card number on receipts, it is recommended to mask the PAN   and show the last 4 digits. The API will return this for you for ease of receipt creation * If you are developing a website, you will be required to perform regular scans on the network where you host the   application to meet your compliance obligations * You will be required to be PCI Compliant and the application must adhere to the security standard. Further information   is available from [https://www.pcisecuritystandards.org/](https://www.pcisecuritystandards.org/) * The API verifies that the request is for a valid account and originates from a trusted source using the remote IP   address. Our application firewalls analyse data that may be an attempt to break a large number of security common   security vulnerabilities. 
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


  public ExternalMPI authenResult(String authenResult) {
    
    this.authenResult = authenResult;
    return this;
  }

   /**
   * The authentication result available from the MPI.
   * @return authenResult
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The authentication result available from the MPI.")

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
  @ApiModelProperty(value = "A value determining the cardholder verification value supplied by the card scheme.")

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
  @ApiModelProperty(value = "The obtained e-commerce indicator from the MPI.")

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
  @ApiModelProperty(value = "A value determining whether the card holder was enrolled.")

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
  @ApiModelProperty(value = "The XID used for processing with the MPI.")

  public String getXid() {
    return xid;
  }


  public void setXid(String xid) {
    this.xid = xid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

