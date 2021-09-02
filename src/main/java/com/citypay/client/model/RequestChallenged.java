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
 * RequestChallenged
 */
public class RequestChallenged {
  public static final String SERIALIZED_NAME_ACS_URL = "acs_url";
  @SerializedName(SERIALIZED_NAME_ACS_URL)
  private String acsUrl;

  public static final String SERIALIZED_NAME_CREQ = "creq";
  @SerializedName(SERIALIZED_NAME_CREQ)
  private String creq;

  public static final String SERIALIZED_NAME_MERCHANTID = "merchantid";
  @SerializedName(SERIALIZED_NAME_MERCHANTID)
  private Integer merchantid;

  public static final String SERIALIZED_NAME_THREEDSERVER_TRANS_ID = "threedserver_trans_id";
  @SerializedName(SERIALIZED_NAME_THREEDSERVER_TRANS_ID)
  private String threedserverTransId;

  public static final String SERIALIZED_NAME_TRANSNO = "transno";
  @SerializedName(SERIALIZED_NAME_TRANSNO)
  private Integer transno;


  public RequestChallenged acsUrl(String acsUrl) {
    
    this.acsUrl = acsUrl;
    return this;
  }

   /**
   * The url of the Access Control Server (ACS) to forward the user to. 
   * @return acsUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://acs.cardissuer.com/3dsv1", value = "The url of the Access Control Server (ACS) to forward the user to. ")

  public String getAcsUrl() {
    return acsUrl;
  }


  public void setAcsUrl(String acsUrl) {
    this.acsUrl = acsUrl;
  }


  public RequestChallenged creq(String creq) {
    
    this.creq = creq;
    return this;
  }

   /**
   * The challenge request data which is encoded for usage by the ACS.
   * @return creq
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The challenge request data which is encoded for usage by the ACS.")

  public String getCreq() {
    return creq;
  }


  public void setCreq(String creq) {
    this.creq = creq;
  }


  public RequestChallenged merchantid(Integer merchantid) {
    
    this.merchantid = merchantid;
    return this;
  }

   /**
   * The merchant id that processed this transaction.
   * @return merchantid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "11223344", value = "The merchant id that processed this transaction.")

  public Integer getMerchantid() {
    return merchantid;
  }


  public void setMerchantid(Integer merchantid) {
    this.merchantid = merchantid;
  }


  public RequestChallenged threedserverTransId(String threedserverTransId) {
    
    this.threedserverTransId = threedserverTransId;
    return this;
  }

   /**
   * The 3DSv2 trans id reference for the challenge process. May be used to create the ThreeDSSessionData value to send to the ACS.
   * @return threedserverTransId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The 3DSv2 trans id reference for the challenge process. May be used to create the ThreeDSSessionData value to send to the ACS.")

  public String getThreedserverTransId() {
    return threedserverTransId;
  }


  public void setThreedserverTransId(String threedserverTransId) {
    this.threedserverTransId = threedserverTransId;
  }


  public RequestChallenged transno(Integer transno) {
    
    this.transno = transno;
    return this;
  }

   /**
   * The transaction number for the challenge, ordered incrementally from 1 for every merchant_id. 
   * @return transno
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "78416", value = "The transaction number for the challenge, ordered incrementally from 1 for every merchant_id. ")

  public Integer getTransno() {
    return transno;
  }


  public void setTransno(Integer transno) {
    this.transno = transno;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestChallenged requestChallenged = (RequestChallenged) o;
    return Objects.equals(this.acsUrl, requestChallenged.acsUrl) &&
        Objects.equals(this.creq, requestChallenged.creq) &&
        Objects.equals(this.merchantid, requestChallenged.merchantid) &&
        Objects.equals(this.threedserverTransId, requestChallenged.threedserverTransId) &&
        Objects.equals(this.transno, requestChallenged.transno);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acsUrl, creq, merchantid, threedserverTransId, transno);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestChallenged {\n");
    sb.append("    acsUrl: ").append(toIndentedString(acsUrl)).append("\n");
    sb.append("    creq: ").append(toIndentedString(creq)).append("\n");
    sb.append("    merchantid: ").append(toIndentedString(merchantid)).append("\n");
    sb.append("    threedserverTransId: ").append(toIndentedString(threedserverTransId)).append("\n");
    sb.append("    transno: ").append(toIndentedString(transno)).append("\n");
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

