package groupExecution;

import org.testng.annotations.Test;

public class Test_demo1 
{
@Test(groups= {"system","smoke"})
void test()
{
	System.out.println("Like page");
}
@Test(groups = {"system","sanity"})
void test1()
{
	System.out.println("add to cart");
}
}
