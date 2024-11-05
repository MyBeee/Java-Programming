package Week_10_01;

public class Audio_2 implements RemoteControl_3 {
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
		if(volume > RemoteControl_3.MAX_VOLUME) {
			this.volume = RemoteControl_3.MAX_VOLUME;
		} else if(volume < RemoteControl_3.MIN_VOLUME) {
			this.volume = RemoteControl_3.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 불륨: " + this.volume);
	}
	
	private int memoryVolume;
	
	@Override
	public void setMute(boolean mute) {
		if(mute) {
			this.memoryVolume = this.volume;
			System.out.println("무음 처리합니다.");
			setVolume(RemoteControl_3.MIN_VOLUME);
		} else {
			System.out.println("무음 해제합니다.");
			setVolume(this.memoryVolume);
		}
	}
}
