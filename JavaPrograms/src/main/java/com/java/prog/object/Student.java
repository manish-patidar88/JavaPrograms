package com.java.prog.object;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;

public class Student {
	
	private int id;
	private String name;
	private int Age;
	private int marks;
	
	public Student(int id, String name, int age, int marks) {
		super();
		this.id = id;
		this.name = name;
		Age = age;
		this.marks = marks;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return Age;
	}
	
	public int getMarks() {
		return marks;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", Age=");
		builder.append(Age);
		builder.append(", marks=");
		builder.append(marks);
		builder.append("]");
		return builder.toString();
	}
	
	public static void main(String[] args) {
		Student s1 = new Student(1,"Paul",30,70);
		Student s2 = new Student(2,"Neil",45,90);
		Student s3 = new Student(3,"Dan",60,80);
		Student s4 = new Student(4,"Pervez",40,40);
		Student s5 = new Student(5,"Anton",35,60);
		
		List<Student> ls = new ArrayList<Student>();
		ls.add(s1);
		ls.add(s2);
		ls.add(s3);
		ls.add(s4);
		ls.add(s5);
		
		
		for(Student s:ls) {			
			System.out.println("Name: "+ s.name + " Marks: "+s.getMarks());			
		}
		System.out.println();
		System.out.println("---------Streams: get all the data---------------------------");
		ls.stream().forEach(x-> System.out.println(x));
		
		System.out.println();
		System.out.println("---------Streams: get names whose marks >80 -----------------------------");		
		ls.stream().filter(x->x.getMarks()>=80).forEach(x-> System.out.println("Name: "+x.getName() + ", Marks: "+ x.getMarks()));
		
		System.out.println();
		System.out.println("---------Streams: get Maximum marks---------------------------");
		int higestMarks = ls.stream().map(x-> x.getMarks()).max(Integer::compare).get();
		System.out.println(higestMarks);
		
		System.out.println("---------Streams: get Maximum marks and Name---------------------------");
		ls.stream().filter(x-> x.getMarks()==higestMarks).forEach(x-> System.out.print("Name: "+ x.getName() + " marks: "+ x.getMarks()));
		
	}

}
