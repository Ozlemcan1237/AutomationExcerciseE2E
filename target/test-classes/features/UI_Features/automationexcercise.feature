@login
Feature: Automation Excercies Login

  Scenario: TC01_Automation_Excercies_Sitesine_Login_Ol

    Given Kullanici "http://automationexercise.com/" URL'sine gider
    And Kullanici Ana sayfanın basarıyla gorundugunu dogrular
    And Kullanici Signup_Login butonuna tiklar
    And Kullanici Email Address text box'na valid bir deger girer
    And Kullanici Password text box'ina valid bir deger girer
    And Kullanici Login butonuna tiklar
    And Kullanici Products butonuna tiklar
    And Kullanici products sayfasından bir urun secer
    And Kullanici acılan pencereden View Cart butonuna tiklar
    And Kullanici sepetteki urun saysısını dogrular
    And Kullanici Proceed To Checkout butonuna tiklar
    And Kullanici adres bilgilerinin gorundugunu dogrular
    And Kullanici text box kutusuna gondermek istedigi mesajı yazar
    Then Kullanici Place Order butonuna tiklar