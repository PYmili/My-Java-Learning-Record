package object_oriented.overwrite;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        player.play();

        VideoPlayer videoPlayer = new VideoPlayer();
        videoPlayer.play();
    }
}
