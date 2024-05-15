package Step;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class buscadorGoogle {

	public static WebDriver driver = Hooks.driver;

	@Given("Inicio el navegador Chrome")
	public void inicio_el_navegador_chrome() {
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	}

	@When("Escribo la palabra Luis en la barra del buscador")
	public void escribo_la_palabra_luis_en_la_barra_del_buscador() {
		WebElement BarraBusqueda = driver.findElement(By.name("q"));
		BarraBusqueda.sendKeys("Luis");

	}

	@When("Presiono el boton buscar")
	public void presiono_el_boton_buscar() {
		WebElement BotonBuscar = driver.findElement(By.name("btnK"));
		BotonBuscar.submit();
	}

	@Then("Busquedad Exitosa")
	public void Busquedad_Exitosa() throws InterruptedException {
		// para igualar el texto de la pagína busca
		assertEquals("Luis - Buscar con Google", driver.getTitle());

	}
}
