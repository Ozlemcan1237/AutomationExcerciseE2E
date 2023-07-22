@db
Feature: Personel Tablosu DB Dogrulama

  Scenario: Personel_Tablosundan_Isim_Getirme
    Given Kullanici Personel tablosuna gider
    Then Isim dogrulamasi yapar