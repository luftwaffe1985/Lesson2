/**
 * Java. Level 1. Lesson 2. Hometask
 *
 * @author Dmitry Putov
 * @version dated Sep 17, 2019
 */
// 1.Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
package geekbrains.lesson_3;
//
//import java.util.Arrays;
//
public class Main {
    //
//    public static void main(String[] args) {
//            int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 1};
//            for (int i = 0; i < array.length; i++)
//                array[i] = 1 - array[i];
//      System.out.println(Arrays.toString(array));
//        }
//    }
// 2.Задать пустой целочисленный массив размером 8. ... С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
//    public static void main(String[] args) {
//        int[] array = new int[8];
//        int j = 0;
//        int fill = array.length;
//        System.out.println(" ");
//        System.out.println("Task 2:");
//
//        for (int i = 0; i < fill; ++i, j += 3) {
//            array[i] = j;
//            System.out.print(+array[i] + " ");
//            System.out.println(" ");
//
//        }
//    }
//}
// 3.Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]. пройти по нему циклом, и числа меньшие 6 умножить на 2;
//    public static void main(String[] args) {
//        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
//        int arr3 = array3.length;
//        for (int i = 0; i < arr3; i++) {
//            if (array3[i] < 6)
//                array3[i] = array3[i] * 2;
//        }
//        System.out.println(" ");
//        System.out.print("Task 3:  ");
//
//        for (int i = 0; i < arr3; i++) {
//
//            System.out.print(+array3[i] + ", ");
//        }
//    }
//}
// 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
//
//    public static void main(String args[]) {
//
//
//        int mass[][] = new int[4][4];
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 4; j++) {
//                mass[i][j] = 1;
//                System.out.print(mass[i][j] + " ");
//            }
//        }
//    }
//}
// 5. Задать одномерный массив и найти в нем минимальный и максимальный элементы;
//    public static void main(String args[]) {
//        static int[] findMinMax(int[] array) {
//            int [] MinMax = new int[2];
//            MinMax[0] = MinMax[1] = array[0];
//            for (int i = 0; i < array.length; i++) {
//                if (MinMax[0] > array[i])
//                    MinMax[0] = array[i];
//                if (MinMax[1] < array[i])
//                    MinMax[1] = array[i];
//                System.out.println("Task 5:" + MinMax);
//            }
//        }
//        }
//    }
