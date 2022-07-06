package implementations.pageObjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.*;

public class LoginPage extends AbstractBasePage {
    private SelenideElement emailField = $(byName("username"));
    private SelenideElement passwordField = $(byName("password"));
    private SelenideElement logInButton = $(by("type", "submit"));


    public void openYieldmoWebsite(String webSite) {
        open(webSite);
        clearBrowserCookies();
        clearBrowserLocalStorage();
    }

    public void loginToTheWebsite(String email, String password) {
        emailField.setValue(email);
        passwordField.setValue(password);
        logInButton.click();
    }
}
