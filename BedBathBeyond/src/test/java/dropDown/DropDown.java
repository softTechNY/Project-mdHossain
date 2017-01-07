package dropDown;

import core.DropdownMethods;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by JHANGIR on 1/7/2017.
 */
public class DropDown extends DropdownMethods {
    //@Test (priority = 3)
    @Test
    public void DropDown() throws NullPointerException, InterruptedException {
        driver.get("www.bedbathandbeyond.com");
        DropdownMethods drop = PageFactory.initElements(driver, DropdownMethods.class);
        clickDropDownMenuXpath();

        for (int i = 1; i < 15; i++) {
            clickByXpath(".//*[@id='globalSearchForm']/div[1]/ul/li[+]/span");
        }
    }
}

