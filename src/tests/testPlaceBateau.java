package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import batailleNavale.FregateHorizontale;
import batailleNavale.Grille;

public class testPlaceBateau {

	Grille grille;
	FregateHorizontale bateau1;
	FregateHorizontale bateau2;
	FregateHorizontale bateau3;
	
	@Before
	public void setUp() throws Exception {
		grille = new Grille(10,20);
		bateau1 = new FregateHorizontale();
		bateau2 = new FregateHorizontale();
		bateau3 = new FregateHorizontale();
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
