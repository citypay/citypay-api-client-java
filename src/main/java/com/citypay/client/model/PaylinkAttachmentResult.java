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
 * PaylinkAttachmentResult
 */
public class PaylinkAttachmentResult {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private String result;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;


  public PaylinkAttachmentResult name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the attachment.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of the attachment.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public PaylinkAttachmentResult result(String result) {
    
    this.result = result;
    return this;
  }

   /**
   * The result of an uploaded attachment such as &#x60;OK&#x60; or &#x60;UPLOAD&#x60;.
   * @return result
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The result of an uploaded attachment such as `OK` or `UPLOAD`.")

  public String getResult() {
    return result;
  }


  public void setResult(String result) {
    this.result = result;
  }


  public PaylinkAttachmentResult url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * If the attachment is to be uploaded, a URL that can be used for Multipart upload of the attachment.
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If the attachment is to be uploaded, a URL that can be used for Multipart upload of the attachment.")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaylinkAttachmentResult paylinkAttachmentResult = (PaylinkAttachmentResult) o;
    return Objects.equals(this.name, paylinkAttachmentResult.name) &&
        Objects.equals(this.result, paylinkAttachmentResult.result) &&
        Objects.equals(this.url, paylinkAttachmentResult.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, result, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaylinkAttachmentResult {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
