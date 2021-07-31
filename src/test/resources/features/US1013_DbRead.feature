

Feature: Kullanici Koala Resort Hotels veritabanina baglanir

    @dbread
    Scenario:TC_21 kullanici veri okur
        Given kullanici Koala Resort Hotels veritabanina baglanir
        And kullanici "tHOTELROOM" tablosundaki "Price" verilerini alir
        And kullanici "Price" sutunundaki verileri okur
