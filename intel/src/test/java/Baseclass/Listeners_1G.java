package Baseclass;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners_1G implements ITestListener
{
	
	@Override
	public void onTestStart(ITestResult result) 
	{
		System.out.println("test started:"+ result.getName());

	}
	@Override
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("test case got passed:"+result.getName());
	
	}
	@Override
	public void onTestFailure(ITestResult result)
	{
		System.out.println("take screenshot:"+result.getName());

    }  
	@Override
	public void onTestSkipped(ITestResult result) 
	{
		System.out.println("test case is skipped:"+result.getName());
	
	}
	
	

}
