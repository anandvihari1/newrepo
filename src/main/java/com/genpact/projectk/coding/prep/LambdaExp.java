package com.genpact.projectk.coding.prep;

import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class LambdaExp {
	public static void main(String[] args) {
		Function<List<Emp>,Long> sum=new Function<List<Emp>,Long>(){

			@Override
			public Long apply(List<Emp> t) {
				Long count=t.stream()
						
					//	.mapToDouble(e->e.salary)
					//	.collect(null, null, null)
//			.map(e->e.salary)
//			.
						.mapToDouble(m->m.salary)
						.average();
						//.count();//
						//.mapToDouble(m->m.salary)
				//.collect(Collectors.averagingDouble(null));
				return count;
			}};
			Emp e1=new Emp((double) 10000);
			Emp e2=new Emp((double) 10000);
			List<Emp> list=List.of(e1,e2);
			System.out.println(sum.apply(list));
		
		Consumer<List<Emp>> c=new Consumer<List<Emp>>(){

			@Override
			public void accept(List<Emp> t) {
				Double total = 0.0;
				for(Emp e:t) {
					total=total+e.salary;
				}
				System.out.println("total sum salary"+total);
			}};
			c.accept(list);
			
		
	}

}
class Emp{
	Double salary;
	public Emp(Double sal) {
		this.salary=sal;
	}
}

