package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreationCompteFBPageObject {
	WebDriver driver;

	public CreationCompteFBPageObject(WebDriver driver) {
		this.driver = driver;
		// page factory
		PageFactory.initElements(driver, this);
	}
	// Identification des elemts

	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Créer nouveau compte']")
	public static WebElement Creer;

	@FindBy(how = How.NAME, using = "firstname")
	public static WebElement NOM;

	@FindBy(how = How.NAME, using = "lastname")
	public static WebElement PRENOM;

	@FindBy(how = How.NAME, using = "reg_email__")
	public static WebElement MAIL;

	@FindBy(how = How.NAME, using = "reg_email_confirmation__")
	public static WebElement CONFIRMMAIL;

	@FindBy(how = How.NAME, using = "reg_passwd__")
	public static WebElement MDP;

	@FindBy(how = How.ID, using = "day")
	public static WebElement JOUR;

	@FindBy(how = How.ID, using = "month")
	public static WebElement MOIS;

	@FindBy(how = How.ID, using = "year")
	public static WebElement ANNEE;

	@FindBy(how = How.XPATH, using = "//label[normalize-space()='Femme']")
	public static WebElement GENDER;

	@FindBy(how = How.NAME, using = "websubmit")
	public static WebElement SUBMIT;

	// Creation des methodes
	public void CREATION() {
		Creer.click();
	}

	public void SaisirNom() {
		NOM.sendKeys("RIHAB");
	}

	public void SaisirPRENOM() {
		PRENOM.sendKeys("DRIDI");
	}

	public void mail() {
		MAIL.sendKeys("rihabbdridi@yahoo.com");
	}

	public void confmail() {
		CONFIRMMAIL.sendKeys("rihabbdridi@yahoo.com");
	}

	public void PASSWORD() {
		MDP.sendKeys("12032023");
	}

	public void DAY() {
		Select SELECTD = new Select(JOUR);
		SELECTD.selectByValue("28");

	}

	public void MOIS() {
		Select SELECTM = new Select(MOIS);
		SELECTM.selectByValue("7");
	}

	public void YEAR() {
		Select SELECTY = new Select(ANNEE);
		SELECTY.selectByValue("1992");
	}

	public void Genre() {
		GENDER.click();
	}

	public void cliquer() {
		SUBMIT.click();
	}

}
