package Model;

import java.util.Map;
import java.util.Vector;

import View.Employee;

public class Hotel {
	
	private String hotel_Name;
	private String hotel_Address;
	private Vector<Room> hotel_Rooms;
	private Map<String, Integer> hotel_Stock;
	private Vector<Employee> maintenance_Staff;
	private Vector<Employee> cleaning_Staff;
	private Vector<Employee> parking_Staff;
	
	
	
	public Hotel(String hotel_Name, String hotel_Address,Vector<Room> rooms) {
		this.hotel_Name = hotel_Name;
		this.hotel_Address = hotel_Address;
		
	}
	
	@Override
	public String toString() {
		return "Hotel [hotel_Name=" + hotel_Name + ", hotel_Address=" + hotel_Address + ", hotel_Rooms=" + hotel_Rooms
				+ ", hotel_Stock=" + hotel_Stock + ", maintenance_Staff=" + maintenance_Staff + ", cleaning_Staff="
				+ cleaning_Staff + ", parking_Staff=" + parking_Staff + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cleaning_Staff == null) ? 0 : cleaning_Staff.hashCode());
		result = prime * result + ((hotel_Address == null) ? 0 : hotel_Address.hashCode());
		result = prime * result + ((hotel_Name == null) ? 0 : hotel_Name.hashCode());
		result = prime * result + ((hotel_Rooms == null) ? 0 : hotel_Rooms.hashCode());
		result = prime * result + ((hotel_Stock == null) ? 0 : hotel_Stock.hashCode());
		result = prime * result + ((maintenance_Staff == null) ? 0 : maintenance_Staff.hashCode());
		result = prime * result + ((parking_Staff == null) ? 0 : parking_Staff.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hotel other = (Hotel) obj;
		if (cleaning_Staff == null) {
			if (other.cleaning_Staff != null)
				return false;
		} else if (!cleaning_Staff.equals(other.cleaning_Staff))
			return false;
		if (hotel_Address == null) {
			if (other.hotel_Address != null)
				return false;
		} else if (!hotel_Address.equals(other.hotel_Address))
			return false;
		if (hotel_Name == null) {
			if (other.hotel_Name != null)
				return false;
		} else if (!hotel_Name.equals(other.hotel_Name))
			return false;
		if (hotel_Rooms == null) {
			if (other.hotel_Rooms != null)
				return false;
		} else if (!hotel_Rooms.equals(other.hotel_Rooms))
			return false;
		if (hotel_Stock == null) {
			if (other.hotel_Stock != null)
				return false;
		} else if (!hotel_Stock.equals(other.hotel_Stock))
			return false;
		if (maintenance_Staff == null) {
			if (other.maintenance_Staff != null)
				return false;
		} else if (!maintenance_Staff.equals(other.maintenance_Staff))
			return false;
		if (parking_Staff == null) {
			if (other.parking_Staff != null)
				return false;
		} else if (!parking_Staff.equals(other.parking_Staff))
			return false;
		return true;
	}
	public String getHotel_Name() {
		return hotel_Name;
	}
	public void setHotel_Name(String hotel_Name) {
		this.hotel_Name = hotel_Name;
	}
	
	public String getHotel_Address() {
		return hotel_Address;
	}
	public void setHotel_Address(String hotel_Address) {
		this.hotel_Address = hotel_Address;
	}
	
	public Vector<Room> getHotel_Rooms() {
		return hotel_Rooms;
	}
	public void setRooms(Vector<Room> rooms) {
		this.hotel_Rooms = new Vector<>();
		
		for(Room rm: rooms) {
			/*enter each room separately */
			hotel_Rooms.add(rm);
		}
		
	}
	
	public Map<String, Integer> getHotel_Stock() {
		return hotel_Stock;
	}
	public void setHotel_Stock(Map<String, Integer> hotel_Stock) {
		this.hotel_Stock = hotel_Stock;
	}
	
	public Vector<Employee> getMaintenance_Staff() {
		return maintenance_Staff;
	}
	public void setMaintenance_Staff(Vector<Employee> maintenance_Staff) {
		this.maintenance_Staff = maintenance_Staff;
	}
	
	public Vector<Employee> getCleaning_Staff() {
		return cleaning_Staff;
	}
	public void setCleaning_Staff(Vector<Employee> cleaning_Staff) {
		this.cleaning_Staff = cleaning_Staff;
	}
	
	public Vector<Employee> getParking_Staff() {
		return parking_Staff;
	}
	public void setParking_Staff(Vector<Employee> parking_Staff) {
		this.parking_Staff = parking_Staff;
	}
	
	
	
	public void searchAvailableRoom(Order order) {
		Room room = order.getRoom();
		Room_View roomView;
		if()
		
	}
	
	
	
	
	
	
	
}
