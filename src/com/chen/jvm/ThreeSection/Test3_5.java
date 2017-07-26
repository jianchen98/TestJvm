package com.chen.jvm.ThreeSection;

public class Test3_5 {
	private static final int _1MB = 1024 * 1024;

	public static void main(String[] args) {
		testAllocation();
	}

	/**
	 * VM参数：-verbose:gc  //输出gc详细情况
	 * -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails
	 * -XX:SurvivorRatio=8   //  Eden 与 Survivor的比例 默认为8
	 */
	public static void testAllocation() {
		byte[] allocation1, allocation2, allocation3, allocation4;
		allocation1 = new byte[2 * _1MB];
		allocation2 = new byte[2 * _1MB];
		allocation3 = new byte[2 * _1MB];
		allocation4 = new byte[4 * _1MB]; // 出现一次Minor GC
	}

}
