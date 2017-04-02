package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import batailleNavale.Grid;

public class TestGrid
{
	Grid grid;
	
    @Before
    public void setUp() {
        grid = new Grid(8,2);
    }

	@Test
	public void caseInTheGrid()
	{
		assertNotNull(grid.accessCase(5, 1));
	}
	
	@Test
	public void caseInTheGridCorner()
	{
		assertNotNull(grid.accessCase(8, 2));
	}
	
	@Test
	public void caseOutOfTheGrid()
	{
		assertNull(grid.accessCase(15, 1));
	}
	
	@Test
	public void caseOutOfTheColumns()
	{
		assertNull(grid.accessCase(7, 56));
	}
	
	@Test
	public void caseOutOfTheLines()
	{
		assertNull(grid.accessCase(10, 1));
	}

}
