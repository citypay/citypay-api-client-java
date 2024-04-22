

# PaylinkTokenStatus


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**amountPaid** | **Integer** | the amount that has been paid against the session. |  [optional] |
|**authCode** | **String** | an authorisation code if the transaction was processed and isPaid is true. |  [optional] |
|**card** | **String** | a description of the card that was used for payment if paid. |  [optional] |
|**created** | **OffsetDateTime** | the date and time that the session was created. |  [optional] |
|**datetime** | **OffsetDateTime** | the date and time of the current status. |  [optional] |
|**identifier** | **String** | the merchant identifier, to help identifying the token. |  [optional] |
|**isAttachment** | **Boolean** | true if an attachment exists. |  [optional] |
|**isCancelled** | **Boolean** | true if the session was cancelled either by the user or by a system request. |  [optional] |
|**isClosed** | **Boolean** | true if the token has been closed. |  [optional] |
|**isCustomerReceiptEmailSent** | **Boolean** | true if a customer receipt has been sent. |  [optional] |
|**isEmailSent** | **Boolean** | true if an email was sent. |  [optional] |
|**isExpired** | **Boolean** | true if the session has expired. |  [optional] |
|**isFormViewed** | **Boolean** | true if the form was ever displayed to the addressee. |  [optional] |
|**isMerchantNotificationEmailSent** | **Boolean** | true if a merchant notification receipt was sent. |  [optional] |
|**isOpenForPayment** | **Boolean** | true if the session is still open for payment or false if it has been closed. |  [optional] |
|**isPaid** | **Boolean** | whether the session has been paid and therefore can be considered as complete. |  [optional] |
|**isPaymentAttempted** | **Boolean** | true if payment has been attempted. |  [optional] |
|**isPostbackOk** | **Boolean** | true if a post back was executed successfully. |  [optional] |
|**isRequestChallenged** | **Boolean** | true if the request has been challenged using 3-D Secure. |  [optional] |
|**isSmsSent** | **Boolean** | true if an SMS was sent. |  [optional] |
|**isValidated** | **Boolean** | whether the token generation was successfully validated. |  [optional] |
|**lastEventDateTime** | **OffsetDateTime** | the date and time that the session last had an event actioned against it. |  [optional] |
|**lastPaymentResult** | **String** | the result of the last payment if one exists. |  [optional] |
|**mid** | **Integer** | identifies the merchant account. |  [optional] |
|**paymentAttemptsCount** | **Integer** | the number of attempts made to pay. |  [optional] |
|**stateHistory** | [**List&lt;PaylinkStateEvent&gt;**](PaylinkStateEvent.md) |  |  [optional] |
|**token** | **String** | the token value which uniquely identifies the session. |  [optional] |
|**transNo** | **Integer** | a transaction number if the transacstion was processed and isPaid is true. |  [optional] |



