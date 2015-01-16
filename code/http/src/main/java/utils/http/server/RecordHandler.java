package utils.http.server;
/**
 * 
 * 获取到访问信息后的处理接口
 * @author sid
 *
 */
public interface RecordHandler {
	public void handleRecord(Record record);
}