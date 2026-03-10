package hotel;

public abstract class BookMyStayApp {

    protected int roomNumber;
    protected String roomType;
    protected double price;
    protected boolean available;

    public BookMyStayApp (int roomNumber, String roomType, double price, boolean available) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.price = price;
        this.available = available;
    }

    public void displayDetails() {
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Type: " + roomType);
        System.out.println("Price: " + price);
        System.out.println("Available: " + available);
        System.out.println();
    }
}