

# PaylinkConfig


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**acsMode** | **String** | Specifies the approach to be adopted by the Paylink form when displaying a 3-D Secure challenge window. The values may be   - &#x60;iframe&#x60; shows the 3-D Secure ACS in an iframe dialog, neatly embedding it in Paylink. This provides a more seamless flow for the cardholder who is able to validate and authenticate their card using a dialog provided by their card issuer.  - &#x60;inline&#x60; an inline mode transfers the full browser window to the authentication server, allowing the payment cardholder to see their payment card issuer&#39;s URL and the certificate status in the browser.  If you request an iframe mode and the browser width is deemed as being small (&lt; 768px) then an inline mode will be enforced. This is to ensure that mobile users have an appropriate user experience.  The default type if not supplied is **iframe**.  |  [optional] |
|**customParams** | [**List&lt;PaylinkCustomParam&gt;**](PaylinkCustomParam.md) |  |  [optional] |
|**descriptor** | **String** | Directly specify the merchant descriptor used for the transaction to be displayed on the payment page. |  [optional] |
|**expireIn** | **String** | Specifies a period of time in seconds after which the token cannot be used. A value of 0 defines that the token will never expire. The API will convert an expiry time based on a string value.  For instance: -  s - Time in seconds, for example 90s. -  m - Time in minutes, for example 20m. -  h - Time in hours, for example 4h. -  w - Time in weeks, for example 4w. -  M - Time in months, for example 6M. -  y - Time in years, for example 1y. -  Defaults to 30 minutes.  |  [optional] |
|**fieldGuard** | [**List&lt;PaylinkFieldGuardModel&gt;**](PaylinkFieldGuardModel.md) |  |  [optional] |
|**lockParams** | **List&lt;String&gt;** |  |  [optional] |
|**merchLogo** | **String** | A URL of a logo to include in the form. The URL should be delivered using HTTPS. |  [optional] |
|**merchTerms** | **String** | A URL of the merchant terms and conditions for payment. If a value is supplied, a checkbox will be required to be completed to confirm that the cardholder agrees to these conditions before payment. A modal dialogue is displayed with the content of the conditions displayed. |  [optional] |
|**metaData** | **Map&lt;String, String&gt;** |  |  [optional] |
|**options** | **List&lt;String&gt;** |  |  [optional] |
|**partPayments** | [**PaylinkPartPayments**](PaylinkPartPayments.md) |  |  [optional] |
|**passThroughData** | **Map&lt;String, String&gt;** |  |  [optional] |
|**passThroughHeaders** | **Map&lt;String, String&gt;** |  |  [optional] |
|**postback** | **String** | Specifies a URL to use for a call back when the payment is completed. see Postback Handling }. |  [optional] |
|**postbackPassword** | **String** | A password to be added to the postback for HTTP Basic Authentication. |  [optional] |
|**postbackPolicy** | **String** | The policy setting for the postback see Postback Handling. |  [optional] |
|**postbackUsername** | **String** | A username to be added to the postback for HTTP Basic Authentication. |  [optional] |
|**redirectDelay** | **Integer** | A value which can delay the redirection in seconds. A value of 0 will redirect immediately. |  [optional] |
|**redirectFailure** | **String** | A URL which the browser is redirected to on non-completion of a transaction. |  [optional] |
|**redirectSuccess** | **String** | A URL which the browser is redirected to on authorisation of a transaction. |  [optional] |
|**renderer** | **String** | The Paylink renderer engine to use. |  [optional] |
|**returnParams** | **Boolean** | If a value of true is specified, any redirection will include the transaction result in parameters. It is recommended to use the postback integration rather than redirection parameters. |  [optional] |
|**ui** | [**PaylinkUI**](PaylinkUI.md) |  |  [optional] |



