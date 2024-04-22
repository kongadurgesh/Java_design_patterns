package bridge;

public class HDProcesssor implements VideoProcessor {

    @Override
    public void process(String videoFile) {
        System.out.println(videoFile + " is playing in HD format");
    }

}
