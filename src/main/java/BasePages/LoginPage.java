package BasePages;

import org.openqa.selenium.By;

public class LoginPage {
    public static By email_field = By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]");
    public static By password_field = By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/input[1]");
    public static By continue_btn = By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[4]/button[1]");
    public static By gotoCart = By.xpath("//span[contains(text(),'Cart')]");
}
