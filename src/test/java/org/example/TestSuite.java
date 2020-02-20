package org.example;
import org.testng.annotations.Test;
import sun.management.snmp.jvmmib.JVM_MANAGEMENT_MIBOidTable;

public class TestSuite extends BaseTest {

    // all below objects created to call methods
    BrowserSelector browserSelector = new BrowserSelector();

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
}
