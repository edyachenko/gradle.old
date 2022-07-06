package implementations.pageObjects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selenide.$;

public class HomePage extends AbstractBasePage{
 private SelenideElement activeDealsLeftMenuLink = $(byLinkText("Active Deals"));
 private SelenideElement title = $("title");

 public void navigateToActiveDeals() {
  activeDealsLeftMenuLink.should(Condition.appear);
  activeDealsLeftMenuLink.click();
  title.shouldHave(text("Active Deals"));
 }
}
