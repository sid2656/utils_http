package utils.http;

import utils.http.server.ConsoleRecordHandler;
import utils.http.server.HttpBackServer;


public class HttpBackTest {
	public static void main(String[] args) {
		int type = args.length;
		switch (type) {
			case 0:
				HttpBackServer httpServer = new HttpBackServer(8787);
				httpServer.addRecordHandler(new ConsoleRecordHandler());
	//			httpServer.addRecordHandler(createMysqlHandler());
				httpServer.start();
				break;
				
			case 1:
			default:
				break;
		}
	}
//	private static RecordHandler createMysqlHandler(){
//		MysqlRecordHandler handler = new MysqlRecordHandler();
//		handler.setUrl("jdbc:mysql://localhost:3306/logs");
//		handler.setUsername("root");
//		handler.setPassword("");
//		return handler;
//	}
}