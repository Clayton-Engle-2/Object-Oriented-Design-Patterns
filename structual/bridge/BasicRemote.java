package structual.bridge;

public class BasicRemote extends RemoteControl {
	
	public BasicRemote(TV tv) {
		super(tv);
	}

	@Override
	public void turnOn() {
		tv.on();
	}

	@Override
	public void turnOff() {
		tv.off();
	}

	@Override
	public void setChannel(int channel) {
		tv.tuneChannel(channel);
	}
}
