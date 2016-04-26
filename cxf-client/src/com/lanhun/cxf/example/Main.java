/**
 * Copyright (c) 2006-2015 Hzins Ltd. All Rights Reserved. 
 *  
 * This code is the confidential and proprietary information of   
 * Hzins. You shall not disclose such Confidential Information   
 * and shall use it only in accordance with the terms of the agreements   
 * you entered into with Hzins,http://www.hzins.com.
 *  
 */
package com.lanhun.cxf.example;

import java.rmi.RemoteException;

import com.lanhun.cxf.example.client.HelloWorldProxy;

/**
 * <p>
 * 
 *
 *
 * </p>
 * 
 * @author hz15101769
 * @date 2016年4月26日 上午11:23:15
 * @version
 */
public class Main {

    public static void main(String[] args) {

	HelloWorldProxy proxy = new HelloWorldProxy();
	try {
	    String ret = proxy.sayHi("hello");
	    System.out.println(ret);
	} catch (RemoteException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
    }

}
