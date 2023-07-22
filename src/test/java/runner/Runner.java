package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (
        plugin = {
                "pretty", //raporlarin daha okunakli olmasi icin
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failed_scenarios.txt",
        },
        monochrome=true, //raporlarin konsolda okunakli sekilde cikmasi icin

        features="./src/test/resources/features/DB_Features",
        glue= {"stepdefinitions", "hooks"},
        tags="@db"  ,

        dryRun= false
)

public class Runner {

}
//Bu sinif Test caseleri RUN etmek icin kullanilir
//Ve konfigurasyonlar icin kullanilir
//Runner class,feature file lar ile step definitions i birbirine baglar