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
 * PaylinkCustomParam
 */
public class PaylinkCustomParam {
  public static final String SERIALIZED_NAME_FIELD_TYPE = "field_type";
  @SerializedName(SERIALIZED_NAME_FIELD_TYPE)
  private String fieldType;

  public static final String SERIALIZED_NAME_GROUP = "group";
  @SerializedName(SERIALIZED_NAME_GROUP)
  private String group;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  public static final String SERIALIZED_NAME_LOCKED = "locked";
  @SerializedName(SERIALIZED_NAME_LOCKED)
  private Boolean locked;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private Integer order;

  public static final String SERIALIZED_NAME_PATTERN = "pattern";
  @SerializedName(SERIALIZED_NAME_PATTERN)
  private String pattern;

  public static final String SERIALIZED_NAME_PLACEHOLDER = "placeholder";
  @SerializedName(SERIALIZED_NAME_PLACEHOLDER)
  private String placeholder;

  public static final String SERIALIZED_NAME_REQUIRED = "required";
  @SerializedName(SERIALIZED_NAME_REQUIRED)
  private Boolean required;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;


  public PaylinkCustomParam fieldType(String fieldType) {
    
    this.fieldType = fieldType;
    return this;
  }

   /**
   * the type of html5 field, defaults to &#39;text&#39;.
   * @return fieldType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the type of html5 field, defaults to 'text'.")

  public String getFieldType() {
    return fieldType;
  }


  public void setFieldType(String fieldType) {
    this.fieldType = fieldType;
  }


  public PaylinkCustomParam group(String group) {
    
    this.group = group;
    return this;
  }

   /**
   * a group the parameter is linked with, allows for grouping with a title.
   * @return group
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "a group the parameter is linked with, allows for grouping with a title.")

  public String getGroup() {
    return group;
  }


  public void setGroup(String group) {
    this.group = group;
  }


  public PaylinkCustomParam label(String label) {
    
    this.label = label;
    return this;
  }

   /**
   * a label to show alongside the input.
   * @return label
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "a label to show alongside the input.")

  public String getLabel() {
    return label;
  }


  public void setLabel(String label) {
    this.label = label;
  }


  public PaylinkCustomParam locked(Boolean locked) {
    
    this.locked = locked;
    return this;
  }

   /**
   * whether the parameter is locked from entry.
   * @return locked
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "whether the parameter is locked from entry.")

  public Boolean isLocked() {
    return locked;
  }


  public void setLocked(Boolean locked) {
    this.locked = locked;
  }


  public PaylinkCustomParam name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * the name of the custom parameter used to converse with the submitter.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "the name of the custom parameter used to converse with the submitter.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public PaylinkCustomParam order(Integer order) {
    
    this.order = order;
    return this;
  }

   /**
   * an index order for the parameter.
   * @return order
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "an index order for the parameter.")

  public Integer getOrder() {
    return order;
  }


  public void setOrder(Integer order) {
    this.order = order;
  }


  public PaylinkCustomParam pattern(String pattern) {
    
    this.pattern = pattern;
    return this;
  }

   /**
   * a regex pattern to validate the custom parameter with.
   * @return pattern
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "a regex pattern to validate the custom parameter with.")

  public String getPattern() {
    return pattern;
  }


  public void setPattern(String pattern) {
    this.pattern = pattern;
  }


  public PaylinkCustomParam placeholder(String placeholder) {
    
    this.placeholder = placeholder;
    return this;
  }

   /**
   * a placehold value to display in the input.
   * @return placeholder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "a placehold value to display in the input.")

  public String getPlaceholder() {
    return placeholder;
  }


  public void setPlaceholder(String placeholder) {
    this.placeholder = placeholder;
  }


  public PaylinkCustomParam required(Boolean required) {
    
    this.required = required;
    return this;
  }

   /**
   * whether the field is required.
   * @return required
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "whether the field is required.")

  public Boolean isRequired() {
    return required;
  }


  public void setRequired(Boolean required) {
    this.required = required;
  }


  public PaylinkCustomParam value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * a default value for the field.
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "a default value for the field.")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaylinkCustomParam paylinkCustomParam = (PaylinkCustomParam) o;
    return Objects.equals(this.fieldType, paylinkCustomParam.fieldType) &&
        Objects.equals(this.group, paylinkCustomParam.group) &&
        Objects.equals(this.label, paylinkCustomParam.label) &&
        Objects.equals(this.locked, paylinkCustomParam.locked) &&
        Objects.equals(this.name, paylinkCustomParam.name) &&
        Objects.equals(this.order, paylinkCustomParam.order) &&
        Objects.equals(this.pattern, paylinkCustomParam.pattern) &&
        Objects.equals(this.placeholder, paylinkCustomParam.placeholder) &&
        Objects.equals(this.required, paylinkCustomParam.required) &&
        Objects.equals(this.value, paylinkCustomParam.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldType, group, label, locked, name, order, pattern, placeholder, required, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaylinkCustomParam {\n");
    sb.append("    fieldType: ").append(toIndentedString(fieldType)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
    sb.append("    placeholder: ").append(toIndentedString(placeholder)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

