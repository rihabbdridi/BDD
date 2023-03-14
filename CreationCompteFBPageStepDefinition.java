package PageStepDefinition;

import org.openqa.selenium.WebDriver;

import Hooks.Setup;
import PageObject.CreationCompteFBPageObject;
import io.cucumber.java.en.*;

public class CreationCompteFBPageStepDefinition {

	public static WebDriver driver = Setup.driver;
	private CreationCompteFBPageObject Sprint = new CreationCompteFBPageObject(driver);

	@Given("ouvrir l URL")
	public void ouvrir_l_url() {
		driver.navigate().to("https://www.facebook.com");

	}

	@Given("Cliquer sur creer nv compte")
	public void cliquer_sur_creer_nv_compte() {
		Sprint.CREATION();
	}

	@When("Entrer nom")
	public void entrer_nom() {
		Sprint.SaisirNom();
	}

	@When("Entrer prenom")
	public void entrer_prenom() {
		Sprint.SaisirPRENOM();
	}

	@When("Entrer email")
	public void entrer_email() {
		Sprint.mail();
	}

	@When("confirmer email")
	public void confirmer_email() {
		Sprint.confmail();
	}

	@When("entrer mot de passe")
	public void entrer_mot_de_passe() {
		Sprint.PASSWORD();
	}

	@When("entrer date de naissance")
	public void entrer_date_de_naissance() {
		Sprint.DAY();
		Sprint.MOIS();
		Sprint.YEAR();
	}

	@When("selectionner genre")
	public void selectionner_genre() {
		Sprint.Genre();
	}

	@When("cliquer inscription")
	public void cliquer_inscription() {
		Sprint.cliquer();
	}

	@Then("compte cree")
	public void compte_cree() {
		System.out.println("test ok");
	}

}
