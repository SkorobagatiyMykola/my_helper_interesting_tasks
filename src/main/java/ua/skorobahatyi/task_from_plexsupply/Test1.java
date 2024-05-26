package ua.skorobahatyi.task_from_plexsupply;

import java.io.*;

public class Test1 {

    public static void main(String[] args) throws IOException {


        String path = "src/main/java/ua/skorobahatyi/task_from_plexsupply/input.txt";
        FileReader reader = new FileReader(path);

        BufferedReader bufferedReader = new BufferedReader(reader);

        int i = 0;

        int max = 0;

        int maxLineNum = 0;

        int valueInt = 0;
        while (bufferedReader.ready()) {
            String valueStr = bufferedReader.readLine();
            i++;
            try {
                valueInt = Integer.valueOf(valueStr);
            } catch (NumberFormatException ex) {
                System.out.println("line " + i + ":  " + valueStr);
            }


            if (max < valueInt) {
                max = valueInt;
                maxLineNum = i;
            }
        }

        System.out.println(max + "This is line:" + maxLineNum);

        reader.close();


        System.out.println("==============================================");
    }
}
