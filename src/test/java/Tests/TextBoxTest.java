package Tests;

import Base.BaseTest;
import Pages.TextBoxPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TextBoxTest extends BaseTest {

    String fullName = "Marko Markovic";
    String email = "marko.mar@neki.co.rs";
    String currentAddress = "Mokroluska 12";
    String permanentAddress = "Kataniceva 4";

    @BeforeEach
    public void pageSetUp() {
        driver.navigate().to("https://demoqa.com/");
    }

    @Test
    public void Test() {
        homePage.clickOnElementsCard();
//        homePage.clickOnCard("Forms"); // Poziv metode sa prosledjivanjem trazeneog elemetna liste
        pageSidebar.clickOnSidebarButton("Text Box");
        textBoxPage.inputFullName(fullName);
        textBoxPage.inputEmail((email));
        textBoxPage.inputCurrentAddress(currentAddress);
        textBoxPage.inputPermanentAddress(permanentAddress);
        textBoxPage.clickOnSubmitButton();

        assertTrue(textBoxPage.getOutput().isDisplayed());
        assertEquals(textBoxPage.getOutput().getText(), "Name:Marko Markovic\n" +
//                "\n" +
                "Email:marko.mar@neki.co.rs\n" +
//                "\n" +
                "Current Address :Mokroluska 12\n" +
//                "\n" +
                "Permananet Address :Kataniceva 4");

    }
}
