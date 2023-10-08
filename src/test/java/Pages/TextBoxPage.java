package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextBoxPage {

    public WebDriver driver;
    public WebDriverWait wait;
    WebElement fullNameField;
    WebElement emailField;
    WebElement currentAddressField;
    WebElement permanentAddressField;
    WebElement submitButton;

    WebElement output;

    public TextBoxPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public WebElement getFullNameField() {
        return driver.findElement(By.id("userName"));
    }

    public WebElement getEmailField() {
        return driver.findElement(By.id("userEmail"));
    }

    public WebElement getCurrentAddressField() {
        return driver.findElement(By.id("currentAddress"));
    }

    public WebElement getPermanentAddressField() {
        return driver.findElement(By.id("permanentAddress"));
    }

    public WebElement getSubmitButton() {
        return driver.findElement(By.id("submit"));
    }

    public WebElement getOutput() {
        return driver.findElement(By.id("output"));
    }

    //    ****************************

    public void inputFullName(String fullName) {
        getFullNameField().clear();
        getFullNameField().sendKeys(fullName);
    }

    public void inputEmail(String email) {
        getEmailField().clear();
        getEmailField().sendKeys(email);
    }

    public void inputCurrentAddress(String currentAddress) {
        getCurrentAddressField().clear();
        getCurrentAddressField().sendKeys(currentAddress);
    }

    public void inputPermanentAddress(String permanentAddress) {
        getPermanentAddressField().clear();
        getPermanentAddressField().sendKeys(permanentAddress);
    }

    public void clickOnSubmitButton() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", getSubmitButton());
        getSubmitButton().click();
    }




}
