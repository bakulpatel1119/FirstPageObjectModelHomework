package org.example;
import org.openqa.selenium.By;

public class GuestCommentsResults extends Utils
{
    private By _assert1CommentsSuccessMessage = By.xpath("//div[text()=\"News comment is successfully added.\"]");


    // This message should be displayed if guest user successfully add comments
    String expexted = "News comment is successfully added.";


    // Verify Guest user should be able to add comments successfully
   public void verifyGuestUserSeeCommentsSuccessfulMessage() {
       assertURL("about-nopcommerce");
       assertTextMessage("Comments Not Added Successfully", expexted, _assert1CommentsSuccessMessage);

   }

}