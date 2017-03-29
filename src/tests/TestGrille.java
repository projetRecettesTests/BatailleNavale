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
	}
	
	@Test
	public void caseDansLeCoinDeLaGrille()
	{
		assertNotNull(grille.accessCase(8, 2));
	}
	
	
	@Test
	public void caseHorsLigne()
	{
		assertNull(grille.accessCase(15, 1));
	}
	
	@Test
	public void caseHorsColonne()
	{
		assertNull(grille.accessCase(7, 56));
	}
	
	@Test
	public void caseHorsLimites()
	{
		assertNull(grille.accessCase(10, 5));
	}

}
