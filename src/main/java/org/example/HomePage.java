package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends Utils{
    private By _registerlink = By.xpath("//a[text()=\"Register\"]");



    public void clickOnRegisterButton()
    {
        clickonElement(_registerlink);

    }







}
