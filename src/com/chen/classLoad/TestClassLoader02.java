package com.chen.classLoad;

public class TestClassLoader02 {
	public static void main(String[] args) throws ClassNotFoundException {
		Class s = Class.forName("java.lang.String");
		System.out.println(s.getClassLoader());
		//null 由此可以看出  String类是由根类加载器加载的
		
		Class s2 = Class.forName("com.chen.classLoad.Test");
		System.out.println(s2.getClassLoader());
		//sun.misc.Launcher$AppClassLoader@1372a1a  app应用类加载器
	}
}
class   Test{
	
}