package pruebas_pagina_reflex;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pruebas {
	static WebDriver driver1;

	@BeforeAll
	static void setURL() {
		driver1 = new ChromeDriver();
	}

	@Test
	void existenEnlaceBuscadores() {
		driver1.get("http://localhost:3000/");
		WebElement enlaceBuscadores = driver1.findElement(By.id("enlaceBuscadores"));
		
		String url = driver1.getCurrentUrl();
		assertEquals("http://localhost:3000/", url);
	}

	@Test
	void existenEnlaceRedes() {
		driver1.get("http://localhost:3000/");
		WebElement enlaceRedes = driver1.findElement(By.id("enlaceRedes"));
		
		String url = driver1.getCurrentUrl();
		assertEquals("http://localhost:3000/", url);
	}
	
	@Test
	void existePaginaBuscadores() {
		driver1.get("http://localhost:3000/buscadores/");
		
		String url = driver1.getCurrentUrl();
		assertEquals("http://localhost:3000/buscadores/", url);
	}
	
	@Test
	void existePaginaRedesSociales() {
		driver1.get("http://localhost:3000/redes_sociales/");
		
		String url = driver1.getCurrentUrl();
		assertEquals("http://localhost:3000/redes_sociales/", url);
	}
	
	@Test
	void funcionanEnlaceBuscador() {
		driver1.get("http://localhost:3000/");
		WebElement enlaceBuscadores = driver1.findElement(By.id("enlaceBuscadores"));
		enlaceBuscadores.click();
		
		String url = driver1.getCurrentUrl();
		assertEquals("http://localhost:3000/", url);
	}
	
	@Test
	void funcionanEnlaceRedes() {
		driver1.get("http://localhost:3000/");
		WebElement enlaceRedes = driver1.findElement(By.id("enlaceRedes"));
		enlaceRedes.click();
		
		String url = driver1.getCurrentUrl();
		assertEquals("http://localhost:3000/", url);
	}
	
	@Test
	void existenEnlacesDePagBuscador() {
		driver1.get("http://localhost:3000/buscadores/");
		WebElement enlaceGoogle = driver1.findElement(By.id("google"));
		WebElement enlaceBing = driver1.findElement(By.id("bing"));
		WebElement enlaceBaidu = driver1.findElement(By.id("baidu"));
		WebElement enlaceVolver = driver1.findElement(By.id("volver"));		
		
		String url = driver1.getCurrentUrl();
		assertEquals("http://localhost:3000/buscadores/", url);
	}
	
	@Test
	void funcionanEnlaceGoogle() {
		driver1.get("http://localhost:3000/buscadores/");
		WebElement enlaceGoogle = driver1.findElement(By.id("google"));
		enlaceGoogle.click();
		
		String url = driver1.getCurrentUrl();
		assertEquals("https://www.google.com/", url);
	}
	
	@Test
	void funcionanEnlaceBing() {
		driver1.get("http://localhost:3000/buscadores/");
		WebElement enlaceBing = driver1.findElement(By.id("bing"));
		enlaceBing.click();
		
		String url = driver1.getCurrentUrl();
		assertEquals("https://www.bing.com/?brdr=1", url);
	}
	@Test
	void funcionanEnlaceBaidu() {
		driver1.get("http://localhost:3000/buscadores/");
		WebElement enlaceBaidu = driver1.findElement(By.id("baidu"));
		enlaceBaidu.click();

		
		String url = driver1.getCurrentUrl();
		assertEquals("https://www.baidu.com/", url);
	}
	
	@Test
	void funcionanEnlaceVolver1() {
		driver1.get("http://localhost:3000/buscadores/");
		WebElement enlaceVolver = driver1.findElement(By.id("volver"));
		enlaceVolver.click();
		
		String url = driver1.getCurrentUrl();
		assertEquals("http://localhost:3000/buscadores/", url);
	}
	
	@Test
	void existenEnlacesDePagRedes() {
		driver1.get("http://localhost:3000/redes_sociales/");
		WebElement enlaceIg = driver1.findElement(By.id("instagram"));
		WebElement enlaceFacebook = driver1.findElement(By.id("facebook"));
		WebElement enlaceTikTok = driver1.findElement(By.id("tiktok"));
		WebElement enlaceVolver = driver1.findElement(By.id("volver"));		
		
		String url = driver1.getCurrentUrl();
		assertEquals("http://localhost:3000/redes_sociales/", url);
	}
	
	@Test
	void funcionaEnlaceInstagram() {
	    driver1.get("http://localhost:3000/redes_sociales/");
	    WebElement enlaceIg = driver1.findElement(By.id("instagram"));
	    enlaceIg.click();
	    
	    String url = driver1.getCurrentUrl();
	    assertEquals("https://www.instagram.com/", url);
	}

	@Test
	void funcionaEnlaceFacebook() {
	    driver1.get("http://localhost:3000/redes_sociales/");
	    WebElement enlaceFacebook = driver1.findElement(By.id("facebook"));
	    enlaceFacebook.click();
	    
	    String url = driver1.getCurrentUrl();
	    assertEquals("https://www.facebook.com/", url);
	}

	@Test
	void funcionaEnlaceTikTok() {
	    driver1.get("http://localhost:3000/redes_sociales/");
	    WebElement enlaceTikTok = driver1.findElement(By.id("tiktok"));
	    enlaceTikTok.click();
	    
	    String url = driver1.getCurrentUrl();
	    assertEquals("https://www.tiktok.com/explore", url);
	}

	@Test
	void funcionaEnlaceVolver() {
	    driver1.get("http://localhost:3000/redes_sociales/");
	    WebElement enlaceVolver = driver1.findElement(By.id("volver"));
	    enlaceVolver.click();
	    
	    String url = driver1.getCurrentUrl();
	    assertEquals("http://localhost:3000/redes_sociales/", url);
	}
}
