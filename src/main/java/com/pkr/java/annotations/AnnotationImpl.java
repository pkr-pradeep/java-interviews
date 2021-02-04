package com.pkr.java.annotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Lets say in future you have specify the an class to a different category
//At that time the user defined annotation will help you
//Such as segregating living beings and non living beings @LivingBeing or @NonLivingBeing

public class AnnotationImpl {
	public static void main(String[] args) {
		AnnotationBorrower annotationBorrower = new  AnnotationBorrower();
		Class classObj = annotationBorrower.getClass(); //Using refelction
		Annotation annotation = classObj.getAnnotation(FirstAnnotation.class);
		FirstAnnotation annotation2 = (FirstAnnotation)annotation;
		System.out.println(annotation2.message());
	}
}

@Inherited //If someday any child class of the annotated class i.e. AnnotationBorrower wants all these properties of annotation then this is useful
@Documented // This is for Documentation purpose
@Retention(RetentionPolicy.RUNTIME) //When to be there
@Target(ElementType.TYPE) //At what place TYPE means this annotation can be specified over class
@interface FirstAnnotation {
   String message() default "Pradeep";
}

@FirstAnnotation
class AnnotationBorrower {
	String message;
	
	public AnnotationBorrower() {
	}
	
	public AnnotationBorrower(String message) {
		this.message= message;
	}
}