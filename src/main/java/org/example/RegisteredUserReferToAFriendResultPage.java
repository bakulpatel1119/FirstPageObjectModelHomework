package org.example;

import org.openqa.selenium.By;

import java.lang.ref.SoftReference;

public class RegisteredUserReferToAFriendResultPage extends Utils
{

    private By _registeredUserShouldSuccess = By.xpath("//div[@class=\"result\"]");
    String expexted = "Your message has been sent.";

    public void RegisteredUserShouldbeAbleToReferToAFriend()
    {
        assertURL("productemailafriend/37");
        assertTextMessage("You should be Registered Customer to Refer to a Friend", expexted,_registeredUserShouldSuccess);
    }





}
