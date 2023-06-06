package structual.facade;

public class AudioSystem {

	public void on() {
		System.out.println("AudioSystem is on");
	}

	public void off() {
		System.out.println("AudioSystem is off");
	}

	public void play(String song) {
		System.out.println("Playing song " + song);
	}

	public void pause() {
		System.out.println("Pausing audio");
	}

	public void stop() {
		System.out.println("Stopping audio");
	}
}
