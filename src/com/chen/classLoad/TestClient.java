package com.chen.classLoad;

class Superclass {
	static {

		System.out.println("super class is init");
	}
	public static  int value = 123;//初始化静态变量会导致类初始化
	//如果定义为final，则在编译期就会初始化

}
class SubClass extends Superclass {
	static {
		System.out.println("sub class is init");
	}
}

public class TestClient {
	public static void main(String[] args) {
		System.out.println(SubClass.value);//运行结果显示：只会初始化父类，不会初始化子类
		/**总结：
		 * 1、只有在new ,getstatic,pubstatic才会初始化
		 * 2、在使用java.lang.reflect调用时会初始化
		 * 3、初始化一个类时，如果父类还没初始化，则会触发父类初始化
		 * 4、jdk7.0,如果使用java.lang.invoke.MethodHandle 解析结果是  REF_getstatic,
		 */
		
	}
}
