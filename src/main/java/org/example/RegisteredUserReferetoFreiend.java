package org.example;
import org.openqa.selenium.By;
public class RegisteredUserReferetoFreiend extends Utils
{
    private By _login = By.linkText("Log in");
    private By _emailAddress = By.xpath("//input[@id=\"Email\"]");
    private By _password = By.xpath("//input[@id=\"Password\"]");
    private By _submitLogin = By.xpath("//input[@class=\"button-1 login-button\"]");
    private By _category = By.linkText("Books");
    private By _fahrenheit451 = By.xpath("//h2/a[text()=\"Fahrenheit 451 by Ray Bradbury\"]");
    private By _emailToFriend = By.xpath("//input[@onclick='setLocation(\"/productemailafriend/37\")']");
    private By _friendEmailAddress = By.xpath("//input[@id=\"FriendEmail\"]");
    private By _yourEmailAddress = By.xpath("//input[@id=\"YourEmailAddress\"]");
    private By _clickSendEmailButton = By.xpath("//input[@class=\"button-1 send-email-a-friend-button\"]");

public void selectProdutToReferToaFriend()
{
    // Click on login button
    clickonElement(_login);
    waitUntilClickable(_login,10);

    //Enter Valid email address
    waitForVisible(_emailAddress,10);
    enterText(_emailAddress,"super@super.com");
    waitUntilClickable(_emailAddress,10);

    //Enter valid Password
    waitForVisible(_password,10);
    enterText(_password, "supersuper");
    waitUntilClickable(_password,15);

    //click on login button
    clickonElement(_submitLogin);

    // click on Book Category
    waitForVisible(_category,10);
    clickonElement(_category);
    waitForVisible(_category,15);

    ////Click on Click on product Fahrenheit 451 by Ray Bradbury
    waitForVisible(_fahrenheit451,10);
    clickonElement(_fahrenheit451);
    waitUntilClickable(_fahrenheit451,10);


    waitForVisible(_emailToFriend,10);

    // // And Click on Email a Friend
    clickonElement(_emailToFriend);

    //Enter Friend's email address
    waitForVisible(_friendEmailAddress,10);
    enterText(_friendEmailAddress, "bakulpatel1119"+timeStamp()+"@gmail.com");
    waitUntilClickable(_friendEmailAddress,10);

    //And Enter your valid (Registered) email address
    waitForVisible(_yourEmailAddress,10);
    enterText(_yourEmailAddress, "super@super.com");
    waitUntilClickable(_yourEmailAddress,10);

    //Click on Send Email button
    clickonElement(_clickSendEmailButton);
}
}

