package ua.skorobahatyi.helper_for_tests.it_quiz;

public class Task10 implements  FirstInterface,SecondInterface{
    @Override
    public String talk() {
        return null;
    }

    @Override
    public String whisper() {
        return FirstInterface.super.whisper();
    }
}

interface FirstInterface {
    String talk();
    default String whisper() {
        return talk() + ", but softer";
    }
    default String yell() {
        return talk() + ", but louder";
    }
}
interface SecondInterface {
    String talk();
    default String whisper() {
        return talk() + ", but less annoying";
    }
    default String shout() {
        return talk() + ", but more annoying";
    }
}