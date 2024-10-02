package Week_04;

public class House_2 {
	String name = "주택";
	int room;
	int bathroom;
	String field;
	
	House_2() {}
	
	House_2(int room) {
		this.room = room;
	}
	
	House_2(int room, int bathroom) {
		this.room = room;
		this.bathroom = bathroom;
	}
	
	House_2(int room, int bathroom, String field) {
		this.room = room;
		this.bathroom = bathroom;
		this.field = field;
	}
}
