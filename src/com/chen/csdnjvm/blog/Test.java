package com.chen.csdnjvm.blog;

import java.util.ArrayList;


public class Test {
	private static ArrayList<Test> list = new ArrayList<Test>();
	public static void main(String[] args) {
		
		while(true){
			list.add(new Test());
		}
	}
}
