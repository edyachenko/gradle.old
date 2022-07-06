package testrunner;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;


/*
Only Use when debugging tests in non-parallel mode , execute the task "build"
To run tests in parallel , execute the task "cucumber"
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/"},
        glue = {"stepsDefinitions"},
        tags = "@regression",
        plugin = {
                "pretty",
                "io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm"
        })
public class CukesTestRunner {

        @BeforeClass
        public static void setUp(){
                Configuration.timeout = 20000;
                Configuration.browserSize = "1600x900";
                Configuration.savePageSource = false;
                Configuration.screenshots = false;
                SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(true));
        }
}
