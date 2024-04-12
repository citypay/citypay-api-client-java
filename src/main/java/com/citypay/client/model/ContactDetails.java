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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

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
 * ContactDetails
 */
public class ContactDetails {
  public static final String SERIALIZED_NAME_ADDRESS1 = "address1";
  @SerializedName(SERIALIZED_NAME_ADDRESS1)
  private String address1;

  public static final String SERIALIZED_NAME_ADDRESS2 = "address2";
  @SerializedName(SERIALIZED_NAME_ADDRESS2)
  private String address2;

  public static final String SERIALIZED_NAME_ADDRESS3 = "address3";
  @SerializedName(SERIALIZED_NAME_ADDRESS3)
  private String address3;

  public static final String SERIALIZED_NAME_AREA = "area";
  @SerializedName(SERIALIZED_NAME_AREA)
  private String area;

  public static final String SERIALIZED_NAME_COMPANY = "company";
  @SerializedName(SERIALIZED_NAME_COMPANY)
  private String company;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_FIRSTNAME = "firstname";
  @SerializedName(SERIALIZED_NAME_FIRSTNAME)
  private String firstname;

  public static final String SERIALIZED_NAME_LASTNAME = "lastname";
  @SerializedName(SERIALIZED_NAME_LASTNAME)
  private String lastname;

  public static final String SERIALIZED_NAME_MOBILE_NO = "mobile_no";
  @SerializedName(SERIALIZED_NAME_MOBILE_NO)
  private String mobileNo;

  public static final String SERIALIZED_NAME_POSTCODE = "postcode";
  @SerializedName(SERIALIZED_NAME_POSTCODE)
  private String postcode;

  public static final String SERIALIZED_NAME_TELEPHONE_NO = "telephone_no";
  @SerializedName(SERIALIZED_NAME_TELEPHONE_NO)
  private String telephoneNo;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public ContactDetails() {
  }

  public ContactDetails address1(String address1) {
    this.address1 = address1;
    return this;
  }

   /**
   * The first line of the address for the card holder.
   * @return address1
  **/
  @javax.annotation.Nullable
  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }


  public ContactDetails address2(String address2) {
    this.address2 = address2;
    return this;
  }

   /**
   * The second line of the address for the card holder.
   * @return address2
  **/
  @javax.annotation.Nullable
  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }


  public ContactDetails address3(String address3) {
    this.address3 = address3;
    return this;
  }

   /**
   * The third line of the address for the card holder.
   * @return address3
  **/
  @javax.annotation.Nullable
  public String getAddress3() {
    return address3;
  }

  public void setAddress3(String address3) {
    this.address3 = address3;
  }


  public ContactDetails area(String area) {
    this.area = area;
    return this;
  }

   /**
   * The area such as city, department, parish for the card holder.
   * @return area
  **/
  @javax.annotation.Nullable
  public String getArea() {
    return area;
  }

  public void setArea(String area) {
    this.area = area;
  }


  public ContactDetails company(String company) {
    this.company = company;
    return this;
  }

   /**
   * The company name for the card holder if the contact is a corporate contact.
   * @return company
  **/
  @javax.annotation.Nullable
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }


  public ContactDetails country(String country) {
    this.country = country;
    return this;
  }

   /**
   * The country code in ISO 3166 format. The country value may be used for fraud analysis and for   acceptance of the transaction. 
   * @return country
  **/
  @javax.annotation.Nullable
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }


  public ContactDetails email(String email) {
    this.email = email;
    return this;
  }

   /**
   * An email address for the card holder which may be used for correspondence.
   * @return email
  **/
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public ContactDetails firstname(String firstname) {
    this.firstname = firstname;
    return this;
  }

   /**
   * The first name  of the card holder.
   * @return firstname
  **/
  @javax.annotation.Nullable
  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }


  public ContactDetails lastname(String lastname) {
    this.lastname = lastname;
    return this;
  }

   /**
   * The last name or surname of the card holder.
   * @return lastname
  **/
  @javax.annotation.Nullable
  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }


  public ContactDetails mobileNo(String mobileNo) {
    this.mobileNo = mobileNo;
    return this;
  }

   /**
   * A mobile number for the card holder the mobile number is often required by delivery companies to ensure they are able to be in contact when required.
   * @return mobileNo
  **/
  @javax.annotation.Nullable
  public String getMobileNo() {
    return mobileNo;
  }

  public void setMobileNo(String mobileNo) {
    this.mobileNo = mobileNo;
  }


  public ContactDetails postcode(String postcode) {
    this.postcode = postcode;
    return this;
  }

   /**
   * The postcode or zip code of the address which may be used for fraud analysis.
   * @return postcode
  **/
  @javax.annotation.Nullable
  public String getPostcode() {
    return postcode;
  }

  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }


  public ContactDetails telephoneNo(String telephoneNo) {
    this.telephoneNo = telephoneNo;
    return this;
  }

   /**
   * A telephone number for the card holder.
   * @return telephoneNo
  **/
  @javax.annotation.Nullable
  public String getTelephoneNo() {
    return telephoneNo;
  }

  public void setTelephoneNo(String telephoneNo) {
    this.telephoneNo = telephoneNo;
  }


  public ContactDetails title(String title) {
    this.title = title;
    return this;
  }

   /**
   * A title for the card holder such as Mr, Mrs, Ms, M. Mme. etc.
   * @return title
  **/
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactDetails contactDetails = (ContactDetails) o;
    return Objects.equals(this.address1, contactDetails.address1) &&
        Objects.equals(this.address2, contactDetails.address2) &&
        Objects.equals(this.address3, contactDetails.address3) &&
        Objects.equals(this.area, contactDetails.area) &&
        Objects.equals(this.company, contactDetails.company) &&
        Objects.equals(this.country, contactDetails.country) &&
        Objects.equals(this.email, contactDetails.email) &&
        Objects.equals(this.firstname, contactDetails.firstname) &&
        Objects.equals(this.lastname, contactDetails.lastname) &&
        Objects.equals(this.mobileNo, contactDetails.mobileNo) &&
        Objects.equals(this.postcode, contactDetails.postcode) &&
        Objects.equals(this.telephoneNo, contactDetails.telephoneNo) &&
        Objects.equals(this.title, contactDetails.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address1, address2, address3, area, company, country, email, firstname, lastname, mobileNo, postcode, telephoneNo, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactDetails {\n");
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    address3: ").append(toIndentedString(address3)).append("\n");
    sb.append("    area: ").append(toIndentedString(area)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
    sb.append("    lastname: ").append(toIndentedString(lastname)).append("\n");
    sb.append("    mobileNo: ").append(toIndentedString(mobileNo)).append("\n");
    sb.append("    postcode: ").append(toIndentedString(postcode)).append("\n");
    sb.append("    telephoneNo: ").append(toIndentedString(telephoneNo)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
    openapiFields.add("address1");
    openapiFields.add("address2");
    openapiFields.add("address3");
    openapiFields.add("area");
    openapiFields.add("company");
    openapiFields.add("country");
    openapiFields.add("email");
    openapiFields.add("firstname");
    openapiFields.add("lastname");
    openapiFields.add("mobile_no");
    openapiFields.add("postcode");
    openapiFields.add("telephone_no");
    openapiFields.add("title");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ContactDetails
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ContactDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContactDetails is not found in the empty JSON string", ContactDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ContactDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ContactDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("address1") != null && !jsonObj.get("address1").isJsonNull()) && !jsonObj.get("address1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address1").toString()));
      }
      if ((jsonObj.get("address2") != null && !jsonObj.get("address2").isJsonNull()) && !jsonObj.get("address2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address2").toString()));
      }
      if ((jsonObj.get("address3") != null && !jsonObj.get("address3").isJsonNull()) && !jsonObj.get("address3").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address3` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address3").toString()));
      }
      if ((jsonObj.get("area") != null && !jsonObj.get("area").isJsonNull()) && !jsonObj.get("area").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `area` to be a primitive type in the JSON string but got `%s`", jsonObj.get("area").toString()));
      }
      if ((jsonObj.get("company") != null && !jsonObj.get("company").isJsonNull()) && !jsonObj.get("company").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `company` to be a primitive type in the JSON string but got `%s`", jsonObj.get("company").toString()));
      }
      if ((jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("firstname") != null && !jsonObj.get("firstname").isJsonNull()) && !jsonObj.get("firstname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstname").toString()));
      }
      if ((jsonObj.get("lastname") != null && !jsonObj.get("lastname").isJsonNull()) && !jsonObj.get("lastname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastname").toString()));
      }
      if ((jsonObj.get("mobile_no") != null && !jsonObj.get("mobile_no").isJsonNull()) && !jsonObj.get("mobile_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mobile_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mobile_no").toString()));
      }
      if ((jsonObj.get("postcode") != null && !jsonObj.get("postcode").isJsonNull()) && !jsonObj.get("postcode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `postcode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("postcode").toString()));
      }
      if ((jsonObj.get("telephone_no") != null && !jsonObj.get("telephone_no").isJsonNull()) && !jsonObj.get("telephone_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `telephone_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("telephone_no").toString()));
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContactDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContactDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContactDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContactDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<ContactDetails>() {
           @Override
           public void write(JsonWriter out, ContactDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ContactDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ContactDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ContactDetails
  * @throws IOException if the JSON string is invalid with respect to ContactDetails
  */
  public static ContactDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContactDetails.class);
  }

 /**
  * Convert an instance of ContactDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

