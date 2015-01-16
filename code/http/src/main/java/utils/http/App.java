package utils.http;

import utils.http.server.ConsoleRecordHandler;
import utils.http.server.HttpBackServer;

/**
 * Hello world!
 * 
 */
public class App {

	public static void main(String[] args) {
		int type = args.length;
		switch (type) {
			case 0:
				HttpBackServer httpServer = new HttpBackServer(8787);
				httpServer.addRecordHandler(new ConsoleRecordHandler());
				httpServer.start();
				break;
			case 1:
			default:
				break;
		}
	}
}
