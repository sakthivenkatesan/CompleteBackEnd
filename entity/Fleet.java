package com.capgemini.springboot.entity;
import javax.persistence.*;

@Entity
@Table(name="fleet")
public class Fleet {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int FleetId;
	private String FleetCode;
	private String FleetModel;
	private int EconomySeats;
	private int PremiumSeats;
	private int BusinessSeats;

	
	public Fleet() {
		
	}

	public int getFleetId() {
		return FleetId;
	}

	public void setId(int FleetId) {
		this.FleetId = FleetId;
	}

	public String getFleetCode() {
		return FleetCode;
	}

	public void setFleetCode(String FleetCode) {
		this.FleetCode = FleetCode;
	}

	public String getFleetModel() {
		return FleetModel;
	}

	public void setFleetModel(String FleetModel) {
		this.FleetModel = FleetModel;
	}
	public int getEconomySeats() {
		return EconomySeats;
	}

	public void setEconomySeats(int EconomySeats) {
		this.EconomySeats = EconomySeats;
	}
	public int getPremiumSeats() {
		return PremiumSeats;
	}

	public void setPremiumSeats(int PremiumSeats) {
		this.PremiumSeats = PremiumSeats;
	}
	public int getBusinessSeats() {
		return BusinessSeats;
	}

	public void setBusinessSeats(int BusinessSeats) {
		this.BusinessSeats = BusinessSeats;
	}

	
	
}