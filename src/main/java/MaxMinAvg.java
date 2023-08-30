public class MaxMinAvg {
    public static void main(String[] args) {
        int n = 100;
        double[] array = new double[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }

        double min = array[0];
        double max = array[0];
        double average = 0;
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            if(max < array[i]) {
                max = array[i];
            }
            if (min > array[i]) {
                min = array[i];
            }
            sum += array[i];
        }
        average = sum/ array.length;

        System.out.println(min);
        System.out.println(max);
        System.out.println(average);
    }
}
