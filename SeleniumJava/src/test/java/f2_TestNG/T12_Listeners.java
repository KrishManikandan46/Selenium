package f2_TestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class T12_Listeners implements ITestListener{

	@Override  
	public void onTestStart(ITestResult result) {  
		// TODO Auto-generated method stub 
		System.out.println("Test case is going to execute "); 
	}  

	@Override  
	public void onTestSuccess(ITestResult result) {  
		// TODO Auto-generated method stub  
		System.out.println("Test case is passed");  
	}  

	@Override  
	public void onTestFailure(ITestResult result) {  
		// TODO Auto-generated method stub  
		System.out.println("Test case is failed");  
	}  

	@Override  
	public void onTestSkipped(ITestResult result) {  
		// TODO Auto-generated method stub  
		System.out.println("Test case is skipped");  
	}  

	@Override  
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {  
		// TODO Auto-generated method stub  
		System.out.println("Failure of test cases and its details are : ");  
	}  

	@Override  
	public void onStart(ITestContext context) {  
		// TODO Auto-generated method stub 
		System.out.println("before everything"); 
	}  

	@Override  
	public void onFinish(ITestContext context) {  
		// TODO Auto-generated method stub  
		System.out.println("after everything"); 
	}  

}
