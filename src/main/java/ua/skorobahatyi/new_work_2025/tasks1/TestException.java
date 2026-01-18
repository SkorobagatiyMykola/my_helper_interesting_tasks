package ua.skorobahatyi.new_work_2025.tasks1;

public class TestException {
    public static void main(String[] args) throws Exception {
        System.out.println("try - catch finally");


        try {
            System.out.println("Внутри блока try");
            throw new Exception();
        } catch (Exception e) {
            System.out.println("Внутри блока catch");
            throw e;
        } finally {
            System.out.println("Внутри блока finally");
        }

        /*try {
            int z=5/0;
        } catch (Exception ex){
            System.out.println("Catch block.");
            throw ex;
            //int x=4/0;
        } finally {
            System.out.println("Finally block.");
        }*/
    }
}
