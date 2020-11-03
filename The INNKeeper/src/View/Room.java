package View;

public class Room {	
	private int Roomnumber;
	private boolean IsEmpty;
	private boolean IsClean;
	private int FloorNumber;
	private char RoomTypeCode;
	
	
	
	public Room (int Roomnumber,boolean IsEmpty,boolean IsClean,int FloorNumber,char RoomTypeCode) {	
		
		setRoomnumber(Roomnumber);
		setIsEmpty(IsEmpty);
		setIsClean(IsClean);
		setFloorNumber(FloorNumber);
		setRoomTypeCode(RoomTypeCode);
		
	 }
	
	public int getRoomnumber() {
		return Roomnumber;
	}

	public void setRoomnumber(int roomnumber) {
		this.Roomnumber = roomnumber;
	}

	public boolean isIsEmpty() {
		return IsEmpty;
	}

	public void setIsEmpty(boolean isEmpty) {
		this.IsEmpty = isEmpty;
	}

	public boolean isIsClean() {
		return IsClean;
	}

	public void setIsClean(boolean isClean) {
		this.IsClean = isClean;
	}

	public int getFloorNumber() {
		return FloorNumber;
	}

	public void setFloorNumber(int floorNumber) {
		this.FloorNumber = floorNumber;
	}

	public char getRoomTypeCode() {
		return RoomTypeCode;
	}

	public void setRoomTypeCode(char roomTypeCode) {
		this.RoomTypeCode = roomTypeCode;
	}


}