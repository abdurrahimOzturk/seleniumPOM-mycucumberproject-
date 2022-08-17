package stepdefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.*;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.PracticeFormPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;

import static org.openqa.selenium.Keys.CONTROL;

public class PracticeFormSteps {

    PracticeFormPage practiceFormPage = new PracticeFormPage();



    @Given("user goes to toolsQA website practice form url")
    public void user_goes_to_tools_qa_website_practice_form_url() {
        Driver.getDriver().get(ConfigReader.getProperty("practice_form_url"));

    }


    @Given("User provide valid {string} and {string}")
    public void user_provide_valid_and(String firstname, String lastname) {
        practiceFormPage.firstnameBox.sendKeys(firstname);
        practiceFormPage.lastnameBox.sendKeys(lastname);

    }

    @Given("User provide valid {string}")
    public void user_provide_valid(String email) {

        practiceFormPage.emailBox.sendKeys(email);

    }

    @Given("User click gender")
    public void user_click_gender() {
        //Driver.waitForClickablility(practiceFormPage.maleBtn,10);
        //practiceFormPage.maleBtn.click();
        JSUtils.clickElementByJS(practiceFormPage.maleBtn);



    }

    @Given("User provide valid mobile number {string}")
    public void user_provide_valid_mobile_number(String mobileNumber) {
        practiceFormPage.mobileNumberBox.sendKeys(mobileNumber);
    }

    @Given("User provide valid date of birth {string}")
    public void user_provide_valid_date_of_birth(String dateOfBirth) {
        practiceFormPage.dateOfBirthBox.click();



        Select monhts = new Select(practiceFormPage.monhtsBox);
        monhts.selectByVisibleText("March");

        Select years = new Select(practiceFormPage.yearsBox);
        years.selectByVisibleText("1993");
        practiceFormPage.day.click();





    }

    @Given("User write {string}")
    public void user_write(String subjects) {

        JSUtils.scrollDownByJS();
        Driver.wait(4);
        practiceFormPage.subjectsBox.click();
        Driver.wait(2);
        practiceFormPage.subjectsBox.sendKeys("M");
        practiceFormPage.subjectsBox.sendKeys(Keys.TAB);

        //practiceFormPage.subjectsBox.sendKeys(subjects+Keys.ENTER);
        //Actions action = new Actions(Driver.getDriver());
        //action.keyDown(Keys.ENTER);

    }

    @Given("User click valid hobby")
    public void user_click_valid_hobby() {
        practiceFormPage.sportBtn.click();
    }

    @Given("User sends photo")
    public void user_sends_photo() {

        practiceFormPage.fileUploadBtn.sendKeys("C:\\Users\\user\\Downloads\\cat.jpg");

    }

    @Given("User provide valid address")
    public void user_provide_valid_address() {
        Faker faker = new Faker();

        practiceFormPage.addressTextBox.sendKeys(faker.address().fullAddress());
    }

    @Given("User choose valid state and city")
    public void user_choose_valid_state_and_city() {

        //Driver.getDriver().manage().window().minimize();
        //Driver.getDriver().manage().window().setSize(new Dimension(900,12900));


        //practiceFormPage.stateSelect.click();
        //practiceFormPage.stateSelect.sendKeys("Ncr");
        //practiceFormPage.stateSelect.sendKeys(Keys.TAB);
        //practiceFormPage.citySelect.sendKeys(Keys.TAB);


    }

    @Then("User summit it")
    public void user_summit_it() {
        practiceFormPage.stateSelect.click();
        practiceFormPage.submitBtn.click();
    }



}
