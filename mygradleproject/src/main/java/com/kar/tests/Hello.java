package com.kar.tests;
import org.joda.time.LocalTime;
public class Hello{
	public static void main(String[] args){
		LocalTime currentTime = new LocalTime();
	        System.out.println("The current local time is: " + currentTime);
		System.out.println(new Greeter().sayHello());
	}
}
