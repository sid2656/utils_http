/**
 * Project Name:http
 * File Name:SynchronizeTest.java
 * Package Name:utils.http
 * Date:2016年2月20日下午2:29:15
 * Copyright (c) 2016, sid Jenkins All Rights Reserved.
 * 
 *
*/

package utils.http;

import java.lang.ref.SoftReference;
import java.net.InterfaceAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import javax.swing.plaf.SliderUI;

import org.apache.http.client.UserTokenHandler;

/**
 * ClassName:SynchronizeTest
 * Function: TODO ADD FUNCTION. 
 * Reason:	 TODO ADD REASON. 
 * Date:     2016年2月20日 下午2:29:15 
 * @author   sid
 * @see 	 
 */
public strictfp class SynchronizeTest {
	ReadWriteLock rwl = new ReentrantReadWriteLock(true);

	synchronized void set(String name){
		rwl.readLock().lock();
		System.out.println(name+"set");
		for (int i = 0; i < 999999; i++) {
			System.out.println(name+"---"+i);
		}
		get(name);
		rwl.readLock().unlock();
	}
	synchronized void get(String name){
		System.out.println(name+"get");
	}
	public static byte[] toByteArray(long foo, byte[] array) {
		int len = array.length;
		for (int iInd = 0; iInd < len; iInd++) {
			System.out.println("length:=========="+(len - iInd - 1));
			System.out.println(">>>>>>:=========="+(foo >> ((len - iInd - 1) * 8)));
			System.out.println("&&&&&&:=========="+((foo >> ((len - iInd - 1) * 8)) & 0x000000FF));
			System.out.println("byte  :=========="+(byte) ((foo >> ((len - iInd - 1) * 8)) & 0x000000FF));
			System.out.println("=======================");
			array[iInd] = (byte) ((foo >> ((len - iInd - 1) * 8)) & 0x000000FF);
		}
		return array;
	}
	public static long toLong(byte[] bts) {
		if (bts == null) {
			return Long.MIN_VALUE;
		}
		int v = 0;
		int len = bts.length;
		for (int i = len - 1; i >= 0; i--) {
			System.out.println("length:=========="+((bts[i] + 256)));
			System.out.println(">>>>>>:=========="+((bts[i] + 256) % 256));
			System.out.println("&&&&&&:=========="+v * 256 );
			System.out.println("byte  :=========="+(v * 256 + ((bts[i] + 256) % 256)));
			System.out.println("=======================");
			v = v * 256 + ((bts[i] + 256) % 256);
		}
		return v;
	}
	
	public static void main(String[] args) {
		final SynchronizeTest st1 = new SynchronizeTest();
//		st1.set("a");
//		SynchronizeTest st2 = new SynchronizeTest();
//		st2.set("b");
//		MyThread thread1 = new MyThread(st1,"a");
//		thread1.start();
//		MyThread thread2 = new MyThread(st1,"b");
//		thread2.start();
		
		List<String> list = new ArrayList<String>();
		list.add(0, "1");
		list.add(0, "12");
		list.add(0, "13");
		System.out.println(list.size());
		System.out.println(list);
		Vector<String> s = new Vector<String>();
		list.add("123");
		
		List<String> list2 = new LinkedList<String>();
		list2.add("123");

		Integer a = new Integer(1);
		Integer aa = new Integer(1);
		String b = "";
		Object o = null;
		Set<String> ss = new HashSet<String>();
		if (a==1) {
			System.out.println("-----");
		}if (aa==1) {
			System.out.println("-----");
		}
		class User{
			private String id = "";
			@Override
			public int hashCode() {
				return super.hashCode();
			}
		}
		
		System.out.println(new User().hashCode());

		Map<User,String> hm = new HashMap<User,String>();
		hm.put(new User(), "");
		Hashtable<String,String> ht = new Hashtable<String,String>();
		ht.put("", "");
		
//		Integer NULL = null;
//		if (NULL==1) {
//			SoftReference sr = new SoftReference<HashMap>((HashMap) hm);
//			sr.get();
//		}
		byte[] byteArray = SynchronizeTest.toByteArray(123456789l, new byte[8]);
		long long1 = SynchronizeTest.toLong(byteArray);
		System.out.println(long1);
		
		
		String as ;
		int finallyX = getFinallyX();
		System.out.println(finallyX);
		class Preson{
			private void person(){
				st1.set("");
			}
		}
		class Pe{
			public Pe(String name){
				this.name = name;
			}
			@Override
			public boolean equals(Object obj) {
			return this.name.equals(((Pe)obj).name);
			}
			private String name = "1";
		}

		Pe p1 = new Pe("1");
		Pe p2 = new Pe("1");
		
		System.out.println(p1.equals(p2));
		
		System.out.println("============="+PI.s);
		st1.new Pcc().syso();

		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		
		String[] ssArray1;
		String ssArray2[];
		
		Calendar cal1 = Calendar.getInstance();
		cal1.set(Calendar.MONTH, Calendar.SEPTEMBER);
		cal1.set(Calendar.DAY_OF_MONTH, 4);
		cal1.add(Calendar.DAY_OF_MONTH, -90);
		System.out.println(cal1.getTime());
		
		
		System.out.println(""+new SynchronizeTest());
		
		System.out.println(new SynchronizeTest().equals(new SynchronizeTest()));
	}
	interface PI{
		int s=1;
	}
	abstract class Pa{
		int s=2;
		abstract void sss();
		public void ss() {
		}
	}
	class Pc{
		private int s=3;
		public void ss() {
		}
	}
	class Pcc extends Pc implements PI{
		public void syso(){
			System.out.println(super.s);
			System.out.println(s);
		}
	}
	
	public static int getFinallyX() {
		int x=1;
		try {
			return x;
		} catch (Exception e) {
		}finally {
			System.out.println("-----------");
			++x;
			System.out.println("-----------"+x);
		}
		return 12;
	}
	
	
	@Override
	public String toString() {
		return "----------";
	}
	
	
}

