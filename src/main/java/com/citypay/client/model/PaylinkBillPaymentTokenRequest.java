/*
 * CityPay Payment API
 *  Welcome to the CityPay API, a robust HTTP API payment solution designed for seamless server-to-server  transactional processing. Our API facilitates a wide array of payment operations, catering to diverse business needs.  Whether you're integrating Internet payments, handling Mail Order/Telephone Order (MOTO) transactions, managing  Subscriptions with Recurring and Continuous Authority payments, or navigating the complexities of 3-D Secure  authentication, our API is equipped to support your requirements. Additionally, we offer functionalities for  Authorisation, Refunding, Pre-Authorisation, Cancellation/Voids, and Completion processing, alongside the capability  for tokenised payments.  ## Compliance and Security Overview <aside class=\"notice\">   Ensuring the security of payment transactions and compliance with industry standards is paramount. Our API is    designed with stringent security measures and compliance protocols to safeguard sensitive information and meet    the rigorous requirements of Visa, MasterCard, and the PCI Security Standards Council. </aside>  ### Key Compliance and Security Measures  * **TLS Encryption**: All data transmissions must utilise TLS version 1.2 or higher, employing [strong cryptography](#enabled-tls-ciphers). Our infrastructure strictly enforces this requirement to maintain the integrity and confidentiality of data in transit. We conduct regular scans and assessments of our TLS endpoints to identify and mitigate vulnerabilities. * **Data Storage Prohibitions**: Storing sensitive cardholder data (CHD), such as the card security code (CSC) or primary account number (PAN), is strictly prohibited. Our API is designed to minimize your exposure to sensitive data, thereby reducing your compliance burden. * **Data Masking**: For consumer protection and compliance, full card numbers must not be displayed on receipts or any customer-facing materials. Our API automatically masks PANs, displaying only the last four digits to facilitate safe receipt generation. * **Network Scans**: If your application is web-based, regular scans of your hosting environment are mandatory to identify and rectify potential vulnerabilities. This proactive measure is crucial for maintaining a secure and compliant online presence. * **PCI Compliance**: Adherence to PCI DSS standards is not optional; it's a requirement for operating securely and legally in the payments ecosystem. For detailed information on compliance requirements and resources, please visit the PCI Security Standards Council website [https://www.pcisecuritystandards.org/](https://www.pcisecuritystandards.org/). * **Request Validation**: Our API includes mechanisms to verify the legitimacy of each request, ensuring it pertains to a valid account and originates from a trusted source. We leverage remote IP address verification alongside sophisticated application firewall technologies to thwart a wide array of common security threats.  ## Getting Started Before integrating with the CityPay API, ensure your application and development practices align with the outlined compliance and security measures. This preparatory step is crucial for a smooth integration process and the long-term success of your payment processing operations.  For further details on API endpoints, request/response formats, and code examples, proceed to the subsequent sections of our documentation. Our aim is to provide you with all the necessary tools and information to integrate our payment processing capabilities seamlessly into your application.  Thank you for choosing CityPay API. We look forward to supporting your payment processing needs with our secure, compliant, and versatile API solution. 
 *
 * Contact: support@citypay.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.citypay.client.model;

import java.util.Objects;
import com.citypay.client.model.Adjustments;
import com.citypay.client.model.PaylinkAttachmentRequest;
import com.citypay.client.model.PaylinkEmailNotificationPath;
import com.citypay.client.model.PaylinkSMSNotificationPath;
import com.citypay.client.model.PaylinkTokenRequestModel;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.LocalDate;
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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.citypay.client.JSON;

/**
 * PaylinkBillPaymentTokenRequest
 */
public class PaylinkBillPaymentTokenRequest {
  public static final String SERIALIZED_NAME_ADDRESSEE = "addressee";
  @SerializedName(SERIALIZED_NAME_ADDRESSEE)
  @javax.annotation.Nullable
  private String addressee;

  public static final String SERIALIZED_NAME_ADJUSTMENTS = "adjustments";
  @SerializedName(SERIALIZED_NAME_ADJUSTMENTS)
  @javax.annotation.Nullable
  private Adjustments adjustments;

  public static final String SERIALIZED_NAME_ATTACHMENTS = "attachments";
  @SerializedName(SERIALIZED_NAME_ATTACHMENTS)
  @javax.annotation.Nullable
  private List<PaylinkAttachmentRequest> attachments = new ArrayList<>();

  public static final String SERIALIZED_NAME_DESCRIPTOR = "descriptor";
  @SerializedName(SERIALIZED_NAME_DESCRIPTOR)
  @javax.annotation.Nullable
  private String descriptor;

  public static final String SERIALIZED_NAME_DUE = "due";
  @SerializedName(SERIALIZED_NAME_DUE)
  @javax.annotation.Nullable
  private LocalDate due;

  public static final String SERIALIZED_NAME_EMAIL_NOTIFICATION_PATH = "email_notification_path";
  @SerializedName(SERIALIZED_NAME_EMAIL_NOTIFICATION_PATH)
  @javax.annotation.Nullable
  private PaylinkEmailNotificationPath emailNotificationPath;

  public static final String SERIALIZED_NAME_MEMO = "memo";
  @SerializedName(SERIALIZED_NAME_MEMO)
  @javax.annotation.Nullable
  private String memo;

  public static final String SERIALIZED_NAME_REQUEST = "request";
  @SerializedName(SERIALIZED_NAME_REQUEST)
  @javax.annotation.Nonnull
  private PaylinkTokenRequestModel request;

  public static final String SERIALIZED_NAME_SMS_NOTIFICATION_PATH = "sms_notification_path";
  @SerializedName(SERIALIZED_NAME_SMS_NOTIFICATION_PATH)
  @javax.annotation.Nullable
  private PaylinkSMSNotificationPath smsNotificationPath;

  public PaylinkBillPaymentTokenRequest() {
  }

  public PaylinkBillPaymentTokenRequest addressee(@javax.annotation.Nullable String addressee) {
    this.addressee = addressee;
    return this;
  }

  /**
   * Who the bill payment request intended for. This should be a readable name such as a person or company.
   * @return addressee
   */
  @javax.annotation.Nullable
  public String getAddressee() {
    return addressee;
  }

  public void setAddressee(@javax.annotation.Nullable String addressee) {
    this.addressee = addressee;
  }


  public PaylinkBillPaymentTokenRequest adjustments(@javax.annotation.Nullable Adjustments adjustments) {
    this.adjustments = adjustments;
    return this;
  }

  /**
   * Get adjustments
   * @return adjustments
   */
  @javax.annotation.Nullable
  public Adjustments getAdjustments() {
    return adjustments;
  }

  public void setAdjustments(@javax.annotation.Nullable Adjustments adjustments) {
    this.adjustments = adjustments;
  }


  public PaylinkBillPaymentTokenRequest attachments(@javax.annotation.Nullable List<PaylinkAttachmentRequest> attachments) {
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
   */
  @javax.annotation.Nullable
  public List<PaylinkAttachmentRequest> getAttachments() {
    return attachments;
  }

  public void setAttachments(@javax.annotation.Nullable List<PaylinkAttachmentRequest> attachments) {
    this.attachments = attachments;
  }


  public PaylinkBillPaymentTokenRequest descriptor(@javax.annotation.Nullable String descriptor) {
    this.descriptor = descriptor;
    return this;
  }

  /**
   * A descriptor for the bill payment used to describe what the payment request is for for instance \&quot;Invoice\&quot;.  The descriptor can be used as descriptive text on emails or the payment page. For instance an invoice may have a button saying \&quot;View Invoice\&quot; or an email may say \&quot;to pay your Invoice online\&quot;. 
   * @return descriptor
   */
  @javax.annotation.Nullable
  public String getDescriptor() {
    return descriptor;
  }

  public void setDescriptor(@javax.annotation.Nullable String descriptor) {
    this.descriptor = descriptor;
  }


  public PaylinkBillPaymentTokenRequest due(@javax.annotation.Nullable LocalDate due) {
    this.due = due;
    return this;
  }

  /**
   * A date that the invoice is due. This can be displayed on the payment page.
   * @return due
   */
  @javax.annotation.Nullable
  public LocalDate getDue() {
    return due;
  }

  public void setDue(@javax.annotation.Nullable LocalDate due) {
    this.due = due;
  }


  public PaylinkBillPaymentTokenRequest emailNotificationPath(@javax.annotation.Nullable PaylinkEmailNotificationPath emailNotificationPath) {
    this.emailNotificationPath = emailNotificationPath;
    return this;
  }

  /**
   * Get emailNotificationPath
   * @return emailNotificationPath
   */
  @javax.annotation.Nullable
  public PaylinkEmailNotificationPath getEmailNotificationPath() {
    return emailNotificationPath;
  }

  public void setEmailNotificationPath(@javax.annotation.Nullable PaylinkEmailNotificationPath emailNotificationPath) {
    this.emailNotificationPath = emailNotificationPath;
  }


  public PaylinkBillPaymentTokenRequest memo(@javax.annotation.Nullable String memo) {
    this.memo = memo;
    return this;
  }

  /**
   * A memo that can be added to the payment page and email to provide to the customer.
   * @return memo
   */
  @javax.annotation.Nullable
  public String getMemo() {
    return memo;
  }

  public void setMemo(@javax.annotation.Nullable String memo) {
    this.memo = memo;
  }


  public PaylinkBillPaymentTokenRequest request(@javax.annotation.Nonnull PaylinkTokenRequestModel request) {
    this.request = request;
    return this;
  }

  /**
   * Get request
   * @return request
   */
  @javax.annotation.Nonnull
  public PaylinkTokenRequestModel getRequest() {
    return request;
  }

  public void setRequest(@javax.annotation.Nonnull PaylinkTokenRequestModel request) {
    this.request = request;
  }


  public PaylinkBillPaymentTokenRequest smsNotificationPath(@javax.annotation.Nullable PaylinkSMSNotificationPath smsNotificationPath) {
    this.smsNotificationPath = smsNotificationPath;
    return this;
  }

  /**
   * Get smsNotificationPath
   * @return smsNotificationPath
   */
  @javax.annotation.Nullable
  public PaylinkSMSNotificationPath getSmsNotificationPath() {
    return smsNotificationPath;
  }

  public void setSmsNotificationPath(@javax.annotation.Nullable PaylinkSMSNotificationPath smsNotificationPath) {
    this.smsNotificationPath = smsNotificationPath;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the PaylinkBillPaymentTokenRequest instance itself
   */
  public PaylinkBillPaymentTokenRequest putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
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
    return Objects.equals(this.addressee, paylinkBillPaymentTokenRequest.addressee) &&
        Objects.equals(this.adjustments, paylinkBillPaymentTokenRequest.adjustments) &&
        Objects.equals(this.attachments, paylinkBillPaymentTokenRequest.attachments) &&
        Objects.equals(this.descriptor, paylinkBillPaymentTokenRequest.descriptor) &&
        Objects.equals(this.due, paylinkBillPaymentTokenRequest.due) &&
        Objects.equals(this.emailNotificationPath, paylinkBillPaymentTokenRequest.emailNotificationPath) &&
        Objects.equals(this.memo, paylinkBillPaymentTokenRequest.memo) &&
        Objects.equals(this.request, paylinkBillPaymentTokenRequest.request) &&
        Objects.equals(this.smsNotificationPath, paylinkBillPaymentTokenRequest.smsNotificationPath)&&
        Objects.equals(this.additionalProperties, paylinkBillPaymentTokenRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressee, adjustments, attachments, descriptor, due, emailNotificationPath, memo, request, smsNotificationPath, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaylinkBillPaymentTokenRequest {\n");
    sb.append("    addressee: ").append(toIndentedString(addressee)).append("\n");
    sb.append("    adjustments: ").append(toIndentedString(adjustments)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    descriptor: ").append(toIndentedString(descriptor)).append("\n");
    sb.append("    due: ").append(toIndentedString(due)).append("\n");
    sb.append("    emailNotificationPath: ").append(toIndentedString(emailNotificationPath)).append("\n");
    sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    smsNotificationPath: ").append(toIndentedString(smsNotificationPath)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("addressee");
    openapiFields.add("adjustments");
    openapiFields.add("attachments");
    openapiFields.add("descriptor");
    openapiFields.add("due");
    openapiFields.add("email_notification_path");
    openapiFields.add("memo");
    openapiFields.add("request");
    openapiFields.add("sms_notification_path");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("request");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PaylinkBillPaymentTokenRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PaylinkBillPaymentTokenRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaylinkBillPaymentTokenRequest is not found in the empty JSON string", PaylinkBillPaymentTokenRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PaylinkBillPaymentTokenRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("addressee") != null && !jsonObj.get("addressee").isJsonNull()) && !jsonObj.get("addressee").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `addressee` to be a primitive type in the JSON string but got `%s`", jsonObj.get("addressee").toString()));
      }
      // validate the optional field `adjustments`
      if (jsonObj.get("adjustments") != null && !jsonObj.get("adjustments").isJsonNull()) {
        Adjustments.validateJsonElement(jsonObj.get("adjustments"));
      }
      if (jsonObj.get("attachments") != null && !jsonObj.get("attachments").isJsonNull()) {
        JsonArray jsonArrayattachments = jsonObj.getAsJsonArray("attachments");
        if (jsonArrayattachments != null) {
          // ensure the json data is an array
          if (!jsonObj.get("attachments").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `attachments` to be an array in the JSON string but got `%s`", jsonObj.get("attachments").toString()));
          }

          // validate the optional field `attachments` (array)
          for (int i = 0; i < jsonArrayattachments.size(); i++) {
            PaylinkAttachmentRequest.validateJsonElement(jsonArrayattachments.get(i));
          };
        }
      }
      if ((jsonObj.get("descriptor") != null && !jsonObj.get("descriptor").isJsonNull()) && !jsonObj.get("descriptor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `descriptor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("descriptor").toString()));
      }
      // validate the optional field `email_notification_path`
      if (jsonObj.get("email_notification_path") != null && !jsonObj.get("email_notification_path").isJsonNull()) {
        PaylinkEmailNotificationPath.validateJsonElement(jsonObj.get("email_notification_path"));
      }
      if ((jsonObj.get("memo") != null && !jsonObj.get("memo").isJsonNull()) && !jsonObj.get("memo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `memo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("memo").toString()));
      }
      // validate the required field `request`
      PaylinkTokenRequestModel.validateJsonElement(jsonObj.get("request"));
      // validate the optional field `sms_notification_path`
      if (jsonObj.get("sms_notification_path") != null && !jsonObj.get("sms_notification_path").isJsonNull()) {
        PaylinkSMSNotificationPath.validateJsonElement(jsonObj.get("sms_notification_path"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaylinkBillPaymentTokenRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaylinkBillPaymentTokenRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaylinkBillPaymentTokenRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaylinkBillPaymentTokenRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<PaylinkBillPaymentTokenRequest>() {
           @Override
           public void write(JsonWriter out, PaylinkBillPaymentTokenRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   JsonElement jsonElement = gson.toJsonTree(entry.getValue());
                   if (jsonElement.isJsonArray()) {
                     obj.add(entry.getKey(), jsonElement.getAsJsonArray());
                   } else {
                     obj.add(entry.getKey(), jsonElement.getAsJsonObject());
                   }
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public PaylinkBillPaymentTokenRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             PaylinkBillPaymentTokenRequest instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PaylinkBillPaymentTokenRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PaylinkBillPaymentTokenRequest
   * @throws IOException if the JSON string is invalid with respect to PaylinkBillPaymentTokenRequest
   */
  public static PaylinkBillPaymentTokenRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaylinkBillPaymentTokenRequest.class);
  }

  /**
   * Convert an instance of PaylinkBillPaymentTokenRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

