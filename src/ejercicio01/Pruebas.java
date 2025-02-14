package ejercicio01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pruebas {
	 @BeforeAll
    static void setUp() {
        driver1 = new ChromeDriver();
        wait = new WebDriverWait(driver1, Duration.ofSeconds(5)); 
    }

    @AfterAll
    static void tearDown() {
        if (driver1 != null) {
            driver1.quit();
        }
    }

    @Test
    void existenEnlaceBuscadores() {
        driver1.get("http://localhost:3000/");
        WebElement enlaceBuscadores = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("enlaceBuscadores")));
        assertNotNull(enlaceBuscadores);
    }

    @Test
    void existenEnlaceRedes() {
        driver1.get("http://localhost:3000/");
        WebElement enlaceRedes = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("enlaceRedes")));
        assertNotNull(enlaceRedes);
    }
    
    @Test
    void existenEnlaceFormulario() {
        driver1.get("http://localhost:3000/");
        WebElement enlaceRedes = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("formulario")));
        assertNotNull(enlaceRedes);
    }

    @Test
    void funcionanEnlaceBuscador() {
        driver1.get("http://localhost:3000/");
        WebElement enlaceBuscadores = wait.until(ExpectedConditions.elementToBeClickable(By.id("enlaceBuscadores")));
        enlaceBuscadores.click();
        
        assertEquals("http://localhost:3000/buscadores/", driver1.getCurrentUrl());
    }
    
    @Test
    void funcionanEnlaceFormulario() {
        driver1.get("http://localhost:3000/");
        WebElement enlaceBuscadores = wait.until(ExpectedConditions.elementToBeClickable(By.id("formulario")));
        enlaceBuscadores.click();
        
        assertEquals("http://localhost:3000/buscadores/", driver1.getCurrentUrl());
    }

    @Test
    void funcionanEnlaceRedes() {
        driver1.get("http://localhost:3000/");
        WebElement enlaceRedes = wait.until(ExpectedConditions.elementToBeClickable(By.id("enlaceRedes")));
        enlaceRedes.click();
        
        assertEquals("http://localhost:3000/redes_sociales/", driver1.getCurrentUrl());
    }

    @Test
    void funcionanEnlaceGoogle() {
        driver1.get("http://localhost:3000/buscadores/");
        WebElement enlaceGoogle = wait.until(ExpectedConditions.elementToBeClickable(By.id("google")));
        enlaceGoogle.click();

        cambiarPestana();
        
        assertEquals("https://www.google.com/", driver1.getCurrentUrl());
    }

    @Test
    void funcionanEnlaceBing() {
        driver1.get("http://localhost:3000/buscadores/");
        WebElement enlaceBing = wait.until(ExpectedConditions.elementToBeClickable(By.id("bing")));
        enlaceBing.click();

        cambiarPestana();
        
        assertEquals("https://www.bing.com/", driver1.getCurrentUrl());
    }

    @Test
    void funcionanEnlaceBaidu() {
        driver1.get("http://localhost:3000/buscadores/");
        WebElement enlaceBaidu = wait.until(ExpectedConditions.elementToBeClickable(By.id("baidu")));
        enlaceBaidu.click();

        cambiarPestana();
        
        assertEquals("https://www.baidu.com/", driver1.getCurrentUrl());
    }

    @Test
    void funcionanEnlaceInstagram() {
        driver1.get("http://localhost:3000/redes_sociales/");
        WebElement enlaceIg = wait.until(ExpectedConditions.elementToBeClickable(By.id("instagram")));
        enlaceIg.click();

        cambiarPestana();
        
        assertEquals("https://www.instagram.com/", driver1.getCurrentUrl());
    }

    @Test
    void funcionanEnlaceFacebook() {
        driver1.get("http://localhost:3000/redes_sociales/");
        WebElement enlaceFacebook = wait.until(ExpectedConditions.elementToBeClickable(By.id("facebook")));
        enlaceFacebook.click();

        cambiarPestana();
        
        assertEquals("https://www.facebook.com/", driver1.getCurrentUrl());
    }

    @Test
    void funcionanEnlaceTikTok() {
        driver1.get("http://localhost:3000/redes_sociales/");
        WebElement enlaceTikTok = wait.until(ExpectedConditions.elementToBeClickable(By.id("tiktok")));
        enlaceTikTok.click();

        cambiarPestana();
        
        assertEquals("https://www.tiktok.com/explore", driver1.getCurrentUrl());
    }

    private void cambiarPestana() {
        Set<String> handles = driver1.getWindowHandles();
        for (String handle : handles) {
            driver1.switchTo().window(handle);
        }
    }
}
