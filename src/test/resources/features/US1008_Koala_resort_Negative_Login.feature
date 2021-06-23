Feature: US1008_Koala Resort Negative Login

Scenario: TC12 kullanici gecersiz bilgilerle giris yapamaz


Given kullanici "kr_url" sayfasina gider
Then Log in yazisina tiklar
And kullanici ismi olarak "kr_gecersiz_username" girer
And kullanici sifresi olarak "kr_gecersiz_password" girer
And Login butonuna basar
Then sayfaya giris yapamadigini kontrol eder
And sayfayi kapatir