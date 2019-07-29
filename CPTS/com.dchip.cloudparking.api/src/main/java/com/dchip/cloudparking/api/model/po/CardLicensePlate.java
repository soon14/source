package com.dchip.cloudparking.api.model.po;
// Generated 2018-12-5 10:15:39 by Hibernate Tools 5.2.10.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * CardLicensePlate generated by hbm2java
 */
@Entity
@Table(name = "card_license_plate", catalog = "cloud_parking")
public class CardLicensePlate implements java.io.Serializable {

	private int id;
	private int cardId;
	private String lisencePlate;
	private boolean isMain;
	private int moreCarType;
	private String moreCarLisencePlate;

	public CardLicensePlate() {
	}

	public CardLicensePlate(int id, int cardId, String lisencePlate, boolean isMain) {
		this.id = id;
		this.cardId = cardId;
		this.lisencePlate = lisencePlate;
		this.isMain = isMain;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "card_id", nullable = false)
	public int getCardId() {
		return this.cardId;
	}

	public void setCardId(int cardId) {
		this.cardId = cardId;
	}

	@Column(name = "lisence_plate", nullable = false, length = 10)
	public String getLisencePlate() {
		return this.lisencePlate;
	}

	public void setLisencePlate(String lisencePlate) {
		this.lisencePlate = lisencePlate;
	}

	@Column(name = "is_main", nullable = false)
	public boolean isIsMain() {
		return this.isMain;
	}

	public void setIsMain(boolean isMain) {
		this.isMain = isMain;
	}
	
	@Column(name = "more_car_type", length = 1)
	public int getMoreCarType() {
		return this.moreCarType;
	}


	public void setMoreCarType(int moreCarType) {
		this.moreCarType = moreCarType;
	}

	@Column(name = "more_car_lisence_plate", length = 20)
	public String getMoreCarLisencePlate() {
		return this.moreCarLisencePlate;
	}


	public void setMoreCarLisencePlate(String moreCarLisencePlate) {
		this.moreCarLisencePlate = moreCarLisencePlate;
	}

}