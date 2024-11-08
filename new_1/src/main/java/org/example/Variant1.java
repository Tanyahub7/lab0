package org.example;
import static java.lang.Math.abs;
public class Variant1 {

    public int integerNumbersTask(int k) {
        if(k<100||k>999){
            throw new IllegalArgumentException(""+k+" should be between 100 and 999 ");
        }
        return k % 10 * 100 + k / 10 % 10 * 10 + k / 100;
    }

    public boolean booleanTask(int a, int b, int c) {
        return abs(a) + abs(b) + abs(c) == a + b + c;
    }

    public int ifTask(int a, int b, int c) {
        if (a < b) {
            if (a < c) {
                return a;
            } else {
                return c;
            }
        } else {
            if (b < c) {
                return b;
            } else {
                return c;
            }
        }
    }


    public double [] switchTask(int elementNumber, double value) {
        double radius;
        final double PI = 3.14;

        switch (elementNumber) {
            case 1: // Радіус
                radius = value;
                break;
            case 2: // Діаметр
                radius = value / 2;
                break;
            case 3: // Довжина кола
                radius = value / (2 * PI);
                break;
            case 4: // Площа кола
                radius = Math.sqrt(value / PI);
                break;
            default:
               throw new IllegalArgumentException(elementNumber+"should be between 1 and 4");

        }

        // Обчислення інших елементів
        double diameter = 2 * radius;
        double length = 2 * PI * radius;
        double area = PI * radius * radius;
        return new double[]{radius,diameter,length,area};



    }

    public float forTask(int n) {
        float sum = 1;
        for (int i = 1; i < n; i++) {
            sum *= 1 + i * 0.1;
        }
        return sum;
    }


    public void whileTask(int a, int b) {
        int sum = 0;
        int K = 0;

        while (sum + (K + 1) <= a) {
            K++;
            sum += K;
        }

        System.out.println("Найбільше K: " + K + ", Сума: " + sum);
    }


    public int[] arrayTask(int[] array) {





        // Масив для збереження елементів з парними індексами (1, 3, 5, ...)
        int[] evenIndexElements = new int[array.length / 2];

        // Заповнюємо новий масив елементами з парними номерами
        for (int i = 1, j = 0; i < array.length; i += 2, j++) {
            evenIndexElements[j] = array[i];
        }

        return evenIndexElements;
    }


    public void twoDimensionArrayTask(int m, int n) {
        int[][] matrix = new int[m][n];

        // Заповнюємо матрицю прикладовими значеннями для демонстрації
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = 10 * (i + 1) + j; // Просто заповнюємо матрицю для прикладу
            }
        }

        // Виведення елементів у заданому порядку
        System.out.println("Виведення матриці в потрібному порядку:");
        for (int j = 0; j < n; j++) {
            if (j % 2 == 0) { // Якщо номер стовпця непарний (0, 2, 4, ...)
                for (int i = 0; i < m; i++) {
                    System.out.print(matrix[i][j] + " ");
                }
            } else { // Якщо номер стовпця парний (1, 3, 5, ...)
                for (int i = m - 1; i >= 0; i--) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println(); // Для переходу на новий рядок після кожного стовпця
        }
    }
}