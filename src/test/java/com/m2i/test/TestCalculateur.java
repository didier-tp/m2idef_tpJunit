package com.m2i.test;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.m2i.tp.Calculateur;

public class TestCalculateur {
	
	private static Logger logger = LoggerFactory.getLogger(TestCalculateur.class);
	
	private static Calculateur calculateur; //à tester
	
	public TestCalculateur(){
		logger.debug("nouvelle instance de TestCalculateur " + this.toString());
	}
	
	@BeforeClass
	public static void init(){
		calculateur = new Calculateur();
		logger.debug("init() appele");
	}
	
	@Test
	public void testTva(){
		Assert.assertEquals(40, calculateur.tva(200.0, 20.0),0.0001);
	}
	
	@Test
	public void testTtc(){
		Assert.assertEquals(240, calculateur.ttc(200.0, 20.0),0.0001);
	}
	
	/*
	 * 1. ecrire les tests via JUnit 4 avec @Before , @Test , Assert.assertEquals()
	 * 2. lancer les tests avant de finir la programmation du composant
	 *    pour visualiser rouge (echecs bien détectés)
	 * 3. écrire le code complet du composant à tester
	 * 4. relancer les tests qui devraient réussir
	 */

}
