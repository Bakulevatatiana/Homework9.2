
import java.util.Arrays;
public class Main {


    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }return arr;}
    public static void main(String[] args) {








        int[] arr = generateRandomArray();
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length -1; i != -1 ; i--) {
            System.out.print(reverseFullName[i]);
        }




        float sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            System.out.println("Средняя сумма трат за месяц составила " + (sum/30) + " рублей");
        }


        int min= arr[0]+1;
        for(int i=0;i<arr.length;i++) {if (arr[i]<min){ min=arr[i];}
            System.out.println(min);

        }



        int max=0;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                max = arr[i];

            }


            arr = generateRandomArray();
            int sum1 = 0;
            for (int i1 = 0; i1 < arr.length; i1++) {
                sum1 += arr[i1];
                System.out.println(sum1);
            }


        }}}