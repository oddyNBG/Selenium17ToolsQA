package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class PageSidebar {

    public WebDriver driver;
    public WebDriverWait wait;
    WebElement sidebarButton;

    public PageSidebar(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public List<WebElement> getSidebarButton() {
        return driver.findElements(By.className("text"));
    }

//    ************************************

    public void clickOnSidebarButton(String buttonName) {
        for (int i = 0; i < getSidebarButton().size(); i++) {
            if(getSidebarButton().get(i).getText().equals(buttonName)) {
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", getSidebarButton().get(i));
                getSidebarButton().get(i).click();
                break;
            }
        }
    }

}
