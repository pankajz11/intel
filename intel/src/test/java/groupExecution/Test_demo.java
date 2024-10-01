package groupExecution;

import org.testng.annotations.Test;

public class Test_demo 
{
@Test(groups= {"smoke","sanity"})
void a()
{
	System.out.println("login to app");
}
@Test(groups = {"functional"})
void b()
{
	System.out.println("login to by email");
}
}
