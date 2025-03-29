package Week_10;

public class Hometask05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		 int[] myArray = {10, 20, 30, 40, 50, 60};

	     System.out.print("Enter a new value for position 2: ");
	     int newValue2 = scanner.nextInt();
	     System.out.print("Enter a new value for position 4: ");
	     int newValue4 = scanner.nextInt();

	     myArray[2] = newValue2;
	     myArray[4] = newValue4;

	     System.out.println("Updated array:");
	     for (int i = 0; i < myArray.length; i++) {
	    	 System.out.println("Element " + i + ": " + myArray[i]);
	     }

	     scanner.close();
	}

}
