package ebayPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ebayMainPO {
    // ------- este searchbutton despliega el teclado --------- !
    @FindBy(how = How.ID,using = "com.ebay.mobile:id/search_box")
    private WebElement searchBox;
    // ------- este searchButton toma el imput a buscar --------- !
    @FindBy(how = How.XPATH,using = "com.ebay.mobile:id/search_src_text")
    private WebElement searchBoxTxt;

    @FindBy(how = How.ID,using = "com.ebay.mobile:id/home")
    private WebElement menuOption;
    @FindBy(how = How.ID,using = "com.ebay.mobile:id/action_view_icon")
    private WebElement shopingCart;
    @FindBy(how = How.ID,using = "com.ebay.mobile:id/logo")
    private WebElement ebayLogo;
    @FindBy(how = How.XPATH,using = "//android.widget.TextView[@content-desc=\"Selling button\"]")
    private WebElement buttonSelling;
    @FindBy(how = How.XPATH,using = "\t//android.widget.TextView[@content-desc=\"Deals button\"]")
    private WebElement buttonDeals;
    @FindBy(how = How.XPATH,using = "//android.widget.TextView[@content-desc=\"Categories button\"]")
    private WebElement buttonCateg;
    @FindBy(how = How.XPATH,using = "\t//android.widget.Button[@content-desc=\"See All Trends\"]")
    private WebElement seeAllTrends;

    public ebayMainPO(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

}
