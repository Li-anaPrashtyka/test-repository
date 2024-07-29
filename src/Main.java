public class Main {
    public static void main(String[] args) {
        //масив вправо на к позицій
 //   int [] numbers = {5, 6, 8, 10, 11, 4, 2, 44, 11, 13};
 //   int k = 3;
 //       for (int i = k; i<numbers.length; i++) {
 //           System.out.println(numbers[i]);
 //       }

        //пари чисел, сума який = м
 //       System.out.println("-----------------------------------------------------");
 //       int [] numbers2 = {2, 5, 8, 10, 6, 4, 5, 7, 3, 1, 9};
 //       int m = 10;
 //       for (int i = 0; i<numbers2.length; i++) {
 //           for (int j = 0; j < numbers2.length; j++) {
  //              if (numbers2[i] + numbers2[j] == m && i != j) {
 //                   System.out.println(numbers2[i] + " " + numbers2[j]);
 //           } } }

        //елемент масива, який зустрічається один раз
        System.out.println("-----------------------------------------------------");
        int [] numbers3 = {1, 2, 3, 1, 3, 2, 5, 6, 7, 6, 5};
        int [] numbers33;
        for (int i = 0; i<numbers3.length; i++) {
            for (int j = 0; j < numbers3.length; j++) {
                if (numbers3[i] == numbers3[j] && i != j) {

                } else {
                    System.out.println("Цей елемент зустрічається один раз" + numbers3[i]);
                }

            } }


    }
    }
