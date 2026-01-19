package ua.skorobahatyi.help_for_db;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

/**
 *  Created Database for Articles
 * */
public class CreateDB {
    private final static String INSERT_ARTICLE = "INSERT INTO articles(title,text) VALUES('title count','text count');";
    private final static String INSERT_COMMENTS = "INSERT INTO comments(text,score,article_id) VALUES('comment (id=comment_id) text for article_id_value',score_value,article_id_value);";
    private final static String file_name = "createDB.sql";
    private final static int ARTICLE_COUNT = 100;
    private final static int COMMENT_MAX_COUNT = 10;
    private final static int MAX_SCORE = 100;

    public static void main(String[] args) throws IOException {

        FileWriter myWriter = new FileWriter(file_name);
        for (int i = 1; i <= ARTICLE_COUNT; i++) {
            String result = INSERT_ARTICLE.replaceAll("count", String.valueOf(i));
            System.out.println(result);
            myWriter.write(result + "\n");
        }

        System.out.println();
        myWriter.write("\n");

        for (int i = 1; i <= ARTICLE_COUNT; i++) {
            int count_comment = new Random().nextInt(COMMENT_MAX_COUNT);
            for (int j = 1; j <= count_comment; j++) {
                int score = new Random().nextInt( MAX_SCORE);
                String result = INSERT_COMMENTS
                        .replace("comment_id", String.valueOf(j))
                        .replace("article_id_value", String.valueOf(i))
                        .replaceAll("score_value", String.valueOf(score));
                System.out.println(result);
                myWriter.write(result + "\n");
            }
        }
        myWriter.close();  // must close manually
        System.out.println("Successfully wrote to the file.");
    }

}
