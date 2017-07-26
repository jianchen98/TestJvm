package com.chen.jvm.ThreeSection;

public class Test3_6 {
	private static final int _1MB = 1024 * 1024;

	/**
	 * VM参数：-verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
	 * -XX:PretenureSizeThreshold=3145728//超过这个大小 直接进入老年代
	 */
	public static void testPretenureSizeThreshold() {
		byte[] allocation;
		allocation = new byte[4 * _1MB];  //直接分配在老年代中
	}

	
	public static void main(String[] args) {
		testPretenureSizeThreshold();
	}

}
