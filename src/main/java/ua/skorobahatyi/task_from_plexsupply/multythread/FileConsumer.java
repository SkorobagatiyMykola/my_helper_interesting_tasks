package ua.skorobahatyi.task_from_plexsupply.multythread;

import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.BlockingQueue;

public class FileConsumer implements Runnable {
    private final BlockingQueue<String> queue;
    private final String outputFileName;

    public FileConsumer(BlockingQueue queue, String outputFileName) {
        this.queue = queue;
        this.outputFileName = outputFileName;
    }

    @Override
    public void run() {
        try (FileWriter writer = new FileWriter(outputFileName)) {
            String line;
            while ((line = queue.poll()) != null) {
                writer.write(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
