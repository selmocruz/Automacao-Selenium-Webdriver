package treinamento.automacao;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utils.Utils;

public class Main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//System.out.println("Hello World!!");
		
		
		//Localizar o Chromedriver e executar-lo
		System.setProperty("webdriver.chrome.webdriver", "C:\\Users\\chromedriver_win32\\chromedriver.exe");

		//Criando objeto do tipo Webdriver com nome driver Funciona como o nosso comunicador, nosso barquinho
		WebDriver driver = new ChromeDriver();
		
		//URL da aplicação, alvo dos testes
		String url ="https://www.saucedemo.com/";
		String mensagemSucesso;
		String complementMassage;
	
		
					
		//Open aplication
		driver.get(url);
		
		//Maximize browse windows
		driver.manage().window().maximize();
		
		//Print Login screenshots
		Utils.capturaPrintTela(driver," Tela de login capturada");
		
		
		//Full in user field
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		//Full in password field
		driver.findElement(By.id("password")).sendKeys("secret_sauce");		
		
		//Click login button
		driver.findElement(By.id("login-button")).click();
		
		Utils.capturaPrintTela(driver, "Tela principal - pridutoss");
		
		//Select bolsa Sauce Labs Backpack  add cart
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		
	    //Select Sauce Labs Bike Light  add cart
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		
		//Click cart
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
		
		Utils.capturaPrintTela(driver, "Purchase cart");
		
		//Remove itens cart
		driver.findElement(By.id("remove-sauce-labs-bike-light")).click();
		
		Utils.capturaPrintTela(driver, "Remove cart iten");
		
		//Check out purchase
		driver.findElement(By.id("checkout")).click();
		
		Utils.capturaPrintTela(driver, "Check out information");
		
		//Fill in  first name - delivery
		
		Utils.capturaPrintTela(driver, "Delivery");
		driver.findElement(By.id("first-name")).sendKeys("Selmo");
		
		//Fill in o Last name - delivery
		driver.findElement(By.id("last-name")).sendKeys("Cruz");
		
		//Fill in o Zip/Postal Code - delivery
		driver.findElement(By.id("postal-code")).sendKeys("08765665");
		
		Utils.capturaPrintTela(driver, "Delivery data");	
				
		// Click continue button
		driver.findElement(By.id("continue")).click();
		
		//Click finish button
		driver.findElement(By.name("finish")).click();
		
		Utils.capturaPrintTela(driver, "Purchase Finish");
		
		//Capture success text - orded placed
		mensagemSucesso = driver.findElement(By.xpath("//*[@id=\"checkout_complete_container\"]/h2")).getText();
		
		//Capture Complement massage
		complementMassage = driver.findElement(By.xpath("//*[@id=\"checkout_complete_container\"]/div")).getText();
		
		Utils.capturaPrintTela(driver, "Pedido realizado com sucesso");
		
		//Exibe conteudo da variável mensagemSucesso
		System.out.println(mensagemSucesso);
		
		//Exibe conteudo da variavel complemento manesagem
		System.out.println(complementMassage);
		
						
	}		
}
		

	
