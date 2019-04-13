import java.util.Random;

public class MyArrays {
    protected String[][] goodArray;
    protected String[][] wrongSizeArray;
    protected String[][] bugContainedArray;

    private Random rnd;

    public MyArrays() {
        this.goodArray = new String[4][4];
        for (int i = 0; i < goodArray.length; i++) {
            for (int j = 0; j < goodArray[i].length; j++) {
                rnd = new Random();
                goodArray[i][j] = String.valueOf(rnd.nextInt(100));
            }
        }
        this.wrongSizeArray = new String[7][3];
        for (int i = 0; i < wrongSizeArray.length; i++) {
            for (int j = 0; j < wrongSizeArray[i].length; j++) {
                rnd = new Random();
                wrongSizeArray[i][j] = String.valueOf(rnd.nextInt(100));
            }
        }
        this.bugContainedArray = new String[4][4];
        for (int i = 0; i < bugContainedArray.length; i++) {
            for (int j = 0; j < bugContainedArray[i].length; j++) {
                rnd = new Random();
                bugContainedArray[i][j] = String.valueOf(rnd.nextInt(100));
            }
        }
        this.bugContainedArray[rnd.nextInt(3)][rnd.nextInt(3)] = "bug";
    }
}
