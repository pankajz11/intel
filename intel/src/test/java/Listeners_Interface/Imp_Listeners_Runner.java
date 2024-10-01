package Listeners_Interface;

import static org.testng.Assert.fail;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Baseclass.Listeners_1G.class)
public class Imp_Listeners_Runner 
{
   @Test
   void test()
   {
	   System.out.println("login script");
   }
   @Test
   void test1()
   {
	   System.out.println("Login by email");
	   Assert.fail();
   }
   @Test (dependsOnMethods = "test1")
   void test3()
   {
	   System.out.println("Login script");
   }
   
   
}
