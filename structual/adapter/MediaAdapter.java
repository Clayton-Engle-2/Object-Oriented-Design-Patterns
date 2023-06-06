package structual.adapter;

public class MediaAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String fileName) {
        if (fileName.endsWith(".vlc")) {
            advancedMediaPlayer.playVlc(fileName);
        } else if (fileName.endsWith(".mp4")) {
            advancedMediaPlayer.playMp4(fileName);
        }
    }

    @Override
    public void pause() {
        // Implement pause functionality for the adapter
        System.out.println("Pause playback");
    }

    @Override
    public void stop() {
        // Implement stop functionality for the adapter
        System.out.println("Stop playback");
    }
}
