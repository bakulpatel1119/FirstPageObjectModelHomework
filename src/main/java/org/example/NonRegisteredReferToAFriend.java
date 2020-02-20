package org.example;

import org.openqa.selenium.By;

public class NonRegisteredReferToAFriend extends Utils

{
    private By _category = By.linkText("Books");
    private By _fahrenheit451 = By.xpath("//h2/a[text()=\"Fahrenheit 451 by Ray Bradbury\"]");
    private By _emailToFriend = By.xpath("//input[@onclick='setLocation(\"/productemailafriend/37\")']");
    private By _friendEmailAddress = By.xpath("//input[@id=\"FriendEmail\"]");
    private By _yourEmailAddress = By.xpath("//input[@id=\"YourEmailAddress\"]");
    private By _clickSendEmailButton = By.xpath("//input[@class=\"button-1 send-email-a-friend-button\"]");

    public void nonRegisteredUserSelectProdutToReferToaFriend()
    {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // click on Book Category
        clickonElement(_category);

        //Click on Click on product Fahrenheit 451 by Ray Bradbury
        clickonElement(_fahrenheit451);
        waitUntilClickable(_fahrenheit451,20);

        waitForVisible(_emailToFriend,10);
        // And Click on Email a Friend
        clickonElement(_emailToFriend);
        waitUntilClickable(_emailToFriend,20);

        //Enter Friend's email address
        waitforElementisPresent(_friendEmailAddress,10);
        enterText(_friendEmailAddress, "test@test.com.com");
        waitforElementisPresent(_yourEmailAddress,10);

        //And Enter your Invalid (Not Registered) email address
        enterText(_yourEmailAddress, "test2225553@test.com");

        //Click on Send Email button
        clickonElement(_clickSendEmailButton);
    }
}

