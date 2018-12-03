package com.java8.features.lamdademos;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class ConsumerImpl implements Consumer <Integer>{

	@Override
	public void accept(Integer t) {
		System.out.println(t);
		
	}
	
}
public class ForeachDemo {
// what is consumer 
	
	
	public static void main(String[] args) {
		Consumer< Integer> cons = new ConsumerImpl();
		// u can remove () and integer also
		Consumer<Integer> cons2 = (Integer i) -> System.out.println(i);
		List<Integer> values = Arrays.asList(1,2,3,4,5);
		values.forEach(cons2);  //i -> System.out.println(i) called consumer
	}
}
