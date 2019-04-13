public class MyArrayDataException extends Exception {
    private int line;
    private int column;
    private String value;

    public MyArrayDataException(int line, int column, String value) {
        this.line = line;
        this.column = column;
        this.value = value;
    }


    public void inform() {
        System.out.println("В линии " + line + " в позиции " + column + " находится неожиданное значение: " + value);
    }
}
