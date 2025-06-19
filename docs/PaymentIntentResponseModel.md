

# PaymentIntentResponseModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**adjustments** | [**Adjustments**](Adjustments.md) |  |  [optional] |
|**amount** | **Integer** | An amount of the intent. |  [optional] |
|**created** | **OffsetDateTime** | A date time of when the intent was created. |  [optional] |
|**currency** | **String** | The currency of the intent. |  [optional] |
|**due** | **LocalDate** | A due date of the intent. |  [optional] |
|**expires** | **LocalDate** | An expiration date of the intent. |  [optional] |
|**externalRef** | **String** | An external reference of the intent. |  [optional] |
|**externalRefSource** | **String** | An external reference source of the intent. |  [optional] |
|**identifier** | **String** | An identifier of the intent. |  |
|**intentStatus** | **String** | A status of the intent such as &#x60;unknown&#x60;, &#x60;open&#x60;, &#x60;requires_payment_method&#x60;, &#x60;requires_confirmation&#x60;, &#x60;requires_confirmation&#x60;, &#x60;requires_action&#x60;, &#x60;processing&#x60;, &#x60;succeeded&#x60;, &#x60;cancelled&#x60;, &#x60;requires_capture&#x60;, &#x60;failed&#x60;, &#x60;expired&#x60;, &#x60;requires_refund&#x60;, &#x60;refunded&#x60;. |  [optional] |
|**merchantid** | **Integer** | The merchant id of the intent. |  |
|**paymentType** | **String** | A type of the intent such as &#x60;None&#x60;, &#x60;Single&#x60;, &#x60;Subscription&#x60;. |  [optional] |
|**paymentIntentId** | **String** | The id of the intent. |  |
|**transactions** | [**AuthReference**](AuthReference.md) |  |  [optional] |



