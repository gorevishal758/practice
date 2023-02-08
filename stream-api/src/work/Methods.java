package work;

import java.util.List;
import java.util.stream.Collectors;

public class Methods {

	public static void main(String[] args) {
		//filter(Predicate) :predicate :boolean value function
		//boolean value function  return value
		
		
		
		
		//map(Function)
		/* we can perform operation on each element*/
		
		
		List<String> names=List.of("vishal","ankush","ram","lakhan","aa");
		
		List<String> collect = names.stream().filter(e->e.startsWith("a")).collect(Collectors.toList());
		//System.out.println(collect);
		
		List<Integer> i=List.of(1,2,8,4,5,7);
		List<Integer> collect2 = i.stream().map(e->e*e).collect(Collectors.toList());
		//System.out.println(collect2);
		
		names.stream().forEach(m->{
			//System.out.println(m);
		});
		
		//collect.stream().forEach(System.out::println);
		//sorted
		//i.stream().sorted().forEach(System.out::println);
		
		Integer integer = i.stream().min((x,y)->x.compareTo(y)).get();
		System.out.println(integer);
		
		Integer integer2 = i.stream().max((u,v)->u.compareTo(v)).get();
		System.out.println(integer2);
		
	}

}
