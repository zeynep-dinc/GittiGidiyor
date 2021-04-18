package ZeynepDinc.KayitTest_GG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MyBase extends MyVariable {
	

	public void beforeTestProcess() {
		System.getProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(getUrl());
		actions=new Actions(driver);
		actions.sendKeys(Keys.ESCAPE).build().perform();
	}
	
	@SuppressWarnings("deprecation")
	public void kullaniciGirisi() throws Exception {
		loginRegisterButton=driver.findElement(By.xpath(getLoginRegisterXPath()));
		loginRegisterButton.click();
		loginRegisterButton.click();
		bekle(1);
		loginButton=driver.findElement(By.xpath(getLoginXPath()));
		loginButton.click();
		bekle(5);
		actions=new Actions(driver);
		actions.sendKeys(getEmail()).build().perform();
		bekle(2);
		actions.sendKeys(Keys.ENTER).build().perform();
		actions.sendKeys(Keys.TAB).build().perform();
		actions.sendKeys(getPass()).build().perform();
		bekle(2);
		actions.sendKeys(Keys.ENTER).build().perform();
		bekle(5);
		actions.sendKeys(Keys.ESCAPE).build().perform();
		bekle(2);
		cancelButton=driver.findElement(By.xpath(getCancelPath()));
		cancelButton.click();
		nameControl=driver.findElement(By.xpath(getNameControlPath()));
	}
	
	public void ikinciSayfayaGec() {
		actions=new Actions(driver);
		actions.sendKeys(Keys.ESCAPE).build().perform();
		searchBoxText=driver.findElement(By.xpath(getSearchBoxPath()));
		searchBoxText.click();
		searchBoxText.sendKeys("Bilgisayar");
		searchBoxText.sendKeys(Keys.ENTER);
		WebElement ikinciSayfa = driver.findElement(By.xpath(getIkinciSayfaXPath()));
		if (!ikinciSayfa.isEnabled()) {
			actions.sendKeys(Keys.PAGE_DOWN).build().perform();
		}
		ikinciSayfa.click();
	}
	
	public void fiyatBak() throws Exception {
		ilkUrun=driver.findElement(By.xpath(getIlkUrunXPath()));
		ilkFiyat=ilkUrun.getText();
		ilkUrun.click();
		bekle(5);
		arttir=driver.findElement(By.xpath(getUrunArttirXPath()));
		arttir.click();
		sepeteEkle=driver.findElement(By.xpath(getSepeteEkleXPath()));
		sepeteEkle.click();
		sepeteEkleIcon=driver.findElement(By.xpath(getSepetIconXPath()));
		sepeteEkleIcon.click();
		bekle(5);
		odenecekFiyat=driver.findElement(By.xpath(getOdenecekFiyatXPath())).getText();
		System.out.println("Ödenecek Tutarı buldu.");
		bekle(1);
		odenecekFiyat=odenecekFiyat.replace(".","").replace("TL", "").trim();
		System.out.println("Ödenecek Tutar= "+odenecekFiyat);
		ilkFiyat=ilkFiyat.replace(".","").replace("TL", "").trim();
		System.out.println("İlk Fiyat ="+ilkFiyat);
		Float tane=Float.parseFloat(odenecekFiyat.replace(",", "."))/Float.parseFloat(ilkFiyat.replace(",", "."));
		System.out.println(tane.toString());
		if(tane==2) {
			System.out.println("Ek indirim yok");
		}
		else if(tane<2)
		{
			System.out.println("Ek indirim var.");
		}
		else {
			System.out.println("Önceden ürün kalmış");
		}
	}
	
	public void sepetiBosalt() throws Exception {
		urunSil=driver.findElement(By.xpath(getUrunSilXPath()));
		urunSil.click();
		bekle(10);
		sepetBosBildirim=driver.findElement(By.xpath(getSepetBosBildirimXPath()));
		System.out.println("Sepet Boş bulundu.");
		bekle(5);
		sepetBosMesaj=sepetBosBildirim.getText();
		bekle(2);
		System.out.println("İçeriği: "+sepetBosMesaj);
		bekle(2);
	}
	
	void testBitir() {
		driver.close();
	}
}
