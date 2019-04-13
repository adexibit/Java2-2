public class ArrayConverter {

    public void convert2Int(String[][] array) throws MyArrayDataException, MyArraySizeException {
        int arrayLineSize = 0;

        for (int i = 0; i < array.length; i++) {
            arrayLineSize++;
            int arrayColumnSize = 0;
            for (int j = 0; j < array[i].length; j++) {
                arrayColumnSize++;
            }
            if (arrayColumnSize != 4) throw new MyArraySizeException();
        }
        if (arrayLineSize != 4) throw new MyArraySizeException();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum = sum + Integer.valueOf(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j, array[i][j]);
                }
            }
        }
        System.out.println("Сумма составила " + sum);
    }
}
