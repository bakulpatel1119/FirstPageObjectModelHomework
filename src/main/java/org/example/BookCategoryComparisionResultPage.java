package org.example;

import org.openqa.selenium.By;

public class BookCategoryComparisionResultPage extends Utils
{
    private By _comparisionResults =  By.xpath("//h1[text()=\"Compare products\"]");
    String expected = "Compare products";

    public void usershouldseeComparisionResult()
    {
           waitforElementisPresent(_comparisionResults,10);
           assertURL("compareproducts");
           assertTextMessage("Compare products not successfull",expected,_comparisionResults);
    }
}





