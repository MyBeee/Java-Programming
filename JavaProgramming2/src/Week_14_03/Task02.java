package Week_14_03;

public class Task02 {

	public static void main(String[] args) {
		Button btnOk = new Button();
		
		btnOk.setClickListener(() -> {
			System.out.println("OK 버튼을 클릭했습니다.");
		});
		
		btnOk.click();
		
		Button btnCancel = new Button();
		
		btnCancel.setClickListener(() -> {
			System.out.println("취소 버튼을 클릭했습니다.");
		});
		
		btnCancel.click();
	}

}
