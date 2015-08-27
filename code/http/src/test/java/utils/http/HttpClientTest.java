/**
 * Project Name:http
 * File Name:HttpClientTest.java
 * Package Name:utils.http
 * Date:2015年8月25日下午3:28:36
 * Copyright (c) 2015, sid Jenkins All Rights Reserved.
 * 
 *
*/

package utils.http;

import java.util.HashMap;

import utils.http.client.HttpClientUtil;

/**
 * ClassName:HttpClientTest
 * Function: TODO ADD FUNCTION. 
 * Reason:	 TODO ADD REASON. 
 * Date:     2015年8月25日 下午3:28:36 
 * @author   sid
 * @see 	 
 */
public class HttpClientTest {
	
	public static void main(String[] args) {
		HttpClientTest.doPost();
//		HttpClientTest.doGet();
	}
	
	public static void doPost(){
		HttpClientUtil client = new HttpClientUtil();
		HashMap map = new HashMap();
//		map.put("id", "123");
//		String post = client.post("http://localhost:9090/user/post", map);
		map.put("targetId", "55de82e2d604771ac8a94314");
		map.put("path", "/api/babyrun/v3/access0");
		map.put("des", "test00");
		map.put("auth", 1);
		map.put("skip", 0);
		map.put("size", 30);
//		String post = client.post("http://localhost:9090/api/babyrun/v3/access/add", map);
		String post = client.post("http://localhost:9090/api/babyrun/v3/access/get", map);
//		String post = client.post("http://localhost:9090/api/babyrun/v3/access/update", map);
//		String post = client.post("http://localhost:9090/api/babyrun/v3/access/del", map);
//		String post = client.post("http://localhost:9090/api/babyrun/v3/access/list", map);
		System.out.println(post);
	}
	
	public static void doGet(){
		HttpClientUtil client = new HttpClientUtil();
		HashMap map = new HashMap();
		map.put("id", "123");
		String get = client.open("http://localhost:9090/user/1");
		System.out.println(get);
	}

}

