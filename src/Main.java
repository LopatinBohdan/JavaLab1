import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Task1");
//        System.out.println("Fall seven times\n and\n stand up eight");

        Scanner scanner=new Scanner(System.in);
//        System.out.println("Task2");
//
//        System.out.print("Enter first number:");
//        int num1=scanner.nextInt();
//
//        System.out.print("Enter second number:");
//        int num2=scanner.nextInt();
//
//        int sum=num1+num2;
//        System.out.print("Sum: "+ sum +"\n");
//        int dif=num1-num2;
//        System.out.print("Dif: "+ dif +"\n");
//        int mult=num1*num2;
//        System.out.print("Mult: "+ mult +"\n");

       // System.out.println("Task3");

//        System.out.print("Enter 4 digit number:");
//        String num=scanner.next();
//        StringBuilder sb=new StringBuilder(num);
//        sb.reverse();
//        System.out.print(sb);

//        System.out.println("Task4");
//
//        System.out.println("What time is it now?");
//        int time= scanner.nextInt();
//
//        if(time<0||time>23){
//            System.out.print("Invalid time was entered");
//        }
//        else{
//            if(time<=6){
//                System.out.print("Good night");
//            }
//            else if(time>6 && time<=13){
//                System.out.print("Good morning");
//            }
//            else if(time>13 && time<=17){
//                System.out.print("Good day");
//            }
//            else {
//                System.out.print("Good evening");
//            }
//        }

//        System.out.println("Task5");
//
//        System.out.println("Enter 6 digit number");
//        int num= scanner.nextInt();
//
//        if(num<100000||num>999999){
//            System.out.print("Invalid number was entered");
//        }
//        else {
//            if(CheckLuckyNumber(num)){
//                System.out.print("Number is LUCKY");
//            }
//            else{
//                System.out.print("Number isn't lucky");
//            }
//        }

//        System.out.println("Task6");
//
//        System.out.println("Enter a digit");
//        int num=scanner.nextInt();
//
//        if(num<1||num>100){
//            System.out.println("Invalid number");
//        }
//        else if(num%3==0 && num%5==0){
//            System.out.println("Fizz Buzz");
//        }
//        else if(num%3==0){
//            System.out.println("Fizz");
//        }
//        else if(num%5==0){
//            System.out.println("Buzz");
//        }
//        else{
//            System.out.println(num);
//        }

//        System.out.println("Task7");
//
//        System.out.println("Enter a digit");
//        int num=scanner.nextInt();
//
//        if(num>0){
//            int factorial=1;
//            for (int i = 2; i <= num; i++) {
//                factorial*=i;
//            }
//            System.out.println(factorial);
//        }
//        else {
//            System.out.println("Invalid number");
//        }

//        System.out.println("Task8");
//
//        System.out.println("Enter a first number");
//        int first=scanner.nextInt();
//        System.out.println("Enter a second number");
//        int second=scanner.nextInt();
//
//        for (int i = first; i < second ; i++) {
//           if(IsPrime(i)){
//               System.out.print(i+ "; ");
//           }
//        }

//        System.out.println("Task9");
//        Користувач з клавіатури вводить елементи одновимірного масиву. Необхідно знайти суму
//        елементів масиву, середнє арифметичне, відобразити на екран всі елементи масиву.
//        System.out.println("Enter arrays size");
//        int size=scanner.nextInt();
//        int arr[];
//        if(size>0){
//            arr=new int[size];
//            for (int i = 0; i < size; i++) {
//                System.out.println("Enter element");
//                arr[i]=scanner.nextInt();
//            }
//
//            int sum=Arrays.stream(arr).sum();
//            System.out.println("Sum: "+sum);
//            OptionalDouble average=Arrays.stream(arr).average();
//            System.out.println("Avg: "+average);
//            System.out.println(Arrays.toString(arr));
//        }

//        System.out.println("Task10");
//        System.out.println("Enter arrays size");
//        int size=scanner.nextInt();
//        int arr[];
//        if(size>0) {
//            arr = new int[size];
//            for (int i = 0; i < size; i++) {
//                System.out.println("Enter element");
//                arr[i] = scanner.nextInt();
//            }
//
//            System.out.println("Enter number for check");
//            int key=scanner.nextInt();
//            System.out.println("Count of enter: "+ CheckKey(arr,key));
//        }
//        else{
//            System.out.println("Invalid size entered");
//        }

//        System.out.println("Task11");
//
//        System.out.println("Enter first number");
//        int first=scanner.nextInt();
//        System.out.println("Enter second number");
//        int second=scanner.nextInt();
//
//        System.out.println("Sum: "+ SumInDiapasone(first,second));

        System.out.println("Task12");

        int[] arr={1,2,3,4};

        int[] arrRes=GetFacorialArray(arr);
        System.out.println(Arrays.toString(arrRes));
    }

    public  static int[] GetFacorialArray(int[] arr){
        int[] farr=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            farr[i]=GetFactorial(arr[i]);
        }
        return farr;
    }
    public static int GetFactorial(int num){
        int factorial=1;
            for (int i = 2; i <= num; i++) {
                factorial*=i;
            }
            return factorial;
    }
    public static int SumInDiapasone(int first, int second){
        int sum=0;
        for (int i = first; i <=second; i++) {
                sum+=i;
        }
        return sum;
    }
    public  static  int CheckKey(int arr[],int key){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(key==arr[i]){
                count++;
            }
        }
        return count;
    }

    public static boolean IsPrime(int num){
        for (int i = 2; i <num ; i++) {
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static boolean CheckLuckyNumber(int num){
        int first=num%1000;
        int second=num/1000;

        int arr1[]=new int[3];
        int arr2[]=new int[3];

        arr1[0]=first%10;
        arr1[1]=(first/10)%10;
        arr1[2]=first/100;

        arr2[0]=second%10;
        arr2[1]=(second/10)%10;
        arr2[2]=second/100;

        int sum1=Arrays.stream(arr1).sum();
        int sum2=Arrays.stream(arr2).sum();

        return (sum1==sum2);
    }


}

