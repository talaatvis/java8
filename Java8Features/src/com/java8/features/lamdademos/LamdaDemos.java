package com.java8.features.lamdademos;


/**
 * it come to resove for example if we have 10 interfaces we have to create class that implements
 * them to can call their functions or create annoymous class (on the fly)  as we cant create object from the interface 
 * @author USER
 *
 */

interface Holder {
	void show(int o);
	}


public class LamdaDemos {

	// in case of calling show method imn interface u need object , here we will create anonymous class , lamda will replace this anonymous block
	public static void main(String[] args) {
//		Holder obj = new Holder() {
//			
//			@Override
//			public void show() {
//				// TODO Auto-generated method stub
//				
//			}
//		};
//		obj.show();
		
		//------------ After Lamda ---------------
		/**
		 * @Override
//			public void show() { } replaced with () --> means method and -> means is part of this method
		 */
		
		//Holder obj = (int i)->{ // or the following
		Holder obj =  i->{
			System.out.println("Show Lamda ==> "+i);
		};
		obj.show(6);
		
	}
	
}
