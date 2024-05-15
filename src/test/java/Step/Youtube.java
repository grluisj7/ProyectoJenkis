package Step;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Youtube {
	
	
	public static WebDriver driver = Hooks.driver;
	
	@Given("Inicio el navegador en la pagina de youtube")
	public void inicio_el_navegador_en_la_pagina_de_youtube() {
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();

	}

	@When("Escribo la palabra Jose en el youtube")
	public void escribo_la_palabra_jose_en_el_youtube() {
		WebElement BarraBusquedaYT = driver.findElement(By.name("search_query"));
		BarraBusquedaYT.sendKeys("Jose");

	}

	@When("Presiono el boton para buscar")
	public void presiono_el_boton_para_buscar() {
		WebElement BotonBuscarYT = driver.findElement(By.className("style-scope ytd-searchbox"));
		BotonBuscarYT.submit();

	}

	@Then("Busquedad Correcta")
	public void busquedad_correcta() {
		assertEquals("Jose - YouTube", driver.getTitle());

	}

}
