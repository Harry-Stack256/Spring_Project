package service;

public class Marker {
	//a class that markers a name with a location 
	private String name;
	private double latitude;
	private double  longitude;
	private String ID;
	public Marker(String name, double latitude, double longitude, String iD) {
		super();
		this.name = name;
		this.latitude = latitude;
		this.longitude = longitude;
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	
	
	

}
