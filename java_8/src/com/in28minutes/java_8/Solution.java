package com.in28minutes.java_8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution {

    public static void main(String[] args) {
    	int[] arr = {5,4,6,7,9,5,1,1,2,3,4};
    	List<Integer> collect2 = Arrays.stream(arr).boxed().collect(Collectors.toList());
    	Map<Integer, Long> collect3 = collect2.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    	System.out.println(collect3);
//    	List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
//    	System.out.println(list);
////    	List<Integer>  list = Arrays.asList(arr);
//    	Set<Integer> set = new HashSet<>();
//    	
//        
//    	list.stream().filter(i -> Collections.frequency(list, i) > 1)
//    	.collect(Collectors.toSet())
//    	.forEach(e->System.out.print(e+" "));
//        
//    	
////    	Sort by frequency: 
//    	System.out.println();
//    	
//    	list.stream().sorted().sorted(Comparator.comparing(e-> Collections.frequency(list, e),Comparator.reverseOrder()))
//    	.forEach(e->System.out.print(e+" "));
    	
    	
//    	int pro=1;
    	
    	
//    	for(int i=0;i<arr.length;i++) {
//    		pro *= arr[i]; 
//    	}
    	
//    	int pro = list.stream().reduce(1,(e1,e2)->e1*e2);
    	
//    	for(int i=0;i<arr.length;i++) {
//    		System.out.println(pro/arr[i]);
//    	}
    	
//    	list.stream().map(e->pro/e).forEach(e->System.out.print(e+" "));
    	
    	
//    	Optional<Integer> findFirst = list.stream().findFirst();
//    	System.out.println(findFirst);
    	
    	String str = "hjshjgbsbja";
    	List<Character> list = str.chars().mapToObj(e->(char)e).collect(Collectors.toList());
    	 Set<Character> collect = list.stream()
    			.filter(e->Collections.frequency(list, e)>1).collect(Collectors.toSet());
    	System.out.println(collect);
    	Set<Character> set = new HashSet<>();
////    	is.mapToObj(e->(char)e).distinct().forEach(System.out::println);
//    	Optional<Character> character = is.mapToObj(e->(char)e).filter(e-> !set.add(e)).findFirst();
//    	System.out.print(character+" ");
    	list.stream().sorted().sorted(Comparator.comparing(e->Collections.frequency(list,e), Comparator.reverseOrder()))
    			.forEach(e-> System.out.print(e + " "));
    	System.out.println();
    	System.out.println("*********");
    	
//    	Optional<Character> findFirst = is.mapToObj(e->(char)e).filter(e-> !set.add(e)).findFirst();
//    	System.out.println(findFirst);
    	List<Integer> arrlist = List.of(1,7,2,9,10,123,15,65);
    	arrlist.stream().sorted(Comparator.reverseOrder()).forEach(e->System.out.print(e+" "));;
    	System.out.println();
    	System.out.println("*********");
    	LocalDate localdate = LocalDate.now();
    	
    	List<String> list1= List.of("Java", "8");
    	List<String> list2= List.of("is", "too","much","fun");
    	Stream.concat(list1.stream(), list2.stream()).forEach(e->System.out.print(e+" "));;
    	String str1 = list1.stream().reduce("",(e1,e2)->e1+" "+ e2);
    	String str2 = list2.stream().reduce("",(e1,e2)->e1+" "+e2);
    }
    
    
}



