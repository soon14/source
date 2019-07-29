package com.dchip.cloudparking.wechat.model.po;
// Generated 2018-11-13 16:21:40 by Hibernate Tools 5.2.10.Final

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
 * MonthlyCardPay generated by hbm2java
 */
@Entity
@Table(name = "monthly_card_pay", catalog = "cloud_parking")
public class MonthlyCardPay implements java.io.Serializable {

	private Integer id;
	private Integer monthlyCardId;
	private BigDecimal paymentMoney;
	private Integer paymentWay;
	private Date paymentTime;
	private Integer status;
	private Integer isTransfer;

	public MonthlyCardPay() {
	}

	public MonthlyCardPay(Integer monthlyCardId, BigDecimal paymentMoney, Integer paymentWay, Date paymentTime,
			Integer status, Integer isTransfer) {
		this.monthlyCardId = monthlyCardId;
		this.paymentMoney = paymentMoney;
		this.paymentWay = paymentWay;
		this.paymentTime = paymentTime;
		this.status = status;
		this.isTransfer = isTransfer;
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

	@Column(name = "monthly_card_id")
	public Integer getMonthlyCardId() {
		return this.monthlyCardId;
	}

	public void setMonthlyCardId(Integer monthlyCardId) {
		this.monthlyCardId = monthlyCardId;
	}

	@Column(name = "payment_money", precision = 11)
	public BigDecimal getPaymentMoney() {
		return this.paymentMoney;
	}

	public void setPaymentMoney(BigDecimal paymentMoney) {
		this.paymentMoney = paymentMoney;
	}

	@Column(name = "payment_way")
	public Integer getPaymentWay() {
		return this.paymentWay;
	}

	public void setPaymentWay(Integer paymentWay) {
		this.paymentWay = paymentWay;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "payment_time", length = 19)
	public Date getPaymentTime() {
		return this.paymentTime;
	}

	public void setPaymentTime(Date paymentTime) {
		this.paymentTime = paymentTime;
	}

	@Column(name = "status")
	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@Column(name = "is_transfer")
	public Integer getIsTransfer() {
		return this.isTransfer;
	}

	public void setIsTransfer(Integer isTransfer) {
		this.isTransfer = isTransfer;
	}

}