package implementations.pageObjects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$x;

public class ActivateThisDealWarningPopUp extends AbstractBasePage{
    private SelenideElement warningPageInfoIcon = $x("//*[@data-testid='InfoOutlinedIcon']");
    private SelenideElement cancelButton =  $x("//button[normalize-space()='Cancel']");

    private String warningItemOfTheList = "//li/p[contains(text(),'%s')]";

    public void verifyIfWarningMessageInActiveDealsIsOpened(){
        warningPageInfoIcon.shouldBe(Condition.visible);
    }

    public void verifyIfMissingMandatoryFieldIsPresentInTheWarning(String mandatoryFieldName){
        $x(formatElementXpath(warningItemOfTheList,mandatoryFieldName)).shouldBe(Condition.visible);
    }

    public void clickCancelButton(){
        cancelButton.click();
    }

}
