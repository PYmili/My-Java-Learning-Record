package object_oriented.overwrite;

/*
 * 视频播放器，继承播放器类
 */
public class VideoPlayer extends Player {

    /*
     * 重写主类的播放方法
     */
    @Override
    public void play() {
        System.out.println("Video Player is playing.");
    }
}
