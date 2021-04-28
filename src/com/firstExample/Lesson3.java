package com.firstExample;

import java.util.Random;
import java.util.Scanner;
/*
Винник Владимир
Коментарии предназначены для коллег, пытающихся познать Дзэн.
 */
public class Lesson3 {
    public static void task1() {
        int[] evenArray = new int[10]; // мы хорошо подумали и поняли,что нам нужен массив из 10 элементов, создали массив

        int even = 2;                           // наша первая четная, пихнем её в массив первой.

        for (int i = 0; i < evenArray.length; i++) {  // проходим циклом по всему массива, от нуля до последнего индекса
            evenArray[i] = even;                     // ( i- в нашем случае индекс массива)
            even += 2;                               //  после добавления в массив, получаем следующее четное число.
        }
        // смотрим, чего мы наворотили
        for (int i = 0; i < evenArray.length; i++) {
            System.out.print(evenArray[i] + " ");  //это будет в строку, через пробел.
        }

        System.out.println();// переводим курсор на новую строку

        for (int i = 0; i < evenArray.length; i++) {
            System.out.println(evenArray[i]);  //это будет в столбик.
        }

    }

    public static void task2() {
        int[] notEvenArray = new int[50]; // мы хорошо подумали и поняли,что нам нужен массив из 50 элементов, создали массив

        int notEven = 1;                           // наша первая нечетная.

        for (int i = 0; i < notEvenArray.length; i++) {  // проходим циклом по всему массива, от нуля до последнего индекса
            notEvenArray[i] = notEven;                     // ( i- в нашем случае индекс массива)
            notEven += 2;                               //  после добавления в массив, получаем следующее нечетное число.
        }
        // смотрим, чего мы наворотили
        for (int i = 0; i < notEvenArray.length; i++) {
            System.out.print(notEvenArray[i] + " ");  //это будет в строку, через пробел.
        }
        System.out.println();
        // выводим элементы массива в обратной последовательности МЫ НЕ МЕНЯЕМ СТРУКТУРУ, просто выводим.
        for (int i = notEvenArray.length - 1; i >= 0; i--) { // первые элемент должен быть notEvenArray.length -1;
            System.out.print(notEvenArray[i] + " ");         // т.к. массив начинается с 0 и последний индекс 49
        }
    }

    public static void task3() {
        int[] array = new int[15];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        int totalEven = 0;       // переменную будем использовать как счетчик четных чисел
        for (int item : array) {           // это for-each, нужно к нему привыкать, некоторые коллекции проходятся только
            System.out.print(item + " ");// c помощью его. Перебирает каждый элемент массива или коллекции.


            if (item % 2 == 0 & item != 0) {            //если наш элемент четный и не 0( я не знаю, можно ли считать
                totalEven++;                             // его четным) счетчик увеличивается на еденицу                             // В нем нельзя ничего менять в массиве( мне даже не удалось инициализировать
                //массив.), только сравнивать или выводить.
            }
        }
        // for (int i = 0; i < array.length; i++) {
        //     System.out.print(array[i] + " ");              // эквивалентная запись выше, сказанного
        //     if (array[i] % 2 == 0 & array[i] != 0) {
        //         totalEven++;
        //     }
        // }


        System.out.println();
        System.out.println("Количество четных чисел в массиве - " + totalEven);
    }


    public static void task4() {
        int[] array = new int[20];    //создаем массив
        Random random = new Random();  // создаем

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(21);
        }


        for (int item : array) {
            System.out.print(item + " ");
        }


        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            }
        }
        System.out.println();

        for (int item : array) {
            System.out.print(item + " ");
        }

    }

    public static void task5() {
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        Random random = new Random();

        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(16);
            array2[i] = random.nextInt(16);
        }


        for (int item : array1) {
            System.out.print(item + " ");
        }

        System.out.println();

        for (int item : array2) {
            System.out.print(item + " ");
        }

        System.out.println();

        int totalArray1 = 0;
        int totalArray2 = 0;

        for (int i = 0; i < array1.length; i++) {
            totalArray1 += array1[i];
            totalArray2 += array2[i];
        }


        if (totalArray1 / array1.length == totalArray2 / array2.length) {
            System.out.println("Средние значения элементов двух массивов ровны");
        } else {
            System.out.println("Cреднее арифметическое значение элементов больше у " +
                    ((totalArray1 / array1.length > totalArray2 / array2.length) ? "первого" : "второго" + " массива"));
        }

    }

    public static void task6() {
        int[] array = new int[4];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(11);

        }

        for (int item : array) {
            System.out.print(item + " ");
        }
        // будем считать, что строго возростающая последовательност, это когда каждый последующий член массива
        //   больше предыдущего (не равно).
        boolean isRising = true; // будем ориентироваться по этой переменной, мы предпологаем, что массив восходящий
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1] || array[i] == array[i + 1]) {//если наше утверждение хотя бы раз не
                isRising = false;                                     //  подтвердится неша переменная станет false
            }

        }
        System.out.println();
        System.out.println("Данный масив " + ((!isRising) ? "не " : "") + "является строго восходящей последовательностью");
    }

    public static void task7() {
        int[] array = new int[12];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(16);

        }

        for (int item : array) {
            System.out.print(item + " ");
        }

        int max = array[0];                   // ну здесь как в лекции. назначаем первый элемент
        int lastIndex = 0;                    // как наименьший, и сравниваем со всеми членами массива
        for (int i = 1; i < array.length - 1; i++) { //в зависимости от результата меняем значения max
            if (max <= array[i]) {
                max = array[i];
                lastIndex = i;     // заодно определяем индекс последнего (вхождения) упоминания в массиве
            }
        }
        if (max == array[array.length - 1]) {// данную проверку пришлось заколбасить, т.к. если
            lastIndex = array.length;        // максимальный элемент приходился на последний член массива
        }                                    // предыдущий блок кода не присваевал корректный lastIndex
        System.out.println();
        System.out.println("Максимальный элемент массива равен " + max
                + " , последний индекс вхождения в массив " + lastIndex);

    }

    public static void task8() {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Укажите размер мыссива");
        int n = 0;
        try {    // блок try-catch, в данном случае страхует от ввода строчных данных
            n = scaner.nextInt();

        } catch (Exception e) {
            //  System.out.println("не верный формат ввода");
        }

        if (n > 0) {  //блок кода будет выполнятся если введено положительное число

            int[] array = new int[n];

            Random random = new Random();

            for (int i = 0; i < array.length; i++) {// заполняем рандомно массив
                array[i] = random.nextInt(16);
            }

            for (int item : array) {           //..выводим массив
                System.out.print(item + " ");
            }

            int middleMember = n / 2; //это у нас будет средний индекс массива
            int leftTotal = 0;        //здесь мы будем хранить сумму левой части массива
            int rightTotal = 0;       //тутачки сумма правой части массива

            // нам нужно определить по какому сценарию считать части массива,
            // если число членов массива не четное - средний член массива ни где не суммируется
            if (n % 2 == 0) {
                for (int i = 0; i < middleMember; i++) {
                    leftTotal += array[i];                //за один проход считаем суммы частей.
                    rightTotal += array[i + middleMember];// смотрим внимательно и пытаемся въехать
                }
            } else {
                for (int i = 0; i < middleMember; i++) {
                    leftTotal += array[i];
                    rightTotal += array[i + (middleMember + 1)];// отличие только в этой строке
                }
            }
            // формируем сообщение в зависимости от результатов
            String message = null;
            if (leftTotal == rightTotal) {
                message = "Cуммы половин массива ровны";
            } else {   // не забываем применять элегантный тернарный оператор
                message = "Сумма членов " + ((leftTotal > rightTotal) ? "левой" : "правой") + " половины больше";
            }

            System.out.println();
            System.out.println(message);
        } else {
            System.out.println("Вы ввели не подходящее значение");
        }

    }

    public static void task9() {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Укажите размер мыссива, не меньше 3");
        int n = 0;
        try {                    // блок try-catch, в данном случае страхует от ввода строчных данных
            n = scaner.nextInt();

        } catch (Exception e) {
            //  System.out.println("не верный формат ввода");
        }

        if (n > 3) { // блок кода будет выполнятся при выполнении условия задачи

            int[] array = new int[n];   // создаем первый массив

            Random random = new Random();

            int countEven = 0;
            for (int i = 0; i < array.length; i++) { //заполняем массив цифрами и спомощью
                array[i] = random.nextInt(n);         //переменной  countEven считаем четные члены массива
                if (array[i] % 2 == 0) {
                    countEven++;
                }
            }

            for (int item : array) {          //выводим первый массив
                System.out.print(item + " ");
            }


            if (countEven > 0) {                 // проверка на случай, если четные в массиве не обнаружены
                // и массив не из чего будет создавать
                int[] evenArray = new int[countEven];// создаем второй массив из четных
                int j = 0;       // этой переменной будем проходить по индексам второго массива
                // при его заполнении
                for (int i = 0; i < array.length; i++) {
                    if (array[i] % 2 == 0) {        // заполняем массив 2
                        evenArray[j] = array[i];
                        j++;
                    }
                }

                System.out.println();
                for (int item : evenArray) {          // выводим второй массив
                    System.out.print(item + " ");
                }


            } else {
                System.out.println("К сожалению, массив собрать было не из чего");
            }

        } else {
            System.out.println();
            System.out.println("Вы ввели не подходящее значение");
        }
    }


    public static void task10() {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Создаём квадратную матрицу");
        System.out.println("Укажите размер матрицы");
        int n = 0;
        try {                    // блок try-catch, в данном случае страхует от ввода строчных данных
            n = scaner.nextInt();

        } catch (Exception e) {
            //  System.out.println("не верный формат ввода");
        }

        if (n > 0) { // блок кода будет выполнятся при положительных значениях размера

            int[][] array = new int[n][n];   // создаем первый массив

            Random random = new Random();
            //заполнение матрицы
            for (int j = 0; j < array.length; j++) {     //j - индекс столбца
                for (int i = 0; i < array.length; i++) { // i-индекс строки

                    array[j][i] = random.nextInt(4) + 1;

                }
            }
            // выводим на консоль
            for (int j = 0; j < array.length; j++) {     //j - индекс строки
                for (int i = 0; i < array.length; i++) { // i-индекс столбца

                    System.out.print(array[j][i] + " "); //выводим строку внутренним циклом

                }
                System.out.println();// переводим курсор для следующей строки
            }

            //сумма четных элементов стоящих на главной диагонали (те элементы у которых j=i)
            int countEven = 0;
            for (int j = 0; j < array.length; j++) {     //j - индекс столбца
                for (int i = 0; i < array.length; i++) { // i-индекс строки

                    if (i == j & array[j][i] % 2 == 0) {// если элемент на диагонали и четный
                        countEven += array[j][i];      // то накапливаем сумму в countEven
                    }

                }
            }
            System.out.println("Сумма четных элементов главной диагонали ровна " + countEven);
            System.out.println("******************************************");

            // вывод не четных чисел, находящихся под главной диагональю
            //
            //  i0 i1 i2 i3 i4
            //j0 *  0  0  0  0       индексы искомых элементов имеют следующие признаки
            //j1 *  *  0  0  0       (i <= j & array[j][i] % 2 !=0 )
            //j2 *  *  *  0  0
            //j3 *  *  *  *  0
            //j4 *  *  *  *  *
            System.out.println("Вывод не четных чисел, находящихся под главной диагональю");
            for (int j = 0; j < array.length; j++) {     //j - индекс строки
                for (int i = 0; i < array.length; i++) { // i-индекс столбца

                    if (i <= j & array[j][i] % 2 != 0) {// если элемент на диагонали и четный
                        System.out.print(array[j][i] + " ");      // то накапливаем сумму в countEven
                    }

                }
            }
            System.out.println();
            System.out.println("**********************************************");

            //проверяем произведение какой диагонали больше
            //
            //  i0 i1 i2 i3 i4
            //j0 *  0  0  0  !       индексы искомых элементов имеют следующие признаки
            //j1 0  *  0  !  0       (i = j) - главная диагональ
            //j2 0  0 !*  0  0        (i + j =array.length-1); -побочная диагональ (подумай почему так)
            //j3 0  !  0  *  0
            //j4 !  0  0  0  *
            int compositionMain = 1; // здесь будем хранить произведение элементов главной диагонали
            int compositionSide = 1;// здесь будем хранить произведение элементов побочной диагонали
            for (int j = 0; j < array.length; j++) {     //j - индекс строки
                for (int i = 0; i < array.length; i++) { // i-индекс столбца

                    if (i == j) {                             // если элемент на главной диагонали
                        compositionMain *= array[j][i];      // то накапливаем произведение
                    }

                    if (i + j == array.length - 1) {
                        compositionSide *= array[j][i];
                    }
                }

            }
            System.out.println("Произведение элементов главной диагонали "
                    + ((compositionMain > compositionSide) ? "больше" : "меньше")
                    + " произведения элементов побочной");
            System.out.println("**************************************");

            // посчитать сумму четных элементов стоящих над побочной диагональю (не включительно)
            //
            //  i0 i1 i2 i3 i4
            //j0 0  0  0  0  !       индексы искомых элементов имеют следующие признаки
            //j1 0  0  0  !  0
            //j2 0  0  !  0  0        (i + j < array.length-1)&(array[j][i] % 2 == 0)
            //j3 0  !  0  0  0
            //j4 !  0  0  0  0
            int evenSum = 0;
            for (int j = 0; j < array.length; j++) {     //j - индекс строки
                for (int i = 0; i < array.length; i++) { // i-индекс столбца

                    if ((i + j < array.length-1)&(array[j][i] % 2 == 0)) {
                        evenSum += array[j][i];
                    }

                }
            }
            System.out.println(" Сумма четных элементов стоящих над побочной диагональю (не включительно) ровна "
                + evenSum);
            System.out.println("**********************************************");
//**********************************************************************************************
            //транспонируем матрицу

            int box = 0;
            for (int j = 0; j < array.length-1; j++) {     //j - индекс строки
                for (int i = j; i < array.length-1; i++) { // i-индекс столбца

                   box = array[i+1][j];
                   array[i+1][j] = array[j][i+1];
                   array[j][i+1] = box;

                }
            }
            for (int j = 0; j < array.length; j++) {
                for (int i = 0; i < array.length; i++) {

                    System.out.print(array[j][i]+" ");

                }
                System.out.println();
            }

        }else {
            System.out.println("не верный ввод данных");
        }
    }
}