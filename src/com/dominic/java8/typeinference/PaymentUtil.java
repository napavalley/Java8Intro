package com.dominic.java8.typeinference;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class PaymentUtil<T> {
	
	public static <U> void addPayments(List<U> paymentList , U elemnt){
		if(Objects.nonNull(paymentList)){
			paymentList.add(elemnt);
		}
	}
	
	
	public static <Z extends Payment> Z initObject(final Supplier<Z> supplier){
		return supplier.get(); 
		
	}
	
	public static <Z extends Payment> Z enricher(final Z payment){
		
		payment.setArn(UUID.randomUUID().toString());
		payment.setTerminalId(Long.toHexString(Double.doubleToLongBits(Math.random())));
		
		return payment;
		
	}
	
	public static <L,R,Z extends Payment> void doAction(final Map<L,Z> collection, Consumer<R> consumer,Function<Z, R> tranform){
		collection.entrySet().stream().map(x -> x.getValue()).map(tranform).forEach(consumer);
		
		
	}
	

}
