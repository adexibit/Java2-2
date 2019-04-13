public class Launcher {
    public static void main(String[] args) {
        MyArrays myArrays = new MyArrays();
        ArrayConverter converter = new ArrayConverter();

        try {
            converter.convert2Int(myArrays.goodArray);

        } catch (MyArraySizeException | MyArrayDataException e) {
            if (e instanceof MyArraySizeException) ((MyArraySizeException) e).inform();
            if (e instanceof MyArrayDataException) ((MyArrayDataException) e).inform();
        }

        try {
            converter.convert2Int(myArrays.wrongSizeArray);

        } catch (MyArraySizeException | MyArrayDataException e) {
            if (e instanceof MyArraySizeException) ((MyArraySizeException) e).inform();
            if (e instanceof MyArrayDataException) ((MyArrayDataException) e).inform();
        }

        try {
            converter.convert2Int(myArrays.bugContainedArray);

        } catch (MyArraySizeException | MyArrayDataException e) {
            if (e instanceof MyArraySizeException) ((MyArraySizeException) e).inform();
            if (e instanceof MyArrayDataException) ((MyArrayDataException) e).inform();
        }

    }
}



