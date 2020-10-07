package cse360assignment02;

public class AddingMachine {
    private int total;
    private String output;

    public AddingMachine() {
        total = 0;  // not needed - included for clarity
        output = "0";
    }

    public int getTotal() {
        return total;
    }

    public void add(int value) {
        total = total + value;
        output = output + " + " + value + " = " + total;
    }

    public void subtract(int value) {
        total = total - value;
        output = output + " - " + value + " = " + total;
    }

    public String toString() {
        return output;
    }

    public void clear() {
        total = 0;
        output = "0";
    }
}