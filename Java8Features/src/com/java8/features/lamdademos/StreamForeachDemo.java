package com.java8.features.lamdademos;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class StreamForeachDemo {
// what is consumer 
	
	
	public static void main(String[] args) {
		//Consumer< Integer> cons = new ConsumerImpl();
		// u can remove () and integer also
	//	Consumer<Integer> cons2 = (Integer i) -> System.out.println(i);
		List<Integer> values = Arrays.asList(1,2,3,4,5);
		//values.stream().filter(i -> {i*2}).findFirst().orElse(0);  //i -> System.out.println(i) called consumer
		// by using parallel multiple threads will be created to work on this list and all cpus will be utilized
	//	values.parallelStream().forEach(cons2);  //i -> System.out.println(i) called consumer

	}
}
