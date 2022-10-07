package BasePages;

import org.openqa.selenium.By;

public class commonPage {
    public static By crossButton = By.xpath("//button[contains(text(),'✕')]");
    public static By firstItem = By.xpath("//div[contains(text(),'Nothing Phone (1) (Black, 128 GB)')]");
    public static By addtoCart = By.xpath("//body/div[@id='container']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/button[1]");
    public static By removeButton = By.xpath("//div[contains(text(),'Remove')]");
    public static By topOffer = By.xpath("//div[contains(text(),'Top Offers')]");
    public static By viewmore = By.xpath("//a[contains(text(),'VIEW ALL')]");
    public static By appliances = By.xpath("//body/div[@id='container']/div[1]/div[2]/div[1]/div[1]/div[7]/a[1]/div[1]/div[1]/img[1]");
    public static By beauty = By.xpath("//body/div[@id='container']/div[1]/div[2]/div[1]/div[1]/div[5]/a[1]/div[1]/div[1]/img[1]");
    public static By explorePlus = By.xpath("//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/a[2]");
    public static By becomeSeller = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/a[1]/span[1]");
    public static By carousel = By.xpath("//body/div[@id='container']/div[1]/div[3]/div[2]/div[1]/div[3]/*[1]");
    public static By removeConfirm = By.xpath("//body/div[@id='container']/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]");
    public static By gadgets = By.xpath("//body/div[@id='container']/div[1]/div[2]/div[1]/div[1]/div[2]/a[1]/div[1]/div[1]/img[1]");

}
