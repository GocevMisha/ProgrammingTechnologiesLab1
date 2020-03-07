public class Methods {
    public void showType(){
        byte v_byte = 120;
        short v_short = 129;
        char v_char = 'a';
        int v_int = 65999;
        long v_long = 4294967296L;
        float v_float = 0.3334F;
        double v_double = 0.3333333333333333;
        boolean v_boolean = true;
        System.out.println("This is a byte: " + v_byte);
        System.out.println("This is a short : " + v_short);
        System.out.println("This is a char: " + v_char);
        System.out.println("This is a int: " + v_int);
        System.out.println("This is a long: " + v_long);
        System.out.println("This is a float: " + v_float);
        System.out.println("This is a double: " + v_double);
        System.out.println("This is a boolean: " + v_boolean);
    }
    public void performanceMeasurementInt (){
        long begin = new java.util.Date().getTime();
        int i = 0;
        for (i = 0; i <= 100000000; i++){}
        long end = new java.util.Date().getTime();
        System.out.println("int time" + (end - begin));

    }
    public void performanceMeasurementLong (){
        long begin = new java.util.Date().getTime();
        long i = 0;
        for (i = 0; i <= 100000000; i++){}
        long end = new java.util.Date().getTime();
        System.out.println("long time" + (end - begin));

    }
    public void showAlphabet(){
        for (char i = 'a'; i <= 'z'; i++)
            System.out.println(i);
    }
    public void findBiggest() {
        int[] mas = {12, 43, 12, -65, 778, 123, 32, 76};
        int biggest = 0;
        for (int item: mas)
            if (item > biggest)
                biggest = item;
        System.out.println("biggest" + biggest);
    }
    private int[][] transporate(int [][] matrix, int lenth) {
        for (int i = 0; i < lenth; i++)
            for (int j = i + 1; j < lenth; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        return matrix;
    }
    private int[][] createMatrix(int length){
        int [][] matrix = new int[length][length];
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                matrix[i][j]=(int) Math.round(Math.random() * 10);
            }
        }
        return matrix;
    }
    private void showMatrix(int[][] matrix, int length){
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.printf("%3d", matrix[i][j]);
            }
            System.out.println();
        }
    }
    public void matrix(){
        int length = 3;
        int [][] firstMatrix = createMatrix(length);
        showMatrix(firstMatrix, length);
        int [][] secondMatrix = transporate(firstMatrix, length);
        showMatrix(secondMatrix, length);
    }
}
