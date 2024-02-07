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
import com.citypay.client.model.PaylinkStateEvent;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * PaylinkTokenStatus
 */
public class PaylinkTokenStatus {
  public static final String SERIALIZED_NAME_AMOUNT_PAID = "amount_paid";
  @SerializedName(SERIALIZED_NAME_AMOUNT_PAID)
  private Integer amountPaid;

  public static final String SERIALIZED_NAME_AUTH_CODE = "auth_code";
  @SerializedName(SERIALIZED_NAME_AUTH_CODE)
  private String authCode;

  public static final String SERIALIZED_NAME_CARD = "card";
  @SerializedName(SERIALIZED_NAME_CARD)
  private String card;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_DATETIME = "datetime";
  @SerializedName(SERIALIZED_NAME_DATETIME)
  private OffsetDateTime datetime;

  public static final String SERIALIZED_NAME_IDENTIFIER = "identifier";
  @SerializedName(SERIALIZED_NAME_IDENTIFIER)
  private String identifier;

  public static final String SERIALIZED_NAME_IS_ATTACHMENT = "is_attachment";
  @SerializedName(SERIALIZED_NAME_IS_ATTACHMENT)
  private Boolean isAttachment;

  public static final String SERIALIZED_NAME_IS_CANCELLED = "is_cancelled";
  @SerializedName(SERIALIZED_NAME_IS_CANCELLED)
  private Boolean isCancelled;

  public static final String SERIALIZED_NAME_IS_CLOSED = "is_closed";
  @SerializedName(SERIALIZED_NAME_IS_CLOSED)
  private Boolean isClosed;

  public static final String SERIALIZED_NAME_IS_CUSTOMER_RECEIPT_EMAIL_SENT = "is_customer_receipt_email_sent";
  @SerializedName(SERIALIZED_NAME_IS_CUSTOMER_RECEIPT_EMAIL_SENT)
  private Boolean isCustomerReceiptEmailSent;

  public static final String SERIALIZED_NAME_IS_EMAIL_SENT = "is_email_sent";
  @SerializedName(SERIALIZED_NAME_IS_EMAIL_SENT)
  private Boolean isEmailSent;

  public static final String SERIALIZED_NAME_IS_EXPIRED = "is_expired";
  @SerializedName(SERIALIZED_NAME_IS_EXPIRED)
  private Boolean isExpired;

  public static final String SERIALIZED_NAME_IS_FORM_VIEWED = "is_form_viewed";
  @SerializedName(SERIALIZED_NAME_IS_FORM_VIEWED)
  private Boolean isFormViewed;

  public static final String SERIALIZED_NAME_IS_MERCHANT_NOTIFICATION_EMAIL_SENT = "is_merchant_notification_email_sent";
  @SerializedName(SERIALIZED_NAME_IS_MERCHANT_NOTIFICATION_EMAIL_SENT)
  private Boolean isMerchantNotificationEmailSent;

  public static final String SERIALIZED_NAME_IS_OPEN_FOR_PAYMENT = "is_open_for_payment";
  @SerializedName(SERIALIZED_NAME_IS_OPEN_FOR_PAYMENT)
  private Boolean isOpenForPayment;

  public static final String SERIALIZED_NAME_IS_PAID = "is_paid";
  @SerializedName(SERIALIZED_NAME_IS_PAID)
  private Boolean isPaid;

  public static final String SERIALIZED_NAME_IS_PAYMENT_ATTEMPTED = "is_payment_attempted";
  @SerializedName(SERIALIZED_NAME_IS_PAYMENT_ATTEMPTED)
  private Boolean isPaymentAttempted;

  public static final String SERIALIZED_NAME_IS_POSTBACK_OK = "is_postback_ok";
  @SerializedName(SERIALIZED_NAME_IS_POSTBACK_OK)
  private Boolean isPostbackOk;

  public static final String SERIALIZED_NAME_IS_REQUEST_CHALLENGED = "is_request_challenged";
  @SerializedName(SERIALIZED_NAME_IS_REQUEST_CHALLENGED)
  private Boolean isRequestChallenged;

  public static final String SERIALIZED_NAME_IS_SMS_SENT = "is_sms_sent";
  @SerializedName(SERIALIZED_NAME_IS_SMS_SENT)
  private Boolean isSmsSent;

  public static final String SERIALIZED_NAME_IS_VALIDATED = "is_validated";
  @SerializedName(SERIALIZED_NAME_IS_VALIDATED)
  private Boolean isValidated;

  public static final String SERIALIZED_NAME_LAST_EVENT_DATE_TIME = "last_event_date_time";
  @SerializedName(SERIALIZED_NAME_LAST_EVENT_DATE_TIME)
  private OffsetDateTime lastEventDateTime;

  public static final String SERIALIZED_NAME_LAST_PAYMENT_RESULT = "last_payment_result";
  @SerializedName(SERIALIZED_NAME_LAST_PAYMENT_RESULT)
  private String lastPaymentResult;

  public static final String SERIALIZED_NAME_MID = "mid";
  @SerializedName(SERIALIZED_NAME_MID)
  private String mid;

  public static final String SERIALIZED_NAME_PAYMENT_ATTEMPTS_COUNT = "payment_attempts_count";
  @SerializedName(SERIALIZED_NAME_PAYMENT_ATTEMPTS_COUNT)
  private Integer paymentAttemptsCount;

  public static final String SERIALIZED_NAME_STATE_HISTORY = "state_history";
  @SerializedName(SERIALIZED_NAME_STATE_HISTORY)
  private List<PaylinkStateEvent> stateHistory;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_TRANS_NO = "trans_no";
  @SerializedName(SERIALIZED_NAME_TRANS_NO)
  private Integer transNo;

  public PaylinkTokenStatus() {
  }

  public PaylinkTokenStatus amountPaid(Integer amountPaid) {
    this.amountPaid = amountPaid;
    return this;
  }

   /**
   * the amount that has been paid against the session.
   * @return amountPaid
  **/
  @javax.annotation.Nullable
  public Integer getAmountPaid() {
    return amountPaid;
  }

  public void setAmountPaid(Integer amountPaid) {
    this.amountPaid = amountPaid;
  }


  public PaylinkTokenStatus authCode(String authCode) {
    this.authCode = authCode;
    return this;
  }

   /**
   * an authorisation code if the transaction was processed and isPaid is true.
   * @return authCode
  **/
  @javax.annotation.Nullable
  public String getAuthCode() {
    return authCode;
  }

  public void setAuthCode(String authCode) {
    this.authCode = authCode;
  }


  public PaylinkTokenStatus card(String card) {
    this.card = card;
    return this;
  }

   /**
   * a description of the card that was used for payment if paid.
   * @return card
  **/
  @javax.annotation.Nullable
  public String getCard() {
    return card;
  }

  public void setCard(String card) {
    this.card = card;
  }


  public PaylinkTokenStatus created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

   /**
   * the date and time that the session was created.
   * @return created
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public PaylinkTokenStatus datetime(OffsetDateTime datetime) {
    this.datetime = datetime;
    return this;
  }

   /**
   * the date and time of the current status.
   * @return datetime
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getDatetime() {
    return datetime;
  }

  public void setDatetime(OffsetDateTime datetime) {
    this.datetime = datetime;
  }


  public PaylinkTokenStatus identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * the merchant identifier, to help identifying the token.
   * @return identifier
  **/
  @javax.annotation.Nullable
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }


  public PaylinkTokenStatus isAttachment(Boolean isAttachment) {
    this.isAttachment = isAttachment;
    return this;
  }

   /**
   * true if an attachment exists.
   * @return isAttachment
  **/
  @javax.annotation.Nullable
  public Boolean isIsAttachment() {
    return isAttachment;
  }

  public void setIsAttachment(Boolean isAttachment) {
    this.isAttachment = isAttachment;
  }


  public PaylinkTokenStatus isCancelled(Boolean isCancelled) {
    this.isCancelled = isCancelled;
    return this;
  }

   /**
   * true if the session was cancelled either by the user or by a system request.
   * @return isCancelled
  **/
  @javax.annotation.Nullable
  public Boolean isIsCancelled() {
    return isCancelled;
  }

  public void setIsCancelled(Boolean isCancelled) {
    this.isCancelled = isCancelled;
  }


  public PaylinkTokenStatus isClosed(Boolean isClosed) {
    this.isClosed = isClosed;
    return this;
  }

   /**
   * true if the token has been closed.
   * @return isClosed
  **/
  @javax.annotation.Nullable
  public Boolean isIsClosed() {
    return isClosed;
  }

  public void setIsClosed(Boolean isClosed) {
    this.isClosed = isClosed;
  }


  public PaylinkTokenStatus isCustomerReceiptEmailSent(Boolean isCustomerReceiptEmailSent) {
    this.isCustomerReceiptEmailSent = isCustomerReceiptEmailSent;
    return this;
  }

   /**
   * true if a customer receipt has been sent.
   * @return isCustomerReceiptEmailSent
  **/
  @javax.annotation.Nullable
  public Boolean isIsCustomerReceiptEmailSent() {
    return isCustomerReceiptEmailSent;
  }

  public void setIsCustomerReceiptEmailSent(Boolean isCustomerReceiptEmailSent) {
    this.isCustomerReceiptEmailSent = isCustomerReceiptEmailSent;
  }


  public PaylinkTokenStatus isEmailSent(Boolean isEmailSent) {
    this.isEmailSent = isEmailSent;
    return this;
  }

   /**
   * true if an email was sent.
   * @return isEmailSent
  **/
  @javax.annotation.Nullable
  public Boolean isIsEmailSent() {
    return isEmailSent;
  }

  public void setIsEmailSent(Boolean isEmailSent) {
    this.isEmailSent = isEmailSent;
  }


  public PaylinkTokenStatus isExpired(Boolean isExpired) {
    this.isExpired = isExpired;
    return this;
  }

   /**
   * true if the session has expired.
   * @return isExpired
  **/
  @javax.annotation.Nullable
  public Boolean isIsExpired() {
    return isExpired;
  }

  public void setIsExpired(Boolean isExpired) {
    this.isExpired = isExpired;
  }


  public PaylinkTokenStatus isFormViewed(Boolean isFormViewed) {
    this.isFormViewed = isFormViewed;
    return this;
  }

   /**
   * true if the form was ever displayed to the addressee.
   * @return isFormViewed
  **/
  @javax.annotation.Nullable
  public Boolean isIsFormViewed() {
    return isFormViewed;
  }

  public void setIsFormViewed(Boolean isFormViewed) {
    this.isFormViewed = isFormViewed;
  }


  public PaylinkTokenStatus isMerchantNotificationEmailSent(Boolean isMerchantNotificationEmailSent) {
    this.isMerchantNotificationEmailSent = isMerchantNotificationEmailSent;
    return this;
  }

   /**
   * true if a merchant notification receipt was sent.
   * @return isMerchantNotificationEmailSent
  **/
  @javax.annotation.Nullable
  public Boolean isIsMerchantNotificationEmailSent() {
    return isMerchantNotificationEmailSent;
  }

  public void setIsMerchantNotificationEmailSent(Boolean isMerchantNotificationEmailSent) {
    this.isMerchantNotificationEmailSent = isMerchantNotificationEmailSent;
  }


  public PaylinkTokenStatus isOpenForPayment(Boolean isOpenForPayment) {
    this.isOpenForPayment = isOpenForPayment;
    return this;
  }

   /**
   * true if the session is still open for payment or false if it has been closed.
   * @return isOpenForPayment
  **/
  @javax.annotation.Nullable
  public Boolean isIsOpenForPayment() {
    return isOpenForPayment;
  }

  public void setIsOpenForPayment(Boolean isOpenForPayment) {
    this.isOpenForPayment = isOpenForPayment;
  }


  public PaylinkTokenStatus isPaid(Boolean isPaid) {
    this.isPaid = isPaid;
    return this;
  }

   /**
   * whether the session has been paid and therefore can be considered as complete.
   * @return isPaid
  **/
  @javax.annotation.Nullable
  public Boolean isIsPaid() {
    return isPaid;
  }

  public void setIsPaid(Boolean isPaid) {
    this.isPaid = isPaid;
  }


  public PaylinkTokenStatus isPaymentAttempted(Boolean isPaymentAttempted) {
    this.isPaymentAttempted = isPaymentAttempted;
    return this;
  }

   /**
   * true if payment has been attempted.
   * @return isPaymentAttempted
  **/
  @javax.annotation.Nullable
  public Boolean isIsPaymentAttempted() {
    return isPaymentAttempted;
  }

  public void setIsPaymentAttempted(Boolean isPaymentAttempted) {
    this.isPaymentAttempted = isPaymentAttempted;
  }


  public PaylinkTokenStatus isPostbackOk(Boolean isPostbackOk) {
    this.isPostbackOk = isPostbackOk;
    return this;
  }

   /**
   * true if a post back was executed successfully.
   * @return isPostbackOk
  **/
  @javax.annotation.Nullable
  public Boolean isIsPostbackOk() {
    return isPostbackOk;
  }

  public void setIsPostbackOk(Boolean isPostbackOk) {
    this.isPostbackOk = isPostbackOk;
  }


  public PaylinkTokenStatus isRequestChallenged(Boolean isRequestChallenged) {
    this.isRequestChallenged = isRequestChallenged;
    return this;
  }

   /**
   * true if the request has been challenged using 3-D Secure.
   * @return isRequestChallenged
  **/
  @javax.annotation.Nullable
  public Boolean isIsRequestChallenged() {
    return isRequestChallenged;
  }

  public void setIsRequestChallenged(Boolean isRequestChallenged) {
    this.isRequestChallenged = isRequestChallenged;
  }


  public PaylinkTokenStatus isSmsSent(Boolean isSmsSent) {
    this.isSmsSent = isSmsSent;
    return this;
  }

   /**
   * true if an SMS was sent.
   * @return isSmsSent
  **/
  @javax.annotation.Nullable
  public Boolean isIsSmsSent() {
    return isSmsSent;
  }

  public void setIsSmsSent(Boolean isSmsSent) {
    this.isSmsSent = isSmsSent;
  }


  public PaylinkTokenStatus isValidated(Boolean isValidated) {
    this.isValidated = isValidated;
    return this;
  }

   /**
   * whether the token generation was successfully validated.
   * @return isValidated
  **/
  @javax.annotation.Nullable
  public Boolean isIsValidated() {
    return isValidated;
  }

  public void setIsValidated(Boolean isValidated) {
    this.isValidated = isValidated;
  }


  public PaylinkTokenStatus lastEventDateTime(OffsetDateTime lastEventDateTime) {
    this.lastEventDateTime = lastEventDateTime;
    return this;
  }

   /**
   * the date and time that the session last had an event actioned against it.
   * @return lastEventDateTime
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getLastEventDateTime() {
    return lastEventDateTime;
  }

  public void setLastEventDateTime(OffsetDateTime lastEventDateTime) {
    this.lastEventDateTime = lastEventDateTime;
  }


  public PaylinkTokenStatus lastPaymentResult(String lastPaymentResult) {
    this.lastPaymentResult = lastPaymentResult;
    return this;
  }

   /**
   * the result of the last payment if one exists.
   * @return lastPaymentResult
  **/
  @javax.annotation.Nullable
  public String getLastPaymentResult() {
    return lastPaymentResult;
  }

  public void setLastPaymentResult(String lastPaymentResult) {
    this.lastPaymentResult = lastPaymentResult;
  }


  public PaylinkTokenStatus mid(String mid) {
    this.mid = mid;
    return this;
  }

   /**
   * identifies the merchant account.
   * @return mid
  **/
  @javax.annotation.Nullable
  public String getMid() {
    return mid;
  }

  public void setMid(String mid) {
    this.mid = mid;
  }


  public PaylinkTokenStatus paymentAttemptsCount(Integer paymentAttemptsCount) {
    this.paymentAttemptsCount = paymentAttemptsCount;
    return this;
  }

   /**
   * the number of attempts made to pay.
   * @return paymentAttemptsCount
  **/
  @javax.annotation.Nullable
  public Integer getPaymentAttemptsCount() {
    return paymentAttemptsCount;
  }

  public void setPaymentAttemptsCount(Integer paymentAttemptsCount) {
    this.paymentAttemptsCount = paymentAttemptsCount;
  }


  public PaylinkTokenStatus stateHistory(List<PaylinkStateEvent> stateHistory) {
    this.stateHistory = stateHistory;
    return this;
  }

  public PaylinkTokenStatus addStateHistoryItem(PaylinkStateEvent stateHistoryItem) {
    if (this.stateHistory == null) {
      this.stateHistory = new ArrayList<>();
    }
    this.stateHistory.add(stateHistoryItem);
    return this;
  }

   /**
   * Get stateHistory
   * @return stateHistory
  **/
  @javax.annotation.Nullable
  public List<PaylinkStateEvent> getStateHistory() {
    return stateHistory;
  }

  public void setStateHistory(List<PaylinkStateEvent> stateHistory) {
    this.stateHistory = stateHistory;
  }


  public PaylinkTokenStatus token(String token) {
    this.token = token;
    return this;
  }

   /**
   * the token value which uniquely identifies the session.
   * @return token
  **/
  @javax.annotation.Nullable
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }


  public PaylinkTokenStatus transNo(Integer transNo) {
    this.transNo = transNo;
    return this;
  }

   /**
   * a transaction number if the transacstion was processed and isPaid is true.
   * @return transNo
  **/
  @javax.annotation.Nullable
  public Integer getTransNo() {
    return transNo;
  }

  public void setTransNo(Integer transNo) {
    this.transNo = transNo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaylinkTokenStatus paylinkTokenStatus = (PaylinkTokenStatus) o;
    return Objects.equals(this.amountPaid, paylinkTokenStatus.amountPaid) &&
        Objects.equals(this.authCode, paylinkTokenStatus.authCode) &&
        Objects.equals(this.card, paylinkTokenStatus.card) &&
        Objects.equals(this.created, paylinkTokenStatus.created) &&
        Objects.equals(this.datetime, paylinkTokenStatus.datetime) &&
        Objects.equals(this.identifier, paylinkTokenStatus.identifier) &&
        Objects.equals(this.isAttachment, paylinkTokenStatus.isAttachment) &&
        Objects.equals(this.isCancelled, paylinkTokenStatus.isCancelled) &&
        Objects.equals(this.isClosed, paylinkTokenStatus.isClosed) &&
        Objects.equals(this.isCustomerReceiptEmailSent, paylinkTokenStatus.isCustomerReceiptEmailSent) &&
        Objects.equals(this.isEmailSent, paylinkTokenStatus.isEmailSent) &&
        Objects.equals(this.isExpired, paylinkTokenStatus.isExpired) &&
        Objects.equals(this.isFormViewed, paylinkTokenStatus.isFormViewed) &&
        Objects.equals(this.isMerchantNotificationEmailSent, paylinkTokenStatus.isMerchantNotificationEmailSent) &&
        Objects.equals(this.isOpenForPayment, paylinkTokenStatus.isOpenForPayment) &&
        Objects.equals(this.isPaid, paylinkTokenStatus.isPaid) &&
        Objects.equals(this.isPaymentAttempted, paylinkTokenStatus.isPaymentAttempted) &&
        Objects.equals(this.isPostbackOk, paylinkTokenStatus.isPostbackOk) &&
        Objects.equals(this.isRequestChallenged, paylinkTokenStatus.isRequestChallenged) &&
        Objects.equals(this.isSmsSent, paylinkTokenStatus.isSmsSent) &&
        Objects.equals(this.isValidated, paylinkTokenStatus.isValidated) &&
        Objects.equals(this.lastEventDateTime, paylinkTokenStatus.lastEventDateTime) &&
        Objects.equals(this.lastPaymentResult, paylinkTokenStatus.lastPaymentResult) &&
        Objects.equals(this.mid, paylinkTokenStatus.mid) &&
        Objects.equals(this.paymentAttemptsCount, paylinkTokenStatus.paymentAttemptsCount) &&
        Objects.equals(this.stateHistory, paylinkTokenStatus.stateHistory) &&
        Objects.equals(this.token, paylinkTokenStatus.token) &&
        Objects.equals(this.transNo, paylinkTokenStatus.transNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountPaid, authCode, card, created, datetime, identifier, isAttachment, isCancelled, isClosed, isCustomerReceiptEmailSent, isEmailSent, isExpired, isFormViewed, isMerchantNotificationEmailSent, isOpenForPayment, isPaid, isPaymentAttempted, isPostbackOk, isRequestChallenged, isSmsSent, isValidated, lastEventDateTime, lastPaymentResult, mid, paymentAttemptsCount, stateHistory, token, transNo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaylinkTokenStatus {\n");
    sb.append("    amountPaid: ").append(toIndentedString(amountPaid)).append("\n");
    sb.append("    authCode: ").append(toIndentedString(authCode)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    datetime: ").append(toIndentedString(datetime)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    isAttachment: ").append(toIndentedString(isAttachment)).append("\n");
    sb.append("    isCancelled: ").append(toIndentedString(isCancelled)).append("\n");
    sb.append("    isClosed: ").append(toIndentedString(isClosed)).append("\n");
    sb.append("    isCustomerReceiptEmailSent: ").append(toIndentedString(isCustomerReceiptEmailSent)).append("\n");
    sb.append("    isEmailSent: ").append(toIndentedString(isEmailSent)).append("\n");
    sb.append("    isExpired: ").append(toIndentedString(isExpired)).append("\n");
    sb.append("    isFormViewed: ").append(toIndentedString(isFormViewed)).append("\n");
    sb.append("    isMerchantNotificationEmailSent: ").append(toIndentedString(isMerchantNotificationEmailSent)).append("\n");
    sb.append("    isOpenForPayment: ").append(toIndentedString(isOpenForPayment)).append("\n");
    sb.append("    isPaid: ").append(toIndentedString(isPaid)).append("\n");
    sb.append("    isPaymentAttempted: ").append(toIndentedString(isPaymentAttempted)).append("\n");
    sb.append("    isPostbackOk: ").append(toIndentedString(isPostbackOk)).append("\n");
    sb.append("    isRequestChallenged: ").append(toIndentedString(isRequestChallenged)).append("\n");
    sb.append("    isSmsSent: ").append(toIndentedString(isSmsSent)).append("\n");
    sb.append("    isValidated: ").append(toIndentedString(isValidated)).append("\n");
    sb.append("    lastEventDateTime: ").append(toIndentedString(lastEventDateTime)).append("\n");
    sb.append("    lastPaymentResult: ").append(toIndentedString(lastPaymentResult)).append("\n");
    sb.append("    mid: ").append(toIndentedString(mid)).append("\n");
    sb.append("    paymentAttemptsCount: ").append(toIndentedString(paymentAttemptsCount)).append("\n");
    sb.append("    stateHistory: ").append(toIndentedString(stateHistory)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    transNo: ").append(toIndentedString(transNo)).append("\n");
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
    openapiFields.add("amount_paid");
    openapiFields.add("auth_code");
    openapiFields.add("card");
    openapiFields.add("created");
    openapiFields.add("datetime");
    openapiFields.add("identifier");
    openapiFields.add("is_attachment");
    openapiFields.add("is_cancelled");
    openapiFields.add("is_closed");
    openapiFields.add("is_customer_receipt_email_sent");
    openapiFields.add("is_email_sent");
    openapiFields.add("is_expired");
    openapiFields.add("is_form_viewed");
    openapiFields.add("is_merchant_notification_email_sent");
    openapiFields.add("is_open_for_payment");
    openapiFields.add("is_paid");
    openapiFields.add("is_payment_attempted");
    openapiFields.add("is_postback_ok");
    openapiFields.add("is_request_challenged");
    openapiFields.add("is_sms_sent");
    openapiFields.add("is_validated");
    openapiFields.add("last_event_date_time");
    openapiFields.add("last_payment_result");
    openapiFields.add("mid");
    openapiFields.add("payment_attempts_count");
    openapiFields.add("state_history");
    openapiFields.add("token");
    openapiFields.add("trans_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PaylinkTokenStatus
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PaylinkTokenStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaylinkTokenStatus is not found in the empty JSON string", PaylinkTokenStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PaylinkTokenStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PaylinkTokenStatus` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("auth_code") != null && !jsonObj.get("auth_code").isJsonNull()) && !jsonObj.get("auth_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `auth_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("auth_code").toString()));
      }
      if ((jsonObj.get("card") != null && !jsonObj.get("card").isJsonNull()) && !jsonObj.get("card").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card").toString()));
      }
      if ((jsonObj.get("identifier") != null && !jsonObj.get("identifier").isJsonNull()) && !jsonObj.get("identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identifier").toString()));
      }
      if ((jsonObj.get("last_payment_result") != null && !jsonObj.get("last_payment_result").isJsonNull()) && !jsonObj.get("last_payment_result").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_payment_result` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_payment_result").toString()));
      }
      if ((jsonObj.get("mid") != null && !jsonObj.get("mid").isJsonNull()) && !jsonObj.get("mid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mid").toString()));
      }
      if (jsonObj.get("state_history") != null && !jsonObj.get("state_history").isJsonNull()) {
        JsonArray jsonArraystateHistory = jsonObj.getAsJsonArray("state_history");
        if (jsonArraystateHistory != null) {
          // ensure the json data is an array
          if (!jsonObj.get("state_history").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `state_history` to be an array in the JSON string but got `%s`", jsonObj.get("state_history").toString()));
          }

          // validate the optional field `state_history` (array)
          for (int i = 0; i < jsonArraystateHistory.size(); i++) {
            PaylinkStateEvent.validateJsonElement(jsonArraystateHistory.get(i));
          };
        }
      }
      if ((jsonObj.get("token") != null && !jsonObj.get("token").isJsonNull()) && !jsonObj.get("token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaylinkTokenStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaylinkTokenStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaylinkTokenStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaylinkTokenStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<PaylinkTokenStatus>() {
           @Override
           public void write(JsonWriter out, PaylinkTokenStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaylinkTokenStatus read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PaylinkTokenStatus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaylinkTokenStatus
  * @throws IOException if the JSON string is invalid with respect to PaylinkTokenStatus
  */
  public static PaylinkTokenStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaylinkTokenStatus.class);
  }

 /**
  * Convert an instance of PaylinkTokenStatus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

