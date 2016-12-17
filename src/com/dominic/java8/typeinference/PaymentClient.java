package com.dominic.java8.typeinference;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.IntStream;
import static java.util.Comparator.comparing;
public class PaymentClient {

	public static void main(String[] args) {
		Map<Integer,Payment> paymentsMap = new HashMap<>();
		IntStream.range(1, 10).forEach(x -> {paymentsMap.put(x,  PaymentUtil.enricher(PaymentUtil.initObject(Payment::new)));});
		Consumer<String> consumer = System.out::println;
		Function<Payment,String> func = (p1) -> {return "ARN: " + p1.getArn() + " Terminal: "+p1.getTerminalId();};
		PaymentUtil.doAction(paymentsMap, consumer,func);
		
		List<Payment> payments = Collections.<Payment>emptyList();
		paymentsMap.entrySet().stream().map(Map.Entry::getValue).forEach(y -> payments.add(y));
		
		PaymentUtil.sortPayments(comparing(Payment::getArn), payments);
		
		 
		
	}

}
