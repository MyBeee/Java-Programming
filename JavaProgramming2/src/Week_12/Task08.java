package Week_12;

public class Task08 {

	public static void main(String[] args) {
		try(Task07 res = new Task07("A")) {
			String data = res.read1();
			int value = Integer.parseInt(data);
		} catch (Exception e) {
			System.out.println("예외처리: " + e.getMessage());
		}
		
		System.out.println();
		
		try(Task07 res = new Task07("A")) {
			String data = res.read2();
			int value = Integer.parseInt(data);
		} catch (Exception e) {
			System.out.println("예외처리: " + e.getMessage());
		}
		
		System.out.println();
		
		Task07 res1 = new Task07("A");
		Task07 res2 = new Task07("B");
		try (res1; res2) {
			String data1 = res1.read1();
			String data2 = res2.read1();
		} catch(Exception e) {
			System.out.println("예외 처리: " + e.getMessage());
		}
	}

}
