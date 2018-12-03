package com.java8.features.intefaces;

public interface I {
	// u can define methods here but it must be declared by default keyword
	default void show() {
		System.out.println("I");
	}
	
	// also can define static
	static void testStatic() {
		System.out.println("I am in static");
	}
}

// interface J {
//	default void show() {
//		System.out.println("J");
//	}
//}
// 
// class A {
//	public void show() {
//		System.out.println("A");
//	}
//	/**
//	 * here u have to declare the class which u will create an object from it as ststic to can create the object in the main method
//	 * @param args
//	 */
//static class Test extends A implements I{
//
//}
//
//
//public static void main(String[] args) {
//	Test obj = new Test();
//	obj.show();
//	
//}
//	
//	
// }