package com.pkr.java.questions;

public abstract class AbstractImplementInterface implements FirstInteface {
	
	public abstract String getRoll();
}

class AbstractInterfaceImpl extends AbstractImplementInterface {

	@Override
	public String getRoll() {
		return null;
	}

	//This is because its super abstract class implements FirstInterface
	@Override
	public void getIndentity() {
		
	}
	
}
