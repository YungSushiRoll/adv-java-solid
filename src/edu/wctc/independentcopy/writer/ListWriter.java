package edu.wctc.independentcopy.writer;

public class ListWriter implements Writer {
    @Override
    public void writeln(String line) {
        System.out.println("I am taking that list and coping it..");
        System.out.println(line);
    }
}
