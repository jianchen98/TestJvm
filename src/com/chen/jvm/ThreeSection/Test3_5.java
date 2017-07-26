package com.chen.jvm.ThreeSection;

public class Test3_5 {
	private static final int _1MB = 1024 * 1024;

	public static void main(String[] args) {
		testAllocation();
	}

	/**
	 * VM������-verbose:gc  //���gc��ϸ���
	 * -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails
	 * -XX:SurvivorRatio=8   //  Eden �� Survivor�ı��� Ĭ��Ϊ8
	 */
	public static void testAllocation() {
		byte[] allocation1, allocation2, allocation3, allocation4;
		allocation1 = new byte[2 * _1MB];
		allocation2 = new byte[2 * _1MB];
		allocation3 = new byte[2 * _1MB];
		allocation4 = new byte[4 * _1MB]; // ����һ��Minor GC
	}

}
