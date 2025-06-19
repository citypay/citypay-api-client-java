

# AdjustmentCondition


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**anchor** | **String** | The anchor is the reference point from which the condition is evaluated. It determines when the adjustment should be considered based on a specific event or timeline related to the intent.  For example:  after_creation: The adjustment is applied after a specified number of days following the date of the creation of the payment intent. after_due_date: The adjustment is applied after a specified number of days following the due date. before_due_date: The adjustment is applied within a specified number of days before the due date. before_expiry: The adjustment is applied within a specified number of days before the date the payment intent expires. on_due_date: The adjustment is applied on the due date  yyyy-MM-dd: A specific ISO date value can be supplied to apply the adjustment on a given date.  |  [optional] |
|**discountCode** | **String** | The discount code condition ensures that an adjustment is only applied if the correct promotional code is provided during the transaction.  Example: A 10% discount might only apply if the customer enters the discount code SEP24.  |  [optional] |
|**duration** | **Integer** | The duration specifies the time frame in days relative to the anchor point when the adjustment should be applied. |  [optional] |
|**endDate** | **LocalDate** | Define the exact date range within which an adjustment is valid, useful for promotional periods or specific events. |  [optional] |
|**startDate** | **LocalDate** | Define the exact date range within which an adjustment is valid, useful for promotional periods or specific events. |  [optional] |



