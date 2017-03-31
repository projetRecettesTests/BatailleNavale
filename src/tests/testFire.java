package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import batailleNavale.FregateHorizontale;
import batailleNavale.Grille;

public class testFire {

	Grille grille;
	FregateHorizontale bateau1;
	FregateHorizontale bateau2;
	
	@Before
	public void setUp() throws Exception {
		grille = new Grille(5,2);
		bateau1 = new FregateHorizontale();
		bateau2 = new FregateHorizontale();
		
		grille.placeBateau(bateau1,1,1);
	}

	@Test
	public void testBateauCoule() {
		assertEquals(3, grille.fire(1, 1));
		assertEquals(4, grille.fire(2, 1));
	}
	
	@Test
	public void testFireHorsGrille() {
		assertEquals(0, grille.fire(4, 12));
		assertEquals(0, grille.fire(7, 1));
		assertEquals(0, grille.fire(7, 12));
	}
	
	@Test
	public void testBateauRaté() {
		assertEquals(2, grille.fire(3, 1));
		assertEquals(2, grille.fire(4, 2));
	}
	
	@Test
	public void testDéjàTiré() {
		assertEquals(2, grille.fire(3, 1));
		assertEquals(1, grille.fire(3, 1));
	}

}
