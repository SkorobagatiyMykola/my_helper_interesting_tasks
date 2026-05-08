package ua.skorobahatyi.epam_2026.module_02.__jvm_memory;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.lang.Thread.sleep;

public class ExampleOutOfMemory {
    public static void main(String[] args) {
        Map<Long,String> map = new HashMap<>();
        Map<Long,String> map2 = new HashMap<>();

        Random random = new Random();

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        try {
            sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        while (true){
            map.put(Long.valueOf(random.nextInt()*(random.nextInt()-1)), "soRandom");
            map2.put(Long.valueOf(random.nextInt()*(random.nextInt()-1)), "soRandom");
            if (map.size()%1_000_000==0){
                System.out.println("====="+map.size());
            }

        }
    }
}
