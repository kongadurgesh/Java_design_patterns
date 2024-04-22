package bridge;

public class K4Processor implements VideoProcessor {

    @Override
    public void process(String videoFile) {
        System.out.println(videoFile + " is playing in 4K format");
    }

}
