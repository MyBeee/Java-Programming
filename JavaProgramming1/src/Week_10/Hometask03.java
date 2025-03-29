package Week_10;

public class Hometask03 {

	public static void main(String[] args) {
		int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] b = new int[5];
		int count = 0;
		
		for(int i=0; i<a.length; i++) {
			if(a[i] % 2 == 1) {
				b[count] = a[i];
				count++;
			}
		}
		
		for(int i=0; i<b.length; i++) {
			if (i == b.length - 1) {
                System.out.print(b[i]);
            } else {
                System.out.print(b[i] + ", ");
            }
		}
	}

}
