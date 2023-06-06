package structual.facade;

public class HomeAutomationApp {
	
	public void runFacade() {
		Lighting lights = new Lighting();
		AirConditioning ac = new AirConditioning();
		AudioSystem audio = new AudioSystem();

		HomeAutomationFacade facade = new HomeAutomationFacade(lights, ac, audio);

		// Instead of calling each subsystem separately, you can use the facade
		facade.comeHome();
		facade.watchMovie();
		facade.partyMode();
		facade.leaveHome();
	}
}