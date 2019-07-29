package com.dchip.cloudparking.web.model.po;
// Generated 2019-1-22 18:02:05 by Hibernate Tools 5.2.10.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * DailyRecord generated by hbm2java
 */
@Entity
@Table(name = "daily_record", catalog = "cloud_parking")
public class DailyRecord implements java.io.Serializable {

	private int id;
	private String actName;
	private Integer actType;
	private Date actTime;
	private Integer accountId;

	public DailyRecord() {
	}

	public DailyRecord(int id) {
		this.id = id;
	}

	public DailyRecord(int id, String actName, Integer actType, Date actTime, Integer accountId) {
		this.id = id;
		this.actName = actName;
		this.actType = actType;
		this.actTime = actTime;
		this.accountId = accountId;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "act_name", length = 200)
	public String getActName() {
		return this.actName;
	}

	public void setActName(String actName) {
		this.actName = actName;
	}

	@Column(name = "act_type")
	public Integer getActType() {
		return this.actType;
	}

	public void setActType(Integer actType) {
		this.actType = actType;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "act_time", length = 19)
	public Date getActTime() {
		return this.actTime;
	}

	public void setActTime(Date actTime) {
		this.actTime = actTime;
	}

	@Column(name = "account_id")
	public Integer getAccountId() {
		return this.accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

}