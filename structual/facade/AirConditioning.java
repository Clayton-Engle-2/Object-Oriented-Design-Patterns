package structual.facade;

public class AirConditioning {
	public void on() {
		System.out.println("AirConditioning is on");
	}

	public void off() {
		System.out.println("AirConditioning is off");
	}

	public void setTemperature(int temperature) {
		System.out.println("Setting temperature to " + temperature);
	}

	public void setMode(String mode) {
		System.out.println("Setting mode to " + mode);
	}
}