package com.chen.jvm.ThreeSection;

public class Test3_8 {

	
	private static final int _1MB = 1024 * 1024;

	/**
	 * VM������-verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:MaxTenuringThreshold=15
	 * -XX:+PrintTenuringDistribution
	 */
	@SuppressWarnings("unused")
	public static void testTenuringThreshold2() {
		byte[] allocation1, allocation2, allocation3, allocation4;
		allocation1 = new byte[_1MB / 4];   // allocation1+allocation2����survivo�ռ�һ��
		allocation2 = new byte[_1MB / 4];  
		allocation3 = new byte[4 * _1MB];
		allocation4 = new byte[4 * _1MB];
		allocation4 = null;
		allocation4 = new byte[4 * _1MB];
	}
	
	public static void main(String[] args) {
		testTenuringThreshold2();
	}


}
