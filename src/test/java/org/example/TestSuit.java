package org.example;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestSuit extends BaseTest {
    //BrowserSelector browserSelector = new BrowserSelector();
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

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//TO RUN TEST IN SAUCE LAB, MAKE SURE "-Dbrowser=chrome -DSauce=true" is updated in VM Option by Edit Configuration
//TO RUN TEST IN LOCAL MACHINE, MAKE SURE "-Dbrowser=chrome -DSauce=false" is updated in VM Option by Edit Configuration

    /////////////////////////////////////////////////////  PROGRAMME 1 /////////////////////////////////////////////////
  //  @Test
        public void guestUserShouldBeAbleToCheckOutSuccessfully() {
        // Enter details for checkout
        guestCheckOut.enterDetailsForCheckout();
        //verify guest user can see check out successful message
        guestCheckoutResultPage.verifyCheckoutSuccessfulMessage();
        //quit the browser
        browserSelector.quitBrowser();
    }
    /////////////////////////////////////////////////////  PROGRAMME 2 /////////////////////////////////////////////////
    //@Test
    public void userShouldBeAbleToCompareTwoProductSuccessfully() {
        // select product to compare
        bookCategoryComparisionPage.selectProductsToCompare();
        // user should be able to compare two products successfully
        bookCategoryComparisionResultPage.usershouldseeComparisionResult();
        //quit the browser
        browserSelector.quitBrowser();
    }
    //////////////////////////////////////////////////////  PROGRAMME 3 ////////////////////////////////////////////////
   // @Test
    public void registeredUserShouldBeAbleToReferProductToAFriend() {
        //enter username and password to login
        registeredUserReferetoFreiend.userIsLoggedIn();
        // select product to refer to A Friend
        registeredUserReferetoFreiend.selectProdutToReferToaFriend();
        // verify user should be able to refer product to A Friend successfully
        registeredUserReferToAFriendResultPage.RegisteredUserShouldbeAbleToReferToAFriend();
        //quit the browser
        browserSelector.quitBrowser();
    }
    /////////////////////////////////////////////////////  PROGRAMME 4 /////////////////////////////////////////////////
 //   @Test
    public void nonRegisteredUserShouldNotBeAbleToReferProductToAFriend() {
        //select product refer to a Friend
        nonRegisteredReferToAFriend.nonRegisteredUserSelectProdutToReferToaFriend();
        //Non registered should no be able to refer product to a Friend
        nonRegisteredReferToAFreinedResultPage.nonRegisteredUserShouldNotbeAbleToReferToAFriend();
        //quit the browser
        browserSelector.quitBrowser();
    }
    /////////////////////////////////////////////////////  PROGRAMME 5 ////////////////////////////////////////////////
   // @Test
    public void userShouldBeAbleToSortPriceHighToLow() {
        //soft price high to low
        categoryPagePriceHighToLow.sortPriceHighToLow();
        //verify user should be able to sort price high to low
        categoryPagePriceHighToLowResultPage.verifyPriceSortedHightoLow();
        //quit the browser
        browserSelector.quitBrowser();
    }
    ///////////////////////////////////////////////////  PROGRAMME 6 ////////////////////////////////////////////////////
    //@Test
    public void guestUserShouldBeAbleToAddCommentsSuccessfully() {
        // Add comment as a guest customer
        guestComments.addComments();
        //Verify guest user should be able to add a comments successfully
        guestCommentsResults.verifyGuestUserSeeCommentsSuccessfulMessage();
        //quit the browser
        browserSelector.quitBrowser();
    }
    /////////////////////////////////////////////////////  PROGRAMME 7 /////////////////////////////////////////////////
    //@Test
    public void userShouldBeAbleToChangeCurrencySuccessfully() {
        // change currency US dollar to Euro
        changeCurrency.selectCurrencyUsDollarToEuro();
        // User should be able to change currency US dollar to Euro
        changeCurrencyResultPage.verifycurrencyChangeUsDollarToEuro();
        // change currency Euro to US dollar
        changeCurrency.selectCurrencyEuroToUsDollar();
        //// User should be able to change currency Euro to US dollar
        changeCurrencyResultPage.verifycurrencyChangeEuroToUSDollar();
        //quit the browser
        browserSelector.quitBrowser();
    }
    /////////////////////////////////////////////////////  PROGRAMME 8 /////////////////////////////////////////////////
  //  @Test
    public void userShouldBeAbleToVerifyAddToCartButtonIsPresentSuccessfully() {
        //Scroll down to Featured products to see Add to cart Button
        addtoCartFeatureProducts.scrollDown();
        //Verify user can see Add to cart Button
        addtoCartForFeaturedProductsResultPage.verifyAddtoCartButtonIsPresent();
        //quit the browser
        browserSelector.quitBrowser();
    }
    /////////////////////////////////////////////////////  PROGRAMME 9 /////////////////////////////////////////////////
    @Test
    public void userShouldAbletoRegisterSuccessfully() {
        //click on register button
        homePage.clickOnRegisterButton();
        //fill up registration details
        registrationPage.userEnterRegistrationDetails();
        //verify registrations success message
        registrationResultPage.verifyUserSeeRegistrationSuccessMessage();
        //quit the browser
        browserSelector.quitBrowser();
    }
}
    /////////////////////////////////////////////////////// THE END ////////////////////////////////////////////////////