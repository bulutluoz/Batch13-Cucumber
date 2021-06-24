package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DemoGuruPage {
    public DemoGuruPage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public String istenenHucreBilgisiniDondur(int satirNo, int sutunNo){

        String istenenHucredekiYazi="";

        // dinamik olmayan xpath  ((//tbody//tr)[2]//td)[2]
        // dinamik olmasi icin   ((//tbody//tr)[  2   ]//td)[    2   ]

        String dinamikXpath= "((//tbody//tr)[" + satirNo +  "]//td)[" + sutunNo + "]";

        istenenHucredekiYazi=Driver.getDriver().findElement(By.xpath(dinamikXpath)).getText();



        return istenenHucredekiYazi;
    }
}
