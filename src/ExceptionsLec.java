import java.util.Locale;

public class ExceptionsLec {

    public static void main(String[] args) throws Exception {
//        System.out.println("Hello World");

//        try {
//            throw new Exception("Hey something bad happened.");
//        }catch(Exception e){
//            e.printStackTrace();
//
//        }
        //Deeper example with try-catch
//        try{
//            System.out.println("Let me see if I can divide by zero");
//            int result = 1 / 0;
//            System.out.println("I did it! Math is now MINE!");
//        }catch (ArithmeticException e){
//            e.printStackTrace();
//        }


        //Even deeper example with try-catch
//        try{
////            throw new Exception("Something went wrong!\n Error! \n Error!");
////            throw new RuntimeException("Runtime exception! Check the stack trace for details!");
//
//            String nullStr = null;
//            System.out.println(nullStr.toLowerCase());
//        }catch(NullPointerException e){
//            System.out.println("Nullpointer Exception fired!");
//            e.printStackTrace();
//            e.getMessage();
//        }catch(RuntimeException e){
//            System.out.println("This runtime exception fired");
//            e.printStackTrace();
//            e.getMessage();
//        }catch(Exception e){
//            System.out.println("Generic exception fired!");
//            e.printStackTrace();
//            e.getMessage();
//        }finally{
//            System.out.println("This will always run");
//        }


        //Final Example: let's trigger an array out of bounds, and deal with it programmatically
        try{
            String[] days = {"Monday", "Tuesday"};
            System.out.println(days[1]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Most specific");
            e.printStackTrace();
            e.getMessage();

        }catch(RuntimeException e){
            System.out.println("Sorta specific");
            e.printStackTrace();
        }catch(Exception e){
            System.out.println("Least specific");
        }

    }
}
