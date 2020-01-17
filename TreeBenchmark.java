	import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

	public class TreeBenchmark {
			public static void main(String[] args) {
			TreeSet<Integer> treeset = new TreeSet<Integer>();
			TreeMap<Integer,Integer> treemap = new TreeMap<Integer,Integer>();
			HashSet<Integer> hashset= new HashSet<Integer>();
			HashMap<Integer,Integer> hashmap= new HashMap<Integer,Integer>();

			
			//hashset add
			
			long startTime = System.nanoTime();
			 
			for (int i = 0; i < 100000; i++) {
				hashset.add(i);
			}
			long endTime = System.nanoTime();
			long duration = endTime - startTime;
			System.out.println("Hashset add: " + duration);
			
			
			//treeset add
			
			startTime = System.nanoTime();
			 
			for (int i = 0; i < 100000; i++) {
				treeset.add(i);
			}
			endTime = System.nanoTime();
			duration = endTime - startTime;
			System.out.println("treeset add: " + duration);
			
			
			//hashmap add
			
			startTime = System.nanoTime();
			 
			for (int i = 0; i < 100000; i++) {
				hashmap.put(i,i);
			}
			endTime = System.nanoTime();
			duration = endTime - startTime;
			System.out.println("Hashmap add: " + duration);
			
			
			//treemap add
			
			startTime = System.nanoTime();
			 
			for (int i = 0; i < 100000; i++) {
				treemap.put(i,i);
			}
			endTime = System.nanoTime();
			duration = endTime - startTime;
			System.out.println("treemap add: " + duration);
			
			
			
			// hashmap get
			startTime = System.nanoTime();
			 
			for (int i = 0; i < 10000; i++) {
				hashmap.get(i);
			}
			endTime = System.nanoTime();
			duration = endTime - startTime;
			System.out.println("hashmap get: " + duration);
			
			// treemap get
			startTime = System.nanoTime();
			 
			for (int i = 0; i < 10000; i++) {
				treemap.get(i);
			}
			endTime = System.nanoTime();
			duration = endTime - startTime;
			System.out.println("treemap get: " + duration);


			
			// hashset contains key
			startTime = System.nanoTime();
			 
			for (int i = 0; i < 10000; i++) {
				hashset.contains(i);
			}
			endTime = System.nanoTime();
			duration = endTime - startTime;
			System.out.println("hashset contains: " + duration);

			
			
			
			// treeset contains key
			startTime = System.nanoTime();
			 
			for (int i = 0; i < 10000; i++) {
				treeset.contains(i);
			}
			endTime = System.nanoTime();
			duration = endTime - startTime;
			System.out.println("treeset contains: " + duration);
			
			
			
			
			// hashmap contains key
			startTime = System.nanoTime();
			 
			for (int i = 0; i < 10000; i++) {
				hashmap.containsKey(i);
			}
			endTime = System.nanoTime();
			duration = endTime - startTime;
			System.out.println("hashmap contains key: " + duration);

			
			
			
			
			// hashmap contains value
			startTime = System.nanoTime();
			 
			for (int i = 0; i < 10000; i++) {
				hashmap.containsValue(i);
			}
			endTime = System.nanoTime();
			duration = endTime - startTime;
			System.out.println("hashmap contains value: " + duration);
			
			
			
			
			// treemap contains key
			startTime = System.nanoTime();
			 
			for (int i = 0; i < 10000; i++) {
				treemap.containsKey(i);
			}
			endTime = System.nanoTime();
			duration = endTime - startTime;
			System.out.println("treemap contains key: " + duration);

			
			
			
			
			// treemap contains value
			startTime = System.nanoTime();
			 
			for (int i = 0; i < 10000; i++) {
				treemap.containsValue(i);
			}
			endTime = System.nanoTime();
			duration = endTime - startTime;
			System.out.println("treemap contains value: " + duration);
			
			
			

			 
			//hashset remove
			startTime = System.nanoTime();
			 
			for (int i = 9999; i >=0; i--) {
				hashset.remove(i);
			}
			endTime = System.nanoTime();
			duration = endTime - startTime;
			System.out.println("hashset remove:  " + duration);
			 
			 
			
			//treeset remove
			startTime = System.nanoTime();
			 
			for (int i = 9999; i >=0; i--) {
				treeset.remove(i);
			}
			endTime = System.nanoTime();
			duration = endTime - startTime;
			System.out.println("treeset remove:  " + duration);
			
			

			//hashmap remove
			startTime = System.nanoTime();
			 
			for (int i = 9999; i >=0; i--) {
				hashmap.remove(i);
			}
			endTime = System.nanoTime();
			duration = endTime - startTime;
			System.out.println("hashmap remove:  " + duration);
			
			
			// treemap remove
			startTime = System.nanoTime();
			 
			for (int i = 9999; i >=0; i--) {
				treemap.remove(i);
			}
			endTime = System.nanoTime();
			duration = endTime - startTime;
			System.out.println("treemap remove: " + duration);
			
		}
	}
	
