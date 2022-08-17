package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PracticeFormPage {

    public PracticeFormPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "firstName")
    public WebElement firstnameBox;

    @FindBy(id = "lastName")
    public WebElement lastnameBox;

    @FindBy(xpath = "//input[@id='userEmail']")
    public WebElement emailBox;

    @FindBy(xpath = "(//div[@class='col-md-9 col-sm-12'])[2]")
    public WebElement gennderBtns;

    @FindBy(xpath = "//input[@value='Male']")
    public WebElement maleBtn;

    @FindBy(xpath = "//input[@id='gender-radio-2']")
    public WebElement femaleBtn;

    @FindBy(xpath = "//input[@id='gender-radio-3']")
    public WebElement otherBtn;

    @FindBy(xpath = "//input[@id='userNumber']")
    public WebElement mobileNumberBox;

    @FindBy(xpath = "//input[@id='dateOfBirthInput']")
    public WebElement dateOfBirthBox;

    @FindBy(xpath = "//select[@class='react-datepicker__month-select']")
    public WebElement monhtsBox;

    @FindBy(xpath = "//select[@class='react-datepicker__year-select']")
    public WebElement yearsBox;

    @FindBy(xpath = "//div[@aria-label='Choose Monday, March 22nd, 1993']")
    public WebElement day;

    @FindBy(xpath = "//input[@id='subjectsInput']")
    public WebElement subjectsBox;

    @FindBy(xpath = "//label[@for='hobbies-checkbox-1']")
    public WebElement sportBtn;

    @FindBy(xpath = "//label[@for='hobbies-checkbox-2']")
    public WebElement readingBtn;

    @FindBy(xpath = "//label[@for='hobbies-checkbox-3']")
    public WebElement musicBtn;

    @FindBy(xpath = "//input[@id='uploadPicture']")
    public WebElement fileUploadBtn;

    @FindBy(xpath = "//textarea[@id='currentAddress']")
    public WebElement addressTextBox;

    @FindBy(xpath = "(//div[@class=' css-1hwfws3'])[1]")
    public WebElement stateSelect;

    @FindBy(xpath = "(//div[@class=' css-1hwfws3'])[2]")
    public WebElement citySelect;

    @FindBy(xpath = "//button[@id='submit']")
    public WebElement submitBtn;











}
