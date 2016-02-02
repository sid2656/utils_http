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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import utils.http.client.HttpClientUtil;

/**
 * ClassName:HttpClientTest
 * Function: TODO ADD FUNCTION. 
 * Reason:	 TODO ADD REASON. 
 * Date:     2015年8月25日 下午3:28:36 
 * @author   sid
 * @see 	 
 */
@SuppressWarnings({ "rawtypes", "unchecked" })
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
//		map.put("targetId", "55de82e2d604771ac8a94314");
//		map.put("path", "/api/babyrun/v3/access0");
//		map.put("des", "test00");
//		map.put("auth", 1);
//		map.put("skip", 0);
//		map.put("size", 30);
//		String post = client.post("http://localhost:9090/api/babyrun/v3/access/add", map);
//		String post = client.post("http://localhost:9090/api/babyrun/v3/access/get", map);
//		String post = client.post("http://localhost:9090/api/babyrun/v3/access/update", map);
//		String post = client.post("http://localhost:9090/api/babyrun/v3/access/del", map);
//		String post = client.post("http://localhost:9090/api/babyrun/v3/access/list", map);
		

//		map.put("username", "runbaby");
//		map.put("password", "runbaby!@#");
//		map.put("email", "keegoo@net.com");
//		map.put("mobilePhoneNumber", "15800000000");
//		map.put("add", 1);
//		String post = client.post("http://api.babyrun.cc:8080/apis/manager/add", map);
//		String post = client.post("http://localhost:9090/apis/manager/add", map);
//		String post = client.post("http://localhost:9090/apis/manager/login", map);
		
		
		map.put("orderId", "56346bcc13221052a1eef8ce");
		map.put("refund_fee", "1");
		String post = client.post("http://localhost:8083/payment/refund", map);

//		map.put("id", "runbaby2");
//		map.put("msg", "this is a msg test!!!!!!test4");
//		map.put("groupid", "runbaby");
//		map.put("msgId", "runbaby2");
//		map.put("type", "1");
//		String post = client.post("http://localhost:8080/message/push", map);
//		String post = client.post("http://localhost:8080/message/pull", map);
//		String post = client.post("http://localhost:8080/msg/pullGroup", map);
//		String post = client.post("http://localhost:8080/msg/pullSole", map);
//		String post = client.post("http://192.168.10.223:9090/api/babyrun/v2/paster/type", map);
		

//		map.put("quantity", 2);
//		map.put("price", 12.5);
//		map.put("amount", 25.0);
//		map.put("productId", "126s5dfs");
//		map.put("merchantId", "123456");
//		map.put("payAmount", 25.0);
//		map.put("userId", "");
//		String post = client.post("http://192.168.10.170:8082/api/babyrun/v3/order/create", map);
//		String post = client.post("http://localhost:9090/api/babyrun/v3/order/list", map);
		

//		map.put("userId", "55c4195c13221065097b19e1");
//		map.put("status", 1);
//		String post = client.post("http://localhost:9090/api/babyrun/v3/order/list", map);

//		map.put("userId", "55c4195c13221065097b19e1");
//		String post = client.post("http://localhost:9090/api/babyrun/v2/user/friend/sharedlist", map);
		
		
//		map.put("orderId", "5601303dd604770ab4599033");
//		map.put("payPlatform", "weixin");
//		map.put("userId", "55c4195c13221065097b19e1");
//		String post = client.post("http://localhost:9090/api/babyrun/v3/pay/create", map);

//		map.put("objectId", "5608d4ab0171dd2ae41df68f");
//		map.put("userId", "55c4195c13221065097b19e1");
//		String post = client.post("http://localhost:9090/api/babyrun/v3/order/get", map);
		
//		map.put("cityCode", "110000");
//		map.put("skip", 0);
//		map.put("size", 10);
//		String post = client.post("http://182.92.180.245:8083/api/babyrun/v3/main/product/list", map);
//		String post = client.post("http://192.168.10.170:8082/api/babyrun/v3/main/product/list", map);

//		map.put("cityCode", "110000");
//		map.put("skip", 0);
//		map.put("size", 10);
//		String post = client.post("http://182.92.180.245:8083/api/babyrun/v2/poster/list", map);
		
//		String href="http://www.bt2mag.com/magnet/detail/hash/[A-Za-z0-9]*";
//		Pattern pattern = Pattern.compile(href);
//		Matcher matcher = pattern.matcher("http://www.bt2mag.com/magnet/detail/hash/5CF3C4164D6047EE3D6DDCBB92520E98F75355C0\"");
//		if (matcher.find()) {
//			System.out.println(matcher.group());
//		}else{
//			System.out.println("none");
//		}

//		map.put("success_num", "1");
//		map.put("batch_no", "");
//		map.put("result_details", "");
//		post = client.post("http://localhost:8083/payment/refund/callback/alipay", map);

		
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

