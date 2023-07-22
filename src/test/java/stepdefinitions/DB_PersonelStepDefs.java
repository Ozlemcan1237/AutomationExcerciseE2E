package stepdefinitions;

import io.cucumber.java.en.*;

import java.sql.*;

import static org.junit.Assert.assertEquals;

public class DB_PersonelStepDefs {
    ResultSet resultSet;
    Connection connection;
    Statement statement;

    @Given("Kullanici Personel tablosuna gider")
    public void kullanici_personel_tablosuna_gider() throws SQLException {
        connection = DriverManager.
                getConnection("jdbc:postgresql://localhost:5432/Techpro", "postgres", "asdfghjkl");
        statement = connection.createStatement();
        resultSet = statement.executeQuery("select isim from personel where isim='Mehmet Ozturk'");
        resultSet.next();
    }
    @Then("Isim dogrulamasi yapar")
    public void ısim_dogrulamasi_yapar() throws SQLException {
        assertEquals("Mehmet Ozturk",resultSet.getString("isim"));

        connection.close();
        statement.close();
        resultSet.close();
    }

}
