package structual.facade;

//Complex subsystem components
public class Lighting {
	public void on() {
		System.out.println("Lights are on");
	}

	public void off() {
		System.out.println("Lights are off");
	}

	public void setBrightness(int brightness) {
		System.out.println("Setting brightness to " + brightness);
	}

	public void setColor(String color) {
		System.out.println("Setting color to " + color);
	}
}