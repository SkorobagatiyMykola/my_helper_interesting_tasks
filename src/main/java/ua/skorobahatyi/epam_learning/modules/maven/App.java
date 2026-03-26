package ua.skorobahatyi.epam_learning.modules.maven;


public class App {
    public static void main( String[] args )    {
        System.out.println( "Hello World!" );
        ColorQuiz colorQuiz = new ColorQuiz();
        ColorQuiz.Color color = ColorQuiz.Color.valueOf(args[0]);
        boolean res= colorQuiz.guessTheColor(color);

        System.out.println( "My color: "+ color);
        //System.out.println( "Get RandomColor: ");


        System.out.println( "Result: "+ res);

    }
}
