package com.oms.bean;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("bikeinfor")
@JsonSubTypes({ @Type(value = ReceiveBikeInfor.class, name = "bikeinfor") })

public class ReceiveBikeInfor {
	private String idBike;

	private String typeBike;

	private String costBike;

	private String positionBike;

	public ReceiveBikeInfor() {
		super();
	}

	public ReceiveBikeInfor(String idBike, String typeBike, String costBike, String positionBike) {
		super();
		this.setIdBike(idBike);
		this.setTypeBike(typeBike);
		this.setCostBike(costBike);
		this.setPositionBike(positionBike);
	}

	@Override
	public String toString() {
		return "idBike: " + this.idBike + ", typeBike: " + this.typeBike + ", costBike: " + this.costBike + ", positionBike: " + this.positionBike;
	}

	public boolean match(ReceiveBikeInfor bikeinfor) {
		if (bikeinfor == null)
			return true;

		if (bikeinfor.idBike != null && !bikeinfor.idBike.equals("") && !this.idBike.contains(bikeinfor.idBike)) {
			return false;
		}
		if (bikeinfor.typeBike != null && !bikeinfor.typeBike.equals("") && !this.typeBike.contains(bikeinfor.typeBike)) {
			return false;
		}
		if (bikeinfor.costBike != null && !bikeinfor.costBike.equals("") && !this.costBike.contains(bikeinfor.costBike)) {
			return false;
		}
		if (bikeinfor.positionBike != null && !bikeinfor.positionBike.equals("") && !this.positionBike.contains(bikeinfor.positionBike)) {
			return false;
		}
		return true;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ReceiveBikeInfor) {
			return this.idBike.equals(((ReceiveBikeInfor) obj).idBike);
		}
		return false;
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

	public String getCostBike() {
		return costBike;
	}

	public void setCostBike(String costBike) {
		this.costBike = costBike;
	}

	public String getPositionBike() {
		return positionBike;
	}

	public void setPositionBike(String positionBike) {
		this.positionBike = positionBike;
	}
}