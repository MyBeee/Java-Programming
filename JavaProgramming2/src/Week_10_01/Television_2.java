package Week_10_01;

public class Television_2 implements RemoteControl_3 {
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	
	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl_3.MAX_VOLUME) {
			this.volume = RemoteControl_3.MAX_VOLUME;
		} else if(volume < RemoteControl_3.MIN_VOLUME) {
			this.volume = RemoteControl_3.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 불륨: " + this.volume);
	}
}
