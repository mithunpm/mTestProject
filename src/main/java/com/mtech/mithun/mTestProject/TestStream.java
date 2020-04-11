package com.mtech.mithun.mTestProject;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestStream {

	public static void main(String[] args) {
		int list[]= {1,2,3,4,5};
		List<Integer>list1=Arrays.stream(list).boxed().collect(Collectors.toList());
		System.out.println(list1);
		System.out.println(list1.stream().reduce((s1,s2)-> s1+s2).orElse(1));
		List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.","Canada");
		System.out.println(G7.stream().filter(i-> i.indexOf('A')>0).map(s->s.toLowerCase()).reduce((s1,s2)->s1+s2).orElse("1"));

	}

}
