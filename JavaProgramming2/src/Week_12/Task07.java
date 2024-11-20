package Week_12;

public class Task07 implements AutoCloseable{
	private String name;
	
	public Task07(String name) {
		this.name = name;
		System.out.println("[Task07(" + name + ") 열기]");
	}
	
	public String read1() {
		System.out.println("[Task07(" + name + ") 열기]");
		return "100";
	}
	
	public String read2() {
		System.out.println("[Task07(" + name + ") 열기]");
		return "abs";
	}
	
	@Override
	public void close() throws Exception {
		System.out.println("[Task07(" + name + ") 열기]");
	}
	
	public static void main(String[] args) {
        try (Task07 resource = new Task07("Resource")) {
            System.out.println(resource.read1());
            System.out.println(resource.read2());
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
}
