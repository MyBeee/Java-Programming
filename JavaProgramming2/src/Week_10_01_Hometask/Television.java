package Week_10_01_Hometask;

public class Television implements RemoteControl {
	@Override
	public void turnOn() {
		System.out.println("텔레비전의 전원이 켜졌습니다.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("텔레비전의 전원이 꺼졌습니다.");
	}
}
