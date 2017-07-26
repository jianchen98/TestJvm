package com.chen.csdnjvm.blog;

import java.util.ArrayList;
import java.util.List;

public class Test001 {
	private static List<Test001>  list = new ArrayList<Test001>();
	
	public static void main(String[] args) throws InterruptedException {
		for(int i =0;i<10000;i++){
			Test001 test = new Test001();
			list.add(test);
			Thread.sleep(50);
		}
	}
}
