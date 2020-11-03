package Model;

public class Room {
	private int room_No;
	private int floor_No;
	private Room_Type room_Category;
	private Room_View room_View;
	private int noOfGuests;
	private Bed bed;
	private boolean doNotDisturb;
	private boolean isClean;
	private MiniBar miniBar;
	private Maintenance maintenace;
	private Order order;
	private Room_Status room_Status;
	
	public Room(int room_No,int floor_No,Room_Type room_Category,Room_View room_View,int noOfGuests,Bed bed,MiniBar minibar,Maintenance maintenace) {
		setRoom_No(room_No);
		setFloor_No(floor_No);
		setRoom_Category(room_Category);
		setRoom_View(room_View);//enum
		setNoOfGuests(noOfGuests);
		setBed(bed);//enum
		setMiniBar(minibar);
		setMaintenace(maintenace);
		this.doNotDisturb = false;
		this.isClean = true;
		this.room_Status = room_Status.Available;
		
	}
	
	public int getRoom_No() {
		return room_No;
	}
	public void setRoom_No(int room_No) {
		this.room_No = room_No;
	}
	public int getFloor_No() {
		return floor_No;
	}
	public void setFloor_No(int floor_No) {
		this.floor_No = floor_No;
	}
	public Room_Type getRoom_Category() {
		return room_Category;
	}
	public void setRoom_Category(Room_Type room_Category) {
		this.room_Category = room_Category;
	}
	public Room_View getRoom_View() {
		return room_View;
	}
	public void setRoom_View(Room_View room_View) {
		this.room_View = room_View;
	}
	public int getNoOfGuests() {
		return noOfGuests;
	}
	public void setNoOfGuests(int noOfGuests) {
		this.noOfGuests = noOfGuests;
	}
	public Bed getBed() {
		return bed;
	}
	public void setBed(Bed bed) {
		this.bed = bed;
	}
	public boolean isDoNotDisturb() {
		return doNotDisturb;
	}
	public void setDoNotDisturb(boolean doNotDisturb) {
		this.doNotDisturb = doNotDisturb;
	}
	public boolean isClean() {
		return isClean;
	}
	public void setClean(boolean isClean) {
		this.isClean = isClean;
	}
	public MiniBar getMiniBar() {
		return miniBar;
	}
	public void setMiniBar(MiniBar miniBar) {
		this.miniBar = miniBar;
	}
	public Maintenance getMaintenace() {
		return maintenace;
	}
	public void setMaintenace(Maintenance maintenace) {
		this.maintenace = maintenace;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Room_Status getRoom_Status() {
		return room_Status;
	}
	public void setRoom_Status(Room_Status room_Status) {
		this.room_Status = room_Status;
	}
	
	
}
