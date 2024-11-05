package Week_10_01;

public class Audio_1 implements RemoteControl_2 {
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}
	
	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl_2.MAX_VOLUME) {
			this.volume = RemoteControl_2.MAX_VOLUME;
		} else if(volume < RemoteControl_2.MIN_VOLUME) {
			this.volume = RemoteControl_2.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 불륨: " + this.volume);
	}
}
