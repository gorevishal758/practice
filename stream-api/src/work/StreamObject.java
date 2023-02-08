package work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
	public static void main(String[] args) {
		
		//stream API -collection process
		/*
		 * In stream API we can perform operation on 
		 * collection /group of object/array
		 */
		
		// BLANK stream
		Stream<Object> empty = Stream.empty();
		/*
		 * empty.forEach(e->{
		 * 
		 * System.out.println("Running"+e); });
		 */
		
		// array,object,collection
		String name[]= {"vishal","ankush","bala","cat"};
		Stream<String> stream1=Stream.of(name);
		stream1.forEach(e->{
			
			//System.out.println(e);
		});
	
		// builder method
		Stream<Object> build = Stream.builder().build();
		//System.out.println(build);
		
		//
		IntStream stream = Arrays.stream(new int[] {2,4,5,7,8});
		stream.forEach(e->{
			//System.out.println(e);
		});
		
		// collection list,set
		List<Integer> l1=new ArrayList<>();
		l1.add(50);
		l1.add(60);
		l1.add(70);
		l1.add(80);
		
		Stream<Integer> stream2 = l1.stream();
		stream2.forEach(e->{
			
			System.out.println(e);
		});
		
		
	}

}
