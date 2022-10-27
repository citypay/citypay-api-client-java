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
import com.citypay.client.model.PaylinkAttachmentRequest;
import com.citypay.client.model.PaylinkEmailNotificationPath;
import com.citypay.client.model.PaylinkSMSNotificationPath;
import com.citypay.client.model.PaylinkTokenRequestModel;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * PaylinkBillPaymentTokenRequest
 */
public class PaylinkBillPaymentTokenRequest {
  public static final String SERIALIZED_NAME_ATTACHMENTS = "attachments";
  @SerializedName(SERIALIZED_NAME_ATTACHMENTS)
  private List<PaylinkAttachmentRequest> attachments = null;

  public static final String SERIALIZED_NAME_DESCRIPTOR = "descriptor";
  @SerializedName(SERIALIZED_NAME_DESCRIPTOR)
  private String descriptor;

  public static final String SERIALIZED_NAME_DUE = "due";
  @SerializedName(SERIALIZED_NAME_DUE)
  private LocalDate due;

  public static final String SERIALIZED_NAME_EMAIL_NOTIFICATION_PATH = "email_notification_path";
  @SerializedName(SERIALIZED_NAME_EMAIL_NOTIFICATION_PATH)
  private PaylinkEmailNotificationPath emailNotificationPath;

  public static final String SERIALIZED_NAME_REQUEST = "request";
  @SerializedName(SERIALIZED_NAME_REQUEST)
  private PaylinkTokenRequestModel request;

  public static final String SERIALIZED_NAME_SMS_NOTIFICATION_PATH = "sms_notification_path";
  @SerializedName(SERIALIZED_NAME_SMS_NOTIFICATION_PATH)
  private PaylinkSMSNotificationPath smsNotificationPath;


  public PaylinkBillPaymentTokenRequest attachments(List<PaylinkAttachmentRequest> attachments) {
    
    this.attachments = attachments;
    return this;
  }

  public PaylinkBillPaymentTokenRequest addAttachmentsItem(PaylinkAttachmentRequest attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * Get attachments
   * @return attachments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<PaylinkAttachmentRequest> getAttachments() {
    return attachments;
  }


  public void setAttachments(List<PaylinkAttachmentRequest> attachments) {
    this.attachments = attachments;
  }


  public PaylinkBillPaymentTokenRequest descriptor(String descriptor) {
    
    this.descriptor = descriptor;
    return this;
  }

   /**
   * A descriptor for the bill payment used to describe what the payment request is for for instance \&quot;Invoice\&quot;.  The descriptor can be used as descriptive text on emails or the payment page. For instance an invoice may have a button saying \&quot;View Invoice\&quot; or an email may say \&quot;to pay your Invoice online\&quot;. 
   * @return descriptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A descriptor for the bill payment used to describe what the payment request is for for instance \"Invoice\".  The descriptor can be used as descriptive text on emails or the payment page. For instance an invoice may have a button saying \"View Invoice\" or an email may say \"to pay your Invoice online\". ")

  public String getDescriptor() {
    return descriptor;
  }


  public void setDescriptor(String descriptor) {
    this.descriptor = descriptor;
  }


  public PaylinkBillPaymentTokenRequest due(LocalDate due) {
    
    this.due = due;
    return this;
  }

   /**
   * A date that the invoice is due. This can be displayed on the payment page.
   * @return due
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A date that the invoice is due. This can be displayed on the payment page.")

  public LocalDate getDue() {
    return due;
  }


  public void setDue(LocalDate due) {
    this.due = due;
  }


  public PaylinkBillPaymentTokenRequest emailNotificationPath(PaylinkEmailNotificationPath emailNotificationPath) {
    
    this.emailNotificationPath = emailNotificationPath;
    return this;
  }

   /**
   * Get emailNotificationPath
   * @return emailNotificationPath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaylinkEmailNotificationPath getEmailNotificationPath() {
    return emailNotificationPath;
  }


  public void setEmailNotificationPath(PaylinkEmailNotificationPath emailNotificationPath) {
    this.emailNotificationPath = emailNotificationPath;
  }


  public PaylinkBillPaymentTokenRequest request(PaylinkTokenRequestModel request) {
    
    this.request = request;
    return this;
  }

   /**
   * Get request
   * @return request
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public PaylinkTokenRequestModel getRequest() {
    return request;
  }


  public void setRequest(PaylinkTokenRequestModel request) {
    this.request = request;
  }


  public PaylinkBillPaymentTokenRequest smsNotificationPath(PaylinkSMSNotificationPath smsNotificationPath) {
    
    this.smsNotificationPath = smsNotificationPath;
    return this;
  }

   /**
   * Get smsNotificationPath
   * @return smsNotificationPath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaylinkSMSNotificationPath getSmsNotificationPath() {
    return smsNotificationPath;
  }


  public void setSmsNotificationPath(PaylinkSMSNotificationPath smsNotificationPath) {
    this.smsNotificationPath = smsNotificationPath;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaylinkBillPaymentTokenRequest paylinkBillPaymentTokenRequest = (PaylinkBillPaymentTokenRequest) o;
    return Objects.equals(this.attachments, paylinkBillPaymentTokenRequest.attachments) &&
        Objects.equals(this.descriptor, paylinkBillPaymentTokenRequest.descriptor) &&
        Objects.equals(this.due, paylinkBillPaymentTokenRequest.due) &&
        Objects.equals(this.emailNotificationPath, paylinkBillPaymentTokenRequest.emailNotificationPath) &&
        Objects.equals(this.request, paylinkBillPaymentTokenRequest.request) &&
        Objects.equals(this.smsNotificationPath, paylinkBillPaymentTokenRequest.smsNotificationPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachments, descriptor, due, emailNotificationPath, request, smsNotificationPath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaylinkBillPaymentTokenRequest {\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    descriptor: ").append(toIndentedString(descriptor)).append("\n");
    sb.append("    due: ").append(toIndentedString(due)).append("\n");
    sb.append("    emailNotificationPath: ").append(toIndentedString(emailNotificationPath)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    smsNotificationPath: ").append(toIndentedString(smsNotificationPath)).append("\n");
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

