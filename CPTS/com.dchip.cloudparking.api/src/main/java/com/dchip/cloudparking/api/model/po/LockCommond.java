package com.dchip.cloudparking.api.model.po;
// Generated 2019-3-20 15:42:30 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * LockCommond generated by hbm2java
 */
@Entity
@Table(name = "lock_commond", catalog = "cloud_parking")
public class LockCommond implements java.io.Serializable {

	private Integer id;
	private Integer type;
	private String commond;
	private int groundLockId;
	private Date createTime;
//	private Integer isRead;

	public LockCommond() {
	}

	public LockCommond(int groundLockId) {
		this.groundLockId = groundLockId;
	}

	public LockCommond(Integer type, String commond, int groundLockId, Date createTime/*, Integer isRead*/) {
		this.type = type;
		this.commond = commond;
		this.groundLockId = groundLockId;
		this.createTime = createTime;
//		this.isRead = isRead;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "type")
	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	@Column(name = "commond")
	public String getCommond() {
		return this.commond;
	}

	public void setCommond(String commond) {
		this.commond = commond;
	}

	@Column(name = "ground_lock_id", nullable = false)
	public int getGroundLockId() {
		return this.groundLockId;
	}

	public void setGroundLockId(int groundLockId) {
		this.groundLockId = groundLockId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_time", length = 19)
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

//	@Column(name = "is_read")
//	public Integer getIsRead() {
//		return this.isRead;
//	}
//
//	public void setIsRead(Integer isRead) {
//		this.isRead = isRead;
//	}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LockCommond that = (LockCommond) o;
        return id == that.id &&
                groundLockId == that.groundLockId &&
                Objects.equals(type, that.type) &&
                Objects.equals(commond, that.commond) &&
                Objects.equals(createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, commond, groundLockId, createTime);
    }
    
}