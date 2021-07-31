package dbStepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.DBUtils;

import java.sql.SQLException;

public class DBUtilsStepdefinitions {
    @Given("user DBU Koala Resort Hotels veritabanina baglanir")
    public void user_dbu_koala_resort_hotels_veritabanina_baglanir() {
        DBUtils.getConnection();

    }

    @Given("user DBU {string} tablosundaki {string} verilerini alir")
    public void user_dbu_tablosundaki_verilerini_alir(String table, String field) {

        String readQuery= "SELECT "+field+" FROM dbo."+table;
        DBUtils.executeQuery(readQuery);

    }
    @Given("user DBU {string} sutunundaki verileri okur")
    public void user_dbu_sutunundaki_verileri_okur(String field) throws SQLException {

        DBUtils.getResultset().first();
        Object ilkSatirdakiObje= DBUtils.getResultset().getObject(field);
        System.out.println(ilkSatirdakiObje.toString());
    }

    @And("user DBU {string} tablosundaki {string} verilerini listeler")
    public void userDBUTablosundakiVerileriniListeler(String table, String field) throws Exception {

        int satirSayisi= DBUtils.getRowCount();
        DBUtils.getResultset().first();
        int satirNo=DBUtils.getResultset().getRow(); // bu method calistiginda resultset'in nerede oldugunu bilmemiz lazim
                                                    // supriz olmamasi icin 1.satira yolladim

        Object SatirdakiObje=null;


        while (satirNo<=satirSayisi){

            SatirdakiObje=DBUtils.getResultset().getObject(field);
            System.out.println(satirNo+". satirdaki email : " + SatirdakiObje.toString());

            DBUtils.getResultset().next();
            satirNo++;

        }




    }

    @Then("DBU IDHotel degeri {int} olan kaydin Email bilgisinin {string} oldugunu test eder")
    public void dbuIDHotelDegeriOlanKaydinEmailBilgisininOldugunuTestEder(int satirNo, String expectedDeger) throws SQLException {

        DBUtils.getResultset().absolute(2);
        String actualDeger=DBUtils.getResultset().getObject("Email").toString();

        Assert.assertEquals(expectedDeger,actualDeger);

    }

    @Then("DBU IDHotel degeri {int} olan kaydin Email degerini {string} yapar")
    public void dbuIDHotelDegeriOlanKaydinEmailDegeriniYapar(int satirNo, String yeniEmail) {

        String updateQuery="UPDATE dbo.tHOTELROOM SET Email='"+yeniEmail+"' WHERE IDHotel="+satirNo;
        DBUtils.executeQuery(updateQuery);
    }
}
