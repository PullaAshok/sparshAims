package com.volksoft.qa.analyser;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class Mytransformer implements IAnnotationTransformer{

	//IannotationTransformer interface which provides transform method
	
public void transform(ITestAnnotation annotation,Class testClass,Constructor testconstructor,Method testMethod){
		//By using setRetryAnalyser class we can run failed testcases
	    
	annotation.setRetryAnalyzer(Retryanalyser.class);
	}
}
