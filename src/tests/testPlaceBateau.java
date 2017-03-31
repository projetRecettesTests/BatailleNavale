package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import batailleNavale.Bateau;
import batailleNavale.Grille;

public class testPlaceBateau {

	Grille grille;
	Bateau bateau1;
	Bateau bateau2;
	
	@Before
	public void setUp() throws Exception {
		grille = new Grille(10,20);
		bateau1 = new Bateau("Torpilleur Horizontal", 2, 1);
		bateau2 = new Bateau("Torpilleur Horizontal", 2, 1);
	}

	@Test
	public void testPlaceBateauDispo() {
		assertEquals(true, grille.placeBateau(bateau1,2,2));
	}
	
	@Test
	public void testPlaceBateauOccupied() {
		assertEquals(true, grille.placeBateau(bateau1,2,2));
		assertEquals(false, grille.placeBateau(bateau2,3,2));
	}
	
	@Test
	public void testPlaceBateauHorsColonne() {
		assertEquals(true, grille.placeBateau(bateau1,2,2));
		assertEquals(false, grille.placeBateau(bateau2,11,20));
	}
	
	@Test
	public void testPlaceBateauHorsLigne() {
		assertEquals(true, grille.placeBateau(bateau1,2,2));
		assertEquals(false, grille.placeBateau(bateau2,10,25));
	}
	
	@Test
	public void testPlaceBateauHorsGrille() {
		assertEquals(true, grille.placeBateau(bateau1,2,2));
		assertEquals(false, grille.placeBateau(bateau2,15,25));
	}

}
