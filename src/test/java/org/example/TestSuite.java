package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class TestSuite extends BaseTest {

    // all below objects created to call methods
    BrowserSelector browserSelector = new BrowserSelector();
    SoftAssert softAssert = new SoftAssert();
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();
    BookCategoryComparisionPage bookCategoryComparisionPage = new BookCategoryComparisionPage();
    BookCategoryComparisionResultPage bookCategoryComparisionResultPage = new BookCategoryComparisionResultPage();
    RegisteredUserReferetoFreiend registeredUserReferetoFreiend = new RegisteredUserReferetoFreiend();
    RegisteredUserReferToAFriendResultPage registeredUserReferToAFriendResultPage = new RegisteredUserReferToAFriendResultPage();
    NonRegisteredReferToAFriend nonRegisteredReferToAFriend = new NonRegisteredReferToAFriend();
    NonRegisteredReferToAFreinedResultPage nonRegisteredReferToAFreinedResultPage = new NonRegisteredReferToAFreinedResultPage();
    CategoryPagePriceHighToLow categoryPagePriceHighToLow = new CategoryPagePriceHighToLow();
    CategoryPagePriceHighToLowResultPage categoryPagePriceHighToLowResultPage = new CategoryPagePriceHighToLowResultPage();
    GuestComments guestComments = new GuestComments();
    GuestCommentsResults guestCommentsResults = new GuestCommentsResults();
    AddtoCartFeatureProducts addtoCartFeatureProducts = new AddtoCartFeatureProducts();
    AddtoCartForFeaturedProductsResultPage addtoCartForFeaturedProductsResultPage = new AddtoCartForFeaturedProductsResultPage();
    ChangeCurrency changeCurrency = new ChangeCurrency();
    ChangeCurrencyResultPage changeCurrencyResultPage = new ChangeCurrencyResultPage();
    GuestCheckOut guestCheckOut = new GuestCheckOut();
    GuestCheckoutResultPage guestCheckoutResultPage = new GuestCheckoutResultPage();

    //***************************************** HOMEWORK 1 ***************************************

    // PROGRAMME 1 : USER SHOULD BE ABLE TO REGISTER SUCCESSFULLY WHEN FILLED ALL COMPULSARY FIELD.
    @Test
    public void userShouldAbleToRegisterSuccessfully() {
        // click on register button
        homePage.clickOnRegisterButton();
        // Fill up all registration details
        registrationPage.userEnterRegistrationDetails();
        // Verify registration success message
        registrationResultPage.verifyUserSeeRegistrationSuccessMessage();
    }

    // PROGRAMME 2 : USER SHOULD BE ABLE TO COMPARE TWO DIFFERENT TWO PRODUCTS SUCCESSFULLY
    @Test
    public void userShouldBeAbletoCompareTwoDifferentProductsSuccessfully() {

    //select products to compare and click on compare buttion
    bookCategoryComparisionPage.selectProductsToCompare();
    // Verify comparision successful message
    bookCategoryComparisionResultPage.usershouldseeComparisionResult();
    }

    // PROGRAMMER 3 : USER SHOULD BE ABLE TO REFER PRODUCT TO A FRIEND SUCCESSFULLY
    @Test
    public void userShouldBeAbleToReferAFriend()
    {
    //Select product to refer, enter friend's and your email Valid (Registered) address and click on Refer to a Friend
    registeredUserReferetoFreiend.selectProdutToReferToaFriend();
    // verify message - "your message has been sent"
    registeredUserReferToAFriendResultPage.RegisteredUserShouldbeAbleToReferToAFriend();
    }

    // PROGRAMME 4 : NON REGISTERED USER SHOULD NOT BE ABLE TO REFER PRODUCT TO A FRIEND
    @Test
    public void nonRegisteredUserShouldNotBeAbleToReferToAFriend()
    {
        //Select product to refer, enter friend's and your Invalid (Not Registered) email address and click on Refer to a Friend
        nonRegisteredReferToAFriend.nonRegisteredUserSelectProdutToReferToaFriend();
        //Verify error message Only registered customers can use email a friend feature.
        nonRegisteredReferToAFreinedResultPage.nonRegisteredUserShouldNotbeAbleToReferToAFriend();
    }
    // PROGRAMME 5 : USER SHOULD BE ABLE TO SORT PRODUCT HIGH TO LOW
    @Test
    public void userSouldBeAbleToSortProductHighToLow()
    {
     //select product to sort price High to Low
     categoryPagePriceHighToLow.sortPriceHighToLow();
     //Verify price organised high to low
     categoryPagePriceHighToLowResultPage.verifyPriceSortedHightoLow();
    }






    //***************************************** HOMEWORK 2 ***************************************

    // PROGRAMME 6 - VERIFY GUEST USER SHOULD BE ABLE TO ADD COMMENTS SUCCESSFULLY
    @Test
    public void guestUserShouldBeAbletoAddComments() {
    guestComments.addComments();
    guestCommentsResults.verifyGuestUserSeeCommentsSuccessfulMessage(); }

    // PROGRAMME 7 - VERIFY USER SHOULD BE ABLE TO CHECK ADD TO CART BUTTON IS PRESENT SUCCESSFULLY
    @Test
    public void addToCartButtonIsPresentOnAllFeaturedProductss() {
     addtoCartFeatureProducts.scrollDown();
     addtoCartForFeaturedProductsResultPage.verifyAddtoCartButtonIsPresent(); }

    // PROGRAMME 8 - VERIFY USER SHOULD BE ABLE TO CHANGE CURRENCY SUCCESSFULLY
     @Test
    public void userShouldBeAbleToChangeCurrency() {
     changeCurrency.selectCurrencyUsDollarToEuro();
     changeCurrencyResultPage.verifycurrencyChangeUsDollarToEuro();
     changeCurrency.selectCurrencyEuroToUsDollar();
     changeCurrencyResultPage.verifycurrencyChangeEuroToUSDollar(); }

    // PROGRAMME 9 - VERIFY GUEST USER SHOULD BE ABLE TO CHECKOUT SUCCESSFULLY
    @Test
    public void guestUserShouldBeAbleToCheckoutSuccessfully() {
    try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }
     guestCheckOut.enterDetailsForCheckout();
     guestCheckoutResultPage.verifyCheckoutSuccessfulMessage();}
}