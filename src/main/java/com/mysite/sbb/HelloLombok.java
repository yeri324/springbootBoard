package com.mysite.sbb;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class HelloLombok {
	private final String hello;
	private final int lombok;
	
//	public static void main(String args[]) {
//		HelloLombok h = new HelloLombok("헬로",5);
//		
//		System.out.println(h.getHello());
//		System.out.println(h.getLombok());
//	}
}
