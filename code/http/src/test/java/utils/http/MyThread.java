/**
 * Project Name:http
 * File Name:MyThread.java
 * Package Name:utils.http
 * Date:2016年2月20日下午2:49:12
 * Copyright (c) 2016, sid Jenkins All Rights Reserved.
 * 
 *
*/

package utils.http;
/**
 * ClassName:MyThread
 * Function: TODO ADD FUNCTION. 
 * Reason:	 TODO ADD REASON. 
 * Date:     2016年2月20日 下午2:49:12 
 * @author   sid
 * @see 	 
 */


public class MyThread extends Thread{
	SynchronizeTest s ;
	private String name ;
	public MyThread(SynchronizeTest st,String name) {
		this.s = st;
		this.name = name;
	}
	@Override
	public void run() {
		s.set(name);
	}
}