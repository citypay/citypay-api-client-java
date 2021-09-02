

# AirlineSegment


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**arrivalLocationCode** | **String** | A standard airline routing code (airport code or location identifier) applicable to the arrival portion of this segment.  | 
**carrierCode** | **String** | This field contains the two character airline designator code (air carrier code or airline code) that corresponds to the airline carrier applicable for up to four flight segments of this trip itinerary.  | 
**classServiceCode** | **String** | This field contains a code that corresponds to the fare class (A, B, C, D, Premium, Discounted, etc.) within the overall class of service (e.g., First Class, Business, Economy) applicable to this travel segment, as specified in the IATA Standard Code allocation table.  | 
**departureDate** | **LocalDate** | The Departure Date for the travel segment in ISO Date Format (yyyy-MM-dd). | 
**departureLocationCode** | **String** | A standard airline routing code (airport code or location identifier) applicable to the departure portion of this segment.  |  [optional]
**flightNumber** | **String** | This field contains the carrier-assigned Flight Number for this travel segment. | 
**segmentFare** | **Integer** | This field contains the total Fare for this travel segment. |  [optional]
**stopOverIndicator** | **String** | O &#x3D; Stopover allowed, X &#x3D; Stopover not allowed. |  [optional]



