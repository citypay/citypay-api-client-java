

# DirectTokenAuthRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**nonce** | **String** | A random value string which is provided to the API to perform a digest. The value will be used by its UTF-8 byte representation of any digest function.  |  [optional] |
|**redirectFailure** | **String** | The URL used to redirect back to your site when a transaction has been rejected or declined. Required if a url-encoded request.  |  [optional] |
|**redirectSuccess** | **String** | The URL used to redirect back to your site when a transaction has been authorised. Required if a url-encoded request.  |  [optional] |
|**token** | **String** | The token required to process the transaction as presented by the direct post methodology.  |  [optional] |



