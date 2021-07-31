

Feature: Db With DBUtils

    @readDBU
    Scenario: Kullanici Koala Resort Hotel tablosundan price verilerini alir
        Given user DBU Koala Resort Hotels veritabanina baglanir
        And user DBU "tHOTELROOM" tablosundaki "Price" verilerini alir
        And user DBU "Price" sutunundaki verileri okur

    @listele
    Scenario: Kullanici tHOTEL tablosundan mail fieldini test eder
        Given user DBU Koala Resort Hotels veritabanina baglanir
        And user DBU "tHOTEL" tablosundaki "EMail" verilerini alir
        And user DBU "tHOTEL" tablosundaki "EMail" verilerini listeler

    @readTestDBU
    Scenario: Kullanici tHOTEL tablosundan mail fieldini test eder
        Given user DBU Koala Resort Hotels veritabanina baglanir
        And user DBU "tHOTEL" tablosundaki "EMail" verilerini alir
        Then DBU IDHotel degeri 2 olan kaydin Email bilgisinin "email2" oldugunu test eder

    # tum testler icin yapmamiz gereken
    # 1- database'e baglanmak DBUtils.getConnection();
    # 2- query calistirmak string olarak query yazip sonra DBUtils.executeQuery(readQuery);
    # 3- DBUtils.getResultset.(ilgili method) ile istedigim degeri sutundan alip verilen expected deger ile assert edecegim

    @dbupdate
    Scenario: Kullanici tHOTEL tablosundan istedigi Emaili update eder
        Given user DBU Koala Resort Hotels veritabanina baglanir
        Then DBU IDHotel degeri 5 olan kaydin Email degerini "elveda@elveda.com" yapar
        # UPDATE tablo SET Email='elveda@elveda.com' WHERE IDHotel=5;