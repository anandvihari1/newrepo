package com.genpact.projectk.coding.prep.db;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DataBaseQuery {
	public static void main(String[] args) {
		List<Product> list=Arrays.asList(
				new Product(10L,"teddy","Boy",5000.00),
				new Product(20L,"keys","Toy",500.00),
				new Product(30L,"cap","Boy",1000.00)
				
				);
		List<Product> list1=Arrays.asList(
				new Product(10L,"teddy","Boy",5000.00),
				new Product(20L,"keys","Toy",500.00),
				new Product(30L,"cap","Boy",1000.00)
				
				);
		Customer c=new Customer(20L,"Anand",12);
		List<Order> orderList=Arrays.asList(
				new Order(10L,"Out for deliver",LocalDate.now(),LocalDate.of(2023, 03, 22),list,c),
				new Order(10L,"Ready for deliver",LocalDate.now(),LocalDate.of(2023, 03, 22),list1,c)
			//	new Order(10L,"delivered",LocalDate.now(),LocalDate.of(2023, 03, 22),list,c)
				);
		Long start=System.currentTimeMillis();
		var highest=list.stream()
				.parallel()
		.filter(f->f.category.equalsIgnoreCase("Toys") && f.price>1000L)
		.toList();
		System.out.println(start-System.currentTimeMillis());
		System.out.println(highest);
		Long second=System.currentTimeMillis();
		var highest1=list.stream()
				.parallel()
				.filter(f->f.category.equalsIgnoreCase("Toys"))
				.filter(k->k.price>1000L)
				.toList();
				System.out.println(second-System.currentTimeMillis());
				System.out.println(highest1);
				
			var listOfOrder=orderList.stream()
				.map(m->m.getProducts().stream().filter(f->f.category.equalsIgnoreCase("Toy")))
					//.map(m->m.getProducts())
				//	.flatMap(null)
				.collect(Collectors.toList());
			System.out.println(listOfOrder);
	}

}

