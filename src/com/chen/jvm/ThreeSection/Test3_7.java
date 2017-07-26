package com.chen.jvm.ThreeSection;

public class Test3_7 {

	private static final int _1MB = 1024 * 1024;

	/**
	 * VM������-verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 
	 * -XX:MaxTenuringThreshold=1   ���䳬��1��ֱ�ӽ��������
	 * -XX:+PrintTenuringDistribution
	 */
	@SuppressWarnings("unused")
	public static void testTenuringThreshold() {
		byte[] allocation1, allocation2, allocation3;
		allocation1 = new byte[_1MB / 4];  // ʲôʱ����������������XX:MaxTenuringThreshold����
		allocation2 = new byte[4 * _1MB];
		allocation3 = new byte[4 * _1MB];
		allocation3 = null;
		allocation3 = new byte[4 * _1MB];
	}
   
	public static void main(String[] args) {
		testTenuringThreshold();
	}

}

