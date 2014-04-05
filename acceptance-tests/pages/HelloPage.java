package pages;

import static support.Driver.getCurrentDriver;

public class HelloPage extends BasePage {

    protected String getUri() {
        return "http://localhost:8080/skeleton/hello";
    }

    public void access() {
        getCurrentDriver().get(getUri());
    }

    public String getTitle() {
       return getCurrentDriver().getTitle();
    }
}
