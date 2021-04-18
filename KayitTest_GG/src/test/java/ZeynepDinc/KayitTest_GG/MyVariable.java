package ZeynepDinc.KayitTest_GG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public abstract class MyVariable {
	WebDriver driver;
	Actions actions;
	
	private String email="deenizyilmaz7@gmail.com";
	private String pass="GittiGifdyor1";
	private String url="https:\\www.gittigidiyor.com";
	protected String ilkFiyat;
	protected String odenecekFiyat;
	protected String sepetBosMesaj;
	
	private String loginRegisterXPath="(//*[contains(text(),'Giriş Yap')])[last()]";
	private String loginXPath="//div[2]/div[1]/div[1]/div[1]/a[1]";
	private String cancelPath="//section[1]/a[1]";
	private String nameControlPath="//span[contains(text(),'denizyilmaz145942')]";
	private String searchBoxPath="(//input[@name='k'])[last()]";
	private String ikinciSayfaXPath="//a[contains(text(),'2')]";
	private String ilkUrunXPath="(//p[@class='extra-price'])[1]";
	private String urunArttirXPath="(//a[@class='IncNumber gg-icon gg-icon-plus'])";
	private String sepeteEkleXPath="//button[@id='add-to-basket']";
	private String sepetIconXPath="//div[@class='icon-sepet-line-wrapper']";
	private String odenecekFiyatXPath="//p[@class='new-price']";
	private String urunSilXPath="(//i[@class='gg-icon gg-icon-bin-medium'])[1]";
	private String sepetBosBildirimXPath="(//*[contains(text(),'Sepetinizde ürün bulunmamaktadır.')])";

	protected WebElement nameControl;
	protected WebElement cancelButton;
	protected WebElement loginButton;
	protected WebElement loginRegisterButton;
	protected WebElement searchBoxText;
	protected WebElement ilkUrun;
	protected WebElement arttir;
	protected WebElement sepeteEkle;
	protected WebElement sepeteEkleIcon;
	protected WebElement urunSil;
	protected WebElement sepetBosBildirim;
	

	
	@SuppressWarnings("deprecation")
	protected void bekle(long sure) {
		driver.manage().timeouts().implicitlyWait(sure,TimeUnit.SECONDS);
	}
	
	protected String getEmail() {
		return email;
	}
	
	protected String getPass() {
		return pass;
	}
	
	protected String getUrl() {
		return url;
	}
	
	protected String getLoginRegisterXPath() {
		return loginRegisterXPath;
	}
	
	protected String getLoginXPath() {
		return loginXPath;
	}
	
	protected String getCancelPath() {
		return cancelPath;
	}
	
	protected String getNameControlPath() {
		return nameControlPath;
	}
	
	protected String getSearchBoxPath() {
		return searchBoxPath;
	}
	
	protected String getIkinciSayfaXPath() {
		return ikinciSayfaXPath;
	}

	protected String getIlkUrunXPath() {
		return ilkUrunXPath;
	}
	
	protected String getUrunArttirXPath() {
		return urunArttirXPath;
	}	

	protected String getSepeteEkleXPath() {
		return sepeteEkleXPath;
	}

	protected String getSepetIconXPath() {
		return sepetIconXPath;
	}
	
	protected String getOdenecekFiyatXPath() {
		return odenecekFiyatXPath;
	}

	protected String getUrunSilXPath() {
		return urunSilXPath;
	}

	protected String getSepetBosBildirimXPath() {
		return sepetBosBildirimXPath;
	}

}
