package ua.skorobahatyi.design_patterns.structural_patterns.bridge;

public class CppDeveloper implements Developer{
    @Override
    public void wtiteCode() {
        System.out.println("C++ developer writes C++ code...");
    }
}
