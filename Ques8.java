class Room {
    int roomno;
    String roomtype;
    double roomarea;
    boolean ACmachine;

    void setData(int roomno, String roomtype, double roomarea, boolean ACmachine) {
        this.roomno = roomno;
        this.roomtype = roomtype;
        this.roomarea = roomarea;
        this.ACmachine = ACmachine;
    }

    void displayData() {
        System.out.println("Room Number = " + roomno);
        System.out.println("Room Type = " + roomtype);
        System.out.println("Room Area = " + roomarea);
        System.out.println("AC Machine = " + ACmachine);
    }
}

public class Ques8{
    public static void main(String[] args) {
        Room r = new Room();
        r.setData(101, "Deluxe", 250.5, true);
        r.displayData();
    }
}
