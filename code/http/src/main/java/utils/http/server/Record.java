package utils.http.server;

import java.sql.Date;

/**
 * 
 * @author sid
 *
 */
public class Record {
	private int id;
	private String record;
	private Date visitDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRecord() {
		return record;
	}
	public void setRecord(String record) {
		this.record = record;
	}
	public Date getVisitDate() {
		return visitDate;
	}
	public void setVisitDate(Date visitDate) {
		this.visitDate = visitDate;
	}
}
