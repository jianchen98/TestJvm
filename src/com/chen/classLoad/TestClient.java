package com.chen.classLoad;

class Superclass {
	static {

		System.out.println("super class is init");
	}
	public static  int value = 123;//��ʼ����̬�����ᵼ�����ʼ��
	//�������Ϊfinal�����ڱ����ھͻ��ʼ��

}
class SubClass extends Superclass {
	static {
		System.out.println("sub class is init");
	}
}

public class TestClient {
	public static void main(String[] args) {
		System.out.println(SubClass.value);//���н����ʾ��ֻ���ʼ�����࣬�����ʼ������
		/**�ܽ᣺
		 * 1��ֻ����new ,getstatic,pubstatic�Ż��ʼ��
		 * 2����ʹ��java.lang.reflect����ʱ���ʼ��
		 * 3����ʼ��һ����ʱ��������໹û��ʼ������ᴥ�������ʼ��
		 * 4��jdk7.0,���ʹ��java.lang.invoke.MethodHandle ���������  REF_getstatic,
		 */
		
	}
}
