package work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain1 {

	public static void main(String[] args) {
		
		//Q)1. create a list and filter all even numbers from list
		//Method 1
		List<Integer> l1 = List.of(12,7,9,8,5);
		//System.out.println(l1);
		
		//Method 2
		List<Integer> l2=new ArrayList<>();
		l2.add(12);
		l2.add(13);
		l2.add(134);
		//System.out.println(l2);
		
		//Method 3
		List<Integer> l3 = Arrays.asList(11,22,33,44);
		//System.out.println(l3);
		
		//without stram
		List<Integer> even=new ArrayList<>();
		
		for(Integer i:l1)
		{
			if(i%2==0)
			{
				even.add(i);
			}
			
		}
		//System.out.println(l1);
		//System.out.println(even);
		
		
		//Using stream 
		Stream<Integer> stream = l1.stream();
		List<Integer> collect = stream.filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(collect);
		
		Stream<Integer> stream2 = l2.stream();
		
		List<Integer> collect2 = stream2.filter(i->i%2 !=0).collect(Collectors.toList());
		//System.out.println(collect2);
		
		
		
		/*
		 * Stream<Integer> stream3 = l3.stream(); List<Integer> collect3 =
		 * stream3.filter(i->i%2==0).collect(Collectors.toList());
		 * System.out.println(collect3);
		 */
		
		List<Integer> collect3 = l3.stream().filter(i->i%2==0).collect(Collectors.toList());
		//System.out.println(collect3);
		
		List<Integer> collect4 = l2.stream().filter(j->j>10).collect(Collectors.toList());
		//System.out.println(collect4);
	}

}
