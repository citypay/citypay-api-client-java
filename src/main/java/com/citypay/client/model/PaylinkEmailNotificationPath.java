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
import java.util.ArrayList;
import java.util.List;

/**
 * PaylinkEmailNotificationPath
 */
public class PaylinkEmailNotificationPath {
  public static final String SERIALIZED_NAME_BCC = "bcc";
  @SerializedName(SERIALIZED_NAME_BCC)
  private List<String> bcc = null;

  public static final String SERIALIZED_NAME_CC = "cc";
  @SerializedName(SERIALIZED_NAME_CC)
  private List<String> cc = null;

  public static final String SERIALIZED_NAME_REPLY_TO = "reply_to";
  @SerializedName(SERIALIZED_NAME_REPLY_TO)
  private List<String> replyTo = null;

  public static final String SERIALIZED_NAME_TEMPLATE = "template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  private String template;

  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  private List<String> to = new ArrayList<>();


  public PaylinkEmailNotificationPath bcc(List<String> bcc) {
    
    this.bcc = bcc;
    return this;
  }

  public PaylinkEmailNotificationPath addBccItem(String bccItem) {
    if (this.bcc == null) {
      this.bcc = new ArrayList<>();
    }
    this.bcc.add(bccItem);
    return this;
  }

   /**
   * Get bcc
   * @return bcc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getBcc() {
    return bcc;
  }


  public void setBcc(List<String> bcc) {
    this.bcc = bcc;
  }


  public PaylinkEmailNotificationPath cc(List<String> cc) {
    
    this.cc = cc;
    return this;
  }

  public PaylinkEmailNotificationPath addCcItem(String ccItem) {
    if (this.cc == null) {
      this.cc = new ArrayList<>();
    }
    this.cc.add(ccItem);
    return this;
  }

   /**
   * Get cc
   * @return cc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getCc() {
    return cc;
  }


  public void setCc(List<String> cc) {
    this.cc = cc;
  }


  public PaylinkEmailNotificationPath replyTo(List<String> replyTo) {
    
    this.replyTo = replyTo;
    return this;
  }

  public PaylinkEmailNotificationPath addReplyToItem(String replyToItem) {
    if (this.replyTo == null) {
      this.replyTo = new ArrayList<>();
    }
    this.replyTo.add(replyToItem);
    return this;
  }

   /**
   * Get replyTo
   * @return replyTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getReplyTo() {
    return replyTo;
  }


  public void setReplyTo(List<String> replyTo) {
    this.replyTo = replyTo;
  }


  public PaylinkEmailNotificationPath template(String template) {
    
    this.template = template;
    return this;
  }

   /**
   * An optional template name to use a template other than the default.
   * @return template
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An optional template name to use a template other than the default.")

  public String getTemplate() {
    return template;
  }


  public void setTemplate(String template) {
    this.template = template;
  }


  public PaylinkEmailNotificationPath to(List<String> to) {
    
    this.to = to;
    return this;
  }

  public PaylinkEmailNotificationPath addToItem(String toItem) {
    this.to.add(toItem);
    return this;
  }

   /**
   * Get to
   * @return to
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getTo() {
    return to;
  }


  public void setTo(List<String> to) {
    this.to = to;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaylinkEmailNotificationPath paylinkEmailNotificationPath = (PaylinkEmailNotificationPath) o;
    return Objects.equals(this.bcc, paylinkEmailNotificationPath.bcc) &&
        Objects.equals(this.cc, paylinkEmailNotificationPath.cc) &&
        Objects.equals(this.replyTo, paylinkEmailNotificationPath.replyTo) &&
        Objects.equals(this.template, paylinkEmailNotificationPath.template) &&
        Objects.equals(this.to, paylinkEmailNotificationPath.to);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bcc, cc, replyTo, template, to);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaylinkEmailNotificationPath {\n");
    sb.append("    bcc: ").append(toIndentedString(bcc)).append("\n");
    sb.append("    cc: ").append(toIndentedString(cc)).append("\n");
    sb.append("    replyTo: ").append(toIndentedString(replyTo)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
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

