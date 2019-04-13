public class MyArraySizeException extends RuntimeException {

    protected void inform() {
        System.out.println("Данный массив неверной размерности");
    }
}
