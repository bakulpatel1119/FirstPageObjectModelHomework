package org.example;
import org.openqa.selenium.By;

public class RegistrationPage extends Utils {
    private By _firstName = By.id("FirstName");
    private By _lastName = By.id("LastName");
    public By _email = By.xpath("//input[@id=\"Email\"]");
    private By _password = By.id("Password");
    private By _confirmPassword = By.xpath("//input[@id=\"ConfirmPassword\"]");
    private By _registerButton = By.id("register-button");
    private String firstName = "Abc"+timeStamp;
    private String lastName = "Xyz"+timeStamp;
    private static String timeStamp = timeStamp();

    public void userEnterRegistrationDetails()
    {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //enter firstname
        enterText(_firstName, firstName);
        //enter last name
        enterText(_lastName, lastName);
        //enter email address
        enterText(_email, "test1"+timeStamp+"@test.com");
        //enter password
        enterText(_password, "test1234");
        //enter confirm password
        enterText(_confirmPassword, "test1234");
        //click on register button
        clickonElement(_registerButton);
    }
}