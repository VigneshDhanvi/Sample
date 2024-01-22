Feature: Adactin Website test scenarios

  Background: 
    Given launch URL "https://adactinhotelapp.com/SearchHotel.php"

  @normalscenario
  Scenario: valid path
    When enter username "vigneshjohnpeter"
    And enter Password "Dha&Vi"
    And click login
    And select location "Melbourne"
    And select hotelName "Hotel Sunshine"
    And select roomType "Deluxe"
    And select no.of.Rooms "2 - Two"
    And enter CheckInDate "12/01/2024"
    And enter CheckOutDate "14/01/2024"
    And select adultsPerRoom "2 - Two"
    And select childrenPerRoom "1 - One"
    And click search
    And click hotelRadioBtn
    And click continueBtn
    And enter firstName "Vignesh"
    And enter lastName "Johnpeter"
    And enter address "Poonjery, Mamallapuram"
    And enter ccNo "1234567890123456"
    And select ccType "VISA"
    And select expiryMonth "October"
    And select ExpiryYear "2030"
    And enter CVV "123"
    And click BookNow

  @scenarioOutline
  Scenario Outline: valid path
    When enter username "<userName>"
    And enter Password "<passWord>"

    Examples: 
      | userName         | passWord |
      | vignesh          | Dha&Vi   |
      | vigneshjohnpeter | Dha&Vi   |

  @scenarioOutline
  Scenario Outline: valid path
    Given click login
    When select location "Melbourne"
    And select hotelName "Hotel Sunshine"
    And select roomType "Deluxe"
    And select no.of.Rooms "2 - Two"
    And enter CheckInDate "12/01/2024"
    And enter CheckOutDate "14/01/2024"
    And select adultsPerRoom "2 - Two"
    And select childrenPerRoom "1 - One"
    And click search
    And click hotelRadioBtn
    And click continueBtn
    And enter firstName "Vignesh"
    And enter lastName "Johnpeter"
    And enter address "Poonjery, Mamallapuram"
    And enter ccNo "1234567890123456"
    And select ccType "VISA"
    And select expiryMonth "October"
    And select ExpiryYear "2030"
    And enter CVV "123"
    And click BookNow

  @asList
  Scenario: valid path
    When enter cred
      | vigneshjohnpeter |
      | Dha&Vi           |
    And click login
    And select location "Melbourne"
    And select hotelName "Hotel Sunshine"
    And select roomType "Deluxe"
    And select no.of.Rooms "2 - Two"
    And enter CheckIn&CheckOutDate
      | 12/01/2024 |
      | 14/01/2024 |
    And select adultsPerRoom "2 - Two"
    And select childrenPerRoom "1 - One"
    And click search
    And click hotelRadioBtn
    And click continueBtn
    And enter deails
      | Vignesh                |
      | Johnpeter              |
      | Poonjery, Mamallapuram |
      |       1234567890123456 |
    And select ccType "VISA"
    And select expiryMonth "October"
    And select ExpiryYear "2030"
    And enter CVV "123"
    And click BookNow

  @asMap
  Scenario: valid path
    When enter credasMap
      | username | vigneshjohnpeter |
      | password | Dha&Vi           |
    And click login
    And select location "Melbourne"
    And select hotelName "Hotel Sunshine"
    And select roomType "Deluxe"
    And select no.of.Rooms "2 - Two"
    And enter CheckIn&CheckOutDateasMap
      | checkin  | 12/01/2024 |
      | checkout | 14/01/2024 |
    And select adultsPerRoom "2 - Two"
    And select childrenPerRoom "1 - One"
    And click search
    And click hotelRadioBtn
    And click continueBtn
    And enter deailsasMap
      | firstname | Vignesh                |
      | lastname  | Johnpeter              |
      | address   | Poonjery, Mamallapuram |
      | ccnumber  |       1234567890123456 |
    And select ccType "VISA"
    And select expiryMonth "October"
    And select ExpiryYear "2030"
    And enter CVV "123"
    And click BookNow

  @asMaps
  Scenario: valid path
    When enter credasMaps
      | username         | password |
      | vigneshjohnpeter | Dha&Vi   |
    And click login
    And select location "Melbourne"
    And select hotelName "Hotel Sunshine"
    And select roomType "Deluxe"
    And select no.of.Rooms "2 - Two"
    And enter CheckIn&CheckOutDateasMaps
      | checkin    | checkout   |
      | 12/01/2024 | 14/01/2024 |
    And select adultsPerRoom "2 - Two"
    And select childrenPerRoom "1 - One"
    And click search
    And click hotelRadioBtn
    And click continueBtn
    And enter deailsasMaps
      | firstname | lastname  | address                | ccnumber         |
      | Vignesh   | Johnpeter | Poonjery, Mamallapuram | 1234567890123456 |
    And select ccType "VISA"
    And select expiryMonth "October"
    And select ExpiryYear "2030"
    And enter CVV "123"
    And click BookNow
