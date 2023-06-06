package structual.bridge;

public class AdvancedRemote extends RemoteControl {

	public AdvancedRemote(TV tv) {
		super(tv);
	}

	@Override
	public void turnOn() {
		System.out.println("Activating screen mirroring...");
		tv.on();
	}

	@Override
	public void turnOff() {
		System.out.println("Deactivating screen mirroring...");
		tv.off();
	}

	@Override
	public void setChannel(int channel) {
		System.out.println("Setting up PIP mode...");
		tv.tuneChannel(channel);
	}
}
