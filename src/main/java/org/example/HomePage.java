package org.example;
import org.openqa.selenium.By;

public class HomePage extends Utils{
    private By _registerlink = By.xpath("//a[text()=\"Register\"]");



    public void clickOnRegisterButton()
    {
        clickonElement(_registerlink);

    }
}
