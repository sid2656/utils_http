package utils.http.server;
/**
 * 
 * @author sid
 *
 */
public class ConsoleRecordHandler implements RecordHandler {
	public void handleRecord(Record record) {
		System.out.println(record.getRecord());
	}
}