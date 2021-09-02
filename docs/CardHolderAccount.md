

# CardHolderAccount


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountId** | **String** | The account id of the card holder account provided by the merchant which uniquely identifies the account.  | 
**cards** | [**List&lt;Card&gt;**](Card.md) |  |  [optional]
**contact** | [**ContactDetails**](ContactDetails.md) |  | 
**dateCreated** | **OffsetDateTime** | The date and time the account was created. |  [optional]
**defaultCardId** | **String** | The id of the default card. |  [optional]
**defaultCardIndex** | **Integer** | The index in the array of the default card. |  [optional]
**lastModified** | **OffsetDateTime** | The date and time the account was last modified. |  [optional]
**status** | **String** | Defines the status of the account for processing valid values are   - ACTIVE for active accounts that are able to process   - DISABLED for accounts that are currently disabled for processing.  |  [optional]
**uniqueId** | **String** | A unique id of the card holder account which uniquely identifies the stored account. This value is not searchable. |  [optional]



