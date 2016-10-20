package com.facade;

/**
 * 文件名称：Client.java
 * 创建人：Fei Wong
 * 创建时间： Jun 29, 2012
 * 电子邮箱：feiwong8@126.com
 * */

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ServiceA sa = new ServiceAImpl();
		  ServiceB sb = new ServiceBImpl();
		  sa.methodA();
		  sb.methodB();
		  System.out.println("=====================");
		  Facade f = new Facade();
		  f.methodA();
		  f.methodB();
		  f.methodC() ;
	}

}