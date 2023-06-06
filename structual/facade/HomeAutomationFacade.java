package structual.facade;

public class HomeAutomationFacade {

	private Lighting lights;
	private AirConditioning ac;
	private AudioSystem audio;

	public HomeAutomationFacade(Lighting lights, AirConditioning ac, AudioSystem audio) {
		this.lights = lights;
		this.ac = ac;
		this.audio = audio;
	}

	public void leaveHome() {
		System.out.println("\nLeaving home...");
		lights.off();
		ac.off();
		audio.off();
	}

	public void comeHome() {
		System.out.println("\nComing home...");
		lights.on();
		ac.on();
		audio.play("Welcome Home");
	}

	public void watchMovie() {
		System.out.println("\nWatching a movie...");
		lights.setBrightness(50);
		lights.setColor("red");
		ac.setTemperature(72);
		audio.play("The Dark Knight");
	}

	public void partyMode() {
		System.out.println("\nParty mode...");
		lights.setBrightness(100);
		lights.setColor("blue");
		ac.setTemperature(68);
		audio.play("Party Rock Anthem");
	}

}
