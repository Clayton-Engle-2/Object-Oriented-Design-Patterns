package structual.adapter;

public class AdapterClient {
	
	public void runAdapter() {
        MediaPlayer mediaPlayer = new MediaAdapter("mp4");
        mediaPlayer.play("movie.mp4");
        mediaPlayer.pause();
        mediaPlayer.stop();
        
        System.out.println();

        MediaPlayer mediaPlayer2 = new MediaAdapter("vlc");
        mediaPlayer2.play("video.vlc");
        mediaPlayer2.pause();
        mediaPlayer2.stop();
    }

}
