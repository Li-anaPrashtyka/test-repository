public class Main {
    public static void main(String[] args) {

        //масив вправо на к позицій
    int [] numbers = {5, 6, 8, 10, 11, 4, 2, 44, 11, 13};
    int k = 3;
        for (int i = k; i<numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        //пари чисел, сума який = м
        System.out.println("-----------------------------------------------------");
        int [] numbers2 = {2, 5, 8, 10, 6, 4, 5, 7, 3, 1, 9};
        int m = 10;
        for (int i = 0; i<numbers2.length; i++) {
            for (int j = 0; j < numbers2.length; j++) {
                if (numbers2[i] + numbers2[j] == m && i != j) {
                    System.out.println(numbers2[i] + " " + numbers2[j]);
            } } }

        //елемент масива, який зустрічається один раз
        System.out.println("-----------------------------------------------------");
        int [] numbers3 = {1, 2, 3, 1, 7, 2, 5, 6, 2, 6, 5};
        boolean hasUnique = false;
        for (int i = 0; i<numbers3.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < numbers3.length; j++) {
                if (numbers3[i] == numbers3[j] && i != j) {
                    isUnique = false;
                    break;
                } }
            if (isUnique) {
                System.out.println("Цей елемент зустрічається один раз: " + numbers3[i]);
                hasUnique = true;
            } }
            if (!hasUnique) {
                System.out.println("У масиві немає елементів, які зустрічаються один раз");
    }

//перемішує елементи масива у випадковому порядку
        System.out.println("-----------------------------------------------------");
        int [] numbers4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int length = numbers4.length;
        int half = length / 2;
        for (int i = 0; i < half; i++) {
            int temp = numbers4[i];
            numbers4[i] = numbers4[length - 1 - i];
            numbers4[length - 1 - i] = temp;
        }
        for (int i = 1; i < length - 1; i += 2) {
            int temp = numbers4[i];
            numbers4[i] = numbers4[i + 1];
            numbers4[i + 1] = temp;
        }
        System.out.print("Перемішаний масив: ");
        for (int num : numbers4) {
            System.out.print(num + " ");
        }

//2 масива в один масив
        System.out.println("-----------------------------------------------------");
        int [] numbers5 = {1, 2, 3, 4, 5};
        int [] numbers51 = {6, 7, 8, 9, 10};
        int [] numbers52 = new int[numbers5.length + numbers51.length];
        int a = 0;

        for (int i = 0; i<numbers5.length; i++) {
            numbers52[a] = numbers5[i];
            a++;
        }
        for (int j = 0; j < numbers51.length; j++) {
            numbers52[a] = numbers51[j];
            a++;
        }
        System.out.println("Об'єднаний масив :");
        for (int num : numbers52){
            System.out.println(num);
        }
    } }
