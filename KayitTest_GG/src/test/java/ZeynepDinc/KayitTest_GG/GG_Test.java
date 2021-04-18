package ZeynepDinc.KayitTest_GG;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GG_Test extends MyBase {

	@Before
	public void setUp() throws Exception {
		beforeTestProcess();
		Assert.assertEquals("GittiGidiyor - Türkiye'nin Öncü Alışveriş Sitesi",driver.getTitle());
	}

	@After
	public void tearDown() throws Exception {
		testBitir();
	}

	@Test
	public void test() throws Exception {
		kullaniciGirisi();
		Assert.assertTrue(nameControl.getText().contains("denizyilmaz145942"));
		System.out.println("Kullanıcı Giriş ve Doğrulama işlemi başarılı.");
		ikinciSayfayaGec();
		Assert.assertEquals("Bilgisayar - GittiGidiyor - 2/100", driver.getTitle());
		System.out.println("2. sayfa açıldı ve doğrlanndı.");
		fiyatBak();
		System.out.println("Fiyat karşılaştırma ve çıkarım yapma işlemi tamamlandı.");
		sepetiBosalt();
		Assert.assertTrue(sepetBosBildirim.getText().contains("Sepetinizde ürün bulunmamaktadır."));
		System.out.println("Sepet boşltma işlemi yapıldı.");
	}

}
