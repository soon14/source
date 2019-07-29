package com.dchip.cloudparking.api.model.po;
// Generated 2018-11-30 17:46:32 by Hibernate Tools 5.2.10.Final

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * RechargeCoupon generated by hbm2java
 */
@Entity
@Table(name = "recharge_coupon", catalog = "cloud_parking")
public class RechargeCoupon implements java.io.Serializable {

	private Integer id;
	private Integer couponId;
	private Date createTime;
	private BigDecimal inMoney;
	private Integer status;

	public RechargeCoupon() {
	}

	public RechargeCoupon(Integer couponId, Date createTime, BigDecimal inMoney, Integer status) {
		this.couponId = couponId;
		this.createTime = createTime;
		this.inMoney = inMoney;
		this.status = status;
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

	@Column(name = "coupon_id")
	public Integer getCouponId() {
		return this.couponId;
	}

	public void setCouponId(Integer couponId) {
		this.couponId = couponId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_time", length = 19)
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Column(name = "in_money", precision = 20, scale = 0)
	public BigDecimal getInMoney() {
		return this.inMoney;
	}

	public void setInMoney(BigDecimal inMoney) {
		this.inMoney = inMoney;
	}

	@Column(name = "status")
	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}