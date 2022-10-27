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
 * RefundRequest
 */
public class RefundRequest {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Integer amount;

  public static final String SERIALIZED_NAME_IDENTIFIER = "identifier";
  @SerializedName(SERIALIZED_NAME_IDENTIFIER)
  private String identifier;

  public static final String SERIALIZED_NAME_MERCHANTID = "merchantid";
  @SerializedName(SERIALIZED_NAME_MERCHANTID)
  private Integer merchantid;

  public static final String SERIALIZED_NAME_REFUND_REF = "refund_ref";
  @SerializedName(SERIALIZED_NAME_REFUND_REF)
  private Integer refundRef;

  public static final String SERIALIZED_NAME_TRANS_INFO = "trans_info";
  @SerializedName(SERIALIZED_NAME_TRANS_INFO)
  private String transInfo;


  public RefundRequest amount(Integer amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The amount to refund in the lowest unit of currency with a variable length to a maximum of 12 digits.  The amount should be the total amount required to refund for the transaction up to the original processed amount.  No decimal points are to be included and no divisional characters such as 1,024.  For example with GBP £1,021.95 the amount value is 102195. 
   * @return amount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "3600", required = true, value = "The amount to refund in the lowest unit of currency with a variable length to a maximum of 12 digits.  The amount should be the total amount required to refund for the transaction up to the original processed amount.  No decimal points are to be included and no divisional characters such as 1,024.  For example with GBP £1,021.95 the amount value is 102195. ")

  public Integer getAmount() {
    return amount;
  }


  public void setAmount(Integer amount) {
    this.amount = amount;
  }


  public RefundRequest identifier(String identifier) {
    
    this.identifier = identifier;
    return this;
  }

   /**
   * The identifier of the refund to process. The value should be a valid reference and may be used to perform  post processing actions and to aid in reconciliation of transactions.  The value should be a valid printable string with ASCII character ranges from 0x32 to 0x127.  The identifier is recommended to be distinct for each transaction such as a [random unique identifier](https://en.wikipedia.org/wiki/Universally_unique_identifier) this will aid in ensuring each transaction is identifiable.  When transactions are processed they are also checked for duplicate requests. Changing the identifier on a subsequent request will ensure that a transaction is considered as different. 
   * @return identifier
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "95b857a1-5955-4b86-963c-5a6dbfc4fb95", required = true, value = "The identifier of the refund to process. The value should be a valid reference and may be used to perform  post processing actions and to aid in reconciliation of transactions.  The value should be a valid printable string with ASCII character ranges from 0x32 to 0x127.  The identifier is recommended to be distinct for each transaction such as a [random unique identifier](https://en.wikipedia.org/wiki/Universally_unique_identifier) this will aid in ensuring each transaction is identifiable.  When transactions are processed they are also checked for duplicate requests. Changing the identifier on a subsequent request will ensure that a transaction is considered as different. ")

  public String getIdentifier() {
    return identifier;
  }


  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }


  public RefundRequest merchantid(Integer merchantid) {
    
    this.merchantid = merchantid;
    return this;
  }

   /**
   * Identifies the merchant account to perform the refund for.
   * @return merchantid
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "11223344", required = true, value = "Identifies the merchant account to perform the refund for.")

  public Integer getMerchantid() {
    return merchantid;
  }


  public void setMerchantid(Integer merchantid) {
    this.merchantid = merchantid;
  }


  public RefundRequest refundRef(Integer refundRef) {
    
    this.refundRef = refundRef;
    return this;
  }

   /**
   * A reference to the original transaction number that is wanting to be refunded. The original  transaction must be on the same merchant id, previously authorised. 
   * @return refundRef
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "8322", required = true, value = "A reference to the original transaction number that is wanting to be refunded. The original  transaction must be on the same merchant id, previously authorised. ")

  public Integer getRefundRef() {
    return refundRef;
  }


  public void setRefundRef(Integer refundRef) {
    this.refundRef = refundRef;
  }


  public RefundRequest transInfo(String transInfo) {
    
    this.transInfo = transInfo;
    return this;
  }

   /**
   * Further information that can be added to the transaction will display in reporting. Can be used for flexible values such as operator id.
   * @return transInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Further information that can be added to the transaction will display in reporting. Can be used for flexible values such as operator id.")

  public String getTransInfo() {
    return transInfo;
  }


  public void setTransInfo(String transInfo) {
    this.transInfo = transInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RefundRequest refundRequest = (RefundRequest) o;
    return Objects.equals(this.amount, refundRequest.amount) &&
        Objects.equals(this.identifier, refundRequest.identifier) &&
        Objects.equals(this.merchantid, refundRequest.merchantid) &&
        Objects.equals(this.refundRef, refundRequest.refundRef) &&
        Objects.equals(this.transInfo, refundRequest.transInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, identifier, merchantid, refundRef, transInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefundRequest {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    merchantid: ").append(toIndentedString(merchantid)).append("\n");
    sb.append("    refundRef: ").append(toIndentedString(refundRef)).append("\n");
    sb.append("    transInfo: ").append(toIndentedString(transInfo)).append("\n");
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

