package com.facade;

/**
 * 文件名称：ServiceAImpl.java
 * 创建人：Fei Wong
 * 创建时间： Jun 29, 2012
 * 电子邮箱：feiwong8@126.com
 * */

public class ServiceBImpl implements ServiceB {


	/* (non-Javadoc)
	 * @see design.facade.ServiceA#methodA()
	 */
	@Override
	public void methodB() {
		System.out.println( "methodB--> is runing" ); 
	}

}