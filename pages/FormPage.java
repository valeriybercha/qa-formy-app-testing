import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormPage {
    public static void submitForm(WebDriver driver) {
        WebElement firstName = driver.findElement(By.id("first-name"));
        firstName.sendKeys("Vali");

        WebElement lastName = driver.findElement(By.id("last-name"));
        lastName.sendKeys("Ber");

        WebElement jobTitle = driver.findElement(By.id("job-title"));
        jobTitle.sendKeys("QA Tester");

        WebElement radioButton = driver.findElement(By.id("radio-button-2"));
        radioButton.click();

        WebElement checkbox = driver.findElement(By.id("checkbox-1"));
        checkbox.click();

        WebElement dropdownMenu = driver.findElement(By.id("select-menu"));
        dropdownMenu.click();

        WebElement dropdownSelect = driver.findElement(By.cssSelector("option[value='1']"));
        dropdownSelect.click();

        WebElement sendDate = driver.findElement(By.id("datepicker"));
        sendDate.sendKeys("01/01/1986");
        sendDate.sendKeys(Keys.RETURN);

        WebElement submitButton = driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary"));
        submitButton.click();
    }
}
