package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import batailleNavale.Grille;

public class TestGrille
{
	Grille grille;
	
    @Before
    public void setUp() {
        grille = new Grille(8,2);
    }

	@Test
	public void caseDansLaGrille()
	{
		assertNotNull(grille.accessCase(5, 1));
		//assertEquals(8, grille.getDim1());
	}
	
	@Test
	public void caseHorsLimites()
	{
		assertNull(grille.accessCase(10, 1));
	}


}
