package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HomePage {

    public WebDriver driver;
    public WebDriverWait wait;
    WebElement cards;

    public HomePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public List<WebElement> getCards() {
        return driver.findElements(By.className("card-body"));
    }

    public void clickOnElementsCard() {
        for (int i = 0; i < getCards().size(); i++) {
            if(getCards().get(i).getText().equals("Elements")) {
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", getCards().get(i));
                getCards().get(i).click();
                break;
            }
        }
    }

    public void clickOnFormCard() {
        for (int i = 0; i < getCards().size(); i++) {
            if(getCards().get(i).getText().equals("Form")) {
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", getCards().get(i));
                getCards().get(i).click();
                break;
            }
        }
    }

    public void clickOnAlertsCard() {
        for (int i = 0; i < getCards().size(); i++) {
            if(getCards().get(i).getText().equals("Alerts, Frame & Windows")) {
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", getCards().get(i));
                getCards().get(i).click();
                break;
            }
        }
    }

    public void clickOnWidgetsCard() {
        for (int i = 0; i < getCards().size(); i++) {
            if(getCards().get(i).getText().equals("Widgets")) {
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", getCards().get(i));
                getCards().get(i).click();
                break;
            }
        }
    }

    public void clickOnInteractionsCard() {
        for (int i = 0; i < getCards().size(); i++) {
            if(getCards().get(i).getText().equals("Interactions")) {
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", getCards().get(i));
                getCards().get(i).click();
                break;
            }
        }
    }

    public void clickOnBookstoreCard() {
        for (int i = 0; i < getCards().size(); i++) {
            if(getCards().get(i).getText().equals("Book Store Application")) {
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", getCards().get(i));
                getCards().get(i).click();
                break;
            }
        }
    }

//    Iznad su pojedinacno definisane metoda za izbor elementa iz liste. ispod jedna metoda, sa otvorenim izborom za unos argumenta/elementa

    public void clickOnCard(String cardName) {
        for (int i = 0; i < getCards().size(); i++) {
            if(getCards().get(i).getText().equals(cardName)) {
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", getCards().get(i));
                getCards().get(i).click();
                break;
            }
        }
    }

}
