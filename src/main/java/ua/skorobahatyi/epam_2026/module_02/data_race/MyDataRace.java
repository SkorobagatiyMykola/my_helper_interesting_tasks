package ua.skorobahatyi.epam_2026.module_02.data_race;

import static java.lang.Thread.sleep;

public class MyDataRace {
    private static int count=0;
    private static int n=1_000_000;
    public static void main(String[] args) throws InterruptedException {
        Thread th1 = new Thread(()->
        {
            for (int i = 0; i <n ; i++) {
                count++;
              /*  try {
                    //sleep(4);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }*/
                //System.out.println(count);
            }
        });


        th1.start();
        th1.join();

        System.out.println(count);



    }
}
