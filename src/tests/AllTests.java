package tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses(
{
	TestGrille.class,
	testPlaceBateau.class,
	TestFire.class
})
public class AllTests
{

}
