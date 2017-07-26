package com.chen.classLoad;

import java.util.ArrayList;

public class TestMat {
	public static void main(String[] args) {
		ArrayList<TestMat> list = new ArrayList<TestMat>();
		while(true){
			list.add(new TestMat());
		}
	}
}
