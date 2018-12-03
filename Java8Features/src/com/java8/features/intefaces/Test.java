package com.java8.features.intefaces;

 class Test extends A implements I{
	 public static void main(String[] args) {
			Test obj = new Test();
			// it will print the value in the class because the class has more power than the interface
			obj.show();
			
		}
			
}