package com.chen.classLoad;

public class TestStackoverflow {

	 private static int a = 0;
	 public static void main(String[] args) throws Throwable {
		 try{
		 TestStackoverflow t = new TestStackoverflow();
		 t.stackoverflow();
		 }
		 catch(Throwable e){
			 System.out.println("length:"+a);
			 throw e;
		 }
		 
	}
	
	public  void stackoverflow(){
		a++;
		stackoverflow();
	}
}
