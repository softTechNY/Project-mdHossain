package core;

import CommonAPI.BaseBlock;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by JHANGIR on 1/7/2017.
 */
public class DropdownMethods extends BaseBlock{
    @FindBy (how = How.XPATH, using = ".//*[@id='globalSearchForm']/div[1]/a")
    public static WebElement ddmenu;
    public void  clickDropDownMenuXpath() {ddmenu.click(); }

    public void clickOnItem(int i) throws  NullPointerException {
        driver.findElement(By.xpath(".//*[@id='globalSearchForm']/div[1]/ul/li["+i+"]/span")).click();}
}
