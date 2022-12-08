package com.jojuskills;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
public class HashSetTest {
public static void main(String args[]) {
HashSet<Integer> ht=new HashSet<Integer>();
ht.add(100);
ht.add(80);
ht.add(60);
ht.add(10);
ht.add(30);
System.out.println(ht);
//ht.forEach(System.out::println);
//ht.stream().forEach(n -> System.out.println(n));
List s=ht.stream().filter(m->m>=50).collect(Collectors.toList());
System.out.println(s);
List s1=ht.stream().map(n->n+10).collect(Collectors.toList());
System.out.println(s1);
System.out.println("after applying sort method.");
List<Integer> s2=ht.stream().sorted().collect(Collectors.toList());
System.out.println(s2);}}