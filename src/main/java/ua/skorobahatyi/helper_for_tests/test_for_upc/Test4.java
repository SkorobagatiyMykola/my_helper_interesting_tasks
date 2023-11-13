package ua.skorobahatyi.helper_for_tests.test_for_upc;

public class Test4 {
    float fVal = 0.0f;

    public Test4() {
    }

    public static void main(String[] args) {
        Test4 t = new Test4();
        String testVal = "0.123"; // значения указаны в вариантах ответа
        System.out.println("Was returned " + t.testParse(testVal) + " with value " + t.fVal);
    }

    private boolean testParse(String val) {
        try {
            fVal = Float.parseFloat(val);
            return true;
        } catch (NumberFormatException ex) {
            System.out.println("Test.testParse() Bad number -> " + val);
            fVal = Float.NaN;
        } finally {
            System.out.println("Finally part executed");
        }
        return false;
    }
}
