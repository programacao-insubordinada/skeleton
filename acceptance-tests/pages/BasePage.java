package pages;

import org.openqa.selenium.support.PageFactory;

import static support.Driver.getCurrentDriver;

public class BasePage {

    public static <T> T  initElements(Class<T> cast) {
        return PageFactory.initElements(getCurrentDriver(), cast);
    }

}
