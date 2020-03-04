$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/Resources/features/AddtoCartButton.feature");
formatter.feature({
  "name": "user should see Add to cart button for featured products successfully",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "user should be able to see Add to Cart Button on all Featured products",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on Home___Page",
  "keyword": "Given "
});
formatter.match({
  "location": "org.example.MyStepdefs.userIsOnHome___Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Scroll Down page to Feature Products",
  "keyword": "When "
});
formatter.match({
  "location": "org.example.MyStepdefs.userScrollDownPageToFeatureProducts()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see Add to Cart Button on all Featured products",
  "keyword": "Then "
});
formatter.match({
  "location": "org.example.MyStepdefs.userShouldSeeAddToCartButtonOnAllFeaturedProducts()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/Resources/features/ReferProductToAFriendByNon-RegisteredUser.feature");
formatter.feature({
  "name": "non-Registered User should not be able to refer Product to A Friend successfully",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "non-Registered User should not be able to refer Product to A Friend",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user navigate to homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "org.example.MyStepdefs.userNavigateToHomepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on Book__Category",
  "keyword": "When "
});
formatter.match({
  "location": "org.example.MyStepdefs.userClickOnBook__Category()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Click on product Fahrenheit Ray Bradbury",
  "keyword": "And "
});
formatter.match({
  "location": "org.example.MyStepdefs.clickOnClickOnProductFahrenheitRayBradbury()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Email Friend",
  "keyword": "And "
});
formatter.match({
  "location": "org.example.MyStepdefs.clickOnEmailFriend()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter Friends email address",
  "keyword": "And "
});
formatter.match({
  "location": "org.example.MyStepdefs.enterFriendsEmailAddress()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter your email address",
  "keyword": "And "
});
formatter.match({
  "location": "org.example.MyStepdefs.enterYourEmailAddress()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Send_Email button",
  "keyword": "And "
});
formatter.match({
  "location": "org.example.MyStepdefs.clickOnSend_EmailButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should not be able to refer Product to a Friend",
  "keyword": "Then "
});
formatter.match({
  "location": "org.example.MyStepdefs.userShouldNotBeAbleToReferProductToAFriend()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "error message Only registered customers can use email a friend feature should be displayed",
  "keyword": "And "
});
formatter.match({
  "location": "org.example.MyStepdefs.errorMessageOnlyRegisteredCustomersCanUseEmailAFriendFeatureShouldBeDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/Resources/features/changeCurrencyCode.feature");
formatter.feature({
  "name": "user should be able to change currency code successfully",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "user should be able to Change Currency Code",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on home__page",
  "keyword": "Given "
});
formatter.match({
  "location": "org.example.MyStepdefs.userIsOnHome__page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on US Dollar",
  "keyword": "When "
});
formatter.match({
  "location": "org.example.MyStepdefs.userClickOnUSDollar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select Euro Currency",
  "keyword": "And "
});
formatter.match({
  "location": "org.example.MyStepdefs.selectEuroCurrency()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should change currency code to Euro",
  "keyword": "Then "
});
formatter.match({
  "location": "org.example.MyStepdefs.userShouldChangeCurrencyCodeToEuro()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Euro",
  "keyword": "And "
});
formatter.match({
  "location": "org.example.MyStepdefs.clickOnEuro()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select US Dollar",
  "keyword": "And "
});
formatter.match({
  "location": "org.example.MyStepdefs.selectUSDollar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should change currency code to US dollar",
  "keyword": "Then "
});
formatter.match({
  "location": "org.example.MyStepdefs.userShouldChangeCurrencyCodeToUSDollar()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/Resources/features/comparePage.feature");
formatter.feature({
  "name": "user should be able to compare two different products successfully",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "user should be able to compare two different products",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is already on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "org.example.MyStepdefs.userIsAlreadyOnHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on Book___Category",
  "keyword": "When "
});
formatter.match({
  "location": "org.example.MyStepdefs.userClickOnBook___Category()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Click on Add to Compare for product Fahrenheit by Ray Bradbury",
  "keyword": "And "
});
formatter.match({
  "location": "org.example.MyStepdefs.userClickOnAddToCompareForProductFahrenheitByRayBradbury()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Add to Compare for product First Prize Pies",
  "keyword": "And "
});
formatter.match({
  "location": "org.example.MyStepdefs.clickOnAddToCompareForProductFirstPrizePies()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Product comparison on Popup Bar",
  "keyword": "And "
});
formatter.match({
  "location": "org.example.MyStepdefs.clickOnProductComparisonOnPopupBar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should compare two different products",
  "keyword": "Then "
});
formatter.match({
  "location": "org.example.MyStepdefs.userShouldCompareTwoDifferentProducts()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "compare Products message should be displayed",
  "keyword": "And "
});
formatter.match({
  "location": "org.example.MyStepdefs.compareProductsMessageShouldBeDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/Resources/features/guestCheckout.feature");
formatter.feature({
  "name": "guest user should checkout successfully",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "guest user should be able to checkout",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on Homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "org.example.MyStepdefs.userIsOnHomepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Book-Category",
  "keyword": "When "
});
formatter.match({
  "location": "org.example.MyStepdefs.clickOnBookCategory()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Product First-Prize-Pies",
  "keyword": "And "
});
formatter.match({
  "location": "org.example.MyStepdefs.clickOnProductFirstPrizePies()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Add to Cart Button",
  "keyword": "And "
});
formatter.match({
  "location": "org.example.MyStepdefs.clickOnAddToCartButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Shopping Cart Button on Popup Bar",
  "keyword": "And "
});
formatter.match({
  "location": "org.example.MyStepdefs.clickOnShoppingCartButtonOnPopupBar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Agree Terms and Conditions Tick-Box",
  "keyword": "And "
});
formatter.match({
  "location": "org.example.MyStepdefs.clickOnAgreeTermsAndConditionsTickBox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Checkout Button",
  "keyword": "And "
});
formatter.match({
  "location": "org.example.MyStepdefs.clickOnCheckoutButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Checkout as a Guest Button",
  "keyword": "And "
});
formatter.match({
  "location": "org.example.MyStepdefs.clickOnCheckoutAsAGuestButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter guest Customer Details",
  "keyword": "And "
});
formatter.match({
  "location": "org.example.MyStepdefs.enterGuestCustomerDetails()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Continue_Button",
  "keyword": "And "
});
formatter.match({
  "location": "org.example.MyStepdefs.clickOnContinue_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Credit Card",
  "keyword": "And "
});
formatter.match({
  "location": "org.example.MyStepdefs.clickOnCreditCard()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Continue-button",
  "keyword": "And "
});
formatter.match({
  "location": "org.example.MyStepdefs.clickOnContinueButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select MasterCard Credit Card",
  "keyword": "And "
});
formatter.match({
  "location": "org.example.MyStepdefs.selectMasterCardCreditCard()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter payment details",
  "keyword": "And "
});
formatter.match({
  "location": "org.example.MyStepdefs.enterPaymentDetails()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Confirm button",
  "keyword": "And "
});
formatter.match({
  "location": "org.example.MyStepdefs.clickOnConfirmButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "guest user should checkout successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "org.example.MyStepdefs.guestUserShouldCheckoutSuccessfully()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "message should display Your order has been successfully processed",
  "keyword": "And "
});
formatter.match({
  "location": "org.example.MyStepdefs.messageShouldDisplayYourOrderHasBeenSuccessfullyProcessed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/Resources/features/guestUserAddComments.feature");
formatter.feature({
  "name": "guest user should be able to add comments successfully",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "guest user should be able to add comments",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on HomePage_",
  "keyword": "Given "
});
formatter.match({
  "location": "org.example.MyStepdefs.userIsOnHomePage_()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on Details Button under News",
  "keyword": "When "
});
formatter.match({
  "location": "org.example.MyStepdefs.userClickOnDetailsButtonUnderNews()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter Title",
  "keyword": "And "
});
formatter.match({
  "location": "org.example.MyStepdefs.enterTitle()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter comments",
  "keyword": "And "
});
formatter.match({
  "location": "org.example.MyStepdefs.enterComments()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on New Comments button",
  "keyword": "And "
});
formatter.match({
  "location": "org.example.MyStepdefs.clickOnNewCommentsButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should add comments successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "org.example.MyStepdefs.userShouldAddCommentsSuccessfully()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "message should display News comment is successfully added",
  "keyword": "And "
});
formatter.match({
  "location": "org.example.MyStepdefs.messageShouldDisplayNewsCommentIsSuccessfullyAdded()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/Resources/features/referProudctToAFriendByRegisteredUser.feature");
formatter.feature({
  "name": "user should be able to refer Product to A Friend successfully",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "user should be able to refer Product to A Friend",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is logged in and is on Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "org.example.MyStepdefs.userIsLoggedInAndIsOnHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on Book_Category",
  "keyword": "When "
});
formatter.match({
  "location": "org.example.MyStepdefs.userClickOnBook_Category()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Click on product Fahrenheit by Ray Bradbury",
  "keyword": "And "
});
formatter.match({
  "location": "org.example.MyStepdefs.clickOnClickOnProductFahrenheitByRayBradbury()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Email a Friend",
  "keyword": "And "
});
formatter.match({
  "location": "org.example.MyStepdefs.clickOnEmailAFriend()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Friend\u0027s email address",
  "keyword": "And "
});
formatter.match({
  "location": "org.example.MyStepdefs.enterFriendSEmailAddress()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Send Email button",
  "keyword": "And "
});
formatter.match({
  "location": "org.example.MyStepdefs.clickOnSendEmailButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be able to refer Product to a Friend",
  "keyword": "Then "
});
formatter.match({
  "location": "org.example.MyStepdefs.userShouldBeAbleToReferProductToAFriend()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Your message has been sent message should be displayed.",
  "keyword": "And "
});
formatter.match({
  "location": "org.example.MyStepdefs.yourMessageHasBeenSentMessageShouldBeDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/Resources/features/register.feature");
formatter.feature({
  "name": "user should be able to register successfully when filled all compulsory field",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "user should be able to register successfully when filled all compulsory field",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "org.example.MyStepdefs.userIsOnHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on Register Button",
  "keyword": "When "
});
formatter.match({
  "location": "org.example.MyStepdefs.userClickOnRegisterButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter Firstname",
  "keyword": "And "
});
formatter.match({
  "location": "org.example.MyStepdefs.enterFirstname()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter Lastname",
  "keyword": "And "
});
formatter.match({
  "location": "org.example.MyStepdefs.enterLastname()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter Email address",
  "keyword": "And "
});
formatter.match({
  "location": "org.example.MyStepdefs.enterEmailAddress()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter password",
  "keyword": "And "
});
formatter.match({
  "location": "org.example.MyStepdefs.enterPassword()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter confirm password",
  "keyword": "And "
});
formatter.match({
  "location": "org.example.MyStepdefs.enterConfirmPassword()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Register button",
  "keyword": "And "
});
formatter.match({
  "location": "org.example.MyStepdefs.clickOnRegisterButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be registered successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "org.example.MyStepdefs.userShouldBeRegisteredSuccessfully()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "your registration Completed message should be displayed",
  "keyword": "And "
});
formatter.match({
  "location": "org.example.MyStepdefs.yourRegistrationCompletedMessageShouldBeDisplayed()"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: Your registration completed expected:\u003cYour registration [not ]completed\u003e but was:\u003cYour registration []completed\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:117)\r\n\tat org.example.Utils.assertTextMessage(Utils.java:89)\r\n\tat org.example.RegistrationResultPage.verifyUserSeeRegistrationSuccessMessage(RegistrationResultPage.java:13)\r\n\tat org.example.MyStepdefs.yourRegistrationCompletedMessageShouldBeDisplayed(MyStepdefs.java:78)\r\n\tat ✽.your registration Completed message should be displayed(file:///C:/Dev/pageobjectmodel/./src/test/Resources/features/register.feature:14)\r\n",
  "status": "failed"
});
formatter.write("!!!!!!!!!!!!...Scenario failed.Please see attached screenshot for the error");
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/Resources/features/sortPriceLowToHigh.feature");
formatter.feature({
  "name": "use should be able to sort product price high to low successfully",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User should be able to sort product price High to Low",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on home__page",
  "keyword": "Given "
});
formatter.match({
  "location": "org.example.MyStepdefs.userIsOnHome__Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on Book__Category",
  "keyword": "When "
});
formatter.match({
  "location": "org.example.MyStepdefs.userClickOn__BookCategory()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Filter Sort By",
  "keyword": "And "
});
formatter.match({
  "location": "org.example.MyStepdefs.clickOnFilterSortBy()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Price High to Low",
  "keyword": "And "
});
formatter.match({
  "location": "org.example.MyStepdefs.selectPriceHighToLow()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to sort price High to Low",
  "keyword": "Then "
});
formatter.match({
  "location": "org.example.MyStepdefs.userShouldBeAbleToSortPriceHighToLow()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});