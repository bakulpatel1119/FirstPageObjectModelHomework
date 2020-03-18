Feature: Categories

  Background:
    Given user is on Homepage

  @category
  Scenario Outline: User can navigate to correct category page,
  So that he can use all products features from categories

    When user clicks on "<category>" link from top menu
    Then user should be able to nevigate to "<related category page>" successfully
    Examples:
      | category          | related category page                          |
      | Computers         | https://demo.nopcommerce.com/computers         |
      | Electronics       | https://demo.nopcommerce.com/electronics       |
      | Apparel           | https://demo.nopcommerce.com/apparel           |
      | Digital downloads | https://demo.nopcommerce.com/digital-downloads |
      | Books             | https://demo.nopcommerce.com/books             |
      | Jewelry           | https://demo.nopcommerce.com/jewelry           |
      | Gift Cards        | https://demo.nopcommerce.com/gift-cards        |


    @category1

    When user click on "category" from top menu
    And click on "subcategory"
    Then user should be able to see products successfully







