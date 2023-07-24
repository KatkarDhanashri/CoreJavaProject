package com.Load.Spring.LoadBean;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Products")
public class Load {
	@Id 
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	private String loadId;
	private String loadingpoint;
	private String Unloadingpoint;
	private String productiontype;
	private String trucktype;
	private String noOfTrucks;
	private String weight;
	private String Date;
	
	
	public Load() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Load(String loadId, String loadingpoint, String unloadingpoint, String productiontype, String trucktype,
			String noOfTrucks, String weight, String date) {
		super();
		this.loadId = loadId;
		this.loadingpoint = loadingpoint;
		this.Unloadingpoint = unloadingpoint;
		this.productiontype = productiontype;
		this.trucktype = trucktype;
		this.noOfTrucks = noOfTrucks;
		this.weight = weight;
		this.Date = date;
	}
	public String getLoadId() {
		return loadId;
	}
	public void setLoadId(String loadId) {
		this.loadId = loadId;
	}
	public String getLoadingpoint() {
		return loadingpoint;
	}
	public void setLoadingpoint(String loadingpoint) {
		this.loadingpoint = loadingpoint;
	}
	public String getUnloadingpoint() {
		return Unloadingpoint;
	}
	public void setUnloadingpoint(String unloadingpoint) {
		this.Unloadingpoint = unloadingpoint;
	}
	public String getProductiontype() {
		return productiontype;
	}
	public void setProductiontype(String productiontype) {
		this.productiontype = productiontype;
	}
	public String getTrucktype() {
		return trucktype;
	}
	public void setTrucktype(String trucktype) {
		this.trucktype = trucktype;
	}
	public String getNoOfTrucks() {
		return noOfTrucks;
	}
	public void setNoOfTrucks(String noOfTrucks) {
		this.noOfTrucks = noOfTrucks;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		this.Date = date;
	}	
	
}
