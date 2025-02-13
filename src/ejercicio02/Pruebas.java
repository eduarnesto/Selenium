package ejercicio02;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pruebas {
	static WebDriver driver;

	public static final String FORM = "http://localhost:3001";

	@BeforeAll
	static void inicializarDriver() {
		driver = new ChromeDriver();
	}

	@Test
	void verificarTitulo() {
		driver.get(FORM);
		assertEquals("Formulario de registro - Mi web", driver.getTitle());
	}

	@Test
	void verificarLabelNombre() {
		driver.get(FORM);
		WebElement lNombre = driver.findElement(By.id("lNombre"));
		String label = lNombre.getText();
		assertEquals("Nombre", label);
	}

	@Test
	void verificarEntryNombre() {
		driver.get(FORM);
		WebElement nombre = driver.findElement(By.id("nombre"));
		assertEquals("text", nombre.getAttribute("type"));
		assertEquals("50", nombre.getAttribute("maxlength"));
	}

	@Test
	void verificarLabelApellidos() {
		driver.get(FORM);
		WebElement apellidosLabel = driver.findElement(By.id("apellidosLabel"));
		String label = apellidosLabel.getText();
		assertEquals("Apellidos", label);
	}

	@Test
	void verificarEntryApellidos() {
		driver.get(FORM);
		WebElement apellidos = driver.findElement(By.id("apellidos"));
		assertEquals("text", apellidos.getAttribute("type"));
		assertEquals("50", apellidos.getAttribute("maxlength"));
	}

	@Test
	void verificarLabelSexo() {
		driver.get(FORM);
		WebElement sexoLabel = driver.findElement(By.id("sexoLabel"));
		String radio = sexoLabel.getText();
		assertEquals("Sexo", radio);
	}

	@Test
	void obtenerOpcionesRadioSexo() {
		// Configurar el WebDriver (asegúrate de que el chromedriver está configurado
		// correctamente)
		driver.get(FORM);

		// Localizar todas las opciones de radio en Reflex
		List<WebElement> radioButtons = driver.findElements(By.id("rSexo"));

		// Extraer y mostrar las opciones disponibles
		for (WebElement radio : radioButtons) {
			System.out.println(radio.getText());
		}

	}

	@Test
	void verificarEntryCorreo() {
		driver.get(FORM);
		WebElement iCorreo = driver.findElement(By.id("email"));
		assertEquals("text", iCorreo.getAttribute("type"));
	}

	@Test
	void verificarLabelCorreo() {
		driver.get(FORM);
		WebElement emailLabel = driver.findElement(By.id("emailLabel"));
		String correo = emailLabel.getText();
		assertEquals("Correo", correo);
	}

	@Test
	void verificarCheckInformacion() {
		driver.get(FORM);
		WebElement casillaInformacion = driver.findElement(By.id("casillaInformacion"));
		assertEquals("button", casillaInformacion.getAttribute("type"));
		assertEquals("true", casillaInformacion.getAttribute("aria-checked"));
	}

	@Test
	void verificarLabelCheckInformacion() {
		driver.get(FORM);
		// Encuentra el checkbox
		WebElement casillaInformacion = driver.findElement(By.id("casillaInformacionLabel"));

		// Verifica que el texto esperado esté presente en el DOM
		String textoCheckbox = casillaInformacion.getAttribute("outerHTML");

		// Asegúrate de que el texto esté presente en el HTML del checkbox
		assertEquals("Deseo recibir información sobre novedades y ofertas", textoCheckbox);
	}

	@Test
	void verificarCheckCondiciones() {
		driver.get(FORM);
		WebElement casillaCondiciones = driver.findElement(By.id("casillaCondiciones"));
		assertEquals("button", casillaCondiciones.getAttribute("type"));
	}

	@Test
	void verificarLabelCheckCondiciones() {
		driver.get(FORM);
		WebElement casillaCondiciones = driver.findElement(By.id("casillaCondicionesLabel"));
		String casilla = casillaCondiciones.getText();
		assertEquals(
				"Declaro haber leido y aceptar las condiciones generales del programa y la normativa sobre protección de datos",
				casilla);
	}

	@Test
	void verificarButton() {
		driver.get(FORM);
		WebElement boton = driver.findElement(By.id("enviar"));
		assertEquals("submit", boton.getAttribute("type"));
	}
}
