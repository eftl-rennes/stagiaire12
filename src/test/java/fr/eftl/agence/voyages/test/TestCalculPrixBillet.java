package fr.eftl.agence.voyages.test;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import fr.eftl.agence.voyages.prix.CalculPrixBillet;
import fr.eftl.agence.voyages.prix.CalculPrixUnitaire;


public class TestCalculPrixBillet {
	
	@Test
	public void prixBilletclasseEco () {
		CalculPrixBillet prixBillet = new CalculPrixBillet();
		//CalculPrixUnitaire calculprixUnitaire = new CalculPrixUnitaire();
		CalculPrixUnitaire calculPrixUnitaire= Mockito.mock(CalculPrixUnitaire.class);
		Mockito.when(calculPrixUnitaire.generer()).thenReturn(200);
		prixBillet.setCalculPrixUnitaire(calculPrixUnitaire);
		
		Integer prixObtenu = prixBillet.calculer("Paris", "Londres", "eco");
		Assert.assertEquals(200, prixObtenu,0);
	}
	
	
	@Test
	public void prixBilletclasseBusiness () {
		CalculPrixBillet prixBillet = new CalculPrixBillet();
		//CalculPrixUnitaire calculprixUnitaire = new CalculPrixUnitaire();
		CalculPrixUnitaire calculPrixUnitaire= Mockito.mock(CalculPrixUnitaire.class);
		Mockito.when(calculPrixUnitaire.generer()).thenReturn(200);
		prixBillet.setCalculPrixUnitaire(calculPrixUnitaire);
		
		Integer prixObtenu = prixBillet.calculer("Paris", "Londres", "business");
		Assert.assertEquals(700, prixObtenu,0);
}
	@Test
	public void prixBilletpremiere () {
		CalculPrixBillet prixBillet = new CalculPrixBillet();
		//CalculPrixUnitaire calculprixUnitaire = new CalculPrixUnitaire();
		CalculPrixUnitaire calculPrixUnitaire= Mockito.mock(CalculPrixUnitaire.class);
		Mockito.when(calculPrixUnitaire.generer()).thenReturn(200);
		prixBillet.setCalculPrixUnitaire(calculPrixUnitaire);
		
		Integer prixObtenu = prixBillet.calculer("Paris", "Londres", "premiere");
		Assert.assertEquals(400, prixObtenu,0);
	}
	@Test
	public void prixBilletclassedefault () {
		CalculPrixBillet prixBillet = new CalculPrixBillet();
		//CalculPrixUnitaire calculprixUnitaire = new CalculPrixUnitaire();
		CalculPrixUnitaire calculPrixUnitaire= Mockito.mock(CalculPrixUnitaire.class);
		Mockito.when(calculPrixUnitaire.generer()).thenReturn(200);
		prixBillet.setCalculPrixUnitaire(calculPrixUnitaire);
		
		Integer prixObtenu = prixBillet.calculer("Paris", "Londres", "");
		Assert.assertEquals(200, prixObtenu,0);
	}
}