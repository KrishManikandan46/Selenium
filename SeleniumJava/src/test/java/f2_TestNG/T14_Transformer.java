package f2_TestNG;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class T14_Transformer implements IAnnotationTransformer{

	public void transform(ITestAnnotation annotation,
			@SuppressWarnings("rawtypes") java.lang.Class testClass,
			@SuppressWarnings("rawtypes") java.lang.reflect.Constructor testConstructor,
			java.lang.reflect.Method testMethod) {
		annotation.setRetryAnalyzer(T13_RetryFailedTestcase.class);
	}

}
