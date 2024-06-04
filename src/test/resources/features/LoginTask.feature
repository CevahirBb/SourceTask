
Feature:User should be able to login with valid credentials and orders products

  @wip
    Scenario Outline: Login and Add products to the Basket
    Given The user is on the login page
      When The user enters "<username>" and "<password>" credentials
      And The user should be able to login sauce demo website
     When The user should able to sorting the products sort container
      And The user selects "<dropSelect>"
     When The user selects the "<productSelect1>" and "<productSelect2>"
      And The user should able to add 'cheapest' and '2nd costliest product' to basket
      When The user opens the basket
      And  The user enters "<firstName>" and "<lastName>" and "<zipcode>"
    When The user click on the 'continue' button
   And The user should be able to finish
      When The user clicks on the 'backHome' button
      Then The user should be able to go to product page again
    Examples:
      | username | password | dropSelect | productSelect1 | productSelect2 | firstName | lastName | zipcode |
      | standard_user | secret_sauce  | hilo | cheapestProduct| secondProduct| Cevahir | Basibuyuk | 79830|





