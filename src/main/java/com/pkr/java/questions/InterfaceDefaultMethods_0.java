package com.pkr.java.questions;

public interface InterfaceDefaultMethods_0 {
	default int show() {
		System.out.println("InterfaceDefaultMethods_0");
		return 0;
	}

	void add();

}

interface InterfaceDefaultMethods_1 {
	default int show() {
		System.out.println("InterfaceDefaultMethods_1");
		return 0;
	}
}

class ImplMethods implements InterfaceDefaultMethods_0, InterfaceDefaultMethods_1 {

	@Override
	public int show() {
		return InterfaceDefaultMethods_1.super.show();
	}

	@Override
	public void add() {
		System.out.println("add");
	}

}
