import java.util.Scanner;


public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int i = 5;
//        while(i <= 15){
//            System.out.println(i);
//            i++;
//        }
//        long x = 2;
//        do{
//            System.out.println(x);
//            x*=x;
//        }while(x <= 1000000);


        //Same loops written in for loop
//        for(int i = 5; i <= 15; i++){
//            System.out.println(i);
//        }
//        for(long x = 2; x <= 1000000; x*=x){
//            System.out.println(x);
//        }
        int f = 1;
        while(f <= 100){
            System.out.println(f);
            f++;
            if(f % 3==0 && f % 5 != 0){
                System.out.println("Fizz");
            }else if(f % 5 == 0 && f % 3 != 0){
                System.out.println("Buzz");
            }
        }
    }
}
