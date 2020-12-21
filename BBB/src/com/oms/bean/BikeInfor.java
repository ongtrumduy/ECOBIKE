package com.oms.bean;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("bike")
@JsonSubTypes({ @Type(value = BikeInfor.class, name = "bike") })
public class BikeInfor {
	private String idBike;
	private String typeBike;
	private String costBike;
	private String positionBike;
//	private float distance;
//	private float time;

	public BikeInfor() {
		super();
	}

	public BikeInfor(String idBike, String typeBike, String costBike, String positionBike) {
		this.setIdBike(idBike);
		this.setTypeBike(typeBike);
		this.setCostBike(costBike);
		this.setPositionBike(positionBike);

	}

	@Override
	public String toString() {
		return "idBike: " + this.idBike + ", typeBike: " + this.typeBike + ", costBike: " + this.costBike
				+ ", positionBike: " + this.positionBike;
	}

	public boolean match(BikeInfor bike) {
		if (bike == null)
			return true;

		if (bike.idBike != null && !bike.idBike.equals("") && !this.idBike.contains(bike.idBike)) {
			return false;
		}
		if (bike.typeBike != null && !bike.typeBike.equals("") && !this.typeBike.contains(bike.typeBike)) {
			return false;
		}
		if (bike.costBike != null && !bike.costBike.equals("") && !this.costBike.contains(bike.costBike)) {
			return false;
		}
		if (bike.positionBike != null && !bike.positionBike.equals("")
				&& !this.positionBike.contains(bike.positionBike)) {
			return false;
		}

		return true;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof BikeInfor) {
			return this.idBike.equals(((BikeInfor) obj).idBike);
		}
		return false;
	}

	public boolean matchId(BikeInfor bike) {
		if (bike == null)
			return false;

		if (!this.idBike.equals(bike.idBike)) {
			return false;
		}

		return true;
	}

	public String getIdBike() {
		return idBike;
	}

	public void setIdBike(String idBike) {
		this.idBike = idBike;
	}

	public String getTypeBike() {
		return typeBike;
	}

	public void setTypeBike(String typeBike) {
		this.typeBike = typeBike;
	}

	public String getPositionBike() {
		return positionBike;
	}

	public void setPositionBike(String positionBike) {
		this.positionBike = positionBike;
	}

	public String getCostBike() {
		return costBike;
	}

	public void setCostBike(String costBike) {
		this.costBike = costBike;
	}

}