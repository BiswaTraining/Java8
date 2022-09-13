package com.assignment.day3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class OrderManagement {
	
	//this was done as my system crashes every time I try to start database services. A replacement laptop has been received, but it is yet to be configured
	static List<OrderDetail> mockDatabaseReturnValue() {
		List<OrderDetail> orderDetail = new ArrayList<OrderDetail>();
		orderDetail.add(new OrderDetail(1, "Rohit", 5, LocalDate.of(2022,07,29)));
		orderDetail.add(new OrderDetail(2, "Rahul", 6, LocalDate.of(2022,07,28)));
		orderDetail.add(new OrderDetail(3, "Virat", 7, LocalDate.of(2022,07,27)));
		orderDetail.add(new OrderDetail(4, "Rishabh", 8, LocalDate.of(2022,07,26)));
		orderDetail.add(new OrderDetail(5, "Surya", 9, LocalDate.of(2022,07,24)));
		orderDetail.add(new OrderDetail(6, "Hardik", 10, LocalDate.of(2022,07,25)));
		return orderDetail;
	}

	public static void main(String[] args) {
		//mocking optional to incorporate the concept of optional
		Optional<List<OrderDetail>> optionalOrders=Optional.of(mockDatabaseReturnValue());
		if(optionalOrders!=null && optionalOrders.isPresent() && !optionalOrders.isEmpty()) {
			List<OrderDetail> orderDetails=optionalOrders.get();
			Collections.sort(orderDetails,(order1,order2)->order1.getOrderDate().compareTo(order2.getOrderDate()));
			System.out.println("Order details sorted as per the order date using LocalDate");
			for(OrderDetail order:orderDetails) {
				System.out.println(order);
			}
		}else {
			System.out.println("No order details found");
		}

	}

}
