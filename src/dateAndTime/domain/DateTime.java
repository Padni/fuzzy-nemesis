package dateAndTime.domain;

import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import java.util.Calendar;
import java.sql.Timestamp;
import java.sql.Time;

//@Entity
public class DateTime {

	@Id
	private long id;

	private java.sql.Date date;
	private Time time;
	private Timestamp timestamp;

	@Temporal(TemporalType.DATE)
	private java.util.Date utilDate;
	@Temporal(TemporalType.TIME)
	private java.util.Date untilTimeDate;
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date untilTimeStamp;

	@Temporal(TemporalType.DATE)
	private Calendar calendar;
	
	
	

	/**
	 * @return the utilDate
	 */
	public java.util.Date getUtilDate() {
		return utilDate;
	}

	/**
	 * @param utilDate
	 *            the utilDate to set
	 */
	public void setUtilDate(java.util.Date utilDate) {
		this.utilDate = utilDate;
	}

	/**
	 * @return the timeDate
	 */
	public java.util.Date getTimeDate() {
		return untilTimeDate;
	}

	/**
	 * @param timeDate
	 *            the timeDate to set
	 */
	public void setTimeDate(java.util.Date timeDate) {
		this.untilTimeDate = timeDate;
	}

	/**
	 * @return the timeStampDate
	 */
	public java.util.Date getTimeStampDate() {
		return untilTimeStamp;
	}

	/**
	 * @param timeStampDate
	 *            the timeStampDate to set
	 */
	public void setTimeStampDate(java.util.Date timeStampDate) {
		this.untilTimeStamp = timeStampDate;
	}

	/**
	 * @return the calendar
	 */
	public Calendar getCalendar() {
		return calendar;
	}

	/**
	 * @param calendar
	 *            the calendar to set
	 */
	public void setCalendar(Calendar calendar) {
		this.calendar = calendar;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the date
	 */
	public java.sql.Date getDate() {
		return date;
	}

	/**
	 * @param date
	 *            the date to set
	 */
	public void setDate(java.sql.Date date) {
		this.date = date;
	}

	/**
	 * @return the time
	 */
	public java.sql.Time getTime() {
		return time;
	}

	/**
	 * @param time
	 *            the time to set
	 */
	public void setTime(java.sql.Time time) {
		this.time = time;
	}

	/**
	 * @return the timestamp
	 */
	public java.sql.Timestamp getTimestamp() {
		return timestamp;
	}

	/**
	 * @param timestamp
	 *            the timestamp to set
	 */
	public void setTimestamp(java.sql.Timestamp timestamp) {
		this.timestamp = timestamp;
	}

}
