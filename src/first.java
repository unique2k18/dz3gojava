import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        double [] ar1 = {1.15, 2.67, 64.5634, 6.735, 897};
        System.out.println("Кол-во элементов в массиве ar1 - " + ar1.length);
        System.out.println("Элементы массива ar1 - " );
        for (int i = 0; i<ar1.length; i++) {
            System.out.print(ar1[i] + ", ");
        }
        System.out.println();
        double max = Double.MIN_VALUE;
        for (int i = 0; i < ar1.length; i++) {
            max = Math.max(max, ar1[i]);
        }
        System.out.println("Максимальный элемент в массиве ar1: " + max);
        System.out.println();
        double min = Double.MAX_VALUE;
        for (int i = 0; i < ar1.length; i++) {
            min = Math.min(min, ar1[i]);
        }
        System.out.println("Минимальный элемент массива ar1: " + min);

        for(int i=0; i < ar1.length; i++){
            for(int j=1; j < (ar1.length-i); j++){
                if(ar1[j-1] > ar1[j]){
                     double temp = ar1[j-1];
                    ar1[j-1] = ar1[j];
                    ar1[j] = temp;
                }

            }
        }
        System.out.println("Массив после сортировки - ");
        for(int i=0; i < ar1.length; i++){
            System.out.print(ar1[i] + " ");
        }




    }

}
