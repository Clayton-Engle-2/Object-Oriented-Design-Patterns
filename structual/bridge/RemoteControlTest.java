package structual.bridge;

public class RemoteControlTest {
	
	public void runRemoteTest(String[] args) {
		RemoteControl basicSonyRemote = new BasicRemote(new SonyTV());
		basicSonyRemote.turnOn();
		basicSonyRemote.setChannel(10);
		basicSonyRemote.turnOff();

		System.out.println("-----------------------------");

		RemoteControl advancedSamsungRemote = new AdvancedRemote(new SamsungTV());
		advancedSamsungRemote.turnOn();
		advancedSamsungRemote.setChannel(10);
		advancedSamsungRemote.turnOff();
	}
}
