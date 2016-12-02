package com.dominic.java8.stream;

import java.util.stream.IntStream;

public class StreamLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int x = IntStream.range(1, 5).map(i -> i*2).reduce((i,j) -> i + j).getAsInt();
		 System.out.println(x);

	}

}
