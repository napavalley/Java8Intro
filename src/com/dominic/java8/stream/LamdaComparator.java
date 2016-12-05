package com.dominic.java8.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.IntStream;

public class LamdaComparator {

	public static void main(String[] args) {
	 List<Fruit> apples = new ArrayList<>();
	 AppleFactory appleFactory = Apple::new;
	 Function<Double,Integer> doubleToInt = (x) -> { return x.intValue();};
	 IntStream.range(1, 100).asDoubleStream().forEach(x -> appleFactory.create(x));
	 Collections.sort(apples, (x,y) -> {return doubleToInt.apply(x.getWeight()) - doubleToInt.apply(y.getWeight());});

	}

}
@FunctionalInterface
interface AppleFactory {
	Apple create(double x);
}
