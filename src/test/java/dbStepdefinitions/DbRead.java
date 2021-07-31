package dbStepdefinitions;

import io.cucumber.java.en.Given;

import java.sql.*;

public class DbRead {

    String url= "jdbc:sqlserver://184.168.194.58:1433;databaseName=ph17934033561_fhctripdb; user=fhctipdb_user;password=P2s@rt65";
    String username="fhctipdb_user";
    String password="P2s@rt65";
    Connection connection;
    Statement statement;
    ResultSet resultSet;


    @Given("kullanici Koala Resort Hotels veritabanina baglanir")
    public void kullanici_koala_resort_hotels_veritabanina_baglanir() throws SQLException {

        connection= DriverManager.getConnection(url, username, password);
        statement=connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    }

    @Given("kullanici {string} tablosundaki {string} verilerini alir")
    public void kullanici_tablosundaki_verilerini_alir(String table, String field) throws SQLException {

        String readQuery= "SELECT "+field+" FROM dbo."+table;
        // database olusturan developer'lar bazen ekstra guvenlik onlemleri ekleyebilirler
        // bunu da devops veya database developer ekibinin bize vermesi lazim
        resultSet=statement.executeQuery(readQuery);
    }
    @Given("kullanici {string} sutunundaki verileri okur")
    public void kullanici_sutunundaki_verileri_okur(String field) throws SQLException {

        // tum price verilerim resultSet'e yuklendi

        resultSet.first(); // resultSet'i 1. dataya goturur onunde bekler
        Object ilkSatirdakiObje=resultSet.getObject(field);
        System.out.println(ilkSatirdakiObje.toString());

        resultSet.next();
        Object ikinciSatirdakiObje=resultSet.getObject(field);
        System.out.println(ikinciSatirdakiObje.toString());

        // 5.ye gidelim
        resultSet.absolute(5);

        Object besinciSatirdakiObje=resultSet.getObject(field);
        System.out.println(besinciSatirdakiObje.toString());


        // tum listeyi yazdirmak istersem
        // once ilk satira gitmeliyiz
        resultSet.absolute(0);
        Object satirdakiObje=null;

        System.out.println("======Tum liste======");
        while (resultSet.next()){
            satirdakiObje= resultSet.getObject(field);
            System.out.println(satirdakiObje.toString());

        }

    }
}
